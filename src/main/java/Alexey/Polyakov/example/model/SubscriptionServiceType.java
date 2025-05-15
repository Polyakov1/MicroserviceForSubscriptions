package Alexey.Polyakov.example.model;

public enum SubscriptionServiceType {
    YOUTUBE_PREMIUM("YouTube Premium"),
    VK_MUSIC("VK Музыка"),
    YANDEX_PLUS("Яндекс.Плюс"),
    NETFLIX("Netflix"),
    SPOTIFY("Spotify"),
    APPLE_MUSIC("Apple Music");

    private final String displayName;

    SubscriptionServiceType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}