import{z as t,an as e,L as i,h as a,i as n,aV as o,d_ as s,ak as r,d9 as d,cU as c,ah as l,aN as h}from"./952f98a9.js";import{v as u,D as m,a1 as p,Y as v,az as g,a5 as f,G as b,Z as _,aA as y,a2 as C,a6 as $,M as P,L as I,a4 as w,Q as x,a3 as T,K as E,I as S,H as O,ag as A,N as k,E as M,z as D,e as F,at as N,d as B}from"./216055dc.js";import{B as R,b as V}from"./30ef6f1f.js";import{B as L,b as q}from"./6b902eda.js";import{B as j,b as H}from"./d335c75d.js";import{aH as z,aI as U}from"./7f3d7ca9.js";import{B as G,a as W,b as K,c as J}from"./8bd0c9e1.js";import{B as Y,a as Z,b as Q,c as X,d as tt}from"./19a62a96.js";import{a as et}from"./e352c657.js";import{a as it,e as at}from"./41622877.js";import{B as nt,a as ot,b as st}from"./e145ee92.js";import{B as rt,a as dt,b as ct,c as lt,d as ht,e as ut}from"./ff7f0130.js";import{a as mt,B as pt,b as vt,c as gt}from"./e3d898b2.js";import{b as ft,B as bt}from"./41ed0536.js";import{B as _t,b as yt}from"./1f3b5ecf.js";import{B as Ct,b as $t}from"./187e605b.js";import"./854beed0.js";import"./84dff06e.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./eb966b2a.js";import"./53aa438e.js";class Pt extends nt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`financial-investments/v${this.version}/contracts-configurations/{contracts-configuration-id}`)}toString(){return super.toString("BGADPFinancialInvestmentsContractsConfigurationsContractsConfigurationPatchV1")}}class It extends ot{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`financial-investments/v${this.version}/contracts-configurations/{contracts-configuration-id}`)}toString(){return super.toString("BGADPFinancialInvestmentsContractsConfigurationsContractsConfigurationPatchV0")}}class wt extends it{static get is(){return"bbva-global-contracts-configuration-api-dm"}constructor(){super()}patchContractsConfiguration(t,e){const i={"contracts-configuration-id":t};this._generateGetService(this._getService("patch",e,i),{customEvent:"contracts-configuration-api-dm-update",errorFireEventHandler:"contracts-configuration-api-dm-update-error"})}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}ContractsConfiguration`,this._getBgadp(a))}_getBgadp(t){return{patchContractsConfigurationV0:()=>new It(t),patchContractsConfigurationV1:()=>new Pt(t),default:()=>"BGADP called not exist"}}}class xt extends G{constructor(t=null){super(Object.assign(t||{},{method:"PUT"}))}toString(t=""){return super.toString(t||"BGADPRequestPUT")}}class Tt extends W{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`net-worth/v${this.version}/configuration`)}toString(){return super.toString("BGADPNetWorthConfigurationGetV0")}}class Et extends xt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`net-worth/v${this.version}/configuration`)}toString(){return super.toString("BGADPNetWorthConfigurationPutV0")}}class St extends K{static get is(){return"bbva-global-configuration-net-worth-api-dm"}static get properties(){return{configuration:{type:Object,attribute:!1}}}constructor(){super(),this.configuration={}}resetConfiguration(){this.configuration={}}getConfiguration(t={}){if(Object.keys(this.configuration).length)return;this._generateGetService(this._getService("get",{},t),{customEvent:"configuration-net-worth-api-dm-fetch",errorFireEventHandler:"configuration-net-worth-api-dm-fetch-error"},this._responseMapping,t.fields)}putConfiguration(t){this._generateGetService(this._getService("put",t),{customEvent:"configuration-net-worth-api-dm-update",errorFireEventHandler:"configuration-net-worth-api-dm-update-error"},this._responseMapping),this.resetConfiguration()}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}Configuration`,this._getBgadp(a))}_getBgadp(t){return{getConfigurationV0:()=>new Tt(t),putConfigurationV0:()=>new Et(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}class Ot extends Y{constructor(t=null){super(Object.assign(t||{},{method:"DELETE"}))}toString(t=""){return super.toString(t||"BGADPRequestDELETE")}}class At extends Z{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`personal-finances/v${this.version}/pfms/{pfm-id}`)}toString(){return super.toString("BGADPPersonalFinancesPfmsPfmGetV1")}}class kt extends Q{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`personal-finances/v${this.version}/pfms/{pfm-id}`)}toString(){return super.toString("BGADPPersonalFinancesPfmsPfmPatchV1")}}class Mt extends Ot{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`personal-finances/v${this.version}/pfms/{pfm-id}`)}toString(){return super.toString("BGADPPersonalFinancesPfmsPfmDeleteV1")}}class Dt extends X{static get is(){return"bbva-global-pfm-api-dm"}static get properties(){return{pfm:{type:Object,attribute:!1}}}constructor(){super(),this.pfm={}}resetPfm(){this.pfm={}}getPfm(t,e={}){if(Object.keys(this.pfm).length)return;e=Object.assign({"pfm-id":t},e),this._generateGetService(this._getService("get",{},e),{customEvent:"pfm-api-dm-fetch",errorFireEventHandler:"pfm-api-dm-fetch-error"},this._responseMapping,e.fields)}patchPfm(t,e){const i={"pfm-id":t};this._generateGetService(this._getService("patch",e,i),{customEvent:"pfm-api-dm-update",errorFireEventHandler:"pfm-api-dm-update-error"},this._responseMapping),this.resetPfm()}deletePfm(t,e={}){e=Object.assign({"pfm-id":t},e),this._generateGetService(this._getService("delete",{},e),{customEvent:"pfm-api-dm-delete",errorFireEventHandler:"pfm-api-dm-delete-error"},this._responseMapping),this.resetPfm()}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}Pfm`,this._getBgadp(a))}_getBgadp(t){return{deletePfmV1:()=>new Mt(t),getPfmV1:()=>new At(t),patchPfmV1:()=>new kt(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}var Ft=t`
  :host {
    display: block;
    box-sizing: border-box;
  }

  *,
  *:before,
  *:after {
    box-sizing: inherit;
  }

  [data-tag-name='bbva-badge-default'] {
    margin-top: 0.5rem;
  }

  .header {
    display: flex;
    align-items: baseline;
    justify-content: space-between;
  }
  .header .title {
    min-width: 0;
    margin-right: 1rem;
  }

  .content {
    display: flex;
    justify-content: space-between;
    align-items: center;
  }
  .content.no-num-product {
    display: block;
  }
  .content [data-tag-name='bbva-clip-box'] {
    margin-right: 0.5rem;
  }
  .content .description {
    min-width: 0;
    margin-right: 1rem;
  }
  .content .secondary-description {
    flex: none;
  }
  .content .num-product {
    display: flex;
    align-items: center;
  }
`;class Nt extends(e(u(i))){static get is(){return"advice-fh-configuration-list-card"}static get scopedElements(){const t=[b,_,y,C,$,bt];return Nt.scopedElementsFromClasses(t)}static get properties(){return{title:{type:String},description:{type:String},secondaryDescription:{type:String,attribute:"secondary-description"},amount:{type:Number},language:{type:String},discreetMode:{type:Boolean,attribute:"discreet-mode"},currencyCode:{type:String,attribute:"currency-code"},icon:{type:String},productNumber:{type:String,attribute:"product-number"},badgeDefaultText:{type:String,attribute:"badge-default-text"},badgeTypeBlockedText:{type:Boolean,attribute:"badge-type-blocked-text"},iconAccessibilityText:{type:String,attribute:"icon-accessibility-text"},showZeroAmount:{type:Boolean,attribute:"show-zero-amount"},_group:{type:Array}}}constructor(){super(),this.amount=0,this.currencyCode="es-ES",this.productNumber="",this.badgeDefaultText="",this.secondaryDescription="",this.showZeroAmount=!1,this.badgeTypeBlockedText=!1}static get styles(){return[Ft,m.primaryAlt,p.primaryAlt,v.primaryAlt,g.primaryAlt,ft.primaryAlt,f.primaryAlt]}get _ofuscatedNumber(){return`• ${this.productNumber.slice(-4)}`}get _group(){return[{icon:`entity:${this.icon}`,accessibilityText:this.iconAccessibilityText||"BBVA",size:"s"}]}render(){return a`
      <div class="header">
        <bbva-type-text
          unset
          ellipsis
          class="title"
          tag="span"
          font-weight="500"
          size="S"
          text="${n(this.title)}"
        >
        </bbva-type-text>
        ${this.amount||this.showZeroAmount?a`
              <bbva-type-amount
                language="${this.language}"
                amount="${this.amount}"
                ?mask="${this.discreetMode}"
                currency-code="${this.currencyCode}"
                local-currency="${this.currencyCode}"
                variant="l"
                type="bold"
              >
              </bbva-type-amount>
            `:o}
      </div>
      <div class="content">
        ${this.icon&&this.productNumber&&a`
            <div class="num-product">
              <bbva-clip-box
                ambient="primary-alt"
                static-entity
                .group="${this._group}"
              ></bbva-clip-box>
              <bbva-badge-reference
                unset
                tag="span"
                size="S"
                font-style="italic"
                number="${this._ofuscatedNumber}"
                accessibility-text="${this.t("advice-fh-configuration-tab-accesibility-product-number",{number:this.productNumber.slice(-4)})}"
              >
              </bbva-badge-reference>
            </div>
          `||o}
        ${this.description&&a`
            <bbva-type-text
              unset
              ellipsis
              class="description"
              tag="span"
              size="S"
              text="${this.description}"
            >
            </bbva-type-text>
          `||o}

        <bbva-type-text
          unset
          tag="span"
          size="S"
          class="secondary-description"
          text="${this.secondaryDescription}"
        >
        </bbva-type-text>
      </div>
      ${this.badgeDefaultText&&a`
          <bbva-badge-default
            text="${this.badgeDefaultText}"
            type="${this.badgeTypeBlockedText?"error":"neutral"}"
          >
          </bbva-badge-default>
        `||o}
    `}}var Bt=t`
  :host {
    display: block;
    box-sizing: border-box;
    padding: 1rem 0;
  }

  [data-tag-name='bbva-type-text'] {
    padding: 0.5rem 1rem;
  }
  [data-tag-name='bbva-type-text'][loading] {
    margin: 0.5rem 1rem;
  }

  [data-tag-name='bbva-form-container'] [data-tag-name='bbva-form-toggle-input'] [slot='left'] {
    padding: 1rem;
  }
  [data-tag-name='bbva-form-container']
    [data-tag-name='bbva-form-toggle-input']
    [slot='left']
    [data-tag-name='bbva-type-text'] {
    padding: 0;
  }

  [data-tag-name='bbva-header-category'] {
    padding: 0.5rem 1rem;
  }
  [data-tag-name='bbva-header-category'][loading] {
    margin: 0.5rem 1rem;
  }

  [data-tag-name='bbva-form-select'] {
    margin: 0.5rem 1rem 1.5rem 1rem;
  }

  [data-tag-name='bbva-notification-message'] {
    margin: 1rem 0.625rem;
  }
