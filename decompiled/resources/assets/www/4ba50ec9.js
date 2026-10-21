import{h as t,z as e,an as i,L as s,ak as a,i as o,dz as r,b7 as n,aV as c,cT as l,ez as d,bF as p,cU as h,aN as u,aD as b,H as m}from"./952f98a9.js";import{R as y,S as f,M as g,v as _,L as v,af as $,G as C,H as x,D as P,z as j,K as w,e as S,N as D,Q as E,P as T,an as k,a2 as A,ao as M,F as q,a1 as F,A as B,f as O,V as z,I as R,E as I,a4 as N,a3 as L,Z as W,Y as H,ah as U,h as V}from"./216055dc.js";import{B as K}from"./77df3611.js";import{bT as X,b$ as Y,aH as G,aI as J,bf as Z,bg as Q,B as tt}from"./7f3d7ca9.js";import{B as et}from"./2d510525.js";import{a as it,c as st,d as at,e as ot}from"./b87bf4dd.js";import{B as rt}from"./459715fc.js";import"./20acd25d.js";import{B as nt}from"./4861c1f7.js";import{B as ct}from"./077d7438.js";import{H as lt}from"./e7d77b44.js";import{B as dt,b as pt}from"./2fc6c95e.js";import{B as ht,b as ut}from"./84dff06e.js";import{B as bt,b as mt}from"./41ed0536.js";import{a as yt,B as ft}from"./e3d898b2.js";import{B as gt,b as _t}from"./d335c75d.js";import{B as vt}from"./972f570a.js";import{B as $t,a as Ct}from"./ff7f0130.js";import"./be12d7a2.js";import"./72e6e777.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./f89161ad.js";import"./7d773f57.js";import"./d2484b66.js";import"./4656db6d.js";import"./1aa01966.js";import"./32b24593.js";import"./13014d63.js";import"./7f28d0e7.js";import"./dd13577a.js";class xt extends it{static get is(){return"bbva-global-forestry-projects-api-dm"}static get properties(){return{forestryProjects:{type:Array,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.forestryProjects=[],this.country="",this.localCustomProperties={},this._countries=[],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties","maxRetries","pendingTimeOut","forestryProjects"],this._loaded=!1,this._requestParams={}}update(t){super.update(t),t.forEach(((t,e)=>{"country"===e&&this.country&&this.country!==t?this._loadModule():"_module"!==e&&"_requestParams"!==e&&"_loaded"!==e&&this._module&&this[e]!==t?this._module[e]=this[e]:("_requestParams"===e&&this._requestParams&&this._requestParams!==t&&void 0!==t&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===e&&this._loaded)&&Object.entries(this._requestParams).forEach((([t])=>{this[`_${t}ForestryProjects`]()}))}))}async _loadModule(){const t=this._capitalize(this.country);if(this._countries.includes(t)&&this._modules[t]){const e=`BbvaForestryProjects${t}ApiDm`;(0,this._modules[t])().then((async t=>{const i=t[e].is;this._module=this._createModuleElement(i),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-forestry-projects-api-dm-module-load")})).catch((async t=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-forestry-projects-api-dm-module-error",t)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(t){return t.charAt(0).toUpperCase()+t.slice(1).toLowerCase()}_createModuleElement(t=st.is){const e=document.createElement(t);return this._bindConfig(e),e}async _bindConfig(t){this._configProperties.forEach((e=>{t[e]=this[e]})),await this.updateComplete}_dispatchEvent(t,e=!0){this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:!0,composed:!0}))}async resetForestryProjects(){await this.module.updateComplete,this.module.resetForestryProjects()}async getForestryProjects(t={}){await this.module.updateComplete,this._requestParams.get?this._requestParams.get.push({params:t}):this._requestParams={get:[{params:t}]}}async _getForestryProjects(){await this.module.updateComplete,Object.keys(this.forestryProjects).length||(this._requestParams.get.forEach((t=>{this.module.getForestryProjects(t.params)})),delete this._requestParams.get)}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return t` ${this._module?this._module:""}`}}class Pt extends it{static get is(){return"bbva-global-forestry-projects-payment-processes-api-dm"}static get properties(){return{country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.country="",this.localCustomProperties={},this._countries=[],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties","maxRetries","pendingTimeOut"],this._loaded=!1,this._requestParams={}}update(t){super.update(t),t.forEach(((t,e)=>{"country"===e&&this.country&&this.country!==t?this._loadModule():"_module"!==e&&"_requestParams"!==e&&"_loaded"!==e&&this._module&&this[e]!==t?this._module[e]=this[e]:("_requestParams"===e&&this._requestParams&&this._requestParams!==t&&void 0!==t&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===e&&this._loaded)&&Object.entries(this._requestParams).forEach((([t])=>{this[`_${t}ForestryProjectsPaymentProcesses`]()}))}))}async _loadModule(){const t=this._capitalize(this.country);if(this._countries.includes(t)&&this._modules[t]){const e=`BbvaForestryProjectsPaymentProcesses${t}ApiDm`;(0,this._modules[t])().then((async t=>{const i=t[e].is;this._module=this._createModuleElement(i),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-forestry-projects-payment-processes-api-dm-module-load")})).catch((async t=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-forestry-projects-payment-processes-api-dm-module-error",t)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(t){return t.charAt(0).toUpperCase()+t.slice(1).toLowerCase()}_createModuleElement(t=at.is){const e=document.createElement(t);return this._bindConfig(e),e}async _bindConfig(t){this._configProperties.forEach((e=>{t[e]=this[e]})),await this.updateComplete}_dispatchEvent(t,e=!0){this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:!0,composed:!0}))}async postForestryProjectsPaymentProcesses(t){await this.module.updateComplete,this._requestParams.post?this._requestParams.post.push({body:t}):this._requestParams={post:[{body:t}]}}async _postForestryProjectsPaymentProcesses(){await this.module.updateComplete,this._requestParams.post.forEach((t=>{this.module.postForestryProjectsPaymentProcesses(t.body)})),delete this._requestParams.post}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return t` ${this._module?this._module:""}`}}class jt extends it{static get is(){return"bbva-global-forestry-projects-contributions-balances-api-dm"}static get properties(){return{forestryProjectsContributionsBalances:{type:Array,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.forestryProjectsContributionsBalances=[],this.country="",this.localCustomProperties={},this._countries=[],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties","maxRetries","pendingTimeOut","forestryProjectsContributionsBalances"],this._loaded=!1,this._requestParams={}}update(t){super.update(t),t.forEach(((t,e)=>{"country"===e&&this.country&&this.country!==t?this._loadModule():"_module"!==e&&"_requestParams"!==e&&"_loaded"!==e&&this._module&&this[e]!==t?this._module[e]=this[e]:("_requestParams"===e&&this._requestParams&&this._requestParams!==t&&void 0!==t&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===e&&this._loaded)&&Object.entries(this._requestParams).forEach((([t])=>{this[`_${t}ForestryProjectsContributionsBalances`]()}))}))}async _loadModule(){const t=this._capitalize(this.country);if(this._countries.includes(t)&&this._modules[t]){const e=`BbvaForestryProjectsContributionsBalances${t}ApiDm`;(0,this._modules[t])().then((async t=>{const i=t[e].is;this._module=this._createModuleElement(i),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-forestry-projects-contributions-balances-api-dm-module-load")})).catch((async t=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-forestry-projects-contributions-balances-api-dm-module-error",t)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(t){return t.charAt(0).toUpperCase()+t.slice(1).toLowerCase()}_createModuleElement(t=ot.is){const e=document.createElement(t);return this._bindConfig(e),e}async _bindConfig(t){this._configProperties.forEach((e=>{t[e]=this[e]})),await this.updateComplete}_dispatchEvent(t,e=!0){this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:!0,composed:!0}))}async resetForestryProjectsContributionsBalances(){await this.module.updateComplete,this.module.resetForestryProjectsContributionsBalances()}async getForestryProjectsContributionsBalances(t={}){await this.module.updateComplete,this._requestParams.get?this._requestParams.get.push({params:t}):this._requestParams={get:[{params:t}]}}async _getForestryProjectsContributionsBalances(){await this.module.updateComplete,Object.keys(this.forestryProjectsContributionsBalances).length||(this._requestParams.get.forEach((t=>{this.module.getForestryProjectsContributionsBalances(t.params)})),delete this._requestParams.get)}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return t` ${this._module?this._module:""}`}}var wt=e`
  :host {
    display: block;
    box-sizing: border-box;
  }

  :host([hidden]),
  [hidden] {
    display: none !important;
  }

  *,
  *::before,
  *::after {
    box-sizing: inherit;
  }

  .card {
    display: flex;
    flex-direction: column;
    background-color: ${y("colorPrimarySurfaceAmbientPressed",f)};
  }
  .card .card-content {
    flex: 1;
    padding: 1rem;
  }
  .card .card-content [data-tag-name='bbva-badge-icon'] {
    margin-top: 0.5rem;
  }
  .card .card-content [data-tag-name='bbva-type-text'].card-description {
    margin-top: 0.5rem;
    width: 100%;
  }

  .card.horizontal {
    flex-direction: row;
    text-align: left;
  }
  .card.horizontal [data-tag-name='bbva-banner-image'] {
    flex: 0 0 36%;
    min-width: 6.25rem;
    max-height: none;
  }
`;class St extends(g(_(v(i(s))))){static get is(){return"sustainability-carbon-footprint-offset-project-card"}static get scopedElements(){const t=[$,X,C,x,...St.configurationScopedElements()];return St.scopedElementsFromClasses(t)}static get properties(){return{projectImage:{type:String,attribute:"project-image"},projectTitle:{type:String,attribute:"project-title"},projectDescription:{type:String,attribute:"project-description"},location:{type:String},projectId:{type:String,attribute:"project-id"},loading:{type:Boolean,attribute:"loading"},cardLayout:{type:String,attribute:"card-layout"}}}constructor(){super(),this.projectImage="",this.projectTitle="",this.projectDescription="",this.location="",this.loading=!1,this.projectId="",this.cardLayout="vertical"}static get styles(){return[wt,P.primary,j.primary,a("sustainability-carbon-footprint-offset-project-card-shared-styles")]}_onClickProject(){this._dispatchCustomEvent(`${St.is}-project-clicked`,this.projectId)}render(){return t`
      <div class="card ${this.cardLayout}">
        <bbva-banner-image
          class="card-image"
          ?loading="${this.loading}"
          size="L"
          image-src=${o(this.projectImage)}
          img-accessibility-text="${this.projectTitle}"
        ></bbva-banner-image>
        <div class="card-content">
          <bbva-type-link
            ambient="primary"
            ?loading="${this.loading}"
            size="L"
            id="${this.projectId}"
            @click=${this._onClickProject}
            >${this.projectTitle}</bbva-type-link
          >
          <bbva-badge-icon
            ?loading="${this.loading}"
            icon="${r()}"
            description="${this.location}"
          ></bbva-badge-icon>
          <bbva-type-text
            ambient="primary"
            tag="span"
            class="card-description"
            ?loading="${this.loading}"
            text=${this.projectDescription}
            size="S"
            ?ellipsis="${"horizontal"===this.cardLayout}"
            lines="${"horizontal"===this.cardLayout?2:""}"
          ></bbva-type-text>
        </div>
      </div>
    `}}var Dt=e`
  :host {
    display: block;
    box-sizing: border-box;
  }
  :host [data-tag-name='bbva-carousel-default'] .swiper-container {
    padding: 0;
  }

  :host([hidden]),
  [hidden] {
    display: none !important;
  }

  *,
  *::before,
  *::after {
    box-sizing: inherit;
  }
`;class Et extends(g(_(v(i(s))))){static get is(){return"sustainability-carbon-footprint-offset-carousel"}static get scopedElements(){const t=[K,St,...Et.configurationScopedElements()];return Et.scopedElementsFromClasses(t)}static get properties(){return{forestryProjects:{type:Array},loading:{type:Boolean,attribute:"loading"}}}constructor(){super(),this.forestryProjects=[],this.loading=!1,this._scopedItems=[{tagName:"sustainability-carbon-footprint-offset-project-card",class:St}]}static get styles(){return[Dt,a("sustainability-carbon-footprint-offset-carousel-shared-styles")]}render(){return t` <bbva-carousel-default
      ambient="primary"
      type="scroll"
      variant="two-columns"
      .scopedComponents="${this._scopedItems}"
      .items="${this.forestryProjects.map((e=>({content:t`
          <sustainability-carbon-footprint-offset-project-card
            ?loading="${this.loading}"
            project-id="${e.id}"
            project-title="${e.name}"
            project-description="${e.summary}"
            project-image="${e.image.url}"
            location="${e.location}"
          ></sustainability-carbon-footprint-offset-project-card>
        `})))}"
    ></bbva-carousel-default>`}}var Tt=e`
  :host {
    display: block;
    box-sizing: border-box;
  }

  :host([hidden]),
  [hidden] {
    display: none !important;
  }

  *,
  *::before,
  *::after {
    box-sizing: inherit;
  }

  [data-tag-name='bbva-type-text'] {
    padding: 0.5rem 0;
  }
`;class kt extends(g(i(v(s)))){static get is(){return"sustainability-carbon-footprint-offset-digital-card-alert"}static get scopedElements(){const t=[C,w,S,...kt.configurationScopedElements()];return kt.scopedElementsFromClasses(t)}static get properties(){return{showDigitalCardAlert:{type:Boolean,attribute:"show-digital-card-alert"}}}constructor(){super(),this.showDigitalCardAlert=!1}static get styles(){return[Tt,P.primary,P.secondary,P.primaryAlt,D.primary,D.secondary,D.primaryAlt,a("sustainability-carbon-footprint-offset-digital-card-alert-shared-styles")]}_closeDigitalCardAlert(t){t.stopPropagation(),this._dispatchCustomEvent(`${kt.is}-close-modal`,!1)}render(){return t`
      <bbva-help-modal
        full-height
        header-close-icon-label="${this.t("sustainability-carbon-footprint-offset-faqs-header-close-text")}"
        ?visible="${this.showDigitalCardAlert}"
        header-text="${this.t("sustainability-carbon-footprint-offset-digital-card-alert-header-title")}"
        @header-main-close-icon-click="${this._closeDigitalCardAlert}"
      >
        <div slot="slot-content" class="slot-content">
          <bbva-clip-microillustration
            ambient="primary"
            class="full-padding-segment"
            microillustration="caution"
            size="M"
          ></bbva-clip-microillustration>
          <bbva-type-text
            ambient="primary"
            tag="span"
            text="${this.t("sustainability-carbon-footprint-offset-digital-card-alert-title")}"
            font-weight="700"
            size="XL"
          ></bbva-type-text>
          <bbva-type-text
            ambient="primary"
            tag="span"
            text="${this.t("sustainability-carbon-footprint-offset-digital-card-alert-description")}"
            size="S"
          ></bbva-type-text>
        </div>
      </bbva-help-modal>
    `}}const{moment:At}=window;class Mt extends(_(v(g(s)))){static get is(){return"sustainability-carbon-footprint-offset-dm"}static get scopedElements(){const t=[n,Y,nt,ct,xt,et,Pt,rt,jt,...Mt.configurationScopedElements()];return Mt.scopedElementsFromClasses(t)}static get properties(){return{aemHost:{type:String,attribute:"aem-host"},aemPath:{type:String,attribute:"aem-path"},cardSelected:{type:Object,attribute:"card-selected"},country:{type:String},currencyCode:{type:String,attribute:"currency-code"},cvvGenerated:{type:String,attribute:"cvv-generated"},environment:{type:String},financialData:{type:Object,attribute:"financial-data"},headers:{type:Array},host:{type:String},isPayWithPoints:{type:Boolean,attribute:"is-pay-with-points"},native:{type:Boolean},nativeIos:{type:Boolean,attribute:"native-ios"},requiredToken:{type:String,attribute:"required-token"},selectedProjectAndCredit:{type:Object,attribute:"selected-project-and-credit"},versionCardsApiDm:{type:String,attribute:"version-cards-api-dm"},physicalSupportDescription:{type:String,attribute:"physical-support-description"},versionCustomersApiDm:{type:String,attribute:"version-customers-api-dm"},versionLoyaltyApiDm:{type:String,attribute:"version-loyalty-api-dm"},versionSustainabilityApiDm:{type:String,attribute:"version-sustainability-api-dm"},_cards:{type:Array,state:!0},_customerId:{type:String,state:!0},_extention:{type:String,state:!0},_forestryProjects:{type:Array,state:!0},_isLoadingData:{type:Boolean,state:!0},_processedCardDetails:{type:Array,state:!0},_servicesStatus:{type:Object,state:!0},_requiredOTP:{type:Boolean,state:!0},_cardTypeFilters:{type:Object,state:!0},_carbonFootprint:{type:Number,state:!0},_carbonFootprintUnit:{type:String,state:!0}}}constructor(){super(),this.aemHost="",this.aemPath="",this.cardSelected={},this.country="",this.currencyCode="",this.cvvGenerated="",this.environment="",this.financialData={},this.headers=[],this.host="",this.isPayWithPoints=!1,this.native=!1,this.nativeIos=!1,this.productId="",this.physicalSupportDescription="",this.requiredToken="",this.selectedProjectAndCredit={},this.versionCardsApiDm="",this.versionCustomersApiDm="",this.versionLoyaltyApiDm="",this.versionSustainabilityApiDm="",this._cards=[],this._customerId="",this._environmentDictionary={de:{iOS:"Dev",android:"desa"},pro:{iOS:"Prod",android:"prod"}},this._extention=".jpg",this._forestryProjects=[],this._isLoadingData=!1,this._processedCardDetails=[],this._requiredOTP=!1,this._servicesStatus={customers:!1,customerDetails:!1,cards:!1,carbonFootprintOverview:!1,rewards:!1,contributions:!1,forestryProjects:!1},this._cardTypeFilters={status:"OPERATIVE"},this._carbonFootprint=0,this._carbonFootprintUnit=""}async firstUpdated(){super.firstUpdated(),this._getDm(),this._isLoadingData=!0}updated(t){super.updated(t),t.has("cvvGenerated")&&this.cvvGenerated&&this.generatePaymentRequest(),t.has("_servicesStatus")&&this._checkAllServicesLoaded()}async _checkAllServicesLoaded(){await this.updateComplete,Object.values(this._servicesStatus).every((t=>!0===t))&&(this._isLoadingData=!1,this._dispatchCustomEvent("is-loading-data",this._isLoadingData));const t="forestryProjects",e=Object.entries(this._servicesStatus).filter((([e])=>e!==t)).every((([,t])=>!0===t));!1===this._servicesStatus[t]&&e&&this._dispatchCustomEvent("sustainability-carbon-footprint-offset-forestry-projects-only-error")}_updateServiceStatus(t,e){this._servicesStatus={...this._servicesStatus,[t]:e},this.requestUpdate("_servicesStatus")}_getDm(){this._customersDm=this.shadowRoot.querySelector(`[data-tag-name="${nt.is}"]`),this._customerDetailsDm=this.shadowRoot.querySelector(`[data-tag-name="${ct.is}"]`),this._paymentProcessDm=this.shadowRoot.querySelector(`[data-tag-name="${Pt.is}"]`),this._carbonFootprintOverviewDm=this.shadowRoot.querySelector(`[data-tag-name="${et.is}"]`),this._cardsDm=this.shadowRoot.querySelector(`[data-tag-name="${n.is}"]`),this._cardsSecurityApiDm=this.shadowRoot.querySelector(`[data-tag-name="${rt.is}"]`),this._forestryProjectsDm=this.shadowRoot.querySelector(`[data-tag-name="${xt.is}"]`),this._rewardsDm=this.shadowRoot.querySelector(`[data-tag-name="${Y.is}"]`),this._contributionsDm=this.shadowRoot.querySelector(`[data-tag-name="${jt.is}"]`)}_getKeyTag(){var t,e;if(!this.environment)return null;const i=this.nativeIos?"iOS":"android";return(null===(t=this._environmentDictionary)||void 0===t||null===(e=t[this.environment])||void 0===e?void 0:e[i])||null}_generatePubKeys(){const t={key_tag:this._getKeyTag()};this._dispatchCustomEvent("sustainability-carbon-footprint-offset-cvv-handler-native-generate-pub-keys",t)}_requestCvv(t){var e;const i={publicKey:t};this._cardsSecurityApiDm.getCardSecurityData(null===(e=this.cardSelected)||void 0===e?void 0:e.id,i)}_getCustomers(){this._customersDm.getCustomers()}_getCustomerContactDetails(){this._customerDetailsDm.getCustomerContactDetails(this._customerId)}_getCarbonFootprintOverviewInfo(){this._carbonFootprintOverviewDm.getCarbonFootprintOverview()}_getCards(){this._cardsDm.getCards({expand:"activations"})}_getForestryProjects(){this._forestryProjectsDm.getForestryProjects({unit:this._carbonFootprintUnit,carbonFootprint:this._carbonFootprint})}_getContibutionBalances(){this._contributionsDm.getForestryProjectsContributionsBalances({carbonFootprintUnitType:this._carbonFootprintUnit,carbonFootprint:this._carbonFootprint})}_cardsServicesSuccess(t){this._cards=t,this._updateServiceStatus("cards",!0),this._processedCardDetails=this._processCards(t),this._getRewardFromCards(),this._updateServiceStatus("rewards",!0),this._dispatchCustomEvent("cards-info",this._processedCardDetails)}_cardsSecurityDataSuccess([t]){this._dispatchCustomEvent("sustainability-carbon-footprint-offset-request-cvv-decypher",{data:t.code,asHexEncoded:!0,format:"ff####ffffffffff"})}_customersServicesSuccess([t]){const e=null==t?void 0:t.firstName.split(" ")[0];this._dispatchCustomEvent("user-name",this._capitalize(e)),this._customerId=t.customerId,this._getCustomerContactDetails(),this._updateServiceStatus("customers",!0)}_customerContactDetailsSuccess(t){const e=t.find((t=>"EMAIL"===t.contact.contactDetailType));this._customerEmail=e.contact.address,this._updateServiceStatus("customerDetails",!0)}_carbonFootprintOverviewServiceSuccess(t){const e=null===t?{unit:"KILOGRAMS",value:0}:t,{unit:i,value:s}=e;this._updateServiceStatus("carbonFootprintOverview",!0),this._carbonFootprint=s,this._carbonFootprintUnit=i,this._dispatchCustomEvent("carbon-footprint-overview-value",this._carbonFootprint),this._getForestryProjects(),this._getContibutionBalances()}_projectsServiceSucces({detail:t}){this._forestryProjects=t.map((t=>{const e={...t};return e.image={...t.image,url:`${this.aemHost}/${this.aemPath}${t.image.id}${this._extention}`},e})),this._updateServiceStatus("forestryProjects",!0),this._dispatchCustomEvent("projects-info",this._forestryProjects)}_processCards(t){return t.filter((t=>t.physicalSupport.description===this.physicalSupportDescription&&t.status.id===this._cardTypeFilters.status)).map(this._mapCardDetails).sort(((t,e)=>t.productName.localeCompare(e.productName)))}_mapCardDetails(t){const{alias:e,availableBalance:i,cardType:s,holderName:a,expirationDate:o,id:r,images:n,number:c,physicalSupport:l,product:d,status:p,activations:h}=t,[u]=i.currentBalances,[b]=n,[m]=h;return{alias:e,amount:null==u?void 0:u.amount,currency:null==u?void 0:u.currency,cardTypeId:null==s?void 0:s.id,expirationDate:o,holderName:a,id:r,imageId:null==b?void 0:b.id,imageUrl:null==b?void 0:b.url,isActive:null==m?void 0:m.isActive,number:c,physicalSupport:null==l?void 0:l.description,productId:null==d?void 0:d.id,productName:null==d?void 0:d.name,rewardsPoints:0,statusDescription:null==p?void 0:p.description,statusId:null==p?void 0:p.id}}_getRewardFromCards(){for(const t of this._processedCardDetails)"CREDIT_CARD"===t.cardTypeId&&this._rewardsDm.getRewards({"contract.id":t.id,billingPeriod:"OPEN_PERIOD"})}_rewardsServiceSuccess(t){var e;this._processedCardDetails.find((e=>e.id===t[0].contract.id)).rewardsPoints=null===(e=t[0])||void 0===e?void 0:e.nonMonetaryValue}_rewardsServiceError(t){this._dispatchCustomEvent("carbon-footprint-rewards-error",{detail:t})}_onPaymentProcessesSuccess({detail:t}){const{paymentDetails:e,certificateNumber:i,forestryProject:s}=t;"NOT_APPROVED"===(null==e?void 0:e.paymentStatus)?this._dispatchCustomEvent("sustainability-carbon-footprint-offset-cards-api-dm-error"):(this._dispatchCustomEvent("payment-success-body",{contributionAmount:e.totalContributionAmount.amount,date:e.paymentDate,project:s.name,pointsUsed:e.points.value,pointsAmount:e.points.equivalence.amount,cardContributionAmount:e.cardContributionAmount.amount,operationNumber:e.authorizationNumber,cardNumber:e.cardDetails.number,certificateNumber:i,email:this._customerEmail}),this._bodyReceipt={templateSelected:"receiptSustainability",header:{heading:s.name,date:At(null==e?void 0:e.paymentDate).format("DD-MM-YYYY, HH:mm"),operation:e.authorizationNumber},list:[{id:"item-list-amount",label:"Importe",description:`${this.currencyCode}${e.totalContributionAmount.amount}`},{id:"item-list-bbva-points",label:"Puntos BBVA Utilizados",description:e.points.value},{id:"item-list-bbva-points-amount",label:"Importe pagado con Puntos BBVA",description:0===e.points.equivalence.amount?"":`${this.currencyCode}${e.points.equivalence.amount}`},{id:"item-list-card-amount",label:"Importe pagado con tarjeta",description:0===e.cardContributionAmount.amount?"":`${this.currencyCode}${e.cardContributionAmount.amount}`}]},this._dispatchCustomEvent("sustainability-carbon-footprint-receipt-data",{result:this._bodyReceipt}))}_generateReceipt(){this._dispatchCustomEvent("sustainability-carbon-footprint-share-receipt",{operative:"receiptSustainability"})}generatePaymentRequest(){var t,e,i,s;this._requiredOTP=!0;const a={paymentDetails:{isCardPoints:this.isPayWithPoints,cardDetails:{cardType:null===(t=this.cardSelected)||void 0===t?void 0:t.cardTypeId,holderName:this._normalizeString(null===(e=this.cardSelected)||void 0===e?void 0:e.holderName),number:null===(i=this.cardSelected)||void 0===i?void 0:i.number,expirationDate:null===(s=this.cardSelected)||void 0===s?void 0:s.expirationDate,cvv:this.cvvGenerated}},forestryProject:this.selectedProjectAndCredit};this._paymentProcessDm.postForestryProjectsPaymentProcesses(a)}_normalizeString(t){return t.normalize("NFD").replace(/[\u0300-\u036f]/g,"")}_capitalize(t){return t.charAt(0).toUpperCase()+t.slice(1).toLowerCase()}_onSuccessContributionBalances([t]){const{isContributionAllowed:e,contributionBreakdowns:i,remainingCarbonFootprintContributions:s}=t;this._updateServiceStatus("contributions",!0),this._dispatchCustomEvent("contributions-status",{isContributionAllowed:e,contributionAmount:i.find((t=>"AMOUNT"===t.contributionBreakdownType)).amount,contributionEquivalence:i.find((t=>"TEXT"===t.contributionBreakdownType)).value,remainingCarbonFootprintContributions:s.value})}render(){var e,i;return t`
      <bbva-global-cards-api-dm
        .host="${this.host}"
        .version="${this.versionCardsApiDm}"
        .requiredToken="${this.requiredToken}"
        ?native="${this.native}"
        .headers="${this.headers}"
        .country="${this.country}"
        .localCustomProperties=${{cards:(null===(e=this.financialData)||void 0===e||null===(i=e.data)||void 0===i?void 0:i.contracts)||[],shouldUpdateDataFromFO:!0}}
        @cards-api-dm-fetch="${t=>{this._getCustomers(),this._cardsServicesSuccess(t.detail)}}"
        @cards-api-dm-fetch-error="${()=>{this._dispatchCustomEvent("sustainability-carbon-footprint-offset-cards-api-dm-error")}}"
        @api-dm-error="${()=>{this._dispatchCustomEvent("sustainability-carbon-footprint-offset-cards-api-dm-error")}}"
      ></bbva-global-cards-api-dm>

      <bbva-global-card-security-data-api-dm
        .host="${this.host}"
        .version="${this.versionLoyaltyApiDm}"
        .requiredToken="${this.requiredToken}"
        ?native="${this.native}"
        @card-security-data-api-dm-fetch="${t=>this._cardsSecurityDataSuccess(t.detail)}"
        @card-security-data-api-dm-fetch-error="${()=>this._dispatchCustomEvent("sustainability-carbon-footprint-offset-cards-api-dm-error")}"
        @api-dm-error="${()=>this._dispatchCustomEvent("sustainability-carbon-footprint-offset-cards-api-dm-error")}"
      ></bbva-global-card-security-data-api-dm>

      <bbva-global-customers-api-dm
        .host="${this.host}"
        .version="${this.versionCustomersApiDm}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        .headers="${this.headers}"
        .customers="${this._customersData??[]}"
        @customers-api-dm-fetch="${t=>{this._getCarbonFootprintOverviewInfo(),this._customersServicesSuccess(t.detail)}}"
        @customers-api-dm-fetch-error="${()=>{this._dispatchCustomEvent("sustainability-carbon-footprint-offset-cards-api-dm-error")}}"
        @api-dm-error="${()=>{this._dispatchCustomEvent("sustainability-carbon-footprint-offset-cards-api-dm-error")}}"
      ></bbva-global-customers-api-dm>

      <bbva-global-customer-contact-details-api-dm
        host="${this.host}"
        version="${this.versionCustomersApiDm}"
        ?native="${this.native}"
        requiredToken="${this.requiredToken}"
        .headers="${this.headers}"
        @customer-contact-details-api-dm-fetch="${t=>this._customerContactDetailsSuccess(t.detail)}"
        @customer-contact-details-api-dm-fetch-error="${()=>{this._dispatchCustomEvent("sustainability-carbon-footprint-offset-cards-api-dm-error")}}"
        @api-dm-error="${()=>{this._dispatchCustomEvent("sustainability-carbon-footprint-offset-cards-api-dm-error")}}"
      ></bbva-global-customer-contact-details-api-dm>

      <bbva-global-carbon-footprint-overview-api-dm
        id="carbonFootprintOverviewDm"
        .host="${this.host}"
        .version="${this.versionSustainabilityApiDm}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        .headers="${this.headers}"
        .customers="${this._customersData??[]}"
        @carbon-footprint-overview-api-dm-fetch="${t=>this._carbonFootprintOverviewServiceSuccess(t.detail)}"
        @carbon-footprint-overview-api-dm-fetch-error="${()=>{this._dispatchCustomEvent("sustainability-carbon-footprint-offset-cards-api-dm-error")}}"
        @api-dm-error="${()=>{this._dispatchCustomEvent("sustainability-carbon-footprint-offset-cards-api-dm-error")}}"
      >
      </bbva-global-carbon-footprint-overview-api-dm>

      <bbva-global-forestry-projects-api-dm
        .host="${this.host}"
        .version="${this.versionSustainabilityApiDm}"
        .requiredToken="${this.requiredToken}"
        .country="${this.country}"
        ?native="${this.native}"
        @forestry-projects-api-dm-fetch="${t=>this._projectsServiceSucces(t)}"
        @forestry-projects-api-dm-fetch-error="${()=>{this._dispatchCustomEvent("sustainability-carbon-footprint-offset-forestry-projects-api-dm-error")}}"
        @api-dm-error="${()=>{this._dispatchCustomEvent("sustainability-carbon-footprint-offset-forestry-projects-api-dm-error")}}"
      ></bbva-global-forestry-projects-api-dm>

      <bbva-global-rewards-api-dm
        .host="${this.host}"
        .version="${this.versionLoyaltyApiDm}"
        .requiredToken="${this.requiredToken}"
        ?native="${this.native}"
        .headers="${this.headers}"
        @rewards-api-dm-fetch="${t=>this._rewardsServiceSuccess(t.detail)}"
        @rewards-api-dm-fetch-error="${t=>this._rewardsServiceError(t.detail)}"
        @api-dm-error="${t=>this._rewardsServiceError(t.detail)}"
      ></bbva-global-rewards-api-dm>

      <bbva-global-forestry-projects-payment-processes-api-dm
        id="forestryProjectsPaymentProcessesDm"
        .host="${this.host}"
        .version="${this.versionSustainabilityApiDm}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        .requiredOTP="${this._requiredOTP}"
        .country="${this.country}"
        @forestry-projects-payment-processes-api-dm-create="${t=>this._onPaymentProcessesSuccess(t)}"
        @forestry-projects-payment-processes-api-dm-create-error="${()=>{this._dispatchCustomEvent("sustainability-carbon-footprint-offset-dm-payment-error")}}"
        @api-dm-error="${()=>{this._dispatchCustomEvent("sustainability-carbon-footprint-offset-dm-payment-error")}}"
      >
      </bbva-global-forestry-projects-payment-processes-api-dm>

      <bbva-global-forestry-projects-contributions-balances-api-dm
        .host="${this.host}"
        .version="${this.versionSustainabilityApiDm}"
        .requiredToken="${this.requiredToken}"
        ?native="${this.native}"
        .country="${this.country}"
        @forestry-projects-contributions-balances-api-dm-fetch="${t=>this._onSuccessContributionBalances(t.detail)}"
        @forestry-projects-contributions-balances-api-dm-fetch-error="${()=>{this._dispatchCustomEvent("sustainability-carbon-footprint-offset-cards-api-dm-error")}}"
        @api-dm-error="${()=>{this._dispatchCustomEvent("sustainability-carbon-footprint-offset-cards-api-dm-error")}}"
      ></bbva-global-forestry-projects-contributions-balances-api-dm>
    `}}var qt=e`
  :host {
    display: block;
    box-sizing: border-box;
    overflow: hidden;
    --bbva-help-modal-padding: 0;
  }

  :host([hidden]),
  [hidden] {
    display: none !important;
  }

  *,
  *::before,
  *::after {
    box-sizing: inherit;
  }
`;class Ft extends(v(g(i(s)))){static get properties(){return{aemHost:{type:String,attribute:"aem-host"},contentFragmentPath:{type:String,attribute:"content-fragment-path"},closeLabelText:{type:String,attribute:"close-label-text"},faqsMessageText:{type:String,attribute:"faqs-message-text"},headerText:{type:String,attribute:"header-text"},visible:{type:Boolean,attribute:"visible"},showHelpFaqs:{type:Boolean,attribute:"show-help-faqs"},showIconText:{type:Boolean,attribute:"show-icon-text"}}}static get is(){return"sustainability-carbon-footprint-offset-faqs"}static get scopedElements(){const t=[lt,S,...Ft.configurationScopedElements()];return Ft.scopedElementsFromClasses(t)}static get styles(){return[qt,a("sustainability-carbon-footprint-offset-faqs-shared-styles")]}constructor(){super(),this.visible=!1,this.aemHost="",this.contentFragmentPath="",this.closeLabelText="",this.faqsMessageText="sustainability-carbon-footprint-offset-faqs-message-text",this.headerText="sustainability-carbon-footprint-offset-faqs-question-header-text",this.showHelpFaqs=!1,this.showIconText=!1}get _renderFaqs(){return t`
      <help-faqs-aem
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?native=${this.native}
        content-fragment-path=${this.contentFragmentPath}
        faqs-message-text="${this.faqsMessageText}"
        header-text="${this.headerText}"
        hide-footer
        host="${this.aemHost}"
        show-icon-text="${this.showIconText}"
        close-label-text="${this.closeLabelText}"
        @help-modal-header-click="${t=>t.stopPropagation()}"
        @hide-loader=${t=>t.stopPropagation()}
        @visible-changed=${t=>t.stopPropagation()}
      >
      </help-faqs-aem>
    `}render(){return t`
      ${this.showHelpFaqs?t`
            <bbva-help-modal
              header-close-icon-label="${this.t("sustainability-carbon-footprint-offset-faqs-header-close-text")}"
              header-text="${this.t("sustainability-carbon-footprint-offset-faqs-header-text")}"
              aria-label="${this.t("sustainability-carbon-footprint-offset-faqs-header-text")}"
              header-close-icon-aria-label="${this.t("sustainability-carbon-footprint-offset-faqs-header-close-text")}"
              hide-content-padding-top
              full-height
              ?visible="${this.visible}"
              @help-modal-header-click="${t=>{t.stopPropagation(),this._dispatchCustomEvent(`${Ft.is}-modal-close`)}}"
            >
              <div slot="slot-content" class="slot-content">${this._renderFaqs}</div>
            </bbva-help-modal>
          `:c}
    `}}var Bt=e`
  :host {
    display: block;
    box-sizing: border-box;
  }

  :host([hidden]),
  [hidden] {
    display: none !important;
  }

  *,
  *::before,
  *::after {
    box-sizing: inherit;
  }
`;class Ot extends(v(g(i(s)))){static get is(){return"sustainability-carbon-footprint-offset-modal-informative"}static get properties(){return{openInformativeModal:{type:Boolean,attribute:"open-informative-modal"},showInformativeModalDetail:{type:Boolean,attribute:"show-informative-modal-detail"},headerContentModalInformative:{type:String,attribute:"header-content-modal-informative"},informativeModalText:{type:Array}}}constructor(){super(),this.openInformativeModal=!1,this.showInformativeModalDetail=!1,this.informativeText=[],this.headerContentModalInformative=""}static get scopedElements(){const t=[C,S,...Ot.configurationScopedElements()];return Ot.scopedElementsFromClasses(t)}static get styles(){return[Bt,P.primary,a("sustainability-carbon-footprint-offset-modal-informative-shared-styles")]}get _modalInformative(){return t`
      <bbva-help-modal
        ?visible="${this.openInformativeModal}"
        header-close-icon-label="${this.t("sustainability-carbon-footprint-offset-faqs-header-close-text")}"
        header-text="${this.headerContentModalInformative}"
        hide-content-padding-top
        @help-modal-close="${()=>this._closeModal()}"
      >
        <div slot="slot-content">
          ${this.informativeModalText.map((e=>t` <bbva-type-text ambient="primary" text=${e}></bbva-type-text> `))}
        </div>
      </bbva-help-modal>
    `}_closeModal(){this._dispatchCustomEvent(`${Ot.is}-close`,this.showInformativeModalDetail)}render(){return t` ${this._modalInformative} `}}var zt=e`
  :host {
    display: block;
    box-sizing: border-box;
  }

  :host([hidden]),
  [hidden] {
    display: none !important;
  }

  *,
  *::before,
  *::after {
    box-sizing: inherit;
  }

  .list-info-container {
    margin-top: 1.5rem;
    display: flex;
    flex-direction: column;
  }
  .list-info-container .list-item {
    display: flex;
    justify-content: space-between;
    margin-bottom: 1rem;
  }

  [data-tag-name='bbva-notification-message'] {
    margin-bottom: 1rem;
  }

  [data-tag-name='bbva-button-row'] {
    margin-bottom: 1rem;
  }
`;class Rt extends(v(g(i(s)))){static get is(){return"sustainability-carbon-footprint-offset-modal-success-payment"}static get properties(){return{currencyCode:{type:String,attribute:"currency-code"},dataPayment:{type:Object},language:{type:String},localCurrency:{type:String,attribute:"local-currency"},visible:{type:Boolean}}}constructor(){super(),this.visible=!1,this.dataPayment={},this._dateOptions={day:"2-digit",month:"short",year:"numeric",hour:"2-digit",minute:"2-digit"},this._buttonOptions=[{icon:l(),label:this.t("sustainability-carbon-footprint-offset-successful-modal-footer-buttons-share"),id:"option-1"},{icon:d(),label:this.t("sustainability-carbon-footprint-offset-successful-modal-footer-buttons-bbva-points-and-promotions"),id:"option-2"}],this.language="",this.localCurrency="",this.currencyCode=""}static get scopedElements(){const t=[S,w,E,C,T,k,A,...Rt.configurationScopedElements()];return Rt.scopedElementsFromClasses(t)}static get styles(){return[zt,M.primaryAlt,a("sustainability-carbon-footprint-offset-modal-success-payment-shared-styles")]}get _panelProcess(){var e;return t`
      <bbva-clip-microillustration
        ambient="primary"
        microillustration="success"
        size="M"
      ></bbva-clip-microillustration>
      <bbva-type-text
        ambient="primary"
        font-weight="500"
        text=${this.t("sustainability-carbon-footprint-offset-successful-modal-payment-title")}
        size="3XL"
      ></bbva-type-text>
      <bbva-type-text
        ambient="primary"
        text=${this.t("sustainability-carbon-footprint-offset-successful-modal-amount-total-title")}
        size="XS"
      ></bbva-type-text>
      <bbva-type-amount
        ambient="primary"
        bold
        amount="${o(null===(e=this.dataPayment)||void 0===e?void 0:e.contributionAmount)}"
        variant="2xl"
        currency-code="${this.currencyCode}"
        local-currency="${this.localCurrency}"
        language="${this.language}"
      ></bbva-type-amount>
    `}get _listInformation(){var e,i,s,a,r,n,c;return t`
      <div class="list-info-container">
        <div class="list-item">
          <bbva-type-text
            ambient="primary"
            tag="span"
            text=${this.t("sustainability-carbon-footprint-offset-successful-modal-date-and-time")}
            size="XS"
          ></bbva-type-text>
          <bbva-type-date
            ambient="primary"
            .options="${this._dateOptions}"
            date="${null===(e=this.dataPayment)||void 0===e?void 0:e.date}"
            font-weight="500"
            font-style="italic"
            date-clock-suffix="h"
          ></bbva-type-date>
        </div>
        <div class="list-item">
          <bbva-type-text
            ambient="primary"
            tag="span"
            text=${this.t("sustainability-carbon-footprint-offset-successful-modal-project-contributed")}
            size="S"
          ></bbva-type-text>
          <bbva-type-text
            ambient="primary"
            alignment="right"
            tag="span"
            font-weight="500"
            text="${o(null===(i=this.dataPayment)||void 0===i?void 0:i.project)}"
            size="S"
          ></bbva-type-text>
        </div>
        <div class="list-item">
          <bbva-type-text
            ambient="primary"
            tag="span"
            text="${this.t("sustainability-carbon-footprint-offset-successful-modal-bbva-points-used")}"
            size="XS"
          ></bbva-type-text>
          <bbva-type-amount
            ambient="primary"
            type="points"
            bold
            font-weight="500"
            amount="${o(null===(s=this.dataPayment)||void 0===s?void 0:s.pointsUsed)}"
            variant="s"
          ></bbva-type-amount>
        </div>
        <div class="list-item">
          <bbva-type-text
            ambient="primary"
            tag="span"
            text=${this.t("sustainability-carbon-footprint-offset-successful-modal-amount-with-bbva-points")}
            size="S"
          ></bbva-type-text>
          <bbva-type-amount
            ambient="primary"
            type="bold"
            variant="s"
            amount="${o(null===(a=this.dataPayment)||void 0===a?void 0:a.pointsAmount)}"
            currency-code="${this.currencyCode}"
            local-currency="${this.localCurrency}"
            language="${this.language}"
          >
          </bbva-type-amount>
        </div>
        <div class="list-item">
          <bbva-type-text
            ambient="primary"
            tag="span"
            text=${this.t("sustainability-carbon-footprint-offset-successful-modal-amount-with-card",{cardNumber:null===(r=this.dataPayment)||void 0===r?void 0:r.cardNumber})}
            size="S"
          ></bbva-type-text>
          <bbva-type-amount
            ambient="primary"
            type="bold"
            variant="s"
            amount="${o(null===(n=this.dataPayment)||void 0===n?void 0:n.cardContributionAmount)}"
            currency-code="${this.currencyCode}"
            local-currency="${this.localCurrency}"
            language="${this.language}"
          >
          </bbva-type-amount>
        </div>
        <div class="list-item">
          <bbva-type-text
            ambient="primary"
            tag="span"
            text=${this.t("sustainability-carbon-footprint-offset-successful-modal-sheet-bbva-operation")}
            size="S"
          ></bbva-type-text>
          <bbva-type-text
            tag="span"
            alignment="right"
            font-weight="500"
            text="${o(null===(c=this.dataPayment)||void 0===c?void 0:c.operationNumber)}"
            size="S"
          ></bbva-type-text>
        </div>
      </div>
    `}get _messagesTemplates(){return t`
      <bbva-notification-message
        message="&lt;span class='highlight'&gt;${o(this.dataPayment.certificateNumber)}&lt;/span&gt;"
        message-title="${this.t("sustainability-carbon-footprint-offset-successful-modal-message-notification-oficial-constancy")}"
        book-title=""
      ></bbva-notification-message>
      <bbva-notification-message
        message="&lt;span class='highlight'&gt;${o(this.dataPayment.email)}&lt;/span&gt;"
        message-title="${this.t("sustainability-carbon-footprint-offset-successful-modal-message-notification-proof-of-payment")}"
        book-title=""
      ></bbva-notification-message>
    `}get _renderFooter(){return t`
      <bbva-button-row
        ambient="primary-alt"
        .options=${this._buttonOptions}
        accessibility-text="icons"
        @button-row-item-option-1-click="${t=>{t.stopPropagation(),this._dispatchCustomEvent(`${Rt.is}-share-button`)}}"
        @button-row-item-option-2-click="${t=>{t.stopPropagation(),this._dispatchCustomEvent(`${Rt.is}-navigation-rewards-page`)}}"
      ></bbva-button-row>
    `}_closeModal(){this._dispatchCustomEvent(`${Rt.is}-close`)}render(){return t`
      <bbva-help-modal
        fixed-footer
        ?full-height="${!0}"
        header-text=${this.t("sustainability-carbon-footprint-offset-successful-modal-header-title")}
        header-close-icon-label=${this.t("sustainability-carbon-footprint-offset-successful-modal-header-title-close")}
        ?visible="${this.visible}"
        @help-modal-close="${()=>this._closeModal()}"
      >
        <div slot="slot-content">
          ${this._panelProcess} ${this._listInformation} ${this._messagesTemplates}
          ${this._renderFooter}
        </div>
      </bbva-help-modal>
    `}}var It=e`
  :host {
    display: block;
    box-sizing: border-box;
  }

  :host([hidden]),
  [hidden] {
    display: none !important;
  }

  *,
  *:before,
  *:after {
    box-sizing: inherit;
  }
`;class Nt extends(g(v(i(s)))){static get is(){return"sustainability-carbon-footprint-offset-modal-error"}static get scopedElements(){const t=[S,...Nt.configurationScopedElements()];return Nt.scopedElementsFromClasses(t)}static get styles(){return[It,a("sustainability-carbon-footprint-offset-modal-error-shared-styles")]}static get properties(){return{bodyText:{type:String,attribute:"body-text"},buttonText:{type:String,attribute:"button-text"},headerButtons:{type:Array,attribute:"header-buttons-modal"},isFullHeight:{type:Boolean,attribute:"is-full-height"},linkText:{type:String,attribute:"link-text"},titleTextModal:{type:String,attribute:"title-text-modal"},visibleModal:{type:Boolean,attribute:"visible-modal"},_icon:{type:Array,state:!0}}}constructor(){super(),this.bodyText="",this.buttonText="",this.headerButtons=[{name:"loan-and-mortgage-information-sustainable-rate-justification-modal-exit-button",icon:p(),accessibilityText:"loan-and-mortgage-information-sustainable-rate-justification-modal-exit-button"}],this.isFullHeight=!1,this.linkText="",this.titleTextModal="",this.visibleModal=!1,this._icon=[p(),h(),u()]}_resetModal(){this.visibleModal=!1,this._titleText="",this._titleHeader="",this._bodyText="",this._buttonText="",this._linkText=""}render(){return t`
      <bbva-help-modal
        header-close-icon-aria-label="${this.t("sustainability-carbon-footprint-offset-header-close-text")}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        title-text="${this.t(this.titleTextModal)}"
        .buttons="${this.headerButtons}"
        ?visible="${this.visibleModal}"
        modal-type="warning"
        modal-size="S"
        title-icon="${this._icon[2]}"
        body-text="${this.t(this.bodyText)}"
        button-text="${this.t(this.buttonText)}"
        link-text="${this.t(this.linkText)}"
        @help-modal-close="${t=>{t.stopPropagation(),this._dispatchCustomEvent("sustainability-carbon-footprint-offset-modal-error-close"),this._resetModal()}}"
        @help-modal-footer-button-click="${t=>{t.stopPropagation(),this._dispatchCustomEvent("sustainability-carbon-footprint-offset-modal-error-footer-retry"),this._resetModal()}}"
        @help-modal-footer-link-click="${t=>{t.stopPropagation(),this._dispatchCustomEvent("sustainability-carbon-footprint-offset-modal-error-link-close"),this._resetModal()}}"
        @modal-state-change="${t=>{t.stopPropagation(),"close"===t.detail.status&&(this._dispatchCustomEvent("sustainability-carbon-footprint-offset-modal-error-close"),this._resetModal())}}"
      >
      </bbva-help-modal>
    `}}var Lt=e`
  :host {
    display: block;
    box-sizing: border-box;
    text-align: left;
  }

  :host([hidden]),
  [hidden] {
    display: none !important;
  }

  *,
  *:before,
  *:after {
    box-sizing: inherit;
  }

  .card-content {
    display: flex;
    flex-direction: column;
    gap: 0.5rem;
    padding: 0;
  }

  .flex-group-column {
    display: flex;
    flex-direction: column;
  }

  .card-info {
    display: flex;
    justify-content: space-between;
    flex-flow: row;
    gap: 0.5rem;
  }
  .card-info .flex-group-column {
    align-items: flex-end;
  }

  .clip-container {
    display: flex;
    align-items: center;
    gap: 0.5rem;
  }

  .main {
    flex-direction: column;
  }

  .secondary {
    flex-direction: column-reverse;
  }

  .align-end {
    align-self: flex-end;
  }

  .message-balance {
    padding: 0.5rem 0 0;
  }

  [data-tag-name='bbva-type-text'].card-selected {
    --_type-text-spotlight-color: ${y("colorPrimaryText01Inverse",f)};
  }
`;class Wt extends(i(v(g(s)))){static get is(){return"composition-list-cards"}static get scopedElements(){const t=[C,ht,bt,A,q,...Wt.configurationScopedElements()];return Wt.scopedElementsFromClasses(t)}static get properties(){return{_variantStatusCard:{type:Object,state:!0},card:{type:Object},isAmbientSecondary:{type:Boolean,attribute:"is-ambient-secondary"},language:{type:String,attribute:"language"},rewardsConversionFactor:{type:Number,attribute:"rewards-conversion-factor"},selectedContribution:{type:Number,attribute:"selected-contribution"}}}constructor(){super(),this._variantStatusCard={points:{variant:"info",text:this.t("sustainability-carbon-footprint-offset-multistep-list-card-available-points")},insufficientBalance:{variant:"alert",text:this.t("sustainability-carbon-footprint-offset-multistep-list-card-insufficient-balance")},cardOff:{variant:"alert",text:this.t("sustainability-carbon-footprint-offset-multistep-list-card-off")},empty:{variant:"",text:""}},this.card={},this.isAmbientSecondary=!1,this.rewardsConversionFactor=0,this.selectedContribution=0,this.language=""}static get styles(){return[Lt,P.secondary,ut.secondary,mt.secondary,F.secondary,B.secondary,a("composition-list-cards-shared-styles")]}_getMessageBalance(){if(this.isAmbientSecondary)return"";const{isActive:t,amount:e=0,rewardsPoints:i=0}=this.card,{cardOff:s,points:a,insufficientBalance:o,empty:r}=this._variantStatusCard,n=i*this.rewardsConversionFactor;return t?e+n<this.selectedContribution||e<0?o:n>0?a:r:s}get _availableBalance(){const e=this._getMessageBalance(),i=this.isAmbientSecondary?"secondary":"primary";return e.variant?t`
          <bbva-notification-help
            ambient="${i}"
            class="message-balance"
            variant="${e.variant}"
            text="${e.text}"
          ></bbva-notification-help>
        `:c}get _cardMainInfo(){const e=this.card.isActive?"":"off",i=this.isAmbientSecondary?"secondary":"primary";return t`
      <div class="header">
        <bbva-type-text
          size="S"
          ambient="primary-alt"
          variant="spotlight"
          class="${this.isAmbientSecondary?"card-selected":""}"
          unset
          text="${this.card.productName}"
        ></bbva-type-text>
        <div class="clip-container">
          <bbva-clip-card
            .cardImage="${this.card.imageUrl}"
            size="xs"
            status="${e}"
            variant="default"
            ambient="${i}"
          ></bbva-clip-card>
          <bbva-badge-reference
            number="${this.card.number}"
            ambient="${i}"
          ></bbva-badge-reference>
        </div>
      </div>
    `}get _cardSecondInfo(){const e="CREDIT_CARD"===this.card.cardTypeId?this.t("sustainability-carbon-footprint-offset-multistep-list-card-available-credit"):"",i=this.isAmbientSecondary?"secondary":"primary";return t`
      <div class="flex-group-column">
        <bbva-type-amount
          id="main-amount"
          class="align-end"
          type="bold"
          amount="${this.card.amount}"
          currency-code="${this.card.currency}"
          local-currency="${this.card.currency}"
          language="${this.language}"
          variant="2xl"
          ambient="${i}"
        ></bbva-type-amount>
        <bbva-type-text
          size="S"
          ambient="${i}"
          unset
          tag="h2"
          .text="${e}"
        ></bbva-type-text>
      </div>
    `}render(){return this.card?t`
          <div class="card-content" ambient="secondary">
            <div class="card-info">${this._cardMainInfo} ${this._cardSecondInfo}</div>
          </div>
          ${this._availableBalance}
        `:c}}var Ht=e`
  :host {
    display: block;
    box-sizing: border-box;
  }

  :host([hidden]),
  [hidden] {
    display: none !important;
  }

  *,
  *::before,
  *::after {
    box-sizing: inherit;
  }

  [data-tag-name='bbva-notification-message'] {
    margin-bottom: 1rem;
  }
`;class Ut extends(i(v(g(s)))){static get is(){return"sustainability-carbon-footprint-offset-forestry-aportation"}static get scopedElements(){const t=[O,C,yt,ft,E,...Ut.configurationScopedElements()];return Ut.scopedElementsFromClasses(t)}static get properties(){return{currencyCode:{type:String,attribute:"currency-code"},options:{type:Array},_selectedContribution:{type:Number,state:!0},_isContinueDisabled:{type:Boolean,state:!0},_showNotificationMessage:{type:Boolean,state:!0}}}constructor(){super(),this.currencyCode="",this.options=[],this._selectedContribution=0,this._isContinueDisabled=!1,this._showNotificationMessage=!1}reset(){this.options=[],this._selectedContribution=0,this._isContinueDisabled=!0,this._showNotificationMessage=!1,this.shadowRoot.querySelector('[data-tag-name="bbva-form-select"]').value=""}static get styles(){return[Ht,P.secondary,z.secondary,a("sustainability-carbon-footprint-offset-forestry-aportation-forestry-aportation-shared-styles")]}firstUpdated(){this._isContinueDisabled=!0}updated(t){if(super.updated(t),t.has("options")){if(void 0===this.options)return;1===this.options.length&&this._handleSingleOption()}}_handleSingleOption(){this.setSelectedItem({detail:{value:this.options[0].expense}});const t=this.shadowRoot.querySelector('[data-tag-name="bbva-form-option"]'),e=this.shadowRoot.querySelector('[data-tag-name="bbva-form-select"]');e&&(e.items=this.options,e.disabled=!0),t&&(t.value=this.options[0].expense,t.selected=!0)}_handleClickContinue(){this._dispatchCustomEvent(`${Ut.is}-complete`)}setSelectedItem({detail:t}){const e=this.options.find((({expense:e})=>e===Number(t.value)));Object.assign(this,{_selectedContribution:t.value,_selectedOption:e,_isContinueDisabled:!1,_showNotificationMessage:!0}),this.requestUpdate(),this._dispatchCustomEvent(`${Ut.is}-amount-click`,Number(this._selectedContribution))}get _aportationStep(){return t`
      <bbva-type-text
        ambient="primary"
        text="${this.t("sustainability-carbon-footprint-offset-step-aportation-description")}"
      >
      </bbva-type-text>
      <bbva-form-select
        label="${this.t("sustainability-carbon-footprint-offset-step-aportation-label")}"
        ambient="primary-alt"
        @bbva-form-select-selected-item="${this.setSelectedItem}"
      >
        ${this.options&&this.options.length>0?this.options.map((e=>t`<bbva-form-option value="${e.expense}">
                  ${this.currencyCode}${e.expense}
                </bbva-form-option>`)):c}
      </bbva-form-select>
    `}get _sustainabilityMessage(){var e;return t`
      <bbva-notification-message
        variant="sustainability"
        message-title=${this.t("sustainability-carbon-footprint-offset-step-aportation-sustainable-message",{value:`${null===(e=this._selectedOption)||void 0===e?void 0:e.equivalence}`})}
        message=${this.t("sustainability-carbon-footprint-offset-step-aportation-sustainable-message-source")}
        book-title=""
      ></bbva-notification-message>
    `}get _tplButton(){return t`
      <bbva-button-default
        ambient="primary"
        ?disabled="${this._isContinueDisabled}"
        class="action"
        fullwidth
        @click="${this._handleClickContinue}"
        text="${this.t("sustainability-carbon-footprint-offset-multistep-continue")}"
      >
      </bbva-button-default>
    `}render(){return t`
      ${this._aportationStep}
      ${this._showNotificationMessage?this._sustainabilityMessage:c} ${this._tplButton}
    `}}var Vt=e`
  :host {
    display: block;
    box-sizing: border-box;
  }

  :host([hidden]),
  [hidden] {
    display: none !important;
  }

  *,
  *::before,
  *::after {
    box-sizing: inherit;
  }

  .card-list {
    display: flex;
    flex-direction: column;
  }

  .card-detail {
    padding: 1rem 0;
  }

  .disabledClick {
    pointer-events: none;
  }

  .slot-content {
    padding: 0 1rem;
  }
`;class Kt extends(v(g(i(s)))){static get is(){return"sustainability-carbon-footprint-offset-modal-all-cards"}static get properties(){return{language:{type:String},listCards:{type:Array},open:{type:Boolean},rewardsConversionFactor:{type:Number,attribute:"rewards-conversion-factor"},showAllCards:{type:Boolean,attribute:"show-all-cards"},selectedContribution:{type:Number,attribute:"selected-contribution"}}}constructor(){super(),this.language="",this.listCards=[],this.open=!1,this.rewardsConversionFactor=0,this.showAllCards=!1,this.selectedContribution=0}static get scopedElements(){const t=[x,S,Wt,R,...Kt.configurationScopedElements()];return Kt.scopedElementsFromClasses(t)}static get styles(){return[Vt,I.primary,a("sustainability-carbon-footprint-offset-modal-all-cards-shared-styles")]}get _modalAllCards(){return t`
      <bbva-help-modal
        ?visible="${this.showAllCards}"
        full-height
        header-close-icon-label="${this.t("sustainability-carbon-footprint-offset-faqs-header-close-text")}"
        header-text="${this.t("sustainability-carbon-footprint-offset-all-cards-header-text")}"
        hide-content-padding-top
        @header-main-close-icon-click="${this._closeAllCards}"
        @help-modal-close="${this._closeAllCards}"
      >
        <div slot="slot-content" class="slot-content">
          ${this.listCards.map(((e,i)=>t`
              <bbva-type-link
                ambient="primary"
                class="card-list ${this._disabledClick(e)}"
                @click="${()=>this._selectCardDispatch(e)}"
              >
                <composition-list-cards
                  ambient="primary"
                  class="card-detail"
                  .card="${e}"
                  language="${this.language}"
                  rewards-conversion-factor="${this.rewardsConversionFactor}"
                  selected-contribution="${this.selectedContribution}"
                ></composition-list-cards>
                ${i<this.listCards.length-1?t`<bbva-divider-default size="full"></bbva-divider-default>`:c}
              </bbva-type-link>
            `))}
        </div>
      </bbva-help-modal>
    `}_disabledClick(t){if(!t)return"";const{isActive:e,amount:i=0,nonMonetaryValue:s=0}=t,a=s*this.rewardsConversionFactor;return!e||i+a<this.selectedContribution||i<0?"disabledClick":""}_selectCardDispatch(t){this._dispatchCustomEvent(`${Kt.is}-select-card`,t)}_closeAllCards(t){t.stopPropagation(),this._dispatchCustomEvent(`${Kt.is}-close`,!1)}render(){return t` ${this._modalAllCards} `}}var Xt=e`
  :host {
    display: block;
    box-sizing: border-box;
  }

  :host([hidden]),
  [hidden] {
    display: none !important;
  }

  *,
  *::before,
  *::after {
    box-sizing: inherit;
  }

  [data-tag-name='bbva-help-modal'] {
    --bbva-help-modal-padding: 0;
  }

  [data-tag-name='bbva-header-category'] {
    padding: 1rem 0 0;
  }

  .card-list {
    display: flex;
    flex-direction: column;
  }

  .card-detail {
    padding: 1rem 0;
  }

  .disabledClick {
    pointer-events: none;
  }
`;class Yt extends(i(v(g(s)))){static get is(){return"sustainability-carbon-footprint-offset-forestry-aportation-payment"}static get scopedElements(){const t=[O,Wt,Kt,C,N,R,x,...Yt.configurationScopedElements()];return Yt.scopedElementsFromClasses(t)}static get properties(){return{_cardSelected:{type:Object,state:!0},_flowSteps:{type:Object,state:!0},_showAllCards:{type:Boolean,state:!0},_showMore:{type:Boolean,state:!0},language:{type:String,attribute:"language"},listCards:{type:Array},rewardsConversionFactor:{type:Number,attribute:"rewards-conversion-factor"},selectedContribution:{type:Number,attribute:"selected-contribution"}}}constructor(){super(),this._cardSelected={},this._displayedCardsCount=3,this._flowSteps={firstFlow:["step-1","step-2","step-3","step-4"],secondFlow:["step-1","step-2","step-3"]},this._showAllCards=!1,this._showMore=!1,this.language="",this.listCards=[],this.selectedContribution=0,this.rewardsConversionFactor=0}static get styles(){return[Xt,P.secondary,L.secondary,z.secondary,I.primary,j.secondary,a("sustainability-carbon-footprint-offset-forestry-aportation-payment-shared-styles")]}updated(t){var e;t.has("listCards")&&(this._showMore=(null===(e=this.listCards)||void 0===e?void 0:e.length)>this._displayedCardsCount,this._hasOneCard()&&([this._cardSelected]=this.listCards))}_handleClickContinue(){var t;const e=0!==(null===(t=this._cardSelected)||void 0===t?void 0:t.rewardsPoints)?"firstFlow":"secondFlow";this._dispatchCustomEvent(`${Yt.is}-card-select`,this._cardSelected),this._dispatchCustomEvent(`${Yt.is}-continue-click`,{firstFlow:this._flowSteps[e]}),this._dispatchCustomEvent(`${Yt.is}-complete`)}_selectCardDispatch(t){this._cardSelected=t,this._handleClickContinue()}get _headerAportationListCards(){return t`
      <bbva-type-text
        ambient="primary"
        size="S"
        tag="span"
        text="${this.t("sustainability-carbon-footprint-offset-step-forestry-aportation-payment")}"
      ></bbva-type-text>
    `}get _modalCardList(){return this._showMore?t`
      <sustainability-carbon-footprint-offset-modal-all-cards
        .listCards="${this.listCards}"
        ?show-all-cards="${this._showAllCards}"
        language="${this.language}"
        rewards-conversion-factor="${this.rewardsConversionFactor}"
        selected-contribution=${this.selectedContribution}
        @sustainability-carbon-footprint-offset-modal-all-cards-close="${()=>{this._showAllCards=!1}}"
        @sustainability-carbon-footprint-offset-modal-all-cards-select-card="${({detail:t})=>{this._showAllCards=!1,this._selectCardDispatch(t)}}"
      >
      </sustainability-carbon-footprint-offset-modal-all-cards>
    `:c}get _aportationListCards(){var e;if(!this.listCards)return c;(null===(e=this.listCards)||void 0===e?void 0:e.length)>0&&this.listCards.every((t=>this._insufficientBalance(t)))&&this._dispatchCustomEvent("sustainability-carbon-footprint-offset-send-insuficcient-balance-analytic");const i=this.listCards.slice(0,this._displayedCardsCount),s=this._showMore?this.t("sustainability-carbon-footprint-offset-see-more-projects"):"";return t`
      <bbva-header-category
        ambient="primary"
        option-link="${s}"
        text="${this.t("sustainability-carbon-footprint-offset-all-cards-header-text")}"
        @click="${()=>{this._showAllCards=!this._showAllCards}}"
      >
      </bbva-header-category>
      ${i.map(((e,s)=>t`
          <bbva-type-link
            ambient="primary"
            class="card-list ${this._hasOneCard()||this._insufficientBalance(e)?"disabledClick":""}"
            @click=${()=>this._selectCardDispatch(e)}
          >
            <composition-list-cards
              ambient="primary"
              .card=${e}
              class="card-detail"
              language=${this.language}
              rewards-conversion-factor=${this.rewardsConversionFactor}
              selected-contribution=${this.selectedContribution}
            ></composition-list-cards>
            ${s<i.length-1?t`<bbva-divider-default size="full"></bbva-divider-default>`:c}
          </bbva-type-link>
        `))}
    `}_insufficientBalance(t){if(!t)return!1;const{isActive:e,amount:i=0,rewardsPoints:s=0}=t,a=i+s*this.rewardsConversionFactor;return!e||a<this.selectedContribution||i<0}_hasOneCard(){var t;return 1===(null===(t=this.listCards)||void 0===t?void 0:t.length)}get _tplButton(){return this._hasOneCard()?t`
      <bbva-button-default
        ambient="primary"
        class="action"
        fullwidth
        ?disabled="${this._insufficientBalance(this._cardSelected)}"
        @click="${this._handleClickContinue}"
      >
        ${this.t("sustainability-carbon-footprint-offset-multistep-continue")}
      </bbva-button-default>
    `:c}render(){return t`
      ${this._headerAportationListCards} ${this._aportationListCards} ${this._tplButton}
      ${this._modalCardList}
    `}}var Gt=e`
  :host {
    display: block;
    box-sizing: border-box;
  }

  :host([hidden]),
  [hidden] {
    display: none !important;
  }

  *,
  *::before,
  *::after {
    box-sizing: inherit;
  }

  [data-tag-name='bbva-button-default'] {
    margin-top: 1rem;
  }

  [data-tag-name='bbva-form-radio-button'] {
    margin-left: -1rem;
  }

  .section-payment {
    display: flex;
    justify-content: space-between;
    margin-top: 1rem;
  }

  .section-main {
    display: flex;
    flex-direction: column;
  }

  .section-rewards {
    display: flex;
    flex-direction: column;
    align-items: end;
  }
`;class Jt extends(i(v(g(s)))){static get is(){return"sustainability-carbon-footprint-offset-forestry-aportation-reward-points"}static get scopedElements(){const t=[O,C,gt,R,A,E,vt,...Jt.configurationScopedElements()];return Jt.scopedElementsFromClasses(t)}static get properties(){return{cardDetail:{type:Object,attribute:"card-detail"},selectedContribution:{type:Number,attribute:"selected-contribution"},rewardsConversionFactor:{type:Number,attribute:"rewards-conversion-factor"},currencyCode:{type:String,attribute:"currency-code"},language:{type:String},localCurrency:{type:String,attribute:"local-currency"},_isDisabled:{type:Boolean,state:!0},_pointsToUse:{type:Number,state:!0},_amountToPayWithPoints:{type:Number,state:!0},_amountToPayWithCard:{type:Number,state:!0},_payWithPoints:{type:Boolean,state:!0},_totalRewards:{type:Number,state:!0},_showBreakdown:{type:Boolean,state:!0}}}constructor(){super(),this.cardDetail={},this.currencyCode="",this.language="",this.localCurrency="",this.rewardsConversionFactor=0,this.selectedContribution=0,this._isDisabled=!1,this._pointsToUse=0,this._amountToPayWithPoints=0,this._amountToPayWithCard=0,this._totalRewards=0,this._payWithPoints=!1,this._showBreakdown=!1}static get styles(){return[Gt,z.secondary,P.secondary,_t.secondary,I.secondary,F.primary,a("sustainability-carbon-footprint-offset-forestry-aportation-reward-points-shared-styles")]}reset(){this.shadowRoot.querySelectorAll('[data-tag-name="bbva-form-radio-button"]').forEach((t=>{t.checked=!1})),this._showBreakdown=!1,this._isDisabled=!1}get _calculate(){const{amount:t=0,rewardsPoints:e=0}=this.cardDetail;this._totalRewards=e,this._rewardsConverted=this._totalRewards*this.rewardsConversionFactor;const i=t+this._rewardsConverted;return this._pointsToUse=this._rewardsConverted/this.rewardsConversionFactor,t>=this.selectedContribution?this._handleRadioBreakdown(this._rewardsConverted):t<this.selectedContribution&&i>=this.selectedContribution?(this._isDisabled=!0,this._handleYellowLegends(t,this._rewardsConverted)):c}_handleRadioBreakdown(t){return this._payWithPoints?t>=this.selectedContribution?(this._amountToPayWithPoints=this.selectedContribution,this._pointsToUse=this.selectedContribution/this.rewardsConversionFactor,this._amountToPayWithCard=0):(this._amountToPayWithPoints=this._totalRewards*this.rewardsConversionFactor,this._pointsToUse=this._totalRewards,this._amountToPayWithCard=this.selectedContribution-this._amountToPayWithPoints):(this._amountToPayWithPoints=0,this._amountToPayWithCard=this.selectedContribution,this._totalRewards=0,this._payWithPoints=!1,this._pointsToUse=0),this._descriptionAndRadioButtonSection}_handleYellowLegends(t,e){return this._payWithPoints=!0,t<this.selectedContribution&&e>=this.selectedContribution?(this._pointsToUse=this.selectedContribution/this.rewardsConversionFactor,this._amountToPayWithPoints=this.selectedContribution,this._amountToPayWithCard=0,this._notificationMessage={messageTitle:"sustainability-carbon-footprint-offset-notification-message-insufficient-amount",message:"sustainability-carbon-footprint-offset-notification-message-total-pay-with-points",bookTitle:!1}):(this._pointsToUse=this._totalRewards,this._amountToPayWithPoints=this._rewardsConverted,this._amountToPayWithCard=this.selectedContribution-this._amountToPayWithPoints,this._notificationMessage={messageTitle:"sustainability-carbon-footprint-offset-notification-message-partial-coverage-text",message:"",bookTitle:!0}),this._showInsufficientBalance}_handleClickContinue(){this._dispatchCustomEvent(`${Jt.is}-complete`),this._dispatchCustomEvent(`${Jt.is}-payment-selection`,{isPayWithPoints:this._payWithPoints,totalRewards:this._totalRewards,amountToPayWithPoints:this._amountToPayWithPoints,amountToPayWithCard:this._amountToPayWithCard,pointsToUse:this._pointsToUse})}_handleRadioChange(t){const{value:e}=t.detail;this._showBreakdown="with-card"!==e,this._payWithPoints="with-card"!==e,this._isDisabled=!0,this._payWithPoints&&this._dispatchCustomEvent("sustainability-carbon-footprint-offset-send-bbva-points-analytic")}get _showInsufficientBalance(){return t`${this._rewardsParcialAmountMessage} ${this._paymentRewardSection}`}get _rewardsParcialAmountMessage(){return t`
      <bbva-notification-message
        ambient="primary"
        variant="caution"
        message-title="${this._notificationMessage.messageTitle}"
        message="${this._notificationMessage.message}"
        ?book-title=${this._notificationMessage.bookTitle}
      ></bbva-notification-message>
    `}get _descriptionAndRadioButtonSection(){return t`
      <div class="description-reward">
        <bbva-type-text
          ambient="primary"
          tag="span"
          text="${this.t("sustainability-carbon-footprint-offset-text-choose-payment-type")}"
        ></bbva-type-text>
      </div>
      <bbva-form-radio-group
        @form-radio-group-item-change="${this._handleRadioChange}"
        ambient="primary"
      >
        <bbva-form-radio-button value="with-card">
          ${this.t("sustainability-carbon-footprint-offset-radio-text-pay-with-card")}
        </bbva-form-radio-button>
        <bbva-divider-default size="full"></bbva-divider-default>
        <bbva-form-radio-button
          value="with-points"
          info-message=${this.t(this._rewardsConverted>=this.selectedContribution?"sustainability-carbon-footprint-offset-notification-cover-total-amount":"sustainability-carbon-footprint-offset-notification-message-partial-coverage-text")}
        >
          ${this.t("sustainability-carbon-footprint-offset-radio-text-pay-with-bbva-points")}
        </bbva-form-radio-button>
      </bbva-form-radio-group>
    `}get _paymentRewardSection(){return t`
      <div class="section-payment">
        <div class="section-main">
          <bbva-type-text
            ambient="primary"
            size="s"
            tag="span"
            text="${this.t("sustainability-carbon-footprint-offset-text-total-bbva-points")}"
          ></bbva-type-text>
          <bbva-type-text
            ambient="primary"
            size="s"
            tag="span"
            text="${this.t("sustainability-carbon-footprint-offset-text-bbva-points-used")}"
          ></bbva-type-text>
          <bbva-type-text
            ambient="primary"
            size="s"
            tag="span"
            text="${this.t("sustainability-carbon-footprint-offset-text-amount-to-pay-with-points")}"
          ></bbva-type-text>
          <bbva-type-text
            ambient="primary"
            font-weight="500"
            size="s"
            tag="span"
            text="${this.t("sustainability-carbon-footprint-offset-text-amount-to-pay-with-card")}"
          ></bbva-type-text>
        </div>

        <div class="section-rewards" ambient="primary">
          <bbva-type-amount
            ambient="primary"
            variant="s"
            amount="${this._totalRewards}"
            currency-code="${this.currencyCode}"
            language="${this.language}"
            local-currency="${this.localCurrency}"
            type="points"
            decimals-hidden=""
          ></bbva-type-amount>
          <bbva-type-amount
            ambient="primary"
            variant="s"
            amount="${this._pointsToUse}"
            currency-code="${this.currencyCode}"
            language="${this.language}"
            local-currency="${this.localCurrency}"
            type="points"
            decimals-hidden=""
          ></bbva-type-amount>
          <bbva-type-amount
            ambient="primary"
            variant="s"
            amount="${this._amountToPayWithPoints}"
            currency-code="${this.currencyCode}"
            language="${this.language}"
            local-currency="${this.localCurrency}"
          ></bbva-type-amount>
          <bbva-type-amount
            ambient="primary"
            type="bold"
            variant="s"
            amount="${this._amountToPayWithCard}"
            currency-code="${this.currencyCode}"
            language="${this.language}"
            local-currency="${this.localCurrency}"
          ></bbva-type-amount>
        </div>
      </div>
    `}get _tplButton(){return t`
      <bbva-button-default
        ambient="primary"
        ?disabled="${!this._isDisabled}"
        class="action"
        fullwidth
        @click="${this._handleClickContinue}"
        text="${this.t("sustainability-carbon-footprint-offset-multistep-continue")}"
      ></bbva-button-default>
    `}render(){return t`
      ${this._calculate} ${this._showBreakdown?this._paymentRewardSection:c}
      ${this._tplButton}
    `}}var Zt=e`
  :host {
    display: block;
    box-sizing: border-box;
  }

  :host([hidden]),
  [hidden] {
    display: none !important;
  }

  *,
  *::before,
  *::after {
    box-sizing: inherit;
  }

  [data-tag-name='bbva-form-control-input'] {
    background-color: ${y("colorPrimarySurfaceAmbientDefault",f)};
  }

  .project-detail-container {
    padding: 1rem;
    display: flex;
    flex-direction: column;
    gap: 0.5rem;
    background-color: ${y("colorPrimarySurfaceAmbientDefault",f)};
  }

  .form-control-slot {
    padding: 0.5rem 0.5rem 0 0.5rem;
  }

  .card-list {
    display: flex;
    flex-direction: column;
    gap: 1rem;
  }

  .action {
    margin-top: 1.5rem;
  }
`;class Qt extends(i(v(g(s)))){static get is(){return"sustainability-carbon-footprint-offset-forestry-initial-projects"}static get scopedElements(){const t=[O,$,$t,Ct,x,C,X,St,...Qt.configurationScopedElements()];return Qt.scopedElementsFromClasses(t)}static get properties(){return{_isDisabled:{type:Boolean,state:!0},forestryProjects:{type:Array,attribute:"forestry-projects"}}}constructor(){super(),this._isDisabled=!1,this.forestryProjects=[]}static get styles(){return[Zt,P.secondary,z.secondary,j.secondary,a("sustainability-carbon-footprint-offset-forestry-initial-projects-shared-styles")]}firstUpdated(){this._isDisabled=!0}reset(){this.shadowRoot.querySelectorAll('[data-tag-name="bbva-form-control-input"]').forEach((t=>{t.checked=!1})),this._isDisabled=!0}_handleClickContinue(){var t;1===this.forestryProjects.length&&this._projectSelected(null===(t=this.forestryProjects)||void 0===t?void 0:t[0]),this._dispatchCustomEvent(`${Qt.is}-switch-header-type`),this._dispatchCustomEvent(`${Qt.is}-complete`)}_projectSelected(t){this.forestryProjects.length>1&&(this._isDisabled=!1),this._dispatchCustomEvent(`${Qt.is}-select`,t.id)}_callProjectDetail(){this._dispatchCustomEvent(`${Qt.is}-call-project-detail-modal-click`)}get _forestryProjectList(){return 1===this.forestryProjects.length?this._projectCard(this.forestryProjects[0]):this._renderMultipleProjects(this.forestryProjects)}_renderMultipleProjects(e){return e.map(((e,i)=>t`
        <bbva-form-container
          show-help-icon="false"
          variant="card"
          @form-container-radio-change="${()=>{this._dispatchCustomEvent("sustainability-carbon-footprint-offset-send-app-started-analytic",{step:"seleccionar proyecto"}),this._projectSelected(e)}}"
        >
          <bbva-form-control-input
            ambient="primary-alt"
            slot="_option"
            type="radio"
            value="project${i+1}"
            variant="card"
            name="project"
          >
            <div class="form-control-slot" slot="bottom">${this._projectCard(e)}</div>
          </bbva-form-control-input>
        </bbva-form-container>
      `))}_projectCard(e){return t`
      <div class="project-card-container">
        <bbva-banner-image image-src="${o(e.image.url)}" size="L"></bbva-banner-image>
        <div class="project-detail-container">
          <bbva-type-text
            font-weight="500"
            size="L"
            tag="span"
            text="${e.name}"
          ></bbva-type-text>
          <bbva-badge-icon
            ambient="dark"
            description="${e.location}"
            icon="${r()}"
          ></bbva-badge-icon>
          ${e.summary}
          <bbva-type-link
            @click="${()=>{this._dispatchCustomEvent("sustainability-carbon-footprint-offset-send-app-started-analytic",{step:"ver mas"}),this._projectSelected(e),this._callProjectDetail()}}"
          >
            ${this.t("sustainability-carbon-footprint-offset-see-more-projects")}
          </bbva-type-link>
        </div>
      </div>
    `}render(){return t`
      <div class="step-two-container">
        <bbva-type-text
          font-weight="500"
          size="S"
          text="${this.t("sustainability-carbon-footprint-offset-step-select-project-description")}"
        ></bbva-type-text>
        <div class="card-list">${this._forestryProjectList}</div>
        <bbva-button-default
          ?disabled="${1===this.forestryProjects.length?!this._isDisabled:this._isDisabled}"
          class="action"
          fullwidth
          text="${this.t("sustainability-carbon-footprint-offset-multistep-continue")}"
          @click="${this._handleClickContinue}"
        ></bbva-button-default>
      </div>
    `}}var te=e`
  :host {
    display: block;
    box-sizing: border-box;
  }

  :host([hidden]),
  [hidden] {
    display: none !important;
  }

  *,
  *::before,
  *::after {
    box-sizing: inherit;
  }

  .project-detail-container {
    display: flex;
    flex-direction: column;
    padding: 0 1rem;
  }
  .project-detail-container [data-tag-name='bbva-type-text'] {
    margin-bottom: 1rem;
  }
  .project-detail-container [data-tag-name='bbva-type-text'].project-name {
    margin-top: 1rem;
    margin-bottom: 0.5rem;
  }
  .project-detail-container [data-tag-name='bbva-type-text'].project-summary {
    margin-top: 0.5rem;
  }
  .project-detail-container [data-tag-name='bbva-type-text'].project-description {
    margin-top: 0;
  }
  .project-detail-container [data-tag-name='bbva-type-text'].project-activities-text {
    margin-bottom: 0.25rem;
  }
  .project-detail-container .activities {
    margin-bottom: 1rem;
  }
`;class ee extends(v(g(i(s)))){static get is(){return"sustainability-carbon-footprint-offset-project-detail"}static get scopedElements(){const t=[E,C,$,G,X,...ee.configurationScopedElements()];return ee.scopedElementsFromClasses(t)}static get properties(){return{projectDetail:{type:Object,attribute:"project-detail"}}}static get styles(){return[te,P.primary,J.primary,a("sustainability-carbon-footprint-offset-project-detail-shared-styles")]}constructor(){super(),this.projectDetail={}}get detailTemplate(){var e,i,s,a,n,l,d,p;return t`
      <bbva-banner-image
        ambient="primary"
        class="banner-image"
        size="L"
        image-src=${o(null===(e=this.projectDetail)||void 0===e||null===(i=e.image)||void 0===i?void 0:i.url)}
        img-accessibility-text="${null===(s=this.projectDetail)||void 0===s?void 0:s.name}"
      ></bbva-banner-image>
      <div class="project-detail-container">
        <bbva-type-text
          ambient="primary"
          class="project-name"
          tag="span"
          size="L"
          font-weight="500"
          text="${null===(a=this.projectDetail)||void 0===a?void 0:a.name}"
        ></bbva-type-text>
        <bbva-badge-icon
          ambient="primary"
          icon=${r()}
          description="${null===(n=this.projectDetail)||void 0===n?void 0:n.location}"
        ></bbva-badge-icon>
        <bbva-type-text
          ambient="primary"
          class="project-summary"
          tag="span"
          text=${null===(l=this.projectDetail)||void 0===l?void 0:l.summary}
          size="S"
        ></bbva-type-text>
        <bbva-type-text
          ambient="primary"
          class="project-description"
          tag="span"
          size="S"
          text="${null===(d=this.projectDetail)||void 0===d?void 0:d.description}"
        ></bbva-type-text>
        <bbva-type-text
          ambient="primary"
          tag="span"
          class="project-activities-text"
          size="S"
          text="${this.t("sustainability-carbon-footprint-offset-project-detail-activities-text")}"
        ></bbva-type-text>
        <div class="activities">
          ${null!==(p=this.projectDetail)&&void 0!==p&&p.activities&&this.projectDetail.activities.length>0?this.projectDetail.activities.map((e=>t`<bbva-list-bullet ambient="primary" text="${e}"></bbva-list-bullet>`)):c}
        </div>
        <bbva-notification-message
          ambient="primary"
          variant="default"
          message-title="${this.t("sustainability-carbon-footprint-offset-project-detail-responsibility-text")}"
          book-title
          size="XS"
        >
        </bbva-notification-message>
      </div>
    `}render(){return t`${super.render()} ${this.detailTemplate}`}}var ie=e`
  :host {
    display: block;
    box-sizing: border-box;
  }

  :host([hidden]),
  [hidden] {
    display: none !important;
  }

  *,
  *::before,
  *::after {
    box-sizing: inherit;
  }
`;class se extends(v(g(i(s)))){static get is(){return"sustainability-carbon-footprint-offset-project-detail-modal"}static get scopedElements(){const t=[ee,S,...se.configurationScopedElements()];return se.scopedElementsFromClasses(t)}static get properties(){return{projectDetail:{type:Array},showDetail:{type:Boolean,attribute:"show-detail"}}}static get styles(){return[ie,a("sustainability-carbon-footprint-offset-project-detail-modal-shared-styles")]}constructor(){super(),this.projectDetail=[],this.showDetail=!1}get detailTemplate(){return t`
      <bbva-help-modal
        ?visible="${this.showDetail}"
        full-height
        header-close-icon-label="${this.t("sustainability-carbon-footprint-offset-header-close-text")}"
        header-text="${this.t("sustainability-carbon-footprint-offset-project-detail")}"
        hide-content-padding-top
        @header-main-close-icon-click="${t=>{t.stopPropagation(),this._dispatchCustomEvent(`${se.is}-close`)}}"
      >
        <div slot="slot-content">
          <sustainability-carbon-footprint-offset-project-detail
            .projectDetail="${this.projectDetail}"
          ></sustainability-carbon-footprint-offset-project-detail>
        </div>
      </bbva-help-modal>
    `}render(){return t`${this.detailTemplate}`}}var ae=e`
  :host {
    display: block;
    box-sizing: border-box;
  }

  :host([hidden]),
  [hidden] {
    display: none !important;
  }

  [data-tag-name='bbva-help-modal']#multistep-modal {
    --bbva-help-modal-padding: 0;
  }

  .entity {
    display: flex;
    flex-direction: row;
    align-items: baseline;
    justify-content: space-between;
    padding: 0;
  }

  .summary-aportation {
    padding: 0 0.0625rem;
  }

  .confirm-step {
    background-color: var(--_sustainability-carbon-primary-background-color);
    width: 100%;
    padding: 1.5rem 1rem;
  }

  #section-payment {
    display: flex;
    justify-content: space-between;
    gap: 0.5rem;
    padding: 0;
  }

  .section-main {
    display: flex;
    flex-direction: column;
  }

  .section-rewards {
    display: flex;
    flex-direction: column;
    align-items: end;
  }

  *,
  *::before,
  *::after {
    box-sizing: inherit;
  }

  .summary.project {
    display: flex;
    gap: 1rem;
    align-items: center;
  }

  .panel-summary .container-commission {
    display: flex;
    justify-content: left;
    gap: 0.3125rem;
  }
  .panel-summary [data-tag-name='bbva-button-default'] {
    margin: 0.5rem 0;
  }
`;class oe extends(i(v(g(s)))){static get is(){return"sustainability-carbon-footprint-offset-multistep"}static get scopedElements(){const t=[Z,Q,O,Qt,W,C,Ut,Yt,Jt,se,dt,A,S,Wt,Nt,...oe.configurationScopedElements()];return oe.scopedElementsFromClasses(t)}static get properties(){return{_cardSelected:{type:Object,state:!0},_contributionOptions:{type:Array,state:!0},_dataFromRewardPoints:{type:Object,state:!0},_isSecondStep:{type:Boolean,state:!0},_maxRetries:{type:Number,state:!0},_modalConfirmationVisible:{type:Boolean,state:!0},_projectImagesSumary:{type:Array,state:!0},_retriesConfig:{type:Object,state:!0},_selectedProject:{type:Object,state:!0},_showDetail:{type:Boolean,state:!0},_showRetryPayment:{type:Boolean,state:!0},commission:{type:Number},currencyCode:{type:String,attribute:"currency-code"},localCurrency:{type:String,attribute:"local-currency"},forestryProjects:{type:Array},language:{type:String},listCards:{type:Array},rewardsConversionFactor:{type:Number,attribute:"rewards-conversion-factor"},selectedContribution:{type:Number,attribute:"selected-contribution"},showErrorPayment:{type:Boolean,attribute:"show-error-payment"},showMultistep:{type:Boolean,attribute:"show-multistep"},_isPaymentWithPoints:{type:Boolean,state:!0},_totalRewards:{type:Number,state:!0},_amountToPayWithCard:{type:Number,state:!0},_amountToPayWithPoints:{type:Number,state:!0},_pointsToUse:{type:Number,state:!0},remainingCarbonFootprintContributions:{type:Number,attribute:"remaining-carbon-footprint-contributions"}}}constructor(){super(),this._cardSelected={},this._contributionOptions=[],this._dataFromRewardPoints={},this._maxRetries=3,this._modalConfirmationVisible=!1,this._projectImagesSumary=[],this._retriesConfig={POST_PAYMENT_PROCESSES_ERROR:0},this._isSecondStep=!1,this._selectedProject={},this._showDetail=!1,this._showRetryPayment=!1,this.commission=0,this.currencyCode="",this.forestryProjects=[],this.language="",this.listCards=[],this.localCurrency="",this.rewardsConversionFactor=0,this.selectedContribution=0,this.showErrorPayment=!1,this.showMultistep=!1,this._isPaymentWithPoints=!1,this._totalRewards=0,this._amountToPayWithCard=0,this._amountToPayWithPoints=0,this._pointsToUse=0,this.remainingCarbonFootprintContributions=0}static get styles(){return[ae,z.secondary,F.secondary,P.secondary,H.secondary,pt.secondary,z.primary,F.primary,P.primary,a("sustainability-carbon-footprint-offset-multistep-shared-styles")]}firstUpdated(){super.firstUpdated(),this._getElements()}_getElements(){this._multistepElement=this.shadowRoot.querySelector(`[data-tag-name="${Z.is}"]`),this._initialProjectsElement=this.shadowRoot.querySelector(`[data-tag-name="${Qt.is}"]`),this._forestryAportationElement=this.shadowRoot.querySelector(`[data-tag-name="${Ut.is}"]`),this._forestryRewardsElement=this.shadowRoot.querySelector(`[data-tag-name="${Jt.is}"]`)}_handleClickStepThree({detail:t}){this._multistepElement.activeSteps=null==t?void 0:t.firstFlow,this._amountToPayWithCard=this.selectedContribution,this._isPaymentWithPoints=!1,3===(null==t?void 0:t.firstFlow.length)&&this._dispatchCustomEvent("sustainability-carbon-footprint-offset-send-app-step-analytic",{step:"4",typology:this._pointsToUse,productSubtype:"CREDIT_CARD"===this._cardSelected.cardTypeId?"tarjetas credito":"tarjetas debito",productName:this._cardSelected.productName,amount:this.selectedContribution,paymentAmount:this._amountToPayWithCard,paymentType:"dinero",serviceCharge:this.commission})}_requestPaymentProcesses(){this._dispatchCustomEvent(`${oe.is}-request-payment-process`,{isPaymentWithPoints:this._isPaymentWithPoints}),this.showLoader()}_setSelectedProject(t){this._selectedProject=this.forestryProjects.find((e=>e.id===t)),this._setContributionOptions()}_setProjectDetail(){this._showDetail=!this._showDetail}_setContributionOptions(){var t,e;this._contributionOptions=null===(t=this._selectedProject)||void 0===t||null===(e=t.carbonCredits)||void 0===e?void 0:e.filter((t=>t.value<=this.remainingCarbonFootprintContributions)).map((t=>{var e,i;return{index:null==t?void 0:t.value,expense:null==t||null===(e=t.expense)||void 0===e?void 0:e.amount,equivalence:null==t||null===(i=t.equivalence)||void 0===i?void 0:i.value}}))}_selectedCredits(t){var e,i,s,a,o,r;const n={id:null===(e=this._selectedProject)||void 0===e?void 0:e.id,affiliation:null===(i=this._selectedProject)||void 0===i?void 0:i.affiliation,name:null===(s=this._selectedProject)||void 0===s?void 0:s.name,location:null===(a=this._selectedProject)||void 0===a?void 0:a.location,summary:null===(o=this._selectedProject)||void 0===o?void 0:o.summary,carbonCredits:null===(r=this._selectedProject)||void 0===r?void 0:r.carbonCredits.find((e=>e.expense.amount===t))};this._dispatchCustomEvent(`${oe.is}-project-and-credit`,n)}_cardSelectedFromStep({detail:t}){this._cardSelected=t,this._dispatchCustomEvent(`${oe.is}-card-selected`,this._cardSelected)}get _modalProject(){return t`
      <sustainability-carbon-footprint-offset-project-detail-modal
        .projectDetail="${this._selectedProject}"
        ?show-detail="${this._showDetail}"
        @sustainability-carbon-footprint-offset-project-detail-modal-close="${this._setProjectDetail}"
      >
      </sustainability-carbon-footprint-offset-project-detail-modal>
    `}get _sectionPaymentRewardPoints(){return this._isPaymentWithPoints?t`
          <div class="section-main">
            <bbva-type-text
              ambient="secondary"
              tag="span"
              text="${this.t("sustainability-carbon-footprint-offset-text-total-bbva-points")}"
            >
              size="XS"
            </bbva-type-text>
            <bbva-type-text
              ambient="secondary"
              tag="span"
              text="${this.t("sustainability-carbon-footprint-offset-text-bbva-points-used")}"
            >
              size="XS"
            </bbva-type-text>
            <bbva-type-text
              ambient="secondary"
              tag="span"
              text="${this.t("sustainability-carbon-footprint-offset-text-amount-to-pay-with-points")}"
            >
              size="XS"
            </bbva-type-text>
          </div>
          <div class="section-rewards">
            <bbva-type-amount
              ambient="secondary"
              amount="${this._totalRewards}"
              currency-code="${this.currencyCode}"
              language=${this.language}
              local-currency="${this.localCurrency}"
              type="points"
              variant="s"
              decimals-hidden=""
            ></bbva-type-amount>
            <bbva-type-amount
              ambient="secondary"
              amount="${this._pointsToUse}"
              currency-code="${this.currencyCode}"
              language=${this.language}
              local-currency="${this.localCurrency}"
              type="points"
              variant="s"
              decimals-hidden=""
            ></bbva-type-amount>
            <bbva-type-amount
              ambient="secondary"
              amount="${this._amountToPayWithPoints}"
              currency-code="${this.currencyCode}"
              language=${this.language}
              local-currency="${this.localCurrency}"
              variant="s"
            ></bbva-type-amount>
          </div>
        `:t`
          <bbva-type-text
            size="XS"
            tag="span"
            text="${this.t("sustainability-carbon-footprint-offset-text-total-bbva-payment-without-points")}"
          >
          </bbva-type-text>
        `}get _getImage(){var t,e,i;return this._projectImagesSumary=[{image:null===(t=this._selectedProject)||void 0===t||null===(e=t.image)||void 0===e?void 0:e.url,size:"l",accessibilityText:null===(i=this._selectedProject)||void 0===i?void 0:i.name}],JSON.stringify(this._projectImagesSumary)}_getVariableStepInfo(t){return{step:t,total:4}}get _tplInitialProjectsData(){var e;return t`
      <bbva-expandable-step
        ambient="primary"
        class="animation"
        complete-on-event="complete"
        current-step-label="${this.t("sustainability-carbon-footprint-offset-multistep-current-step-label",this._getVariableStepInfo(1))}"
        disabled-target=".action"
        edit-label="${this.t("sustainability-carbon-footprint-offset-multistep-edit")}"
        expandable-step-complete-on-event="sustainability-carbon-footprint-offset-forestry-initial-projects-complete"
        header="${this.t("sustainability-carbon-footprint-offset-project-text")}"
        id="step-1"
        show-link
        @expandable-step-edit-step="${()=>{this._isSecondStep=!this._isSecondStep,this._multistepElement.stepsToReset=[1,2,3],this._resetContribution(),this._resetRewards()}}"
        @sustainability-carbon-footprint-offset-forestry-initial-projects-complete="${()=>{this._dispatchCustomEvent("sustainability-carbon-footprint-offset-send-app-step-analytic",{step:"2"})}}"
      >
        <sustainability-carbon-footprint-offset-forestry-initial-projects
          .forestryProjects="${this.forestryProjects}"
          @sustainability-carbon-footprint-offset-forestry-initial-projects-call-project-detail-modal-click="${this._setProjectDetail}"
          @sustainability-carbon-footprint-offset-forestry-initial-projects-select="${({detail:t})=>{this._setSelectedProject(t)}}"
        >
        </sustainability-carbon-footprint-offset-forestry-initial-projects>
        <div class="summary project" ambient="primary" slot="summary">
          <bbva-clip-box ambient="secondary" group="${this._getImage}"></bbva-clip-box>
          <bbva-type-text
            ambient="secondary"
            font-weight="500"
            tag="span"
            text="${null===(e=this._selectedProject)||void 0===e?void 0:e.name}"
          ></bbva-type-text>
        </div>
      </bbva-expandable-step>
    `}get _tplAportationProject(){return t`
      <bbva-expandable-step
        ambient="primary"
        class="animation"
        current-step-label="${this.t("sustainability-carbon-footprint-offset-multistep-current-step-label",this._getVariableStepInfo(2))}"
        disabled-target=".action"
        edit-label="${this.t("sustainability-carbon-footprint-offset-multistep-edit")}"
        expandable-step-complete-on-event="sustainability-carbon-footprint-offset-forestry-aportation-complete"
        header="${this.t("sustainability-carbon-footprint-offset-step-aportation-title")}"
        id="step-2"
        show-link
        @expandable-step-edit-step="${()=>{this._cardSelected={},this._multistepElement.stepsToReset=[2,3],this._resetRewards()}}"
        @sustainability-carbon-footprint-offset-forestry-aportation-complete="${()=>{this._dispatchCustomEvent("sustainability-carbon-footprint-offset-send-app-step-analytic",{step:"3"})}}"
      >
        <sustainability-carbon-footprint-offset-forestry-aportation
          currency-code="${this.currencyCode}"
          .options=${this._contributionOptions.length>0?this._contributionOptions:void 0}
          id="forestry-aportation"
          @sustainability-carbon-footprint-offset-forestry-aportation-amount-click="${({detail:t})=>{this.selectedContribution=t,this._selectedCredits(t)}}"
        ></sustainability-carbon-footprint-offset-forestry-aportation>
        <div class="summary" slot="summary">
          <bbva-list-swipe ambient="secondary">
            <div slot="invoker" class="invoker">
              <div class="entity">
                <bbva-type-text
                  ambient="secondary"
                  tag="span"
                  text="${this.t("sustainability-carbon-footprint-offset-multistep-contribution-value")}"
                  size="S"
                ></bbva-type-text>
                <bbva-type-amount
                  ambient="secondary"
                  amount="${this.selectedContribution}"
                  bold
                  currency-code="${this.currencyCode}"
                  language=${this.language}
                  local-currency="${this.localCurrency}"
                  variant="l"
                >
                </bbva-type-amount>
              </div>
            </div>
          </bbva-list-swipe>
        </div>
      </bbva-expandable-step>
    `}get _tplAportationPayment(){return t`
      <bbva-expandable-step
        ambient="primary"
        class="animation"
        current-step-label="${this.t("sustainability-carbon-footprint-offset-multistep-current-step-label",this._getVariableStepInfo(3))}"
        disabled-target=".action"
        edit-label="${this.t("sustainability-carbon-footprint-offset-multistep-edit")}"
        expandable-step-complete-on-event="sustainability-carbon-footprint-offset-forestry-aportation-payment-complete"
        id="step-3"
        is-dynamic-handler
        header="${this.t("sustainability-carbon-footprint-offset-multistep-payment-method")}"
        show-link
        @expandable-step-edit-step="${()=>{this._multistepElement.stepsToReset=[3],this._resetRewards(),this._cardSelected={}}}"
      >
        <sustainability-carbon-footprint-offset-forestry-aportation-payment
          .listCards=${this.listCards}
          language=${this.language}
          rewards-conversion-factor=${this.rewardsConversionFactor}
          selected-contribution=${this.selectedContribution}
          @sustainability-carbon-footprint-offset-forestry-aportation-payment-card-select=${this._cardSelectedFromStep}
          @sustainability-carbon-footprint-offset-forestry-aportation-payment-continue-click=${this._handleClickStepThree}
        ></sustainability-carbon-footprint-offset-forestry-aportation-payment>
        <div class="summary" slot="summary" ambient="secondary-alt">
          <composition-list-cards
            ?is-ambient-secondary=${!0}
            .card=${this._cardSelected}
            ambient="secondary-alt"
            language=${this.language}
            rewards-conversion-factor=${this.rewardsConversionFactor}
            selected-contribution=${this.selectedContribution}
          ></composition-list-cards>
        </div>
      </bbva-expandable-step>
    `}get _tplBbvaPoints(){return t`
      <bbva-expandable-step
        ambient="primary"
        class="animation"
        current-step-label="${this.t("sustainability-carbon-footprint-offset-multistep-current-step-label",this._getVariableStepInfo(4))}"
        disabled-target=".action"
        edit-label="${this.t("sustainability-carbon-footprint-offset-multistep-edit")}"
        header="${this.t("sustainability-carbon-footprint-offset-multistep-rewards-points")}"
        id="step-4"
        show-link
        expandable-step-complete-on-event="sustainability-carbon-footprint-offset-forestry-aportation-reward-points-complete"
      >
        <sustainability-carbon-footprint-offset-forestry-aportation-reward-points
          .cardDetail=${this._cardSelected}
          currency-code=${this.currencyCode}
          language=${this.language}
          local-currency=${this.localCurrency}
          selected-contribution=${this.selectedContribution}
          rewards-conversion-factor=${this.rewardsConversionFactor}
          @sustainability-carbon-footprint-offset-forestry-aportation-reward-points-payment-selection="${t=>{t.stopPropagation(),this._isPaymentWithPoints=t.detail.isPayWithPoints,this._totalRewards=t.detail.totalRewards,this._amountToPayWithCard=t.detail.amountToPayWithCard,this._amountToPayWithPoints=t.detail.amountToPayWithPoints,this._pointsToUse=t.detail.pointsToUse,this._isPaymentWithPoints?this._dispatchCustomEvent("sustainability-carbon-footprint-offset-send-app-step-analytic",{step:"4",typology:this._pointsToUse,productSubtype:"CREDIT_CARD"===this._cardSelected.cardTypeId?"tarjetas credito":"tarjetas debito",productName:this._cardSelected.productName,amount:this.selectedContribution,paymentAmount:this._amountToPayWithCard,paymentType:this._amountToPayWithCard>0?"dinero y puntos bbva":"puntos bbva",serviceCharge:this.commission}):this._dispatchCustomEvent("sustainability-carbon-footprint-offset-send-app-step-analytic",{step:"4",typology:this._pointsToUse,productSubtype:"CREDIT_CARD"===this._cardSelected.cardTypeId?"tarjetas credito":"tarjetas debito",productName:this._cardSelected.productName,amount:this.selectedContribution,paymentAmount:this._amountToPayWithCard,paymentType:"dinero",serviceCharge:this.commission})}}"
        ></sustainability-carbon-footprint-offset-forestry-aportation-reward-points>
        <div class="summary" slot="summary" id="section-payment">
          ${this._sectionPaymentRewardPoints}
        </div>
      </bbva-expandable-step>
    `}get _sectionConfirmation(){return t`
      <div class="panel-summary" ambient="primary">
        <bbva-type-text
          ambient="primary"
          size="XS"
          tag="span"
          text="${this.t("sustainability-carbon-footprint-offset-multistep-payment-card")}"
        ></bbva-type-text>
        <bbva-type-amount
          ambient="primary"
          amount="${this._amountToPayWithCard}"
          currency-code="${this.currencyCode}"
          language=${this.language}
          local-currency="${this.localCurrency}"
          type="bold"
          variant="2xl"
        >
        </bbva-type-amount>
        <div class="container-commission">
          <bbva-type-text
            ambient="primary"
            size="XS"
            tag="span"
            text="${this.t("sustainability-carbon-footprint-offset-multistep-commission")}"
          >
          </bbva-type-text>
          <bbva-type-amount
            ambient="primary"
            amount="${this.commission}"
            currency-code="${this.currencyCode}"
            language=${this.language}
            local-currency="${this.localCurrency}"
            tag="span"
            variant="S"
          ></bbva-type-amount>
        </div>
        <bbva-button-default
          ambient="primary"
          fullwidth
          text="${this.t("sustainability-carbon-footprint-offset-multistep-confirm")}"
          variant="positive"
          @click="${this._requestPaymentProcesses}"
        ></bbva-button-default>
        <bbva-type-text
          ambient="primary"
          size="XS"
          tag="span"
          text="${this.t("sustainability-carbon-footprint-offset-multistep-dinamic-cvv")}"
        ></bbva-type-text>
      </div>
    `}get _renderExpandableMultistep(){return t`
      <bbva-expandable-multistep hide-padding-bottom>
        <div slot="content">
          ${this._tplInitialProjectsData} ${this._tplAportationProject}
          ${this._tplAportationPayment} ${this._tplBbvaPoints}
        </div>
        <div class="confirm-step" slot="confirmation" ambient="primary">
          ${this._sectionConfirmation}
        </div>
      </bbva-expandable-multistep>
    `}get _stepsSelector(){return this.shadowRoot.querySelectorAll(`[data-tag-name="${Q.is}"]`)}_sendErrorPayment(t){this.clearLoader();if(3===this._retriesConfig[t]<this._maxRetries)return this.showErrorPayment=!0,void(this._showRetryPayment=!0);"POST_PAYMENT_PROCESSES_ERROR_EXIT"!==t?(this._retriesConfig[t]+=1,this.showErrorPayment=!0):this.showErrorPayment=!1}get _selfErrorModal(){return t`
      <sustainability-carbon-footprint-offset-modal-error
        ?visible=${this.showErrorPayment}
        .modalConfig
        ?showRetryPayment=${this._showRetryPayment}
        @help-modal-footer-button-click=${()=>{this._sendErrorPayment("POST_PAYMENT_PROCESSES_ERROR")}}
        @help-modal-footer-link-click=${()=>{this._sendErrorPayment("POST_PAYMENT_PROCESSES_ERROR_EXIT")}}
      >
      </sustainability-carbon-footprint-offset-modal-error>
    `}get _renderModal(){return t`
      <bbva-help-modal
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?visible=${this.showMultistep}
        ambient="primary-alt"
        avoid-icon-close-modal
        full-height
        hide-content-padding-top
        header-close-icon-aria-label="${this.t("sustainability-carbon-footprint-offset-successful-modal-header-title-close")}"
        header-close-icon-label="${this.t("sustainability-carbon-footprint-offset-successful-modal-header-title-close")}"
        header-text="${this.t("sustainability-carbon-footprint-offset-successful-modal-header-title")}"
        header-type="${this._isSecondStep?"modal-initial-secondary":""}"
        id="multistep-modal"
        @sustainability-carbon-footprint-offset-forestry-initial-projects-switch-header-type="${()=>{this._isSecondStep=!this._isSecondStep}}"
        @header-main-close-icon-click="${t=>{var e,i;null!==(e=this._stepsSelector)&&void 0!==e&&null!==(i=e[0])&&void 0!==i&&i.completed?this._toggleModalConfirmation(t):(t.stopPropagation(),this.resetMultistep(),this._dispatchCustomEvent(`${oe.is}-close`))}}"
      >
        <div class="content" slot="slot-content">
          ${this._renderExpandableMultistep} ${this._modalProject}
        </div>
      </bbva-help-modal>
    `}resetMultistep(){this._selectedProject={},this._contributionOptions=[],this._isSecondStep=!1,this.shadowRoot.querySelector("#step-1").completed=!1,this.shadowRoot.querySelector("#step-1").active=!0,this.shadowRoot.querySelector("#step-2").active=!1,this.shadowRoot.querySelector("#step-3").active=!1,this.shadowRoot.querySelector("#step-4").active=!1,this._initialProjectsElement.reset(),this._resetContribution(),this._forestryRewardsElement.reset(),this._multistepElement.stepsToReset=[1,2,3]}_resetContribution(){this.selectedContribution=0,this._forestryAportationElement.reset()}_resetRewards(){this._forestryRewardsElement.reset(),this._totalRewards=0,this._amountToPayWithCard=0,this._amountToPayWithPoints=0,this._isPaymentWithPoints=!1}get _modalExitOperation(){return t`
      <bbva-help-modal
        ambient="primary"
        ?visible="${this._modalConfirmationVisible}"
        body-text="${this.t("sustainability-carbon-footprint-offset-modal-exit-operation-text")}"
        button-text="${this.t("sustainability-carbon-footprint-offset-modal-exit-operation-exit-button")}"
        header-text="${this.t("sustainability-carbon-footprint-offset-modal-exit-operation-title")}"
        link-text="${this.t("sustainability-carbon-footprint-offset-modal-exit-operation-continue-button")}"
        modal-type="caution"
        title-icon="${h()}"
        @help-modal-footer-button-click="${t=>{this.resetMultistep(),this._dispatchCustomEvent(`${oe.is}-close`),this._toggleModalConfirmation(t)}}"
        @help-modal-footer-link-click="${this._toggleModalConfirmation}"
        @help-modal-header-click="${this._toggleModalConfirmation}"
      ></bbva-help-modal>
    `}_toggleModalConfirmation(t){t.stopPropagation(),this._modalConfirmationVisible=!this._modalConfirmationVisible}render(){return t`${this._renderModal}${this._modalExitOperation}${this._selfErrorModal}`}}var re=e`
  :host {
    display: block;
    box-sizing: border-box;
  }

  :host([hidden]),
  [hidden] {
    display: none !important;
  }

  *,
  *::before,
  *::after {
    box-sizing: inherit;
  }

  [data-tag-name='bbva-transition-container'] {
    --_transition-container-padding: 0;
    --bbva-transition-container-content-color: token('foundations.colors.secondary600');
  }
`;class ne extends(v(g(i(s)))){static get is(){return"sustainability-carbon-footprint-offset-project-detail-page"}static get scopedElements(){const t=[ee,U,...ne.configurationScopedElements()];return ne.scopedElementsFromClasses(t)}static get properties(){return{projectDetail:{type:Array,attribute:"project-detail"},showDetail:{type:Boolean,attribute:"show-detail"}}}static get styles(){return[re,a("sustainability-carbon-footprint-offset-project-detail-page-shared-styles")]}constructor(){super(),this.projectDetail=[],this.showDetail=!1}get detailTemplate(){return t`
      <bbva-transition-container
        ambient="primary"
        ?visible="${this.showDetail}"
        header-type="first-level-sequential"
        header-text="${this.t("sustainability-carbon-footprint-offset-project-detail")}"
        header-left-icon-label="${this.t("sustainability-carbon-footprint-offset-go-back")}"
        header-show-left-icon
        @transition-container-close="${()=>{this._dispatchCustomEvent(`${ne.is}-return`)}}"
      >
        <div slot="slot-content" class="slot-projects">
          <sustainability-carbon-footprint-offset-project-detail
            .projectDetail="${this.projectDetail}"
          ></sustainability-carbon-footprint-offset-project-detail>
        </div>
      </bbva-transition-container>
    `}render(){return t`${this.detailTemplate}`}}var ce=e`
  :host {
    display: block;
    box-sizing: border-box;
  }

  :host([hidden]),
  [hidden] {
    display: none !important;
  }

  *,
  *::before,
  *::after {
    box-sizing: inherit;
  }

  [data-tag-name='bbva-transition-container'] {
    --_transition-container-content-bg-color: ${y("colorPrimarySurfaceAmbientDefault",f)};
  }

  [data-tag-name='sustainability-carbon-footprint-offset-project-card'] {
    margin: 1rem 0;
  }
`;class le extends(v(g(i(s)))){static get is(){return"sustainability-carbon-footprint-offset-projects"}static get scopedElements(){const t=[U,ne,St,...le.configurationScopedElements()];return le.scopedElementsFromClasses(t)}static get properties(){return{forestryProjects:{type:Array,attribute:"forestry-projects"},showProjects:{type:Boolean,attribute:"show-projects"},_showProjectDetail:{type:Boolean,state:!0},_projectDetail:{type:Object,state:!0}}}constructor(){super(),this.forestryProjects=[],this.showProjects=!1,this._projectDetail={},this._showProjectDetail=!1}static get styles(){return[ce,a("sustainability-carbon-footprint-offset-projects-shared-styles")]}_toggleProjectDetail(){this._showProjectDetail=!this._showProjectDetail}get _modalProject(){return t`
      <sustainability-carbon-footprint-offset-project-detail-page
        ?show-detail="${this._showProjectDetail}"
        .projectDetail="${this._projectDetail}"
        @sustainability-carbon-footprint-offset-project-detail-page-return="${this._toggleProjectDetail}"
      ></sustainability-carbon-footprint-offset-project-detail-page>
    `}get _projectCards(){return this.forestryProjects.map((e=>t`
        <sustainability-carbon-footprint-offset-project-card
          project-image="${e.image.url}"
          project-title="${e.name}"
          project-description="${e.summary}"
          location="${e.location}"
          project-id="${e.id}"
          card-layout="horizontal"
          @sustainability-carbon-footprint-offset-project-card-project-clicked=${({detail:t})=>{this._dispatchCustomEvent("sustainability-carbon-footprint-offset-send-project-detail-analytic"),this._projectDetail=this.forestryProjects.find((e=>e.id===t)),this._toggleProjectDetail()}}
        ></sustainability-carbon-footprint-offset-project-card>
      `))}render(){return t`
      <bbva-transition-container
        ambient="primary"
        id="project-list"
        header-type="first-level-sequential"
        header-text="${this.t("sustainability-carbon-footprint-offset-all-projects")}"
        header-left-icon-label="${this.t("sustainability-carbon-footprint-offset-go-back")}"
        header-show-left-icon
        ?visible="${this.showProjects}"
      >
        <div slot="slot-content" class="slot-projects">${this._projectCards}</div>
      </bbva-transition-container>
      ${this._modalProject}
    `}}var de=e`
  :host {
    display: block;
    box-sizing: border-box;
    --_sustainability-carbon-primary-background-color: ${y("colorPrimarySurfaceAmbientDefault",f)};
  }

  :host([hidden]),
  [hidden] {
    display: none !important;
  }

  *,
  *:before,
  *:after {
    box-sizing: inherit;
  }

  [data-tag-name='bbva-header-main'] {
    padding-top: 0;
  }

  [data-tag-name='bbva-button-default'] {
    padding: 1rem;
  }

  [data-tag-name='bbva-type-amount'] {
    margin-bottom: 1rem;
  }

  [data-tag-name='sustainability-carbon-footprint-offset-project-card'] {
    margin: 0 1rem;
  }

  .content-forest {
    display: flex;
    flex-direction: column;
    background-color: var(--_sustainability-carbon-primary-background-color);
  }
  .content-forest__padding {
    padding: 0 1rem;
  }

  .full-padding-segment {
    margin: 1rem;
  }

  .thank-you-spacing {
    margin: 0 1rem;
  }

  .panel-button {
    background-color: ${y("colorPrimarySurfaceAmbientPressed",f)};
    box-shadow:
      0 -0.1875rem 0.125rem 0 ${y("colorPrimaryText01Default",f)},
      0.08;
    padding: 1rem;
    width: 100%;
  }

  .interest-message {
    margin-top: 1.5rem;
    margin-bottom: 1rem;
  }
`;class pe extends(g(v(i(s)))){static get is(){return"sustainability-carbon-footprint-offset"}static get scopedElements(){const t=[V,E,oe,Ft,ne,St,le,Ot,Rt,Nt,N,Et,O,w,C,A,x,Mt,kt,...pe.configurationScopedElements()];return pe.scopedElementsFromClasses(t)}static get properties(){return{contentFragmentPath:{type:String,attribute:"content-fragment-path"},aemHost:{type:String,attribute:"aem-host"},aemPath:{type:String,attribute:"aem-path"},commission:{type:Number},country:{type:String},currencyCode:{type:String,attribute:"currency-code"},environment:{type:String},financialData:{type:Object},language:{type:String},localCurrency:{type:String,attribute:"local-currency"},native:{type:Boolean},nativeIos:{type:Boolean,attribute:"native-ios"},requiredToken:{type:String,attribute:"required-token"},rewardsConversionFactor:{type:Number,attribute:"rewards-conversion-factor"},physicalSupportDescription:{type:String,attribute:"physical-support-description"},_typeModal:{type:String,state:!0},versionCardsApiDm:{type:String,attribute:"version-cards-api-dm"},versionCustomerContactDetailsApiDm:{type:String,attribute:"version-customer-contact-details-api-dm"},versionCustomersApiDm:{type:String,attribute:"version-customers-api-dm"},versionLoyaltyApiDm:{type:String,attribute:"version-loyalty-api-dm"},versionSustainabilityApiDm:{type:String,attribute:"version-sustainability-api-dm"},_contributionAmount:{type:Number,state:!0},_bodyResponsePayment:{type:Object,state:!0},footprintValue:{type:Number,attribute:"footprint-value"},_cardSelected:{type:Object,state:!0},_contributionAllowed:{type:Boolean,state:!0},_customerName:{type:String,state:!0},_cvvGenerated:{type:String,state:!0},_faqsVisible:{type:Boolean,state:!0},_forestryProjects:{type:Array,state:!0},_informativeModalHeader:{type:String,state:!0},_informativeModalText:{type:Array,state:!0},_isDataLoading:{type:Boolean,state:!0},_isInformativeModalOpen:{type:Boolean,state:!0},_isPaymentWithPoints:{type:Boolean,state:!0},_listCards:{type:Array,state:!0},_modalConfig:{type:Object},_projectsLoaded:{type:Boolean,state:!0},_pubKey:{type:String,state:!0},_retryCount:{type:Number,state:!0},retryHalfModalCount:{type:Number,attribute:"retry-half-modal-count"},_selectedContribution:{type:Number,state:!0},_selectedProject:{type:Object,state:!0},_selectedProjectAndCredit:{type:Object,state:!0},_showTryItLater:{type:Boolean,state:!0},_showDetail:{type:Boolean,state:!0},_showDigitalCardAlert:{type:Boolean,state:!0},_showErrorMessage:{type:Boolean,state:!0},_showModalError:{type:Boolean,state:!0},_showMultistep:{type:Boolean,state:!0},_showProjects:{type:Boolean,state:!0},_showSuccessModal:{type:Boolean,state:!0},_successModalProperty:{type:Boolean,state:!0},_remainingCarbonFootprintContributions:{type:Number,state:!0},visibleModalTest:{type:Boolean},_bodyText:{type:String},_buttonText:{type:String},_linkText:{type:String},_titleHeader:{type:String},_contributionEquivalence:{type:Number,state:!0},showHelpFaqs:{type:Boolean,attribute:"show-help-faqs"},iOSFixedHeader:{type:Boolean,attribute:"ios-fixed-header"}}}constructor(){super(),this.visibleModalTest=!1,this.contentFragmentPath="",this.aemHost="",this.aemPath="",this.commission=0,this.config={loader:!0},this.country="",this.currencyCode="",this.environment="",this.financialData={},this.headers={},this.host="",this.language="",this.localCurrency="",this.native=!1,this.nativeIos=!1,this.requiredToken="",this.rewardsConversionFactor=0,this.physicalSupportDescription="",this._typeModal="",this.versionCardsApiDm="",this.versionCustomersApiDm="",this.versionCustomerContactDetailsApiDm="",this.versionLoyaltyApiDm="",this.versionSustainabilityApiDm="",this._contributionAmount=0,this.footprintValue=0,this._projectsLoaded=!1,this._bodyResponsePayment={},this._carbonFootprintOverview=[],this._cardSelected={},this._contributionAllowed=!1,this._customerName="",this._cvvGenerated="",this._faqsVisible=!1,this._forestryProjects=[],this._informativeModalHeader="",this._informativeModalText=[],this._isDataLoading=!1,this._isInformativeModalOpen=!1,this._isPaymentWithPoints=!1,this._listCards=[],this._modalConfig={noInformationRetry:{fullHeight:!1,titleIcon:u(),modalType:"warning",titleHeader:"",titleText:"sustainability-carbon-footprint-offset-no-operation",bodyText:"sustainability-carbon-footprint-offset-no-operation-body",buttonText:"sustainability-carbon-footprint-offset-retry",linkText:"sustainability-carbon-footprint-offset-modal-exit-operation-exit-button"},noInformation:{fullHeight:!1,titleIcon:u(),modalType:"warning",titleHeader:"",titleText:"sustainability-carbon-footprint-offset-no-operation",bodyText:"sustainability-carbon-footprint-offset-no-operation-body-failed",linkText:"sustainability-carbon-footprint-offset-modal-exit-operation-exit-button",buttonText:""}},this._pubKey="",this._projectsLoaded=!1,this._retryCount=0,this.retryHalfModalCount=3,this._selectedContribution=0,this._selectedProject={},this._selectedProjectAndCredit={},this._showTryItLater=!1,this._showDetail=!1,this._showDigitalCardAlert=!1,this._showErrorMessage=!1,this._showModalError=!1,this._showMultistep=!1,this._showProjects=!1,this._successModalProperty=!1,this._showSuccessModal=!1,this._remainingCarbonFootprintContributions=0,this._titleHeader="",this._bodyText="",this._buttonText="",this._linkText="",this._contributionEquivalence=0,this._minimunCarbonFootprint=1e3,this._headerButtons=[{id:"faqs",icon:b(),label:this.t("sustainability-carbon-footprint-offset-help")}],this.showHelpFaqs=!1,this.iOSFixedHeader=!1}static get styles(){return[de,D.primary,D.secondary,D.primaryAlt,P.primary,F.primary,j.primary,a("sustainability-carbon-footprint-offset-shared-styles")]}async firstUpdated(){super.firstUpdated(),await this._getDm(),this._isDataLoading=!0,await this._featureScfoDm._getCards(),this.requestUpdate()}updated(t){if(super.updated(t),t.has("_typeModal")&&this._modalConfig[this._typeModal]){const t=this._modalConfig[this._typeModal];this._titleHeader=t.titleText,this._bodyText=t.bodyText,this._buttonText=t.buttonText,this._linkText=t.linkText,this._visibleModalWarnig=!0}}async _getDm(){this._featureScfoDm=this.shadowRoot.querySelector(`[data-tag-name="${Mt.is}"]`)}get _multistepSelector(){return this.shadowRoot.querySelector(`[data-tag-name="${oe.is}"]`)}get _getsDms(){return t`
      <sustainability-carbon-footprint-offset-dm
        ?is-pay-with-points="${this._isPaymentWithPoints}"
        ?native="${this.native}"
        ?native-ios="${this.nativeIos}"
        .cardSelected="${this._cardSelected}"
        .financialData="${this.financialData}"
        .headers="${this.headers}"
        .selectedProjectAndCredit="${this._selectedProjectAndCredit}"
        aem-host="${this.aemHost}"
        aem-path="${this.aemPath}"
        country="${this.country}"
        currency-code="${this.currencyCode}"
        cvv-generated="${this._cvvGenerated}"
        environment="${this.environment}"
        host="${this.host}"
        required-token="${this.requiredToken}"
        physical-support-description="${this.physicalSupportDescription}"
        version-cards-api-dm="${this.versionCardsApiDm}"
        version-customers-api-dm="${this.versionCustomersApiDm}"
        version-loyalty-api-dm="${this.versionLoyaltyApiDm}"
        version-sustainability-api-dm="${this.versionSustainabilityApiDm}"
        @cards-info="${({detail:t})=>{this._listCards=t}}"
        @user-name="${({detail:t})=>{this._customerName=t}}"
        @projects-info="${({detail:t})=>{this._forestryProjects=t,this._projectsLoaded=!0,this._dispatchCustomEvent("sustainability-carbon-footprint-offset-send-forestry-projects-analytic")}}"
        @payment-success-body="${({detail:t})=>{this._bodyResponsePayment=t,this._toggleSuccesModalVisibility(),this._dispatchCustomEvent("sustainability-carbon-footprint-offset-send-app-completed-analytic",this._bodyResponsePayment)}}"
        @sustainability-carbon-footprint-offset-dm-payment-error="${()=>{this._dispatchCustomEvent("sustainability-carbon-footprint-offset-send-error-payment-analytic"),this.retryHalfModalCount>0?(this._typeModal="noInformationRetry",this.retryHalfModalCount-=1,this.visibleModalTest=!0):(this._typeModal="noInformation",this.retryHalfModalCount=3,this.visibleModalTest=!0)}}"
        @contributions-status="${({detail:t})=>{this._contributionEquivalence=t.contributionEquivalence,this._contributionAmount=t.contributionAmount,this._contributionAllowed=t.isContributionAllowed,this._remainingCarbonFootprintContributions=t.remainingCarbonFootprintContributions,this.clearLoader()}}"
        @is-loading-data="${({detail:t})=>{this._isDataLoading=t,this.requestUpdate()}}"
        @carbon-footprint-overview-value="${({detail:t})=>{this.footprintValue=t}}"
        @sustainability-carbon-footprint-offset-cards-api-dm-error="${()=>{this.retryHalfModalCount>0?(this._typeModal="noInformationRetry",this.retryHalfModalCount-=1,this.visibleModalTest=!0):(this._typeModal="noInformation",this.retryHalfModalCount=3,this.visibleModalTest=!0)}}"
        @sustainability-carbon-footprint-offset-forestry-projects-api-dm-error="${()=>{this._showErrorMessage=!0}}"
        @sustainability-carbon-footprint-offset-forestry-projects-only-error="${()=>{this._isDataLoading=!1}}"
        @sustainability-carbon-footprint-offset-modal-card-error-retry="${()=>{this._featureScfoDm._getCards()}}"
      >
      </sustainability-carbon-footprint-offset-dm>
    `}get _modalErrorServices(){return t`
      <sustainability-carbon-footprint-offset-modal-error
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        ?visible-modal="${this.visibleModalTest}"
        title-text-modal="${this._titleHeader}"
        body-text="${this._bodyText}"
        button-text="${this._buttonText}"
        link-text="${this._linkText}"
        modal-size="S"
        @sustainability-carbon-footprint-offset-modal-error-close="${()=>{this._dispatchCustomEvent("sustainability-carbon-footprint-offset-modal-error-close"),this.visibleModalTest=!1}}"
        @sustainability-carbon-footprint-offset-modal-error-footer-retry="${()=>{this._retryServices(),this.visibleModalTest=!1}}"
      >
      </sustainability-carbon-footprint-offset-modal-error>
    `}_retryServices(){this._featureScfoDm._getCards()}_showModalFaqs(){this._faqsVisible=!this._faqsVisible}_showProjectDetail(){this._dispatchCustomEvent("sustainability-carbon-footprint-offset-send-project-detail-analytic"),this._showDetail=!this._showDetail}_displayProjects(){this._showProjects=!this._showProjects}_showAportMultistep(){var t;(null===(t=this._listCards)||void 0===t?void 0:t.length)>0?this._showMultistep=!this._showMultistep:(this._dispatchCustomEvent("sustainability-carbon-footprint-offset-send-error-digital-card-analytic"),this._showDigitalCardAlert=!this._showDigitalCardAlert)}_toggleSuccesModalVisibility(){this._showSuccessModal=!this._showSuccessModal}pubKeyGeneratedSuccess(t){this._pubKey=t.toUpperCase(),this._featureScfoDm._requestCvv(this._pubKey)}cvvDecypherSuccess(t){this._cvvGenerated=t.slice(2,5)}get _panelInfo(){return t`
      <bbva-clip-microillustration
        ambient="primary"
        class="full-padding-segment"
        microillustration="flowerbuds"
        size="M"
        ?loading="${this._isDataLoading}"
      >
      </bbva-clip-microillustration>
      <bbva-type-text
        ambient="primary"
        class="content-forest__padding"
        size="3XL"
        font-weight="700"
        tag="span"
        text="${this.t("sustainability-carbon-footprint-offset-welcome-message",{name:this._customerName})}"
        ?loading="${this._isDataLoading}"
      ></bbva-type-text>
      <bbva-type-text
        ambient="primary"
        ?loading="${this._isDataLoading}"
        class="content-forest__padding"
        text="${this.t("sustainability-carbon-footprint-offset-endorsed-initiatives")}"
        size="S"
      >
      </bbva-type-text>
      <bbva-type-link
        ambient="primary"
        aria-label="${this.t("sustainability-carbon-footprint-offset-how-to-contribute")}"
        ?loading="${this._isDataLoading}"
        class="content-forest__padding"
        size="S"
        @click="${()=>{this._openInformativeModal([this.t("sustainability-carbon-footprint-offset-modal-how-to-aport-text-one"),this.t("sustainability-carbon-footprint-offset-modal-how-to-aport-text-two")],this.t("sustainability-carbon-footprint-offset-how-to-contribute"))}}"
        >${this.t("sustainability-carbon-footprint-offset-how-to-contribute")}</bbva-type-link
      >
    `}get _currentProjects(){return t`
      <sustainability-carbon-footprint-offset-projects
        ?show-projects="${this._showProjects}"
        .forestryProjects="${this._forestryProjects}"
        @transition-container-close="${this._displayProjects}"
      >
      </sustainability-carbon-footprint-offset-projects>
    `}get _modalProject(){return t`
      <sustainability-carbon-footprint-offset-project-detail-page
        ?show-detail="${this._showDetail}"
        .projectDetail="${this._selectedProject}"
        class="transition-project-detail"
        @sustainability-carbon-footprint-offset-project-detail-page-return="${this._showProjectDetail}"
      >
      </sustainability-carbon-footprint-offset-project-detail-page>
    `}get _modalFaqs(){return t`
      <sustainability-carbon-footprint-offset-faqs
        ?native=${this.native}
        ?ios-fixed-header=${this.iOSFixedHeader}
        ?visible=${this._faqsVisible}
        aem-host="${this.aemHost}"
        content-fragment-path="${this.contentFragmentPath}"
        ?show-help-faqs="${this.showHelpFaqs}"
        @sustainability-carbon-footprint-offset-faqs-modal-close=${this._showModalFaqs}
      >
      </sustainability-carbon-footprint-offset-faqs>
    `}get _informativeModal(){return t`
      <sustainability-carbon-footprint-offset-modal-informative
        .informativeModalText=${this._informativeModalText}
        ?open-informative-modal=${this._isInformativeModalOpen}
        header-content-modal-informative="${this._informativeModalHeader}"
        @sustainability-carbon-footprint-offset-modal-informative-close="${({detail:t})=>{this._isInformativeModalOpen=t}}"
      >
      </sustainability-carbon-footprint-offset-modal-informative>
    `}_openInformativeModal(t,e){this._informativeModalText=t,this._informativeModalHeader=e,this._isInformativeModalOpen=!0}get _contributionSegment(){return t`
      <div class="full-padding-segment">
        <bbva-type-text
          ambient="primary"
          tag="span"
          text="${this.t("sustainability-carbon-footprint-offset-total-contribution")}"
          size="S"
          ?loading="${this._isDataLoading}"
        ></bbva-type-text>
        <bbva-type-amount
          ambient="primary"
          amount="${this._contributionAmount}"
          currency-code="${this.currencyCode}"
          local-currency="${this.localCurrency}"
          language="${this.language}"
          type="bold"
          variant="3xl"
          ?loading="${this._isDataLoading}"
        >
        </bbva-type-amount>
        <bbva-notification-message
          ambient="primary"
          ?loading="${this._isDataLoading}"
          variant="sustainability"
          message-title="${this.t("sustainability-carbon-footprint-offset-equivalence-message",{equivalence:this._contributionEquivalence})}"
          book-title
          size="XS"
          message="${this.t("sustainability-carbon-footprint-offset-step-aportation-sustainable-message-source")}"
        ></bbva-notification-message>
      </div>
      ${this._contributionAllowed?c:this._thankYouMessage}
    `}get _showingInterestMessage(){return t`
      <div class="interest-message">
        <bbva-type-text
          ambient="primary"
          ?loading="${this._isDataLoading}"
          class="thank-you-spacing"
          tag="span"
          text=${this.t("sustainability-carbon-footprint-offset-thank-for-having-interest")}
          size="XL"
          font-weight="500"
        >
        </bbva-type-text>
        <bbva-type-text
          ambient="primary"
          ?loading="${this._isDataLoading}"
          class="content-forest__padding"
          tag="span"
          text=${this.t("sustainability-carbon-footprint-offset-more-options-to-footprint")}
          size="M"
          font-weight="100"
        >
        </bbva-type-text>
        <bbva-type-link
          ambient="primary"
          aria-label="${this.t("sustainability-carbon-footprint-offset-know-more")}"
          ?loading="${this._isDataLoading}"
          class="full-padding-segment"
          size="S"
          @click="${()=>{this._openInformativeModal([this.t("sustainability-carbon-footprint-offset-modal-know-more-data-to-calculate"),this.t("sustainability-carbon-footprint-offset-modal-know-more-contribution-amounts")],this.t("sustainability-carbon-footprint-offset-why-cant-i-contribute"))}}"
          >${this.t("sustainability-carbon-footprint-offset-know-more")}
        </bbva-type-link>
      </div>
    `}get _thankYouMessage(){return t`
      <bbva-type-text
        ambient="primary"
        ?loading="${this._isDataLoading}"
        class="thank-you-spacing"
        tag="span"
        text="${this.t("sustainability-carbon-footprint-offset-thank-you-message")}"
        size="XL"
        font-weight="500"
      >
      </bbva-type-text>
      <bbva-type-text
        ambient="primary"
        ?loading="${this._isDataLoading}"
        class="content-forest__padding"
        tag="span"
        text="${this.t("sustainability-carbon-footprint-offset-keep-helping-actions")}"
        size="M"
        font-weight="100"
      >
      </bbva-type-text>
      <bbva-type-link
        ambient="primary"
        ?loading="${this._isDataLoading}"
        class="full-padding-segment"
        size="S"
        @click="${()=>{this._openInformativeModal([this.t("sustainability-carbon-footprint-offset-modal-know-more-after-your-contribution"),this.t("sustainability-carbon-footprint-offset-modal-know-more-contribution-amounts")],this.t("sustainability-carbon-footprint-offset-why-cant-i-contribute"))}}"
        >${this.t("sustainability-carbon-footprint-offset-know-more")}
      </bbva-type-link>
    `}get _projectsSegment(){return t`
      <bbva-header-category
        ambient="primary"
        heading-level="2"
        ?loading="${this._isDataLoading}"
        class="content-forest__padding"
        option-link="${this._forestryProjects.length>1?this.t("sustainability-carbon-footprint-offset-see-more-projects"):""}"
        @click="${()=>{this._dispatchCustomEvent("sustainability-carbon-footprint-offset-send-project-list-analytic"),this._displayProjects()}}"
        text="${this.t("sustainability-carbon-footprint-offset-get-to-know-the-projects")}"
      >
      </bbva-header-category>
      ${this._projectsLoaded?this._renderProjects:this._errorMessageProjects}
    `}get _renderProjects(){return 1===this._forestryProjects.length?this._singleProjectCard:this._forestryProjects.length>1?this._carouselDefault:c}get _singleProjectCard(){var e,i,s,a,o;return t`
      <sustainability-carbon-footprint-offset-project-card
        ?loading="${this.loading}"
        project-id="${null===(e=this._forestryProjects)||void 0===e?void 0:e[0].id}"
        project-title="${null===(i=this._forestryProjects)||void 0===i?void 0:i[0].name}"
        project-description="${null===(s=this._forestryProjects)||void 0===s?void 0:s[0].summary}"
        project-image="${null===(a=this._forestryProjects)||void 0===a?void 0:a[0].image.url}"
        project-location="${null===(o=this._forestryProjects)||void 0===o?void 0:o[0].location}"
        @sustainability-carbon-footprint-offset-project-card-project-clicked="${()=>{var t;this._setSelectedProject(null===(t=this._forestryProjects)||void 0===t?void 0:t[0].id),this._showProjectDetail(),this._dispatchCustomEvent("sustainability-carbon-footprint-offset-send-project-detail-analytic")}}"
      ></sustainability-carbon-footprint-offset-project-card>
    `}_handleRetryClick(){this._retryCount+=1,this._retryCount>=3&&(this._showErrorMessage=!1,this._showTryItLater=!0)}_handleRetryForestryProjects(){this._retryCount+=1,this._featureScfoDm._getForestryProjects(),this._retryCount>=3&&(this._showErrorMessage=!1,this._showTryItLater=!0)}get _errorMessageProjects(){return t`
      ${this._showErrorMessage?t`
            <div id="error-message">
              <bbva-notification-message
                ambient="primary"
                ?loading="${this._isDataLoading}"
                class="full-padding-segment"
                variant="error"
                size="XS"
                book-title
                message-title="${this.t("sustainability-carbon-footprint-offset-error-with-data")}"
                link-title="${this.t("sustainability-carbon-footprint-offset-retry")}"
                @click="${this._handleRetryForestryProjects}"
              >
              </bbva-notification-message>
            </div>
          `:c}
      ${this._showTryItLater?t`
            <div id="error-message">
              <bbva-notification-message
                ambient="primary"
                ?loading="${this._isDataLoading}"
                class="full-padding-segment"
                variant="error"
                size="XS"
                book-title
                message-title="${this.t("sustainability-carbon-footprint-offset-error-with-data-without-response")}"
              >
              </bbva-notification-message>
            </div>
          `:""}
    `}_setSelectedProject(t){this._selectedProject=this._forestryProjects.find((e=>e.id===t))}get _carouselDefault(){return t`
      <sustainability-carbon-footprint-offset-carousel
        ?loading="${this._isDataLoading}"
        .forestryProjects="${this._forestryProjects}"
        @sustainability-carbon-footprint-offset-project-card-project-clicked="${({detail:t})=>{this._dispatchCustomEvent("sustainability-carbon-footprint-offset-send-project-detail-analytic"),this._setSelectedProject(t),this._showProjectDetail()}}"
      >
      </sustainability-carbon-footprint-offset-carousel>
    `}get _processMessage(){return t`
      <bbva-notification-message
        ambient="primary"
        ?loading="${this._isDataLoading}"
        class="full-padding-segment"
        variant="default"
        message-title="${this.t("sustainability-carbon-footprint-offset-responsability-message")}"
        book-title
        size="XS"
      >
      </bbva-notification-message>
    `}get _buttonDefault(){return t`
      <div class="panel-button">
        <bbva-button-default
          ambient="primary"
          ?disabled="${!this._validateButton}"
          fullwidth
          text="${this.t("sustainability-carbon-footprint-offset-contribute-to-forestry-projects")}"
          variant="primary"
          @click="${()=>{this._dispatchCustomEvent("sustainability-carbon-footprint-offset-contribute-to-forestry-projects-click-analytic"),this._dispatchCustomEvent("sustainability-carbon-footprint-offset-select-project-analytic"),this._showAportMultistep()}}"
        >
        </bbva-button-default>
      </div>
    `}get _validateButton(){return this._contributionAllowed&&this.footprintValue>=this._minimunCarbonFootprint&&this._remainingCarbonFootprintContributions>0&&this._forestryProjects.length>0}get _multistep(){return t`
      <sustainability-carbon-footprint-offset-multistep
        ?show-error-payment="${this._showModalError}"
        ?show-multistep=${this._showMultistep}
        .forestryProjects="${this._forestryProjects}"
        .listCards=${this._listCards}
        commission=${this.commission}
        currency-code="${this.currencyCode}"
        language="${this.language}"
        local-currency="${this.localCurrency}"
        rewards-conversion-factor=${this.rewardsConversionFactor}
        selected-contribution=${this._selectedContribution}
        remaining-carbon-footprint-contributions=${this._remainingCarbonFootprintContributions}
        @sustainability-carbon-footprint-offset-multistep-card-selected="${({detail:t})=>{this._cardSelected=t}}"
        @sustainability-carbon-footprint-offset-multistep-close="${this._showAportMultistep}"
        @sustainability-carbon-footprint-offset-multistep-project-and-credit="${({detail:t})=>{this._selectedProjectAndCredit=t}}"
        @sustainability-carbon-footprint-offset-multistep-request-payment-process="${({detail:t})=>{this._isPaymentWithPoints=t.isPaymentWithPoints,this._showAportMultistep(),this._featureScfoDm._generatePubKeys()}}"
      >
      </sustainability-carbon-footprint-offset-multistep>
    `}otpFirstStep(){this._dispatchCustomEvent("sustainability-carbon-footprint-offset-send-app-step-analytic",{step:"5"}),this.clearLoader()}get _modalSuccess(){return t`
      <sustainability-carbon-footprint-offset-modal-success-payment
        ?visible=${this._showSuccessModal}
        .dataPayment="${this._bodyResponsePayment}"
        currency-code="${this.currencyCode}"
        language="${this.language}"
        local-currency="${this.localCurrency}"
        @sustainability-carbon-footprint-offset-modal-success-payment-share-button="${()=>this._featureScfoDm._generateReceipt()}"
        @sustainability-carbon-footprint-offset-modal-success-payment-close="${()=>{this._featureScfoDm._getContibutionBalances(),this._multistepSelector.resetMultistep(),this.showLoader(),this._toggleSuccesModalVisibility()}}"
      >
      </sustainability-carbon-footprint-offset-modal-success-payment>
    `}get _showNoDigitalCardModal(){return t`<sustainability-carbon-footprint-offset-digital-card-alert
      ?show-digital-card-alert=${this._showDigitalCardAlert}
      @sustainability-carbon-footprint-offset-digital-card-alert-close-modal="${()=>{this._showDigitalCardAlert=!1}}"
    >
    </sustainability-carbon-footprint-offset-digital-card-alert>`}get _headerMain(){return t`
      <bbva-header-main
        ambient="primary"
        variant="first-level-sequential"
        text="${this.t("sustainability-carbon-footprint-offset-forestry-projects")}"
        show-left-icon
        left-icon-label="${this.t("sustainability-carbon-footprint-offset-go-back")}"
        .buttons=${this._headerButtons}
        @header-main-icon-click="${this._manageHeaderMainClicks}"
      ></bbva-header-main>
    `}_manageHeaderMainClicks({detail:t}){({0:()=>this._dispatchCustomEvent(`${pe.is}-go-back`),1:()=>this._showModalFaqs()}[null==t?void 0:t.index]||(()=>{}))()}get _forestTemplate(){return t`
      ${this._headerMain} ${this._panelInfo}
      ${this._contributionAmount>0&&this._contributionEquivalence>0&&this.footprintValue>=this._minimunCarbonFootprint?this._contributionSegment:c}
      ${this.footprintValue<this._minimunCarbonFootprint?this._showingInterestMessage:c}
      ${this._projectsSegment} ${this._processMessage} ${this._buttonDefault} ${this._modalProject}
      ${this._currentProjects} ${this._informativeModal} ${this._modalFaqs} ${this._multistep}
    `}render(){return t`
      ${super.render()}
      <div class="content-forest">${this._forestTemplate}</div>
      ${this._getsDms} ${this._modalSuccess} ${this._showNoDigitalCardModal}
      ${this._modalErrorServices}
    `}}customElements.define(pe.is,pe);const he=m((t=>class extends t{static get properties(){return{config:{type:Object},data:{type:Object},appStartedText:{type:String},stringNormalizeExceptions:{type:Array},dynamicMethodsName:{type:Array},dependsOnAppStartedLaunched:{type:Boolean},_isAppStartedLaunched:{type:Boolean}}}constructor(){super(),this.config={items:{},buttons:{continue:""},steps:{}},this.data={},this.appStartedText="app started:",this.stringNormalizeExceptions=["paymentCurrency","currency","operationNumber"],this.dynamicMethodsName=[],this.dependsOnAppStartedLaunched=!1,this._isAppStartedLaunched=!1}persistData(t){Object.assign(this.data,t)}buildDynamicMethods(){this.dynamicMethodsName.forEach((t=>{this[t]=()=>this._dispatch(`analytics-${this._camelToKebabCase(t)}`,this.data)}))}_camelToKebabCase(t){return t.replace(/[A-Z]/g,(t=>`-${t.toLowerCase()}`))}persistDataString(t){Object.assign(this.data,this.parseDataToString(t))}_toStringProcess(t,e){const i=t.toString();return this.stringNormalizeExceptions.includes(e)?i:this._normalizeStr(i)}_normalizeStr(t){let e=t;if("string"==typeof t){const i="ÁÃÀÄÂÉËÈÊÍÏÌÎÓÖÒÔÚÜÙÛÇáãàäâéëèêíïìîóöòôúüùûç",s="AAAAAEEEEIIIIOOOOUUUUCaaaaaeeeeiiiioooouuuuc",a=new RegExp(`[${i}]`,"ug");e=t.replace(a,(t=>s.charAt(i.indexOf(t)))).toLowerCase()}return e}parseDataToString(t,e){if(!t)return t;switch(typeof t){case"string":case"boolean":case"number":return this._toStringProcess(t,e);case"object":if(Array.isArray(t))return t.map((t=>this.parseDataToString(t)));const i={...t};return Object.keys(i).forEach((e=>{i[e]=this.parseDataToString(t[e],e)})),i;case"function":return this.parseDataToString(t());default:return t.toString()}}firePersistedData(t){this.persistData(t),this._dispatch("analytics-persisted-data",this.data)}fireNormalizedPersistedData(t){let e=t;"string"==typeof e&&(e=this.normalizeString(e)),"object"==typeof e&&Object.keys(e).forEach((t=>{e[t]=this.normalizeString(e[t])})),this.firePersistedData(e)}resetData(){this.data={},this._isAppStartedLaunched=!1}firePageVisit(){this._dispatch("analytics-page-visit",this.data),this._isAppStartedLaunched=!1}firePageView(t){this._dispatch("analytics-page-view"+(t?`-${t}`:""))}fireModal(){this._dispatch("analytics-modal")}fireModalWithData(){this._dispatch("analytics-modal",this.data)}fireInternalLink(t){this._dispatch("analytics-internal-link",t)}fireInternalLinkCard(t){this._dispatch("analytics-internal-link-card",t)}fireExternalLink(){this._dispatch("analytics-external-link")}fireItemAppStarted(t){if(!this._isAppStartedLaunched){const e=(null==t?void 0:t.id)||t,i=this._getTextConfig(e,"items");i&&(this.fireAppStarted(i),this._isAppStartedLaunched=this.dependsOnAppStartedLaunched)}}fireAppOnClickStart(){this._dispatch("analytics-app-on-click-start",this.data)}fireAppStarted(t){this.persistData({detail:`${this.appStartedText}${t}`}),this._dispatch("analytics-app-started",this.data)}fireAdvancedMark(){this._dispatch("analytics-advanced-mark",this.data)}fireAppCompleted(){this._dispatch("analytics-app-completed",this.data),this.resetData()}fireFrequentAppCompleted(){this._dispatch("analytics-frequent-app-completed",this.data),this.resetData()}normalizeString(t){return t.toLowerCase().normalize("NFD").replace(/[^a-zA-Z0-9 ]/g,"")}_getTextConfig(t,e){var i,s;return null===(i=this.config)||void 0===i||null===(s=i[e])||void 0===s?void 0:s[t]}getPathValue(t,e){return e.split(".").reduce(((t,e)=>t[e]),t)}_dispatch(t,e){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}}));class ue extends(he(s)){static get is(){return"bbva-analyticmanager-sustainability-carbon-footprint-offset"}analyticAppStep(t){const e={2:()=>this._dispatch(`${ue.is}-analytics-app-step-aportation`),3:()=>this._dispatch(`${ue.is}-analytics-app-step-payment-method`),4:()=>{this.persistData({typology:JSON.stringify(t.typology),productSubtype:t.productSubtype,productName:"",amount:JSON.stringify(t.amount),paymentAmount:JSON.stringify(t.paymentAmount),paymentType:t.paymentType,serviceCharge:JSON.stringify(t.serviceCharge)}),this._dispatch(`${ue.is}-analytics-app-step-summary`,this.data)},5:()=>this._dispatch(`${ue.is}-analytics-app-step-otp`,this.data)};e[t.step]&&e[t.step]()}analyticAppCompleted(t){this.persistData({operationNumber:t.operationNumber}),this._dispatch(`${ue.is}-analytics-app-completed`,this.data)}}customElements.define(ue.is,ue);class be extends(tt(s)){static get is(){return"bbva-nativeconnector-cipher"}static get properties(){return{isNative:{type:Boolean},pluginName:{type:String},mocks:{type:Object}}}constructor(){super(),this.pluginName="Cipher",this.isNative=!1}rsaKeyPair(t){this._genericCall(this.pluginName,"rsakeypair","rsa-key-pair-success",t,"rsa-key-pair-error")}rsaEncrypt(t){this._genericCall(this.pluginName,"rsaencrypt","rsa-encrypt-success",t,"rsa-encrypt-error")}rsaDecrypt(t){this._genericCall(this.pluginName,"rsadecrypt","rsa-decrypt-success",t,"rsa-decrypt-error")}generateKeyPair(){this._genericCall(this.pluginName,"pincipherpublickeymodulus","pin-cipher-public-key-modulus-success",{},"pin-cipher-public-key-modulus-error")}pinCipherEncrypt(t){this._genericCall(this.pluginName,"pincipherencrypt","pin-cipher-encrypt-success",t,"pin-cipher-encrypt-error")}pinCipherDecrypt(t){this._genericCall(this.pluginName,"pincipherdecrypt","pin-cipher-decrypt-success",t,"pin-cipher-decrypt-error")}pinCipherEncryptFromConfig(t){const e="pincipherencryptfromconfig",i="pin-cipher-encrypt-from-config-success",s="pin-cipher-encrypt-from-config-error";return this.isNative?this._genericCall(this.pluginName,e,i,t,s):new Promise(((t,a)=>{if(this.mocks&&this.mocks[e]){const s=this.mocks[e];this.__fire(i,s),t(s)}else{const t={message:`Mock method [${e}] response is not defined`,code:-2};this.__fire(s,t),a(t)}}))}}customElements.define(be.is,be);
