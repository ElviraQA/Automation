package org.example.model;

import com.google.gson.annotations.SerializedName;

public class Map {
    @SerializedName("412")
    private int pet412;

    @SerializedName("44422")
    private int pet44422;

    @SerializedName("available")
    private int available;

    @SerializedName("pending")
    private int pending;

    @SerializedName("sold")
    private int sold;

    @SerializedName("string")
    private int string;

    @SerializedName("sweety")
    private int sweety;

    public int getPet412() {
        return pet412;
    }

    public void setPet412(int pet12) {
        this.pet412 = pet412;
    }

    public int getPet44422() {
        return pet44422;
    }

    public void setPet4422(int pet44422) {
        this.pet44422 = pet44422;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public int getPending() {
        return pending;
    }

    public void setPending(int pending) {
        this.pending = pending;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public int getString() {
        return string;
    }

    public void setString(int string) {
        this.string = string;
    }

    public int getSweety() {
        return sweety;
    }

    public void setSweety(int sweety) {
        this.sweety = sweety;
    }

    @Override
    public String toString() {
        return
                "Pet{" +
                        "id = '" + pet412 + '\'' +
                        ",petId = '" + pet44422 + '\'' +
                        ",quantity = '" + available + '\'' +
                        ",shipDate = '" + pending + '\'' +
                        ",status = '" + sold + '\'' +
                        ",complete = '" + string + '\'' +
                        ",complete = '" + sweety + '\'' +
                        "}";
    }
}

