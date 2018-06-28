package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.math.BigInteger;

/**
 * DEPRECATED PACKET! Suffers from missing airspeed fields and singularities due to Euler 
 * angles. Please use {@link io.dronefleet.mavlink.common.HilStateQuaternion HIL_STATE_QUATERNION} instead. Sent from simulation to autopilot. This 
 * packet is useful for high throughput applications such as hardware in the loop simulations. 
 */
@MavlinkMessageInfo(
        id = 90,
        crc = 183
)
public final class HilState {
    private final BigInteger timeUsec;

    private final float roll;

    private final float pitch;

    private final float yaw;

    private final float rollspeed;

    private final float pitchspeed;

    private final float yawspeed;

    private final int lat;

    private final int lon;

    private final int alt;

    private final int vx;

    private final int vy;

    private final int vz;

    private final int xacc;

    private final int yacc;

    private final int zacc;

    private HilState(BigInteger timeUsec, float roll, float pitch, float yaw, float rollspeed,
            float pitchspeed, float yawspeed, int lat, int lon, int alt, int vx, int vy, int vz,
            int xacc, int yacc, int zacc) {
        this.timeUsec = timeUsec;
        this.roll = roll;
        this.pitch = pitch;
        this.yaw = yaw;
        this.rollspeed = rollspeed;
        this.pitchspeed = pitchspeed;
        this.yawspeed = yawspeed;
        this.lat = lat;
        this.lon = lon;
        this.alt = alt;
        this.vx = vx;
        this.vy = vy;
        this.vz = vz;
        this.xacc = xacc;
        this.yacc = yacc;
        this.zacc = zacc;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Timestamp (microseconds since UNIX epoch or microseconds since system boot) 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 8
    )
    public final BigInteger timeUsec() {
        return this.timeUsec;
    }

    /**
     * Roll angle (rad) 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 4
    )
    public final float roll() {
        return this.roll;
    }

    /**
     * Pitch angle (rad) 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 4
    )
    public final float pitch() {
        return this.pitch;
    }

    /**
     * Yaw angle (rad) 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 4
    )
    public final float yaw() {
        return this.yaw;
    }

    /**
     * Body frame roll / phi angular speed (rad/s) 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 4
    )
    public final float rollspeed() {
        return this.rollspeed;
    }

    /**
     * Body frame pitch / theta angular speed (rad/s) 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 4
    )
    public final float pitchspeed() {
        return this.pitchspeed;
    }

    /**
     * Body frame yaw / psi angular speed (rad/s) 
     */
    @MavlinkFieldInfo(
            position = 7,
            unitSize = 4
    )
    public final float yawspeed() {
        return this.yawspeed;
    }

    /**
     * Latitude, expressed as degrees * 1E7 
     */
    @MavlinkFieldInfo(
            position = 8,
            unitSize = 4,
            signed = true
    )
    public final int lat() {
        return this.lat;
    }

    /**
     * Longitude, expressed as degrees * 1E7 
     */
    @MavlinkFieldInfo(
            position = 9,
            unitSize = 4,
            signed = true
    )
    public final int lon() {
        return this.lon;
    }

    /**
     * Altitude in meters, expressed as * 1000 (millimeters) 
     */
    @MavlinkFieldInfo(
            position = 10,
            unitSize = 4,
            signed = true
    )
    public final int alt() {
        return this.alt;
    }

    /**
     * Ground X Speed (Latitude), expressed as m/s * 100 
     */
    @MavlinkFieldInfo(
            position = 11,
            unitSize = 2,
            signed = true
    )
    public final int vx() {
        return this.vx;
    }

    /**
     * Ground Y Speed (Longitude), expressed as m/s * 100 
     */
    @MavlinkFieldInfo(
            position = 12,
            unitSize = 2,
            signed = true
    )
    public final int vy() {
        return this.vy;
    }

    /**
     * Ground Z Speed (Altitude), expressed as m/s * 100 
     */
    @MavlinkFieldInfo(
            position = 13,
            unitSize = 2,
            signed = true
    )
    public final int vz() {
        return this.vz;
    }

    /**
     * X acceleration (mg) 
     */
    @MavlinkFieldInfo(
            position = 14,
            unitSize = 2,
            signed = true
    )
    public final int xacc() {
        return this.xacc;
    }

    /**
     * Y acceleration (mg) 
     */
    @MavlinkFieldInfo(
            position = 15,
            unitSize = 2,
            signed = true
    )
    public final int yacc() {
        return this.yacc;
    }

