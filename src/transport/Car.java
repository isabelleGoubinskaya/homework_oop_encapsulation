package transport;

public class Car {
    private String mark;
    private String model;
    private double engineVolume;
    private String bodyColor;
    private int productionYear;
    private String assemblyCountry;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private String tireType;

    public Car(String mark, String model, double engineVolume, String bodyColor, int productionYear,
               String assemblyCountry, String transmission, String bodyType, String registrationNumber,
               int numberOfSeats, String tireType) {
        this.mark = mark;
        this.model = model;
        this.engineVolume = engineVolume;
        this.bodyColor = bodyColor;
        this.productionYear = productionYear;
        this.assemblyCountry = assemblyCountry;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.tireType = tireType;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getAssemblyCountry() {
        return assemblyCountry;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public void changeTiresToSeasonal(String tireType) {
        this.tireType = tireType;
    }

    public static class Key {
        private boolean remoteEngineStart;
        private boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }
}
