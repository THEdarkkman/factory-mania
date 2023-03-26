package example;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import mindustry.world.blocks.production.*;

public class FactoryManiaMain extends Mod{ 

    public FactoryManiaMain(){
        Log.info("Loaded FactoryMania constructor.");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("frog");
                dialog.cont.add("Welcome to Factory Mania\n\n\t This mod is actually in active development and is not ready to be played\n\t Come back later to check for new content").row();
                //mod sprites are prefixed with the mod name (this mod is called 'example-java-mod' in its config)
                dialog.cont.image(Core.atlas.find("factory-mania-blast-furnace")).pad(20f).row();
                dialog.cont.button("I see", dialog::hide).size(100f, 50f).row();
                dialog.cont.add("And this is text under the button").pad(50f);
                dialog.show();
            });
        });
    }

    @Override
    public void loadContent(){
        Log.info("Loading some example content.");
    }

}