`;class Rt extends(P(I(e(i)))){static get is(){return"advice-fh-configuration-products"}static get scopedElements(){const t=[b,C,L,rt,mt,pt,dt,ct,w,x,Nt,...Rt.configurationScopedElements()];return Rt.scopedElementsFromClasses(t)}static get properties(){return{amountsAvailable:{type:Array,attribute:"amounts-available"},creditCardClassification:{type:String,attribute:"credit-card-classification"},prepaidCardClassification:{type:String,attribute:"prepaid-card-classification"},pfmId:{type:Object,attribute:"pfm-id"},discreetMode:{type:Boolean,attribute:"discreet-mode"},financialOverviewData:{type:Array},retailFinancialOverviewData:{type:Array},enableForecast:{type:Boolean,attribute:"enable-forecast"},pfmData:{type:Object},entitiesImages:{type:Object,attribute:"entities-images"},channelId:{type:String,attribute:"channel-Id"},debitCardType:{type:String,attribute:"debit-card-type"},currency:{type:String},hideForecasting:{type:Boolean,attribute:"hide-forecasting"},hideNotificationMessage:{type:Boolean,attribute:"hide-notification-message"},statusOperative:{type:String,attribute:"status-operative"},useExternalProducts:{type:Boolean,attribute:"use-external-products"},useInactiveProducts:{type:Boolean,attribute:"use-inactive-products"},webSelector:{type:Boolean,attribute:"web-selector"},_enableInactiveProducts:{type:Boolean,attribute:"enable-inactive-products"},_initDay:{type:Number},_selectedPeriod:{type:Number}}}static get styles(){return[Bt,m.primaryAlt,q.primaryAlt,p.primaryAlt,T.primaryAlt,lt.primaryAlt,vt.primaryAlt,gt.primaryAlt,ht.primaryAlt,ut.primaryAlt]}constructor(){super(),this._selectedPeriod=0,this.enableForecast=!1,this._enableInactiveProducts=!1,this.channelId="BBVANet",this.debitCardType="DEBIT_CARD",this.useExternalProducts=!1,this.amountsAvailable=["availableBalance","BALANCE"],this.currency="EUR",this._initDay=2,this.hideForecasting=!1,this.hideNotificationMessage=!1,this.statusOperative="OPERATIVE",this.useInactiveProducts=!1,this.webSelector=!1}get _contracts(){var t,e;return null===(t=this.financialOverviewData)||void 0===t||null===(e=t.contracts)||void 0===e?void 0:e.filter((t=>t.userAccessControl.find((t=>t.channel.id===this.channelId)).isVisible))}get _internalAccounts(){var t;return(null===(t=this._contracts)||void 0===t?void 0:t.filter((({productType:t})=>"ACCOUNT"===t)))||[]}get _inactiveProductsNumber(){return this.useInactiveProducts?this._contracts.reduce(((t,e)=>t+("CARD"===e.productType&&this._isproductInactive(e.status)&&this._isClassificationActive(e.productType,e.classification)?1:0)),0):0}_isproductInactive(t){var e;return(null==t?void 0:t.id)&&(null==t||null===(e=t.id)||void 0===e?void 0:e.toUpperCase())!==this.statusOperative}_isClassificationActive(t,e){var i,a,n,o;return"CARD"===t&&(null==e||null===(i=e.level)||void 0===i||null===(a=i[1])||void 0===a?void 0:a.internalCode)===this.creditCardClassification||"CARD"===t&&(null==e||null===(n=e.level)||void 0===n||null===(o=n[1])||void 0===o?void 0:o.internalCode)===this.prepaidCardClassification}get _internalCards(){var t;return(null===(t=this._contracts)||void 0===t?void 0:t.filter((({productType:t,classification:e,status:i})=>(this._enableInactiveProducts||!this._enableInactiveProducts&&!this._isproductInactive(i))&&this._isClassificationActive(t,e))))||[]}get _externalAccounts(){var t;return null===(t=this.retailFinancialOverviewData)||void 0===t?void 0:t.reduce(((t,e)=>{var i;let{contracts:a}=e.externalFinancialEntity;return a=null===(i=a)||void 0===i?void 0:i.filter((({detail:t})=>"ACCOUNT"===t.productType)),a&&t.push(...a.map((t=>({...t,isExternal:!0,aggregatedEntityId:e.aggregatedEntityId,entityName:e.externalFinancialEntity.name})))),t}),[])}get _externalCards(){var t;return null===(t=this.retailFinancialOverviewData)||void 0===t?void 0:t.reduce(((t,e)=>{var i;let{contracts:a}=e.externalFinancialEntity;return a=null===(i=a)||void 0===i?void 0:i.filter((({detail:t})=>"CARD"===t.productType&&t.cardType&&t.cardType.id!==this.debitCardType)),a&&t.push(...a.map((t=>({...t,isExternal:!0,aggregatedEntityId:e.aggregatedEntityId,entityName:e.externalFinancialEntity.name})))),t}),[])}get _relatedContracts(){var t,e;return null===(t=this.pfmData)||void 0===t||null===(e=t.relatedContracts)||void 0===e?void 0:e.map((({contractId:t})=>t))}get _disableOne(){return 1===[...this._internalAccounts.filter((t=>this._relatedContracts.includes(t.id))),...this._internalCards.filter((t=>this._relatedContracts.includes(t.id)))].length}get _accountsList(){const t=[...this._internalAccounts,...this._externalAccounts];return t.length&&this._relatedContracts?a`
      ${t.map(((e,i)=>this._toggleItem(e,i!==t.length-1,"account")))}
    `:o}get _cardsList(){const t=[...this._internalCards,...this._externalCards];return t.length&&this._relatedContracts?a`
      ${t.map(((e,i)=>this._toggleItem(e,i!==t.length-1,"card")))}
    `:o}_dispatchCustomEvent(t,e=!0,i=!0,a=!0){this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:i,composed:a}))}_getParticipant(t){var e,i;if(this._isproductInactive(t.status))return this.t("advice-fh-configuration-products-participant-inactive");return{HOLDER:this.t("advice-fh-configuration-products-participant-holder"),AUTHORIZED:this.t("advice-fh-configuration-products-participant-authorized")}[null===(e=t.participant)||void 0===e||null===(i=e.participantType)||void 0===i?void 0:i.id]||""}_toggleItem(t,e,i){var o,r;const d=t;d.checked=this._relatedContracts.includes(d.id);const{amounts:c}=(null===(o=d.detail.specificAmounts)||void 0===o?void 0:o.find((t=>this.amountsAvailable.includes(t.id))))||{amounts:[]},l=d.alias||d.name||d.product.description,h=d.aggregatedEntityId||(null===(r=d.bank)||void 0===r?void 0:r.id),[u]=c;let m,p;var v;h&&(m=null===(v=this.entitiesImages)||void 0===v?void 0:v[h],m&&(p=null==s?void 0:s[`entity${m}`]()));return a`
      <bbva-form-toggle-input
        vertical-align-top
        ambient="primary-alt"
        alignment="right"
        slot="_option"
        name="${d.id}"
        value="${d.id}"
        ?disabled="${this._disableOne&&d.checked&&!d.isExternal}"
        divider-size="${e?"fit":""}"
        @change="${()=>{d.checked=!d.checked,this.requestUpdate(),this._dispatchCustomEvent("advice-fh-configuration-products-toggle-item",{...d,checked:d.checked})}}"
        ?checked="${this._relatedContracts.includes(d.id)}"
      >
        <div slot="left">
          <advice-fh-configuration-list-card
            title="${l}"
            secondary-description="${this.t(`advice-fh-configuration-available-${i}`)}"
            amount="${(null==u?void 0:u.amount)||0}"
            badge-default-text="${this._getParticipant(d)}"
            ?badge-type-blocked-text="${this._isproductInactive(d.status)}"
            product-number="${d.number}"
            currency-code="${(null==u?void 0:u.currency)||this.currency}"
            local-currency="${(null==u?void 0:u.currency)||this.currency}"
            ?discreet-mode="${this.discreetMode}"
            language="${this.language}"
            icon="${n(p)}"
            show-zero-amount
            icon-accessibility-text="${n(d.entityName)}"
          >
          </advice-fh-configuration-list-card>
        </div>
      </bbva-form-toggle-input>
    `}get _accounts(){return this._loading?o:a`
      <bbva-form-container
        label-out="${this.t("advice-fh-configuration-products-select-accounts")}"
        label-out-tag="h3"
      >
        ${this._accountsList}
      </bbva-form-container>
    `}get _cards(){return this._loading?o:a`
      <bbva-form-container
        label-out-tag="h3"
        label-out="${this.t("advice-fh-configuration-products-select-cards")}"
      >
        ${this._cardsList}
      </bbva-form-container>
    `}get _loading(){return!this.pfmData||0===Object.keys(this.financialOverviewData).length||this.useExternalProducts&&!this.retailFinancialOverviewData}get _periodTmpl(){return a`
      <bbva-header-category
        ambient="primary-alt"
        heading-level="2"
        text="${this.t("advice-fh-configuration-products-my-month")}"
      ></bbva-header-category>
      <bbva-form-select
        ambient="primary-alt"
        ?native-selector="${!this.webSelector}"
        info-title="${this.t("advice-fh-configuration-products-my-month-info")}"
        selector-aria-label="${this.t("advice-fh-configuration-products-my-month-select-label-title")}"
        ?disabled="${0!==this._selectedPeriod}"
        label="${this.t("advice-fh-configuration-products-my-month-select-label-title")}"
        @change="${t=>{var e;this._initDay=Number(null===(e=t.target)||void 0===e?void 0:e.value),this._dispatchCustomEvent("advice-fh-configuration-products-period-change",this._initDay)}}"
        help-icon="bbva:help"
      >
        ${new Array(31).fill(0,0,31).map(((t,e)=>{var i,n;return a`
            <bbva-form-option
              ?selected="${e+1===(null===(i=this.pfmData)||void 0===i||null===(n=i.frequency)||void 0===n?void 0:n.daysOfMonth[0])}"
              value="${e+1}"
              >${this.t("advice-fh-configuration-products-my-month-select-label",{day:e+1})}</bbva-form-option
            >
          `}))}
      </bbva-form-select>
    `}get _forecastTmpl(){return a`
      <bbva-header-category
        ambient="primary-alt"
        heading-level="2"
        text="${this.t("advice-fh-configuration-products-forecast-title")}"
      ></bbva-header-category>
      <bbva-type-text
        unset
        size="S"
        tag="span"
        text="${this.t("advice-fh-configuration-products-forecast-description")}"
      >
      </bbva-type-text>
      <bbva-form-container ambient="primary-alt">
        <bbva-form-toggle-input
          alignment="right"
          name="forecast"
          value="forecast"
          slot="_option"
          @change="${()=>{this.enableForecast=!this.enableForecast,this._dispatchCustomEvent("advice-fh-configuration-products-forecast-toggle",this.enableForecast)}}"
          ?checked="${this.enableForecast}"
        >
          <div slot="left">
            <bbva-type-text
              ellipsis
              tag="span"
              size="S"
              text="${this.t("advice-fh-configuration-forecast-toggle-label")}"
            ></bbva-type-text>
          </div>
        </bbva-form-toggle-input>
      </bbva-form-container>
    `}get _notificationMessageTmpl(){return a`
      <bbva-notification-message
        variant="default"
        ?loading="${this._loading}"
        link-title="${this.t("advice-fh-configuration-know-more-message-link-text")}"
        @notification-message-link-click="${()=>{this._dispatchCustomEvent("advice-fh-configuration-know-more-modal-open")}}"
      >
        ${this.t("advice-fh-configuration-know-more-message-text")}
      </bbva-notification-message>
    `}render(){return a`
      <bbva-header-category
        ambient="primary-alt"
        heading-level="2"
        ?loading="${this._loading}"
        text="${this.t("advice-fh-configuration-products-title")}"
      ></bbva-header-category>
      <bbva-type-text
        unset
        size="S"
        ?loading="${this._loading}"
        tag="span"
        text="${this.t("advice-fh-configuration-products-desription")}"
      >
      </bbva-type-text>

      ${this.useInactiveProducts?a` <bbva-form-toggle-input
            alignment="right"
            name="inactiveProducts"
            value="forecast"
            slot="_option"
            @change="${()=>{this._enableInactiveProducts=!this._enableInactiveProducts,this._dispatchCustomEvent("advice-fh-configuration-products-inactive-products-toggle",this._enableInactiveProducts)}}"
            ?checked="${this._enableInactiveProducts}"
          >
            <div slot="left">
              <bbva-type-text
                ellipsis
                tag="span"
                size="S"
                text="${this.t("advice-fh-configuration-inactive-products-toggle-label",{inactiveProducts:this._inactiveProductsNumber})}"
              ></bbva-type-text>
            </div>
          </bbva-form-toggle-input>`:o}
      ${this._accounts} ${this._cards}
      ${this.hideNotificationMessage?o:this._notificationMessageTmpl} ${this._periodTmpl}
      ${this.hideForecasting?o:this._forecastTmpl}
    `}}var Vt=t`
  :host {
    display: block;
    box-sizing: border-box;
    padding: 1rem 0;
  }

  .fit {
    display: block;
    margin: 0 1rem;
  }

  [data-tag-name='bbva-header-category'],
  [data-tag-name='bbva-type-text'] {
    padding: 0.5rem 1rem;
  }

  [data-tag-name='bbva-notification-message'] {
    margin: 0 1rem;
  }

  .wrapper-assert {
    display: flex;
    justify-content: space-between;
    padding: 1rem;
  }
  .wrapper-assert [data-tag-name='advice-fh-configuration-list-card'] {
    width: 100%;
    min-width: 0;
  }
  .wrapper-assert [data-tag-name='bbva-form-toggle'] {
    margin-left: 1rem;
    width: auto;
  }

  [data-tag-name='bbva-type-link'] {
    padding: 1rem;
  }

  .with-home [data-tag-name='bbva-type-link'] {
    padding: 0 1rem 1rem;
  }

  .without-home {
    display: flex;
    margin: 1rem;
  }
  .without-home [data-tag-name='bbva-clip-microillustration'] {
    margin-right: 1.5rem;
  }
  .without-home-description {
    text-align: left;
  }
