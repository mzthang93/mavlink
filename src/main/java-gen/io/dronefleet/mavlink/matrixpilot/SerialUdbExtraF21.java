package io.dronefleet.mavlink.matrixpilot;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;

/**
 * Backwards compatible version of SERIAL_UDB_EXTRA F21 format 
 */
@MavlinkMessageInfo(
        id = 187,
        crc = 134
)
public final class SerialUdbExtraF21 {
    private final int sueAccelXOffset;

    private final int sueAccelYOffset;

    private final int sueAccelZOffset;

    private final int sueGyroXOffset;

    private final int sueGyroYOffset;

    private final int sueGyroZOffset;

    private SerialUdbExtraF21(int sueAccelXOffset, int sueAccelYOffset, int sueAccelZOffset,
            int sueGyroXOffset, int sueGyroYOffset, int sueGyroZOffset) {
        this.sueAccelXOffset = sueAccelXOffset;
        this.sueAccelYOffset = sueAccelYOffset;
        this.sueAccelZOffset = sueAccelZOffset;
        this.sueGyroXOffset = sueGyroXOffset;
        this.sueGyroYOffset = sueGyroYOffset;
        this.sueGyroZOffset = sueGyroZOffset;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    /**
     * SUE X accelerometer offset 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 2,
            signed = true
    )
    public final int sueAccelXOffset() {
        return this.sueAccelXOffset;
    }

    /**
     * SUE Y accelerometer offset 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 2,
            signed = true
    )
    public final int sueAccelYOffset() {
        return this.sueAccelYOffset;
    }

    /**
     * SUE Z accelerometer offset 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 2,
            signed = true
    )
    public final int sueAccelZOffset() {
        return this.sueAccelZOffset;
    }

    /**
     * SUE X gyro offset 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 2,
            signed = true
    )
    public final int sueGyroXOffset() {
        return this.sueGyroXOffset;
    }

    /**
     * SUE Y gyro offset 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 2,
            signed = true
    )
    public final int sueGyroYOffset() {
        return this.sueGyroYOffset;
    }

    /**
     * SUE Z gyro offset 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 2,
            signed = true
    )
    public final int sueGyroZOffset() {
        return this.sueGyroZOffset;
    }

    public static final class Builder {
        private int sueAccelXOffset;

        private int sueAccelYOffset;

        private int sueAccelZOffset;

        private int sueGyroXOffset;

        private int sueGyroYOffset;

        private int sueGyroZOffset;

        /**
         * SUE X accelerometer offset 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 2,
                signed = true
        )
        public final Builder sueAccelXOffset(int sueAccelXOffset) {
            this.sueAccelXOffset = sueAccelXOffset;
            return this;
        }

        /**
         * SUE Y accelerometer offset 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 2,
                signed = true
        )
        public final Builder sueAccelYOffset(int sueAccelYOffset) {
            this.sueAccelYOffset = sueAccelYOffset;
            return this;
        }

        /**
         * SUE Z accelerometer offset 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 2,
                signed = true
        )
        public final Builder sueAccelZOffset(int sueAccelZOffset) {
            this.sueAccelZOffset = sueAccelZOffset;
            return this;
        }

        /**
         * SUE X gyro offset 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 2,
                signed = true
        )
        public final Builder sueGyroXOffset(int sueGyroXOffset) {
            this.sueGyroXOffset = sueGyroXOffset;
            return this;
        }

        /**
         * SUE Y gyro offset 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 2,
                signed = true
        )
        public final Builder sueGyroYOffset(int sueGyroYOffset) {
            this.sueGyroYOffset = sueGyroYOffset;
            return this;
        }

        /**
         * SUE Z gyro offset 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 2,
                signed = true
        )
        public final Builder sueGyroZOffset(int sueGyroZOffset) {
            this.sueGyroZOffset = sueGyroZOffset;
            return this;
        }

        public final SerialUdbExtraF21 build() {
            return new SerialUdbExtraF21(sueAccelXOffset, sueAccelYOffset, sueAccelZOffset, sueGyroXOffset, sueGyroYOffset, sueGyroZOffset);
        }
    }
}
