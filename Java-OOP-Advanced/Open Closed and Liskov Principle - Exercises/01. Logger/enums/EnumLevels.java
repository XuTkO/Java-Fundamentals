package enums;

public enum EnumLevels {
    INFO,WARNING,ERROR,CRITICAL,FATAL;

    @Override
    public String toString() {
        return this.name();
    }
}
