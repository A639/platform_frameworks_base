/*
 * Copyright (C) 2006 The Android Open Source Project
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

package com.android.internal.telephony.cdma;

/**
 * Call fail causes from TS 24.008 .
 * These are mostly the cause codes we need to distinguish for the UI.
 * See 22.001 Annex F.4 for mapping of cause codes to local tones.
 *
 * {@hide}
 *
 */
public interface CallFailCause {
    static final int NORMAL_CLEARING                = 16;
    // Busy Tone
    static final int USER_BUSY                      = 17;

    static final int NORMAL_UNSPECIFIED             = 31;

    // Congestion Tone
    static final int NO_CIRCUIT_AVAIL               = 34;

    // others
    static final int ACM_LIMIT_EXCEEDED             = 68;
    static final int CALL_BARRED                    = 240;
    static final int FDN_BLOCKED                    = 241;

    static final int CDMA_LOCKED_UNTIL_POWER_CYCLE  = 1000;
    static final int CDMA_DROP                      = 1001;
    static final int CDMA_INTERCEPT                 = 1002;
    static final int CDMA_REORDER                   = 1003;
    static final int CDMA_SO_REJECT                 = 1004;
    static final int CDMA_RETRY_ORDER               = 1005;
    static final int CDMA_ACCESS_FAILURE            = 1006;
    static final int CDMA_PREEMPTED                 = 1007;

    // For non-emergency number dialed while in emergency callback mode.
    static final int CDMA_NOT_EMERGENCY             = 1008;

    static final int ERROR_UNSPECIFIED = 0xffff;
}
