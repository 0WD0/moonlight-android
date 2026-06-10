package com.limelight.binding.video;

public interface PerfOverlayListener {
    void onPerfUpdate(final String text);

    default void onVideoSizeChanged(final int width, final int height) {
    }
}
