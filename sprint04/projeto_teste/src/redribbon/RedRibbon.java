package redribbon;

import redribbon.tampering.IsTampering;

public class RedRibbon {

    public boolean isTampering(String filePath, String gitHubFileUrl) {
        return IsTampering.check(filePath, gitHubFileUrl);
    }

}
