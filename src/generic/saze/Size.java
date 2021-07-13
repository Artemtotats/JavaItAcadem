package generic.saze;

public enum Size {
    XXS(32) {
        public String getDescription() {
            return "Детский рамер";
        }
    },
    XS(34), S(36), M(38), L(40);
        public String getDescription() {
            return " Взрослый рамер";
        }

  private   int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }


}