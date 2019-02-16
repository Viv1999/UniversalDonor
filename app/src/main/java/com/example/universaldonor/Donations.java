package com.example.universaldonor;

import java.text.DateFormat;
import java.util.Date;

public class Donations {

    private String userId;
    private String bloodBankId;
    private String bloodType;
    private long amountOfBlood;
    private DateFormat dateDonated;

    public Donations(String userId, String bloodBankId, String bloodType, long amountOfBlood, DateFormat dateDonated) {
        this.userId = userId;
        this.bloodBankId = bloodBankId;
        this.bloodType = bloodType;
        this.amountOfBlood = amountOfBlood;
        this.dateDonated = dateDonated;
    }

    public Donations(){
    }

    public String getUserId() {
        return userId;
    }

    public String getBloodBankId() {
        return bloodBankId;
    }

    public String getBloodType() {
        return bloodType;
    }

    public long getAmountOfBlood() {
        return amountOfBlood;
    }

    public DateFormat getDateDonated() {
        return dateDonated;
    }
}

