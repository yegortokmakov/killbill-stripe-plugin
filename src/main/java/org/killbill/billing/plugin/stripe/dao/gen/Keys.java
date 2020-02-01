/*
 * Copyright 2014-2019 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

/*
 * This file is generated by jOOQ.
*/
package org.killbill.billing.plugin.stripe.dao.gen;


import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;
import org.jooq.types.ULong;
import org.killbill.billing.plugin.stripe.dao.gen.tables.StripeHppRequests;
import org.killbill.billing.plugin.stripe.dao.gen.tables.StripePaymentMethods;
import org.killbill.billing.plugin.stripe.dao.gen.tables.StripeResponses;
import org.killbill.billing.plugin.stripe.dao.gen.tables.records.StripeHppRequestsRecord;
import org.killbill.billing.plugin.stripe.dao.gen.tables.records.StripePaymentMethodsRecord;
import org.killbill.billing.plugin.stripe.dao.gen.tables.records.StripeResponsesRecord;


/**
 * A class modelling foreign key relationships between tables of the <code>killbill</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<StripeHppRequestsRecord, ULong> IDENTITY_STRIPE_HPP_REQUESTS = Identities0.IDENTITY_STRIPE_HPP_REQUESTS;
    public static final Identity<StripePaymentMethodsRecord, ULong> IDENTITY_STRIPE_PAYMENT_METHODS = Identities0.IDENTITY_STRIPE_PAYMENT_METHODS;
    public static final Identity<StripeResponsesRecord, ULong> IDENTITY_STRIPE_RESPONSES = Identities0.IDENTITY_STRIPE_RESPONSES;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<StripeHppRequestsRecord> KEY_STRIPE_HPP_REQUESTS_PRIMARY = UniqueKeys0.KEY_STRIPE_HPP_REQUESTS_PRIMARY;
    public static final UniqueKey<StripeHppRequestsRecord> KEY_STRIPE_HPP_REQUESTS_RECORD_ID = UniqueKeys0.KEY_STRIPE_HPP_REQUESTS_RECORD_ID;
    public static final UniqueKey<StripePaymentMethodsRecord> KEY_STRIPE_PAYMENT_METHODS_PRIMARY = UniqueKeys0.KEY_STRIPE_PAYMENT_METHODS_PRIMARY;
    public static final UniqueKey<StripePaymentMethodsRecord> KEY_STRIPE_PAYMENT_METHODS_RECORD_ID = UniqueKeys0.KEY_STRIPE_PAYMENT_METHODS_RECORD_ID;
    public static final UniqueKey<StripePaymentMethodsRecord> KEY_STRIPE_PAYMENT_METHODS_STRIPE_PAYMENT_METHODS_KB_PAYMENT_ID = UniqueKeys0.KEY_STRIPE_PAYMENT_METHODS_STRIPE_PAYMENT_METHODS_KB_PAYMENT_ID;
    public static final UniqueKey<StripeResponsesRecord> KEY_STRIPE_RESPONSES_PRIMARY = UniqueKeys0.KEY_STRIPE_RESPONSES_PRIMARY;
    public static final UniqueKey<StripeResponsesRecord> KEY_STRIPE_RESPONSES_RECORD_ID = UniqueKeys0.KEY_STRIPE_RESPONSES_RECORD_ID;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<StripeHppRequestsRecord, ULong> IDENTITY_STRIPE_HPP_REQUESTS = createIdentity(StripeHppRequests.STRIPE_HPP_REQUESTS, StripeHppRequests.STRIPE_HPP_REQUESTS.RECORD_ID);
        public static Identity<StripePaymentMethodsRecord, ULong> IDENTITY_STRIPE_PAYMENT_METHODS = createIdentity(StripePaymentMethods.STRIPE_PAYMENT_METHODS, StripePaymentMethods.STRIPE_PAYMENT_METHODS.RECORD_ID);
        public static Identity<StripeResponsesRecord, ULong> IDENTITY_STRIPE_RESPONSES = createIdentity(StripeResponses.STRIPE_RESPONSES, StripeResponses.STRIPE_RESPONSES.RECORD_ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<StripeHppRequestsRecord> KEY_STRIPE_HPP_REQUESTS_PRIMARY = createUniqueKey(StripeHppRequests.STRIPE_HPP_REQUESTS, "KEY_stripe_hpp_requests_PRIMARY", StripeHppRequests.STRIPE_HPP_REQUESTS.RECORD_ID);
        public static final UniqueKey<StripeHppRequestsRecord> KEY_STRIPE_HPP_REQUESTS_RECORD_ID = createUniqueKey(StripeHppRequests.STRIPE_HPP_REQUESTS, "KEY_stripe_hpp_requests_record_id", StripeHppRequests.STRIPE_HPP_REQUESTS.RECORD_ID);
        public static final UniqueKey<StripePaymentMethodsRecord> KEY_STRIPE_PAYMENT_METHODS_PRIMARY = createUniqueKey(StripePaymentMethods.STRIPE_PAYMENT_METHODS, "KEY_stripe_payment_methods_PRIMARY", StripePaymentMethods.STRIPE_PAYMENT_METHODS.RECORD_ID);
        public static final UniqueKey<StripePaymentMethodsRecord> KEY_STRIPE_PAYMENT_METHODS_RECORD_ID = createUniqueKey(StripePaymentMethods.STRIPE_PAYMENT_METHODS, "KEY_stripe_payment_methods_record_id", StripePaymentMethods.STRIPE_PAYMENT_METHODS.RECORD_ID);
        public static final UniqueKey<StripePaymentMethodsRecord> KEY_STRIPE_PAYMENT_METHODS_STRIPE_PAYMENT_METHODS_KB_PAYMENT_ID = createUniqueKey(StripePaymentMethods.STRIPE_PAYMENT_METHODS, "KEY_stripe_payment_methods_stripe_payment_methods_kb_payment_id", StripePaymentMethods.STRIPE_PAYMENT_METHODS.KB_PAYMENT_METHOD_ID);
        public static final UniqueKey<StripeResponsesRecord> KEY_STRIPE_RESPONSES_PRIMARY = createUniqueKey(StripeResponses.STRIPE_RESPONSES, "KEY_stripe_responses_PRIMARY", StripeResponses.STRIPE_RESPONSES.RECORD_ID);
        public static final UniqueKey<StripeResponsesRecord> KEY_STRIPE_RESPONSES_RECORD_ID = createUniqueKey(StripeResponses.STRIPE_RESPONSES, "KEY_stripe_responses_record_id", StripeResponses.STRIPE_RESPONSES.RECORD_ID);
    }
}