package ca.slackinjack.ParticleControl;

public class Particle {

    int id;
    boolean enabled;

    public Particle() {
        this.id = 0;
        this.enabled = false;
    }

    public Particle(int id, boolean enabled) {
        this.id = id;
        this.enabled = enabled;
    }

    public boolean getEnabled(Particle p) {
        return this.enabled;
    }
}
