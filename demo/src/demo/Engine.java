package demo;

import org.fmod.FMODLoader;
import org.fmod.jni.FMOD_STUDIO_STOP_MODE;
import org.fmod.studio.Bank;
import org.fmod.studio.EventDescription;
import org.fmod.studio.EventInstance;
import org.fmod.studio.FmodStudioSystem;

import java.util.concurrent.TimeUnit;

import static org.fmod.jni.FMODConstants.*;
import static org.fmod.jni.FMODConstants.FMOD_STUDIO_LOAD_BANK_NORMAL;

public class Engine {

    public static void main(String[] args) {

        boolean didLoad = FMODLoader.loadNatives();

        if(didLoad) {
            System.out.println("Sweet.");
        }

        FmodStudioSystem studioSystem = FmodStudioSystem.create();
        studioSystem.initialize(32, FMOD_STUDIO_INIT_NORMAL, FMOD_INIT_NORMAL, null);

        //load banks
        String mediaFolder = "/home/roman/fun/fmod-jni/demo/working/fmod_example_media/";
        Bank masterBank = studioSystem.loadBankFile(mediaFolder + "Master.bank", FMOD_STUDIO_LOAD_BANK_NORMAL);
        Bank stringsBank = studioSystem.loadBankFile(mediaFolder + "Master.strings.bank", FMOD_STUDIO_LOAD_BANK_NORMAL);
        Bank vehiclesBank = studioSystem.loadBankFile(mediaFolder + "Vehicles.bank", FMOD_STUDIO_LOAD_BANK_NORMAL);

        EventDescription carEngineEventDescription = studioSystem.getEvent("event:/Vehicles/Car Engine");
        EventInstance carEngine = carEngineEventDescription.createInstance();
        carEngine.start();

        boolean done = false;
        int minRpm = 1000;
        int maxRpm = 6000;
        int rpm = minRpm;
        int dir = 1;
        long start = System.nanoTime();
        while(!done) {
            long now = System.nanoTime();
            float elapsedSec = TimeUnit.NANOSECONDS.toMillis(now - start) / 1000f;
            if (elapsedSec > 0.1) {
                start = now;
                rpm += dir * 1000 * elapsedSec;
                if (rpm > maxRpm) {
                    rpm = maxRpm;
                    dir *= -1;
                } else if (rpm < minRpm) {
                    rpm = minRpm;
                    dir *= -1;
                }
                carEngine.setParameterByName("RPM", rpm, 1);
                studioSystem.update();
            }
        }

        //close:
        studioSystem.unloadAll();
        studioSystem.release();
    }
}

