package com.tinderapp.model.api_data;

import com.google.gson.annotations.SerializedName;

public class LastActivityDTO {
    @SerializedName("last_activity_date")
    private String lastActivityDate;

    public String getLastActivityDate() {
        return lastActivityDate;
    }

    public void setLastActivityDate(String lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }
}