    /**
     * Z acceleration (mg) 
     */
    @MavlinkFieldInfo(
            position = 16,
            unitSize = 2,
            signed = true
    )
    public final int zacc() {
        return this.zacc;
    }

    public static final class Builder {
        private BigInteger timeUsec;

        private float roll;

        private float pitch;

        private float yaw;

        private float rollspeed;

        private float pitchspeed;

        private float yawspeed;

        private int lat;

        private int lon;

        private int alt;

        private int vx;

        private int vy;

        private int vz;

        private int xacc;

        private int yacc;

        private int zacc;

        /**
         * Timestamp (microseconds since UNIX epoch or microseconds since system boot) 
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
         * Roll angle (rad) 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 4
        )
        public final Builder roll(float roll) {
            this.roll = roll;
            return this;
        }

        /**
         * Pitch angle (rad) 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 4
        )
        public final Builder pitch(float pitch) {
            this.pitch = pitch;
            return this;
        }

        /**
         * Yaw angle (rad) 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 4
        )
        public final Builder yaw(float yaw) {
            this.yaw = yaw;
            return this;
        }

        /**
         * Body frame roll / phi angular speed (rad/s) 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 4
        )
        public final Builder rollspeed(float rollspeed) {
            this.rollspeed = rollspeed;
            return this;
        }

        /**
         * Body frame pitch / theta angular speed (rad/s) 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 4
        )
        public final Builder pitchspeed(float pitchspeed) {
            this.pitchspeed = pitchspeed;
            return this;
        }

        /**
         * Body frame yaw / psi angular speed (rad/s) 
         */
        @MavlinkFieldInfo(
                position = 7,
                unitSize = 4
        )
        public final Builder yawspeed(float yawspeed) {
            this.yawspeed = yawspeed;
            return this;
        }

        /**
         * Latitude, expressed as degrees * 1E7 
         */
        @MavlinkFieldInfo(
                position = 8,
                unitSize = 4,
                signed = true
        )
        public final Builder lat(int lat) {
            this.lat = lat;
            return this;
        }

        /**
         * Longitude, expressed as degrees * 1E7 
         */
        @MavlinkFieldInfo(
                position = 9,
                unitSize = 4,
                signed = true
        )
        public final Builder lon(int lon) {
            this.lon = lon;
            return this;
        }

        /**
         * Altitude in meters, expressed as * 1000 (millimeters) 
         */
        @MavlinkFieldInfo(
                position = 10,
                unitSize = 4,
                signed = true
        )
        public final Builder alt(int alt) {
            this.alt = alt;
            return this;
        }

        /**
         * Ground X Speed (Latitude), expressed as m/s * 100 
         */
        @MavlinkFieldInfo(
                position = 11,
                unitSize = 2,
                signed = true
        )
        public final Builder vx(int vx) {
            this.vx = vx;
            return this;
        }

        /**
         * Ground Y Speed (Longitude), expressed as m/s * 100 
         */
        @MavlinkFieldInfo(
                position = 12,
                unitSize = 2,
                signed = true
        )
        public final Builder vy(int vy) {
            this.vy = vy;
            return this;
        }

        /**
         * Ground Z Speed (Altitude), expressed as m/s * 100 
         */
        @MavlinkFieldInfo(
                position = 13,
                unitSize = 2,
                signed = true
        )
        public final Builder vz(int vz) {
            this.vz = vz;
            return this;
        }

        /**
         * X acceleration (mg) 
         */
        @MavlinkFieldInfo(
                position = 14,
                unitSize = 2,
                signed = true
        )
        public final Builder xacc(int xacc) {
            this.xacc = xacc;
            return this;
        }

        /**
         * Y acceleration (mg) 
         */
        @MavlinkFieldInfo(
                position = 15,
                unitSize = 2,
                signed = true
        )
        public final Builder yacc(int yacc) {
            this.yacc = yacc;
            return this;
        }

        /**
         * Z acceleration (mg) 
         */
        @MavlinkFieldInfo(
                position = 16,
                unitSize = 2,
                signed = true
        )
        public final Builder zacc(int zacc) {
            this.zacc = zacc;
            return this;
        }

        public final HilState build() {
            return new HilState(timeUsec, roll, pitch, yaw, rollspeed, pitchspeed, yawspeed, lat, lon, alt, vx, vy, vz, xacc, yacc, zacc);
        }
    }
}
