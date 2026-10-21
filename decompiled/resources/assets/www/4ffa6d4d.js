import{aD as t,z as e,an as i,L as a,ak as r,h as n,e5 as s,e6 as o,e7 as l,ch as d,a8 as c,a9 as b,cX as m,aV as h,bl as u,e8 as v,aj as p,av as g,ck as y}from"./952f98a9.js";import{M as f,L as _,T as k,D,e as $,x,G as E,aC as I,ao as S,ar as C,a1 as L,z as T,aq as O,an as w,aa as R,a2 as M,H as B,N as P,E as A,a3 as N,a4 as q,I as j,K as z,Q as G,V,f as F,as as H,at as U,h as Y,ah as X}from"./216055dc.js";import{aI as K,aH as Q}from"./7f3d7ca9.js";import{b as W,B as Z}from"./2b04e291.js";import{b as J,B as tt}from"./2fc6c95e.js";import{b as et,B as it}from"./b0866b92.js";import{b as at,B as rt}from"./d335c75d.js";import{b as nt,B as st}from"./972f570a.js";import{b as ot,B as lt}from"./30ef6f1f.js";import{b as dt,B as ct}from"./af1c6cf3.js";import{b as bt,B as mt}from"./f9d0fbbe.js";import{f as ht,g as ut,h as vt,i as pt,j as gt,k as yt}from"./5bbe840b.js";import{B as ft}from"./2a0abc39.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./854beed0.js";import"./84dff06e.js";import"./4d2e5f99.js";import"./cf174536.js";import"./c5fdbfff.js";import"./79ad01ce.js";import"./68ec5adf.js";const _t=e=>({headerText:e.headerInfoText,titleText:e.titleInfoText,fixedFooter:e.fixedFooter,modalType:"info",titleIcon:t(),bodyText:e.description,ariaLabelCloseButton:"Close",bullets:e.bullets}),kt=t=>{var e,i;return{id:t.id??"retry-again",buttonFullWidth:t.buttonFullWidth??!0,buttonClassAdditional:t.buttonClassAdditional??"",headerText:t.headerErrorText,bodyText:t.description,buttonText:t.buttonText,panel:{microillustration:(null==t||null===(e=t.panel)||void 0===e?void 0:e.microillustration)??"error",microillustrationSize:(null==t||null===(i=t.panel)||void 0===i?void 0:i.microillustrationSize)??"M"}}},Dt=t=>({headerText:t.headerInfoText,fixedFooter:t.fixedFooter,ariaLabelCloseButton:"Close"}),$t=t=>({headerText:t.headerInfoText,titleText:t.titleInfoText,buttonText:t.buttonText,fixedFooter:t.fixedFooter});var xt=e`
.bullet-text {
  margin-left: var(--stock-information-product-detail-info-bullet-text-margin-left, 0.5rem);
}

.bullet-container {
  display: flex;
  margin-top: var(--stock-information-product-detail-info-bullet-container-margin-top, 0.5rem);
}

.description {
  margin-top: var(--stock-information-product-detail-info-description-margin-top, 1.75rem);
}

.center-text {
  margin: var(--stock-information-product-detail-info-center-text-margin, 2rem 0);
}

.subtitle-text {
  margin-top: var(--stock-information-product-detail-info-subtitle-text-margin-top, 0.5rem);
}

[data-tag-name=bbva-list-bullet] {
  padding: 1rem 0 0;
}

[data-tag-name=bbva-help-modal] {
  transform: translateZ(0);
}
`;class Et extends(f(i(_(a)))){static get is(){return"stocks-info-modal"}static get scopedElements(){const t=[$,x,E,Q];return Et.scopedElementsFromClasses(t)}static get properties(){return{modalConfig:{type:Object,attribute:"modal-config"},visible:{type:Boolean}}}constructor(){super(),this.modalConfig={},this.visible=!1}static get styles(){return[K.primary,k.primary,D.primary,r("stock-info-modal-shared-styles"),xt]}_buildBullet(){var t,e;return n`
      ${null===(t=this.modalConfig)||void 0===t||null===(e=t.bullets)||void 0===e?void 0:e.map((t=>n` <bbva-list-bullet text="${t}"></bbva-list-bullet> `))}
    `}get _renderModal(){const{headerText:t,titleIcon:e,titleText:i,ariaLabelCloseButton:a,fixedFooter:r,bullets:s,bodyText:o}=this.modalConfig||{};return n`
      <bbva-help-modal
        header-text="${t}"
        title-icon="${e}"
        title-text="${i}"
        header-close-icon-aria-label="${this.t(a)}"
        illustration="success"
        ?visible="${this.visible}"
        ?fixed-footer="${r}"
        @help-modal-close="${()=>this._dispatchCustomEvent("stock-information-bbva-trader-info-modal-close")}"
      >
        <div slot="slot-content">${s?this._buildBullet():o}</div>
      </bbva-help-modal>
    `}render(){return n` ${this._renderModal} `}}customElements.define(Et.is,Et);const It={containerTexts:{containerText:"stock-information-bbva-trader-product-detail-portfolio-value",containerText2:"stock-information-bbva-trader-product-detail-month-performance"},amountLabel:"stock-information-bbva-trader-product-detail-available-balance"},St={headerLabel:"stock-information-bbva-trader-product-detail-info-modal-header",titleLabel:"stock-information-bbva-trader-product-detail-info-modal-title",bullets:{bullet:"stock-information-bbva-trader-product-detail-info-modal-bullet-one",bullet2:"stock-information-bbva-trader-product-detail-info-modal-bullet-two",bullet3:"stock-information-bbva-trader-product-detail-info-modal-bullet-three"}},Ct={Otros:"Otros instrumentos"};var Lt=e`
:host {
  display: block;
  box-sizing: border-box;
  margin: 0;
  padding: 0;
  --gridSpacerVariant: 3;
  background-color: var(--_stock-information-bbva-trader-bg-color);
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-panel-container] {
  margin-top: 1rem;
}

[data-tag-name=bbva-panel-container]::part(container-panel) {
  margin: 0;
  padding: 2rem 1rem;
}

[data-tag-name=bbva-panel-container]::part(container-panel-number) {
  padding-top: 0.25rem;
}

[data-tag-name=bbva-panel-container]::part(container-panel-amount) {
  margin-top: 0.5rem;
}

[data-tag-name=bbva-panel-container]::part(container-panel-contract-percentage) {
  display: flex;
  align-items: center;
  padding-top: 0.5rem;
}

.list-container {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: center;
  margin-top: 0.5rem;
  margin-bottom: 1rem;
  padding: 0 1rem;
}

.list-item {
  display: flex;
  flex-direction: row;
  align-items: center;
}

.row-buttons {
  margin-bottom: 1.5rem;
}
`;class Tt extends(f(i(_(a)))){static get is(){return"stock-information-bbva-trader-product-detail"}static get scopedElements(){const t=[O,w,$,R,M,x,B,E,Et];return Tt.scopedElementsFromClasses(t)}static get properties(){return{alias:{type:String},calculateSharesData:{type:Object,attribute:"calculate-shares-data"},getBalancesData:{type:Object,attribute:"get-balances-data"},infoModalConfig:{type:Object,attribute:"info-modal-config"},number:{type:String},_infoModalVisible:{type:Boolean}}}constructor(){super(),this.alias="",this.ambient="primary",this.calculateSharesData={},this.getBalancesData={},this.infoModalConfig={},this.number="",this._infoModalVisible=!1}static get styles(){return[I.primary,S.primary,C.primary,L.primary,k.primary,T.primary,D.primary,r("product-detail-shared-styles"),Lt]}get _renderPanelDetail(){var t,e;const{portfolioValue:i={amount:0,currency:""},contractPercentagePerformance:a=0}=this.getBalancesData,{amount:r,currency:s}=i;return n`
      <bbva-panel-container variant="card" panel-color="primary-alt">
        <div part="container-panel">
          <bbva-type-text
            font-weight="500"
            text="${this.alias}"
            size="L"
            tag="span"
          ></bbva-type-text>
          <div part="container-panel-number">
            <bbva-type-text
              font-weight="350"
              text="${`•${this.number}`}"
              font-style="italic"
              size="S"
              tag="span"
            ></bbva-type-text>
          </div>
          <div part="container-panel-amount">
            <bbva-type-amount
              type="bold"
              amount="${r}"
              currency-code="${s}"
              local-currency="${s}"
              language="${this.language}"
              variant="3xl"
              tag="span"
            >
            </bbva-type-amount>
          </div>
          <bbva-type-text
            font-weight="350"
            text="${null==It||null===(t=It.containerTexts)||void 0===t?void 0:t.containerText}"
            size="S"
            tag="span"
          ></bbva-type-text>
          <div part="container-panel-contract-percentage">
            <bbva-type-amount
              type="bold"
              amount="${a}"
              symbol="%"
              language="${this.language}"
            >
            </bbva-type-amount>
            ${a>0?n` <bbva-badge-variability color="success"></bbva-badge-variability> `:n`
                  <bbva-badge-variability status="decrease" color="error"></bbva-badge-variability>
                `}
          </div>
          <bbva-type-text
            font-weight="350"
            text="${null==It||null===(e=It.containerTexts)||void 0===e?void 0:e.containerText2}"
            size="S"
            tag="span"
          ></bbva-type-text>
        </div>
      </bbva-panel-container>
    `}get _renderList(){var e,i,a,r,s,o;return n`
      <div class="list-container">
        <div class="list-item">
          <bbva-type-text
            tag="p"
            text="${null==It?void 0:It.amountLabel}"
            size="M"
          ></bbva-type-text>
          <bbva-type-link
            variant="icon"
            @click="${this._setInfoModal}"
            aria-label="${this.t("stock-information-bbva-trader-product-detail-help-icon")}"
            icon="${t()}"
          >
          </bbva-type-link>
        </div>
        <bbva-type-amount
          variant="m"
          amount="${(null===(e=this.calculateSharesData)||void 0===e||null===(i=e.transactionMarginAmount)||void 0===i?void 0:i.amount)??0}"
          currency-code="${(null===(a=this.calculateSharesData)||void 0===a||null===(r=a.transactionMarginAmount)||void 0===r?void 0:r.currency)??""}"
          local-currency="${(null===(s=this.calculateSharesData)||void 0===s||null===(o=s.transactionMarginAmount)||void 0===o?void 0:o.currency)??""}"
          language="${this.language}"
          ?loading="${0===Object.keys(this.calculateSharesData??{}).length}"
        >
        </bbva-type-amount>
      </div>
    `}get _renderRowButtons(){const t=[{icon:s(),label:"stock-information-bbva-trader-product-detail-buy-row-button",id:"button-1"},{icon:o(),label:"stock-information-bbva-trader-product-detail-my-orders-row-button",id:"button-2"},{icon:l(),label:"stock-information-bbva-trader-product-detail-transfer-row-button",id:"button-3"},{icon:d(),label:"stock-information-bbva-trader-product-detail-edit-alias-row-button",id:"button-3"}];return n`
      <div class="row-buttons">
        <bbva-button-row
          variant="simple"
          accessibility-text="${this.t("stock-information-bbva-trader-product-detail-text-accessibility-row-button")}"
          .options="${t}"
          @button-row-item-click="${t=>this._onRowButtonClicked(t.detail)}"
        ></bbva-button-row>
      </div>
    `}_onRowButtonClicked(t){const e={0:"product-detail-searching-button-click",1:"product-detail-order-list-button-click",2:"product-detail-transfer-button-click",3:"product-detail-edit-alias-click"}[t];e&&this._dispatchCustomEvent(`stock-information-bbva-trader-${e}`)}_setInfoModal(t="product-detail-info-modal"){var e,i,a;const r={id:t,headerInfoText:null==St?void 0:St.headerLabel,titleInfoText:null==St?void 0:St.titleLabel,bullets:[null==St||null===(e=St.bullets)||void 0===e?void 0:e.bullet,null==St||null===(i=St.bullets)||void 0===i?void 0:i.bullet2,null==St||null===(a=St.bullets)||void 0===a?void 0:a.bullet3],fixedFooter:!1};this.infoModalConfig=_t(r),this._infoModalVisible=!0}get _renderInfoModals(){return n`
      <stocks-info-modal
        .visible="${this._infoModalVisible}"
        .modalConfig="${this.infoModalConfig}"
        @stock-information-bbva-trader-info-modal-close="${()=>{this._infoModalVisible=!1}}"
      >
      </stocks-info-modal>
    `}render(){return n`
      ${this._renderPanelDetail} ${this._renderList} ${this._renderRowButtons}
      ${this._renderInfoModals}
    `}}customElements.define(Tt.is,Tt);const Ot={titleList:"stock-information-bbva-trader-investment-list-portfolio",inversionLabel:"stock-information-bbva-trader-investment-list-stock-balance",cashTodayLabel:"stock-information-bbva-trader-investment-list-other-amount-today",cashSecondLabel:"stock-information-bbva-trader-investment-list-other-amount-24hrs",cashThirdLabel:"stock-information-bbva-trader-investment-list-other-amount-48hrs",investmentCard:"stock-information-bbva-trader-investment-list-investment-card",investmentCardPrice:"stock-information-bbva-trader-investment-list-investment-card-last-price",investmentAccordion:"stock-information-bbva-trader-investment-list-accordion",investmentNoContent:"stock-information-bbva-trader-investment-list-no-content",investmentNoContentOtherMarkets:"stock-information-bbva-trader-investment-list-no-content-other-markets",investmentContentSearch:"stock-information-bbva-trader-investment-list-no-content-search",investmentContentSearching:"stock-information-bbva-trader-investment-list-no-content-searching",investmentRetryError:"stock-information-bbva-trader-investment-list-error-retry",investmentCallError:"stock-information-bbva-trader-investment-list-error-call"},wt={cashTodayLabelModal:"stock-information-bbva-trader-investment-list-other-amount-today-modal-text",cashSecondLabelModal:"stock-information-bbva-trader-investment-list-other-amount-24hrs-modal-text",cashThirdLabelModal:"stock-information-bbva-trader-investment-list-other-amount-48hrs-modal-text",retryErrorModalLabel:"stock-information-bbva-trader-product-detail-error-modal-retry",exitErrorModalLabel:"stock-information-bbva-trader-product-detail-error-modal-exit-operative"},{moment:Rt}=window;function Mt(t,e="DD MMMM YYYY"){var i,a;return null===(i=Rt(t))||void 0===i||null===(a=i.format(e))||void 0===a?void 0:a.replace(".","")}function Bt(t,e){let i=t.padEnd(7," ");return i=`FS${i}${e}`,encodeURIComponent(i)}function Pt(t,e){let i;return function(...a){const r=this;clearTimeout(i),i=setTimeout((()=>t.apply(r,a)),e)}}var At=e`
:host {
  display: block;
  box-sizing: border-box;
  margin: 0;
  padding: 0 0.5rem;
  background-color: var(--_stock-information-bbva-trader-bg-color);
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.fit {
  margin-top: 0.5rem;
}

.list-container {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: center;
}

.list-item {
  display: flex;
  flex-direction: row;
  align-items: center;
}

.assets-list-container {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: center;
  height: 3rem;
}

.assets-list-item {
  display: flex;
  flex-direction: row;
  justify-content: center;
  align-items: center;
}

.no-content-container {
  padding: 2rem 0 1rem;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: flex-start;
  gap: 0.5rem;
}

.no-content-container [data-tag-name=bbva-type-link] {
  margin-top: 1rem;
}

[data-tag-name=bbva-notification-message] {
  margin-bottom: 1rem;
}

.list-item-skeleton-card {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: center;
  padding: 0.5rem;
}

.card-issuer-name {
  color: var(--colorsPrimaryCoreLight, ${c(b.primaryCoreLight)});
}

.space-between {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
}

.padding-top-16 {
  padding-top: 1rem;
}

.margin-top-8 {
  margin-top: 0.5rem;
}

.padding-bottom-16 {
  padding-bottom: 1rem;
}

.padding-bottom-8 {
  padding-bottom: 0.5rem;
}

.margin-y-8 {
  margin-top: 0.5rem;
  margin-bottom: 0.5rem;
}

.flex-row {
  display: flex;
  flex-direction: row;
}

.portfolio-header {
  display: flex;
  flex-direction: column;
  gap: 0.5rem;
  margin: 1rem 0.5rem 0.5rem;
}

#showInvestmentList, .other-markets {
  margin: 0 0.5rem;
}

.info-amount {
  margin-top: 0.5rem;
}

.investment-list-header {
  padding: 0 0.5rem;
}
`;class Nt extends(f(i(_(a)))){static get is(){return"stock-information-bbva-trader-investment-list"}static get scopedElements(){const t=[q,Z,M,E,tt,j,O,B,x,Et,z,G];return Nt.scopedElementsFromClasses(t)}static get properties(){return{clientType:{type:String,attribute:"client-type"},errorTryNumber:{type:Number,attribute:"error-try-number"},getBalancesError:{type:Boolean,attribute:"get-balances-error"},getBalancesData:{type:Object,attribute:"get-balances-data"},infoModalConfig:{type:Object,attribute:"info-modal-config"},investmentListPaginationResponse:{type:Object,attribute:"investment-list-pagination-response"},listInvestmentData:{type:Object,attribute:"list-investment-data"},listInvestmentError:{type:Boolean,attribute:"list-investment-error"},maxNumberElementsPerPage:{type:Number,attribute:"max-elements-per-page"},scrollActivate:{type:Boolean,attribute:"scroll-activate"},showsSkeletonLoading:{type:Boolean,attribute:"shows-skeleton-loading"},assetsOtherMarkets:{type:Array,attribute:"assets-other-markets"},_infoModalVisible:{type:Boolean},_accordionClosed:{type:Boolean},_retriesConfig:{type:Object}}}static get styles(){return[I.primary,P.primary,A.primary,W.primary,N.primary,J.primary,L.primary,k.primary,T.primary,D.primary,r("investment-list-shared-styles"),At]}constructor(){super(),this.ambient="primary",this.clientType="",this.config={loader:!0},this.errorTryNumber=3,this.getBalancesData={},this.investmentListPaginationResponse={},this.listInvestmentData={},this.listInvestmentError=!1,this.maxNumberElementsPerPage=20,this.scrollActivate=!1,this.showsSkeletonLoading=!1,this._accordionClosed=!1,this._infoModalVisible=!1,this._retriesConfig={GET_LIST_INVESTMENTS:0,GET_BALANCES:0},this.assetsOtherMarkets=[]}updated(t){if(super.updated(t),t.has("_accordionClosed")&&this._dispatchCustomEvent("stock-information-bbva-trader-investment-list-activate-scroll",this._accordionClosed),t.has("scrollActivate")&&this.scrollActivate){Pt((()=>this._handleScrollInvestmentList()),1e3)()}t.has("listInvestmentError")&&this.listInvestmentError&&(this.showsSkeletonLoading=!1)}reset(){this.getBalancesData={},this.investmentListPaginationResponse={},this.listInvestmentData={},this.listInvestmentError=!1,this.scrollActivate=!1,this.showsSkeletonLoading=!1,this._infoModalVisible=!1,this._retriesConfig={GET_LIST_INVESTMENTS:0,GET_BALANCES:0}}_renderHeader(){return n`
      <div class="investment-list-header">
        <bbva-header-category
          variant="default"
          heading-level="2"
          text="${null==Ot?void 0:Ot.titleList}"
          link-accessibility-text="${this.t(null==Ot?void 0:Ot.titleList)}"
        ></bbva-header-category>
      </div>
    `}_renderListInvestmentCard(t,e){var i,a,r;const o=(null===(i=this.listInvestmentData)||void 0===i||null===(a=i.issuer)||void 0===a?void 0:a.length)??0,l=null===(r=this.listInvestmentData)||void 0===r?void 0:r.issuer[e],d={actionsExecuted:[{icon:s(),label:"stock-information-bbva-trader-investment-list-buy-stocks"},{icon:m(),label:"stock-information-bbva-trader-investment-list-sell-stocks"}],actionAdvice:[{icon:m(),label:"stock-information-bbva-trader-investment-list-sell-stocks"}]},c="EXECUTED"===this.clientType?d.actionsExecuted:d.actionAdvice;return n`
      <bbva-list-swipe
        .operativeActions="${c}"
        @list-swipe-action-click="${e=>{e.target.opening="",this._manageClick(e.detail,null==t?void 0:t.id,l)}}"
      >
        <div slot="invoker">
          <div class="space-between padding-top-16">
            <bbva-type-link
              @click="${()=>{this._dispatchCustomEvent("stock-information-bbva-trader-investment-list-issuer-select",l)}}"
            >
              <bbva-type-text
                class="card-issuer-name"
                text="${null==t?void 0:t.name} ${null==t?void 0:t.description}"
                size="M"
                tag="span"
                font-weight="500"
              ></bbva-type-text>
            </bbva-type-link>
            <bbva-type-amount
              variant="l"
              amount="${(null==t?void 0:t.partialInvestment.amount)??0}"
              currency-code="${(null==t?void 0:t.partialInvestment.currency)??""}"
              local-currency="${(null==t?void 0:t.partialInvestment.currency)??""}"
              language="${this.language}"
            >
            </bbva-type-amount>
          </div>
          <div class="margin-y-8">
            <bbva-type-text
              text="${(null==t?void 0:t.legalName)||""}"
              size="S"
              tag="span"
            ></bbva-type-text>
          </div>
          <div class="space-between margin-y-8">
            <bbva-type-text
              text="${null==Ot?void 0:Ot.investmentCard}"
              size="S"
              tag="span"
            ></bbva-type-text>
            <bbva-type-text
              text="${null==t?void 0:t.title.quantity}"
              size="S"
              tag="span"
            ></bbva-type-text>
          </div>
          <div class="space-between margin-top-8 padding-bottom-16">
            <bbva-type-text
              text="${null==Ot?void 0:Ot.investmentCardPrice}"
              size="S"
              tag="span"
            ></bbva-type-text>
            <div class="flex-row">${this._manageLastPrice(t)}</div>
          </div>
          ${e===o-1?h:n` <bbva-divider-default></bbva-divider-default> `}
        </div>
      </bbva-list-swipe>
    `}_manageLastPrice(t){var e,i;const a=(null==t||null===(e=t.currentPrice)||void 0===e?void 0:e.amount)??0,r=(null==t||null===(i=t.currentPrice)||void 0===i?void 0:i.currency)??"",s=(null==t?void 0:t.tendency)??0,o={0:n`
        <bbva-badge-variability color="warning" status="no-change"></bbva-badge-variability>
      `,1:n` <bbva-badge-variability color="success"></bbva-badge-variability> `,2:n` <bbva-badge-variability color="error" status="decrease"></bbva-badge-variability> `};return n`
      <bbva-type-amount
        variant="m"
        amount="${a}"
        currency-code="${r}"
        local-currency="${r}"
        language="${this.language}"
      >
      </bbva-type-amount>
      ${o[s]||h}
    `}_manageClick(t,e,i){const a=0===t.index&&"EXECUTED"===this.clientType;this._dispatchCustomEvent("stock-information-bbva-trader-purchase-and-sale-request-submit",{issuerId:e,bmeIssuerData:i,buy:a})}get _renderAccordionInvestment(){var t,e,i,a,r,s,o,l;return n`
      <bbva-expandable-accordion
        id="accordionInvestment"
        opened
        @expandable-accordion-open-change="${t=>{this._accordionClosed=t.detail,this.showsSkeletonLoading=!0}}"
      >
        <div slot="header" class="portfolio-header">
          <bbva-type-text
            tag="span"
            size="L"
            font-weight="500"
            text="${null==Ot?void 0:Ot.inversionLabel}"
            class="card-issuer-name"
          ></bbva-type-text>
          <bbva-type-amount
            amount="${(null===(t=this.listInvestmentData)||void 0===t||null===(e=t.totalAmount)||void 0===e?void 0:e.amount)??0}"
            currency-code="${(null===(i=this.listInvestmentData)||void 0===i||null===(a=i.totalAmount)||void 0===a?void 0:a.currency)??""}"
            local-currency="${(null===(r=this.listInvestmentData)||void 0===r||null===(s=r.totalAmount)||void 0===s?void 0:s.currency)??""}"
            language="${this.language}"
            variant="m"
            tag="span"
          >
          </bbva-type-amount>
        </div>

        <div slot="content" id="showInvestmentList">
          ${Object.keys(this.listInvestmentData).length<=0&&!this.listInvestmentError?this._renderNoContent(null==Ot?void 0:Ot.investmentNoContent,null==Ot?void 0:Ot.investmentContentSearch,!0):h}
          ${this.listInvestmentError?this._renderErrorMessage("GET_LIST_INVESTMENTS"):null===(o=this.listInvestmentData)||void 0===o||null===(l=o.issuer)||void 0===l?void 0:l.map(((t,e)=>this._renderListInvestmentCard(t,e)))}
          ${this.showsSkeletonLoading&&!this.listInvestmentError?this._renderLoader():h}
        </div>
      </bbva-expandable-accordion>
    `}_renderLoader(){const t=Array(3).fill(n`
      <div class="list-item-skeleton-card">
        <bbva-type-text loading tag="span"></bbva-type-text>
        <bbva-type-text loading tag="span"></bbva-type-text>
      </div>
    `);return n` ${t} `}_renderOthersList(t){var e;const{specificAmounts:i}=t,{assets:a}=t;return n`
      ${null===(e=this._orderListAssets(a))||void 0===e?void 0:e.map((t=>this._renderListAssets(t)))}
      <div class="fit">
        <bbva-divider-default></bbva-divider-default>
      </div>
      <div class="info-amount">
        ${i&&i.slice(0,3).map((t=>this._renderIconTextLabel(t)))}
      </div>
    `}_orderListAssets(t){const e=[];return Array.isArray(t)&&t.length>0&&this.assetsOtherMarkets.forEach((i=>{const a=t.find((t=>t.assetType.id===i&&t.amount.amount>0));a&&e.push(a)})),e}_renderListAssets(t){var e,i,a,r;const s=(null==t||null===(e=t.assetType)||void 0===e?void 0:e.name)??"",o=Ct[s]??s??"",l=o.charAt(0).toUpperCase()+o.slice(1).toLowerCase();return n`
      <div class="assets-list-container">
        <div class="assets-list-item">
          <bbva-type-text tag="span" text="${l}" size="M"></bbva-type-text>
        </div>
        <bbva-type-amount
          variant="m"
          amount="${(null==t||null===(i=t.amount)||void 0===i?void 0:i.amount)??0}"
          currency-code="${(null==t||null===(a=t.amount)||void 0===a?void 0:a.currency)??""}"
          local-currency="${(null==t||null===(r=t.amount)||void 0===r?void 0:r.currency)??""}"
          language="${this.language}"
        >
        </bbva-type-amount>
      </div>
    `}_renderIconTextLabel(e){var i,a,r,s,o;const l=`info ${null==e||null===(i=e.id)||void 0===i?void 0:i.toLowerCase().replace("_"," ")}`;return 0===(null==e||null===(a=e.amount)||void 0===a?void 0:a.amount)?h:n`
      <div class="list-container" id="${null==e?void 0:e.id}">
        <div class="list-item">
          <bbva-type-text
            text="${this._specificAmountsLabelText(null==e?void 0:e.id)}"
            size="M"
            tag="span"
          ></bbva-type-text>
          <bbva-type-link
            variant="icon"
            @click="${()=>this._infoModal(null==e?void 0:e.id)}"
            aria-label="${l}"
            icon="${t()}"
          >
          </bbva-type-link>
        </div>
        <bbva-type-amount
          variant="m"
          amount="${(null==e||null===(r=e.amount)||void 0===r?void 0:r.amount)??0}"
          currency-code="${(null==e||null===(s=e.amount)||void 0===s?void 0:s.currency)??""}"
          local-currency="${(null==e||null===(o=e.amount)||void 0===o?void 0:o.currency)??""}"
          language="${this.language}"
        >
        </bbva-type-amount>
      </div>
    `}_specificAmountsLabelText(t){switch(t){case"AMOUNT_TODAY":return null==Ot?void 0:Ot.cashTodayLabel;case"AMOUNT_24HRS":return null==Ot?void 0:Ot.cashSecondLabel;case"AMOUNT_48HRS":return null==Ot?void 0:Ot.cashThirdLabel;default:return""}}_infoModal(t){const e={id:t,headerInfoText:null==St?void 0:St.headerLabel,titleInfoText:this._specificAmountsLabelText(t),description:this._renderModalInfoBody(t)};this.infoModalConfig=_t(e),this._infoModalVisible=!0}_modalBodyText(t){return{AMOUNT_TODAY:null==wt?void 0:wt.cashTodayLabelModal,AMOUNT_24HRS:null==wt?void 0:wt.cashSecondLabelModal,AMOUNT_48HRS:null==wt?void 0:wt.cashThirdLabelModal}[t]||""}_renderModalInfoBody(t){const e=this._modalBodyText(t);return n`
      <bbva-type-text tag="span" alignment="left" size="S" text="${e}">
      </bbva-type-text>
    `}get _renderInfoModals(){return n`
      <stocks-info-modal
        .visible="${this._infoModalVisible}"
        .modalConfig="${this.infoModalConfig||{}}"
        @stock-information-bbva-trader-info-modal-close="${()=>{this._infoModalVisible=!1}}"
      >
      </stocks-info-modal>
    `}renderAccordionOthers(){var t,e,i,a,r,s;const o=null===(t=this.getBalancesData)||void 0===t||null===(e=t.specificAmounts)||void 0===e?void 0:e.find((t=>"AMOUNT_72HRS"===(null==t?void 0:t.id))),l=!(null!=o&&null!==(i=o.amount)&&void 0!==i&&i.amount||this._getBalancesError);return n`
      <bbva-expandable-accordion id="accordionOthers">
        <div slot="header" class="portfolio-header">
          <bbva-type-text
            class="card-issuer-name"
            tag="span"
            size="L"
            font-weight="500"
            text="${null==Ot?void 0:Ot.investmentAccordion}"
          ></bbva-type-text>
          <bbva-type-amount
            amount="${(null==o||null===(a=o.amount)||void 0===a?void 0:a.amount)??0}"
            currency-code="${(null==o||null===(r=o.amount)||void 0===r?void 0:r.currency)??""}"
            local-currency="${(null==o||null===(s=o.amount)||void 0===s?void 0:s.currency)??""}"
            language="${this.language}"
            variant="m"
            tag="span"
          >
          </bbva-type-amount>
        </div>
        <div slot="content" class="other-markets">
        ${l?this._renderNoContent(null==Ot?void 0:Ot.investmentNoContentOtherMarkets,"",!1):h}
        ${this._getBalancesError?this._renderErrorMessage("GET_BALANCES"):this._renderOthersList(this.getBalancesData)}
        </div>
      </bbva-expandable-accordion>
    `}_renderListsDivider(){return n` <bbva-divider-default></bbva-divider-default> `}_renderVisualContent(){return n`
      ${this._renderAccordionInvestment} ${this._renderListsDivider()}
      ${this.renderAccordionOthers()} ${this._renderInfoModals}
    `}_renderNoContent(t="",e="",i=!1){return n`
      <div class="no-content-container">
        <bbva-clip-microillustration
          alt-microillustration="empty_state_day"
          alt-image="Emptystateday"
          size="M"
        ></bbva-clip-microillustration>
        ${t?n`
              <bbva-type-text
                tag="h2"
                size="XL"
                text="${t}"
                font-weight="500"
              ></bbva-type-text>
            `:h}
        ${e?n`
              <bbva-type-text
                tag="span"
                size="S"
                text="${e}"
              ></bbva-type-text>
            `:h}
        ${i?n`
              <bbva-type-link
                @click="${()=>this._dispatchCustomEvent("stock-information-bbva-trader-investment-list-searching-show")}"
                text="${null==Ot?void 0:Ot.investmentContentSearching}"
              ></bbva-type-link>
            `:h}
      </div>
    `}_renderErrorMessage(t){return this._retriesConfig[t]<this.errorTryNumber?n`
        <bbva-notification-message
          variant="error"
          message="${null==wt?void 0:wt.retryErrorModalLabel}"
          link-title="${null==Ot?void 0:Ot.investmentRetryError}"
          @notification-message-link-click="${()=>this._manageServiceError(t)}"
        ></bbva-notification-message>
      `:n`
      <bbva-notification-message
        variant="error"
        message="${null==wt?void 0:wt.exitErrorModalLabel}"
        link-title="${null==Ot?void 0:Ot.investmentCallError}"
        @notification-message-link-click="${()=>this._manageServiceError(t)}"
      ></bbva-notification-message>
    `}_manageServiceError(t){this._retriesConfig[t]+=1,this.requestUpdate("_retriesConfig");const e=this._retriesConfig[t]>this.errorTryNumber?"stock-information-bbva-trader-investment-list-call-to-action-click":"stock-information-bbva-trader-investment-list-retry-request";this._dispatchCustomEvent(e)}_handleScrollInvestmentList(){this.showsSkeletonLoading=!0;this._checkInvestmentListNextPage()?(this._dispatchCustomEvent("stock-information-bbva-trader-investment-list-pagination-apply"),this._dispatchCustomEvent("stock-information-bbva-trader-investment-list-update-complete")):(this.showsSkeletonLoading=!1,this._dispatchCustomEvent("stock-information-bbva-trader-investment-list-pagination-finalize"))}_checkInvestmentListNextPage(){if(0===Object.keys(this.investmentListPaginationResponse).length)return!1;const t=this.investmentListPaginationResponse;return t.links.next&&""!==t.links.next}render(){return n` ${super.render()}${this._renderHeader()} ${this._renderVisualContent()} `}}customElements.define(Nt.is,Nt);var qt=e`
:host {
  display: block;
  text-align: left;
  height: calc(100vh - 3.5rem);
}

.container {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: space-between;
  height: 100%;
  padding: 0 1rem;
}
.container .card-container {
  margin-top: 1.5rem;
}
.container .button-container {
  margin-bottom: 1.5rem;
}
.container .button-container.no-margin {
  margin-bottom: 0;
}

:host([no-padding]) .container {
  padding: 0;
}
`;class jt extends(f(i(_(a)))){static get is(){return"retry-common-error"}static get scopedElements(){const t=[x,E,z,F];return jt.scopedElementsFromClasses(t)}static get properties(){return{noPadding:{type:Boolean,reflect:!0,attribute:"no-padding"},retryErrorConfig:{type:Object,attribute:"retry-error-config"}}}constructor(){super(),this.ambient="primary",this.noPadding=!1,this.retryErrorConfig={}}static get styles(){return[V.primary,P.primary,k.primary,D.primary,r("retry-common-error-shared-styles"),qt]}dispatchEventButtonRetry(t){this._dispatchCustomEvent(`stock-information-bbva-trader-${t}`)}get _renderMessage(){return n`${this._panelContent}`}get _panelContent(){const{panel:t="",bodyText:e="",buttonText:i="",id:a,buttonClassAdditional:r}=this.retryErrorConfig;return t?n`
          <div class="container">
            <div class="card-container">
              <div class="body-text-container">
                <bbva-clip-microillustration
                  alt-microillustration="${null==t?void 0:t.microillustration}"
                  alt-image="${null==t?void 0:t.microillustration}"
                  size="${null==t?void 0:t.microillustrationSize}"
                ></bbva-clip-microillustration>
              </div>
              ${e}
            </div>
            <bbva-button-default
              class="button-container ${r}"
              text="${i}"
              fullwidth
              @click="${()=>this.dispatchEventButtonRetry(a)}"
            ></bbva-button-default>
          </div>
        `:h}render(){return n` ${this._renderMessage} `}}const zt={filterPending:"stock-information-bbva-trader-order-list-filter-modal-pending",filterMonitored:"stock-information-bbva-trader-order-list-filter-modal-monitored",filterExecuted:"stock-information-bbva-trader-order-list-filter-modal-executed",filterCanceled:"stock-information-bbva-trader-order-list-filter-modal-canceled",buttonText1:"stock-information-bbva-trader-order-list-button-text",buttonText2:"stock-information-bbva-trader-order-list-button-text-attention"},Gt={zIndex:"999"},Vt={marginTop:"1rem"};class Ft extends(f(i(_(a)))){static get is(){return"order-list-filter-modal"}static get scopedElements(){const t=[$,E,st,rt];return Ft.scopedElementsFromClasses(t)}static get properties(){return{modalConfig:{type:Object,attribute:"modal-config"},statusId:{type:String,attribute:"status-id"},visible:{type:Boolean},_isDisabled:{type:Boolean}}}constructor(){super(),this.modalConfig={},this.statusId="",this.visible=!1,this._isDisabled=!0}static get styles(){return[at.primary,nt.primary,D.primary,r("order-list-filter-modal-shared-styles")]}resetModal(){this.statusId="",this.visible=!1,this._isDisabled=!0}cleanRadioButtons(){document.querySelectorAll('[id-modal="order-list-filter-modal"] [data-tag-name="bbva-form-radio-button"]').forEach((t=>{t.checked=!1}))}get _renderModal(){const{headerText:t,buttonText:e,fixedFooter:i}=this.modalConfig||{};return n`
      <bbva-help-modal
        ambient="primary"
        style=${u(Gt)}
        id-modal="order-list-filter-modal"
        full-height
        header-text="${t}"
        button-text="${e}"
        attach-to-body
        ?visible="${this.visible}"
        ?fixed-footer="${i}"
        .disabledButton="${this._isDisabled}"
        @help-modal-close="${()=>{this._dispatchCustomEvent("stock-information-bbva-trader-order-list-filter-modal-close"),this.resetModal()}}"
        @help-modal-footer-button-click="${()=>{this._dispatchCustomEvent("stock-information-bbva-trader-order-list-filter-modal-filter-select",this.statusId)}}"
      >
        <div slot="slot-content">${this._renderModalBody}</div>
      </bbva-help-modal>
    `}get _renderModalBody(){const{titleText:t}=this.modalConfig||{},{filterPending:e,filterMonitored:i,filterExecuted:a,filterCanceled:r}=zt||{};return n`
      <bbva-type-text tag="span" text="${t}" size="S" font-weight="500"></bbva-type-text>
      <div class="filter-modal-body" style=${u(Vt)}>
        <bbva-form-radio-group
          name="order-status"
          @form-radio-group-item-change=${t=>{this._isDisabled=!1,this.statusId=t.detail.value}}
        >
          <bbva-form-radio-button value="PENDING" divider="full">
            ${this.t(e)}
          </bbva-form-radio-button>
          <bbva-form-radio-button value="MONITORED" divider="full">
            ${this.t(i)}
          </bbva-form-radio-button>
          <bbva-form-radio-button value="EXECUTED" divider="full">
            ${this.t(a)}
          </bbva-form-radio-button>
          <bbva-form-radio-button value="CANCELED">
            ${this.t(r)}
          </bbva-form-radio-button>
        </bbva-form-radio-group>
      </div>
    `}render(){return n`${this._renderModal}`}}customElements.define(Ft.is,Ft);var Ht=e`
:host {
  display: block;
  box-sizing: border-box;
  margin: 0;
  padding: 0;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.order-list-container {
  margin: 1rem 0;
}

.message {
  display: flex;
  flex-direction: row;
  align-items: center;
  margin-top: 0.5rem;
}

.order-list-card-container {
  width: 100%;
}

.filter-row-button-container {
  margin-bottom: 2rem;
}

.fit {
  margin-bottom: 0.5rem;
}

.assets-list-container {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: center;
  height: 2rem;
}

.assets-list-item {
  display: flex;
  flex-direction: row;
  justify-content: center;
  align-items: center;
}

.assets-list-item-text {
  color: var(--colorsPrimaryCoreLight, ${c(b.primaryCoreLight)});
}

.assets-order-status {
  color: var(--colorsPrimaryCore, ${c(b.primaryCore)});
}

.assets-order-status-cancelled {
  color: var(--colorsTertiaryType1Dark, ${c(b.tertiaryType1Dark)});
}

.assets-order-status-monitored {
  color: var(--colorsTertiaryType3Dark, ${c(b.tertiaryType3Dark)});
}

.assets-order-status-executed {
  color: var(--colorsTertiaryType6Dark, ${c(b.tertiaryType6Dark)});
}

[data-tag-name=bbva-type-icon-link]:has([data-tag-name=bbva-type-icon]) {
  width: 2.5rem;
  height: 2.5rem;
  justify-content: center;
  align-items: center;
}
`;class Ut extends(f(i(_(a)))){static get is(){return"stock-information-bbva-trader-order-list"}static get scopedElements(){const t=[O,w,j,Z,it,q,tt,G,M,x,B,E,Ft,jt];return Ut.scopedElementsFromClasses(t)}static get properties(){return{errorTryNumber:{type:Number,attribute:"error-try-number"},filterListOption:{type:String,attribute:"filter-list-option"},filterModalConfig:{type:Object,attribute:"filter-modal-config"},maxNumberElementsPerPage:{type:Number,attribute:"max-number-elements-per-page"},orderListData:{type:Object,attribute:"order-list-data"},orderListError:{type:Boolean,attribute:"order-list-error"},orderListPaginationResponse:{type:Object,attribute:"order-list-pagination-response"},privateBankingPortfolioId:{type:String,attribute:"private-banking-portfolio-id"},scrollActivate:{type:Boolean,attribute:"scroll-activate"},showsSkeletonLoading:{type:Boolean,attribute:"shows-skeleton-loading"},_listOrderDataShow:{type:Array},_showNotificationMessage:{type:Boolean},_filterModalVisible:{type:Boolean},_retryErrorShow:{type:Boolean},_retryErrorConfig:{type:Object},_retriesConfig:{type:Object},renderFilterList:{type:Boolean,attribute:"render-filter-list"},_orderStatus:{type:String}}}static get styles(){return[I.primary,S.primary,A.primary,W.primary,et.primary,N.primary,J.primary,L.primary,k.primary,T.primary,D.primary,r("investment-list-shared-styles"),Ht]}constructor(){super(),this.ambient="primary",this.config={loader:{ambient:"primary"}},this.errorTryNumber=3,this.filterListOption="",this.filterModalConfig={},this.maxNumberElementsPerPage=20,this.orderListData={},this.orderListError=!1,this.privateBankingPortfolioId="",this.scrollActivate=!1,this.showsSkeletonLoading=!1,this._filterModalVisible=!1,this._getBalancesData={},this._showNotificationMessage=!1,this._listOrderDataShow=[],this._orderStatus="",this.renderFilterList=!1,this._retryErrorConfig={},this._retriesConfig={ORDERS_ERROR:0},this._retryErrorShow=!1}updated(t){var e;if(t.has("orderListData")&&0===Object.keys(this.orderListData).length&&(this._listOrderDataShow={},this.showsSkeletonLoading=!1,this._showNotificationMessage=!1),(t.has("orderListData")||t.has("orderListError"))&&this.orderListError&&this._getErrorModalConfig("ORDERS_ERROR"),t.has("orderListData")&&0===Object.keys(this._listOrderDataShow).length&&this.orderListData.detail&&(this._listOrderDataShow=this._getNElements(5),this._dispatchCustomEvent("stock-information-bbva-trader-update-order-list-initialize")),t.has("scrollActivate")&&this.scrollActivate){this.showsSkeletonLoading=!0;Pt((()=>this.handleScrollOrderList()),1e3)()}if(t.has("orderListData")&&this.scrollActivate&&null!==(e=this.orderListData)&&void 0!==e&&e.detail&&this.updateComplete.then((()=>{var t,e;this._listOrderDataShow={detail:null===(t=this._listOrderDataShow)||void 0===t||null===(e=t.detail)||void 0===e?void 0:e.concat(this.orderListData.detail)},this._dispatchCustomEvent("stock-information-bbva-trader-update-order-list-complete")})),t.has("renderFilterList")){const t=this.shadowRoot.querySelector('[data-tag-name="order-list-filter-modal"]');this._listOrderDataShow={},this.orderListData={},t.cleanRadioButtons()}}_checkOrderListNextPage(){var t,e;if(0===Object.keys(this.orderListPaginationResponse).length)return this.showsSkeletonLoading=!1,this._showNotificationMessage=!1,!1;const i=this.orderListPaginationResponse,a=(null==i||null===(t=i.links)||void 0===t?void 0:t.next)&&""!==(null==i||null===(e=i.links)||void 0===e?void 0:e.next),r=`&pageSize=${this.maxNumberElementsPerPage}`;if(a){if(i.links.next.includes("&pageSize=5")){var n,s;const t=null==i||null===(n=i.links)||void 0===n||null===(s=n.next)||void 0===s?void 0:s.replace("&pageSize=5",r);this.orderListPaginationResponse.links.next=t}return!0}return!1}_extractPaginationKey(){const t={},e=new URL(this.orderListPaginationResponse.links.next,"http://host.com"),i=new URLSearchParams(e.search);for(const[e,a]of i.entries())t[e]=a;return t}_getNElements(t){var e,i;const a=null===(e=this.orderListData)||void 0===e||null===(i=e.detail)||void 0===i?void 0:i.slice(0,t);return a.length?{detail:a}:{}}handleScrollOrderList(){this.showsSkeletonLoading=!0;if(this._checkOrderListNextPage()){const t=this._extractPaginationKey();this._dispatchCustomEvent("stock-information-bbva-trader-order-list-pagination-apply",{...t,pageSize:20,"securityAccount.id":`${this.privateBankingPortfolioId}`})}else this.showsSkeletonLoading=!1,this._showNotificationMessage=!0,this._dispatchCustomEvent("stock-information-bbva-trader-order-list-pagination-finalize")}get _renderLimitVisualization(){return n`
      ${this._showNotificationMessage?n`
            <bbva-notification-message
              class="message"
              variant="caution"
              message="stock-information-bbva-trader-order-list-limit-visualization"
              icon-close
              @notification-message-icon-click="${()=>{this._showNotificationMessage=!1}}"
            ></bbva-notification-message>
          `:h}
    `}get _renderFilterButton(){const t=[{icon:v(),label:"stock-information-bbva-trader-order-list-filter-orders",id:"button-1"}];return n`
      ${this.renderFilterList?n`
            <bbva-form-filter
              heading-level="0"
              .filters=${[{name:`${this.t(this.filterListOption)}`,removable:!0}]}
              clear-label="${this.t("stock-information-bbva-trader-edit")}"
              header-title=""
              editable-label=""
              @form-filter-clear-click="${this._filterIconClicked}"
              @form-filter-close-click="${()=>{const t=this.shadowRoot.querySelector('[data-tag-name="order-list-filter-modal"]');this._dispatchCustomEvent("stock-information-bbva-trader-order-list-retry-request"),this._dispatchCustomEvent("stock-information-bbva-trader-order-list-filter",!1),this.renderFilterList=!1,t.cleanRadioButtons()}}"
            ></bbva-form-filter>
          `:n`
            <div class="filter-row-button-container">
              <bbva-button-row
                .options="${t}"
                @button-row-item-click="${this._filterIconClicked}"
              ></bbva-button-row>
            </div>
          `}
    `}_filterIconClicked(t="order-list-filter-modal"){this.showsSkeletonLoading=!1,this._showNotificationMessage=!1;const e={id:t,headerInfoText:"stock-information-bbva-trader-order-list-filter-header",titleInfoText:"stock-information-bbva-trader-order-list-filter-title",buttonText:"stock-information-bbva-trader-order-list-filter-button-text",fixedFooter:!0};this.filterModalConfig=$t(e),this._filterModalVisible=!0}get _renderFilterModal(){return n`
      <order-list-filter-modal
        .visible="${this._filterModalVisible}"
        .modalConfig="${this.filterModalConfig}"
        @header-main-icon-click="${()=>{this._dispatchCustomEvent("stock-information-bbva-trader-order-list-filter",!1)}}"
        @stock-information-bbva-trader-order-list-filter-modal-close="${()=>{this._filterModalVisible=!1}}"
        @stock-information-bbva-trader-order-list-filter-modal-filter-select="${({detail:t})=>{this.renderFilterList=!0,this._filterModalVisible=!1,this._dispatchCustomEvent("stock-information-bbva-trader-order-list-filter",!0);this.filterListOption={PENDING:"stock-information-bbva-trader-order-list-status-map-pending",MONITORED:"stock-information-bbva-trader-order-detail-monitored",CANCELED:"stock-information-bbva-trader-order-detail-canceled",EXECUTED:"stock-information-bbva-trader-order-detail-executed"}[t]||""}}"
      >
      </order-list-filter-modal>
    `}_renderHeaderDate(t){return n`
      <bbva-header-category variant="date" text="${Mt(t)}"></bbva-header-category>
    `}_renderOrderListCard(t,e=!0){const i=[{icon:p(),label:"stock-information-bbva-trader-order-list-cancel-action"}],{operationDate:a,issuer:r,totalPrice:s,operationType:o,title:l,classification:d,id:c,status:b}=t,m="CANCELED"===b.id||"EXECUTED"===b.id?[]:i,h=l.quantityInCustody>0;return n`
        <div class="order-list-card-container">
          ${e?this._renderHeaderDate(a):""}
            <bbva-list-swipe
              .operativeActions="${m}"
              @list-swipe-action-click="${t=>{t.target.opening="",this._orderListActionTapHandler(c)}}"
            >
              <div slot="invoker">
                ${c?this._renderStockTextAmountList(c,r,s):""}
                ${o?this._renderTextLabel(o):""}
                ${l?this._renderTextLabel(l):""}
                ${d?this._renderTextLabel(d):""}
                ${c?this._renderTextLabel(c):""}
                ${b?this._renderOrderStatus(b,h):""}
              </div>
            </bbva-list-swipe>

          <div class="fit">
            <bbva-divider-default></bbva-divider-default>
          </div>
        </div>
      </bbva-type-link>
    `}_orderListTapHandler(t){this._dispatchCustomEvent("stock-information-bbva-trader-order-list-select",t),this._listOrderDataShow={},this._showNotificationMessage=!1,this.renderFilterList=!1}_orderListActionTapHandler(t){this._dispatchCustomEvent("stock-information-bbva-trader-cancel-order-request-submit",{cancel:!0,orderId:t}),this._listOrderDataShow={},this._showNotificationMessage=!1,this.renderFilterList=!1}_renderLoader(){const t=Array(3).fill(n`
      <bbva-type-text loading tag="span"></bbva-type-text>
      <bbva-type-text loading tag="span"></bbva-type-text>
    `);return n`${t}`}get _renderListCardContainer(){return n`
      <div id="scrollingList">
        <bbva-transition-container>
          ${this._showListData} ${this.showsSkeletonLoading?this._renderLoader():h}
        </bbva-transition-container>
      </div>
    `}get _showListData(){var t,e,i;const a=null===(t=this._listOrderDataShow)||void 0===t||null===(e=t.detail)||void 0===e?void 0:e.reduce(((t,e)=>{const i=null==e?void 0:e.operationDate;return t[i]||(t[i]=[]),t[i].push(e),t}),{});return null===(i=Object.keys(a??{}))||void 0===i?void 0:i.map((t=>{const e=a[t];return n` ${e.map(((t,e)=>this._renderOrderListCard(t,0===e)))} `}))}_renderStockTextAmountList(t,e,i){return n`
      <div class="assets-list-container">
        <bbva-type-link @click=${()=>this._orderListTapHandler(t)}>
          <bbva-type-text
            class="assets-list-item-text"
            tag="span"
            text="${null==e?void 0:e.name} ${null==e?void 0:e.id}"
            size="M"
            font-weight="500"
          ></bbva-type-text>
        </bbva-type-link>

        <bbva-type-amount
          variant="l"
          amount="${(null==i?void 0:i.amount)??0}"
          currency-code="${(null==i?void 0:i.currency)??""}"
          local-currency="${(null==i?void 0:i.currency)??""}"
          language="${this.language}"
        >
        </bbva-type-amount>
      </div>
    `}_renderTextLabel(t){return n`
      <div class="assets-list-container">
        <bbva-type-text
          tag="span"
          text="${this._dynamicLabelText(t)}"
          size="M"
          font-weight="300"
        ></bbva-type-text>

        <bbva-type-text
          tag="span"
          text="${this._dynamicNumberText(t)}"
          size="M"
          font-weight="300"
        ></bbva-type-text>
      </div>
    `}_dynamicLabelText(t){const e={PURCHASE:"stock-information-bbva-trader-order-list-operation-type",SALE:"stock-information-bbva-trader-order-list-operation-type",BOOK:"stock-information-bbva-trader-order-list-order-type",CONDITIONED:"stock-information-bbva-trader-order-list-order-type"};return null!=t&&t.id&&e[t.id]?e[t.id]:(null==t?void 0:t.quantityInCustody)>=0?"stock-information-bbva-trader-order-list-title-quantities":"stock-information-bbva-trader-order-list-invoice"}_dynamicNumberText(t){const e={PURCHASE:"stock-information-bbva-trader-order-list-status-purchase",SALE:"stock-information-bbva-trader-order-list-status-sale",BOOK:"stock-information-bbva-trader-order-list-status-book",CONDITIONED:"stock-information-bbva-trader-order-list-status-conditioned"};return null!=t&&t.id&&e[t.id]?e[t.id]:(null==t?void 0:t.quantity)>=0?t.quantity:t}_renderOrderStatus(t,e=!1){const{id:i}=t,a={CANCELED:{text:"stock-information-bbva-trader-order-list-canceled",class:"assets-order-status-cancelled"},MONITORED:{text:"stock-information-bbva-trader-order-list-monitored",class:"assets-order-status-monitored"},EXECUTED:{text:"stock-information-bbva-trader-order-list-executed",class:"assets-order-status-executed"},PENDING:{text:e?"stock-information-bbva-trader-order-list-pending-partially":"stock-information-bbva-trader-order-list-pending",class:""}},{text:r,class:s}=a[i]||{text:"",class:""};this._orderStatus=r;const o=g({"assets-order-status":!0,[s]:!!s});return n`
      <div class="assets-list-container">
        <bbva-type-text
          class="${o}"
          tag="span"
          text="${this._orderStatus}"
          size="M"
          font-style="italic"
          font-weight="300"
        ></bbva-type-text>
      </div>
    `}_getErrorModalConfig(t){const e={id:"order-list-error-retry-request",description:this._renderRetryErrorBody("stock-information-bbva-trader-order-list-error-modal-title","stock-information-bbva-trader-order-list-error-modal-retry"),buttonText:null==zt?void 0:zt.buttonText1},i={id:"order-list-error-retry-call",description:this._renderRetryErrorBody("stock-information-bbva-trader-order-list-error-modal-title","stock-information-bbva-trader-order-list-error-modal-exit-operative"),buttonText:null==zt?void 0:zt.buttonText2},a={headerErrorText:"stock-information-bbva-trader-order-list-common-error-header",panel:{microillustration:"error",microillustrationSize:"M"},..."ORDERS_ERROR"===t&&this._retriesConfig[t]<this.errorTryNumber?e:i};return this._retryErrorConfig=kt(a),this._retryErrorShow=!0,"ORDERS_ERROR"===t&&this._retriesConfig[t]<this.errorTryNumber&&(this._retriesConfig[t]+=1,this.requestUpdate("_retriesConfig")),this._retryErrorConfig}_renderRetryErrorBody(t,e){return n`
      <bbva-type-text tag="h3" alignment="left" size="L" font-weight="500" text="${t}">
      </bbva-type-text>
      <bbva-type-text tag="span" alignment="left" size="S" text="${e}"> </bbva-type-text>
    `}get _renderRetryCommonError(){return n`
      <retry-common-error
        no-padding
        .retryErrorConfig="${this._retryErrorConfig}"
        @stock-information-bbva-trader-order-list-error-retry-request="${()=>{this.showLoader(),this._retryErrorShow=!1,this._dispatchCustomEvent("stock-information-bbva-trader-order-list-retry-request")}}"
      >
      </retry-common-error>
    `}render(){return n`
      ${super.render()}
      ${this._retryErrorShow?this._renderRetryCommonError:n`
            <div class="order-list-container">
              ${this._renderFilterButton} ${this._renderListCardContainer}
              ${this._renderFilterModal}
              ${this.showsSkeletonLoading?h:this._renderLimitVisualization}
            </div>
          `}
    `}}customElements.define(Ut.is,Ut);var Yt=e`
:host {
  display: block;
  box-sizing: border-box;
  margin: 0;
  padding: 0;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.panel-container {
  display: flex;
  flex-direction: column;
  margin: 0;
  padding-top: 2rem;
  padding-right: 1rem;
  padding-bottom: 2rem;
  align-items: flex-start;
  justify-content: center;
}

.order-status {
  color: var(--colorsPrimaryCore, ${c(b.primaryCore)});
}

.order-detail-header {
  margin-top: 1rem;
}

.label-container {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: center;
  padding-top: 0.5rem;
}

.label-text-icon-container {
  display: flex;
  flex-direction: row;
  justify-content: space-evenly;
  align-items: center;
}

.padding-top-4 {
  padding-top: 0.25rem;
}

.padding-top-8 {
  padding-top: 0.5rem;
}

.space-between {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
}
`;class Xt extends(f(i(_(a)))){static get is(){return"stock-information-bbva-trader-order-detail"}static get scopedElements(){const t=[w,q,$,R,M,x,B,E,jt,Et];return Xt.scopedElementsFromClasses(t)}static get properties(){return{orderDetailError:{type:Boolean,attribute:"order-detail-error"},orderDetailData:{type:Object,attribute:"order-detail-data"},infoModalConfig:{type:Object,attribute:"info-modal-config"},mapperReason:{type:Object,attribute:"mapper-reason"},errorTryNumber:{type:Number,attribute:"error-try-number"},_infoModalVisible:{type:Boolean},_retryErrorConfig:{type:Object},_retryErrorShow:{type:Boolean},_retriesConfig:{type:Object}}}static get styles(){return[S.primary,N.primary,C.primary,L.primary,k.primary,T.primary,D.primary,r("product-detail-shared-styles"),Yt]}constructor(){super(),this.ambient="primary",this.config={loader:!0},this.errorTryNumber=3,this.infoModalConfig={},this.mapperReason={},this.orderDetailData={},this.orderDetailError=!1,this._infoModalVisible=!1,this._retryErrorShow=!1,this._retriesConfig={ORDER_ERROR:0},this._retryErrorConfig={}}updated(t){(t.has("orderDetailData")||t.has("orderDetailError"))&&this.orderDetailError&&this._getErrorModalConfig("ORDER_ERROR")}get _renderPanelOrderDetail(){var t,e,i,a,r,s,o,l,d,c,b,m,h,u,v,p;const g=(null===(t=this.orderDetailData)||void 0===t||null===(e=t.title)||void 0===e?void 0:e.quantityInCustody)>0;return n`
      <div class="panel-container">
        <bbva-type-text
          font-weight="500"
          text="${null===(i=this.orderDetailData)||void 0===i||null===(a=i.issuer)||void 0===a?void 0:a.name} ${null===(r=this.orderDetailData)||void 0===r||null===(s=r.issuer)||void 0===s?void 0:s.id}"
          size="L"
          tag="span"
          ?loading="${0===Object.keys(this.orderDetailData).length}"
        ></bbva-type-text>
        <div class="padding-top-4">
          <bbva-type-text
            font-weight="300"
            text="${"PURCHASE"===(null===(o=this.orderDetailData)||void 0===o||null===(l=o.operationType)||void 0===l?void 0:l.id)?this.t("stock-information-bbva-trader-order-detail-buy"):this.t("stock-information-bbva-trader-order-detail-sell")}"
            size="S"
            tag="span"
            ?loading="${0===Object.keys(this.orderDetailData).length}"
          ></bbva-type-text>
        </div>
        <div class="padding-top-8">
          <bbva-type-amount
            type="bold"
            amount="${(null===(d=this.orderDetailData)||void 0===d||null===(c=d.totalPrice)||void 0===c?void 0:c.amount)??0}"
            currency-code="${(null===(b=this.orderDetailData)||void 0===b||null===(m=b.totalPrice)||void 0===m?void 0:m.currency)??""}"
            local-currency="${(null===(h=this.orderDetailData)||void 0===h||null===(u=h.totalPrice)||void 0===u?void 0:u.currency)??""}"
            language="${this.language}"
            variant="3xl"
            tag="span"
            ?loading="${0===Object.keys(this.orderDetailData).length}"
          >
          </bbva-type-amount>
        </div>
        <div class="padding-top-8">
          <bbva-type-text
            class="order-status"
            font-weight="300"
            text="${this._dynamicStatusLabel(null===(v=this.orderDetailData)||void 0===v||null===(p=v.status)||void 0===p?void 0:p.id,g)}"
            size="S"
            tag="span"
            font-style="italic"
            ?loading="${0===Object.keys(this.orderDetailData).length}"
          ></bbva-type-text>
        </div>
      </div>
    `}_dynamicStatusLabel(t,e=!1){switch(t){case"PENDING":return e?"stock-information-bbva-trader-order-list-pending-partially":"stock-information-bbva-trader-order-detail-pending";case"EXECUTED":return"stock-information-bbva-trader-order-detail-executed";case"MONITORED":return"stock-information-bbva-trader-order-detail-monitored";case"CANCELED":return"stock-information-bbva-trader-order-detail-canceled";default:return""}}get _renderRowButtons(){var t,e,i,a;const r=[{icon:p(),label:"stock-information-bbva-trader-order-detail-cancel-action",id:"button-1"}];return n`
      ${"CANCELED"===(null===(t=this.orderDetailData)||void 0===t||null===(e=t.status)||void 0===e?void 0:e.id)||"EXECUTED"===(null===(i=this.orderDetailData)||void 0===i||null===(a=i.status)||void 0===a?void 0:a.id)?h:n`
            <bbva-button-row
              accessibility-text="${this.t("stock-information-bbva-trader-order-detail-accessibility-text-action")}"
              .options="${r}"
              @button-row-item-click="${t=>this._onRowButtonClicked(t.detail)}"
            ></bbva-button-row>
          `}
    `}_onRowButtonClicked(t){const{id:e}=this.orderDetailData??{};0===t&&this._orderListActionTapHandler(e)}_renderHeader(){return n`
      <div class="order-detail-header">
        <bbva-header-category
          variant="default"
          text="stock-information-bbva-trader-order-detail-header"
          link-accessibility-text="${this.t("stock-information-bbva-trader-order-detail-header")}"
        ></bbva-header-category>
      </div>
    `}get _renderOrderDetailContent(){const t=this.orderDetailData;if(!t||"object"!=typeof t||0===Object.keys(t).length)return h;const{id:e,classification:i,title:{quantity:a,quantityInCustody:r,pendingQuantity:s,objectivePrice:o,minimumPrice:l},operationDate:d,settlementDate:c,monitoredDays:b,status:m}=t,u={quantity:a,quantityInCustody:r,pendingQuantity:s},v={operationDate:d,settlementDate:c},p=[{objectivePrice:o},{minimumPrice:l}];return n`
      ${this._renderHeader()} ${this._renderTextLabel(e)} ${this._renderTextLabel(i)}
      ${(()=>Object.keys(u).map((t=>this._renderTextIconAmountLabel({[t]:u[t]}))))()} ${"CANCELED"===m.id?this._renderCancelMotive:h}
      ${(()=>Object.keys(v).map((t=>this._renderDateTextLabel({[t]:v[t]}))))()}
      ${"CONDITIONED"===(null==i?void 0:i.id)?this._renderConditionedInfo({monitoredDays:b},p):h}
    `}_renderConditionedInfo(t,e){return n`
      ${this._renderTextLabel(t)}
      ${Array.isArray(e)&&e.length>0&&e.map((t=>this._renderTextAmountLabel(t)))}
    `}_renderTextLabel(t){return n`
      <div class="space-between padding-top-8">
        <bbva-type-text size="S" tag="span" text="${this._dynamicLabelText(t)}"></bbva-type-text>
        <bbva-type-text
          text="${this._dynamicText(t)}"
          size="S"
          tag="span"
          ?loading="${0===Object.keys(this.orderDetailData).length}"
        ></bbva-type-text>
      </div>
    `}get _renderCancelMotive(){var t,e;const i=null===(t=this.orderDetailData)||void 0===t||null===(e=t.status)||void 0===e?void 0:e.reason;return this.mapperReason[i]?n`
      <div class="label-container ">
        <bbva-type-text
          size="S"
          tag="span"
          text="stock-information-bbva-trader-order-detail-cancel-motive-label"
        ></bbva-type-text>
        <bbva-type-text
          text="${this.mapperReason[i]}"
          size="S"
          tag="span"
          ?loading="${0===Object.keys(this.orderDetailData).length}"
        ></bbva-type-text>
      </div>
    `:""}_dynamicLabelText(t){var e,i;const a=[{check:"BOOK"===(null==t?void 0:t.id)||"CONDITIONED"===(null==t?void 0:t.id),translation:"stock-information-bbva-trader-order-detail-order-type"},{check:(null==t?void 0:t.quantity)>=0,translation:"stock-information-bbva-trader-order-detail-title-quantity"},{check:(null==t?void 0:t.quantityInCustody)>=0,translation:"stock-information-bbva-trader-order-detail-title-quantity-in-custody"},{check:(null==t?void 0:t.pendingQuantity)>=0&&"CANCELED"===(null===(e=this.orderDetailData)||void 0===e||null===(i=e.status)||void 0===i?void 0:i.id),translation:"stock-information-bbva-trader-order-detail-title-canceled-quantity"},{check:(null==t?void 0:t.pendingQuantity)>=0,translation:"stock-information-bbva-trader-order-detail-title-pending-quantity"},{check:(null==t?void 0:t.monitoredDays)>=0,translation:"stock-information-bbva-trader-order-detail-monitored-days"},{check:null==t?void 0:t.objectivePrice,translation:"stock-information-bbva-trader-order-detail-objective-price"},{check:null==t?void 0:t.minimumPrice,translation:"stock-information-bbva-trader-order-detail-minimum-price"}];for(const t of a)if(t.check)return t.translation;return"stock-information-bbva-trader-order-detail-folio"}_dynamicText(t){const e=[{check:"BOOK"===(null==t?void 0:t.id),value:"stock-information-bbva-trader-order-detail-limit"},{check:"CONDITIONED"===(null==t?void 0:t.id),value:"stock-information-bbva-trader-order-detail-conditioned"},{check:(null==t?void 0:t.quantity)>=0,value:t.quantity},{check:(null==t?void 0:t.quantityInCustody)>=0,value:t.quantityInCustody},{check:(null==t?void 0:t.pendingQuantity)>=0,value:t.pendingQuantity},{check:(null==t?void 0:t.monitoredDays)>=0,value:t.monitoredDays}];for(const t of e)if(t.check)return t.value;return t}_renderTextIconAmountLabel(e){const i=Object.keys(e)[0].replace(/([A-Z])/g," $1").replace(/^./,(t=>t.toUpperCase()));return n`
      <div class="label-container">
        <div class="label-text-icon-container">
          <bbva-type-text
            text="${this._dynamicLabelText(e)}"
            size="S"
            tag="span"
            ?loading="${0===Object.keys(this.orderDetailData).length}"
          ></bbva-type-text>
          <bbva-type-link
            @click="${()=>this._infoModal(e)}"
            aria-label="${i}"
            variant="icon"
            icon="${t()}"
          >
          </bbva-type-link>
        </div>
        <bbva-type-text
          text="${this._dynamicText(e)}"
          size="S"
          tag="span"
          ?loading="${0===Object.keys(this.orderDetailData).length}"
        ></bbva-type-text>
      </div>
    `}_renderDateTextLabel(t){var e;const i=null===(e=Object.keys(t))||void 0===e?void 0:e[0],a={id:i,date:t[i]};return n`
      <div class="label-container">
        <bbva-type-text
          size="S"
          tag="span"
          text="${"operationDate"===a.id?"stock-information-bbva-trader-order-detail-operation-date":"stock-information-bbva-trader-order-detail-settlement-date"}"
          ?loading="${0===Object.keys(this.orderDetailData).length}"
        ></bbva-type-text>
        <bbva-type-text
          text="${function(t,e="DD MM YYYY"){var i,a;return null===(i=Rt(t))||void 0===i||null===(a=i.format(e))||void 0===a?void 0:a.replace(" ","/").replace(" ","/")}(a.date)}"
          size="S"
          tag="span"
          ?loading="${0===Object.keys(this.orderDetailData).length}"
        ></bbva-type-text>
      </div>
    `}_renderTextAmountLabel(t){var e,i,a;const r=Object.keys(t)[0];return n`
      <div class="label-container">
        <bbva-type-text size="S" tag="span" text="${this._dynamicLabelText(t)}"></bbva-type-text>
        <bbva-type-amount
          variant="m"
          amount="${(null===(e=t[r])||void 0===e?void 0:e.amount)??0}"
          currency-code="${(null===(i=t[r])||void 0===i?void 0:i.currency)??""}"
          local-currency="${(null===(a=t[r])||void 0===a?void 0:a.currency)??""}"
          language="${this.language}"
          ?loading="${0===Object.keys(this.orderDetailData).length}"
        >
        </bbva-type-amount>
      </div>
    `}_infoModal(t){var e,i;const a=Object.keys(t)[0],r={id:a,amount:t[a]},n={quantity:{headerInfoText:"stock-information-bbva-trader-order-detail-modal-header",titleInfoText:this._titleInfoLabelText(r.id),description:this._renderModalInfoBody(r.id)},quantityInCustody:{headerInfoText:"stock-information-bbva-trader-product-detail-info-modal-header",titleInfoText:this._titleInfoLabelText(r.id),description:this._renderModalInfoBody(r.id)},default:{headerInfoText:"stock-information-bbva-trader-product-detail-info-modal-header",titleInfoText:this._titleInfoLabelText(r.id),description:this._renderModalInfoBody(r.id)},canceled:{headerInfoText:"stock-information-bbva-trader-order-detail-modal-header",titleInfoText:"stock-information-bbva-trader-order-detail-title-canceled-quantity",description:this._renderModalInfoBody("canceled")}};let s;s="quantity"===r.id||"quantityInCustody"===r.id?n[r.id]:"CANCELED"===(null===(e=this.orderDetailData)||void 0===e||null===(i=e.status)||void 0===i?void 0:i.id)?n.canceled:n.default,this.infoModalConfig=_t({id:r.id,...s}),this._infoModalVisible=!0}_titleInfoLabelText(t){return{quantity:"stock-information-bbva-trader-order-detail-title-quantity",quantityInCustody:"stock-information-bbva-trader-order-detail-title-quantity-in-custody",pendingQuantity:"stock-information-bbva-trader-order-detail-title-pending-quantity"}[t]||""}_renderModalInfoBody(t){const e=this._modalBodyText(t);return n`
      <bbva-type-text tag="span" alignment="left" size="S" text="${e}">
      </bbva-type-text>
    `}_modalBodyText(t){return{quantity:"stock-information-bbva-trader-order-detail-modal-title-quantities",quantityInCustody:"stock-information-bbva-trader-order-detail-modal-title-quantity-in-custody",pendingQuantity:"stock-information-bbva-trader-order-detail-modal-title-pending-quantity",canceled:"stock-information-bbva-trader-order-detail-cancel-modal-description"}[t]||""}get _renderInfoModals(){return n`
      <stocks-info-modal
        .visible="${this._infoModalVisible}"
        .modalConfig="${this.infoModalConfig}"
        @stock-information-bbva-trader-info-modal-close="${()=>{this._infoModalVisible=!1}}"
      >
      </stocks-info-modal>
    `}_orderListActionTapHandler(t){this._dispatchCustomEvent("stock-information-bbva-trader-cancel-order-request-submit",{cancel:!0,orderId:t})}_getErrorModalConfig(t){const e={id:"order-detail-error-retry-request",description:this._renderModalErrorBody("stock-information-bbva-trader-order-detail-error-modal-title","stock-information-bbva-trader-order-detail-error-modal-retry"),buttonText:"stock-information-bbva-trader-order-detail-retry-button"},i={id:"order-detail-error-retry-call",description:this._renderModalErrorBody("stock-information-bbva-trader-order-detail-error-modal-title","stock-information-bbva-trader-order-detail-error-modal-exit-operative"),buttonText:"stock-information-bbva-trader-order-detail-exit-button"},a={..."ORDER_ERROR"===t&&this._retriesConfig[t]<this.errorTryNumber?e:i};return this._retryErrorConfig=kt(a),this._retryErrorShow=!0,"ORDER_ERROR"===t&&this._retriesConfig[t]<this.errorTryNumber&&(this._retriesConfig[t]+=1,this.requestUpdate("_retriesConfig")),this._retryErrorConfig}_renderModalErrorBody(t,e){return n`
      <bbva-type-text
        class="error-text-title"
        tag="h3"
        alignment="left"
        size="L"
        font-weight="500"
        text="${t}"
      >
      </bbva-type-text>
      <bbva-type-text class="error-text" tag="span" alignment="left" size="S" text="${e}">
      </bbva-type-text>
    `}get _renderRetryCommonError(){return n`
      <retry-common-error
        no-padding
        .retryErrorConfig="${this._retryErrorConfig}"
        @stock-information-bbva-trader-order-detail-error-retry-request="${()=>{this.showLoader(),this._retryErrorShow=!1,this._dispatchCustomEvent("stock-information-bbva-trader-order-detail-retry-request")}}"
      >
      </retry-common-error>
    `}render(){return n`
      ${super.render()}
      ${this._retryErrorShow?this._renderRetryCommonError:n`
            ${this._renderPanelOrderDetail} ${this._renderRowButtons}
            ${this._renderOrderDetailContent} ${this._renderInfoModals}
          `}
    `}}customElements.define(Xt.is,Xt);var Kt=e`
.results-container {
  display: flex;
  flex-direction: column;
  justify-content: center;
  margin: 1rem 0 0.5rem 0;
}

[data-tag-name=bbva-divider-default] {
  margin: 0.5rem 0;
}

.no-content {
  margin-top: 5rem;
}

.no-content-container {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: flex-start;
  gap: 0.5rem;
}

.no-content-container [data-tag-name=bbva-type-link] {
  margin-top: 1rem;
}

.error-container {
  margin-top: 3rem;
}

.content-footer-error {
  padding: 0 1rem;
  margin-bottom: 1.5rem;
}
`;class Qt extends(f(i(_(a)))){static get is(){return"stocks-searching-modal"}static get scopedElements(){const t=[F,z,j,lt,$,B,E];return Qt.scopedElementsFromClasses(t)}static get properties(){return{maxCharacters:{type:Number,attribute:"max-characters"},modalConfig:{type:Object,attribute:"modal-config"},searchingError:{type:Boolean,attribute:"searching-error"},searchingResponse:{type:Object,attribute:"searching-response"},visible:{type:Boolean},_contentOption:{type:String},_debounceTimeout:{type:Number,attribute:!1},_searchingResults:{type:Array},_shouldRenderList:{type:Boolean}}}constructor(){super(),this.ambient="primary",this.maxCharacters=1,this.modalConfig={},this.searchingError=!1,this.searchingResponse=null,this.visible=!1,this._contentOption="",this._searchingResults=[],this._shouldRenderList=!1,this.addEventListener("stock-information-bbva-trader-searching-modal-close",this._resetInput)}updated(t){super.updated(t),t.has("searchingResponse")&&null!==this.searchingResponse&&this.manageSearchingResponse(this.searchingResponse),t.has("searchingError")&&this.searchingError&&(this._contentOption="error")}static get styles(){return[V.primary,P.primary,A.primary,ot.primaryAlt,T.primary,D.primary,r("stocks-searching-modal-shared-styles"),Kt]}_reset(){this.searchingResponse=null,this._contentOption="",this._searchingResults=[],this._shouldRenderList=!1}_resetInput(){this._reset();const t=this.shadowRoot.getElementById("searchInput");t&&(t.value="")}get _renderModal(){var t,e,i;return n`
      <bbva-help-modal
        full-height
        hide-content-padding-top
        header-text="${null===(t=this.modalConfig)||void 0===t?void 0:t.headerText}"
        ?visible="${this.visible}"
        ?fixed-footer="${null===(e=this.modalConfig)||void 0===e?void 0:e.fixedFooter}"
        header-close-icon-aria-label="${this.t(null===(i=this.modalConfig)||void 0===i?void 0:i.ariaLabelCloseButton)}"
        @help-modal-close="${()=>{this._dispatchCustomEvent("stock-information-bbva-trader-searching-modal-close")}}"
      >
        <div class="content-modal" slot="slot-content">${this._renderModalBody}</div>
        ${"error"===this._contentOption?n`
                <div class="content-footer-error" slot="slot-footer">
                  <bbva-button-default
                    fullwidth
                    text="stock-information-bbva-trader-error-retry-button"
                    @click=${()=>this._dispatchCustomEvent("stock-information-bbva-trader-searching-modal-retry")}
                  >
                  </bbva-button-default>
                </div>
              `:h}
        </div>
      </bbva-help-modal>
    `}get _renderModalBody(){return n`
      <bbva-form-input
        id="searchInput"
        ambient="primary-alt"
        mode-input="text"
        type="text"
        label="stock-information-bbva-trader-searching-placeholder"
        clear-accessible-text="${this.t("stock-information-bbva-trader-text-accessibility-clear-button")}"
        @form-input-value-change="${this.handleInputValueChange}"
      ></bbva-form-input>
      <div class="content-body">${this._renderOptionContent(this._contentOption)}</div>
    `}async handleInputValueChange({detail:t}){const{value:e}=t;this._debounceTimeout&&clearTimeout(this._debounceTimeout),e.length>=this.maxCharacters?this._debounceTimeout=setTimeout((()=>{this._dispatchCustomEvent("stock-information-bbva-trader-searching-modal-find",e),this._debounceTimeout=null}),600):(this._reset(),this._dispatchCustomEvent("stock-information-bbva-trader-searching-modal-value-clear"))}manageSearchingResponse(t){t&&t.length>0&&(this._shouldRenderList=!0,this._contentOption="list",this._searchingResults=t),"object"!=typeof t||Object.keys(t).length||(this._contentOption="no-content")}_renderOptionContent(t){const e={list:()=>{var t;return null===(t=this._searchingResults)||void 0===t?void 0:t.map((t=>this._renderList(t)))},"no-content":()=>n` <div class="no-content">${this._renderNoContent()}</div> `,error:()=>this._renderErrorConfig()};return"no-content"===t||"error"===t?(this._shouldRenderList=!1,e[t]()):e[t]?e[t]():h}_renderList(t){return n`
      <div class="results-container">
        <bbva-type-link @click="${()=>this._manageInvestmentDetailNavigation(t)}">
          ${t.businessName} - ${t.name}
        </bbva-type-link>
        <bbva-divider-default></bbva-divider-default>
      </div>
    `}_manageInvestmentDetailNavigation(t){this._dispatchCustomEvent("stock-information-bbva-trader-manage-investment-detail-navigate",t)}_renderNoContent(){return n`
      <div class="no-content-container">
        <bbva-clip-microillustration
          alt-microillustration="empty_state_day"
          alt-image="Emptystateday"
          size="M"
        ></bbva-clip-microillustration>
        <bbva-type-text
          tag="h2"
          size="XL"
          text="stock-information-bbva-trader-searching-no-content-title"
          font-weight="500"
        ></bbva-type-text>
        <bbva-type-text
          tag="span"
          text="stock-information-bbva-trader-searching-no-content-text"
        ></bbva-type-text>
      </div>
    `}_renderErrorConfig(){return n`
      <div class="error-container">
        <bbva-clip-microillustration
          alt-microillustration="error"
          alt-image="Error"
          size="M"
        ></bbva-clip-microillustration>
        <bbva-type-text
          tag="span"
          size="M"
          text="stock-information-bbva-trader-searching-error-title"
          font-weight="500"
        ></bbva-type-text>
        <bbva-type-text
          tag="span"
          size="S"
          text="stock-information-bbva-trader-searching-error-text"
        ></bbva-type-text>
      </div>
    `}render(){return n` ${this._renderModal} `}}customElements.define(Qt.is,Qt);const Wt={noContentGraph:"stock-information-bbva-trader-investment-detail-no-content-graph",noContentGraphSecText:"stock-information-bbva-trader-investment-detail-no-content-graph-secondary-text"};var Zt=e`
:host {
  display: block;
  box-sizing: border-box;
  margin: 0;
  padding: 0;
  --gridSpacerVariant: 0;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-panel-container] {
  margin: var(--gridSpacerVariant);
}

[data-tag-name=bbva-panel-container]::part(container-panel) {
  margin: 0;
  padding: 2rem 1rem;
}

[data-tag-name=bbva-panel-container]::part(container-panel-number) {
  padding-top: 0.25rem;
}

[data-tag-name=bbva-panel-container]::part(container-panel-last-price) {
  display: flex;
  align-items: center;
  padding-top: 0.5rem;
}

[data-tag-name=bbva-panel-container]::part(container-panel-day-performance) {
  display: flex;
  align-items: center;
  padding-top: 8px;
}

[data-tag-name=bbva-button-row] {
  width: 100%;
  --gridSpacerVariant: 8;
}

.list-container {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: center;
}

.list-item {
  display: flex;
  flex-direction: row;
  justify-content: space-evenly;
  align-items: center;
  margin-bottom: 0.5rem;
}

.row-buttons {
  display: flex;
  flex-direction: row;
  margin-bottom: 1rem;
}

.investment-detail-list-header {
  margin-bottom: 1rem;
  margin-top: 1.5rem;
}
.investment-detail-list-header.prices {
  margin-top: 0;
}

.investment-detail-list-prices {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: center;
  margin-bottom: 1rem;
}

.investment-detail-list-prices :first-child {
  flex: 1;
}

.invest-graph-price {
  display: flex;
  align-items: flex-start;
  flex-direction: column;
}

.items-center {
  display: flex;
  align-items: center;
}
`;class Jt extends(f(i(_(a)))){static get is(){return"stock-information-bbva-trader-investment-detail"}static get scopedElements(){const t=[O,mt,w,z,ct,j,q,$,G,R,M,x,B,E,U,Et];return Jt.scopedElementsFromClasses(t)}static get properties(){return{businessName:{type:String,attribute:"business-name"},buttonGroupSelected:{type:Number,attribute:"button-group-selected"},clientType:{type:String,attribute:"client-type"},frequencyInX:{type:Number,attribute:"frequency-in-x"},graphData:{type:Array,attribute:"graph-data"},getBalancesData:{type:Object,attribute:"get-balances-data"},isIntradayGraphEmpty:{type:Boolean,attribute:"is-intraday-graph-empty"},issuerData:{type:Object,attribute:"issuer-data"},issuerNameAndDescription:{type:String,attribute:"issuer-name-and-description"},languageGraph:{type:Object,attribute:"language-graph"},investmentDetailData:{type:Object,attribute:"investment-detail-data"},issuerNotFound:{type:Boolean,attribute:"issuer-not-found"},priceDateGraphData:{type:Object,attribute:"price-date-graph-data"},priceType:{type:Object,attribute:"price-type"},purchaseData:{type:Object,attribute:"purchase-data"},saleData:{type:Object,attribute:"sale-data"},selectedElementGraph:{type:Number,attribute:"selected-element-graph"},securityIssuerId:{type:String,attribute:"security-issuer-id"},specificAmountsId:{type:Object,attribute:"specific-amounts-id"},timeFrequency:{type:Object,attribute:"time-frequency"},dataGraphInvestmentDetail:{type:Array,attribute:"data-graph-investment-detail"},_infoModalConfig:{type:Object},_infoModalVisible:{type:Boolean},_formatLegendGraph:{type:String},_historicGraph:{type:Boolean},gmtTime:{type:Number,attribute:"gmt-time"}}}static get styles(){return[I.primary,bt.primary,S.primary,P.primary,dt.primary,A.primary,N.primary,C.primary,L.primary,k.primary,T.primary,D.primary,H.primary,r("investment-detail-shared-styles"),Zt]}constructor(){super(),this.ambient="primary",this.config={loader:{ambient:"primary"}},this.businessName="",this.buttonGroupSelected=1,this.config={loader:!0},this.clientType="",this.dataGraphInvestmentDetail=[],this.frequencyInX=2,this.getBalancesData={},this.graphData=[],this.investmentDetailData={},this.isIntradayGraphEmpty=!1,this.issuerData={},this.issuerNameAndDescription="",this.languageGraph={},this.priceDateGraphData={},this.priceType={},this.purchaseData={},this.saleData={},this.securityIssuerId="",this.selectedElementGraph=0,this.specificAmountsId={},this.timeFrequency={},this._formatLegendGraph="%X",this._historicGraph=!1,this._infoModalConfig={},this._infoModalVisible=!1,this.gmtTime=0}async firstUpdated(){super.firstUpdated(),this._graphUI=this.shadowRoot.querySelector("#graph"),await this.updateComplete,this.languageGraph={date:"%d/%m/%Y",time:"%H:%M",periods:["AM","PM"],days:[this.t("stock-information-bbva-trader-graph-sunday"),this.t("stock-information-bbva-trader-graph-moday"),this.t("stock-information-bbva-trader-graph-tuesday"),this.t("stock-information-bbva-trader-graph-wednesday"),this.t("stock-information-bbva-trader-graph-thursday"),this.t("stock-information-bbva-trader-graph-friday"),this.t("stock-information-bbva-trader-graph-saturday")],shortDays:[this.t("stock-information-bbva-trader-graph-sunday-short"),this.t("stock-information-bbva-trader-graph-moday-short"),this.t("stock-information-bbva-trader-graph-tuesday-short"),this.t("stock-information-bbva-trader-graph-wednesday-short"),this.t("stock-information-bbva-trader-graph-thursday-short"),this.t("stock-information-bbva-trader-graph-friday-short"),this.t("stock-information-bbva-trader-graph-saturday-short")],months:[this.t("stock-information-bbva-trader-graph-january"),this.t("stock-information-bbva-trader-graph-february"),this.t("stock-information-bbva-trader-graph-march"),this.t("stock-information-bbva-trader-graph-april"),this.t("stock-information-bbva-trader-graph-may"),this.t("stock-information-bbva-trader-graph-june"),this.t("stock-information-bbva-trader-graph-july"),this.t("stock-information-bbva-trader-graph-august"),this.t("stock-information-bbva-trader-graph-september"),this.t("stock-information-bbva-trader-graph-october"),this.t("stock-information-bbva-trader-graph-november"),this.t("stock-information-bbva-trader-graph-december")],shortMonths:[this.t("stock-information-bbva-trader-graph-january-short"),this.t("stock-information-bbva-trader-graph-february-short"),this.t("stock-information-bbva-trader-graph-march-short"),this.t("stock-information-bbva-trader-graph-april-short"),this.t("stock-information-bbva-trader-graph-may-short"),this.t("stock-information-bbva-trader-graph-june-short"),this.t("stock-information-bbva-trader-graph-july-short"),this.t("stock-information-bbva-trader-graph-august-short"),this.t("stock-information-bbva-trader-graph-september-short"),this.t("stock-information-bbva-trader-graph-october-short"),this.t("stock-information-bbva-trader-graph-november-short"),this.t("stock-information-bbva-trader-graph-december-short")]}}updated(t){super.updated(t),t.has("dataGraphInvestmentDetail")&&(this.showLoader(),this._loadGraphData()),t.has("purchaseData")&&Object.keys(this.purchaseData).length>0&&(this.showLoader(),this._managePurchaseData())}resetProperties(){this.buttonGroupSelected=0,this.dataGraphInvestmentDetail=[],this.frequencyInX=2,this.priceDateGraphData={},this._formatLegendGraph="%X",this._historicGraph=!1}_getSpecificAmountInvestmentDetail(t){var e,i,a,r;return(null===(a=((null===(e=this.investmentDetailData)||void 0===e||null===(i=e.dataIssuer)||void 0===i?void 0:i.specificAmounts)??[]).find((e=>(null==e?void 0:e.id)===t)))||void 0===a||null===(r=a.amounts)||void 0===r?void 0:r[0])??{}}get _renderPanelDetail(){var t,e,i,a;const r=this._getSpecificAmountInvestmentDetail(null===(t=this.specificAmountsId)||void 0===t?void 0:t.lastPrice),s=this._getSpecificAmountInvestmentDetail(null===(e=this.specificAmountsId)||void 0===e?void 0:e.dayPerformancePercent),o=(null===(i=this._getSpecificAmountInvestmentDetail(null===(a=this.specificAmountsId)||void 0===a?void 0:a.tendency))||void 0===i?void 0:i.amount)??"0";return n`
      <bbva-panel-container variant="card" panel-color="primary-alt">
        <div part="container-panel">
          <bbva-type-text
            font-weight="500"
            text="${this.businessName}"
            size="L"
            tag="span"
            ?loading="${""===this.businessName}"
          ></bbva-type-text>
          <div part="container-panel-number">
            <bbva-type-text
              font-weight="350"
              font-style="italic"
              text="${this.issuerNameAndDescription}"
              size="S"
              tag="span"
              ?loading="${""===this.issuerNameAndDescription}"
            ></bbva-type-text>
          </div>
          <div part="container-panel-last-price">
            <bbva-type-amount
              type="bold"
              amount="${(null==r?void 0:r.amount)??0}"
              currency-code="${(null==r?void 0:r.currency)??""}"
              local-currency="${(null==r?void 0:r.currency)??""}"
              language="${this.language}"
              variant="3xl"
              tag="span"
              ?loading="${0===Object.keys(this.investmentDetailData).length}"
            >
            </bbva-type-amount>
            ${"0"===o?n`
                  <bbva-badge-variability
                    color="warning"
                    status="no-change"
                  ></bbva-badge-variability>
                `:h}
            ${"1"===o?n` <bbva-badge-variability color="success"></bbva-badge-variability> `:h}
            ${"2"===o?n`
                  <bbva-badge-variability color="error" status="decrease"></bbva-badge-variability>
                `:h}
          </div>
          <div part="container-panel-day-performance">
            <bbva-type-amount
              type="light"
              amount="${s.amount}"
              symbol="%"
              language="${this.language}"
              ?loading="${0===Object.keys(this.investmentDetailData).length}"
            >
            </bbva-type-amount>
          </div>
        </div>
      </bbva-panel-container>
    `}get _renderLastUpdate(){var t;const{lastUpdateDate:e,lastUpdateTime:i}=(null===(t=this.investmentDetailData)||void 0===t?void 0:t.dataIssuer)??{};return n`
      <div class="list-container">
        <div class="list-item">
          <bbva-type-text
            text="stock-information-bbva-trader-investment-detail-last-update"
            size="S"
            tag="span"
          ></bbva-type-text>
        </div>
        <bbva-type-text
          text="${function(t,e=0){var i;const a=Rt(t,!0).subtract(e,"hours"),r=Rt().utcOffset()/60;return null===(i=a.add(r,"hours").format("DD MM YY HH:mm"))||void 0===i?void 0:i.replace(" ","/").replace(" ","/")}(`${e}T${i}`,this.gmtTime)}"
          size="S"
          tag="span"
          ?loading="${0===Object.keys(this.investmentDetailData).length}"
        ></bbva-type-text>
      </div>
    `}get _renderInvestmentPrices(){return n`
      <div class="investment-detail-list-header prices">
        <bbva-header-category
          variant="default"
          heading-level="2"
          text="stock-information-bbva-trader-investment-detail-prices-list-header"
          link-accessibility-text="${this.t("stock-information-bbva-trader-investment-detail-prices-list-header")}"
        ></bbva-header-category>
      </div>
      ${Object.keys(this.investmentDetailData).length?this._renderTextAmount():h}
    `}_renderTextAmount(){const{maxDay:t,minDay:e,previousClose:i}=this.specificAmountsId,a=[t,e,i],r=null==a?void 0:a.map((t=>{const e=this._getSpecificAmountInvestmentDetail(t);return n`
        <div class="investment-detail-list-prices">
          <bbva-type-text
            text="${this._dynamicLabelText(t)}"
            size="S"
            tag="span"
            font-weight="350"
          ></bbva-type-text>
          <bbva-type-amount
            variant="m"
            amount="${e.amount??0}"
            currency-code="${e.currency??""}"
            local-currency="${e.currency??""}"
            language="${this.language}"
          >
          </bbva-type-amount>
        </div>
      `}));return n` ${r} `}_dynamicLabelText(t){switch(t){case"maxDay":return"stock-information-bbva-trader-investment-detail-max-price";case"minDay":return"stock-information-bbva-trader-investment-detail-min-price";case"prevClosing":return"stock-information-bbva-trader-investment-detail-closing-price";default:return""}}get _renderRowButtons(){const t={execute:[{icon:s(),label:"stock-information-bbva-trader-investment-list-buy-stocks",id:"button-1"},...this.issuerNotFound?[]:[{icon:m(),label:"stock-information-bbva-trader-investment-list-sell-stocks",id:"button-2"}]],advice:[{icon:m(),label:"stock-information-bbva-trader-investment-list-sell-stocks",id:"button-2"}]},e="ADVISED"===this.clientType?t.advice:t.execute;return n`
      <div class="row-buttons">
        <bbva-button-row
          variant="simple"
          accessibility-text="${this.t(null==Wt?void 0:Wt.availableSections)}"
          .options="${e}"
          @button-row-item-click="${t=>this._onRowButtonClicked(t.detail,this.securityIssuerId,this.issuerData)}"
        ></bbva-button-row>
      </div>
    `}_onRowButtonClicked(t,e,i){const a=0===t&&"EXECUTED"===this.clientType;0!==t&&1!==t||this._dispatchCustomEvent("stock-information-bbva-trader-purchase-and-sale-request-submit",{issuerId:e,bmeIssuerData:i,buy:a})}get _renderInvestmentGraphPrice(){const{datePanel:t=null,pricePanel:e=null}=this.priceDateGraphData||{};return n`
      <div class="invest-graph-price">
        <bbva-type-text
          text="stock-information-bbva-trader-investment-detail-graph-title"
          size="S"
          tag="span"
          ?hidden="${this.isIntradayGraphEmpty}"
        ></bbva-type-text>
        <bbva-type-amount
          type="bold"
          amount="${(null==e?void 0:e.amount)??0}"
          currency-code="${(null==e?void 0:e.currency)??""}"
          local-currency="${(null==e?void 0:e.currency)??""}"
          language="${this.language}"
          variant="2xl"
          tag="span"
          ?hidden="${this.isIntradayGraphEmpty}"
        >
        </bbva-type-amount>
        <bbva-type-text
          tag="p"
          text="${t}"
          size="S"
          ?hidden="${this.isIntradayGraphEmpty}"
        ></bbva-type-text>
      </div>
      ${this.isIntradayGraphEmpty?this._renderNoContentGraph:h}
    `}get _renderGraph(){return n`
      <bbva-data-visualization-linear
        id="graph"
        height="250"
        chart-type="lines"
        format-legend="${this._formatLegendGraph}"
        margins-chart='{"top":0,"right":0,"bottom":16,"left":0}'
        show-horizontal-axis
        show-marker
        hide-y-axis
        hide-dots
        ?loading="${this.isIntradayGraphEmpty}"
        .language="${this.languageGraph}"
        .numPointsXaxis="${this.frequencyInX}"
        .data="${this.graphData}"
        selected="${this.selectedElementGraph}"
        @data-visualization-lines-drag="${this._handleDataLines}"
      ></bbva-data-visualization-linear>
    `}get _renderNoContentGraph(){return n`
      <bbva-clip-microillustration
        alt-microillustration="empty_state_day"
        alt-image="Emptystateday"
        size="M"
      ></bbva-clip-microillustration>
      <bbva-type-text
        text="${null==Wt?void 0:Wt.noContentGraph}"
        size="S"
        tag="span"
        alignment="center"
      ></bbva-type-text>
      <bbva-type-text
        text="${null==Wt?void 0:Wt.noContentGraphSecText}"
        size="XS"
        tag="span"
        alignment="center"
        ambient-color="secondary500"
      ></bbva-type-text>
    `}async _loadGraphData(){1===this.dataGraphInvestmentDetail.length&&(this.frequencyInX=1),await this.updateComplete;const t=this._historicGraph?this._getHistoricGraphData():this._getIntradayGraphData();this.graphData=[{color:"#49A5E6",data:t}],this.isIntradayGraphEmpty=!(t&&t.length>0),this.selectedElementGraph=t&&t.length>0?t.length-1:0,this.clearLoader(),this._dispatchCustomEvent("stock-information-bbva-trader-investment-detail-graph-loaded")}_getIntradayGraphData(){var t;return null===(t=this.dataGraphInvestmentDetail)||void 0===t?void 0:t.map((t=>{var e,i,a,r;const n=`${function(){const t=new Date;return Rt(t).format("YYYY-MM-DD")}()}T${((t,e=0)=>{const i=Rt(t,"HHmmss").subtract(e,"hours"),a=Rt().utcOffset()/60;return i.add(a,"hours").format("HH:mm")})(null==t?void 0:t.operationTime,this.gmtTime)}`,s=(null==t||null===(e=t.specificAmounts)||void 0===e||null===(i=e.find((t=>{var e;return(null==t?void 0:t.id)===(null===(e=this.specificAmountsId)||void 0===e?void 0:e.closePrice)})))||void 0===i||null===(a=i.amounts)||void 0===a||null===(r=a[0])||void 0===r?void 0:r.amount)??0;return{date:Date.parse(new Date(n)),value:Number(s)}}))}_getHistoricGraphData(){var t;return null===(t=this.dataGraphInvestmentDetail)||void 0===t?void 0:t.map((t=>{var e,i,a,r;const n=function(t){return Rt(t).valueOf()}(null==t?void 0:t.operationDate),s=null==t||null===(e=t.specificAmounts)||void 0===e||null===(i=e.find((t=>{var e;return(null==t?void 0:t.id)===(null===(e=this.specificAmountsId)||void 0===e?void 0:e.closingPrice)})))||void 0===i||null===(a=i.amounts)||void 0===a||null===(r=a[0])||void 0===r?void 0:r.amount;return{date:n,value:Number(s)}}))}_handleDataLines({detail:t}){var e,i,a,r,n;const{date:s,value:o,selected:l}=t,d=o,c=null===(e=this.dataGraphInvestmentDetail)||void 0===e?void 0:e[l],b=null==c||null===(i=c.specificAmounts)||void 0===i||null===(a=i.find((t=>{var e;return(null==t?void 0:t.id)===(null===(e=this.specificAmountsId)||void 0===e?void 0:e.maxPrice)})))||void 0===a||null===(r=a.amounts)||void 0===r||null===(n=r[0])||void 0===n?void 0:n.currency,m=this._historicGraph?Mt(s,"D MMM YYYY"):Rt(s).format("D MMM YYYY [a las] H:mm");this.priceDateGraphData={pricePanel:{amount:d,currency:b},datePanel:m}}get _renderRowButtonsDate(){return n`
      <bbva-button-group
        selected="${this.buttonGroupSelected}"
        type="radio"
        has-ellipsis
        link="-"
        .items="${[{text:"stock-information-bbva-trader-investment-detail-button-row-date-day",value:"daily"},{text:"stock-information-bbva-trader-investment-detail-button-row-date-week",value:"daily"},{text:"stock-information-bbva-trader-investment-detail-button-row-date-month",value:"weekly"},{text:"stock-information-bbva-trader-investment-detail-button-row-date-current-year",value:"monthly"},{text:"stock-information-bbva-trader-investment-detail-button-row-date-years",value:"annual"}]}"
        @button-group-item-change="${t=>this._eventButtonDate(t.detail)}"
      ></bbva-button-group>
    `}async _eventButtonDate(t){this.buttonGroupSelected=null==t?void 0:t.selected;const[e,i]=this.issuerNameAndDescription.split(" ");if(0===(null==t?void 0:t.selected)){var a;this._historicGraph=!1,this.frequencyInX=2,this._formatLegendGraph="%X",await this.updateComplete,this._dispatchCustomEvent("stock-information-bbva-trader-daily-graph-frequency-select",{name:e,description:i,issuer:null===(a=this._getSpecificAmountInvestmentDetail("id"))||void 0===a?void 0:a.amount})}else{var r,n;switch(this._historicGraph=!0,t.selected){case 1:this.frequencyInX=7,this._formatLegendGraph="%d %b";break;case 2:this.frequencyInX=5,this._formatLegendGraph="%d %b";break;case 3:this.frequencyInX=5,this._formatLegendGraph=" %b";break;case 4:this.frequencyInX=5,this._formatLegendGraph="%Y"}await this.updateComplete,this._dispatchCustomEvent("stock-information-bbva-trader-historical-graph-frequency-select",{name:e,description:i,frequency:null===(r=this.timeFrequency)||void 0===r?void 0:r[null==t?void 0:t.value],issuer:null===(n=this._getSpecificAmountInvestmentDetail("id"))||void 0===n?void 0:n.amount})}}get _renderInvestmentBestPostures(){return n`
      <div class="investment-detail-list-header">
        <bbva-header-category
          variant="default"
          text="stock-information-bbva-trader-investment-detail-best-postures-header"
          link-accessibility-text="${this.t("stock-information-bbva-trader-investment-detail-best-postures-header")}"
        ></bbva-header-category>
      </div>
      ${Object.keys(this.investmentDetailData).length?this._renderTextPostures():h}
    `}_renderTextPostures(){var t,e;const{salePrice:i,purchasePrice:a,volumePrice:r}=this.priceType,s=[a,r,i],o=s.map((t=>{var e,i;return(null===(e=this.investmentDetailData)||void 0===e||null===(i=e.dataIssuer)||void 0===i?void 0:i[t])||this._getSpecificAmountInvestmentDetail(t)||0})),l=(t,e,i)=>{const{amount:a=0,currency:r=""}=e[i]||{};switch(t){case"purchasePrice":case"salePrice":return n`
            <bbva-type-amount
              variant="m"
              amount="${a}"
              currency-code="${r}"
              local-currency="${r}"
              language="${this.language}"
            ></bbva-type-amount>
          `;case"volumePrice":return n`
            <bbva-type-text text="${a}" size="S" tag="span" font-weight="350"></bbva-type-text>
          `;default:return h}},d=s.map(((t,e)=>n`
        <div class="investment-detail-list-prices">
          <bbva-type-text
            text="${this._dynamicLabelTextPost(t)}"
            size="S"
            tag="span"
            font-weight="350"
          ></bbva-type-text>
          ${l(t,o,e)}
        </div>
      `));return n`
      ${d}

      <div class="investment-detail-list-prices">
        <bbva-type-text
          text="${this._dynamicLabelTextPost("saleVolume")}"
          size="S"
          tag="span"
          font-weight="350"
        ></bbva-type-text>
        <bbva-type-text
          text="${(null===(t=this.investmentDetailData)||void 0===t||null===(e=t.dataIssuer)||void 0===e?void 0:e.saleVolume)??0}"
          size="S"
          tag="span"
          font-weight="350"
        ></bbva-type-text>
      </div>
    `}_dynamicLabelTextPost(t){return{purchasePrice:"stock-information-bbva-trader-investment-detail-best-postures-purchase-price",volumePrice:"stock-information-bbva-trader-investment-detail-best-postures-purchase-volume",salePrice:"stock-information-bbva-trader-investment-detail-best-postures-selling-price",saleVolume:"stock-information-bbva-trader-investment-detail-best-postures-selling-volume"}[t]||""}get _renderInvestmentStockMarket(){const{conditionedTitlesArray:t}=this.investmentDetailData??[],e=[{nameAndDescription:this.issuerNameAndDescription},{titles:{quantity:"0"}},{averagePrice:{amount:"0",currency:""}},{totalPrice:{amount:"0",currency:""}},{investment:{amount:"0",currency:""}},{percentageInPortfolio:"0"}];return n`
      <div class="investment-detail-list-header">
        <bbva-header-category
          variant="default"
          text="stock-information-bbva-trader-investment-detail-stock-mark-header"
          link-accessibility-text="${this.t("stock-information-bbva-trader-investment-detail-stock-mark-header")}"
        ></bbva-header-category>
      </div>
      ${!this.issuerNotFound&&Array.isArray(t)&&t.length>1?n`
            ${this._renderTextStock({nameAndDescription:this.issuerNameAndDescription})}
            ${Object.values(t).map((t=>this._renderTextStock(t)))}
          `:null==e?void 0:e.map((t=>this._renderTextStock(t)))}
      <div class="fit">
        <bbva-divider-default></bbva-divider-default>
      </div>
    `}_renderTextStock(t){return n`
      <div class="investment-detail-list-prices">
        <bbva-type-text
          text="${this._dynamicLabelTextStock(t)}"
          size="S"
          tag="span"
          font-weight="350"
        ></bbva-type-text>
        ${this._valuateText(t)}
      </div>
    `}_dynamicLabelTextStock(t){const e={nameAndDescription:"stock-information-bbva-trader-investment-detail-stock-mark-broad-series",titles:"stock-information-bbva-trader-investment-detail-stock-mark-sec-purchased",averagePrice:"stock-information-bbva-trader-investment-detail-stock-mark-average-cost",totalPrice:"stock-information-bbva-trader-investment-detail-stock-mark-valuation",investment:"stock-information-bbva-trader-investment-detail-stock-mark-investment",percentageInPortfolio:"stock-information-bbva-trader-investment-detail-stock-mark-plus-minus"},i=Object.keys(e).find((e=>e in t));return i?e[i]:t}_badgeVariability(){var t,e;const i=null===(t=this.investmentDetailData)||void 0===t||null===(e=t.dataIssuer)||void 0===e?void 0:e.percentageInPortfolio,a={noChange:n`<bbva-badge-variability
        color="warning"
        status="no-change"
      ></bbva-badge-variability>`,positive:n`<bbva-badge-variability color="success"></bbva-badge-variability>`,negative:n`<bbva-badge-variability
        color="error"
        status="decrease"
      ></bbva-badge-variability>`};return 0===i?a.noChange:i>0?a.positive:a.negative}_valuateText(t){const e=Object.values(t)[0],i=(null==e?void 0:e.amount)??0,a=(null==e?void 0:e.currency)??"",r=(null==e?void 0:e.quantity)??0,s={nameAndDescription:n`
        <bbva-type-text
          text="${e}"
          size="S"
          tag="span"
          font-weight="350"
          alignment="right"
        ></bbva-type-text>
      `,titles:n`
        <bbva-type-text text="${r}" size="S" tag="span" font-weight="350"></bbva-type-text>
      `,averagePrice:n`
        <bbva-type-amount
          type="normal"
          variant="S"
          amount="${i}"
          currency-code="${a}"
          local-currency="${a}"
          language="${this.language}"
        >
        </bbva-type-amount>
      `,totalPrice:n`
        <bbva-type-amount
          type="normal"
          variant="S"
          amount="${i}"
          currency-code="${a}"
          local-currency="${a}"
          language="${this.language}"
        >
        </bbva-type-amount>
      `,investment:n`
        <div class="items-center">
          <bbva-type-amount
            type="normal"
            variant="S"
            amount="${i}"
            currency-code="${a}"
            local-currency="${a}"
            language="${this.language}"
          >
          </bbva-type-amount>
          ${this._badgeVariability()}
        </div>
      `,percentageInPortfolio:n`
        <div class="items-center">
          <bbva-type-amount type="light" variant="m" amount="${e??0}" symbol="%">
          </bbva-type-amount>
          ${this._badgeVariability()}
        </div>
      `},o=Object.keys(s).find((e=>e in t));return o?s[o]:0}_managePurchaseData(){const[t,e]=this.issuerNameAndDescription.split(" ");this._dispatchCustomEvent("stock-information-bbva-trader-investment-detail-calculate-shares-request",{name:t,description:e})}get _renderAvailableBalanceList(){var e;const{transactionMarginAmount:i,positionSize:a}=this.purchaseData??{},{positionSize:r}=this.saleData??{};return n`
      <div class="list-container">
        <div class="list-item">
          <bbva-type-text
            text="stock-information-bbva-trader-investment-detail-avai-balance-header"
            size="m"
            tag="span"
          ></bbva-type-text>
          <div class="list-item-icon">
            <bbva-type-link
              variant="icon"
              @click="${this._infoModalAvailableBalance}"
              aria-label="${this.t("stock-information-bbva-trader-investment-detail-text-accessibility-available-balance")}"
              icon="${t()}"
            >
            </bbva-type-link>
          </div>
        </div>
        <bbva-type-amount
          variant="m"
          amount="${(null==i?void 0:i.amount)??0}"
          currency-code="${(null==i?void 0:i.currency)??""}"
          local-currency="${(null==i?void 0:i.currency)??""}"
          language=${this.language}
        >
        </bbva-type-amount>
      </div>
      <div class="investment-detail-list-prices">
        <bbva-type-text
          text="stock-information-bbva-trader-investment-detail-avai-balance-buy"
          size="S"
          tag="span"
          font-weight="350"
        ></bbva-type-text>
        <bbva-type-text
          text="${(null==a?void 0:a.quantity)??0}"
          size="S"
          tag="span"
          font-weight="350"
        ></bbva-type-text>
      </div>
      <div class="investment-detail-list-prices">
        <bbva-type-text
          text="stock-information-bbva-trader-investment-detail-avai-balance-sale"
          size="S"
          tag="span"
          font-weight="350"
        ></bbva-type-text>
        <bbva-type-text
          text="${(null==r?void 0:r.quantity)??0}"
          size="S"
          tag="span"
          font-weight="350"
        ></bbva-type-text>
      </div>
      ${"ADVISED"===(null===(e=this.getBalancesData)||void 0===e?void 0:e.investmentType)?n`
            <bbva-notification-message
              message-title="stock-information-bbva-trader-investment-detail-advice-notification-title"
              message="stock-information-bbva-trader-investment-detail-advice-notification-message"
            ></bbva-notification-message>
          `:""}
    `}_infoModalAvailableBalance(){this._infoModalConfig=_t({id:"investment-detail-info-modal",headerInfoText:"stock-information-bbva-trader-product-detail-info-modal-header",titleInfoText:"stock-information-bbva-trader-product-detail-info-modal-title",bullets:["stock-information-bbva-trader-product-detail-info-modal-bullet-one","stock-information-bbva-trader-product-detail-info-modal-bullet-two","stock-information-bbva-trader-product-detail-info-modal-bullet-three"],fixedFooter:!1}),this._infoModalVisible=!0,this._dispatchCustomEvent("stock-information-bbva-trader-info-modal-available-balance-open")}get _renderInfoModals(){return n`
      <stocks-info-modal
        .visible="${this._infoModalVisible}"
        .modalConfig="${this._infoModalConfig}"
        @stock-information-bbva-trader-info-modal-close="${()=>{this._infoModalVisible=!1}}"
      >
      </stocks-info-modal>
    `}render(){return n`
      ${super.render()} ${this._renderPanelDetail} ${this._renderLastUpdate}
      ${this._renderInvestmentPrices} ${this._renderRowButtons} ${this._renderInvestmentGraphPrice}
      ${this._renderGraph} ${this._renderRowButtonsDate} ${this._renderInvestmentBestPostures}
      ${this._renderInvestmentStockMarket} ${this._renderAvailableBalanceList}
      ${this._renderInfoModals}
    `}}customElements.define(Jt.is,Jt);class te extends(f(i(_(a)))){static get is(){return"stock-information-bbva-trader-dm"}static get scopedElements(){const t=[ht,ut,vt,ft,pt,gt,yt];return te.scopedElementsFromClasses(t)}static get properties(){return{calculateSharesTransactionMarginApiVersion:{type:String,attribute:"calculate-shares-transaction-margin-api-version"},country:{type:String},getBalancesApiVersion:{type:String,attribute:"get-balances-api-version"},getOrdersApiVersion:{type:String,attribute:"get-orders-api-version"},localCustomProperties:{type:Object,attribute:"local-custom-properties"},privateBankingPortfolioId:{type:String,attribute:"private-banking-portfolio-id"}}}constructor(){super(),this.calculateSharesTransactionMarginApiVersion="0",this.country="",this.getBalancesApiVersion="0",this.getOrdersApiVersion="0",this.localCustomProperties={},this.privateBankingPortfolioId=""}async firstUpdated(){super.firstUpdated(),this._getDms()}_getDms(){this._getBalancesDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-private-banking-portfolio-balances-api-dm"]'),this._getCalculateSharesTransactionMarginDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-private-banking-portfolio-calculate-shares-transaction-margin-api-dm"]'),this._getInvestmentListDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-security-account-investments-api-dm"]'),this._getOrdersDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-orders-api-dm"]'),this._getOrderDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-order-api-dm"]'),this._getInvestmentDetailDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-security-account-issuer-api-dm"]'),this._getSearchingDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-issuers-api-dm"]')}getBalancesDataDm(){this._getBalancesDm.resetPrivateBankingPortfolioBalances(),this._getBalancesDm.getPrivateBankingPortfolioBalances(this.privateBankingPortfolioId)}_setGetBalancesResponse({detail:t}){this._dispatchCustomEvent("stock-information-bbva-trader-dm-get-balances-respond",t)}_buildBodyCalculateSharesTransactionMargin(t,e){const{id:i,name:a,number:r}=e;return{operationType:{id:t},asset:{id:i,name:a,number:r,numberType:{id:"ISIN"},assetType:{id:"INVESTMENT_FUNDS"}}}}getCalculateSharesTransactionMarginDataDm(t,e){const i=this._buildBodyCalculateSharesTransactionMargin(t,e);this._getCalculateSharesTransactionMarginDm.resetPrivateBankingPortfolioCalculateSharesTransactionMargin(),this._getCalculateSharesTransactionMarginDm.postPrivateBankingPortfolioCalculateSharesTransactionMargin(this.privateBankingPortfolioId,i)}_setCalculateSharesTransactionMarginResponse({detail:t}){this._dispatchCustomEvent("stock-information-bbva-trader-dm-calculate-shares-transaction-margin-respond",t)}getOrdersDataDm(t){this._getOrdersDm.resetOrders(),this._getOrdersDm.getOrders(t)}_setOrdersResponse({detail:t}){this._dispatchCustomEvent("stock-information-bbva-trader-dm-get-orders-respond",{detail:t})}getOrderDataDm(t){this._getOrderDm.resetOrder(),this._getOrderDm.getOrder(t)}_setOrderResponse({detail:t}){this._dispatchCustomEvent("stock-information-bbva-trader-dm-get-order-respond",t)}getInvestmentListDataDm(t){this._getInvestmentListDm.resetSecurityAccountInvestments(),this._getInvestmentListDm.getSecurityAccountInvestments(this.privateBankingPortfolioId,t)}async _setInvestmentListResponse(t){const{detail:e}=t;if(e.length>0){var i;const t=null===(i=e[0])||void 0===i?void 0:i.totalAmount,a=null==e?void 0:e.map((t=>({...null==t?void 0:t.issuer[0],issuer:null==t?void 0:t.id})));this._dispatchCustomEvent("stock-information-bbva-trader-dm-get-investment-list-respond",{totalAmount:t,issuer:a})}else this._dispatchCustomEvent("stock-information-bbva-trader-dm-get-investment-list-respond",{})}_setInvestmentListPaginationResponse({detail:t}){this._dispatchCustomEvent("stock-information-bbva-trader-dm-get-investment-list-pagination-respond",t)}_setOrdersPaginationResponse({detail:t}){this._dispatchCustomEvent("stock-information-bbva-trader-dm-get-orders-pagination-respond",t)}getInvestmentDetailDataDm(t){this._getInvestmentDetailDm.resetSecurityAccountIssuer(),this._getInvestmentDetailDm.getSecurityAccountIssuer(this.privateBankingPortfolioId,t)}_setInvestmentDetailResponse({detail:t}){var e;const{titles:i,averagePrice:a,totalPrice:r,investment:n,percentageInPortfolio:s}=t,o={titles:i,averagePrice:a,totalPrice:r,investment:n,percentageInPortfolio:s},l=(null===(e=Object.keys(o))||void 0===e?void 0:e.map((e=>e in t?{[e]:t[e]}:{}))).filter((t=>Object.keys(t).length>0));this._dispatchCustomEvent("stock-information-bbva-trader-dm-get-investment-detail-respond",{conditionedTitlesArray:l,dataIssuer:t})}async manageSearchingDm(t){this._getSearchingDm.resetIssuers(),this._getSearchingDm.getIssuers(t)}_setSearchingResponse({detail:t}){this._dispatchCustomEvent("stock-information-bbva-trader-dm-get-search-respond",t)}_handleErrorResponse(t,e){this._dispatchCustomEvent(`stock-information-bbva-trader-dm-api-dm-error-${t.toLowerCase()}-fetch-error`,{service:t,data:e})}_investmentListErrorResponse(){this._dispatchCustomEvent("stock-information-bbva-trader-dm-get-investment-list-fetch-error",{service:"GET-INVESTMENT-LIST"})}get _renderDMs(){return n`
      ${this._renderPrivateBankingPortfoliosApiDmBGADMS} ${this._renderStockMarketsApiDmBGADMS}
    `}get _renderPrivateBankingPortfoliosApiDmBGADMS(){return n`
      <bbva-global-private-banking-portfolio-balances-api-dm
        .version="${this.getBalancesApiVersion}"
        .host="${this.host}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @private-banking-portfolio-balances-api-dm-fetch="${this._setGetBalancesResponse}"
        @private-banking-portfolio-balances-api-dm-fetch-error="${t=>this._handleErrorResponse("GET-BALANCES",t.detail)}"
      >
      </bbva-global-private-banking-portfolio-balances-api-dm>
      <bbva-global-private-banking-portfolio-calculate-shares-transaction-margin-api-dm
        .version="${this.calculateSharesTransactionMarginApiVersion}"
        .host="${this.host}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @private-banking-portfolio-calculate-shares-transaction-margin-api-dm-fetch="${this._setCalculateSharesTransactionMarginResponse}"
        @private-banking-portfolio-calculate-shares-transaction-margin-api-dm-fetch-error="${()=>this._handleErrorResponse("CALCULATE-SHARES-ERROR")}"
      >
      </bbva-global-private-banking-portfolio-calculate-shares-transaction-margin-api-dm>
    `}get _renderStockMarketsApiDmBGADMS(){return n`
      <bbva-global-security-account-investments-api-dm
        .version="${this.getOrdersApiVersion}"
        .host="${this.host}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        country="${this.country}"
        .localCustomProperties="${{...this.localCustomProperties}}"
        @security-account-investments-api-dm-fetch="${this._setInvestmentListResponse}"
        @security-account-investments-api-dm-fetch-error="${this._investmentListErrorResponse}"
        @security-account-investments-api-dm-pagination="${this._setInvestmentListPaginationResponse}"
      >
      </bbva-global-security-account-investments-api-dm>
      <bbva-global-orders-api-dm
        .version="${this.getOrdersApiVersion}"
        .host="${this.host}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @orders-api-dm-fetch="${this._setOrdersResponse}"
        @orders-api-dm-pagination="${this._setOrdersPaginationResponse}"
        @orders-api-dm-fetch-error="${()=>this._handleErrorResponse("ORDERS-ERROR")}"
      >
      </bbva-global-orders-api-dm>
      <bbva-global-order-api-dm
        .version="${this.getOrdersApiVersion}"
        .host="${this.host}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @order-api-dm-fetch="${this._setOrderResponse}"
        @order-api-dm-fetch-error="${()=>this._handleErrorResponse("ORDER-ERROR")}"
      ></bbva-global-order-api-dm>
      <bbva-global-security-account-issuer-api-dm
        .version="${this.getOrdersApiVersion}"
        .host="${this.host}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        .localCustomProperties="${{...this.localCustomProperties}}"
        country="${this.country}"
        @security-account-issuer-api-dm-fetch="${this._setInvestmentDetailResponse}"
        @security-account-issuer-api-dm-fetch-error="${()=>this._handleErrorResponse("INVESTMENT-DETAIL-ERROR")}"
      >
      </bbva-global-security-account-issuer-api-dm>
      <bbva-global-issuers-api-dm
        .host="${this.host}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        country="${this.country}"
        .localCustomProperties="${{...this.localCustomProperties}}"
        @issuers-api-dm-fetch="${this._setSearchingResponse}"
        @issuers-api-dm-fetch-error="${t=>this._handleErrorResponse("SEARCHING-ERROR",t.detail)}"
      ></bbva-global-issuers-api-dm>
    `}render(){return n` ${this._renderDMs} `}}customElements.define(te.is,te);const ee=[{id:"btn-menu",icon:y(),closeIconLabel:"Menu",closeIconAriaLabel:"Menu",accessibilityText:"Menu",eventIconName:"stock-information-bbva-trader-burger-menu-click"}],ie={headerConfig:{header:{id:"header-product-detail",variant:"first-level-sequential",showLeftIcon:!0,buttons:ee}}};var ae=e`
