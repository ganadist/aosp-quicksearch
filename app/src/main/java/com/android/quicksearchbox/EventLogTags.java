package com.android.quicksearchbox;

class EventLogTags {
    public static void writeQsbStart(String name,
            int version,
            String start_method,
            int latency,
            String search_source,
            String enable_source,
            int on_create_latency) {
    }

    public static void writeQsbClick(
            long id,
            String suggestions,
            String queried_sources,
            int num_chars,
            int click_type) {
    }

    public static void writeQsbSearch(
            String search_source,
            int method,
            int num_chars
            ) {
    }

    public static void writeQsbVoiceSearch(String search_source) {
    }

    public static void writeQsbExit(String suggestions, int num_chars) {
    }
    public static void writeQsbLatency(String corpus, int latency, int num_chars) {
    }
}
