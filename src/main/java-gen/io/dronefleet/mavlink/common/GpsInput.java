package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import io.dronefleet.mavlink.util.EnumFlagSet;
import java.math.BigInteger;

/**
 * GPS sensor input message. This is a raw sensor value sent by the GPS. This is NOT the global 
 * position estimate of the sytem. 
 */
@MavlinkMessageInfo(
        id = 232,
        crc = 151
)
public final class GpsInput {
    private final BigInteger timeUsec;

    private final int gpsId;

    private final EnumFlagSet<GpsInputIgnoreFlags> ignoreFlags;

    private final long timeWeekMs;

    private final int timeWeek;

    private final int fixType;

    private final int lat;

    private final int lon;

    private final float alt;

    private final float hdop;

    private final float vdop;

    private final float vn;

    private final float ve;

    private final float vd;

    private final float speedAccuracy;

    private final float horizAccuracy;

    private final float vertAccuracy;

    private final int satellitesVisible;

    private GpsInput(BigInteger timeUsec, int gpsId, EnumFlagSet<GpsInputIgnoreFlags> ignoreFlags,
            long timeWeekMs, int timeWeek, int fixType, int lat, int lon, float alt, float hdop,
            float vdop, float vn, float ve, float vd, float speedAccuracy, float horizAccuracy,
            float vertAccuracy, int satellitesVisible) {
        this.timeUsec = timeUsec;
        this.gpsId = gpsId;
        this.ignoreFlags = ignoreFlags;
        this.timeWeekMs = timeWeekMs;
        this.timeWeek = timeWeek;
        this.fixType = fixType;
        this.lat = lat;
        this.lon = lon;
        this.alt = alt;
        this.hdop = hdop;
        this.vdop = vdop;
        this.vn = vn;
        this.ve = ve;
        this.vd = vd;
        this.speedAccuracy = speedAccuracy;
        this.horizAccuracy = horizAccuracy;
        this.vertAccuracy = vertAccuracy;
        this.satellitesVisible = satellitesVisible;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Timestamp (micros since boot or Unix epoch) 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 8
    )
    public final BigInteger timeUsec() {
        return this.timeUsec;
    }

    /**
     * ID of the GPS for multiple GPS inputs 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 1
    )
    public final int gpsId() {
        return this.gpsId;
    }

    /**
     * Flags indicating which fields to ignore (see {@link io.dronefleet.mavlink.common.GpsInputIgnoreFlags GPS_INPUT_IGNORE_FLAGS} enum). All other fields 
     * must be provided. 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 2
    )
    public final EnumFlagSet<GpsInputIgnoreFlags> ignoreFlags() {
        return this.ignoreFlags;
    }

    /**
     * GPS time (milliseconds from start of GPS week) 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 4
    )
    public final long timeWeekMs() {
        return this.timeWeekMs;
    }

    /**
     * GPS week number 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 2
    )
    public final int timeWeek() {
        return this.timeWeek;
    }

    /**
     * 0-1: no fix, 2: 2D fix, 3: 3D fix. 4: 3D with DGPS. 5: 3D with RTK 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 1
    )
    public final int fixType() {
        return this.fixType;
    }

    /**
     * Latitude (WGS84), in degrees * 1E7 
     */
    @MavlinkFieldInfo(
            position = 7,
            unitSize = 4,
            signed = true
    )
    public final int lat() {
        return this.lat;
    }

    /**
     * Longitude (WGS84), in degrees * 1E7 
     */
    @MavlinkFieldInfo(
            position = 8,
            unitSize = 4,
            signed = true
    )
    public final int lon() {
        return this.lon;
    }

    /**
     * Altitude (AMSL, not WGS84), in m (positive for up) 
     */
    @MavlinkFieldInfo(
            position = 9,
            unitSize = 4
    )
    public final float alt() {
        return this.alt;
    }

    /**
     * GPS HDOP horizontal dilution of position in m 
     */
    @MavlinkFieldInfo(
            position = 10,
            unitSize = 4
    )
    public final float hdop() {
        return this.hdop;
    }

    /**
     * GPS VDOP vertical dilution of position in m 
     */
    @MavlinkFieldInfo(
            position = 11,
            unitSize = 4
    )
    public final float vdop() {
        return this.vdop;
    }

    /**
     * GPS velocity in m/s in NORTH direction in earth-fixed NED frame 
     */
    @MavlinkFieldInfo(
            position = 12,
            unitSize = 4
    )
    public final float vn() {
        return this.vn;
    }

    /**
     * GPS velocity in m/s in EAST direction in earth-fixed NED frame 
     */
    @MavlinkFieldInfo(
            position = 13,
            unitSize = 4
    )
    public final float ve() {
        return this.ve;
    }

    /**
     * GPS velocity in m/s in DOWN direction in earth-fixed NED frame 
     */
    @MavlinkFieldInfo(
            position = 14,
            unitSize = 4
    )
    public final float vd() {
        return this.vd;
    }

    /**
     * GPS speed accuracy in m/s 
     */
    @MavlinkFieldInfo(
            position = 15,
            unitSize = 4
    )
    public final float speedAccuracy() {
        return this.speedAccuracy;
    }

    /**
     * GPS horizontal accuracy in m 
     */
    @MavlinkFieldInfo(
            position = 16,
            unitSize = 4
    )
    public final float horizAccuracy() {
        return this.horizAccuracy;
    }

    /**
     * GPS vertical accuracy in m 
     */
    @MavlinkFieldInfo(
            position = 17,
            unitSize = 4
    )
    public final float vertAccuracy() {
        return this.vertAccuracy;
    }