`;const Lt="ENABLED";class qt extends(P(I(e(i)))){static get is(){return"advice-fh-configuration-home"}static get scopedElements(){const t=[C,E,_t,S,w,O,x,b,Nt,...qt.configurationScopedElements()];return qt.scopedElementsFromClasses(t)}static get properties(){return{configuration:{type:Object},goods:{type:Object}}}static get styles(){return[Vt,A,p.primaryAlt,k.primaryAlt,yt.primaryAlt,m.primaryAlt,M.primaryAlt,T.primaryAlt,D.primaryAlt,r("advice-fh-configuration-shared-styles")]}constructor(){super(),this.productsModal=!1}static _tplText({text:t,tag:e,fontWeight:i,className:o,size:s="S"}){return a`
      <bbva-type-text
        unset
        class="${n(o)}"
        size="${s}"
        tag="${n(e)}"
        text="${t}"
        font-weight="${n(i)}"
      ></bbva-type-text>
    `}static _tplLink(t,e,i,o){return a`
      <bbva-type-link
        class="${n(o)}"
        icon="${n(i)}"
        @click="${e}"
      >
        <span>${t}</span>
      </bbva-type-link>
    `}static _isEnabled({status:t}){return(null==t?void 0:t.id)===Lt}_clickHomeToggle(t,e){this._dispatchCustomEvent("advice-fh-configuration-home-toggle",{home:t,ev:e})}_clickEditOwnership(t){this._dispatchCustomEvent("advice-fh-configuration-edit-ownership-modal-open",t)}_dispatchCustomEvent(t,e=!0,i=!0,a=!0){this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:i,composed:a}))}_tplHomeToggleList(t,e){return a`
      <div class="wrapper-assert">
        <advice-fh-configuration-list-card
          title="${t.alias}"
          description="${t.description||""}"
          secondary-description="${this.t("advice-fh-configuration-home-ownership",{ownership:t.ownership})}"
          amount="${null==e?void 0:e.amount}"
          currency-code="${null==e?void 0:e.currency}"
          local-currency="${null==e?void 0:e.currency}"
          language="${this.language}"
        >
        </advice-fh-configuration-list-card>
        <bbva-form-toggle
          label="${this.t("advice-fh-configuration-toggle-label")}"
          ?checked="${qt._isEnabled(t)}"
          @form-toggle-switch-change="${e=>this._clickHomeToggle(t,e)}"
        ></bbva-form-toggle>
      </div>
      ${qt._tplLink(this.t("advice-fh-configuration-home-ownership-edit-button"),(()=>{this._clickEditOwnership(t)}),"","edit-ownership")}
    `}_tplHomesBlock(){var t,e,i;return a`
      <bbva-header-category
        heading-level="2"
        text="${this.t("advice-fh-configuration-homes-title")}"
      ></bbva-header-category>
      ${qt._tplText({text:this.t("advice-fh-configuration-homes-text")})}
      ${(null===(t=this.configuration)||void 0===t||null===(e=t.goods)||void 0===e?void 0:e.filter((t=>"BUILDING"===t.goodType.id)).length)>0?a`
            ${qt._tplText({text:this.t("advice-fh-configuration-products-select-homes"),tag:"span",fontWeight:"500",className:"title"})}
            <div class="with-home">
              ${null===(i=this.configuration)||void 0===i?void 0:i.goods.map(((t,e,i)=>{var n,s,r,d;return a`
                  ${this._tplHomeToggleList(t,null===(n=this.goods)||void 0===n||null===(s=n.find((({id:e})=>e===t.id)))||void 0===s||null===(r=s.goodDetails.historicalPrices)||void 0===r||null===(d=r[0])||void 0===d?void 0:d.amounts[0])}
                  ${e!==i.length-1?a` <bbva-divider-default class="fit"></bbva-divider-default> `:o}
                `}))}
              ${qt._tplLink(this.t("advice-fh-configuration-add-homes-button-text"),(()=>this._dispatchCustomEvent("advice-fh-configuration-add-homes-link-click")),d(),"add-homes")}
            </div>
          `:a`
            <div class="without-home">
              <bbva-clip-microillustration
                disabled-tabindex
                alt-microillustration="home_euro"
                alt-image="${this.t("advice-fh-configuration-homes-label")}"
                size="S"
              ></bbva-clip-microillustration>
              <div class="without-home-description">
                ${qt._tplText({size:"L",text:this.t("advice-fh-configuration-homes-label"),fontWeight:"500"})}
                ${qt._tplText({text:this.t("advice-fh-configuration-add-homes-text")})}
                ${qt._tplLink(this.t("advice-fh-configuration-add-homes-button-text"),(()=>this._dispatchCustomEvent("advice-fh-configuration-add-homes-link-click")))}
              </div>
            </div>
          `}
    `}render(){return a`
      ${this._tplHomesBlock()}
      <bbva-notification-message
        variant="default"
        link-title="${this.t("advice-fh-configuration-know-more-message-link-text")}"
        @notification-message-link-click="${()=>{this._dispatchCustomEvent("advice-fh-configuration-know-more-modal-open")}}"
      >
        ${this.t("advice-fh-configuration-know-more-message-text")}
      </bbva-notification-message>
    `}}var jt=t`
  :host {
    display: block;
    box-sizing: border-box;
    padding: 1rem 0;
  }

  .wrapper-assert {
    display: flex;
    justify-content: space-between;
    padding: 1rem;
  }
  .wrapper-assert [data-tag-name='bbva-form-toggle'] {
    margin-left: 1rem;
    width: auto;
  }
  .wrapper-assert [data-tag-name='bbva-type-text'] {
    padding: 0;
  }

  [data-tag-name='bbva-type-text'] {
    padding: 0.5rem 1rem;
  }
  [data-tag-name='bbva-type-text'][loading] {
    margin: 0.5rem 1rem;
  }

  [data-tag-name='bbva-form-container'] {
    padding-bottom: 1rem;
  }
  [data-tag-name='bbva-form-container'] [data-tag-name='bbva-form-toggle-input'] [slot='left'] {
    padding: 1rem;
  }
  [data-tag-name='bbva-form-container']
    [data-tag-name='bbva-form-toggle-input']
    [slot='left']
    [data-tag-name='bbva-type-text'] {
    padding: 0;
  }
  [data-tag-name='bbva-form-container'] [data-tag-name='bbva-form-control-input'] [slot='right'] {
    padding: 0.5rem 1rem 0.5rem 0.5rem;
    align-self: center;
  }
  [data-tag-name='bbva-form-container']
    [data-tag-name='bbva-form-control-input']
    [slot='right']
    [data-tag-name='bbva-type-text'] {
    padding: 0;
  }

  [data-tag-name='bbva-header-category'] {
    padding: 0.5rem 1rem;
  }
  [data-tag-name='bbva-header-category'][loading] {
    margin: 0.5rem 1rem;
  }

  [data-tag-name='bbva-form-select'] {
    margin: 0 1rem;
  }

  [data-tag-name='bbva-notification-message'] {
    margin: 1rem 0.625rem;
  }
