package Society;

import PlayerProperties.*;

import java.util.ArrayList;
import java.util.List;

public class Toolkit {

    private List<Instrument> instruments;

    private Hardware hardware;
    private IDE ide;
    private Internet internet;

    public Toolkit(){
        instruments = new ArrayList<>();
    }

    public void equipTool(Instrument tool){
        if(tool instanceof Hardware){
            if(this.hardware == null){
                instruments.add(this.hardware);
            }
            this.hardware = (Hardware) tool;
        }
        if(tool instanceof IDE){
            if(this.ide == null){
                instruments.add(this.ide);
            }
            this.ide = (IDE) tool;
        }
        if(tool instanceof Internet){
            if(this.internet != null) {
                instruments.add(this.internet);
            }
            this.internet = (Internet) tool;
        }
    }

    public Instrument[] getTools() {
        return new Instrument[] {hardware, ide, internet};
    }
}
