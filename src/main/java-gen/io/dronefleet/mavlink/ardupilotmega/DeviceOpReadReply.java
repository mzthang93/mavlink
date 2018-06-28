package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;

/**
 * Read registers reply 
 */
@MavlinkMessageInfo(
        id = 11001,
        crc = 15
)
public final class DeviceOpReadReply {
    private final long requestId;

    private final int result;

    private final int regstart;

    private final int count;

    private final byte[] data;

    private DeviceOpReadReply(long requestId, int result, int regstart, int count, byte[] data) {
        this.requestId = requestId;
        this.result = result;
        this.regstart = regstart;
        this.count = count;
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
     * request ID - copied from request 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 4
    )
    public final long requestId() {
        return this.requestId;
    }

    /**
     * 0 for success, anything else is failure code 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 1
    )
    public final int result() {
        return this.result;
    }

    /**
     * starting register 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 1
    )
    public final int regstart() {
        return this.regstart;
    }

    /**
     * count of bytes read 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 1
    )
    public final int count() {
        return this.count;
    }

    /**
     * reply data 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 1,
            arraySize = 128
    )
    public final byte[] data() {
        return this.data;
    }

    public static final class Builder {
        private long requestId;

        private int result;

        private int regstart;

        private int count;

        private byte[] data;

        /**
         * request ID - copied from request 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 4
        )
        public final Builder requestId(long requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 0 for success, anything else is failure code 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 1
        )
        public final Builder result(int result) {
            this.result = result;
            return this;
        }

        /**
         * starting register 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 1
        )
        public final Builder regstart(int regstart) {
            this.regstart = regstart;
            return this;
        }

        /**
         * count of bytes read 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 1
        )
        public final Builder count(int count) {
            this.count = count;
            return this;
        }

        /**
         * reply data 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 1,
                arraySize = 128
        )
        public final Builder data(byte[] data) {
            this.data = data;
            return this;
        }

        public final DeviceOpReadReply build() {
            return new DeviceOpReadReply(requestId, result, regstart, count, data);
        }
    }
}
