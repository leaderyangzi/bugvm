/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bugvm.apple.gamekit;

/*<imports>*/

import com.bugvm.apple.foundation.NSData;
import com.bugvm.apple.foundation.NSError;
import com.bugvm.apple.foundation.NSObjectProtocol;
import com.bugvm.objc.annotation.Method;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/GKMatchDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "match:didReceiveData:fromRemotePlayer:")
    void didReceiveData(GKMatch match, NSData data, GKPlayer player);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "match:didReceiveData:forRecipient:fromRemotePlayer:")
    void didReceiveData(GKMatch match, NSData data, GKPlayer recipient, GKPlayer player);
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Method(selector = "match:didReceiveData:fromPlayer:")
    void didReceiveData(GKMatch match, NSData data, String playerID);
    /**
     * @since Available in iOS 4.1 and later.
     */
    @Method(selector = "match:player:didChangeConnectionState:")
    void didChangeConnectionState(GKMatch match, GKPlayer player, GKPlayerConnectionState state);
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Method(selector = "match:player:didChangeState:")
    void didChangeState(GKMatch match, String playerID, GKPlayerConnectionState state);
    /**
     * @since Available in iOS 4.1 and later.
     */
    @Method(selector = "match:didFailWithError:")
    void didFail(GKMatch match, NSError error);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "match:shouldReinviteDisconnectedPlayer:")
    boolean shouldReinviteDisconnectedPlayer(GKMatch match, GKPlayer player);
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Method(selector = "match:shouldReinvitePlayer:")
    boolean shouldReinvitePlayer(GKMatch match, String playerID);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}