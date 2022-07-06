package org.example.data.list;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class List {
    private java.util.List<Integer> data;
    private float mean;
    private float average;
    private float variance;
    DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();


    public java.util.List<Integer> getData() {
        return data;
    }

    public void setData(java.util.List<Integer> data) {
        this.data = data;
    }

    public float getMean() {
        return mean;
    }

    public void setMean(float mean) {
        this.mean = mean;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public float getVariance() {
        return variance;
    }

    public void setVariance(float variance) {
        this.variance = variance;
    }

    public double mean() {
        for (float d : data) {
            descriptiveStatistics.addValue(d);
        }
        mean = (float) descriptiveStatistics.getMean();
        return mean;
    }
    public double variance() {
        for (float d : data) {
            descriptiveStatistics.addValue(d);
        }
        variance = (float) descriptiveStatistics.getVariance();
        return variance;
    }

}
