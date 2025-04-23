package group67.oop.CSE213_FinalProject_Group67_HighcourtBarAssociation;

public class ClientUploadDocuments {
    private String fieldName;
    private String inputType;
    private String example;

    // Constructor
    public ClientUploadDocuments(String fieldName, String inputType, String example) {
        this.fieldName = fieldName;
        this.inputType = inputType;
        this.example = example;
    }

    // Getters and Setters
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getInputType() {
        return inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    @Override
    public String toString() {
        return "Field: " + fieldName + ", Input: " + inputType + ", Example: " + example;
    }
}