package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class cal {

    // Trigonometric functions
    public double sin(double value) { return Math.sin(value); }
    public double cos(double value) { return Math.cos(value); }
    public double tan(double value) { return Math.tan(value); }

    // Logarithms
    public double log(double value) { return Math.log10(value); }
    public double ln(double value) { return Math.log(value); }

    // Exponential functions
    public double exp(double value) { return Math.exp(value); }
    public double power(double base, double exponent) { return Math.pow(base, exponent); }

    // Complex number operations (simple example)
    public double[] addComplex(double[] a, double[] b) {
        return new double[]{a[0] + b[0], a[1] + b[1]};
    }

    public double[] subtractComplex(double[] a, double[] b) {
        return new double[]{a[0] - b[0], a[1] - b[1]};
    }

    // Statistical functions
    public double mean(double[] values) {
        double sum = 0;
        for (double v : values) {
            sum += v;
        }
        return sum / values.length;
    }

    public double median(double[] values) {
        java.util.Arrays.sort(values);
        int middle = values.length / 2;
        if (values.length % 2 == 0) {
            return (values[middle - 1] + values[middle]) / 2.0;
        } else {
            return values[middle];
        }
    }

    public double standardDeviation(double[] values) {
        double mean = mean(values);
        double sum = 0;
        for (double v : values) {
            sum += Math.pow(v - mean, 2);
        }
        return Math.sqrt(sum / values.length);
    }

    // Calculation history (in-memory for simplicity)
    private List<CalculationRecord> history = new ArrayList<>();

    public void addToHistory(String operation, double result) {
        if (history.size() >= 50) {
            history.remove(0);
        }
        history.add(new CalculationRecord(operation, result, new Date()));
    }

    public List<CalculationRecord> getHistory() {
        return history;
    }

    // Inner class to represent a calculation record
    public class CalculationRecord {
        public String operation;
        public double result;
        public Date timestamp;

        public CalculationRecord(String operation, double result, Date timestamp) {
            this.operation = operation;
            this.result = result;
            this.timestamp = timestamp;
        }
    }
}

