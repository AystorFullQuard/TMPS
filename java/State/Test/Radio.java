package State.Test;
//context
public class Radio {
    Station station;
    public void setStation(Station st){
        station = st;
    }
    public void nextStation(){
        if (station instanceof Radio7){
            setStation(new RadioDFM());
        }
        else if(station instanceof RadioDFM){
            setStation(new Vesti());
        }
        else if (station instanceof Vesti){
            setStation(new Radio7() );
        }
    }
    public void play(){
        station.play();
    }
}
