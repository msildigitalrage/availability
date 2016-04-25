package jobs;
import play.jobs.*;
import play.Logger;
/**
 * Created by Paradox on 23/4/2016.
 */
@OnApplicationStart
public class BootStrap extends Job{

    public void doJob() {
        Logger.info("Load default values on Start :)");
    }
}
