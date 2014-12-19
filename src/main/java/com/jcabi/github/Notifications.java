/**
 * Copyright (c) 2013-2014, jcabi.com
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met: 1) Redistributions of source code must retain the above
 * copyright notice, this list of conditions and the following
 * disclaimer. 2) Redistributions in binary form must reproduce the above
 * copyright notice, this list of conditions and the following
 * disclaimer in the documentation and/or other materials provided
 * with the distribution. 3) Neither the name of the jcabi.com nor
 * the names of its contributors may be used to endorse or promote
 * products derived from this software without specific prior written
 * permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT
 * NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL
 * THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.jcabi.github;

import com.jcabi.aspects.Immutable;
import javax.validation.constraints.NotNull;

/**
 * Github Notifications API.
 *
 * @author Giang Le (lthuangiang@gmail.com)
 * @author Paul Polishchuk (ppol@ua.fm)
 * @version $Id$
 * @since 0.15
 * @see <a href="https://developer.github.com/v3/activity/notifications/">Notifications API</a>
 * @todo #913 Implement missing notifications operations.
 *  At least list, view and mark as read operations should be implemented in
 *  RtNotifications and MkNotifications.
 *  Don't forget about unit and integrations tests.
 */
@Immutable
public interface Notifications {
    /**
     * Iterate them all.
     * @return Iterable of Notifications
     * @see <a href="https://developer.github.com/v3/activity/notifications/#list-your-notifications-in-a-repository">List your notifications in a repository</a>
     */
    @NotNull(message = "iterable is never NULL")
    Iterable<Notification> iterate();

    /**
     * Get a single notification.
     * @param number Notification id
     * @return Notification
     * @see <a href="https://developer.github.com/v3/activity/notifications/#view-a-single-thread">View a single thread</a>
     */
    @NotNull(message = "notification is never NULL")
    Notification get(int number);
}