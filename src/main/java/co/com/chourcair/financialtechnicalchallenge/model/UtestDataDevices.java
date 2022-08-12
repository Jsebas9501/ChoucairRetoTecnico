package co.com.chourcair.financialtechnicalchallenge.model;

public class UtestDataDevices {
    private String strComputer;
    private String strVersion;
    private String strLanguage;
    private String strCellPhone;
    private String strModel;
    private String strSystem;

    public UtestDataDevices(String strComputer, String strVersion, String strLanguage, String strCellPhone, String strModel, String strSystem) {
        this.strComputer = strComputer;
        this.strVersion = strVersion;
        this.strLanguage = strLanguage;
        this.strCellPhone = strCellPhone;
        this.strModel = strModel;
        this.strSystem = strSystem;
    }

    public String getStrComputer() {
        return strComputer;
    }

    public void setStrComputer(String strComputer) {
        this.strComputer = strComputer;
    }

    public String getStrVersion() {
        return strVersion;
    }

    public void setStrVersion(String strVersion) {
        this.strVersion = strVersion;
    }

    public String getStrLanguage() {
        return strLanguage;
    }

    public void setStrLanguage(String strLanguage) {
        this.strLanguage = strLanguage;
    }

    public String getStrCellPhone() {
        return strCellPhone;
    }

    public void setStrCellPhone(String strCellPhone) {
        this.strCellPhone = strCellPhone;
    }

    public String getStrModel() {
        return strModel;
    }

    public void setStrModel(String strModel) {
        this.strModel = strModel;
    }

    public String getStrSystem() {
        return strSystem;
    }

    public void setStrSystem(String strSystem) {
        this.strSystem = strSystem;
    }
}
