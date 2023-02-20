public class Container {
    private int liters;

    public Container(int liters) {
        this.liters = liters;
    }

    public void add(int liters) {
        if (liters < 0) {
            return;
        }
        if ((this.liters + liters) > 100) {
            this.liters = 100;
        } else {
            this.liters += liters;
        }

    }

    public void move(int liters, Container container) {
        if (liters < 0){
            return;
        }
        if (this.liters - liters >= 0) {
            int difference = this.liters - liters;
            container.add(difference);
        }else{
            container.add(this.liters);
            this.liters =0;
        }

    }

    public int getLiters() {
        return liters;
    }


    public void remove(int liters) {
        if(liters < 0){
            return;
        }
        if (this.liters - liters < 100) {
            this.liters = 0;
        } else {
            this.liters -= liters;
        }
    }
}
