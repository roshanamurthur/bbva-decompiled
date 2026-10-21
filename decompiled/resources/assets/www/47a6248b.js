import{aX as e,an as t}from"./7f3d7ca9.js";import{z as a,ar as i,a as n,an as s,L as r,cq as o,b4 as g,ag as h,b5 as p,G as m,ak as d,h as l,av as v}from"./952f98a9.js";import{b as c,a as b}from"./675a5f8f.js";import"./216055dc.js";import"./c0a2f832.js";import"./cae0f1de.js";class u extends c{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`money-laundering/v${this.version}/international-transfers/search`)}toString(){return super.toString("BGADPMoneyLaunderingInternationalTransfersSearchPostV0")}}var y=a`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-header-category][variant=date] {
  --bbva-header-category-date-height: auto;
  padding-top: var(--bbva-aggregation-movement-list-header-category-date-padding-top, 1.5rem);
  padding-bottom: var(--bbva-aggregation-movement-list-header-category-date-padding-bottom, 0);
}
[data-tag-name=bbva-header-category][variant=date]:first-child {
  padding-top: var(--bbva-aggregation-movement-list-header-category-date-first-child-padding-top, 1rem);
}

.spinner {
  height: var(--bbva-aggregation-movement-list-spinner-height, 4rem);
}
.spinner.finished {
  height: var(--bbva-aggregation-movement-list-spinner-finished-height, 0.75rem);
}
${(new i).mediaRules()}`;class _ extends(n(s(r))){static get is(){return"bbva-aggregation-movement-list"}static get scopedElements(){return{"bbva-list-movement":o,"bbva-divider":g,"bbva-banner-image":e,"bbva-text":h,"bbva-header-category":p,"bbva-spinner":m}}static get properties(){return{movementGroups:{type:Array},emptyImageMovement:{type:String,attribute:"empty-image-movement"},emptyMovementText:{type:String,attribute:"empty-movement-text"},hideSpinner:{type:Boolean},groupHeaderVariant:{type:String},language:{type:String},localCurrency:{type:String},noMoreMovements:{type:Boolean}}}constructor(){super(),this.movementGroups=[],this.emptyImageMovement="",this.hideSpinner=!1,this.groupHeaderVariant="",this.language="",this.localCurrency="",this.noMoreMovements=!1}static get styles(){return[y,d("bbva-aggregation-movement-list-shared-styles")]}get _hasMovements(){return this.movementGroups.length>0}_getSizeDivider(e,t){return e.length-1===t?"":"fit"}_handleItemClick(e){this._dispatchEvent("aggregation-movement-list-item-click",e.detail)}render(){return l`
    ${this._hasMovements||!this.hideSpinner?l`
    ${this.movementGroups.map(((e,t)=>l`
      <bbva-header-category
      id="header-category-${t}"
      variant="${this.groupHeaderVariant}"
      text="${e.headerText}"></bbva-header-category>

      ${e.transactions.map(((a,i)=>l`
        <bbva-list-movement
          ellipsis
          id="movement-${t}-${i}"
          card-title="${a.cardTitle}"
          amount="${a.amount}"
          local-currency="${this.localCurrency}"
          currency-code="${a.currencyCode}"
          badge-text="${a.badgeText}"
          badge-text-type="${a.textType}"
          language="${this.language}"
          .movementData=${a.movementData}
          @list-movement-item-click="${this._handleItemClick}">
        </bbva-list-movement>
        <bbva-divider size="${this._getSizeDivider(e.transactions,i)}"></bbva-divider>
        `))}
      `))}
      <div class="spinner ${v({finished:this.noMoreMovements})}">
        <bbva-spinner size="50" with-mask .hidden="${this.hideSpinner}"></bbva-spinner>
      </div>
      `:l`
      <bbva-banner-image
        image-src="${this.emptyImageMovement}"
        variant="large">
      </bbva-banner-image>
      <bbva-text
        text="${this.emptyMovementText}"
        alignment="center">
      </bbva-text>
    `}
    `}init(){this.hideSpinner=!1,this.movementGroups=[],this.noMoreMovements=!1}_dispatchEvent(e,t){this.dispatchEvent(new CustomEvent(e,{detail:t,composed:!0,bubbles:!0}))}}customElements.define(_.is,_);class f extends(b(r)){static get is(){return"bbva-dataprovider-money-laundering-international-transfers"}constructor(){super(),this.morePages=!1,this.nextKey=""}reset(){this.morePages=!1,this.nextKey=""}postInternationalTransfersSearch(e){const t="international-transfers-search-post",a={customEvent:`${this._customEventPrefix}-${t}-successful-response`,errorFireEventHandler:`${this._customEventPrefix}-${t}-error-response`,paginationEvent:`${this._customEventPrefix}-${t}-pagination`};this._generateServiceRequest({},"internationalTransfersSearchPost",a,e)}_responseMapping(){this.page+=1}_getBgadp(e){return{internationalTransfersSearchPostV0:()=>new u(e),default:()=>this._defaulResponse}}_parseResponse(e,t,a,i,n){return e&&Object.keys(e).length?(this.apiInfo=e.apiInfo,t&&e.data&&Object.keys(e.data).length&&t.bind(this,e.data)(),this._generatePagination(e.pagination||{links:{}}),n.paginationEvent&&n.paginationEvent.length&&this.dispatchEvent(new CustomEvent(n.paginationEvent,{detail:{nextKey:this.nextKey,morePages:this.morePages,page:this.page},bubbles:!0,composed:!0})),e.messages&&Object.keys(e.messages).length&&this._parseResponseMessages(e.messages),this._getFields(e.data?e.data:e,a)):this._errorHandler(e)}}customElements.define(f.is,f);class $ extends(t(r)){static get is(){return"bbva-analytics-manager-international-transfer-historical"}static get properties(){return{operationsType:{type:Object},_operationType:{type:String},_isInitialized:{type:Boolean}}}constructor(){super(),this.operationsType={},this._isInitialized=!1,this._operationType=""}_initProperties(){this._operationType="",this._isInitialized=!1}init({operationType:e}){this._initProperties(),this._operationType=e||"",this.fireHistoricalPageView()}setIsInitialized(e){this._isInitialized=this._getValueByPath(e,"value",!1),this.fireHistoricalPageView()}fireHistoricalPageView(){if(this._isInitialized&&this._operationType.length){const e=this._getValueByPath(this.operationsType,this._operationType);this._dispatchEvent("analytics-page-view-international-transfers-historical",{level3:e})}}}customElements.define($.is,$);