`;const Ht=["balance","money","disposedBalance","currentBalance","availableBalance","equity","premium","accumulatedSavings","pendingAmount","consolidatedRights","premiumInvested","insurancePremium","premiumAmount","accumulatedSaving"],zt={0:{id:"year-to-date",label:"advice-fh-configuration-investments-period-select-year-to-date",labelShort:"advice-fh-configuration-investments-period-select-year-to-date",numberMonths:0,type:"year",valueForType:0},1:{id:"one-month",label:"advice-fh-configuration-investments-period-select-one-month",labelShort:"advice-fh-configuration-investments-period-select-one-month-short",numberMonths:1,type:"months",valueForType:1},3:{id:"three-months",label:"advice-fh-configuration-investments-period-select-three-months",labelShort:"advice-fh-configuration-investments-period-select-three-months-short",numberMonths:3,type:"months",valueForType:3},12:{id:"one-year",label:"advice-fh-configuration-investments-period-select-one-year",labelShort:"advice-fh-configuration-investments-period-select-one-year",numberMonths:12,type:"year",valueForType:1},24:{id:"two-years",label:"advice-fh-configuration-investments-period-select-two-years",labelShort:"advice-fh-configuration-investments-period-select-two-years",numberMonths:24,type:"year",valueForType:2},99:{id:"start-investment",label:"advice-fh-configuration-investments-period-select-start-investment",labelShort:"advice-fh-configuration-investments-period-select-start-investment",numberMonths:99,type:null,valueForType:0}},Ut=[zt[1],zt[3],zt[0],zt[12],zt[24],zt[99]],Gt={DEPOSIT:{id:"DEPOSIT",label:"advice-fh-configuration-investments-select-deposits",nameClickEvent:"advice-fh-configuration-investments-select-deposit-click"},INVESTMENT_FUND:{id:"INVESTMENT_FUND",label:"advice-fh-configuration-investments-select-funds",nameClickEvent:"advice-fh-configuration-investments-select-fund-click"},SECURITY_ACCOUNT:{id:"SECURITY_ACCOUNT",label:"advice-fh-configuration-investments-select-securities-accounts",nameClickEvent:"advice-fh-configuration-investments-select-stock-account-click"},SAVING_PLAN:{id:"SAVING_PLAN",label:"advice-fh-configuration-investments-select-saving-plans",nameClickEvent:"advice-fh-configuration-investments-select-saving-plan-click"},RETIREMENT_PLAN:{id:"RETIREMENT_PLAN",label:"advice-fh-configuration-investments-select-retirement-plans",nameClickEvent:"advice-fh-configuration-investments-select-retirement-plan-click"},PORTFOLIO:{id:"PORTFOLIO",label:"advice-fh-configuration-investments-select-portfolios",nameClickEvent:"advice-fh-configuration-investments-select-portfolio-click"},PRIVATE_BANKING_ASESORATED_PORTFOLIO:{id:"PRIVATE_BANKING_ASESORATED_PORTFOLIO",label:"advice-fh-configuration-investments-select-advised-portfolios",nameClickEvent:"advice-fh-configuration-investments-select-private-banking-advised-portfolio-click"},PRIVATE_BANKING_MANAGED_PORTFOLIO:{id:"PRIVATE_BANKING_MANAGED_PORTFOLIO",label:"advice-fh-configuration-investments-select-managed-portfolios",nameClickEvent:"advice-fh-configuration-investments-select-private-banking-managed-portfolio-click"},WEALTH_DEPOSITARY_PORTFOLIO:{id:"WEALTH_DEPOSITARY_PORTFOLIO",label:"advice-fh-configuration-investments-select-wealth-depository-portfolios",nameClickEvent:"advice-fh-configuration-investments-select-wealth-depository-portfolio-click"},MANAGED_INVESTMENTFUNDS_PORTFOLIO:{id:"MANAGED_INVESTMENTFUNDS_PORTFOLIO",label:"advice-fh-configuration-investments-select-managed-funds-portfolios",nameClickEvent:"advice-fh-configuration-investments-select-managed-funds-portfolio-click"},SAVING_INSURANCE_EMPLOYEE:{id:"SAVING_INSURANCE_EMPLOYEE",label:"advice-fh-configuration-investments-select-employee-saving-insurance",nameClickEvent:"advice-fh-configuration-investments-select-employee-saving-insurance-click"}},Wt=Object.values(Gt),Kt={id:"balance",amounts:[{amount:0,currency:"EUR"}]},Jt={"00013":"PRIVATE_BANKING_MANAGED_PORTFOLIO","00012":"PRIVATE_BANKING_ASESORATED_PORTFOLIO","00075":"WEALTH_DEPOSITARY_PORTFOLIO"},Yt=[25,50,75,100],Zt=[1,2,3],Qt="ENABLED",Xt="DISABLED";class te extends(P(I(e(i)))){static get is(){return"advice-fh-configuration-investments"}static get scopedElements(){const t=[Ct,b,O,rt,dt,ct,w,Nt,...te.configurationScopedElements()];return te.scopedElementsFromClasses(t)}static get properties(){return{maxVisibleOnCollapsed:{type:Number,attribute:"max-visible-on-collapsed"},_contractsConfiguration:{type:Object,state:!0},_internalInvestmentsContracts:{type:Array,state:!0},_isPeriodModifiable:{type:Boolean,state:!0},_selectedPeriod:{type:Number,state:!0},_showAll:{type:Boolean,state:!0}}}static get styles(){return[jt,$t.primaryAlt,m.primaryAlt,T.primaryAlt,lt.primaryAlt,ht.primaryAlt,ut.primaryAlt,D.primaryAlt]}constructor(){super(),this._visibleProducts=0,this._selectedPeriod=null,this._contractsConfiguration={hasHistoricalDataForAllContracts:!1,maximumHistoricalDate:null,startDate:null,endDate:null,number:null},this._showAll=!1,this._isPeriodModifiable=!1,this.maxVisibleOnCollapsed=3}updated(){this._visibleProducts=0}get _lists(){return Object.keys(Gt).map((t=>this._list(Gt[t])))}get _loading(){var t;return 0===(null===(t=this._internalInvestmentsContracts)||void 0===t?void 0:t.length)}get _selectedPeriodText(){var t;return zt[this._selectedPeriod]?this.t(null===(t=zt[this._selectedPeriod])||void 0===t?void 0:t.label):""}get _isModifyPeriodDisabled(){var t;return this._isPeriodModifiable=null===(t=this._internalInvestmentsContracts)||void 0===t?void 0:t.some((t=>t.isVisible)),!this._isPeriodModifiable}_getParticipant(t){var e,i;return{HOLDER:this.t("advice-fh-configuration-products-participant-holder"),AUTHORIZED:this.t("advice-fh-configuration-products-participant-authorized")}[null===(e=t.participant)||void 0===e||null===(i=e.participantType)||void 0===i?void 0:i.id]||""}_toggleItem(t,e){if(this._showAll||this._visibleProducts<this.maxVisibleOnCollapsed){var i,r;this._visibleProducts+=1;const o=t,c=(null===(i=o.marketerEntity)||void 0===i?void 0:i.id)||(null===(r=o.bank)||void 0===r?void 0:r.id);let l,h;var d;if(c)l=null===(d=this.entitiesImages)||void 0===d?void 0:d[c],l&&(h=null==s?void 0:s[`entity${l}`]());return a`
        <bbva-form-toggle-input
          vertical-align-top
          ambient="primary-alt"
          alignment="right"
          slot="_option"
          name="${o.id}"
          ?value="${o.isVisible}"
          divider-size="${e?"fit":""}"
          @change="${()=>{o.isVisible=!o.isVisible,this._isPeriodModifiable=this._isModifyPeriodDisabled,this._dispatchCustomEvent("advice-fh-configuration-investments-toggle-change")}}"
          ?checked="${o.isVisible}"
        >
          <div slot="left">
            <advice-fh-configuration-list-card
              title="${o.name}"
              amount="${o.amount}"
              badge-default-text="${this._getParticipant(o)}"
              product-number="${o.numberToShow}"
              currency-code="${o.currency}"
              local-currency="${o.currency}"
              icon="${n(h)}"
              icon-accessibility-text="${n(o.entityName)}"
              .language="${this.language}"
              ?discreet-mode="${this.discreetMode}"
              ?show-zero-amount="${o.showZeroAmount}"
            >
            </advice-fh-configuration-list-card>
          </div>
        </bbva-form-toggle-input>
      `}return o}_list(t){if(this._showAll||this._visibleProducts<this.maxVisibleOnCollapsed){const e=this._internalInvestmentsContracts.filter((({productType:e})=>e===t.id)).sort(((t,e)=>e.amount-t.amount));return e.length?a`
        <bbva-form-container label-out-tag="h3" label-out="${this.t(t.label)}">
          ${e.map(((t,i)=>this._toggleItem(t,i!==e.length-1)))}
        </bbva-form-container>
      `:o}return o}_linkExpandableClick(t){this._showAll=t.detail}static _tplText({text:t,tag:e,fontWeight:i,className:o,size:s="S"}){return a`
      <bbva-type-text
        unset
        class="${n(o)}"
        size="${s}"
        tag="${n(e)}"
        text="${t}"
        font-weight="${n(i)}"
      ></bbva-type-text>
    `}static _tplLink(t,e,i,o,s){return a`
      <bbva-type-link
        class="${n(s)}"
        icon="${n(o)}"
        ?disabled="${i}"
        @click="${e}"
      >
        <span>${t}</span>
      </bbva-type-link>
    `}_expandableTemplate(){var t;return(null===(t=this._internalInvestmentsContracts)||void 0===t?void 0:t.length)<=this.maxVisibleOnCollapsed?o:a`
      <bbva-expandable-panel
        id="see-more-controls"
        aria-controls="see-more-controls"
        text-unexpanded="advice-fh-configuration-investments-expand"
        text-expanded="advice-fh-configuration-investments-collapse"
        ?expanded="${!1}"
        @expandable-panel-expand="${t=>this._linkExpandableClick(t)}"
      ></bbva-expandable-panel>
    `}render(){return a`
      <bbva-header-category
        ambient="primary-alt"
        heading-level="2"
        ?loading="${this._loading}"
        text="${this.t("advice-fh-configuration-investments-title")}"
      >
      </bbva-header-category>
      <bbva-type-text
        unset
        size="S"
        ?loading="${this._loading}"
        tag="span"
        text="${this.t("advice-fh-configuration-investments-description")}"
      >
      </bbva-type-text>

      ${this._lists} ${this._expandableTemplate()}

      <bbva-header-category
        ambient="primary-alt"
        heading-level="2"
        ?loading="${this._loading}"
        text="${this.t("advice-fh-configuration-investments-period-title")}"
      >
      </bbva-header-category>

      <div class="wrapper-assert">
        ${te._tplText({text:this._selectedPeriodText,fontWeight:"500"})}
        ${te._tplLink(this.t("advice-fh-configuration-investments-modify-period-link"),(()=>this._dispatchCustomEvent("advice-fh-configuration-investments-open-select-period-modal")),this._isModifyPeriodDisabled)}
      </div>
    `}}var ee=t`
  :host {
    display: block;
    box-sizing: border-box;
  }

  *,
  *:before,
  *:after {
    box-sizing: inherit;
  }
`,ie=t`
  #modal-know-more [data-tag-name='bbva-clip-microillustration'] {
    margin-left: auto;
    margin-right: auto;
    width: -webkit-max-content;
    width: max-content;
  }
  #modal-know-more [data-tag-name='bbva-type-text'] {
    margin: 0.5rem 0;
  }
  #modal-know-more [data-tag-name='bbva-list-bullet'] {
    padding: 0.5rem 0;
  }
  #modal-know-more [role='list'] {
    margin-top: 1.5rem;
  }
  #modal-know-more [role='list'] [role='listitem'] {
    position: relative;
  }

  #modal-edit-ownership,
  #modal-select-investments-period {
    --bbva-help-modal-padding: 0;
  }
  #modal-edit-ownership .fit,
  #modal-select-investments-period .fit {
    display: block;
    margin: 0 1rem;
  }
  #modal-edit-ownership [data-tag-name='bbva-header-category'],
  #modal-select-investments-period [data-tag-name='bbva-header-category'] {
    padding: 0.5rem 1rem;
  }
  #modal-edit-ownership [data-tag-name='bbva-type-text'],
  #modal-select-investments-period [data-tag-name='bbva-type-text'] {
    padding: 0.5rem 1rem 1.5rem;
  }
  #modal-edit-ownership [data-tag-name='bbva-type-text'].form-title,
  #modal-select-investments-period [data-tag-name='bbva-type-text'].form-title {
    padding-bottom: 0.5rem;
  }
  #modal-edit-ownership [data-tag-name='bbva-form-input'],
  #modal-select-investments-period [data-tag-name='bbva-form-input'] {
    margin: 1.5rem 1rem 0;
  }

  #modal-products {
    --bbva-help-modal-padding: 0;
  }
  #modal-products [data-tag-name='bbva-type-text'] {
    margin: 0.5rem 1rem;
  }
