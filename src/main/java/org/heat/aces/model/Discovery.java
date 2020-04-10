package org.heat.aces.model;

public class Discovery {
    private long id;
    private String inventoryNumber;
    private long countNumber;
    private String materialGroup;
    private String description;

    public Discovery(long id, String inventoryNumber, long countNumber, String materialGroup, String description) {
        this.id = id;
        this.inventoryNumber = inventoryNumber;
        this.countNumber = countNumber;
        this.materialGroup = materialGroup;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public long getCountNumber() {
        return countNumber;
    }

    public void setCountNumber(long countNumber) {
        this.countNumber = countNumber;
    }

    public String getMaterialGroup() {
        return materialGroup;
    }

    public void setMaterialGroup(String materialGroup) {
        this.materialGroup = materialGroup;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
