package com.pium;

import java.util.Map;

public record Conversor(String result, String base_code, Map<String, Double>conversion_rates) {
}
