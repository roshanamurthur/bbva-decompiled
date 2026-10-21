import"./030ebdec.js";import"./7f3d7ca9.js";import{a as t,an as e,L as i,h as a,z as s,ak as r}from"./952f98a9.js";import{B as o}from"./d7cc5593.js";import{M as n,L as d,K as c,G as l,H as p,aa as h}from"./216055dc.js";import"./43966a25.js";import"./c0a2f832.js";import"./cae0f1de.js";class v extends(t(e(i))){static get is(){return"bbva-controller-tdd-card-link-and-activation-entry-point-mx"}static get scopedElements(){const t=[o];return v.scopedElementsFromClasses(t)}static get properties(){return{body:{type:Object},host:{type:String},native:{type:Boolean},requiredToken:{type:String,attribute:"required-token"},typeConfigs:{type:Object},cardProposeDeliveryApiVersion:{type:String,attribute:"cards-propose-delivery-api-version"},_cardDataFinancialOverview:{type:Object},_cardType:{type:String},_cost:{type:Number},_account:{type:Object},cardId:{type:String,attribute:"card-id"},cardDetail:{type:Object},financialOverview:{type:Object},isMinor:{type:Boolean,attribute:"is-minor"},flagCollection:{type:Object},requiredOTP:{type:Boolean,attribute:"required-otp"},appSettings:{type:Object},subProductsType:{type:Array}}}constructor(){super(),this.body={},this.host="",this.native=!1,this._cardDataFinancialOverview={},this._cardType="",this._cost=0,this._account={},this.cardProposeDeliveryApiVersion="",this.typeConfigs={},this.cardId="",this.cardDetail={},this.financialOverview={},this.requiredToken="",this.isMinor=!1,this.flagCollection={},this.requiredOTP=!1,this.appSettings={},this.subProductsType=["0201"]}updated(t){if(this.cardId&&t.has("cardId")&&(this._wipeData(),this._parseData()),!this.isMinor&&Object.keys(this.cardDetail).length&&t.has("cardDetail")){var e,i;this._checkFlags();(Object.keys(this.typeConfigs).find((t=>this.typeConfigs[t].value))??!1)&&this.subProductsType.includes(null===(e=this._account)||void 0===e||null===(i=e.subProductType)||void 0===i?void 0:i.id)&&(this._getDeliveryTimeFromAppSettings(),this._setUpProposeDelivery())}}get _proposeDeliveryDM(){return this.shadowRoot.querySelector(`[data-tag-name="${o.is}"]`)}get _bbvaGlobalCardProposeDelivery(){return a`
        <bbva-global-card-propose-delivery-api-dm
          host="${this.host}"
          version="${this.cardProposeDeliveryApiVersion}"
          ?native="${this.native}"
          .requiredToken="${this.requiredToken}"
          ?requiredOTP="${this.requiredOTP}"
          @card-propose-delivery-api-dm-create="${this._handleDeliveryProposal}"
          @card-propose-delivery-api-dm-create-error="${this._wipeData}"
          @api-dm-error="${this._wipeData}"
        >
        </bbva-global-card-propose-delivery-api-dm>
      `}_setUpProposeDelivery(){var t;(this.body={processId:"NEW",status:"NEW"},this._isVirtual())&&(null===(t=this._proposeDeliveryDM)||void 0===t||t.postCardProposeDelivery(this.cardId,this.body))}_parseData(){var t,e,i,a,s;this._cardDataFinancialOverview=null===(t=this.financialOverview.data)||void 0===t||null===(e=t.contracts)||void 0===e?void 0:e.find((({id:t})=>t===this.cardId));const r=null===(i=this._cardDataFinancialOverview.relatedContracts)||void 0===i?void 0:i.find((({contractId:t})=>t));this._account=null===(a=this.financialOverview.data)||void 0===a||null===(s=a.contracts)||void 0===s?void 0:s.find((({number:t})=>t===(null==r?void 0:r.contractId)))}_handleDeliveryProposal({detail:t}){var e,i,a;this._cardType=null==t||null===(e=t.redirectType)||void 0===e?void 0:e.id,this._cost=null==t||null===(i=t.commission)||void 0===i?void 0:i.amount,this._unaffordable()||null!==(a=this.typeConfigs[this._cardType])&&void 0!==a&&a.value&&this._getBanner()}_getBanner(){const t=this.typeConfigs[this._cardType].card;t.text=t.text.replace("*",this._cost),t.type=this._cardType;const e={card_configs:t,cost:this._cost,simple_code:this._account.simpleCode,product_id:this.cardDetail.product.id};this._sendData(e)}_checkFlags(){Object.keys(this.typeConfigs).forEach((t=>{var e,i;this.typeConfigs[`${t}`].value=null===(e=this.flagCollection[null===(i=this.typeConfigs[`${t}`])||void 0===i?void 0:i.key])||void 0===e?void 0:e.value}))}_isVirtual(){var t,e;return"VIRTUAL"===((null===(t=this.cardDetail.physicalSupport)||void 0===t?void 0:t.id)||(null===(e=this.cardDetail.cardType)||void 0===e?void 0:e.physicalSupport.id))}_unaffordable(){return this._cardDataFinancialOverview.detail.specificAmounts.find((({id:t})=>"CURRENT_BALANCE"===t)).amounts[0].amount<this._cost}_getDeliveryTimeFromAppSettings(){var t,e;const i=(null===(t=this.appSettings)||void 0===t||null===(e=t.cardOriginationOcDebitCardInmediateDelivery)||void 0===e?void 0:e.deliveryTime)??"",a={delivery_time:this.t("card-origination-oc-debit-card-inmediate-delivery-deliveryTime",{date:i})};i&&this._sendData(a)}_wipeData(){this._sendData({card_configs:{},cost:0,simple_code:"",product_id:""})}_sendData(t){Object.entries(t).forEach((([t,e])=>{this.dispatchEvent(new CustomEvent(`${v.is}-${t.replace("_","-")}`,{bubbles:!0,composed:!0,detail:e}))}))}render(){return a`
      ${this._bbvaGlobalCardProposeDelivery}
    `}}customElements.define("bbva-controller-tdd-card-link-and-activation-entry-point-mx",v);var u=s`
:host {
  display: block;
  box-sizing: border-box;
  margin: 0.5rem 1rem;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}

[data-tag-name=bbva-panel-container] {
  padding-top: 0.625rem;
}

[data-tag-name=bbva-type-link] {
  padding: 0.125rem 1rem 1rem;
}
`;class y extends(n(d(i))){static get is(){return"bbva-feature-card-link-and-activation-qr_card"}static get scopedElements(){const t=[c,l,p,h,...y.configurationScopedElements()];return y.scopedElementsFromClasses(t)}static get properties(){return{hidden:{type:Boolean,reflect:!0},configs:{type:Object}}}constructor(){super(),this.configs={}}static get styles(){return[u,r("bbva-feature-card-link-and-activation-qr_card-shared-styles")]}get _renderPanelContainer(){return a`
      <bbva-panel-container variant="card" panel-color="">
        <div class="subcontainer">
          <bbva-clip-microillustration
            class="microillustration"
            microillustration="${this.configs.microillustration}"
            size="S"
          >
          </bbva-clip-microillustration>
          <bbva-type-text
            size="L"
            font-weight="500"
            tag="span"
            text="${this.configs.title}"
          ></bbva-type-text>
          <bbva-type-text
            size="S"
            font-weight="350"
            tag="span"
            text="${this.configs.text}"
          ></bbva-type-text>
        </div>
      </bbva-panel-container>
      <bbva-type-link class="panelLink"
        text="${this.configs.link}"
        @click="${this._linkClick}"
      ></bbva-type-link>
    `}get _content(){if(Object.keys(this.configs).length)return this.hidden=!1,this._cardLoad(),this._renderPanelContainer;this.hidden=!0}_linkClick(){this._dispatchCustomEvent(`${y.is}-link-click-${this.configs.type.toLowerCase().replace("_","-")}`)}_cardLoad(){this._dispatchCustomEvent(`${y.is}-card-load-${this.configs.type.toLowerCase().replace("_","-")}`)}render(){return a`
      ${this._content}
    `}}class b extends y{static get is(){return"bbva-feature-card-link-and-activation-qr-card-mx"}static get properties(){return{}}}customElements.define(b.is,b);