    /**
     * Number of satellites visible. 
     */
    @MavlinkFieldInfo(
            position = 18,
            unitSize = 1
    )
    public final int satellitesVisible() {
        return this.satellitesVisible;
    }

    public static final class Builder {
        private BigInteger timeUsec;

        private int gpsId;

        private EnumFlagSet<GpsInputIgnoreFlags> ignoreFlags;

        private long timeWeekMs;

        private int timeWeek;

        private int fixType;

        private int lat;

        private int lon;

        private float alt;

        private float hdop;

        private float vdop;

        private float vn;

        private float ve;

        private float vd;

        private float speedAccuracy;

        private float horizAccuracy;

        private float vertAccuracy;

        private int satellitesVisible;

        /**
         * Timestamp (micros since boot or Unix epoch) 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 8
        )
        public final Builder timeUsec(BigInteger timeUsec) {
            this.timeUsec = timeUsec;
            return this;
        }

        /**
         * ID of the GPS for multiple GPS inputs 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 1
        )
        public final Builder gpsId(int gpsId) {
            this.gpsId = gpsId;
            return this;
        }

        /**
         * Flags indicating which fields to ignore (see {@link io.dronefleet.mavlink.common.GpsInputIgnoreFlags GPS_INPUT_IGNORE_FLAGS} enum). All other fields 
         * must be provided. 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 2
        )
        public final Builder ignoreFlags(EnumFlagSet<GpsInputIgnoreFlags> ignoreFlags) {
            this.ignoreFlags = ignoreFlags;
            return this;
        }

        /**
         * GPS time (milliseconds from start of GPS week) 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 4
        )
        public final Builder timeWeekMs(long timeWeekMs) {
            this.timeWeekMs = timeWeekMs;
            return this;
        }

        /**
         * GPS week number 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 2
        )
        public final Builder timeWeek(int timeWeek) {
            this.timeWeek = timeWeek;
            return this;
        }

        /**
         * 0-1: no fix, 2: 2D fix, 3: 3D fix. 4: 3D with DGPS. 5: 3D with RTK 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 1
        )
        public final Builder fixType(int fixType) {
            this.fixType = fixType;
            return this;
        }

        /**
         * Latitude (WGS84), in degrees * 1E7 
         */
        @MavlinkFieldInfo(
                position = 7,
                unitSize = 4,
                signed = true
        )
        public final Builder lat(int lat) {
            this.lat = lat;
            return this;
        }

        /**
         * Longitude (WGS84), in degrees * 1E7 
         */
        @MavlinkFieldInfo(
                position = 8,
                unitSize = 4,
                signed = true
        )
        public final Builder lon(int lon) {
            this.lon = lon;
            return this;
        }

        /**
         * Altitude (AMSL, not WGS84), in m (positive for up) 
         */
        @MavlinkFieldInfo(
                position = 9,
                unitSize = 4
        )
        public final Builder alt(float alt) {
            this.alt = alt;
            return this;
        }

        /**
         * GPS HDOP horizontal dilution of position in m 
         */
        @MavlinkFieldInfo(
                position = 10,
                unitSize = 4
        )
        public final Builder hdop(float hdop) {
            this.hdop = hdop;
            return this;
        }

        /**
         * GPS VDOP vertical dilution of position in m 
         */
        @MavlinkFieldInfo(
                position = 11,
                unitSize = 4
        )
        public final Builder vdop(float vdop) {
            this.vdop = vdop;
            return this;
        }

        /**
         * GPS velocity in m/s in NORTH direction in earth-fixed NED frame 
         */
        @MavlinkFieldInfo(
                position = 12,
                unitSize = 4
        )
        public final Builder vn(float vn) {
            this.vn = vn;
            return this;
        }

        /**
         * GPS velocity in m/s in EAST direction in earth-fixed NED frame 
         */
        @MavlinkFieldInfo(
                position = 13,
                unitSize = 4
        )
        public final Builder ve(float ve) {
            this.ve = ve;
            return this;
        }

        /**
         * GPS velocity in m/s in DOWN direction in earth-fixed NED frame 
         */
        @MavlinkFieldInfo(
                position = 14,
                unitSize = 4
        )
        public final Builder vd(float vd) {
            this.vd = vd;
            return this;
        }

        /**
         * GPS speed accuracy in m/s 
         */
        @MavlinkFieldInfo(
                position = 15,
                unitSize = 4
        )
        public final Builder speedAccuracy(float speedAccuracy) {
            this.speedAccuracy = speedAccuracy;
            return this;
        }

        /**
         * GPS horizontal accuracy in m 
         */
        @MavlinkFieldInfo(
                position = 16,
                unitSize = 4
        )
        public final Builder horizAccuracy(float horizAccuracy) {
            this.horizAccuracy = horizAccuracy;
            return this;
        }

        /**
         * GPS vertical accuracy in m 
         */
        @MavlinkFieldInfo(
                position = 17,
                unitSize = 4
        )
        public final Builder vertAccuracy(float vertAccuracy) {
            this.vertAccuracy = vertAccuracy;
            return this;
        }

        /**
         * Number of satellites visible. 
         */
        @MavlinkFieldInfo(
                position = 18,
                unitSize = 1
        )
        public final Builder satellitesVisible(int satellitesVisible) {
            this.satellitesVisible = satellitesVisible;
            return this;
        }

        public final GpsInput build() {
            return new GpsInput(timeUsec, gpsId, ignoreFlags, timeWeekMs, timeWeek, fixType, lat, lon, alt, hdop, vdop, vn, ve, vd, speedAccuracy, horizAccuracy, vertAccuracy, satellitesVisible);
        }
    }
}
