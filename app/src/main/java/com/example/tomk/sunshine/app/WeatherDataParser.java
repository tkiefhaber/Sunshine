package com.example.tomk.sunshine.app;

/**
 * Created by tomk on 10/10/14.
 */

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WeatherDataParser {
    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
        throws JSONException {
            final JSONObject obj = new JSONObject(weatherJsonStr);
            final JSONArray dailyTemps = obj.getJSONArray("list");
            final JSONObject day = dailyTemps.getJSONObject(dayIndex);
            final JSONObject dayTemps = day.getJSONObject("temp");
            final double dailyMax = dayTemps.getDouble("max");
            return dailyMax;

    }
}
