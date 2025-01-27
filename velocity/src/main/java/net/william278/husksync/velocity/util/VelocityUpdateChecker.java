package net.william278.husksync.velocity.util;

import net.william278.husksync.HuskSyncVelocity;
import net.william278.husksync.util.UpdateChecker;

import java.util.logging.Level;

public class VelocityUpdateChecker extends UpdateChecker {

    private static final HuskSyncVelocity plugin = HuskSyncVelocity.getInstance();

    public VelocityUpdateChecker(String versionToCheck) {
        super(versionToCheck);
    }

    @Override
    public void log(Level level, String message) {
        plugin.getVelocityLogger().log(level, message);
    }
}
