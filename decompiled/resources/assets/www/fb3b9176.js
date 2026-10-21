import{z as t,an as e,L as i,ak as s,h as a,aV as r,cT as o,cU as n}from"./952f98a9.js";import{M as d,L as c,G as l,a2 as u,P as h,D as p,a1 as b,K as v,e as m,Q as g,an as y,a4 as _,f as x}from"./216055dc.js";import{B as $}from"./4db9c762.js";import"./7f3d7ca9.js";import"./a845c78d.js";import"./c0a2f832.js";import"./cae0f1de.js";var f=t`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;const w=t=>{const e=t.substring(0,4),i=t.substring(4,6),s=t.substring(6,8),a=t.substring(8,10),r=t.substring(10,12);return`${parseInt(s,10)} de ${["enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"][parseInt(i,10)-1]} de ${e}, ${a}:${r} h`},D=t=>"string"!=typeof t?t:t.charAt(0).toUpperCase()+t.slice(1).toLowerCase();var S=t`
:host {
  display: flex;
  box-sizing: border-box;
  padding-block: 0.5rem;
  justify-content: space-between;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.text {
  padding-left: 0.5rem;
}
`;class E extends(d(c(e(i)))){static get is(){return"list-details"}static get scopedElements(){const t=[l,u,h,...E.configurationScopedElements()];return E.scopedElementsFromClasses(t)}static get properties(){return{type:{type:String,attribute:"type"},detail:{type:String,attribute:"detail"},value:{type:String,attribute:"value"},amount:{type:Number,attribute:"amount"},date:{type:String,attribute:"date"},dateFormat:{type:Object}}}constructor(){super(),this.detail="",this.value="",this.amount=0,this.date="",this.type="text",this.dateFormat={day:"2-digit",month:"long",year:"numeric",hour:"2-digit",minute:"2-digit"}}static get styles(){return[S,p.primary,b.primary,s("list-details-shared-styles")]}get tplText(){return"text"===this.type?a`
      <bbva-type-text
        class="text"
        text="${this.value}"
        size="S"
        font-weight="500"
        tag="span"
        alignment="right"
      ></bbva-type-text>
    `:r}get tplAmount(){return"amount"===this.type?a`
      <bbva-type-amount
        variant="m"
        type="bold"
        amount="${this.amount}"
        currency-code="MXN"
        local-currency="MXN"
        language="es-MX"
      ></bbva-type-amount>
    `:r}get tplDate(){return"date"===this.type?a`
      <bbva-type-date
        .options=${this.dateFormat}
        date="${t=this.date,`${t.substring(0,4)}-${t.substring(4,6)}-${t.substring(6,8)}T${t.substring(8,10)}:${t.substring(10,12)}:${t.substring(12,14)}`}"
        date-clock-suffix=" h"
        font-weight="500"
      ></bbva-type-date>
    `:r;var t}render(){return a`
        <div>
            <bbva-type-text
            text="${this.detail}"
            size="S"
            tag="span"
            ></bbva-type-text>
        </div>
        <div>
            ${this.tplText}
            ${this.tplAmount}
            ${this.tplDate}
        </div>
        `}}var C=t`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

div.info {
  display: grid;
  gap: 0.5rem;
  padding-bottom: 1.5rem;
}

[data-tag-name=bbva-notification-message] {
  margin-block: 1rem;
}
`;class O extends(d(c(e(i)))){static get is(){return"suspected-transaction-direct-debits-success"}static get scopedElements(){const t=[v,m,l,E,g,y,...O.configurationScopedElements()];return O.scopedElementsFromClasses(t)}static get properties(){return{buttons:{type:Array},showSuccess:{type:Boolean,attribute:"show-page-success"},listDetails:{type:Array},nativeIOS:{type:Boolean,attribute:"native-i-o-s"}}}constructor(){super(),this.buttons=[{icon:o(),label:"suspected-transaction-direct-debits-authorized-share",id:"button-share"}],this.showSuccesss=!1,this.listDetails=[],this.nativeIOS=!1}static get styles(){return[C,s("suspected-transaction-direct-debits-success-shared-styles")]}_dataToReceipt(){var t,e,i,s,a,r,o,n,d,c,l,u,h,p;const b={operative:"suspectedTransactionDirectDebits",templateSelected:"suspectedTransactionDirectDebits",date:w(null===(t=this.listDetails)||void 0===t||null===(e=t[1])||void 0===e?void 0:e.date),operationFolio:null===(i=this.listDetails)||void 0===i||null===(s=i[2])||void 0===s?void 0:s.value,service:null===(a=this.listDetails)||void 0===a||null===(r=a[3])||void 0===r?void 0:r.value,periodicity:null===(o=this.listDetails)||void 0===o||null===(n=o[4])||void 0===n?void 0:n.value,accountNumber:null===(d=this.listDetails)||void 0===d||null===(c=d[5])||void 0===c?void 0:c.value,amount:null===(l=this.listDetails)||void 0===l||null===(u=l[6])||void 0===u?void 0:u.amount,reference:null===(h=this.listDetails)||void 0===h||null===(p=h[7])||void 0===p?void 0:p.value};this._dispatchCustomEvent("suspected-transaction-direct-debits-receipt-share",b)}_exitToDashboard(){this._dispatchCustomEvent("suspected-transaction-direct-debits-exit-flow","back-to-dashboard"),this.showSuccesss=!1}render(){return a`
          <bbva-help-modal
              id="help-modal-direct-success"
              full-height
              fixed-footer
              ?visible="${this.showSuccess}"
              ?i-o-s-fixed-header=${this.nativeIOS}
              header-text="${this.t("suspected-transaction-direct-debits-header")}"
              @help-modal-header-click="${this._exitToDashboard}"
          >
            <div slot="slot-content" class="container">
              <bbva-clip-microillustration
                microillustration="success"
                size="M"
              ></bbva-clip-microillustration>
              <bbva-type-text
                text="${this.t("suspected-transaction-direct-debits-authorized-title")}"
                size="3XL"
                font-weight="bold"
                inherit
              ></bbva-type-text>
              <bbva-type-text
                text="${this.t("suspected-transaction-direct-debits-authorized-subtitle")}"
                size="S"
                inherit
              ></bbva-type-text>
              <div>
                ${this.listDetails.length>0?this.listDetails.map((t=>a`
                  <list-details
                    detail="${t.detail}"
                    value="${t.value||""}"
                    amount="${t.amount||0}"
                    date="${t.date||""}"
                    type="${t.type}"
                  ></list-details>
                `)):r}
              </div>
              <bbva-notification-message variant="default">
                ${this.t("suspected-transaction-direct-debits-authorized-notification-message")}
              </bbva-notification-message>
              <bbva-button-row
                .options=${this.buttons}
                ambient="primary-alt"
                @button-row-item-click="${this._dataToReceipt}"
              ></bbva-button-row>
            </div>
          </bbva-help-modal>
    `}}var k=t`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class I extends(d(c(e(i)))){static get is(){return"suspected-transaction-direct-debits-exit-operation-modal"}static get scopedElements(){const t=[m,...I.configurationScopedElements()];return I.scopedElementsFromClasses(t)}static get properties(){return{showModalExitOperation:{type:Boolean},nativeIOS:{type:Boolean,attribute:"native-i-o-s"},recurringCharge:{type:Boolean}}}constructor(){super(),this.showModalExitOperation=!1,this.nativeIOS=!1,this.recurringCharge=!1}static get styles(){return[k,s("suspected-transaction-direct-debits-exit-operation-modal-shared-styles")]}_exitToDashboard(){this._dispatchCustomEvent("suspected-transaction-direct-debits-exit-flow","back-to-dashboard"),this._closeModal();const t=this.recurringCharge?"recurrent":"domiciled";this._dispatchCustomEvent(`suspected-transaction-direct-debits-${t}-charge-output`)}_closeModal(){this.showModalExitOperation=!1}render(){return a`
      <bbva-help-modal
          id="help-modal-direct-exit-operation"
          ?visible="${this.showModalExitOperation}"
          ?i-o-s-fixed-header=${this.nativeIOS}
          header-text="${this.t("suspected-transaction-direct-debits-modal-exit-operation-header-text")}"
          title-icon="${n()}"
          modal-type="caution"
          title-text="${this.t("suspected-transaction-direct-debits-modal-exit-operation-title-text")}"
          body-text="${this.t("suspected-transaction-direct-debits-modal-exit-operation-body-text")}"
          button-text="${this.t("suspected-transaction-direct-debits-modal-exit-operation-button-text")}"
          link-text="${this.t("suspected-transaction-direct-debits-modal-exit-operation-link-text")}"
          @help-modal-footer-button-click=${this._exitToDashboard}
          @help-modal-footer-link-click=${this._closeModal}
          @header-main-close-icon-click=${this._closeModal}
          @help-modal-veil-click=${this._closeModal}
          >
      </bbva-help-modal>
    `}}var M=t`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class P extends(d(c(e(i)))){static get is(){return"suspected-transaction-direct-debits-pre-subscription-modal"}static get scopedElements(){const t=[m,...P.configurationScopedElements()];return P.scopedElementsFromClasses(t)}static get properties(){return{showModalPreSubscription:{type:Boolean,attribute:"show-modal"},nativeIOS:{type:Boolean,attribute:"native-i-o-s"}}}constructor(){super(),this.showModalPreSubscription=!1,this.nativeIOS=!1}static get styles(){return[M,s("suspected-transaction-direct-debits-exit-operation-modal-shared-styles")]}_exitToDashboard(t){this._dispatchCustomEvent("suspected-transaction-direct-debits-exit-flow","back-to-dashboard"),t.stopPropagation()}_closeModal(t){this.showModalPreSubscription=!1,this._dispatchCustomEvent("close-modal-presubscription"),t.stopPropagation()}render(){return a`
      <bbva-help-modal
        id="help-modal-direct-pre-subscription"
        ?visible="${this.showModalPreSubscription}"
        ?i-o-s-fixed-header=${this.nativeIOS}
        header-text="${this.t("suspected-transaction-direct-debits-modal-pre-subscription-header-text")}"
        title-icon="${n()}"
        modal-type="caution"
        title-lines="0"
        title-text="${this.t("suspected-transaction-direct-debits-modal-pre-subscription-title-text")}"
        body-text="${this.t("suspected-transaction-direct-debits-modal-pre-subscription-body-text")}"
        @header-main-icon-click=${this._exitToDashboard}
        @help-modal-veil-click=${this._closeModal}
      ></bbva-help-modal>
    `}}var z=t`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.content {
  flex: 1;
}

.footer {
  padding-block: 1.5rem;
  padding-inline: 1rem;
}

.displayNone {
  display: none;
}
`;class j extends(d(c(e(i)))){static get is(){return"suspected-transaction-direct-debits"}static get scopedElements(){const t=[m,_,E,l,x,O,I,P,...j.configurationScopedElements()];return j.scopedElementsFromClasses(t)}static get properties(){return{showDetail:{type:Boolean,attribute:"show-detail"},listDetails:{type:Array},classValue:{type:String,attribute:"class-value"},showModalPreSubscription:{type:Boolean},_showModalExitOperation:{type:Boolean},nativeIOS:{type:Boolean,attribute:"native-i-o-s"},recurringCharge:{type:Boolean}}}constructor(){super(),this.config={loader:!0},this.listDetails=[],this.showDetail=!1,this.classValue="",this.showModalPreSubscription=!1,this.nativeIOS=!1,this.recurringCharge=!1}static get styles(){return[z,s("suspected-transaction-direct-debits-details-shared-styles")]}_buttonClick(){this._dispatchCustomEvent("bbva-feature-suspected-transactions-management-authorized","AUTHORIZED")}_linkClick(){this._dispatchCustomEvent("bbva-feature-suspected-transactions-management-rejected","REJECTED")}showModalExitOperation(){const t=this.shadowRoot.getElementById("modal-exit-operation");t.showModalExitOperation=!0,t.nativeIOS=!0,t.recurringCharge=this.recurringCharge;const e=this.recurringCharge?"recurrent":"domiciled";this._dispatchCustomEvent(`suspected-transaction-direct-debits-${e}-charge`)}render(){return a`
      <bbva-help-modal
        id="help-modal-direct-debits"
        full-height
        fixed-footer
        hide-content-padding-top
        avoid-icon-close-modal
        header-close-icon-aria-label="close"
        ?i-o-s-fixed-header=${this.nativeIOS}
        header-text="${this.t("suspected-transaction-direct-debits-header")}"
        @header-main-icon-click="${this.showModalExitOperation}"
        ?visible="${this.showDetail}"
        class="${this.classValue}"
      >
        <div class="content" slot="slot-content">
          ${super.render()}
          <bbva-header-category
              text="${this.t("suspected-transaction-direct-debits-detail-category")}"
              size="S"
          ></bbva-header-category>
          <div>
              ${this.listDetails.map((t=>a`
                  <list-details
                  detail="${t.detail}"
                  value="${t.value||""}"
                  amount="${t.amount||0}"
                  type="${t.type}"
                  ></list-details>
              `))}
          </div>
          <bbva-type-text
              text="${this.t("suspected-transaction-direct-debits-detail-advice")}"
              size="S"
              tag="p"
          ></bbva-type-text>
          <suspected-transaction-direct-debits-exit-operation-modal id="modal-exit-operation"></suspected-transaction-direct-debits-exit-operation-modal>
          <suspected-transaction-direct-debits-pre-subscription-modal ?show-modal=${this.showModalPreSubscription} ?native-i-o-s=${this.nativeIOS}></suspected-transaction-direct-debits-pre-subscription-modal>
        </div>
        <div class="footer" slot="slot-footer">
          <bbva-button-default
            id="btn-accept"
              text="${this.t("suspected-transaction-direct-debits-detail-accept")}"
              fullwidth
              size="S"
              @click="${this._buttonClick}"
          ></bbva-button-default>
          <bbva-button-default
              id="btn-reject"
              variant="link"
              fullwidth
              text="${this.t("suspected-transaction-direct-debits-detail-reject")}"
              size="S"
              @click="${this._linkClick}"
          ></bbva-button-default>
        </div>
      </bbva-help-modal>
    `}}var T=t`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class B extends(d(c(e(i)))){static get is(){return"suspected-transaction-direct-debits-rejected"}static get scopedElements(){const t=[v,l,m,...B.configurationScopedElements()];return B.scopedElementsFromClasses(t)}static get properties(){return{showRejected:{type:Boolean,attribute:"show-page-rejected"},nativeIOS:{type:Boolean,attribute:"native-i-o-s"},service:{type:String,attribute:"name-service"}}}constructor(){super(),this.showRejected=!1,this.nativeIOS=!1,this.service=""}static get styles(){return[T,s("suspected-transaction-direct-debits-rejected-shared-styles")]}_exitToDashboard(){this._dispatchCustomEvent("suspected-transaction-direct-debits-exit-flow","back-to-dashboard"),this.showRejected=!1}render(){return a`
            <bbva-help-modal
                id="help-modal-direct-rejected"
                full-height
                fixed-footer
                ?visible="${this.showRejected}"
                ?i-o-s-fixed-header=${this.nativeIOS}
                header-text="${this.t("suspected-transaction-direct-debits-header")}"
                @help-modal-header-click="${this._exitToDashboard}"
            >
                <div slot="slot-content" class="container">
                    <bbva-clip-microillustration
                        microillustration="creditcardnegative"
                        size="M"
                    ></bbva-clip-microillustration>
                    <bbva-type-text
                        text="${this.t("suspected-transaction-direct-debits-rejected-title")}"
                        size="3XL"
                        font-weight="bold"
                        inherit
                    ></bbva-type-text>
                    <bbva-type-text
                        text="${this.t("suspected-transaction-direct-debits-rejected-description-one",{service:this.service})}"
                        size="S"
                    ></bbva-type-text>
                    <bbva-type-text
                        text="${this.t("suspected-transaction-direct-debits-rejected-description-two")}"
                        size="S"
                        inherit
                    ></bbva-type-text>
                </div>
            </bbva-help-modal>
        `}}var N=t`
:host {
  box-sizing: border-box;
  margin: 0;
  display: flex;
  flex-direction: column;
  min-height: 56.25rem;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

div.info {
  flex: 1;
  padding-top: 1rem;
}

[data-tag-name=bbva-clip-microillustration] {
  padding-bottom: 1rem;
}

div.text {
  display: grid;
  gap: 0.5rem;
}

.panel-button {
  padding-block: 1.5rem;
}
`;class R extends(d(c(e(i)))){static get is(){return"suspected-transaction-direct-debits-error"}static get scopedElements(){const t=[v,m,l,...R.configurationScopedElements()];return R.scopedElementsFromClasses(t)}static get properties(){return{showError:{type:Boolean,attribute:"show-page-error"},nativeIOS:{type:Boolean,attribute:"native-i-o-s"}}}constructor(){super(),this.showError=!1,this.nativeIOS=!1}static get styles(){return[N,s("suspected-transaction-direct-debits-error-shared-styles")]}_retryButtonClick(){this._dispatchCustomEvent("retry-transaction-direct-debit")}_exitToDashboard(){this._dispatchCustomEvent("suspected-transaction-direct-debits-exit-flow","back-to-dashboard")}render(){return a`
            <bbva-help-modal
                id="help-modal-direct-error"
                full-height
                fixed-footer
                ?visible="${this.showError}"
                ?i-o-s-fixed-header=${this.nativeIOS}
                header-text="${this.t("suspected-transaction-direct-debits-header")}"
                button-text="${this.t("suspected-transaction-direct-debits-error-retry")}"
                @help-modal-footer-button-click="${this._retryButtonClick}"
                @header-main-icon-click="${this._exitToDashboard}"
            >
            <div slot="slot-content" class="container">
                <bbva-clip-microillustration
                    microillustration="error"
                    size="M"
                ></bbva-clip-microillustration>
                <bbva-type-text
                    text="${this.t("suspected-transaction-direct-debits-error-title")}"
                    size="3XL"
                    font-weight="bold"
                    inherit
                ></bbva-type-text>
                <bbva-type-text
                    text="${this.t("suspected-transaction-direct-debits-error-description")}"
                    size="S"
                    inherit
                ></bbva-type-text>
            </div>
            </bbva-help-modal>
        `}}class A extends(d(c(e(i)))){static get is(){return"bbva-feature-suspected-transactions-management-mx"}static get scopedElements(){const t=[$,j,O,B,R,...A.configurationScopedElements()];return A.scopedElementsFromClasses(t)}static get properties(){return{paymentsApiVersion:{type:Number},_suspectedPayload:{type:Object},_statusDirectDebit:{type:String},_status:{type:String},requiredOtpPayments:{attribute:!1,type:Boolean},_showDetail:{type:Boolean},_listDetails:{type:Array},_classValue:{type:String},_showRejected:{type:Boolean},_showError:{type:Boolean},_showModalPreSubscription:{type:Boolean},nativeIOS:{type:Boolean},_recurringCharge:{type:Boolean}}}constructor(){super(),this.config={loader:!0},this._classValue="",this._listDetails=[],this._showDetail=!1,this._showError=!1,this._showModalPreSubscription=!1,this._statusDirectDebit="",this._suspectedPayload={},this.paymentsApiVersion=0,this.requiredOtpPayments=!1,this.nativeIOS=!1,this._recurringCharge=!1}static get styles(){return[f,s("bbva-feature-suspected-transactions-management-mx-shared-styles")]}completedComponent(){this.nativeIOS&&this._dispatchCustomEvent("suspected-transaction-direct-debits-hide-scroll","scrollAutoOverflow")}async firstUpdated(){await this._getComponents()}_getComponents(){this._subscriptionDm=this.shadowRoot.querySelector("#apiPayments")}get _paymentSubscriptionDm(){return a`
      <bbva-local-payments-api-dm-mx
        id="apiPayments"
        .host="${this.host}"
        .version="${this.paymentsApiVersion}"
        .requiredToken=${this.requiredToken}
        ?requiredOTP=${this.requiredOtpPayments}
        ?native=${this.native}
        @patch-subscription-debits-success=${this._subscriptionSuccess}
        @patch-subscription-debits-error=${this._subscriptionError}
        @api-dm-error=${this._subscriptionErrorServer}
        @signature-canceled-dm=${this._onSignCancel}
      ></bbva-local-payments-api-dm-mx>
    `}_onSignCancel(){this.clearLoader(),this._classValue=""}_handlerClick(t){this._status=t.detail,this._subscriptionDebits(this._status)}_subscriptionDebits(t){var e;const i={subscriptionId:this._suspectedPayload.variables_subscriptionId,body:{account:{accountNumber:this._suspectedPayload.variables_folio},status:t}};this.showLoader("transparent"),this._unlockModalOTP(),null===(e=this._subscriptionDm)||void 0===e||e.patchSubscriptionDebits(i)}_unlockModalOTP(){this._classValue="displayNone"}_subscriptionSuccess(t){var e,i,s,a,r,o,n,d,c;this.clearLoader(),this._showDetail=!1,this._statusDirectDebit=this._status,this._classValue="";const l={titleOperative:this.t("suspected-transaction-direct-debits-list-object-success"),transferDate:(null===(e=t.detail)||void 0===e?void 0:e.transferDate)||"",transactionId:(null===(i=t.detail)||void 0===i?void 0:i.transactionId)||"",service:(null===(s=this._suspectedPayload)||void 0===s?void 0:s.variables_service)||"",account:(null===(a=this._suspectedPayload)||void 0===a?void 0:a.variables_accountNumber)||"",period:(null===(r=this._suspectedPayload)||void 0===r?void 0:r.variables_period)||"",amount:(null===(o=t.detail)||void 0===o||null===(n=o.payment)||void 0===n||null===(d=n.maximumAmount)||void 0===d?void 0:d.amount)||"",reference:(null===(c=this._suspectedPayload)||void 0===c?void 0:c.variables_referencia)||""};this._setNotificationData(l,"success"),this._dispatchCustomEvent("suspected-transaction-direct-debits-receipt-share-data",l),"AUTHORIZED"===this._statusDirectDebit&&this._dispatchCustomEvent("suspected-transaction-direct-debits-share-page-view-domiciled")}_subscriptionError(t){var e,i;this.clearLoader(),this._classValue="";const s={"01303021":()=>{this._showModalPreSubscription=!0,this._recurringCharge=!0},default:()=>{this._subscriptionErrorServer()}};(s[(null===(e=t.detail)||void 0===e||null===(i=e.messages[0])||void 0===i?void 0:i.message).split("#")[0]]||s.default)()}_subscriptionErrorServer(){this.clearLoader(),this._classValue="",this._showDetail=!1,this._showError=!0,this._dispatchCustomEvent("suspected-transaction-direct-debits-error-domiciled")}subscriptionNotificationCDM(t){var e;const i=null==t||null===(e=t.notification)||void 0===e?void 0:e.content,s="string"==typeof i?JSON.parse(i):i??{};this._suspectedPayload={variables_service:(null==s?void 0:s.sEMISOR)||"",variables_accountNumber:(null==s?void 0:s.sCUENTA)||"",variables_period:(null==s?void 0:s.sPERIODO)||"",amount:(null==s?void 0:s.sIMPORTELIMITE)||"",variables_referencia:(null==s?void 0:s.sREFERENCIA)||"",variables_subscriptionId:(null==s?void 0:s.sSUSCRIPCION)||"",variables_folio:(null==s?void 0:s.sFOLIO)||""},this._showDetail=!0,this._setNotificationData(this._suspectedPayload,"message-center")}suspectedTransactionDebitsPush(t){this._suspectedPayload=t,this._showDetail=!0,this._setNotificationData(this._suspectedPayload,"push-notification")}_reset(){this._classValue="",this._listDetails=[],this._showDetail=!1,this._showError=!1,this._showModalPreSubscription=!1,this._status="",this._statusDirectDebit="",this._suspectedPayload={},this.paymentsApiVersion=0}_showModalDetail(){this._showError=!1,this._showDetail=!0,this._status="",this._statusDirectDebit=""}shareReceipt(t){this._dispatchCustomEvent("suspected-transaction-direct-debits-open-launcher",{value:null==t?void 0:t.receipt,mimetype:"image/jpeg"})}_setNotificationData(t,e){var i,s,a,r,o;const n=[{detail:this.t("suspected-transaction-direct-debits-detail-operation"),type:"text",value:t.titleOperative},{detail:this.t("suspected-transaction-direct-debits-detail-date"),type:"date",date:t.transferDate},{detail:this.t("suspected-transaction-direct-debits-detail-folio"),type:"text",value:null===(i=t.transactionId)||void 0===i?void 0:i.substring(0,18)},{detail:this.t("suspected-transaction-direct-debits-detail-service-provider"),type:"text",value:t.variables_service||t.service},..."success"===e?[{detail:this.t("suspected-transaction-direct-debits-detail-periodicity"),type:"text",value:D(t.variables_period||t.period)},{detail:this.t("suspected-transaction-direct-debits-detail-account"),type:"text",value:`•${(null===(s=t.variables_accountNumber)||void 0===s?void 0:s.slice(-4))||(null===(a=t.account)||void 0===a?void 0:a.slice(-4))||""}`}]:[{detail:this.t("suspected-transaction-direct-debits-detail-account"),type:"text",value:`•${(null===(r=t.variables_accountNumber)||void 0===r?void 0:r.slice(-4))||(null===(o=t.account)||void 0===o?void 0:o.slice(-4))||""}`},{detail:this.t("suspected-transaction-direct-debits-detail-periodicity"),type:"text",value:D(t.variables_period||t.period)}],{detail:this.t("suspected-transaction-direct-debits-detail-amount"),type:"amount",amount:t.amount},{detail:this.t("suspected-transaction-direct-debits-detail-reference"),type:"text",value:(d=t.variables_referencia||t.reference,"string"!=typeof d||d.length<18?d:`${d.slice(0,6)}/${d.slice(6,9)}/${d.slice(9,12)}/${d.slice(12,18)}`)}];var d;this._listDetails=n.filter((t=>Object.values(t).every((t=>null!=t))))}render(){var t;return a`
      ${this._paymentSubscriptionDm}
      <suspected-transaction-direct-debits
        ?show-detail=${this._showDetail}
        .listDetails=${this._listDetails}
        class-value=${this._classValue}
        .showModalPreSubscription=${this._showModalPreSubscription}
        ?native-i-o-s=${this.nativeIOS}
        .recurringCharge=${this._recurringCharge}
        @close-modal-presubscription=${()=>{this._showModalPreSubscription=!1}}
        @bbva-feature-suspected-transactions-management-authorized="${this._handlerClick}"
        @bbva-feature-suspected-transactions-management-rejected="${this._handlerClick}"
        @suspected-transaction-direct-debits-exit-flow=${this._reset}
      ></suspected-transaction-direct-debits>
      <suspected-transaction-direct-debits-success
        ?show-page-success=${"AUTHORIZED"===this._statusDirectDebit}
        .listDetails=${this._listDetails}
        ?native-i-o-s=${this.nativeIOS}
        @suspected-transaction-direct-debits-exit-flow=${this._reset}
      ></suspected-transaction-direct-debits-success>
      <suspected-transaction-direct-debits-rejected
        ?show-page-rejected=${"REJECTED"===this._statusDirectDebit}
        ?native-i-o-s=${this.nativeIOS}
        name-service=${null===(t=this._suspectedPayload)||void 0===t?void 0:t.variables_service}
        @suspected-transaction-direct-debits-exit-flow=${this._reset}
      ></suspected-transaction-direct-debits-rejected>
      <suspected-transaction-direct-debits-error
        ?show-page-error=${this._showError}
        ?native-i-o-s=${this.nativeIOS}
        @retry-transaction-direct-debit=${this._showModalDetail}
        @suspected-transaction-direct-debits-exit-flow=${this._reset}
      ></suspected-transaction-direct-debits-error>
      ${super.render()}
    `}}customElements.define(A.is,A);