:host {
  --_stock-information-bbva-trader-bg-color: var(--stock-information-bbva-trader--_ambient--default-bg,var(--colorsSecondary100, ${c(b.secondary100)}));
  --_stock-information-bbva-trader-bg-color-transition: var(--stock-information-bbva-trader--_ambient--default-bg-transition,var(--colorsSecondary100, ${c(b.secondary100)}));
}
`,re=e`
:host {
  display: block;
  box-sizing: border-box;
  height: 100vh;
  overflow-y: auto;
  background-color: var(--_stock-information-bbva-trader-bg-color);
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container--custom--primary-ambient--content-bg-color: var(--_stock-information-bbva-trader-bg-color-transition);
  --bbva-transition-container-padding-bottom: 0;
}

:host([retry-error-show]) {
  overflow: hidden;
}
`;class ne extends(f(i(_(a)))){static get is(){return"stock-information-bbva-trader"}static get scopedElements(){const t=[Y,U,X,Jt,Nt,Xt,Ut,Tt,jt,te,Qt];return ne.scopedElementsFromClasses(t)}static get properties(){return{assetNumber:{type:String,attribute:"asset-number"},calculateSharesTransactionMarginApiVersion:{type:String,attribute:"calculate-shares-transaction-margin-api-version"},errorTryNumber:{type:Number,attribute:"error-try-number"},getBalancesApiVersion:{type:String,attribute:"get-balances-api-version"},getOrdersApiVersion:{type:String,attribute:"get-orders-api-version"},number:{type:String},alias:{type:String},issuerId:{type:String,attribute:"issuer-id"},issuerSelect:{type:String,attribute:"issuer-select"},localCustomProperties:{type:Object,attribute:"local-custom-properties"},mapperReason:{type:Object,attribute:"mapper-reason"},maxNumberElementsPerPage:{type:Number,attribute:"max-number-elements-per-page"},pageSizeInvestmentListInitial:{type:Number,attribute:"page-size-investment-list-initial"},pageSizeOrderListInitial:{type:Number,attribute:"page-size-order-list-initial"},phoneNumberAttention:{type:String,attribute:"phone-number-attention"},priceType:{type:Object,attribute:"price-type"},privateBankingPortfolioId:{type:String,attribute:"private-banking-portfolio-id"},specificAmountsId:{type:Object,attribute:"specific-amounts-id"},timeFrequency:{type:Object,attribute:"time-frequency"},disableRightIconMenu:{type:Boolean,attribute:"disable-right-icon-menu"},gmtTime:{type:Number,attribute:"gmt-time"},assetsOtherMarkets:{type:Array,attribute:"assets-other-markets"},_activateRequestInvestmentList:{type:Boolean},_activateRequestOrderList:{type:Boolean},_buttonGroupSelected:{type:Number},_calculateSharesData:{type:Object},_calculateSharesDataType:{type:String},_dataGraphInvestmentDetail:{type:Array},_getBalancesData:{type:Object},_getBalancesError:{type:Boolean},_headerOrderList:{type:String},_investmentDetailData:{type:Array},_investmentDetailError:{type:Boolean},_investmentDetailVisible:{type:Boolean},_investmentListPaginationResponse:{type:Object},_isIntradayGraphEmpty:{type:Boolean},_issuerBusinessName:{type:String},_issuerData:{type:Object},_issuerNameAndDescription:{type:String},_issuerNotFoundInvestmentList:{type:Boolean},_issuerSearch:{type:String},_itemsPagination:{type:Number},_listInvestmentData:{type:Object},_listInvestmentError:{type:Boolean},_orderDetailData:{type:Object},_orderDetailError:{type:Boolean},_orderDetailVisible:{type:Boolean},_orderListData:{type:Object},_orderListError:{type:Boolean},_orderListPaginationResponse:{type:Object},_orderListVisible:{type:Boolean},_productBtrader:{type:Object},_productId:{type:String},_purchaseDataInvestmentDetail:{type:Object},_retriesConfig:{type:Object},_retryErrorConfig:{type:Object},_retryErrorShow:{type:Boolean},_saleDataInvestmentDetail:{type:Object},_savePrivateBankingPortfolioId:{type:String},_scrollInvestmentList:{type:Boolean},_scrollOrderList:{type:Boolean},_searchingData:{type:Object},_searchingError:{type:Boolean},_searchingModalConfig:{type:Object},_searchingModalVisible:{type:Boolean},_typeDataInvestmentDetail:{type:String}}}static get styles(){return[H.primary,r("stock-information-bbva-trader-shared-styles"),re,ae]}constructor(){super(),this.ambient="primary",this.config={loader:{ambient:"primary"},header:{...null==ie?void 0:ie.headerConfig.header,"@header-main-icon-click":this._manageHeaderIconClick.bind(this)}},this.assetNumber="",this.calculateSharesTransactionMarginApiVersion="0",this.disableRightIconMenu=!1,this.errorTryNumber=3,this.getBalancesApiVersion="0",this.getOrdersApiVersion="0",this.number="",this.alias="",this.issuerId="",this.issuerSelect="",this.localCustomProperties={},this.mapperReason={AUTOGESTION:"stock-information-bbva-trader-order-detail-cancel-motive-autogestion"},this.maxNumberElementsPerPage=20,this.pageSizeInvestmentListInitial=5,this.pageSizeOrderListInitial=5,this.phoneNumberAttention="",this.priceType={purchasePrice:"purchasePrice",salePrice:"salePrice",volumePrice:"volumePrice"},this.privateBankingPortfolioId="",this.specificAmountsId={lastPrice:"lastPrice",maxDay:"maxDay",minDay:"minDay",previousClose:"prevClosing",maxPrice:"maxPrice",dayPerformancePercent:"dayPerformancePercent",tendency:"tendency",closingPrice:"closingPrice",closePrice:"closePrice"},this.timeFrequency={daily:{daysToSubtract:7,graphFrequencyBody:"d"},weekly:{daysToSubtract:30,graphFrequencyBody:"d"},monthly:{daysToSubtract:365,graphFrequencyBody:"d"},annual:{daysToSubtract:1825,graphFrequencyBody:"Y"}},this._activateRequestInvestmentList=!1,this._activateRequestOrderList=!1,this._buttonGroupSelected=0,this._calculateSharesData={},this._calculateSharesDataType="",this._dataGraphInvestmentDetail=[],this._getBalancesData={},this._getBalancesError=!1,this._headerOrderList="stock-information-bbva-trader-order-list-header",this._investmentDetailData=[],this._investmentDetailError=!1,this._investmentDetailVisible=!1,this._investmentListPaginationResponse={},this._isIntradayGraphEmpty=!1,this._issuerBusinessName="",this._issuerData={},this._issuerNameAndDescription="",this._issuerNotFoundInvestmentList=!1,this._issuerSearch="",this._itemsPagination=0,this._listInvestmentData={},this._listInvestmentError=!1,this._orderDetailData={},this._orderDetailError=!1,this._orderDetailVisible=!1,this._orderListData={},this._orderListError=!1,this._orderListPaginationResponse={},this._orderListVisible=!1,this._productBtrader={},this._productId="",this._purchaseDataInvestmentDetail={},this._retriesConfig={GET_BALANCES:0},this._retryErrorConfig={},this._retryErrorShow=!1,this._saleDataInvestmentDetail={},this._savePrivateBankingPortfolioId="",this._scrollInvestmentList=!1,this._scrollOrderList=!1,this._searchingData=null,this._searchingError=!1,this._searchingModalConfig={},this._searchingModalVisible=!1,this._typeDataInvestmentDetail="",this.gmtTime=0,this.assetsOtherMarkets=["DEBT_INVESTMENT_FUNDS","EQUITY_INVESTMENT_FUNDS","MONEY_MARKET","DEBT_SECURITIES","BANK_INVESTMENTS","OTHERS"]}async updated(t){super.updated(t),t.has("disableRightIconMenu")&&this.disableRightIconMenu&&(this.config.header.buttons=[],await this.updateComplete)}async init(){this._dispatchCustomEvent("stock-information-bbva-trader-initialize"),this._calculateSharesData={},this._itemsPagination=0,this._calculateSharesDataType="",await this.updateComplete,this.showLoader(),await this.getSimpleCode(),await this.getIdCode(),await this._requestSettings()}get _elementsScrolledInvestmentList(){const t=this.shadowRoot.querySelector("[data-tag-name=stock-information-bbva-trader-investment-list]");return t?t.shadowRoot.children:[]}get _elementsScrolledOrderList(){return this.shadowRoot.querySelector("[data-tag-name=stock-information-bbva-trader-order-list]")}get _orderListContainer(){return this.shadowRoot.querySelector("#order-list-container")}async _requestSettings(){if(!this._orderListVisible&&!this._investmentDetailVisible&&!this._searchingModalVisible){const t={pageSize:this.pageSizeInvestmentListInitial};this._dataManager.getBalancesDataDm(),this._dataManager.getInvestmentListDataDm(t)}}_getCalculateSharesTransactionMarginDataDm({type:t,data:e}){this._dataManager.getCalculateSharesTransactionMarginDataDm(t,e)}_getInvestmentDetailDataDm(t){this._dataManager.getInvestmentDetailDataDm(t)}_updateEventScroll(t){t.detail?this.updateComplete.then((()=>{this._activateRequestInvestmentList=!1,this._scrollInvestmentList=!1,this.addEventListener("scroll",this._handleScrollInvestmentList)})):this.removeEventListener("scroll",this._handleScrollInvestmentList)}_handleScrollInvestmentList(){const t=this._elementsScrolledInvestmentList;if(0===t.length)return;const e=Array.from(t).find((t=>"accordionOthers"===(null==t?void 0:t.id)));if(!e)return;const{scrollTop:i,scrollHeight:a,clientHeight:r}=this;i+r>=a-(((null==e?void 0:e.clientHeight)??0)+10)&&!this._activateRequestInvestmentList&&!this._listInvestmentError&&this._activateScrollingPagination()}_activateScrollingPagination(){this._activateRequestInvestmentList=!0,this._scrollInvestmentList=!0,this._dispatchCustomEvent("stock-information-bbva-trader-investment-list-active-request-fetch")}handleScrollOrderList(){var t;const{scrollTop:e,clientHeight:i}=this._orderListContainer.shadowRoot.querySelector(".modal-container");e+i>=((null===(t=this._elementsScrolledOrderList)||void 0===t?void 0:t.clientHeight)??0)+28&&!this._activateRequestOrderList&&!this._orderListError&&(this._activateRequestOrderList=!0,this._scrollOrderList=!0)}get _dataManager(){return this.shadowRoot.querySelector("#stock-information-bbva-trader-dm")}async _handleGetBalancesResponse({detail:t}){this._getBalancesError=!1,this._getBalancesData=t,await this.updateComplete}async _handleCalculateSharesResponse({detail:t}){""===this._calculateSharesDataType&&(this._calculateSharesData=t),"sale"===this._calculateSharesDataType&&(this._saleDataCalculateShares=t),"purchase"===this._calculateSharesDataType&&(this._purchaseDataInvestmentDetail=t),await this.updateComplete,this.clearLoader()}async _handleGetInvestmentListResponse({detail:t}){var e,i;if(1===(null==t||null===(e=t.issuer)||void 0===e?void 0:e.length)&&this._issuerNotFoundInvestmentList){const[e]=(null==t?void 0:t.issuer)??[];return this._dispatchCustomEvent("stock-information-bbva-trader-investment-list-issuer-not-find",e),await this.updateComplete,void this._selectItemInvestmentList(e)}if(this._listInvestmentError=!1,this._listInvestmentData=t,!Object.keys(this._calculateSharesData).length&&(null==t||null===(i=t.issuer)||void 0===i?void 0:i.length)>0){var a;const e=null==t||null===(a=t.issuer)||void 0===a?void 0:a[0];this._getCalculateSharesTransactionMarginDataDm({type:"PURCHASE",data:{id:null==e?void 0:e.id,name:null==e?void 0:e.name,number:null==e?void 0:e.description}})}this.clearLoader()}async _handleInvestmentListPaginationResponse({detail:t}){this._investmentListPaginationResponse=t,await this.updateComplete}async _handleGetInvestmentDetailResponse({detail:t}){var e,i,a,r;(this._investmentDetailError=!1,this._investmentDetailData=t,null!=t&&null!==(e=t.dataIssuer)&&void 0!==e&&e.compressedGraphicData&&(null==t||null===(i=t.dataIssuer)||void 0===i||null===(a=i.compressedGraphicData)||void 0===a?void 0:a.length)>0)?this._setDataGraphInvestmentDetail({detail:null==t||null===(r=t.dataIssuer)||void 0===r?void 0:r.compressedGraphicData}):(this._isIntradayGraphEmpty=!0,this._handleInvestmentDetailEmptyIntradayResponse())}async _handleGetOrdersResponse({detail:t}){this._orderListData=t,await this.updateComplete,this.clearLoader()}async _handleGetOrderResponse({detail:t}){this._orderDetailData=t,await this.updateComplete}async _handleSearchingResponse({detail:t}){this._searchingData=t,await this.updateComplete}async _setDataGraphInvestmentDetail({detail:t}){this._dataGraphInvestmentDetail=t}async _handleInvestmentDetailEmptyIntradayResponse(){this._dataGraphInvestmentDetail=[]}async getSimpleCode(t){var e;return(null===(e=this.privateBankingPortfolioId)||void 0===e?void 0:e.length)>0||(this.privateBankingPortfolioId=t??this._savePrivateBankingPortfolioId,await this.updateComplete),this.privateBankingPortfolioId}async getSaveSimpleCode(t){return this._savePrivateBankingPortfolioId=t,await this.updateComplete,this._savePrivateBankingPortfolioId}async getIdCode(t){var e;return(null===(e=this._productId)||void 0===e?void 0:e.length)>0||(this._productId=t,await this.updateComplete),this._productId}sendDetailToPurchaseAndSale(){const t={alias:this.alias,number:this.number,privateBankingPortfolioId:this.privateBankingPortfolioId,...this._calculateSharesData};this._dispatchCustomEvent("stock-information-bbva-trader-contract-detail-purchase-and-sell-request",t)}handleNavigationToOrderList(){this._searchingModalVisible=!1,this._investmentDetailVisible=!1,this._retryErrorShow=!1,this._orderDetailVisible=!1,this._listInvestmentError=!1,this._investmentDetailError=!1,this._orderListError=!1,this._orderDetailError=!1,this._activateRequestInvestmentList=!1,this._scrollInvestmentList=!1,this._activateRequestOrderList=!1;const t={"securityAccount.id":`${this.privateBankingPortfolioId}`,isPatrimonial:!0,pageSize:this.pageSizeOrderListInitial};this._dataManager.getOrdersDataDm(t),this._orderListVisible=!0,this._activateRequestOrderList=!1,this._scrollOrderList=!1}setHeaderConfig(t){var e,i;const{product:a}=t,r=null==a?void 0:a.alias,n=null==a||null===(e=a.number)||void 0===e?void 0:e.slice(16);this.alias=r,this.number=n,this.issuerId=null==a||null===(i=a.issuer)||void 0===i?void 0:i.id,this.issuerSelect=r,this.assetNumber=n,this._productBtrader=a,this.config.header.text=`${r} •${n}`,this.requestUpdate("config")}globalEditAlias(t){this.alias=null==t?void 0:t.alias}async _manageHeaderIconClick(){this.privateBankingPortfolioId="",this._productId="",this.issuerId="",this.issuerSelect="",this.assetNumber="",this._listInvestmentData={},this._investmentDetailData=[],this._orderListData={},this._orderDetailData={},this._calculateSharesData={},this._calculateSharesDataType="",this._dataGraphInvestmentDetail=[],this._getBalancesData={},this._productBtrader={},this._getBalancesError=!1,this._investmentDetailError=!1,this._investmentDetailVisible=!1,this._investmentListPaginationResponse={},this._isIntradayGraphEmpty=!1,this.localCustomProperties={},this._issuerData={},this._typeDataInvestmentDetail="",this._dispatchCustomEvent("stock-information-bbva-trader-header-close-button-click")}navigateForward(t,e={}){const i=new CustomEvent(`${t}-navigation-external`,{detail:e,bubbles:!0,composed:!0});this.dispatchEvent(i)}_navigateToTransfers(){const{privateBankingPortfolioId:t}=this;this.navigateForward("stock-information-bbva-trader-transfer-button-click",{continue:"equity",productId:t})}_editAlias(){const{_productBtrader:t,_productId:e}=this;this.navigateForward("stock-information-bbva-trader-edit-alias-button-click",{productType:"account",product:t,productId:e})}_callToLine(){this.navigateForward("stock-information-bbva-trader-call-to-line-button-click",{value:this.phoneNumberAttention})}_showOrderList(){this.showLoader();const t={"securityAccount.id":`${this.privateBankingPortfolioId}`,isPatrimonial:!0,pageSize:this.pageSizeOrderListInitial};this._dataManager.getOrdersDataDm(t),this._orderListVisible=!0,this._activateRequestOrderList=!1,this._scrollOrderList=!1}get _renderProductDetail(){return n`
      <stock-information-bbva-trader-product-detail
        ambient="${this.ambient}"
        .getBalancesData="${this._getBalancesData}"
        .calculateSharesData="${this._calculateSharesData}"
        language="${this.language}"
        alias="${this.alias}"
        number="${this.number}"
        @stock-information-bbva-trader-product-detail-searching-button-click="${this._manageSearching}"
        @stock-information-bbva-trader-product-detail-order-list-button-click="${this._showOrderList}"
        @stock-information-bbva-trader-product-detail-transfer-button-click="${this._navigateToTransfers}"
        @stock-information-bbva-trader-product-detail-edit-alias-click="${this._editAlias}"
      ></stock-information-bbva-trader-product-detail>
    `}_renderRetryErrorBody(t,e){return n`
      <bbva-type-text
        class="error-text-title"
        tag="h3"
        alignment="left"
        size="L"
        font-weight="500"
        text="${t}"
      >
      </bbva-type-text>
      <bbva-type-text class="error-text" tag="span" alignment="left" size="S" text="${e}">
      </bbva-type-text>
    `}get _renderRetryCommonError(){return n`
      <retry-common-error
        .retryErrorConfig="${this._retryErrorConfig}"
        @stock-information-bbva-trader-product-detail-error-retry-request="${()=>{this._retryErrorShow=!1,this.init()}}"
        @stock-information-bbva-trader-product-detail-error-retry-call="${this._callToLine}"
      >
      </retry-common-error>
    `}async _selectItemInvestmentList(t){const{id:e,name:i,description:a,legalName:r}=t;this.issuerId=e,this.issuerSelect=i,this._issuerData=t,this.assetNumber=a,this._dataManager.issuerId=e,this._issuerBusinessName=r,this._issuerNameAndDescription=`${i} ${a}`,this._investmentDetailVisible&&!this._issuerNotFoundInvestmentList||(this._calculateSharesDataType="purchase",this._buttonGroupSelected=0,this._getInvestmentDetailDataDm(e),this._getCalculateSharesTransactionMarginDataDm({type:"PURCHASE",data:{id:e,name:i,number:a}}),await this.updateComplete,this._investmentDetailVisible=!0,this._dispatchCustomEvent("stock-information-bbva-trader-investment-detail-open"))}get _renderInvestmentList(){var t;return n`
      ${Object.keys(this._getBalancesData??{}).length?n`
            <stock-information-bbva-trader-investment-list
              ambient="${this.ambient}"
              client-type="${null===(t=this._getBalancesData)||void 0===t?void 0:t.investmentType}"
              .listInvestmentData="${this._listInvestmentData}"
              .getBalancesData="${this._getBalancesData}"
              .investmentListPaginationResponse="${this._investmentListPaginationResponse}"
              language="${this.language}"
              ?list-investment-error="${this._listInvestmentError}"
              ?get-balances-error="${this._getBalancesError}"
              ?scroll-activate="${this._scrollInvestmentList}"
              error-try-number="${this.errorTryNumber}"
              .assetsOtherMarkets="${this.assetsOtherMarkets}"
              @stock-information-bbva-trader-investment-list-pagination-finalize="${()=>{this._activateRequestInvestmentList=!1}}"
              @stock-information-bbva-trader-investment-list-update-complete="${()=>{this._scrollInvestmentList=!1,this._activateRequestInvestmentList=!1}}"
              @stock-information-bbva-trader-investment-list-activate-scroll="${this._updateEventScroll}"
              @stock-information-bbva-trader-purchase-and-sale-request-submit="${t=>{this.sendDetailToPurchaseAndSale(),this.navigateForward("stock-information-bbva-trader-purchase-and-sale-button-click",t.detail)}}"
              @stock-information-bbva-trader-investment-list-searching-show="${this._manageSearching}"
              @stock-information-bbva-trader-investment-list-retry-request="${()=>{this.showLoader(),this._dataManager.getInvestmentListDataDm()}}"
              @stock-information-bbva-trader-investment-list-call-to-action-click="${()=>{this.clearLoader(),this._callToLine()}}"
              @stock-information-bbva-trader-investment-list-issuer-select="${({detail:t})=>{this._issuerNotFoundInvestmentList=!1,this._selectItemInvestmentList(t)}}"
              @stock-information-bbva-trader-investment-list-pagination-apply="${async()=>{if(this._activateRequestInvestmentList){this._itemsPagination+=this.maxNumberElementsPerPage,await this.updateComplete;const t={pageSize:this._itemsPagination+this.pageSizeInvestmentListInitial};this._dataManager.getInvestmentListDataDm(t)}}}"
            ></stock-information-bbva-trader-investment-list>
          `:h}
    `}get _renderSearchingModal(){return n`
      <stocks-searching-modal
        ambient="${this.ambient}"
        .visible="${this._searchingModalVisible}"
        .modalConfig="${this._searchingModalConfig}"
        .searchingResponse="${this._searchingData}"
        ?searching-error="${this._searchingError}"
        @stock-information-bbva-trader-searching-modal-find="${t=>{this._issuerSearch=t.detail,this._dataManager.manageSearchingDm(this._issuerSearch)}}"
        @stock-information-bbva-trader-searching-modal-value-clear="${()=>{this._searchingData=null}}"
        @stock-information-bbva-trader-searching-modal-close="${()=>{this._searchingModalVisible=!1,this._issuerNotFoundInvestmentList=!1,this._searchingData=null,this.init()}}"
        @stock-information-bbva-trader-manage-investment-detail-navigate="${async({detail:t})=>{var e,i;const a=null===(e=this._listInvestmentData)||void 0===e||null===(i=e.issuer)||void 0===i?void 0:i.find((e=>(null==e?void 0:e.name)===(null==t?void 0:t.name)));if(void 0!==a)this._dispatchCustomEvent("stock-information-bbva-trader-investment-list-issuer-select",a),await this.updateComplete,this._selectItemInvestmentList(a),this._issuerNotFoundInvestmentList=!1;else{this._issuerNotFoundInvestmentList=!0;const e={paginationKey:Bt(null==t?void 0:t.name,null==t?void 0:t.description)};this._dataManager.getInvestmentListDataDm(e)}}}"
        @stock-information-bbva-trader-searching-modal-retry="${()=>{this.showLoader(),this._dataManager.manageSearchingDm(this._issuerSearch)}}"
      >
      </stocks-searching-modal>
    `}get _renderOrderList(){return n`
      <bbva-transition-container
        id="order-list-container"
        ambient="${this.ambient}"
        header-type="first-level-sequential"
        header-show-left-icon
        header-text="${this._headerOrderList}"
        .headerButtons="${this.disableRightIconMenu?[]:ee}"
        ?visible="${this._orderListVisible}"
        header-left-icon-aria-label="${this.t("stock-information-bbva-trader-text-accessibility-back-button")}"
        @transition-container-close="${async()=>{this._orderListVisible=!1,this._orderListData={},this._headerOrderList="stock-information-bbva-trader-order-list-header",this.init()}}"
        @transition-container-scroll="${this.handleScrollOrderList}"
      >
        <div slot="slot-content" class="container">
          <stock-information-bbva-trader-order-list
            ambient="${this.ambient}"
            language="${this.language}"
            .orderListData="${this._orderListData}"
            .orderListPaginationResponse="${this._orderListPaginationResponse}"
            private-banking-portfolio-id="${this.privateBankingPortfolioId}"
            ?order-list-error="${this._orderListError}"
            ?scroll-activate="${this._scrollOrderList}"
            ?render-filter-list="${!this._orderListVisible}"
            error-try-number="${this.errorTryNumber}"
            @stock-information-bbva-trader-update-order-list-complete="${()=>{this._activateRequestOrderList=!1,this._scrollOrderList=!1}}"
            @stock-information-bbva-trader-order-list-pagination-apply="${t=>{if(this._activateRequestOrderList){const e=t.detail;this._dataManager.getOrdersDataDm(e)}}}"
            @stock-information-bbva-trader-order-list-filter-modal-filter-select="${t=>{this._activateRequestOrderList=!1,this._scrollOrderList=!1,this._orderListData={};const e={"securityAccount.id":`${this.privateBankingPortfolioId}`,isPatrimonial:!0,"status.id":t.detail,pageSize:this.pageSizeOrderListInitial};this._dataManager.getOrdersDataDm(e)}}"
            @stock-information-bbva-trader-order-list-select="${async t=>{this._orderListData={},this._activateRequestOrderList=!0,await this.updateComplete,this._dataManager.getOrderDataDm(t.detail),this._orderDetailVisible=!0}}"
            @stock-information-bbva-trader-order-list-filter="${t=>{const{detail:e}=t;this._headerOrderList=e?"stock-information-bbva-trader-order-list-filter-header":"stock-information-bbva-trader-order-list-header"}}"
            @stock-information-bbva-trader-order-list-retry-request="${()=>{const t={"securityAccount.id":`${this.privateBankingPortfolioId}`,isPatrimonial:!0,pageSize:this.pageSizeOrderListInitial};this._dataManager.getOrdersDataDm(t)}}"
            @stock-information-bbva-trader-cancel-order-request-submit="${t=>{this._orderListData={},this._activateRequestOrderList=!0,this._scrollOrderList=!0,this.navigateForward("stock-information-bbva-trader-cancel-order-button-click",t.detail)}}"
            @stock-information-bbva-trader-order-list-error-retry-call="${this._callToLine}"
          ></stock-information-bbva-trader-order-list>
        </div>
      </bbva-transition-container>
    `}get _renderOrderDetail(){return n`
      <bbva-transition-container
        ambient="${this.ambient}"
        id="order-detail"
        header-type="first-level-sequential"
        header-show-left-icon
        .headerText="${this.t("stock-information-bbva-trader-order-detail-header")}"
        .headerButtons="${this.disableRightIconMenu?[]:ee}"
        ?visible="${this._orderDetailVisible}"
        header-left-icon-aria-label="${this.t("stock-information-bbva-trader-text-accessibility-back-button")}"
        @transition-container-close="${()=>{this._orderDetailVisible=!1,this._showOrderList()}}"
      >
        <div slot="slot-content" class="container">
          <stock-information-bbva-trader-order-detail
            ambient="${this.ambient}"
            language="${this.language}"
            .orderDetailData="${this._orderDetailData}"
            .mapperReason="${this.mapperReason}"
            ?order-detail-error="${this._orderDetailError}"
            error-try-number="${this.errorTryNumber}"
            @stock-information-bbva-trader-order-detail-retry-request="${()=>{this._dataManager.getOrderParams={"securityAccount.id":`${this.privateBankingPortfolioId}`,isPatrimonial:!0},this._dataManager.getOrderDataDm()}}"
            @stock-information-bbva-trader-order-detail-error-retry-call="${this._callToLine}"
            @stock-information-bbva-trader-cancel-order-request-submit="${t=>this.navigateForward("stock-information-bbva-trader-cancel-order-button-click",t.detail)}"
          ></stock-information-bbva-trader-order-detail>
        </div>
      </bbva-transition-container>
    `}get _renderInvestmentDetail(){var t;return n`
      <bbva-transition-container
        ambient="${this.ambient}"
        id="investment-detail"
        header-type="first-level-sequential"
        header-show-left-icon
        header-text="stock-information-bbva-trader-investment-detail-header"
        .headerButtons="${this.disableRightIconMenu?[]:ee}"
        ?visible="${this._investmentDetailVisible}"
        header-left-icon-aria-label="${this.t("stock-information-bbva-trader-text-accessibility-back-button")}"
        @transition-container-close="${async()=>{this.shadowRoot.querySelector('[data-tag-name="stock-information-bbva-trader-investment-detail"]').resetProperties(),this._investmentDetailVisible=!1,this._investmentDetailData={},this._isIntradayGraphEmpty=!0,this._dataGraphInvestmentDetail=[],this._purchaseDataInvestmentDetail={},this._saleDataCalculateShares={},this._calculateSharesData={},await this.updateComplete,this._searchingModalVisible||this.init()}}"
      >
        <div slot="slot-content" class="container">
          <stock-information-bbva-trader-investment-detail
            ambient="${this.ambient}"
            language="${this.language}"
            security-issuer-id="${this.issuerId}"
            issuer-name-and-description="${this._issuerNameAndDescription}"
            business-name="${this._issuerBusinessName}"
            button-group-selected="${this._buttonGroupSelected}"
            client-type="${null===(t=this._getBalancesData)||void 0===t?void 0:t.investmentType}"
            ?issuer-not-found="${this._issuerNotFoundInvestmentList}"
            gmt-time="${this.gmtTime}"
            .investmentDetailData="${this._investmentDetailData}"
            .dataGraphInvestmentDetail="${this._dataGraphInvestmentDetail}"
            .purchaseData="${this._purchaseDataInvestmentDetail}"
            .saleData="${this._saleDataCalculateShares}"
            .getBalancesData="${this._getBalancesData}"
            .specificAmountsId="${this.specificAmountsId}"
            .priceType="${this.priceType}"
            .issuerData="${this._issuerData}"
            .timeFrequency="${this.timeFrequency}"
            @stock-information-bbva-trader-investment-detail-calculate-shares-request="${t=>{var e,i,a,r,n;this._calculateSharesDataType="sale",this.issuerSelect=null===(e=t.detail)||void 0===e?void 0:e.name,this.assetNumber=null===(i=t.detail)||void 0===i?void 0:i.description,this._getCalculateSharesTransactionMarginDataDm({type:"SALE",data:{id:null===(a=t.detail)||void 0===a?void 0:a.issuer,name:null===(r=t.detail)||void 0===r?void 0:r.name,number:null===(n=t.detail)||void 0===n?void 0:n.description}})}}"
            @stock-information-bbva-trader-daily-graph-frequency-select="${async()=>{this._typeDataInvestmentDetail="daily",await this.updateComplete,this._getInvestmentDetailDataDm(this.issuerId)}}"
            @stock-information-bbva-trader-historical-graph-frequency-select="${async()=>{this._typeDataInvestmentDetail="historic",await this.updateComplete,this._getInvestmentDetailDataDm(this.issuerId)}}"
            @stock-information-bbva-trader-purchase-and-sale-request-submit="${t=>{this.sendDetailToPurchaseAndSale(),this.navigateForward("stock-information-bbva-trader-purchase-and-sale-button-click",t.detail)}}"
          ></stock-information-bbva-trader-investment-detail>
        </div>
      </bbva-transition-container>
    `}_manageSearching(){this._searchingModalConfig=Dt({headerInfoText:"stock-information-bbva-trader-searching-header",fixedFooter:!0}),this._searchingModalVisible=!0}async _manageServiceError({service:t}){const e=t.replace(/-/g,"_");"GET_BALANCES"===e&&(this._getErrorModalConfig(e),this._retryErrorShow=!0,this._retriesConfig[e]+=1,this._getBalancesError=!0),"GET_INVESTMENT_LIST"===e&&(this._investmentListPaginationResponse={},this._listInvestmentData={},this._listInvestmentError=!0),"INVESTMENT_DETAIL_ERROR"===e&&(this._investmentDetailError=!0,this._investmentDetailData=[],await this.updateComplete),"SEARCHING_ERROR"===e&&(this._searchingError=!0),"ORDERS_ERROR"===e&&(this._orderListError=!0,await this.updateComplete,this._orderListError=!1),"ORDER_ERROR"===e&&(this._orderDetailError=!0,await this.updateComplete,this._orderDetailError=!1),this.clearLoader()}_getErrorModalConfig(t){const e={id:"product-detail-error-retry-request",description:this._renderRetryErrorBody("stock-information-bbva-trader-product-detail-error-modal-title","stock-information-bbva-trader-product-detail-error-modal-retry"),buttonText:"stock-information-bbva-trader-error-retry-button"},i={id:"product-detail-error-retry-call",description:this._renderRetryErrorBody("stock-information-bbva-trader-product-detail-error-modal-title","stock-information-bbva-trader-product-detail-error-modal-exit-operative"),buttonText:"stock-information-bbva-trader-error-retry-ma-attempts-button"},a={..."GET_BALANCES"===t&&this._retriesConfig[t]<this.errorTryNumber?e:i};return this._retryErrorConfig=kt(a),this._retryErrorConfig}get _renderVisualContent(){return this._retryErrorShow?this._renderRetryCommonError:n`
      ${this._renderProductDetail} ${this._renderInvestmentList} ${this._renderSearchingModal}
      ${this._renderOrderList} ${this._renderOrderDetail} ${this._renderInvestmentDetail}
    `}get _renderDm(){return n`
      <stock-information-bbva-trader-dm
        id="stock-information-bbva-trader-dm"
        country="${this.locale}"
        host="${this.host}"
        private-banking-portfolio-id="${this.privateBankingPortfolioId}"
        ?native="${this.native}"
        required-token="${this.requiredToken}"
        .localCustomProperties="${this.localCustomProperties}"
        get-balances-api-version="${this.getBalancesApiVersion}"
        get-orders-api-version="${this.getOrdersApiVersion}"
        calculate-shares-transaction-margin-api-version="${this.calculateSharesTransactionMarginApiVersion}"
        @stock-information-bbva-trader-dm-get-balances-respond="${this._handleGetBalancesResponse}"
        @stock-information-bbva-trader-dm-calculate-shares-transaction-margin-respond="${this._handleCalculateSharesResponse}"
        @stock-information-bbva-trader-dm-get-orders-respond="${this._handleGetOrdersResponse}"
        @stock-information-bbva-trader-dm-get-order-respond="${this._handleGetOrderResponse}"
        @stock-information-bbva-trader-dm-get-investment-list-respond="${this._handleGetInvestmentListResponse}"
        @stock-information-bbva-trader-dm-get-investment-list-pagination-respond="${this._handleInvestmentListPaginationResponse}"
        @stock-information-bbva-trader-dm-get-investment-detail-respond="${this._handleGetInvestmentDetailResponse}"
        @stock-information-bbva-trader-dm-get-search-respond="${this._handleSearchingResponse}"
        @stock-information-bbva-trader-dm-api-dm-error-get-balances-fetch-error="${t=>this._manageServiceError(t.detail)}"
        @stock-information-bbva-trader-dm-get-investment-list-fetch-error="${t=>this._manageServiceError(t.detail)}"
        @stock-information-bbva-trader-dm-api-dm-error-investment-detail-error-fetch-error="${t=>this._manageServiceError(t.detail)}"
        @stock-information-bbva-trader-dm-api-dm-error-searching-error-fetch-error="${t=>{this._manageServiceError(t.detail)}}"
        @stock-information-bbva-trader-dm-api-dm-error-orders-error-fetch-error="${t=>{this._manageServiceError(t.detail)}}"
        @stock-information-bbva-trader-dm-api-dm-error-order-error-fetch-error="${t=>{this._manageServiceError(t.detail)}}"
        @stock-information-bbva-trader-dm-get-orders-pagination-respond="${t=>{this._orderListPaginationResponse=t.detail}}"
      ></stock-information-bbva-trader-dm>
    `}render(){return n` ${super.render()} ${this._renderDm} ${this._renderVisualContent} `}}customElements.define(ne.is,ne);class se extends a{static get is(){return"bbva-analyticmanager-stock-information"}static get properties(){return{name:{type:String},gender:{type:String}}}constructor(){super(),this.gender=""}loginSuccess(t){this.gender=t.gender.name.toLowerCase()}issuerDetail(){this._dispatchCustomEvent("stock-information-page-view-issuer-detail",{gender:this.gender})}investmentBalance(){this._dispatchCustomEvent("stock-information-page-view-investment-balance")}myOrdersDetail(){this._dispatchCustomEvent("stock-information-page-view-my-orders-detail")}orderDetail(){this._dispatchCustomEvent("stock-information-page-view-order-detail")}appOnClickStart({buy:t}){t&&this._dispatchCustomEvent("stock-information-purchase-link-app-on-click-start"),t||this._dispatchCustomEvent("stock-information-sale-link-app-on-click-start")}_dispatchCustomEvent(t,e=!0,i=!0,a=!0){this.dispatchEvent(new CustomEvent(t,{bubbles:i,composed:a,detail:e,cancelable:!0}))}}customElements.define(se.is,se);
