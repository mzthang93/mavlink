package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;

/**
 * Data packet, size 96 
 */
@MavlinkMessageInfo(
        id = 172,
        crc = 22
)
public final class Data96 {
    private final int type;

    private final int len;

    private final byte[] data;

    private Data96(int type, int len, byte[] data) {
        this.type = type;
        this.len = len;
        this.data = data;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    /**
     * data type 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 1
    )
    public final int type() {
        return this.type;
    }

    /**
     * data length 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 1
    )
    public final int len() {
        return this.len;
    }

    /**
     * raw data 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 1,
            arraySize = 96
    )
    public final byte[] data() {
        return this.data;
    }

    public static final class Builder {
        private int type;

        private int len;

        private byte[] data;

        /**
         * data type 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 1
        )
        public final Builder type(int type) {
            this.type = type;
            return this;
        }

        /**
         * data length 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 1
        )
        public final Builder len(int len) {
            this.len = len;
            return this;
        }

        /**
         * raw data 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 1,
                arraySize = 96
        )
        public final Builder data(byte[] data) {
            this.data = data;
            return this;
        }

        public final Data96 build() {
            return new Data96(type, len, data);
        }
    }
}
