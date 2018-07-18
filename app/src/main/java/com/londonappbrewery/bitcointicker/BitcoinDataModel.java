package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class BitcoinDataModel {

    private String mPrice;

    public static BitcoinDataModel fromJSON(JSONObject jsonObject) {

        BitcoinDataModel bitcoinData = new BitcoinDataModel();
        try {
            bitcoinData.mPrice = jsonObject.getString("high");
            return bitcoinData;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }


    }

    public String getPrice() {return mPrice;}
}