`;const{moment:ae}=window,ne=(t,e)=>t.every((t=>{const i=e.find((e=>{return a=t,(i=e).id===a.id&&i.number===a.number&&(null===(n=i.stockMarket)||void 0===n?void 0:n.id)===(null===(o=a.stockMarket)||void 0===o?void 0:o.id);var i,a,n,o}));return i&&t.isVisible===i.isVisible})),oe=({id:t,label:e,labelShort:i,numberMonths:a,disabled:n})=>({id:t,label:e,labelShort:i,numberMonths:a,disabled:n}),se=({hasHistoricalDataForAllContracts:t=!0,maximumHistoricalDate:e}={})=>Ut.reduce(((i,a)=>{const{id:n,label:o,labelShort:s,numberMonths:r}=a;return n===zt[99].id?(t&&i.push(oe({id:n,label:o,labelShort:s,numberMonths:r,disabled:!1})),i):(((t,e)=>!e||ae().subtract(t,"month").isBetween(e,void 0,void 0,"[]"))(r,e)&&i.push(oe({id:n,label:o,labelShort:s,numberMonths:r,disabled:!1})),i)}),[]),re=t=>{const e=ae(),i=t?ae(t):ae().startOf("year");return e.diff(i,"months")};function de(t=[]){return t.find((t=>Ht.includes(t.id)))}function ce(t,e){const{specificAmounts:i,specificAmountsInternationalFunds:a,specificAmountsSecurities:n}=t;return i||a||n||e&&[Kt]}function le(t){var e,i;return null===(e=t.classification)||void 0===e||null===(i=e.level)||void 0===i?void 0:i.map((({internalCode:t},e)=>({id:(e+1).toString(),value:t})))}const he=({id:t,bank:e,productType:i,simpleCode:a,name:n,amounts:o,number:s,stockMarket:r,participant:d,isVisible:c,numberToShow:l,classification:h,currencies:u=[],numberTypeIsin:m}={})=>{var p,v,g,f,b,_,y;return{id:t,bank:e,productType:i,simpleCode:a,isVisible:c,name:n,classification:h,numberToShow:l,amounts:o,participant:d,amount:null==o||null===(p=o.amounts)||void 0===p||null===(v=p[0])||void 0===v?void 0:v.amount,showZeroAmount:0===(null==o||null===(g=o.amounts)||void 0===g||null===(f=g[0])||void 0===f?void 0:f.amount),currency:(null==o||null===(b=o.amounts)||void 0===b||null===(_=b[0])||void 0===_?void 0:_.currency)||(null===(y=u[0])||void 0===y?void 0:y.currency),numberType:{id:m},number:s,status:{id:"VALID"},stockMarket:r}};class ue extends(P(I(e(i)))){static get is(){return"advice-fh-configuration"}static get scopedElements(){const t=[R,St,J,tt,Dt,F,b,L,j,w,z,S,N,Rt,qt,te,wt,at,st,...ue.configurationScopedElements()];return{"bbva-global-retail-financial-overview-api-dm":et,"bbva-global-financial-overview-api-dm":B,...ue.scopedElementsFromClasses(t)}}static get properties(){return{amountsAvailable:{type:Array,attribute:"amounts-available"},attachModalsToBody:{type:Boolean,attribute:"attach-modals-to-body"},confirmationMessageModal:{type:Boolean,attribute:"confirmation-message-modal"},configuration:{type:Object},creditCardClassification:{type:String,attribute:"credit-card-classification"},currency:{type:String},customerId:{type:String,attribute:"customer-id"},debitCardType:{type:String,attribute:"debit-card-type"},discreetMode:{type:Boolean,attribute:"discreet-mode"},enableForecast:{type:Boolean,attribute:"enable-forecast"},entitiesImages:{type:Object,attribute:"entities-images"},exitMessageModal:{type:Boolean,attribute:"exit-message-modal"},financialInvestmentsApiVersion:{type:String,attribute:"financial-investments-api-version"},financialOverviewApiVersion:{type:String,attribute:"financial-overview-api-version"},financialOverviewCacheKey:{type:String,attribute:"financial-overview-cache-key"},financialOverviewData:{type:Array,attribute:"financial-overview-data"},goods:{type:Object},goodsCacheKey:{type:String,attribute:"goods-cache-key"},goodsCacheType:{type:String,attribute:"goods-cache-type"},hideForecasting:{type:Boolean,attribute:"hide-forecasting"},hideNotificationMessage:{type:Boolean,attribute:"hide-notification-message"},hideHomeConfiguration:{type:Boolean,attribute:"hide-home-configuration"},hideInvestmentConfiguration:{type:Boolean,attribute:"hide-investment-configuration"},hidePfmConfiguration:{type:Boolean,attribute:"hide-pfm-configuration"},knowMoreModal:{type:Boolean,attribute:"know-more-modal"},netWorthApiVersion:{type:String,attribute:"net-worth-api-version"},netWorthConfigurationCacheKey:{type:String,attribute:"net-worth-configuration-cache-key"},netWorthConfigurationCacheType:{type:String,attribute:"net-worth-configuration-cache-type"},numberIsin:{type:String,attribute:"number-isin"},numberStockMarket:{type:String,attribute:"number-stock-market"},numberTypeIsin:{type:String,attribute:"number-type-isin"},ownershipPercentages:{type:Array,attribute:"ownership-percentages"},personalFinancesApiVersion:{type:String,attribute:"personal-finances-api-version"},pfmId:{type:String,attribute:"pfm-id"},prepaidCardClassification:{type:String,attribute:"prepaid-card-classification"},productsModal:{type:Boolean,attribute:"products-modal"},retailFinancialOverviewData:{type:Array,attribute:"retail-financial-overview-data"},selectPeriodModal:{type:Boolean,attribute:"select-period-modal"},useExternalProducts:{type:Boolean,attribute:"use-external-products"},useInactiveProducts:{type:Boolean,attribute:"use-inactive-products"},channelId:{type:String,attribute:"channel-Id"},retailFinancialOverviewCountry:{type:String,attribute:"retail-financial-overview-country"},selectedTab:{type:String,attribute:"selected-tab"},selectedTabById:{type:String,attribute:"selected-tab-by-id"},statusOperative:{type:String,attribute:"status-operative"},versionRetailFinancialOverviewApiDm:{type:String,attribute:"version-retail-financial-overview-api-dm"},webSelector:{type:Boolean,attribute:"web-selector"},_enableForecast:{type:Boolean},_homeToEdit:{type:Object,state:!0},_internalInvestmentsContractsNormalized:{type:Array,state:!0},_lastSelectedOwnership:{type:Number,state:!0},_modifiedHomeProducts:{type:Boolean,state:!0},_modifiedInvestmentProducts:{type:Boolean,state:!0},_modifiedInvestmentProductsFromBeginning:{type:Boolean,state:!0},_pendingConfigRequests:{type:Number,state:!0},_pfmData:{type:Object,state:!0},_pfmForecastChanged:{type:Boolean,state:!0},_pfmPeriodChanged:{type:Boolean,state:!0},_pfmProductsChanged:{type:Boolean,state:!0},_saveInvestmentsSBlocked:{type:Boolean,state:!0},_selectedInvestmentsPeriod:{type:String,state:!0},_selectedInvestmentsPeriodUnsaved:{type:String,state:!0},_updateError:{type:Boolean,state:!0}}}static get styles(){return[ee,A,V.primaryAlt,U.primaryAlt,m.primaryAlt,q.primaryAlt,T.primaryAlt,H.primaryAlt,M.primaryAlt,r("advice-fh-configuration-shared-styles")]}static _tplText({text:t,tag:e,fontWeight:i,className:o}){return a`
      <bbva-type-text
        unset
        class="${n(o)}"
        size="S"
        tag="${n(e)}"
        text="${t}"
        font-weight="${n(i)}"
      ></bbva-type-text>
    `}constructor(){super(),this.attachModalsToBody=!1,this.amountsAvailable=["availableBalance","BALANCE"],this.confirmationMessageModal=!1,this.contractsConfigurationsApiVersion="0",this.currency="EUR",this.customerId="00000000",this.debitCardType="DEBIT_CARD",this.discreetMode=!1,this.enableForecast=!1,this.exitMessageModal=!1,this.financialInvestmentsApiVersion="0",this.financialOverviewApiVersion="1",this.financialOverviewData={},this.goodsCacheKey="ckGoods",this.goodsCacheType="NONE",this.hideHomeConfiguration=!1,this.hideForecasting=!1,this.hideNotificationMessage=!1,this.hideInvestmentConfiguration=!1,this.hidePfmConfiguration=!1,this.knowMoreModal=!1,this.language="es-ES",this.native=!1,this.netWorthApiVersion="0",this.netWorthConfigurationCacheKey="ckNetWorthConfiguration",this.netWorthConfigurationCacheType="NONE",this.numberIsin="000000000000",this.numberStockMarket="0000",this.numberTypeFormat="BOCF",this.numberTypeIsin="ISIN",this.ownershipPercentages=Yt,this.personalFinancesApiVersion="1",this.productsModal=!1,this.retailFinancialOverviewData=[],this.retailFinancialOverviewCountry="",this.requiredToken="tsec",this.selectPeriodModal=!1,this.selectedTab=0,this.selectedTabById="",this.statusOperative="OPERATIVE",this.channelId="BBVANet",this.useExternalProducts=!1,this.useInactiveProducts=!1,this.versionRetailFinancialOverviewApiDm="2",this.webSelector=!1,this._enableForecast=!1,this._initialInvestmentConfiguration={},this._internalInvestmentsContractsNormalized=[],this._investmentsPeriodList=[],this._modalErrorVisible=!1,this._modifiedHomeProducts=!1,this._modifiedInvestmentProducts=!1,this._modifiedInvestmentProductsFromBeginning=!1,this._pendingConfigRequests=0,this._pfmForecastChanged=!1,this._pfmPeriodChanged=!1,this._pfmProductsChanged=!1,this._saveInvestmentsSBlocked=!1,this._updateError=!1}async firstUpdated(t){super.firstUpdated(t),this._netWorthConfigurationDM=this.shadowRoot.querySelector("#netWorthConfigurationDM"),this._goodsDM=this.shadowRoot.querySelector("#goodsDM"),this._retailFinancialOverviewApiDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-retail-financial-overview-api-dm"]'),this._financialOverviewApiDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-financial-overview-api-dm"]'),this._pfmsApiDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-pfms-api-dm"]'),this._pfmApiDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-pfm-api-dm"]'),this._contractsConfigurationsDm=this.shadowRoot.querySelector("#contractsConfigurationsDm"),this._contractsConfigurationDm=this.shadowRoot.querySelector("#contractsConfigurationDm"),this._contractsConfigurationRelatedContractsDm=this.shadowRoot.querySelector("#contractsConfigurationRelatedContractsDm"),0===Object.keys(this.financialOverviewData).length&&this.financialOverviewData.constructor===Object&&(this._pendingConfigRequests+=1,this._financialOverviewApiDm.getFinancialOverview()),this.hidePfmConfiguration||(this._enableForecast=this.enableForecast,this.initPfmTab()),this.hideHomeConfiguration||await this.initHomeTab(),this.hideInvestmentConfiguration||this._contractsConfigurationsDm.getContractsConfigurations({expand:"related-contracts"})}_getNumberMonths(t){var e;return void 0!==t?t:null===(e=this._investmentsPeriodList.find((t=>{var e,i;return t.numberMonths===(null===(e=this._contractsConfiguration)||void 0===e||null===(i=e.period)||void 0===i?void 0:i.number)})))||void 0===e?void 0:e.numberMonths}_setSelectedInvestmentsPeriod(t){const e=this._getNumberMonths(t);if("number"==typeof e&&Number.isFinite(e)&&this._investmentsPeriodList.find((t=>t.numberMonths===e)))this._selectedInvestmentsPeriod=e;else{const t=this._investmentsPeriodList.reduce(((t,e)=>e.numberMonths>t.numberMonths?e:t)),e=re(),i=re(this._contractsConfiguration.maximumHistoricalDate),a=Math.max(e,i,t.numberMonths);this._contractsConfiguration.hasHistoricalDataForAllContracts&&a===i?this._selectedInvestmentsPeriod=99:a===t.numberMonths?this._selectedInvestmentsPeriod=t.numberMonths:this._selectedInvestmentsPeriod=0}}updated(t){super.updated(t),t.has("configuration")&&this.configuration&&!this._initialProducts&&this._updateInitialProducts()}initPfmTab(){this.useExternalProducts&&!this.retailFinancialOverviewData.length&&(this._pendingConfigRequests+=1,this._retailFinancialOverviewApiDm.getFinancialOverview()),this._pfmForecastChanged=!1,this._pfmPeriodChanged=!1,this._pfmProductsChanged=!1,this._pfmsApiDm.getPfms()}async initHomeTab(){var t,e;this.configuration||await(null===(t=this._netWorthConfigurationDM)||void 0===t?void 0:t.getConfiguration());this.goods||await(null===(e=this._goodsDM)||void 0===e?void 0:e.getGoods())}_handlePfmApiDmFetch({detail:t}){var e;this._pfmData=t.find((({id:t})=>t===this.pfmId)),null!==(e=this._pfmData.frequency)&&void 0!==e&&e.daysOfMonth||(this._pfmData.frequency={id:"MONTHLY",daysOfMonth:[1]}),this._originalPfmData=JSON.parse(JSON.stringify(this._pfmData))}_handlePfmApiDmPatch(){this._pendingConfigRequests-=1,this._originalPfmData=JSON.parse(JSON.stringify(this._pfmData)),this.enableForecast=this._enableForecast,this._dispatchCustomEvent("advice-fh-configuration-pfm-configuration-save",{enableForecast:this._enableForecast||!1}),this._pfmForecastChanged=!1,this._pfmPeriodChanged=!1,this._pfmProductsChanged=!1}_handleRetailFinancialOverviewApiDmFetch({detail:t}){this._pendingConfigRequests-=1,this.retailFinancialOverviewData=t}_handleFinancialOverviewApiDmFetch({detail:t}){this._pendingConfigRequests-=1,this.financialOverviewData=t}_getInternalInvestmentsContracts(){var t,e;return(null===(t=this.financialOverviewData)||void 0===t||null===(e=t.contracts)||void 0===e?void 0:e.filter((t=>{const e=Wt.some((e=>e.id===t.productType)),i=t.userAccessControl.find((t=>"BBVANet"===t.channel.id)),a=null==i?void 0:i.isVisible;return e&&a})))||[]}_getValidRelatedContracts(){var t;return(null===(t=this._contractsConfiguration.relatedContracts)||void 0===t?void 0:t.filter((t=>{var e;return"VALID"===(null===(e=t.status)||void 0===e?void 0:e.id)})))||[]}_handleContractsConfigurationsFetch({detail:t}){this._investmentLoaded=!0,this._contractsConfigurationData=t[0]||{};const e=this._getInternalInvestmentsContracts(),i=this._getValidRelatedContracts();if(this._internalInvestmentsContractsNormalized=this._normalizeFinancialOverviewProducts(e,i),this.hideInvestmentConfiguration=this.hideInvestmentConfiguration||0===this._internalInvestmentsContractsNormalized.length,!this.hideInvestmentConfiguration){this._investmentsPeriodList=se(this._contractsConfiguration),this._setSelectedInvestmentsPeriod();const t=JSON.stringify(this._internalInvestmentsContractsNormalized);var a;if(this._initialInvestmentConfiguration.lastSavedInvestmentConfiguration=JSON.parse(t),this._initialInvestmentConfiguration.internalInvestmentsContracts)this._dispatchCustomEvent("advice-fh-configuration-investment-configuration-changed",this._initialInvestmentConfiguration.periodInitialNumber!==this._selectedInvestmentsPeriod||this._modifiedInvestmentProductsFromBeginning),this._updateDataStatus();else this._initialInvestmentConfiguration.internalInvestmentsContracts=JSON.parse(t),this._initialInvestmentConfiguration.periodInitialNumber=null===(a=this._contractsConfiguration)||void 0===a?void 0:a.period.number,((t,e)=>{if(t.length!==e.length)return!1;const i=t.every((t=>e.some((e=>e.id===t.id)))),a=e.every((e=>t.some((t=>t.id===e.id))));return i&&a})(e,i)||this._contractsConfigurationRelatedContractsDm.postContractsConfigurationRelatedContracts(this.customerId,((t=[],e=[])=>({relatedContracts:t.map((({id:t,classification:i,productType:a,simpleCode:n,number:o,numberType:s,stockMarket:r,investmentValueAmount:d})=>{var c;return{id:e.includes(a)?n:t,number:o,numberType:s,stockMarket:r,clasificationLevel:null==i||null===(c=i.level)||void 0===c?void 0:c.map((({internalCode:t},e)=>({id:(e+1).toString(),value:t}))),investmentValueAmount:d}}))}))(this._internalInvestmentsContracts)),this._dispatchCustomEvent("advice-fh-configuration-investment-configuration-loaded")}}_handleContractsConfigurationsFetchError(){this._dispatchCustomEvent("advice-fh-configuration-investment-configuration-error"),this._showModalError("exit")}_handlePfmProductChange({detail:t}){var e;const i=t.productType||(null===(e=t.detail)||void 0===e?void 0:e.productType);this._pfmData.relatedContracts.find((({contractId:e})=>e===t.id))?this._pfmData.relatedContracts=this._pfmData.relatedContracts.filter((({contractId:e})=>e!==t.id)):this._pfmData.relatedContracts.push({productType:{id:"ACCOUNT"===i?"ACCOUNTS":"CARDS",..."CARD"===i&&this._getCardSubProductType(t.id)},contractId:t.id}),this._pfmProductsChanged=this._pfmData.relatedContracts.length!==this._originalPfmData.relatedContracts.length||this._pfmData.relatedContracts.some((({contractId:t})=>!this._originalPfmData.relatedContracts.find((({contractId:e})=>e===t))))}_getCardSubProductType(t){var e,i,a;let n=null===(e=this.financialOverviewData)||void 0===e||null===(i=e.contracts)||void 0===i||null===(a=i.find((({id:e})=>e===t)))||void 0===a?void 0:a.subProductType;return n||this.retailFinancialOverviewData.some((({externalFinancialEntity:e})=>{const i=e.contracts.find((({id:e})=>e===t));var a;return!!i&&(n=null===(a=i.detail)||void 0===a?void 0:a.cardType,!0)})),{subproductType:n}}_handlePfmPeriodChange({detail:t}){var e;this._pfmData.frequency.daysOfMonth[0]=t,this._pfmPeriodChanged=(null===(e=this._originalPfmData.frequency)||void 0===e?void 0:e.daysOfMonth[0])!==t}_handleForecastChange({detail:t}){this._enableForecast=t,this._pfmForecastChanged=this.enableForecast!==this._enableForecast}_updateInitialProducts(){const{goods:t=[]}=this.configuration;this._initialProducts=JSON.parse(JSON.stringify([...t]))}get _pfmConfigChanged(){return this._pfmForecastChanged||this._pfmPeriodChanged||this._pfmProductsChanged}get _modifiedProducts(){var t,e;return(null===(t=this.configuration)||void 0===t||null===(e=t.goods)||void 0===e?void 0:e.filter((t=>{var e,i,a;const n=null===(e=this._initialProducts)||void 0===e?void 0:e.find((({id:e})=>e===t.id));return(null==n||null===(i=n.status)||void 0===i?void 0:i.id)!==(null==t||null===(a=t.status)||void 0===a?void 0:a.id)||n.ownership!==t.ownership})))||[]}get _internalInvestmentsContracts(){return this._internalInvestmentsContractsNormalized||[]}get _tabOptions(){return[{id:"pfm",title:this.t("advice-fh-configuration-tab1-title"),visible:!this.hidePfmConfiguration,panel:this._configurationProductsPanel},{id:"home",title:this.t("advice-fh-configuration-tab2-title"),visible:!this.hideHomeConfiguration,panel:this._configurationHomePanel},{id:"investment",title:this.t("advice-fh-configuration-tab3-title"),visible:!this.hideInvestmentConfiguration&&this._investmentLoaded,panel:this._configurationInvestmentPanel}].filter((t=>t.visible))}get _selectedTab(){if(this.selectedTabById){const t=this.findTabById(this.selectedTabById);-1!==t&&(this.selectedTab=t)}return this.selectedTab}findTabById(t){return this._tabOptions.findIndex((e=>e.id===t))}get _tabPanels(){return this._tabOptions.map(((t,e)=>a`
        <div id="content-${e}" role="tabpanel" aria-labelledby="tab-${e}">
          ${t.panel}
        </div>
      `))}get _checkSaveButtonForInvestments(){return this._modifiedInvestmentProductsFromBeginning||this._initialInvestmentConfiguration.periodInitialNumber!==this._selectedInvestmentsPeriod}_updateConfiguration(){this._updateError=!1,this._dispatchCustomEvent("advice-fh-configuration-configuration-update"),this._pfmConfigChanged&&(this._pendingConfigRequests+=1,this._updatePfmConfiguration()),this._modifiedHomeProducts&&(this._pendingConfigRequests+=1,this._updateNetWorthConfiguration()),this._modifiedInvestmentProducts&&this._saveInvestmentsConfiguration(this._internalInvestmentsContracts,{actionOnError:"reset",actionOnSuccess:"close"}),this.productsModal=!1}_updatePfmConfiguration(){const{relatedContracts:t,frequency:e}=this._pfmData;this._pfmApiDm.patchPfm(this.pfmId,{relatedContracts:t.map((t=>({contractId:t.contractId,productType:{id:t.productType.id,...t.productType.subproductType&&{subproductType:t.productType.subproductType}}}))),frequency:e})}_updateNetWorthConfiguration(){var t;const e={goods:this._getGoodsPutConfiguration(),historicalComparisonPeriod:{id:this.configuration.historicalComparisonPeriod.id||"LAST_MONTH"},isDefault:!1};null===(t=this._netWorthConfigurationDM)||void 0===t||t.putConfiguration(e)}_getGoodsPutConfiguration(){return this.configuration.goods.map((t=>{var e,i;return{goodType:{id:null===(e=t.goodType)||void 0===e?void 0:e.id},id:t.id,ownership:t.ownership,status:{id:null===(i=t.status)||void 0===i?void 0:i.id}}}))}_updateInvestmentConfiguration(t){const e={period:{frequency:{id:"MONTHS"},number:t}};this._contractsConfigurationDm.patchContractsConfiguration(this.customerId,e)}_finishConfigurationSaving(){this._pendingConfigRequests-=1,this._dispatchCustomEvent("advice-fh-configuration-save",{productsChanged:this._modifiedProducts}),this._updateInitialProducts(),this._modifiedHomeProducts=!1}_handleUpdateDmError(){this._pendingConfigRequests-=1,this._showModalError()}_handleShowKnowMore(){this.knowMoreModal=!0}_handleHideKnowMore(){this.knowMoreModal=!1}_saveInvestmentsConfiguration(t,e={}){const{actionOnSuccess:i="none",actionOnError:a="reset"}=e;this._relatedContractPatchSuccess=i,this._actionOnError=a,this._contractsConfigurationRelatedContractsDm.patchContractsConfigurationRelatedContracts(this.customerId,((t=[],e=[])=>({relatedContracts:t.map((({id:t,productType:i,simpleCode:a,number:n,numberType:o,stockMarket:s,isVisible:r})=>({id:e.includes(i)?a:t,number:n,numberType:o,stockMarket:s,isVisible:r})))}))(t))}_handleShowSelectPeriodInvestementsModal(){this._selectedInvestmentsPeriodUnsaved=this._selectedInvestmentsPeriod,this.selectPeriodModal=!0,this._modifiedInvestmentProducts&&(this._investmentsPeriodList=[],this._saveInvestmentsConfiguration(this._internalInvestmentsContracts,{actionOnError:"reset"}))}_handlerRelatedContractPost(){this._contractsConfigurationsDm.getContractsConfigurations({expand:"related-contracts"}),this.selectPeriodModal=!1}_handlerErrorRelatedContractPost(){this._showModalError("exit"),this.selectPeriodModal=!1}_handlerErrorRelatedContractPatch(){this._showModalError("reset"),this.selectPeriodModal=!1}_handlerRelatedContractPatch(){this._dispatchCustomEvent("advice-fh-configuration-investment-configuration-saved",this._initialInvestmentConfiguration.periodInitialNumber!==this._selectedInvestmentsPeriod||this._modifiedInvestmentProductsFromBeginning),"close"===this._relatedContractPatchSuccess?this.productsModal=!1:(this.selectPeriodModal=!0,this._contractsConfigurationsDm.getContractsConfigurations({expand:"related-contracts"}))}_showModalError(t){this._actionOnError=t,this._updateError=!0}_handleHideSelectPeriodInvestementsModal(){this.selectPeriodModal=!1}_handleAcceptSelectPeriodInvestementsModal(){this._actionOnError="reset",this._updateInvestmentConfiguration(this._selectedInvestmentsPeriodUnsaved)}_handleHomeToggle({detail:t}){t.home.status.id=t.ev.detail.checked?Qt:Xt,this._modifiedHomeProducts=Boolean(this._modifiedProducts.length)}_updateDataStatus(){var t;this._saveInvestmentsSBlocked=(null===(t=this._internalInvestmentsContracts)||void 0===t?void 0:t.length)>0&&!this._internalInvestmentsContracts.some((t=>t.isVisible)),this._modifiedInvestmentProductsFromBeginning=!ne(this._internalInvestmentsContracts,this._initialInvestmentConfiguration.internalInvestmentsContracts),this._modifiedInvestmentProducts=!ne(this._internalInvestmentsContracts,this._initialInvestmentConfiguration.lastSavedInvestmentConfiguration)}_handleConfirmSaveButton(){this.confirmationMessageModal=!0,this._dispatchCustomEvent("advice-fh-configuration-confirmation-message-modal-open")}_handleOwnershipEdit(){this._modifiedHomeProducts=Boolean(this._modifiedProducts.length)}_dispatchCustomEvent(t,e=!0,i=!0,a=!0){this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:i,composed:a}))}_updateSelectedOwnership(t,e=!1){t&&(this._lastSelectedOwnership=t,e&&(this._otherOwnershipValue=t))}_normalizeInternationalFunds(t=[],e={}){const{validRelatedContracts:i=[],id:a,bank:n,participant:o}=e;return t.map((t=>{var e,s,r;const d=null===(e=t.formats)||void 0===e?void 0:e.find((t=>t.numberType.id===this.numberTypeIsin)),c=function(t){var e;return{id:(null==t?void 0:t.number)||(null==t||null===(e=t.numberType)||void 0===e?void 0:e.name)||this.numberStockMarket}}(t.stockMarket.formats.find((t=>"INTERNAL"===t.numberType.id))),l=null===(s=i.find((t=>a===t.id&&d.number===t.number)))||void 0===s?void 0:s.isVisible;return he({id:a,bank:n,classification:t.classification,isVisible:void 0===l||l,productType:"INVESTMENT_FUND",name:t.name,amounts:de(t.specificAmounts),number:(null==d?void 0:d.number)||this.numberIsin,numberToShow:null==d||null===(r=d.number)||void 0===r?void 0:r.substr(-4),stockMarket:c,participant:o,clasificationLevel:le(t),numberTypeIsin:this.numberTypeIsin})}))}_normalizeFinancialOverviewProducts(t,e=[]){return t.forEach((i=>{var a,n;const{id:o,productType:s,simpleCode:r,product:d,alias:c,detail:l,participant:h,currencies:u,bank:m}=i,p="PORTFOLIO"===s?function(t){var e;const{comertialClassifications:i}=t.product,a=null==i||null===(e=i[i.length-1])||void 0===e?void 0:e.id;return Jt[a]||"PORTFOLIO"}(i):s,{internationalFunds:v}=l,g=null===(a=i.formats)||void 0===a?void 0:a.find((t=>t.numberType.id===this.numberTypeFormat)),f=null==g?void 0:g.number,b=this.numberIsin,_=null==f?void 0:f.substr(-4),y=function(t,e,i){return t||e.portfolioName||i.description||i.name}(c,l,d),C=s===Gt.SECURITY_ACCOUNT.id&&(null==v?void 0:v.length)>0,$=null===(n=e.find((t=>i.id===t.id)))||void 0===n?void 0:n.isVisible;Object.assign(i,he({id:o,bank:m,classification:i.classification,productType:p,simpleCode:r,participant:h,isVisible:void 0===$||$,name:y,numberToShow:_,amounts:de(ce(l,C)),number:b,stockMarket:{id:this.numberStockMarket},currencies:u,numberTypeIsin:this.numberTypeIsin})),C&&this._normalizeInternationalFunds(v,{validRelatedContracts:e,id:o,bank:m,participant:h}).forEach((e=>{t.push(e)}))})),t}get _isOtherOwnershipValueInvalid(){return null!==this._otherOwnershipValue&&(this._otherOwnershipValue<1||this._otherOwnershipValue>100)}get _contractsConfiguration(){return this._contractsConfigurationData||{}}get _tplKnowMore(){return a`
      <bbva-type-text
        unset
        size="S"
        tag="span"
        text="${this.t("advice-fh-configuration-know-more-modal-text")}"
      ></bbva-type-text>
      <div role="list">
        ${[Zt.map((t=>a`
              <bbva-list-bullet role="listitem">
                ${this.t(`advice-fh-configuration-know-more-modal-bullet-${t}`)}
              </bbva-list-bullet>
            `))]}
      </div>
    `}get _tplModalConfirmationMessage(){return a`
      <bbva-help-modal
        ?attach-to-body="${this.attachModalsToBody}"
        title-lines="0"
        id="modal-confirmation-message"
        data-id="modalConfirmationMessage"
        ?visible="${this.confirmationMessageModal}"
        modal-type="caution"
        title-icon="${c()}"
        header-text="${this.t("advice-fh-configuration-warning")}"
        title-text="${this.t("advice-fh-configuration-confirmation-message-modal-title-text")}"
        body-text="${this.t("advice-fh-configuration-confirmation-message-modal-text")}"
        header-close-icon-aria-label="${this.t("advice-fh-configuration-close-text-button")}"
        button-text="${this.t("advice-fh-configuration-accept-text-button")}"
        link-text="${this.t("advice-fh-configuration-cancel-text-button")}"
        @help-modal-close="${()=>{this.confirmationMessageModal=!1}}"
        @help-modal-footer-button-click="${()=>{this.confirmationMessageModal=!1,this._updateConfiguration()}}"
      >
      </bbva-help-modal>
    `}get _updateErrorTmpl(){return a`
      <bbva-help-modal
        ?attach-to-body="${this.attachModalsToBody}"
        title-lines="0"
        id="modal-exit-message"
        data-id="modalConfirmationMessage"
        ?visible="${this.exitMessageModal}"
        modal-type="caution"
        title-icon="${c()}"
        header-text="${this.t("advice-fh-configuration-exit-configuration-warning")}"
        body-text="${this.t("advice-fh-configuration-exit-configuration-message-modal-text")}"
        header-close-icon-aria-label="${this.t("advice-fh-configuration-exit-configuration-close-text-button")}"
        button-text="${this.t("advice-fh-configuration-exit-configuration-exit-text-button")}"
        link-text="${this.t("advice-fh-configuration-exit-configuration-continue-text-button")}"
        @help-modal-close="${()=>{this.exitMessageModal=!1,this._dispatchCustomEvent("advice-fh-configuration-exit-configuration-error-modal-close")}}"
        @help-modal-footer-button-click="${()=>{this._initialInvestmentConfiguration.periodInitialNumber!==this._selectedInvestmentsPeriod&&this._updateInvestmentConfiguration(this._initialInvestmentConfiguration.periodInitialNumber),this._initialInvestmentConfiguration.lastSavedInvestmentConfiguration&&!ne(this._initialInvestmentConfiguration.internalInvestmentsContracts,this._initialInvestmentConfiguration.lastSavedInvestmentConfiguration)&&this._saveInvestmentsConfiguration(this._initialInvestmentConfiguration.internalInvestmentsContracts,{actionOnError:"exit",actionOnSuccess:"close"}),this.productsModal=!1,this.exitMessageModal=!1,this._dispatchCustomEvent("advice-fh-configuration-modal-close")}}"
      >
      </bbva-help-modal>
    `}get _showLoadingSpinnerTmpl(){return a`
      <bbva-progress-content
        ?visible="${Boolean(this._pendingConfigRequests)}"
        variant="transparent"
      ></bbva-progress-content>
    `}get _tplModalKnowMore(){return a`
      <bbva-help-modal
        id="modal-know-more"
        data-id="modalKnowMore"
        ambient="primary-alt"
        modal-type="info"
        ?attach-to-body="${this.attachModalsToBody}"
        .contentStyles="${ie}"
        ?visible="${this.knowMoreModal}"
        header-close-icon-aria-label="${this.t("advice-fh-configuration-close-text-button")}"
        full-height
        title-icon="${l()}"
        title-text="${this.t("advice-fh-configuration-know-more-modal-title")}"
        header-type="modal-three-level"
        header-text="${this.t("advice-fh-configuration-know-more-modal-header-text")}"
        @help-modal-footer-button-click="${this._handleHideKnowMore}"
        @help-modal-header-click="${this._handleHideKnowMore}"
      >
        <div slot="slot-content">${this._tplKnowMore}</div>
      </bbva-help-modal>
    `}get _tplEditOwnership(){return this._homeToEdit?a`
          <bbva-header-category
            heading-level="2"
            text="${this._homeToEdit.alias}"
          ></bbva-header-category>
          ${this._homeToEdit.description?ue._tplText({className:"description",text:this._homeToEdit.description||""}):o}
          ${ue._tplText({text:this.t("advice-fh-configuration-edit-ownership-modal-text"),className:"form-title",fontWeight:"500",tag:"h2"})}
          <form>
            ${this.ownershipPercentages.map(((t,e)=>a`
                <bbva-form-radio-button
                  name="choice"
                  value="${e}"
                  ?checked="${this._homeToEdit.ownership===t||this._otherOwnershipValue===t}"
                  @active-change="${e=>e.detail.value&&this._updateSelectedOwnership(t)}"
                >
                  ${t}%
                </bbva-form-radio-button>
                <bbva-divider-default class="fit"></bbva-divider-default>
              `))}
            <bbva-form-radio-button
              name="choice"
              value="4"
              ?checked="${this._otherOwnershipValue&&!this.ownershipPercentages.includes(this._otherOwnershipValue)}"
            >
              ${this.t("advice-fh-configuration-edit-ownership-modal-other-option")}
            </bbva-form-radio-button>
          </form>

          <bbva-form-input
            type="number"
            label="${this.t("advice-fh-configuration-edit-ownership-modal-input-label")}"
            .value="${this._otherOwnershipValue}"
            ?invalid="${this._isOtherOwnershipValueInvalid}"
            @form-input-value-change="${t=>{const e=Number(t.detail.value);this._updateSelectedOwnership(e,!0)}}"
          ></bbva-form-input>
        `:o}get _tplModalEditOwnership(){var t;return a`
      <bbva-help-modal
        ambient="primary-alt"
        ?attach-to-body="${this.attachModalsToBody}"
        .contentStyles="${ie}"
        ?visible="${Boolean(this._homeToEdit)}"
        id="modal-edit-ownership"
        data-id="modalEditOwnership"
        full-height
        fixed-footer
        hide-content-padding-top
        header-type="modal-three-level"
        header-text="${this.t("advice-fh-configuration-edit-ownership-modal-header-text")}"
        header-close-icon-aria-label="${this.t("advice-fh-configuration-close-text-button")}"
        button-text="${this.t("advice-fh-configuration-accept-text-button")}"
        ?disabled-button="${this._isOtherOwnershipValueInvalid||this._lastSelectedOwnership===(null===(t=this._homeToEdit)||void 0===t?void 0:t.ownership)}"
        @help-modal-footer-button-click=${()=>{this._homeToEdit.ownership=this._lastSelectedOwnership,this.configuration={...this.configuration},this._handleOwnershipEdit()}}
        @header-main-icon-right-primary-click=${()=>{this._otherOwnershipValue=null}}
        @help-modal-close="${()=>{this._homeToEdit=null}}"
      >
        <div slot="slot-content">${this._tplEditOwnership}</div>
      </bbva-help-modal>
    `}_callbackPatchContractsConfiguration(){this._dispatchCustomEvent("advice-fh-configuration-investment-period-updated"),this._setSelectedInvestmentsPeriod(this._selectedInvestmentsPeriodUnsaved),this._contractsConfigurationsDm.getContractsConfigurations({expand:"related-contracts"}),this.selectPeriodModal=!1}_callbackErrorPatchContractsConfiguration(){"exit"!==this._actionOnError&&this._setSelectedInvestmentsPeriod(this._initialInvestmentConfiguration.periodInitialNumber),this.selectPeriodModal=!1,this._showModalError()}get _tplSelectInvestmentsPeriodLoading(){return a`
      <bbva-progress-content
        ?visible="${0===this._investmentsPeriodList.length}"
        variant="transparent"
      ></bbva-progress-content>
    `}get _tplSelectInvestmentsPeriod(){return a`
      ${ue._tplText({text:this.t("advice-fh-configuration-investments-modal-text"),className:"form-title",fontWeight:"500",tag:"h2"})}
      ${this._investmentsPeriodList.map((({label:t,numberMonths:e},i)=>a`
          <bbva-form-radio-button
            value="${e}"
            ?checked=${e===this._selectedInvestmentsPeriodUnsaved}
            @active-change="${t=>{t.detail.value&&(this._selectedInvestmentsPeriodUnsaved=e)}}"
          >
            ${this.t(t)}
          </bbva-form-radio-button>
          ${i<this._investmentsPeriodList.length-1?a` <bbva-divider-default class="fit"></bbva-divider-default> `:""}
        `))}
    `}get _tplModalSelectInvestmentsPeriod(){return a`
      <bbva-help-modal
        id="modal-select-investments-period"
        data-id="modalSelectPeriodInvestments"
        ambient="primary-alt"
        .contentStyles="${ie}"
        ?visible="${this.selectPeriodModal}"
        ?disabled-button="${0===this._investmentsPeriodList.length}"
        header-close-icon-aria-label="${this.t("advice-fh-configuration-close-text-button")}"
        ?attach-to-body="${this.attachModalsToBody}"
        hide-content-padding-top
        header-type="modal-three-level"
        header-text="${this.t("advice-fh-configuration-investments-select-period-modal-header-text")}"
        button-text="${this.t("advice-fh-configuration-accept-text-button")}"
        @help-modal-footer-button-click="${this._handleAcceptSelectPeriodInvestementsModal}"
        @help-modal-header-click="${this._handleHideSelectPeriodInvestementsModal}"
      >
        <div slot="slot-content">
          ${0===this._investmentsPeriodList.length?this._tplSelectInvestmentsPeriodLoading:this._tplSelectInvestmentsPeriod}
        </div>
      </bbva-help-modal>
    `}get _modalErrorTmpl(){const t=()=>{"exit"===this._actionOnError?this.productsModal=!1:"reset"===this._actionOnError&&this._contractsConfigurationsDm.getContractsConfigurations({expand:"related-contracts"}),this._updateError=!1,this._dispatchCustomEvent("advice-fh-configuration-error-modal-close")};return a`
      <bbva-help-modal
        ?attach-to-body="${this.attachModalsToBody}"
        id="modal-error"
        ?visible="${this._updateError}"
        modal-type="warning"
        title-icon="${h()}"
        title-text="${this.t("advice-fh-configuration-saving-error-notification")}"
        header-text="${this.t("advice-fh-configuration-error")}"
        body-text="${this.t("advice-fh-configuration-saving-error-description")}"
        button-text="${this.t("advice-fh-configuration-accept-text-button")}"
        header-close-icon-aria-label="${this.t("advice-fh-configuration-close-text-button")}"
        @help-modal-veil-click="${t}"
        @help-modal-footer-button-click="${t}"
      >
      </bbva-help-modal>
    `}get _tplDataManagers(){return a`
      <bbva-global-configuration-net-worth-api-dm
        id="netWorthConfigurationDM"
        ?native="${this.native}"
        .host="${this.host}"
        .version="${this.netWorthApiVersion}"
        .requiredToken="${this.requiredToken}"
        .cacheType="${this.netWorthConfigurationCacheType}"
        .cacheKey="${this.netWorthConfigurationCacheKey}"
        @configuration-net-worth-api-dm-fetch="${t=>{this.configuration=null==t?void 0:t.detail}}"
        @configuration-net-worth-api-dm-fetch-error="${()=>{this.showNotify(this.t("advice-fh-configuration-saving-error-notification"),"","error")}}"
        @configuration-net-worth-api-dm-update="${this._finishConfigurationSaving}"
        @configuration-net-worth-api-dm-update-error="${this._handleUpdateDmError}"
        @api-dm-error="${this._handleUpdateDmError}"
      >
      </bbva-global-configuration-net-worth-api-dm>
      <bbva-global-goods-api-dm
        id="goodsDM"
        ?native="${this.native}"
        .host="${this.host}"
        .version="${this.netWorthApiVersion}"
        .requiredToken="${this.requiredToken}"
        .cacheType="${this.goodsCacheType}"
        .cacheKey="${this.goodsCacheKey}"
        @goods-api-dm-fetch="${t=>{this.goods=null==t?void 0:t.detail}}"
      >
      </bbva-global-goods-api-dm>
      <bbva-global-financial-overview-api-dm
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        cachekey="${n(this.financialOverviewCacheKey)}"
        cachetype="${n(this.financialOverviewCacheKey&&this.cacheType)}"
        host="${this.host}"
        id="dmFinancialOverview"
        version="${this.financialOverviewApiVersion}"
        @financial-overview-api-dm-fetch="${this._handleFinancialOverviewApiDmFetch}"
      ></bbva-global-financial-overview-api-dm>
      <bbva-global-retail-financial-overview-api-dm
        .host="${this.host}"
        ?native="${this.native}"
        country="${this.retailFinancialOverviewCountry}"
        version="${this.versionRetailFinancialOverviewApiDm}"
        .requiredToken="${this.requiredToken}"
        @financial-overview-api-dm-fetch="${this._handleRetailFinancialOverviewApiDmFetch}"
        @api-dm-error="${()=>{this.retailFinancialOverviewData=[]}}"
      >
      </bbva-global-retail-financial-overview-api-dm>
      <bbva-global-pfms-api-dm
        .host="${this.host}"
        ?native="${this.native}"
        version="${this.personalFinancesApiVersion}"
        .requiredToken="${this.requiredToken}"
        @pfms-api-dm-fetch="${this._handlePfmApiDmFetch}"
      >
      </bbva-global-pfms-api-dm>
      <bbva-global-pfm-api-dm
        .host="${this.host}"
        ?native="${this.native}"
        version="${this.personalFinancesApiVersion}"
        .requiredToken="${this.requiredToken}"
        @pfm-api-dm-update="${this._handlePfmApiDmPatch}"
        @pfm-api-dm-update-error="${this._handleUpdateDmError}"
        @api-dm-error="${this._handleUpdateDmError}"
      >
      </bbva-global-pfm-api-dm>
      <bbva-global-contracts-configurations-api-dm
        id="contractsConfigurationsDm"
        .headers="${{"accept-language":this.language}}"
        .host="${this.host}"
        .requiredToken="${this.requiredToken}"
        version="${n(this.financialInvestmentsApiVersion)}"
        ?native="${this.native}"
        @contracts-configurations-api-dm-fetch="${this._handleContractsConfigurationsFetch}"
        @contracts-configurations-api-dm-fetch-error="${this._handleContractsConfigurationsFetchError}"
        @api-dm-error="${this._handleContractsConfigurationsFetchError}"
      ></bbva-global-contracts-configurations-api-dm>
      <bbva-global-contracts-configuration-related-contracts-api-dm
        id="contractsConfigurationRelatedContractsDm"
        .headers="${{"accept-language":this.language}}"
        .host="${this.host}"
        .version="${this.financialInvestmentsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @contracts-configuration-related-contracts-api-dm-create="${this._handlerRelatedContractPost}"
        @contracts-configuration-related-contracts-api-dm-create-error="${this._handlerErrorRelatedContractPost}"
        @contracts-configuration-related-contracts-api-dm-update="${this._handlerRelatedContractPatch}"
        @contracts-configuration-related-contracts-api-dm-update-error="${this._handlerErrorRelatedContractPatch}"
        @api-dm-error="${this._handleUpdateDmError}"
      >
      </bbva-global-contracts-configuration-related-contracts-api-dm>
      <bbva-global-contracts-configuration-api-dm
        id="contractsConfigurationDm"
        .host="${this.host}"
        .version="${this.financialInvestmentsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @contracts-configuration-api-dm-update="${this._callbackPatchContractsConfiguration}"
        @contracts-configuration-api-dm-update-error="${this._callbackErrorPatchContractsConfiguration}"
        @api-dm-error="${this._callbackErrorPatchContractsConfiguration}"
      >
      </bbva-global-contracts-configuration-api-dm>
    `}get _configurationProductsPanel(){return this.hidePfmConfiguration?o:a`
      <div class="panel" role="tabpanel" id="content-0" aria-labelledby="tab-0">
        <div ambient="primary-alt" class="configuration-wrapper">
          <advice-fh-configuration-products
            personal-finances-api-version="${this.personalFinancesApiVersion}"
            version-retail-financial-overview-api-dm="${this.versionRetailFinancialOverviewApiDm}"
            credit-card-classification="${this.creditCardClassification}"
            prepaid-card-classification="${this.prepaidCardClassification}"
            pfm-id="${this.pfmId}"
            channel-Id="${this.channelId}"
            debit-card-type="${this.debitCardType}"
            .amountsAvailable="${this.amountsAvailable}"
            ?use-external-products="${this.useExternalProducts}"
            ?use-inactive-products="${this.useInactiveProducts}"
            ?web-selector="${this.webSelector}"
            ?hide-forecasting="${this.hideForecasting}"
            ?hide-notification-message="${this.hideNotificationMessage}"
            ?native="${this.native}"
            ?enable-forecast="${this._enableForecast}"
            ?discreet-mode="${this.discreetMode}"
            currency="${this.currency}"
            .host="${this.host}"
            .language="${this.language}"
            .version="${this.netWorthApiVersion}"
            .requiredToken="${this.requiredToken}"
            .pfmData="${this._pfmData}"
            .statusOperative="${this.statusOperative}"
            .entitiesImages="${this.entitiesImages}"
            .financialOverviewData="${this.financialOverviewData}"
            .retailFinancialOverviewData="${this.retailFinancialOverviewData}"
            @advice-fh-configuration-products-toggle-item="${this._handlePfmProductChange}"
            @advice-fh-configuration-products-period-change="${this._handlePfmPeriodChange}"
            @advice-fh-configuration-products-forecast-toggle="${this._handleForecastChange}"
            @advice-fh-configuration-know-more-modal-open="${this._handleShowKnowMore}"
          >
          </advice-fh-configuration-products>
        </div>
      </div>
    `}get _configurationHomePanel(){return this.hideHomeConfiguration?o:a`
      <div class="panel" role="tabpanel" id="content-1" aria-labelledby="tab-1">
        <advice-fh-configuration-home
          .configuration="${this.configuration}"
          .goods="${this.goods}"
          .ownershipPercentages="${this.ownershipPercentages}"
          .netWorthConfigurationCacheType="${this.netWorthConfigurationCacheType}"
          .netWorthConfigurationCacheKey="${this.netWorthConfigurationCacheKey}"
          .goodsCacheType="${this.goodsCacheType}"
          .goodsCacheKey="${this.goodsCacheKey}"
          .confirmationMessageModal="${this.confirmationMessageModal}"
          ?native="${this.native}"
          .host="${this.host}"
          .version="${this.netWorthApiVersion}"
          .requiredToken="${this.requiredToken}"
          .netWorthApiVersion="${this.netWorthApiVersion}"
          @advice-fh-configuration-know-more-modal-open="${this._handleShowKnowMore}"
          @advice-fh-configuration-home-toggle="${this._handleHomeToggle}"
          @advice-fh-configuration-edit-ownership-modal-open="${t=>{this._homeToEdit=t.detail,this._lastSelectedOwnership=t.detail.ownership}}"
        ></advice-fh-configuration-home>
      </div>
    `}get _configurationInvestmentPanel(){return this.hideInvestmentConfiguration?o:a`
      <div class="panel" role="tabpanel" id="content-2" aria-labelledby="tab-2">
        <div ambient="primary-alt" class="configuration-wrapper">
          <advice-fh-configuration-investments
            ?native="${this.native}"
            ?discreet-mode="${this.discreetMode}"
            .host="${this.host}"
            .language="${this.language}"
            .version="${this.netWorthApiVersion}"
            .requiredToken="${this.requiredToken}"
            .entitiesImages="${this.entitiesImages}"
            ._internalInvestmentsContracts="${this._internalInvestmentsContracts}"
            ._contractsConfiguration="${this._contractsConfiguration}"
            ._selectedPeriod="${this._selectedInvestmentsPeriod}"
            ._atLeastOneVisibleProduct="${this._atLeastOneVisibleProduct}"
            @advice-fh-configuration-investments-toggle-change="${this._updateDataStatus}"
            @advice-fh-configuration-investments-open-select-period-modal="${this._handleShowSelectPeriodInvestementsModal}"
          >
          </advice-fh-configuration-investments>
        </div>
      </div>
    `}get _saveButtonDisabled(){return this._saveInvestmentsSBlocked||!this._pfmConfigChanged&&!this._modifiedHomeProducts&&!this._checkSaveButtonForInvestments}render(){return a`
      ${super.render()} ${this._tplDataManagers}
      <bbva-help-modal
        ambient="primary-alt"
        id="modal-products"
        avoid-icon-close-modal
        data-id="modalProducts"
        ?visible="${this.productsModal}"
        .contentStyles="${ie}"
        .closeModalElements="${[]}"
        ?attach-to-body="${this.attachModalsToBody}"
        full-height
        fixed-footer
        header-type="modal"
        hide-content-padding-top
        ?disabled-button="${this._saveButtonDisabled}"
        header-text="${this.t("advice-fh-configuration-header-title")}"
        button-text="${this.t("advice-fh-configuration-saving-text-button")}"
        header-close-icon-aria-label="${this.t("advice-fh-configuration-close-text-button")}"
        @help-modal-footer-button-click="${this._handleConfirmSaveButton}"
        @modal-state-change="${({detail:t})=>{const e=t.visible?"open":"close";this.productsModal=t.visible,this._dispatchCustomEvent(`advice-fh-configuration-products-modal-${e}`)}}"
        @header-main-icon-click=${()=>{this._initialInvestmentConfiguration.periodInitialNumber!==this._selectedInvestmentsPeriod||this._modifiedInvestmentProductsFromBeginning?(this.exitMessageModal=!0,this._dispatchCustomEvent("advice-fh-configuration-exit-configuration-error-modal-open")):this._pfmConfigChanged||this._modifiedHomeProducts?this.exitMessageModal=!0:(this.productsModal=!1,this._dispatchCustomEvent("advice-fh-configuration-modal-close"))}}
      >
        <div class="content-wrapper" slot="slot-content">
          <bbva-type-text unset size="S" text="${this.t("advice-fh-configuration-title")}">
          </bbva-type-text>

          ${this._tabOptions.length>1?a`
                <bbva-tab-default
                  selected="${this._selectedTab}"
                  accessibility-text="${this.t("advice-fh-configuration-tab-accesibility-text")}"
                  .options="${this._tabOptions}"
                  ?loading="${!this._investmentLoaded}"
                  horizontal-scroll
                  tabs-per-page="2"
                  ambient="primary-alt"
                >
                  ${this._tabPanels}
                </bbva-tab-default>
              `:a`${this._tabPanels}`}
          ${this._showLoadingSpinnerTmpl}
        </div>
      </bbva-help-modal>
      ${this._tplModalKnowMore} ${this._tplModalConfirmationMessage} ${this._updateErrorTmpl}
      ${this._modalErrorTmpl} ${this._tplModalEditOwnership}
      ${this._tplModalSelectInvestmentsPeriod}
    `}}customElements.define(ue.is,ue);
