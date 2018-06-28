package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.math.BigInteger;

/**
 * As local waypoints exist, the global waypoint reference allows to transform between the local 
 * coordinate frame and the global (GPS) coordinate frame. This can be necessary when e.g. in- and 
 * outdoor settings are connected and the MAV should move from in- to outdoor. 
 */
@MavlinkMessageInfo(
        id = 48,
        crc = 25
)
public final class SetGpsGlobalOrigin {
    private final int targetSystem;

    private final int latitude;

    private final int longitude;

    private final int altitude;

    private final BigInteger timeUsec;

    private SetGpsGlobalOrigin(int targetSystem, int latitude, int longitude, int altitude,
            BigInteger timeUsec) {
        this.targetSystem = targetSystem;
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.timeUsec = timeUsec;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    /**
     * System ID 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 1
    )
    public final int targetSystem() {
        return this.targetSystem;
    }

    /**
     * Latitude (WGS84), in degrees * 1E7 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 4,
            signed = true
    )
    public final int latitude() {
        return this.latitude;
    }

    /**
     * Longitude (WGS84), in degrees * 1E7 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 4,
            signed = true
    )
    public final int longitude() {
        return this.longitude;
    }

    /**
     * Altitude (AMSL), in meters * 1000 (positive for up) 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 4,
            signed = true
    )
    public final int altitude() {
        return this.altitude;
    }

    /**
     * Timestamp (microseconds since UNIX epoch or microseconds since system boot) 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 8,
            extension = true
    )
    public final BigInteger timeUsec() {
        return this.timeUsec;
    }

    public static final class Builder {
        private int targetSystem;

        private int latitude;

        private int longitude;

        private int altitude;

        private BigInteger timeUsec;

        /**
         * System ID 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 1
        )
        public final Builder targetSystem(int targetSystem) {
            this.targetSystem = targetSystem;
            return this;
        }

        /**
         * Latitude (WGS84), in degrees * 1E7 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 4,
                signed = true
        )
        public final Builder latitude(int latitude) {
            this.latitude = latitude;
            return this;
        }

        /**
         * Longitude (WGS84), in degrees * 1E7 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 4,
                signed = true
        )
        public final Builder longitude(int longitude) {
            this.longitude = longitude;
            return this;
        }

        /**
         * Altitude (AMSL), in meters * 1000 (positive for up) 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 4,
                signed = true
        )
        public final Builder altitude(int altitude) {
            this.altitude = altitude;
            return this;
        }

        /**
         * Timestamp (microseconds since UNIX epoch or microseconds since system boot) 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 8,
                extension = true
        )
        public final Builder timeUsec(BigInteger timeUsec) {
            this.timeUsec = timeUsec;
            return this;
        }

        public final SetGpsGlobalOrigin build() {
            return new SetGpsGlobalOrigin(targetSystem, latitude, longitude, altitude, timeUsec);
        }
    }
}
