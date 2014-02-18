package com.orange.ccmd.clean;

import com.orange.ccmd.clean.utils.Cryptographer;
import com.orange.ccmd.clean.utils.Session;
import com.orange.ccmd.clean.utils.User;
import com.orange.ccmd.clean.utils.UserGateway;

public class Functions {

    /**
     * No side effects
     */
    public class UserValidator {
        private Cryptographer cryptographer;

        public boolean checkPassword(String userName, String password) {
            User user = UserGateway.findByName(userName);
            if (user != null) {
                String codedPhrase = user.getPhraseEncodedByPassword();
                String phrase = cryptographer.decrypt(codedPhrase, password);
                if ("Valid Password".equals(phrase)) {
                    Session.initialize();
                    return true;
                }
            }
            return false;
        }
    }

}
