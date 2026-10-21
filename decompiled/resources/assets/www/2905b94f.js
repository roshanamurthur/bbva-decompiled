import{z as e,aX as t,an as i,L as s,ak as r,V as a,h as o,aV as n,aY as c,dp as l,bb as d,aN as h,a9 as v,dq as m,cU as p,af as b,dr as u,ch as g,aj as y,ci as _,ai as S,ds as D,cw as x}from"./952f98a9.js";import{R as $,S as f,M as w,L as k,an as A,Z as E,a2 as P,G as L,ao as M,Y as T,a1 as N,D as q,e as R,I as B,E as C,K as F,aa as I,H as O,P as z,N as H,ar as V,O as j,z as W,Q as U,ap as Y,ah as K}from"./216055dc.js";import{O as X}from"./f891897b.js";import"./e5f89cd9.js";import{c as G,b as Q,B as Z,a as J}from"./80b427be.js";import{B as ee,b as te}from"./ab4d0dcb.js";import{a as ie,B as se}from"./dae2322c.js";import"./77df3611.js";import"./be12d7a2.js";import"./72e6e777.js";import"./7f3d7ca9.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./5aa1c2be.js";var re=e`
:host {
  --_account-transaction-servicing-bill-payments-home-bg-color:
    var(--account-transaction-servicing-bill-payments-home--_ambient--default-bg,
      ${$("colorPrimarySurfaceAmbientDefault",f)});
  --_account-transaction-servicing-bill-payments-home-color-icon:
    var(--account-transaction-servicing-bill-payments-home--_ambient--default-color-icon,
      ${$("colorPrimaryTextIncome",f)});
}
`,ae=e`
:host {
  --bbva-transition-container-padding: 0;
  --bbva-transition-container--custom--primary-ambient--content-bg-color: var(--_account-transaction-servicing-bill-payments-home-bg-color);
}

*, *:before, *:after {
  box-sizing: inherit;
}

.container-principal-bill-payments-home {
  height: 100vh;
  background-color: var(--_account-transaction-servicing-bill-payments-home-bg-color);
}
`,oe=e`
*, *:before, *:after {
  box-sizing: inherit;
}

.content-body {
  padding: 1.5rem;
}

.icons-action {
  width: 70%;
  padding-left: 1.5rem;
  padding-top: 1.5rem;
}

.table-content {
  display: flex;
  width: 100%;
  padding: 0.5rem 1.5rem;
  justify-content: space-between;
}

.table-content-amount {
  display: flex;
  width: 100%;
  padding: 0.5rem 1.5rem;
  justify-content: space-between;
}

.row-content-title {
  text-align: left;
}

.row-content-subtitle {
  text-align: right;
}

.content-amount {
  display: flex;
  justify-content: flex-end;
}
`;const ne=(e,t,i={})=>{e.dispatchEvent(new CustomEvent(t,{detail:i,bubbles:!0,composed:!0}))},{moment:ce}=window;class le extends(t(w(k(i(s))))){static get is(){return"detail-modal-direct-debits-service"}static get scopedElements(){const e=[A,E,P,L,...le.configurationScopedElements()];return le.scopedElementsFromClasses(e)}static get properties(){return{currencyCode:{type:String,attribute:"currency-code"},directDebitId:{type:String,attribute:"direct-debit-id"},directDebitsDetail:{type:Object},queryScheduledFlag:{type:Boolean,attribute:"query-scheduled-flag"},optionModalDetailService:{type:Array},_maskChars:{type:String}}}constructor(){super(),this.config={header:{text:this.t("account-transaction-servicing-bill-payments-home-programming-details"),leftIconAriaLabel:this.t("account-transaction-servicing-bill-payments-home-lock"),"@header-main-icon-click":this._backHeaderModalDetailDirectDebits.bind(this)}},this.currencyCode="",this.directDebitId="",this.directDebitsDetail={},this.queryScheduledFlag=!1,this._maskChars="•",this.optionModalDetailService=[]}static get styles(){return[oe,M.primary,T.primary,N.primary,q.primary,r("detail-modal-direct-debits-service-shared-styles")]}_backHeaderModalDetailDirectDebits(){ne(this,"account-transaction-servicing-bill-payments-home-back-header-modal-detail-direct-debits-click")}_getFullNameOfCustomer(){var e,t,i;let s="";return null===(e=this.directDebitsDetail)||void 0===e||null===(t=e.relatedContract)||void 0===t||null===(i=t.participants)||void 0===i||i.map((e=>(e.fullName&&(s=e.fullName),null))),s}_getTotalDebtAmount(){var e,t,i,s;if(null===(e=this.directDebitsDetail)||void 0===e||!e.amounts)return"0.00";const r=null===(t=this.directDebitsDetail)||void 0===t||null===(i=t.amounts[0])||void 0===i||null===(s=i.amountValue)||void 0===s?void 0:s.amount;return parseFloat(r).toFixed(2)}_markedNumber(e=""){return a(e,this._maskChars,!0,4)}_selectServiceOption(e){var t,i;"edit"===(null===(t=this.optionModalDetailService[null==e?void 0:e.detail])||void 0===t?void 0:t.id)?(this.directDebitsDetail.editScheduled=!0,this.directDebitsDetail.cancelScheduled=!1):(this.directDebitsDetail.editScheduled=!1,this.directDebitsDetail.cancelScheduled=!0),this.directDebitsDetail.serviceId=this.directDebitId,ne(this,`account-transaction-servicing-bill-payments-home-action-${null===(i=this.optionModalDetailService[null==e?void 0:e.detail])||void 0===i?void 0:i.id}-service-click`,this.directDebitsDetail),e.stopPropagation()}get _showScheduledPaymentOptions(){return this.queryScheduledFlag?o` <div class="icons-action">
          <bbva-button-row
            ambient="primary"
            .options="${this.optionModalDetailService}"
            @button-row-item-click="${this._selectServiceOption}"
          >
          </bbva-button-row>
        </div>`:n}_setMethodOfPayment(e){return"SIMPLE_ACCOUNT"===e?this.t("account-transaction-servicing-bill-payments-home-summary-account"):this.t("account-transaction-servicing-bill-payments-home-summary-card")}_setTypePaymentsCharged(e){return"SIMPLE_ACCOUNT"===e?this.t("account-transaction-servicing-bill-payments-home-domiciliation"):this.t("account-transaction-servicing-bill-payments-home-recurrent-charge")}_setFrequency(e){return e||this.t("account-transaction-servicing-bill-payments-home-defined-by-supplier")}render(){var e,t,i,s,r,a,n,d,h,v,m,p,b,u,g;return o`
      ${super.render()}
      <div class="content-body">
        <bbva-clip-box
          .group="${[{text:null===(e=this.directDebitsDetail)||void 0===e||null===(t=e.service)||void 0===t?void 0:t.name,size:"xl",bitone:"true"}]}"
        >
        </bbva-clip-box>
        <bbva-type-text
          size="3XL"
          font-weight="${c.fontWeight50}"
          text="${null===(i=this.directDebitsDetail)||void 0===i||null===(s=i.service)||void 0===s?void 0:s.name}"
        >
        </bbva-type-text>
        <bbva-type-text
          font-weight="${c.fontWeight10}"
          font-style="${l.fontStyle20}"
          size="S"
          text="account-transaction-servicing-bill-payments-home-scheduled-payment"
        >
        </bbva-type-text>
        <bbva-type-text
          unset
          font-weight="${c.fontWeight10}"
          size="S"
          text="account-transaction-servicing-bill-payments-home-reference"
        >
        </bbva-type-text>
        <bbva-type-text
          unset
          size="S"
          font-weight="${c.fontWeight40}"
          text="${null===(r=this.directDebitsDetail)||void 0===r?void 0:r.reference}"
        >
        </bbva-type-text>
      </div>
      <div class="table-content">
        <bbva-type-text
          class="row-content-title"
          font-weight="${c.fontWeight40}"
          text-color="secondary100"
          inherit
          size="S"
          text="account-transaction-servicing-bill-payments-home-programming-data"
        >
        </bbva-type-text>
      </div>
      <div class="table-content">
        <bbva-type-text
          class="row-content-title"
          inherit
          size="S"
          font-weight="${c.fontWeight10}"
          text="account-transaction-servicing-bill-payments-home-title-holder"
        >
        </bbva-type-text>
        <bbva-type-text
          class="row-content-subtitle"
          inherit
          size="S"
          font-weight="${c.fontWeight50}"
          alignment="right"
          text="${this._getFullNameOfCustomer()}"
        >
        </bbva-type-text>
      </div>
      <div class="table-content">
        <bbva-type-text
          class="row-content-title"
          inherit
          size="S"
          font-weight="${c.fontWeight10}"
          text="account-transaction-servicing-bill-payments-home-payment-method"
        >
        </bbva-type-text>
        <bbva-type-text
          class="row-content-subtitle"
          inherit
          size="S"
          font-weight="${c.fontWeight50}"
          alignment="right"
          text="${this._setMethodOfPayment(null===(a=this.directDebitsDetail)||void 0===a||null===(n=a.relatedContract)||void 0===n||null===(d=n.numberType)||void 0===d?void 0:d.id)}
          ${this._markedNumber(null===(h=this.directDebitsDetail)||void 0===h||null===(v=h.relatedContract)||void 0===v?void 0:v.number)}"
        >
        </bbva-type-text>
      </div>
      <div class="table-content">
        <bbva-type-text
          class="row-content-title"
          inherit
          size="S"
          font-weight="${c.fontWeight10}"
          text="account-transaction-servicing-bill-payments-home-type-of-operation"
        >
        </bbva-type-text>
        <bbva-type-text
          class="row-content-subtitle"
          inherit
          size="S"
          font-weight="${c.fontWeight50}"
          alignment="right"
          text="${this._setTypePaymentsCharged(null===(m=this.directDebitsDetail)||void 0===m||null===(p=m.relatedContract)||void 0===p||null===(b=p.numberType)||void 0===b?void 0:b.id)}"
        >
        </bbva-type-text>
      </div>
      <div class="table-content-amount">
        <bbva-type-text
          class="row-content-title"
          inherit
          size="S"
          font-weight="${c.fontWeight10}"
          text="account-transaction-servicing-bill-payments-home-maximum-amount-title"
        >
        </bbva-type-text>
        <div class="content-amount">
          <bbva-type-amount
            variant="l"
            type="bold"
            ambient="primary"
            amount="${this._getTotalDebtAmount()}"
            currency-code="${this.currencyCode}"
            local-currency="${this.currencyCode}"
          >
          </bbva-type-amount>
        </div>
      </div>
      <div class="table-content">
        <bbva-type-text
          class="row-content-title"
          inherit
          size="S"
          font-weight="${c.fontWeight10}"
          text="account-transaction-servicing-bill-payments-home-periodicity"
        >
        </bbva-type-text>
        <bbva-type-text
          class="row-content-subtitle"
          inherit
          size="S"
          font-weight="${c.fontWeight50}"
          alignment="right"
          text="${this._setFrequency(null===(u=this.directDebitsDetail)||void 0===u||null===(g=u.frequency)||void 0===g?void 0:g.name)}"
        >
        </bbva-type-text>
      </div>
      ${this._showScheduledPaymentOptions}
    `}}customElements.define(le.is,le);var de=e`
.service-detail-reference-image {
  align-self: center;
}

.content-body {
  padding: 1.5rem;
}

.icons-action {
  padding-left: 0.5rem;
}
`;class he extends(t(w(k(i(s))))){static get is(){return"detail-direct-debits-service"}static get scopedElements(){const e=[A,E,R,L,...he.configurationScopedElements()];return he.scopedElementsFromClasses(e)}static get properties(){return{itemSelected:{type:Object},maxRetries:{type:Number,attribute:"max-retries"},errorDetailDebitResponse:{type:Boolean,attribute:"error-detail-debit-response"},serviceName:{type:String,attribute:"service-name"},serviceReference:{type:String,attribute:"service-reference"},_retriesConfig:{type:Number},_optionDetailService:{type:Array}}}constructor(){super(),this.config={header:{text:this.t("account-transaction-servicing-bill-payments-home-service-details"),leftIconAriaLabel:this.t("account-transaction-servicing-bill-payments-home-lock"),"@header-main-icon-click":this._backHeaderDetailDirectDebits.bind(this)}},this.errorDetailDebitResponse=!1,this.itemSelected={},this.maxRetries=3,this.serviceName="",this.serviceReference="",this._optionDetailService=[{icon:d(),label:this.t("account-transaction-servicing-bill-payments-home-programming-details"),id:"detailProgramming"}],this._retriesConfig=0}static get styles(){return[de,M.primary,T.primary,q.primary,r("detail-direct-debits-service-shared-styles")]}_backHeaderDetailDirectDebits(e){e&&e.stopPropagation(),this._reset(),ne(this,"account-transaction-servicing-bill-payments-home-direct-debit-header-click")}_detailActionDirectDebits(){ne(this,"account-transaction-servicing-bill-payments-home-details-programation-button-click",this.itemSelected)}_reset(){this.maxRetries=3,this._retriesConfig=0,this._optionDetailService=[{icon:d(),label:this.t("account-transaction-servicing-bill-payments-home-programming-details"),id:"detailProgramming"}],this.errorDetailDebitResponse=!1}_retries(e){this._retriesConfig+=1,this.maxRetries!==this._retriesConfig?this._detailActionDirectDebits(e):this._backHeaderDetailDirectDebits()}get _showErrorMessage(){return o`
      <bbva-help-modal
        modal-type="warning"
        header-text="${this.t("account-transaction-servicing-bill-payments-home-error")}"
        ?visible="${this.errorDetailDebitResponse}"
        title-icon="${h()}"
        title-text="${this.t("account-transaction-servicing-bill-payments-home-information-not-available")}"
        body-text="${this.t("account-transaction-servicing-bill-payments-home-information-not-available-body")}"
        button-text="${this._retriesConfig<this.maxRetries-1?this.t("account-transaction-servicing-bill-payments-home-retries"):this.t("account-transaction-servicing-bill-payments-home-exit")}"
        link-text="${this._retriesConfig<this.maxRetries-1?this.t("account-transaction-servicing-bill-payments-home-exit"):""}"
        @help-modal-header-click="${this._backHeaderDetailDirectDebits}"
        @help-modal-footer-link-click="${this._backHeaderDetailDirectDebits}"
        @help-modal-footer-button-click="${this._retries}"
      >
      </bbva-help-modal>
    `}render(){return o`
      ${super.render()}
      <div class="content-body">
        <div class="service-detail-reference-image">
          <bbva-clip-box
            .group="${[{text:this.serviceName,size:"xl",bitone:"true"}]}"
          ></bbva-clip-box>
        </div>
        <bbva-type-text
          font-weight="${c.fontWeight50}"
          size="3XL"
          text="${this.serviceName}"
        ></bbva-type-text>
        <bbva-type-text
          font-style="${l.fontStyle20}"
          text="${this.t("account-transaction-servicing-bill-payments-home-scheduled-payment")}"
        >
        </bbva-type-text>
        <bbva-type-text unset text="account-transaction-servicing-bill-payments-home-reference">
        </bbva-type-text>
        <bbva-type-text
          unset
          size="M"
          font-weight="${c.fontWeight40}"
          text="${this.serviceReference}"
        >
        </bbva-type-text>
      </div>
      <div class="icons-action">
        <bbva-button-row
          ambient="primary"
          .options="${this._optionDetailService}"
          @button-row-item-click="${this._detailActionDirectDebits}"
        >
        </bbva-button-row>
      </div>
      ${this._showErrorMessage}
    `}}customElements.define(he.is,he);var ve=e`
:host {
  display: block;
  box-sizing: border-box;
  padding: 0;
}

.content-flex {
  display: flex;
}

.image-service {
  align-self: center;
  padding: 0.5rem 1.5rem;
}

.title-item {
  align-self: center;
}
`;class me extends(t(w(k(i(s))))){static get is(){return"direct-debits-service"}static get scopedElements(){const e=[E,B,L,...me.configurationScopedElements()];return me.scopedElementsFromClasses(e)}static get properties(){return{programmingServiceList:{type:Array}}}constructor(){super(),this.config={header:{id:"iconBackHeader",variant:"first-level-sequential",showLeftIcon:!0,text:this.t("account-transaction-servicing-bill-payments-home-scheduled-payment"),"@header-main-icon-click":this._backHeaderModalDirectDebits.bind(this)},fixedHeader:!0},this.programmingServiceList=[]}static get styles(){return[ve,T.primary,C.primary,q.primary,r("direct-debits-service-shared-styles")]}reset(){this.programmingServiceList=[]}_backHeaderModalDirectDebits(e){this.reset(),ne(this,"account-transaction-servicing-bill-payments-home-direct-debits-header-click"),e.stopPropagation()}_handleKeydown(e,t){"Enter"!==e.key&&" "!==e.key||(e.preventDefault(),this._selectedItemService(t))}_selectedItemService(e){ne(this,"account-transaction-servicing-bill-payments-home-select-service-click",e)}render(){return o`
      ${super.render()}
      ${this.programmingServiceList.map(((e,t)=>{var i,s;return o`
          <div
            id="item${t}"
            @click="${()=>this._selectedItemService(e)}"
            @keydown="${t=>this._handleKeydown(t,e)}"
          >
            <div class="content-flex">
              <div class="image-service">
                <bbva-clip-box
                  .group="${[{text:null==e||null===(i=e.service)||void 0===i?void 0:i.name,size:"xl",bitone:"true"}]}"
                ></bbva-clip-box>
              </div>
              <bbva-type-text
                class="title-item"
                size="2XL"
                text-color="${v.primaryCoreLight}"
                font-weight="${c.fontWeight40}"
                text="${null==e||null===(s=e.service)||void 0===s?void 0:s.name}"
              ></bbva-type-text>
            </div>
          </div>
          <bbva-divider-default
            ?hidden="${t===this.programmingServiceList.length-1}"
          >
          </bbva-divider-default>
        `}))}
    `}}customElements.define(me.is,me);var pe=e`
.image-service {
  align-self: center;
}

.content-body {
  padding: 1.5rem;
}

.icons-action {
  width: 70%;
  padding-top: 0;
  padding-bottom: 0;
  padding-left: 1rem;
}

.panel-container {
  padding: 1.5rem;
}

.title-text-next-expiration {
  padding-left: 1rem;
}

::part(title-link) {
  padding: 1.5rem 0 0;
}

::part(content-empty-state) {
  padding: 1rem;
  display: flex;
  flex-direction: column;
  align-items: flex-start;
}

::part(title-date) {
  padding-top: 0.5rem;
}

::part(content-next-expiration) {
  display: flex;
  padding: 1rem;
  flex-direction: column;
}
`;class be extends(t(w(k(i(s))))){static get is(){return"detail-stored-service"}static get scopedElements(){const e=[A,E,F,R,I,P,O,L,z,...be.configurationScopedElements()];return be.scopedElementsFromClasses(e)}static get properties(){return{isActiveArcus:{type:Boolean,attribute:"is-active-arcus"},currencyNextExpiration:{type:String,attribute:"currency-next-expiration"},showErrorApiDeleteService:{type:Boolean,attribute:"show-error-api-delete-service"},itemSelected:{type:Object},maturityDate:{type:String,attribute:"maturity-date"},upcommingExpirationAmount:{type:String,attribute:"upcomming-expiration-amount"},optionDetailService:{type:Array},_openDeleteServiceModal:{type:Boolean}}}constructor(){super(),this.config={header:{text:this.t("account-transaction-servicing-bill-payments-home-service-details"),leftIconAriaLabel:this.t("account-transaction-servicing-bill-payments-home-lock"),id:"backHeader","@header-main-icon-click":this._backHeaderModalDetailStoredService.bind(this)}},this.currencyNextExpiration="",this.isActiveArcus=!1,this.itemSelected={},this.maturityDate="",this.optionDetailService=[],this.showErrorApiDeleteService=!1,this.upcommingExpirationAmount="",this._openDeleteServiceModal=!1}static get styles(){return[pe,M.primary,T.primary,H.primary,V.primary,N.primary,j.primary,W.primaryAlt,q.primary,r("detail-stored-service-shared-styles")]}_actionRowButton(e){"deleteServices"!==this.optionDetailService[e.detail].id?(ne(this,`account-transaction-servicing-bill-payments-home-${this.optionDetailService[e.detail].id}-click`,this.itemSelected),this._backHeaderModalDetailStoredService()):(this._openDeleteServiceModal=!0,ne(this,"account-transaction-servicing-bill-payments-home-service-delete-button-click")),e.stopPropagation()}_backHeaderModalDetailStoredService(){this._reset(),ne(this,"account-transaction-servicing-bill-payments-home-detail-stored-service-header-main-icon-click")}_cancelDeleteService(){this._openDeleteServiceModal=!1}_confirmDeleteService(e){this._openDeleteServiceModal=!1,ne(this,"account-transaction-servicing-bill-payments-home-delete-services-confirm-click",this.itemSelected),e.stopPropagation()}_nextExpiration(){return o`
      <bbva-type-text
        class="title-text-next-expiration"
        font-weight="${c.fontWeight40}"
        size="L"
        text="account-transaction-servicing-bill-payments-home-upcoming-maturities"
      >
      </bbva-type-text>
      ${""!==this.upcommingExpirationAmount?o` <bbva-panel-container variant="card" corner="top-left">
            <div part="content-next-expiration">
              <bbva-type-text
                size="S"
                text="account-transaction-servicing-bill-payments-home-manual-payment"
              ></bbva-type-text>
              <bbva-type-amount
                ambient="primary"
                variant="2xl"
                type="bold"
                amount="${this.upcommingExpirationAmount}"
                currency-code="${this.currencyNextExpiration}"
                local-currency="${this.currencyNextExpiration}"
              >
              </bbva-type-amount>
              <bbva-type-date
                part="title-date"
                previous-text="${this.t("account-transaction-servicing-bill-payments-home-expires-on")}"
                date="${this.maturityDate}"
              >
              </bbva-type-date>
              <bbva-type-link
                part="title-link"
                text="${this.t("account-transaction-servicing-bill-payments-home-pay-service")}"
                @click="${this._payServiceWithArcus}"
                icon="${m()}"
              ></bbva-type-link>
            </div>
          </bbva-panel-container>`:o`
            <bbva-panel-container variant="card" corner="top-left">
              <div part="content-empty-state">
                <bbva-clip-microillustration
                  alt-microillustration="empty_state_day"
                  alt-image="emptystateday"
                >
                </bbva-clip-microillustration>
                <bbva-type-text
                  text="account-transaction-servicing-bill-payments-home-description"
                >
                </bbva-type-text>
              </div>
            </bbva-panel-container>
          `}
    `}_payServiceWithArcus(e){var t,i,s,r;const a={idService:null===(t=this.itemSelected)||void 0===t||null===(i=t.service)||void 0===i?void 0:i.id,reference:null===(s=this.itemSelected)||void 0===s?void 0:s.billNumber,alias:null===(r=this.itemSelected)||void 0===r?void 0:r.alias,amount:this.upcommingExpirationAmount};ne(this,"account-transaction-servicing-bill-payments-home-pay-service-arcus-click",a),e.stopPropagation()}_reset(){this.maturityDate="",this.itemSelected={},this.isActiveArcus=!1,this.optionDetailService=[],this.upcommingExpirationAmount="",this._openDeleteServiceModal=!1}render(){var e,t,i,s,r,a,d,h,v,m;return o`
      ${super.render()}
      <div class="content-body">
        <div class="image-service">
          <bbva-clip-box
            .group="${[{image:null===(e=this.itemSelected)||void 0===e||null===(t=e.service)||void 0===t||null===(i=t.logo)||void 0===i?void 0:i.url,text:null===(s=this.itemSelected)||void 0===s||null===(r=s.service)||void 0===r?void 0:r.name,size:"xl",bitone:"true"}]}"
          >
          </bbva-clip-box>
        </div>
        <bbva-type-text
          size="4XL"
          font-weight="${c.fontWeight50}"
          text="${null===(a=this.itemSelected)||void 0===a||null===(d=a.service)||void 0===d?void 0:d.name}"
        >
        </bbva-type-text>
        <bbva-type-text
          text="${null!==(h=this.itemSelected)&&void 0!==h&&h.alias?null===(v=this.itemSelected)||void 0===v?void 0:v.alias:""}">
        </bbva-type-text>
        <bbva-type-text
          font-style="${l.fontStyle20}"
          text="account-transaction-servicing-bill-payments-home-manual-payment"
        >
        </bbva-type-text>
        <bbva-type-text unset text="account-transaction-servicing-bill-payments-home-reference">
        </bbva-type-text>
        <bbva-type-text
          unset
          size="M"
          font-weight="${c.fontWeight40}"
          text="${null===(m=this.itemSelected)||void 0===m?void 0:m.billNumber}"
        >
        </bbva-type-text>
      </div>
      <div class="icons-action">
        <bbva-button-row
          ambient="primary"
          .options="${this.optionDetailService}"
          @button-row-item-click="${this._actionRowButton}"
        >
        </bbva-button-row>
      </div>
      ${this.isActiveArcus?this._nextExpiration():n}
      <bbva-help-modal
        id="modalDeleteService"
        modal-type="caution"
        title-icon="${p()}"
        ?visible="${this._openDeleteServiceModal}"
        link-text="${this.t("account-transaction-servicing-bill-payments-home-cancel")}"
        button-text="${this.t("account-transaction-servicing-bill-payments-home-delete-service")}"
        header-text="${this.t("account-transaction-servicing-bill-payments-home-delete-service")}"
        title-text="${this.t("account-transaction-servicing-bill-payments-home-delete-service-faq")}"
        body-text="${this.t("account-transaction-servicing-bill-payments-home-delete-service-description")}"
        @help-modal-footer-button-click="${this._confirmDeleteService}"
        @help-modal-footer-link-click="${this._cancelDeleteService}"
        @help-modal-header-click="${this._cancelDeleteService}"
        @help-modal-veil-click="${this._cancelDeleteService}"
      >
      </bbva-help-modal>
      <bbva-help-modal
        id="modalErrorApi"
        modal-type="caution"
        title-icon="${p()}"
        ?visible="${this.showErrorApiDeleteService}"
        header-text="${this.t("account-transaction-servicing-bill-payments-home-delete-service")}"
        title-text="${this.t("account-transaction-servicing-bill-payments-home-delete-service-not-delete")}"
        body-text="${this.t("account-transaction-servicing-bill-payments-home-delete-service-not-delete-work")}"
        button-text="${this.t("account-transaction-servicing-bill-payments-home-exit")}"
        @help-modal-footer-button-click="${()=>{this.showErrorApiDeleteService=!1}}"
      >
      </bbva-help-modal>
    `}}customElements.define(be.is,be);var ue=e`
.content-flex {
  display: flex;
}

.image-service {
  align-self: center;
}

.main-content {
  align-self: center;
  padding-left: 0.5rem;
}

.content-reference {
  padding-bottom: 0.5rem;
}

.margin-items {
  margin-bottom: 1rem;
  margin-top: 1rem;
}

.content-body {
  padding: 1rem;
}
`;class ge extends(t(w(k(i(s))))){static get is(){return"service-stored"}static get scopedElements(){const e=[E,B,L,...ge.configurationScopedElements()];return ge.scopedElementsFromClasses(e)}static get properties(){return{saveServiceList:{type:Array}}}constructor(){super(),this.config={header:{text:this.t("account-transaction-servicing-bill-payments-home-manual-payment"),leftIconAriaLabel:this.t("account-transaction-servicing-bill-payments-home-lock"),"@header-main-icon-click":this._backHeaderModalStoredService.bind(this)}},this.saveServiceList=[]}static get styles(){return[ue,T.primary,C.primary,q.primary,r("service-stored-shared-styles")]}_backHeaderModalStoredService(e){this._reset(),ne(this,"account-transaction-servicing-bill-payments-home-back-header-stored-service-click"),e.stopPropagation()}_handleKeydown(e,t){"Enter"!==e.key&&" "!==e.key||(e.preventDefault(),ne(this,"account-transaction-servicing-bill-payments-home-select-stored-service-click",t))}_reset(){this.saveServiceList=[]}render(){return o`
      ${super.render()}
      <div class="content-body">
        ${this.saveServiceList.map(((e,t)=>{var i,s,r,a;return o`
            <div
              id="item${t}"
              class="content-clip-list"
              @click="${()=>ne(this,"account-transaction-servicing-bill-payments-home-select-stored-service-click",e)}"
              @keydown="${t=>this._handleKeydown(t,e)}"
            >
              <div class="content-flex margin-items">
                <div class="image-service">
                  <bbva-clip-box
                    .group="${[{image:null==e||null===(i=e.service)||void 0===i||null===(s=i.logo)||void 0===s?void 0:s.url,text:null==e||null===(r=e.service)||void 0===r?void 0:r.name,size:"xl",bitone:"true"}]}"
                  >
                  </bbva-clip-box>
                </div>
                <div class="main-content">
                  <bbva-type-text
                    unset
                    size="L"
                    text-color="${v.primaryCoreLight}"
                    font-weight="${c.fontWeight40}"
                    text="${null==e||null===(a=e.service)||void 0===a?void 0:a.name}"
                  >
                  </bbva-type-text>
                  <div class="content-reference content-flex">
                    <bbva-type-text unset text="${null!=e&&e.alias?null==e?void 0:e.alias:""}">
                    </bbva-type-text>
                  </div>
                </div>
              </div>
              <bbva-divider-default
                ?hidden="${t===this.saveServiceList.length-1}"
              >
              </bbva-divider-default>
            </div>
          `}))}
      </div>
    `}}customElements.define(ge.is,ge);var ye=e`
:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.row-content {
  padding: 1.5rem;
}

.text-content {
  margin-right: 1.5rem;
  margin-left: 1.5rem;
}

.next-tootltip {
  background-color: var(--_account-transaction-servicing-bill-payments-home-bg-color);
}

.footer-content {
  display: block;
}

.type-link-programming {
  display: table-cell;
  text-align: left;
}

.type-link-manual {
  display: table-cell;
  text-align: left;
}

.item-section {
  display: table;
  width: 100%;
  padding-right: 1.5rem;
}

.text-saved-services {
  padding-left: 1rem;
  color: var(--_account-transaction-servicing-bill-payments-home-color-text);
}

.item-skeleton {
  padding-left: 1.5rem;
  display: flex;
  width: 100%;
}

.divider-fit {
  padding: 0 1rem 0 1rem;
}

[data-tag-name=bbva-button-row] {
  background-color: var(--_account-transaction-servicing-bill-payments-home-bg-color);
  padding: 1rem;
}

[data-tag-name=bbva-core-icon] {
  color: var(--_account-transaction-servicing-bill-payments-home-color-icon);
}
`;class _e extends(t(w(k(i(s))))){static get is(){return"principal-bill-payments-home"}static get scopedElements(){const e=[A,b,B,G,ie,Q,se,R,ee,U,Y,K,O,L,he,le,be,me,ge,..._e.configurationScopedElements()];return _e.scopedElementsFromClasses(e)}static get properties(){return{_isActiveArcus:{type:Boolean},currencyCode:{type:String,attribute:"currency-code"},directDebitApiVersion:{type:String,attribute:"direct-debit-api-version"},queryArcusFlag:{type:Boolean,attribute:"query-arcus-flag"},queryScheduledFlag:{type:Boolean,attribute:"query-scheduled-flag"},maxRetries:{type:Number,attribute:"max-retries"},globalServicesApiVersion:{type:String,attribute:"global-services-api-version"},loadSkeleton:{type:Boolean,attribute:"load-skeleton"},programmingServiceList:{type:Array},errorStoredServiceResponse:{type:Boolean,attribute:"error-stored-service-response"},saveServiceList:{type:Array},serviceBillsApiVersion:{type:String,attribute:"service-bills-api-version"},showMessageNotService:{type:Boolean,attribute:"show-message-not-service"},showInitToolTip:{type:Boolean,attribute:"show-init-tool-tip"},showToolTipNewService:{type:Boolean,attribute:"show-tool-tip-new-service"},storedServiceApiVersion:{type:String,attribute:"stored-service-api-version"},_currencyNextExpiration:{type:String},_directDebitDetail:{type:Object},_directDebitId:{type:String},_showErrorApiDeleteService:{type:Boolean},_itemSelectedService:{type:Object},_maturityDate:{type:String},_upcommingExpirationAmount:{type:String},_optionDetailService:{type:Array},_queryParamsServiceBills:{type:Object},_errorDetailDebitResponse:{type:Boolean},_retriesConfig:{type:Number},_itemDetailSelected:{type:Object},_serviceIdToArcus:{type:String},_showDetailDirectDebitsService:{type:Boolean},_showDetailServiceStored:{type:Boolean},_showDirectDebitsService:{type:Boolean},_showNotificationToast:{type:Boolean},_showServiceList:{type:Boolean},_storedServiceId:{type:String},_optionAction:{type:Array},_optionsDate:{type:Object},_optionModalDetailService:{type:Array}}}static get styles(){return[ye,q.primary,W.primary,W.primaryAlt,M.primaryAlt,C.primaryAlt,te.primaryAlt,r("principal-bill-payments-home-shared-styles")]}constructor(){super(),this.config={header:{id:"headerMultistep",variant:"first-level-sequential",showLeftIcon:!0,text:this.t("account-transaction-servicing-bill-payments-home-pay-service-or-tax"),"@header-main-icon-click":this._closeHeader.bind(this)},fixedHeader:!0},this.currencyCode="",this.directDebitApiVersion="1",this.errorStoredServiceResponse=!1,this.globalServicesApiVersion="1",this._isActiveArcus=!1,this.loadSkeleton=!1,this.maxRetries=3,this.programmingServiceList=[],this.queryArcusFlag=!1,this.queryScheduledFlag=!1,this.saveServiceList=[],this.serviceBillsApiVersion="0",this.showMessageNotService=!1,this.showInitToolTip=!1,this.showModalDetailDirectDebits=!1,this.showToolTipNewService=!1,this.storedServiceApiVersion="0",this._currencyNextExpiration="",this._directDebitDetail={},this._directDebitId="",this._itemSelectedService={},this._maturityDate="",this._upcommingExpirationAmount="",this._optionAction=[{icon:u(),label:this.t("account-transaction-servicing-bill-payments-home-pay-new"),id:"payNew"}],this._optionDetailService=[],this._optionsDate={day:"2-digit",month:"long",year:"numeric",hour:"2-digit",minute:"numeric"},this._optionModalDetailService=[{icon:g(),label:this.t("account-transaction-servicing-bill-payments-home-edit"),id:"edit"},{icon:y(),label:this.t("account-transaction-servicing-bill-payments-home-cancel"),id:"cancel"}],this._queryParamsServiceBills={},this._errorDetailDebitResponse=!1,this._retriesConfig=0,this._itemDetailSelected={},this._serviceIdToArcus="",this._showDetailDirectDebitsService=!1,this._showDetailServiceStored=!1,this._showDirectDebitsService=!1,this._showErrorApiDeleteService=!1,this._showNotificationToast=!1,this._showServiceList=!1,this._storedServiceId=""}firstUpdated(){super.firstUpdated(),this._executeServices()}navigateForward(e,t={}){const i=new CustomEvent(`${e}-navigation-external`,{detail:t,bubbles:!0,composed:!0});this.dispatchEvent(i)}updated(e){super.updated(e),e.has("queryScheduledFlag")&&this._updateOptionAction()}_updateOptionAction(){this.queryScheduledFlag?this._optionAction=[{icon:u(),label:this.t("account-transaction-servicing-bill-payments-home-pay-new"),id:"payNew"},{icon:d(),label:this.t("account-transaction-servicing-bill-payments-home-schedule-payment"),id:"schedulePayment"}]:this._optionAction=[{icon:u(),label:this.t("account-transaction-servicing-bill-payments-home-pay-new"),id:"payNew"}]}_actionDemoOne(e){ne(this,"account-transaction-servicing-bill-payments-home-wellcome-tooltip-next-click"),e.stopPropagation()}_actionManualPay(e){this._showServiceList=!0,ne(this,"account-transaction-servicing-bill-payments-home-service-manuals-button-click"),e.stopPropagation()}_actionRowButton(e){const t=0===e.detail?"account-transaction-servicing-bill-payments-home-new-service-button-click":"account-transaction-servicing-bill-payments-home-programming-payments-service-click";this._reset(),this.navigateForward(t),e.stopPropagation()}_backHeaderDetialDirectDebits(){this._resetDetailDirectDebits()}_backHeaderModalDetailDirectDebits(){this._resetModalDetailDirectDebits()}_changeDetailDirectDebits(e){this._itemSelectedService=null==e?void 0:e.detail,this._showDetailDirectDebitsService=!0,ne(this,"account-transaction-servicing-bill-payments-home-detail-service-button-click")}_changeModalDetailStoredService(e){this._itemDetailSelected=e.detail,this.queryArcusFlag?this._requestArcusService():this._getServices()}_closeHeader(e){this._reset(),ne(this,"account-transaction-servicing-bill-payments-home-header-close-button-click"),e.stopPropagation()}_closeTooltip(e){ne(this,"account-transaction-servicing-bill-payments-home-wellcome-tooltip-button-close-click"),e.stopPropagation()}_deleteServiceStored(e){var t;this._storedServiceId=null==e||null===(t=e.detail)||void 0===t?void 0:t.id,this._storedServiceApiDm.deleteStoredService(this._storedServiceId)}_dividerLine(){var e,t;return(null===(e=this.saveServiceList)||void 0===e?void 0:e.length)>0&&(null===(t=this.programmingServiceList)||void 0===t?void 0:t.length)>0?o` <div class="divider-fit">
          <bbva-divider-default> </bbva-divider-default>
        </div>`:n}_editDirectDebits(e){var t;this._errorDetailDebitResponse=!1,this._directDebitId=null==e||null===(t=e.detail)||void 0===t?void 0:t.id,this._directDebitApiDm.getDirectDebit(this._directDebitId)}_errorApiDeleteServiceStored(){this._showErrorApiDeleteService=!0}_errorResponseDetailDirectDebit(){this._errorDetailDebitResponse=!0}_executeServices(){this._getDms()}_exitProcess(){this._reset(),ne(this,"account-transaction-servicing-bill-payments-home-header-close-button-click")}static _formatDate(e){if(""!==e){const t=ce(e);if(t.year()<1980)return"";return t.format("DD MMMM YYYY")}return""}_getDms(){this._serviceBillsApiDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-service-bills-api-dm"]'),this._servicesApiDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-services-api-dm"]'),this._storedServiceApiDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-stored-service-api-dm"]'),this._directDebitApiDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-direct-debit-api-dm"]')}_getListServices(e){var t;const i=[{icon:m(),label:this.t("account-transaction-servicing-bill-payments-home-pay-service"),id:"billPayments"},{icon:d(),label:this.t("account-transaction-servicing-bill-payments-home-schedule-payment"),id:"programmingPay"},{icon:_(),label:this.t("account-transaction-servicing-bill-payments-home-delete-service"),id:"deleteServices"}];let s=!1;null==e||null===(t=e.detail)||void 0===t||t.map((e=>(e.name===this._itemDetailSelected.service.name&&(s=!0),e))),s||i.splice(1,1),""!==this._upcommingExpirationAmount&&i.splice(0,1);const r=this.queryScheduledFlag?i:i.filter((e=>"programmingPay"!==e.id));this._optionDetailService=r,this._showDetailServiceStored=!0,ne(this,"account-transaction-servicing-bill-payments-home-detail-service-button-click"),e.stopPropagation()}_getErrorServices(){this._showDetailServiceStored=!0}_getServices(){this._servicesApiDm.getServices()}_programmingPay(e){this._showDirectDebitsService=!0,ne(this,"account-transaction-servicing-bill-payments-home-scheduled-payment-button-click"),e.stopPropagation()}_requestArcusService(){var e,t,i;this._serviceIdToArcus=null===(e=this._itemDetailSelected)||void 0===e||null===(t=e.service)||void 0===t?void 0:t.id,this._queryParamsServiceBills={billReference:{referenceType:{id:"BILL_NUMBER"},value:null===(i=this._itemDetailSelected)||void 0===i?void 0:i.billNumber}},this._serviceBillsApiDm.getServiceBills(this._serviceIdToArcus,this._queryParamsServiceBills)}_reset(){this.saveServiceList=[],this.programmingServiceList=[],this.showInitToolTip=!1,this.showToolTipNewService=!1,this._showServiceList=!1,this._optionsDate={day:"2-digit",month:"long",year:"numeric",hour:"2-digit",minute:"numeric"},this._directDebitId="",this.maxRetries=3,this._retriesConfig=0,this.loadSkeleton=!1,this._isActiveArcus=!1,this._storedServiceId="",this._serviceIdToArcus="",this._queryParamsServiceBills={},this._resetDetailService(),this._resetDetailDirectDebits(),this._resetDirectDebitsService(),this._currencyNextExpiration="",this.directDebitApiVersion="1",this.serviceBillsApiVersion="0",this.storedServiceApiVersion="0",this._showNotificationToast=!1,this.globalServicesApiVersion="1",this._resetModalDetailDirectDebits(),this._errorDetailDebitResponse=!1,this._showErrorApiDeleteService=!1,this.errorStoredServiceResponse=!1,this._updateOptionAction()}_resetDetailDirectDebits(){this._showDetailDirectDebitsService=!1}_resetDetailService(){this._isActiveArcus=!1,this._maturityDate="",this._itemDetailSelected={},this._optionDetailService=[],this._upcommingExpirationAmount="",this.showMessageNotService=!1,this._showDetailServiceStored=!1,this._showServiceList=!1}_resetDetailDirectDebitsBack(){this._isActiveArcus=!1,this._maturityDate="",this._itemDetailSelected={},this._optionDetailService=[],this._upcommingExpirationAmount="",this.showMessageNotService=!1,this._showDetailServiceStored=!1}_resetDirectDebitsService(){this._showDirectDebitsService=!1}_resetModalDetailDirectDebits(){this.showModalDetailDirectDebits=!1,this._directDebitDetail={},this._optionModalDetailService=[{icon:g(),label:this.t("account-transaction-servicing-bill-payments-home-edit"),id:"edit"},{icon:y(),label:this.t("account-transaction-servicing-bill-payments-home-cancel"),id:"cancel"}]}_responseDetailDirectDebit(e){var t,i;this._directDebitDetail=null==e?void 0:e.detail,"DEACTIVATED"===(null===(t=this._directDebitDetail)||void 0===t||null===(i=t.status)||void 0===i?void 0:i.id)&&(this._optionModalDetailService.pop(),this._optionModalDetailService=[...this._optionModalDetailService]),this.showModalDetailDirectDebits=!0,ne(this,"account-transaction-servicing-bill-payments-home-detail-scheduled-payment-button-click"),e.stopPropagation()}_responseErrorArcus(){this._getServices(),this._showDetailServiceStored=!0,this._showNotificationToast=!1}_retries(){this._retriesConfig+=1,this.maxRetries!==this._retriesConfig?ne(this,"account-transaction-servicing-bill-payments-home-stored-service-close-click"):this._exitProcess()}_serviceContentArcusPayments(e){var t;e.detail&&(null==e||null===(t=e.detail)||void 0===t||t.data.map((e=>{var t,i,s,r;return this._isActiveArcus=""!==(null==e?void 0:e.id),this._maturityDate=_e._formatDate(null==e?void 0:e.maturityDate),this._upcommingExpirationAmount=null==e||null===(t=e.amounts[0])||void 0===t||null===(i=t.amountValue)||void 0===i?void 0:i.amount,this._upcommingExpirationAmount=this._upcommingExpirationAmount>0?this._upcommingExpirationAmount:"",this._currencyNextExpiration=null==e||null===(s=e.amounts[0])||void 0===s||null===(r=s.amountValue)||void 0===r?void 0:r.currency,null})));this._showNotificationToast=!1,this._getServices()}get _showErrorMessage(){return o`
      <bbva-help-modal
        modal-type="warning"
        header-text="${this.t("account-transaction-servicing-bill-payments-home-error")}"
        ?visible="${this.errorStoredServiceResponse}"
        title-icon="${h()}"
        title-text="${this.t("account-transaction-servicing-bill-payments-home-information-not-available")}"
        body-text="${this.t("account-transaction-servicing-bill-payments-home-information-not-available-body")}"
        button-text="${this._retriesConfig<this.maxRetries-1?this.t("account-transaction-servicing-bill-payments-home-retries"):this.t("account-transaction-servicing-bill-payments-home-exit")}"
        link-text="${this._retriesConfig<this.maxRetries-1?this.t("account-transaction-servicing-bill-payments-home-exit"):""}"
        @help-modal-header-click="${()=>this._exitProcess()}"
        @help-modal-footer-link-click="${()=>this._exitProcess()}"
        @help-modal-footer-button-click="${()=>this._retries()}"
        @help-modal-veil-click="${()=>this._exitProcess()}"
      >
      </bbva-help-modal>
    `}_skeletonStored(){return o`
      <div ?hidden="${this.loadSkeleton}" class="item-skeleton">
        <bbva-type-link
          ?loading="${!this.loadSkeleton}"
          text="${this.t("account-transaction-servicing-bill-payments-home-item-skeleton")}"
          aria-label="${this.t("account-transaction-servicing-bill-payments-home-item-skeleton")}"
        >
        </bbva-type-link>
        <bbva-type-link
          ?loading="${!this.loadSkeleton}"
          text="${this.t("account-transaction-servicing-bill-payments-home-icon-help")}"
          aria-label="${this.t("account-transaction-servicing-bill-payments-home-icon-help")}"
        >
        </bbva-type-link>
      </div>
      <div ?hidden="${this.loadSkeleton}" class="item-skeleton">
        <bbva-type-link
          ?loading="${!this.loadSkeleton}"
          text="${this.t("account-transaction-servicing-bill-payments-home-item-skeleton")}"
          aria-label="${this.t("account-transaction-servicing-bill-payments-home-item-skeleton")}"
        >
        </bbva-type-link>
        <bbva-type-link
          ?loading="${!this.loadSkeleton}"
          text="${this.t("account-transaction-servicing-bill-payments-home-icon-help")}"
          aria-label="${this.t("account-transaction-servicing-bill-payments-home-icon-help")}"
        >
        </bbva-type-link>
      </div>
    `}_successDeleteServiceStored(e){this._showNotificationToast=!0,this._resetDetailService(),this.showMessageNotService=!0,ne(this,"account-transaction-servicing-bill-payments-home-stored-service-close-click"),e.stopPropagation()}get _toast(){return o`
      <bbva-notification-toast
        fixed-bottom
        type="success"
        ?show="${this._showNotificationToast}"
        auto-hide
        icon-explainer="${S()}"
        accessibility-text="${this.t("account-transaction-servicing-bill-payments-home-deleted-service")}"
      >
        <bbva-type-text
          unset
          text="${this.t("account-transaction-servicing-bill-payments-home-deleted-service")}"
        >
        </bbva-type-text>
      </bbva-notification-toast>
    `}_validateShowManualAction(){var e;return(null===(e=this.saveServiceList)||void 0===e?void 0:e.length)>0?o`
          <div class="item-section">
            <bbva-type-link
              class="type-link-manual"
              icon="${D()}"
              text="${this.t("account-transaction-servicing-bill-payments-home-manual-payment")}"
              @click="${this._actionManualPay}"
            ></bbva-type-link>
            <bbva-core-icon size="16" icon="${x()}" @click="${this._actionManualPay}">
            </bbva-core-icon>
          </div>
        `:n}_validateShowProgramAction(){var e;return(null===(e=this.programmingServiceList)||void 0===e?void 0:e.length)>0?o`
          <div class="item-section">
            <bbva-type-link
              class="type-link-programming"
              icon="${d()}"
              text="${this.t("account-transaction-servicing-bill-payments-home-scheduled-payment")}"
              @click="${this._programmingPay}"
            ></bbva-type-link>
            <bbva-core-icon size="16" icon="${x()}" @click="${this._programmingPay}">
            </bbva-core-icon>
          </div>
        `:n}render(){var e,t,i,s,r,a,n;return o`
      ${super.render()}
      <bbva-global-service-bills-api-dm
        country="${this.locale}"
        version="${this.serviceBillsApiVersion}"
        host="${this.host}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @service-bills-api-dm-fetch="${this._serviceContentArcusPayments}"
        @service-bills-api-dm-fetch-error="${this._responseErrorArcus}"
        @api-dm-response-error="${this._responseErrorArcus}"
      ></bbva-global-service-bills-api-dm>
      <bbva-global-services-api-dm
        host="${this.host}"
        version="${this.globalServicesApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @services-api-dm-fetch="${this._getListServices}"
        @services-api-dm-fetch-error="${this._getErrorServices}"
      ></bbva-global-services-api-dm>
      <bbva-global-stored-service-api-dm
        host="${this.host}"
        version="${this.storedServiceApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @stored-service-api-dm-delete="${this._successDeleteServiceStored}"
        @stored-service-api-dm-delete-error="${this._errorApiDeleteServiceStored}"
        @api-dm-error="${this._errorApiDeleteServiceStored}"
      ></bbva-global-stored-service-api-dm>
      <bbva-global-direct-debit-api-dm
        host="${this.host}"
        version="${this.directDebitApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @direct-debit-api-dm-fetch="${this._responseDetailDirectDebit}"
        @direct-debit-api-dm-fetch-error="${this._errorResponseDetailDirectDebit}"
      ></bbva-global-direct-debit-api-dm>
      <bbva-help-tooltip
        id="initialTooltipRow"
        avoid-clickable
        ambient="primary"
        heading="${this.t("account-transaction-servicing-bill-payments-home-uncomplicated")}"
        header-title-size="L"
        vertical-placement="bottom"
        avoid-auto-position-tooltip
        description="${this.t("account-transaction-servicing-bill-payments-home-quickly-access-to-pay-and-schedule-your-payments")}"
        link-text="${this.t("account-transaction-servicing-bill-payments-home-next")}"
        ?opened="${this.showInitToolTip}"
        @help-tooltip-link-click="${this._actionDemoOne}"
      >
        <div slot="invoker">
          <bbva-button-row
            ambient="primary"
            .options="${this._optionAction}"
            @button-row-item-click="${this._actionRowButton}"
          >
          </bbva-button-row>
        </div>
      </bbva-help-tooltip>
      <bbva-help-tooltip
        id="initialTooltipMessage"
        avoid-clickable
        ambient="primary"
        heading="${this.t("account-transaction-servicing-bill-payments-home-everything-at-hand")}"
        header-title-size="L"
        vertical-placement="bottom"
        description="${this.t("account-transaction-servicing-bill-payments-home-find-favorite-services-fast-easy")}"
        link-text="${this.t("account-transaction-servicing-bill-payments-home-finish")}"
        ?opened="${this.showToolTipNewService}"
        @help-tooltip-link-click="${this._closeTooltip}"
      >
        <div slot="invoker" class="next-tootltip">
          <div
            class="text-content"
            ?hidden="${0!==(null===(e=this.saveServiceList)||void 0===e?void 0:e.length)||0!==(null===(t=this.programmingServiceList)||void 0===t?void 0:t.length)}"
          >
            <bbva-notification-message
              message-title="${this.t("account-transaction-servicing-bill-payments-home-no-saved-services-yet")}"
              description="${this.t("account-transaction-servicing-bill-payments-home-manage-services-description")}"
              link-title="${this.t("account-transaction-servicing-bill-payments-home-pay-service")}"
              accessibility-link-label="${this.t("account-transaction-servicing-bill-payments-home-notification-message-link")}"
              @notification-message-link-click="${()=>{this.navigateForward("account-transaction-servicing-bill-payments-home-new-service-button-click")}}"
            >
            </bbva-notification-message>
          </div>
          <div
            class="footer-content"
            ?hidden="${0===(null===(i=this.saveServiceList)||void 0===i?void 0:i.length)&&0===(null===(s=this.programmingServiceList)||void 0===s?void 0:s.length)}"
          >
            <bbva-type-text
              class="text-saved-services"
              font-weight="${c.fontWeight40}"
              size="L"
              text="account-transaction-servicing-bill-payments-home-saved-services"
            >
            </bbva-type-text>
            ${this._skeletonStored()} ${this._validateShowManualAction()} ${this._dividerLine()}
            ${this._validateShowProgramAction()}
          </div>
        </div>
      </bbva-help-tooltip>
      ${this._toast} ${this._showErrorMessage}
      <bbva-transition-container ?visible="${this._showServiceList}">
        <div slot="slot-content">
          <service-stored
            id="serviceStored"
            .saveServiceList="${this.saveServiceList}"
            @account-transaction-servicing-bill-payments-home-back-header-stored-service-click="${()=>{this._showServiceList=!1}}"
            @account-transaction-servicing-bill-payments-home-select-stored-service-click="${this._changeModalDetailStoredService}"
          ></service-stored>
        </div>
      </bbva-transition-container>
      <bbva-transition-container ?visible="${this._showDetailServiceStored}">
        <div slot="slot-content">
          <detail-stored-service
            maturity-date="${this._maturityDate}"
            .itemSelected="${this._itemDetailSelected}"
            ?is-active-arcus="${this._isActiveArcus}"
            .optionDetailService="${this._optionDetailService}"
            upcomming-expiration-amount="${this._upcommingExpirationAmount}"
            currency-next-expiration="${this._currencyNextExpiration}"
            ?show-error-api-delete-service="${this._showErrorApiDeleteService}"
            @account-transaction-servicing-bill-payments-home-billPayments-click="${this._resetDetailService}"
            @account-transaction-servicing-bill-payments-home-programmingPay-click="${this._resetDetailService}"
            @account-transaction-servicing-bill-payments-home-pay-service-arcus-click="${this._resetDetailService}"
            @account-transaction-servicing-bill-payments-home-detail-stored-service-header-main-icon-click="${this._resetDetailDirectDebitsBack}"
            @account-transaction-servicing-bill-payments-home-delete-services-confirm-click="${this._deleteServiceStored}"
          ></detail-stored-service>
        </div>
      </bbva-transition-container>
      <bbva-transition-container ?visible="${this._showDirectDebitsService}">
        <div slot="slot-content">
          <direct-debits-service
            id="directDebitsService"
            .programmingServiceList="${this.programmingServiceList}"
            @account-transaction-servicing-bill-payments-home-direct-debits-header-click="${this._resetDirectDebitsService}"
            @account-transaction-servicing-bill-payments-home-select-service-click="${this._changeDetailDirectDebits}"
          ></direct-debits-service>
        </div>
      </bbva-transition-container>
      <bbva-transition-container ?visible="${this._showDetailDirectDebitsService}">
        <div slot="slot-content">
          <detail-direct-debits-service
            service-name="${null===(r=this._itemSelectedService)||void 0===r||null===(a=r.service)||void 0===a?void 0:a.name}"
            service-reference="${null===(n=this._itemSelectedService)||void 0===n?void 0:n.reference}"
            .itemSelected="${this._itemSelectedService}"
            max-retries="${this.maxRetries}"
            ?error-detail-debit-response="${this._errorDetailDebitResponse}"
            @account-transaction-servicing-bill-payments-home-direct-debit-header-click="${this._backHeaderDetialDirectDebits}"
            @account-transaction-servicing-bill-payments-home-details-programation-button-click="${this._editDirectDebits}"
          ></detail-direct-debits-service>
        </div>
      </bbva-transition-container>
      <bbva-transition-container ?visible="${this.showModalDetailDirectDebits}">
        <div slot="slot-content">
          <detail-modal-direct-debits-service
            currency-code="${this.currencyCode}"
            direct-debit-id="${this._directDebitId}"
            ?query-scheduled-flag="${this.queryScheduledFlag}"
            .directDebitsDetail="${this._directDebitDetail}"
            .optionModalDetailService="${this._optionModalDetailService}"
            @account-transaction-servicing-bill-payments-home-back-header-modal-detail-direct-debits-click="${this._backHeaderModalDetailDirectDebits}"
            @account-transaction-servicing-bill-payments-home-action-cancel-service-click="${this._reset}"
            @account-transaction-servicing-bill-payments-home-action-edit-service-click="${this._reset}"
          >
          </detail-modal-direct-debits-service>
        </div>
      </bbva-transition-container>
    `}}customElements.define(_e.is,_e);class Se extends(t(w(k(i(s))))){static get is(){return"account-transaction-servicing-bill-payments-home"}static get scopedElements(){const e=[Z,J,K,_e,X,...Se.configurationScopedElements()];return Se.scopedElementsFromClasses(e)}static get properties(){return{isActiveArcus:{type:Boolean,attribute:"is-active-arcus"},contentFragmentHost:{type:String,attribute:"content-fragment-host"},contentFragmentPath:{type:String,attribute:"content-fragment-path"},contentFragmentNative:{type:Boolean,attribute:"content-fragment-native"},queryArcusFlag:{type:Boolean,attribute:"query-arcus-flag"},queryScheduledFlag:{type:Boolean,attribute:"query-scheduled-flag"},storedServicesApiVersion:{type:String,attribute:"stored-services-api-version"},directDebitsApiVersion:{type:String,attribute:"direct-debits-api-version"},currencyCode:{type:String,attribute:"currency-code"},maxRetries:{type:Number,attribute:"max-retries"},_firstInit:{type:Boolean},_flagStorage:{type:Boolean},_loadSkeleton:{type:Boolean},_programmingServiceList:{type:Array},_responseErrorDirectDebitsService:{type:Boolean},_errorStoredServiceResponse:{type:Boolean},_saveServiceList:{type:Array},_showMessageNotService:{type:Boolean},_showOnboarding:{type:Boolean},_showPrincipalPage:{type:Boolean},_showToolTipNewService:{type:Boolean}}}static get styles(){return[ae,re,r("account-transaction-servicing-bill-payments-home-shared-styles")]}constructor(){super(),this.contentFragmentHost="",this.contentFragmentNative=!1,this.contentFragmentPath="",this.currencyCode="",this.directDebitsApiVersion="1",this.isActiveArcus=!1,this.maxRetries=3,this.queryArcusFlag=!1,this.queryScheduledFlag=!1,this.storedServicesApiVersion="0",this._firstInit=!1,this._flagStorage=!1,this._loadSkeleton=!1,this._programmingServiceList=[],this._responseErrorDirectDebitsService=!1,this._errorStoredServiceResponse=!1,this._saveServiceList=[],this._showMessageNotService=!1,this._showOnboarding=!1,this._showPrincipalPage=!1,this._showToolTipNewService=!1}errorGetFlagCommandCenter(){this._showPrincipalPage=!1,this._firstInit=!1,this._showOnboarding=!0,this._setLocalStorageData()}firstUpdated(){super.firstUpdated(),this._executeServices()}getFlagLocalStorage(){this.dispatchEvent(new CustomEvent("account-transaction-servicing-bill-payments-home-init-get",{detail:{key:"command_center"},bubbles:!0,composed:!0}))}successGetFlagCommandCenter(e){this._flagStorage=e.status,this._flagStorage?this._getStoredService():(this._showPrincipalPage=!1,this._firstInit=!1,this._showOnboarding=!0,this._setLocalStorageData())}_closeTooltip(){this._firstInit=!1,this._showOnboarding=!1,this._showToolTipNewService=!1}_errorProgrammingServices(){var e;this._errorStoredServiceResponse?this._responseErrorDirectDebitsService=!0:(this._loadSkeleton=!0,this._showMessageNotService=(null===(e=this._saveServiceList)||void 0===e?void 0:e.length)>0,this._showPrincipalPage=!0,this._showOnboarding=!1)}_errorStoredService(){this._errorStoredServiceResponse=!0,this._requestProgrammingStoredService()}_executeServices(){this._getDms()}_getDms(){this._storedServicesApiDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-stored-services-api-dm"]'),this._directDebitsApiDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-direct-debits-api-dm"]')}_getStoredService(){this._errorStoredServiceResponse=!1,this._storedServicesApiDm.getStoredServices()}_requestProgrammingStoredService(){this._directDebitsApiDm.getDirectDebits()}_reset(){this.maxRetries=3,this.contentFragmentHost="",this.contentFragmentPath="",this.contentFragmentNative=!1,this.directDebitsApiVersion="1",this.storedServicesApiVersion="0",this.isActiveArcus=!1,this._firstInit=!1,this._flagStorage=!1,this._loadSkeleton=!1,this._saveServiceList=[],this._showPrincipalPage=!1,this._programmingServiceList=[],this._showOnboarding=!1,this._showToolTipNewService=!1,this._showMessageNotService=!1,this._errorStoredServiceResponse=!1,this._responseErrorDirectDebitsService=!1}_setLocalStorageData(){ne(this,"account-transaction-servicing-bill-payments-home-init",{key:"command_center",value:{status:!0}})}_storedServiceResponse(e){var t;ne(this,"account-transaction-servicing-bill-payments-home-list-service-click"),this._errorStoredServiceResponse=!1,this._saveServiceList=(t=null==e?void 0:e.detail,0===Object.keys(t).length&&t.constructor===Object?[]:null==e?void 0:e.detail),this._requestProgrammingStoredService(),e.stopPropagation()}_successProgrammingServices(e){var t,i;this._programmingServiceList=null==e?void 0:e.detail,this._showMessageNotService=!!((null===(t=this._saveServiceList)||void 0===t?void 0:t.length)>0||(null===(i=this._programmingServiceList)||void 0===i?void 0:i.length)>0),this._loadSkeleton=this._showMessageNotService,this._showPrincipalPage=!0,this._showOnboarding=!1}_acceptOnboarding(){this._showOnboarding=!1,this._showPrincipalPage=!0,this._firstInit=!0,this._getStoredService()}_nextTooltip(){this._firstInit=!1,this._showToolTipNewService=!0}get _onboardingBillPaymentsHomeUi(){return o`
      <onboarding-full-screen-carousel
        ?native="${this.contentFragmentNative}"
        ?visible="${this._showOnboarding}"
        .contentFragmentHost="${this.contentFragmentHost}"
        .contentFragmentPath="${this.contentFragmentPath}"
        @onboarding-full-screen-carousel-activate="${this._acceptOnboarding}"
      >
      </onboarding-full-screen-carousel>
    `}render(){return o`
      ${super.render()}
      <bbva-global-stored-services-api-dm
        version="${this.storedServicesApiVersion}"
        host="${this.host}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @stored-services-api-dm-fetch="${this._storedServiceResponse}"
        @stored-services-api-dm-fetch-error="${this._errorStoredService}"
        @api-dm-error="${this._errorStoredService}"
      ></bbva-global-stored-services-api-dm>
      <bbva-global-direct-debits-api-dm
        version="${this.directDebitsApiVersion}"
        host="${this.host}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        country="${this.locale}"
        @direct-debits-api-dm-fetch="${this._successProgrammingServices}"
        @direct-debits-api-dm-pagination="${this._successProgrammingServices}"
        @api-dm-error="${this._errorProgrammingServices}"
      ></bbva-global-direct-debits-api-dm>
      ${this._showOnboarding?this._onboardingBillPaymentsHomeUi:n}
      <bbva-transition-container ?visible="${this._showPrincipalPage}">
        <div class="container-principal-bill-payments-home" slot="slot-content">
          <principal-bill-payments-home
            ambient="primary-alt"
            id="principalPage"
            host="${this.host}"
            ?native="${this.native}"
            locale="${this.locale}"
            max-retries="${this.maxRetries}"
            currency-code="${this.currencyCode}"
            ?show-init-tool-tip="${this._firstInit}"
            ?show-tool-tip-new-service="${this._showToolTipNewService}"
            ?query-arcus-flag="${this.queryArcusFlag}"
            ?is-active-arcus="${this.isActiveArcus}"
            ?query-scheduled-flag="${this.queryScheduledFlag}"
            ?load-skeleton="${this._loadSkeleton}"
            .requiredToken="${this.requiredToken}"
            .saveServiceList="${this._saveServiceList}"
            .programmingServiceList="${this._programmingServiceList}"
            ?show-message-not-service="${this._showMessageNotService}"
            ?error-stored-service-response="${this._errorStoredServiceResponse}"
            @account-transaction-servicing-bill-payments-home-service-manuals-button-click="${this._closeTooltip}"
            @account-transaction-servicing-bill-payments-home-scheduled-payment-button-click="${this._closeTooltip}"
            @account-transaction-servicing-bill-payments-home-wellcome-tooltip-button-close-click="${this._closeTooltip}"
            @account-transaction-servicing-bill-payments-home-wellcome-tooltip-next-click="${this._nextTooltip}"
            @account-transaction-servicing-bill-payments-home-new-service-button-click-navigation-external="${this._reset}"
            @account-transaction-servicing-bill-payments-home-header-close-button-click="${this._reset}"
            @account-transaction-servicing-bill-payments-home-billPayments-click="${this._reset}"
            @account-transaction-servicing-bill-payments-home-programmingPay-click="${this._reset}"
            @account-transaction-servicing-bill-payments-home-programming-payments-service-click-navigation-external="${this._reset}"
            @account-transaction-servicing-bill-payments-home-pay-service-arcus-click="${this._reset}"
            @account-transaction-servicing-bill-payments-home-action-cancel-service-click="${this._reset}"
            @account-transaction-servicing-bill-payments-home-action-edit-service-click="${this._reset}"
            @account-transaction-servicing-bill-payments-home-stored-service-close-click="${this._getStoredService}"
          ></principal-bill-payments-home>
        </div>
      </bbva-transition-container>
    `}}customElements.define(Se.is,Se);
