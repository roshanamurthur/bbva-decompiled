import{z as e,an as t,L as i,ak as r,h as s,aY as a,i as n,ck as o,aU as d,H as m,W as l,eD as c,aN as b,eE as h,eF as g,eG as u,eH as p}from"./952f98a9.js";import{ey as y,a8 as v,v as w,L as f,M as _,H as $,af as S,G as E,a6 as x,z as k,ae as C,D,a5 as T,K as R,N as I,R as L,S as P,Q as F,a2 as H,a1 as O,I as V,E as A,x as B,f as z,T as j,V as M,a4 as q,a3 as G,au as K,av as N,j as U,t as W,e as X,ah as Y}from"./216055dc.js";import{B as J,b as Q}from"./6b902eda.js";import{B as Z,b as ee}from"./2b04e291.js";import{aH as te,aI as ie}from"./7f3d7ca9.js";import{B as re}from"./c0a2f832.js";import{B as se}from"./459fa8f1.js";import"./28fb68d0.js";import{B as ae}from"./c6d24711.js";import"./cae0f1de.js";class ne extends y{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`loyalty/v${this.version}/promotions`)}toString(){return super.toString("BGADPLoyaltyPromotionsGetV1")}}class oe extends y{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`loyalty/v${this.version}/promotions/{promotion-id}/summaries`)}toString(){return super.toString("BGADPLoyaltyPromotionsPromotionSummariesGetV1")}}class de extends v{static get is(){return"bbva-global-promotions-api-dm"}static get properties(){return{promotions:{type:Array,attribute:!1}}}constructor(){super(),this.promotions=[]}resetPromotions(){this.promotions=[]}getPromotions(e={}){if(Object.keys(this.promotions).length)return;this._generateGetService(this._getService("get",{},e),{customEvent:"promotions-api-dm-fetch",paginationEvent:"promotions-api-dm-pagination",errorFireEventHandler:"promotions-api-dm-fetch-error"},this._responseMapping,e.fields,this._paginationMapping)}_getService(e,t={},i={}){const r=this._getServiceParams(i,t);return this._getServicePath(`${e}Promotions`,this._getBgadp(r))}_getBgadp(e){return{getPromotionsV1:()=>new ne(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}_paginationMapping(e){return e}}class me extends v{static get is(){return"bbva-global-promotion-summaries-api-dm"}static get properties(){return{promotionSummaries:{type:Array,attribute:!1}}}constructor(){super(),this.promotionSummaries=[]}resetPromotionSummaries(){this.promotionSummaries=[]}getPromotionSummaries(e,t={}){if(Object.keys(this.promotionSummaries).length)return;t=Object.assign({"promotion-id":e},t),this._generateGetService(this._getService("get",{},t),{customEvent:"promotion-summaries-api-dm-fetch",errorFireEventHandler:"promotion-summaries-api-dm-fetch-error"},this._responseMapping,t.fields)}_getService(e,t={},i={}){const r=this._getServiceParams(i,t);return this._getServicePath(`${e}PromotionSummaries`,this._getBgadp(r))}_getBgadp(e){return{getPromotionSummariesV1:()=>new oe(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}var le=e`
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

  .card-detail {
    padding: 1rem;
  }
  .card-detail__description {
    margin-top: 0.5rem;
  }
  .card-detail__badge {
    margin-top: 0.5rem;
  }
  .card-detail__cta {
    margin-top: 1rem;
  }
`;class ce extends(t(w(f(_(i))))){static get is(){return"rewards-member-get-member-panel-offer"}static get scopedElements(){const e=[$,S,E,x,...ce.configurationScopedElements()];return ce.scopedElementsFromClasses(e)}static get properties(){return{id:{type:String},imageSrc:{type:String,attribute:"image-src"},title:{type:String},titleSize:{type:String,attribute:"title-size"},titleFontWeight:{type:String,attribute:"title-font-weight"},description:{type:String},bagdeText:{type:String,attribute:"bagde-text"},linkText:{type:String,attribute:"link-text"},loading:{type:Boolean}}}constructor(){super(),this.reset()}static get styles(){return[le,k.primaryAlt,C.primary,C.primaryAlt,D.primary,D.primaryAlt,T.primary,T.primaryAlt,r("rewards-member-get-member-panel-offer-shared-styles")]}reset(){this.id="",this.imageSrc="",this.title="",this.titleSize="XL",this.titleFontWeight="500",this.description="",this.bagdeText="",this.linkText="",this.loading=!1}_onClick(){const{id:e}=this;this.dispatchEvent(new CustomEvent("rewards-member-get-member-panel-offer-click",{detail:{id:e},bubbles:!1,composed:!1}))}render(){return s`
      <bbva-banner-image
        size="L"
        ambient="${this.ambient}"
        image-src="${this.imageSrc}"
        ?loading="${this.loading}"
      >
      </bbva-banner-image>

      <div class="card-detail">
        <bbva-type-text
          class="card-detail__title"
          inherit=""
          ?loading="${this.loading}"
          ambient="${this.ambient}"
          size="${this.titleSize}"
          font-weight="${this.titleFontWeight}"
          text="${this.title}"
        >
        </bbva-type-text>

        <bbva-type-text
          class="card-detail__description"
          inherit=""
          ?loading="${this.loading}"
          ambient="${this.ambient}"
          text="${this.description}"
          size="S"
        >
        </bbva-type-text>

        ${this.bagdeText?s`
              <bbva-badge-default
                class="card-detail__badge"
                ?loading="${this.loading}"
                ambient="${this.ambient}"
                text="${this.bagdeText}"
              >
              </bbva-badge-default>
            `:""}
        ${this.linkText?s`
              <bbva-type-link
                class="card-detail__cta"
                ?loading="${this.loading}"
                @click="${this._onClick}"
              >
                ${this.linkText}
              </bbva-type-link>
            `:""}
      </div>
    `}}var be=e`
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

  .panel-info-container {
    padding: 1rem 1rem 0 1rem;
  }

  .microillustration {
    padding-bottom: 1rem;
  }

  .type-text-container {
    margin-bottom: 0.5rem;
  }
`;class he extends(t(w(f(_(i))))){static get is(){return"rewards-member-get-member-panel-info"}static get scopedElements(){const e=[E,R,...he.configurationScopedElements()];return he.scopedElementsFromClasses(e)}static get properties(){return{microillustration:{type:String},title:{type:String},description:{type:String},loading:{type:Boolean}}}constructor(){super(),this.reset()}static get styles(){return[be,D.primary,I.primary,r("rewards-member-get-member-panel-info-shared-styles")]}reset(){this.microillustration="",this.title="",this.description="",this.loading=!1}render(){return s`
      <div class="panel-info-container">
        <bbva-clip-microillustration
          class="microillustration"
          ambient="${this.ambient}"
          ?loading="${this.loading}"
          size="M"
          microillustration="${this.microillustration}"
        >
        </bbva-clip-microillustration>
        <bbva-type-text
          class="type-text-container"
          size="3XL"
          font-weight="${a.fontWeight50}"
          inherit
          ambient="${this.ambient}"
          ?loading="${this.loading}"
          text="${this.title}"
        >
        </bbva-type-text>
        <bbva-type-text
          size="S"
          font-weight="350"
          inherit
          ambient="${this.ambient}"
          ?loading="${this.loading}"
          text="${this.description}"
        >
        </bbva-type-text>
      </div>
    `}}var ge=e`
  :host {
    --_rewards-member-get-member-panel-offer-bg-color: var(
      --rewards-member-get-member-panel-offer--_ambient--default-bg-color,
      var(
        --rewards-member-get-member-panel-offer--custom--primary-alt-ambient--default-bg-color,
        ${L("colorPrimaryAltSurfaceAmbientDefault",P)}
      )
    );
  }
`,ue=e`
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

  [data-tag-name='rewards-member-get-member-panel-offer'] {
    background-color: var(--_rewards-member-get-member-panel-offer-bg-color);
  }

  .panel-offer,
  .error-message {
    margin: 1rem;
  }

  [data-tag-name='bbva-notification-message'] {
    padding-right: 2rem;
  }
`;class pe extends(t(w(f(_(i))))){static get is(){return"rewards-member-get-member-dynamics"}static get scopedElements(){const e=[ce,he,F,...pe.configurationScopedElements()];return pe.scopedElementsFromClasses(e)}static get properties(){return{aemHost:{type:String,attribute:"aem-host"},dynamics:{type:Array},offerViewIds:{type:Array,attribute:"offer-view-ids"},visible:{type:Boolean},loadError:{type:Boolean,attribute:"load-error"},maxLoadRetriesReached:{type:Boolean,attribute:"max-load-retries-reached"},flagsLoaded:{type:Boolean,attribute:"flags-loaded"}}}constructor(){super(),this.aemHost="",this.flagsLoaded=!1,this.reset()}static get styles(){return[ue,ge,r("rewards-member-get-member-dynamics-shared-styles")]}get isLoading(){return!this.dynamics&&!this.loadError}updated(e){super.updated(e),(e.has("visible")||e.has("dynamics")||e.has("flagsLoaded")||e.has("loadError"))&&this.visible&&this.flagsLoaded&&!this.dynamics&&!this.loadError&&this._getDynamics()}reset(){this.dynamics=void 0,this.offerViewIds=[],this.visible=!1,this.loadError=!1,this.maxLoadRetriesReached=!1}get loadingTemplate(){return s`
      <rewards-member-get-member-panel-offer class="panel-offer" loading ambient="${this.ambient}">
      </rewards-member-get-member-panel-offer>
      <rewards-member-get-member-panel-offer class="panel-offer" loading ambient="${this.ambient}">
      </rewards-member-get-member-panel-offer>
    `}get emptyTemplate(){return s`
      <rewards-member-get-member-panel-info
        ambient="${this.ambient}"
        ?loading="${this.isLoading}"
        microillustration="emptystateday"
        description="${this.t("rewards-member-get-member-dynamics-empty-dynamics")}"
      ></rewards-member-get-member-panel-info>
    `}get loadErrorTemplate(){const e=this.maxLoadRetriesReached?this.t("rewards-member-get-member-dynamics-max-load-retries-reached-text"):this.t("rewards-member-get-member-dynamics-error-loading-text"),t=this.maxLoadRetriesReached?void 0:this.t("rewards-member-get-member-dynamics-error-loading-link-text");return s`
      <bbva-notification-message
        class="error-message"
        message-title="${e}"
        book-title=""
        variant="error"
        link-title="${n(t)}"
        @notification-message-link-click="${this._retryGetDynamics}"
      ></bbva-notification-message>
    `}_getDynamicsTemplate(e,t,i){let r;return r=i||i&&this.maxLoadRetriesReached?this.loadErrorTemplate:e.length?this._getDynamicsListTemplate(e,t):this.emptyTemplate,r}_getDynamicsListTemplate(e,t){return s`
      ${e.map((e=>{var i;const{offer:r={},aemData:a={}}=e,{id:o}=r,d=`${t}${a.mgmofferdetail.elements.imageUrl.value}`,m=a.mgmofferdetail.elements.shortTitle.value,l=a.mgmofferdetail.elements.shortDescription.value,c=null===(i=r.product)||void 0===i?void 0:i.id,b=this.offerViewIds.includes(c)?"":this.t("rewards-member-get-member-dynamics-status");return s`
          <rewards-member-get-member-panel-offer
            class="panel-offer"
            id="${o}"
            product-id="${c}"
            image-src="${d}"
            ambient="${this.ambient}"
            title="${m}"
            description="${l}"
            bagde-text="${n(b)}"
            link-text="${this.t("rewards-member-get-member-dynamics-link-text")}"
            @rewards-member-get-member-panel-offer-click="${e=>this._onClickPanelOffer({...e.detail,productId:c})}"
          >
          </rewards-member-get-member-panel-offer>
        `}))}
    `}_retryGetDynamics(){this.loadError=!1}_getDynamics(){this.dispatchEvent(new CustomEvent("rewards-member-get-member-dynamics-dynamics-get",{bubbles:!0,composed:!0}))}_onClickPanelOffer(e){this.dispatchEvent(new CustomEvent("rewards-member-get-member-dynamics-dynamic-click",{detail:e,bubbles:!0,composed:!0}))}render(){return s`
      ${this.isLoading?this.loadingTemplate:this._getDynamicsTemplate(this.dynamics,this.aemHost,this.loadError,this.maxLoadRetriesReached)}
    `}}var ye=e`
  :host {
    display: block;
    box-sizing: border-box;
    padding: 1rem;
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

  .align-list-default-header {
    display: flex;
    justify-content: space-between;
  }

  .align-item {
    display: flex;
    align-items: center;
    justify-content: space-between;
    margin-top: 0.5rem;
  }

  .badge {
    margin-top: 0.5rem;
  }
`;class ve extends(t(w(f(_(i))))){static get is(){return"rewards-member-get-member-list-default"}static get scopedElements(){const e=[$,x,E,H,...ve.configurationScopedElements()];return ve.scopedElementsFromClasses(e)}static get properties(){return{id:{type:String},linkText:{type:String,attribute:"link-text"},badgeText:{type:String,attribute:"badge-text"},description:{type:Object},items:{type:Array},loading:{type:Boolean}}}constructor(){super(),this.reset()}static get styles(){return[ye,k.primary,k.primaryAlt,D.primary,O.primary,T.primary,r("rewards-member-get-member-list-default-shared-styles")]}reset(){this.id="",this.linkText="",this.badgeText="",this.loading=!1,this.description={},this.items=[]}_getItemsTemplate(e){return e.map((e=>s`
        <div class="align-item">
          <bbva-type-text
            inherit
            ?loading="${this.loading}"
            ambient="${this.ambient}"
            text="${e.key}"
            size="S"
          ></bbva-type-text>

          ${null!=e&&e.value?s`
                <bbva-type-amount
                  ?loading="${this.loading}"
                  ambient="${this.ambient}"
                  language="${this.language}"
                  variant="M"
                  bold
                  amount="${(null==e?void 0:e.value)||0}"
                  decimal-digits="0"
                  type="${n(null==e?void 0:e.type)}"
                  text="${n(null==e?void 0:e.text)}"
                  currency-code="${n(null==e?void 0:e.currency)}"
                  local-currency="${n(null==e?void 0:e.currency)}"
                >
                </bbva-type-amount>
              `:""}
        </div>
      `))}_getBadgeTemplate(e){return e?s`
          <bbva-badge-default
            class="badge"
            ?loading="${this.loading}"
            ambient="${this.ambient}"
            type="neutral"
            text="${e}"
          >
          </bbva-badge-default>
        `:""}_onClick(){const{id:e}=this;this.dispatchEvent(new CustomEvent("rewards-member-get-member-list-default-click",{detail:{id:e},bubbles:!1,composed:!1}))}render(){return s`
      <div class="align-list-default-header">
        <bbva-type-link ?loading="${this.loading}" @click="${this._onClick}">
          <bbva-type-text
            inherit
            ?loading="${this.loading}"
            ambient="${this.ambient}"
            variant="spotlight"
            text="${this.linkText}"
            size="L"
          ></bbva-type-text>
        </bbva-type-link>
        ${Object.keys(this.description).length>0?s`
              <bbva-type-amount
                ?loading="${this.loading}"
                ambient="${this.ambient}"
                language="${this.language}"
                amount="${this.description.amount}"
                text="${n(this.description.text)}"
                type="${n(this.description.type)}"
                decimal-digits="${n(this.description.decimalDigits)}"
                currency-code="${n(this.description.currency)}"
                local-currency="${n(this.description.currency)}"
              >
              </bbva-type-amount>
            `:""}
      </div>

      ${this._getItemsTemplate(this.items)} ${this._getBadgeTemplate(this.badgeText)}
    `}}const we=[{id:"btn-menu",icon:o(),accessibilityText:"rewards-member-get-member-header-menu-accessibility-text"}];function fe(e){return null==e?void 0:e.toLowerCase().replace(/_/g,"-")}var _e=e`
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

  .divider-container {
    padding: 0 1rem;
  }

  .error-message {
    margin: 1rem;
  }

  [data-tag-name='bbva-notification-message'] {
    padding-right: 2rem;
  }
`;class $e extends(t(w(f(_(i))))){static get is(){return"rewards-member-get-member-rewards"}static get scopedElements(){const e=[V,ve,he,F,...$e.configurationScopedElements()];return $e.scopedElementsFromClasses(e)}static get properties(){return{rewards:{type:Array},visible:{type:Boolean},loadError:{type:Boolean,attribute:"load-error"},maxLoadRetriesReached:{type:Boolean,attribute:"max-load-retries-reached"}}}constructor(){super(),this.reset()}static get styles(){return[_e,A.primary,r("rewards-member-get-member-rewards-shared-styles")]}get isLoading(){return!this.rewards&&!this.loadError}updated(e){super.updated(e),(e.has("visible")||e.has("rewards")||e.has("loadError"))&&this.visible&&!this.rewards&&!this.loadError&&this._getRewards()}reset(){this.rewards=void 0,this.visible=!1,this.loadError=!1,this.maxLoadRetriesReached=!1}get loadingTemplate(){const e=[{key:"",value:0},{key:"",value:0}];return s`
      <rewards-member-get-member-list-default loading ambient="${this.ambient}" .items="${e}">
      </rewards-member-get-member-list-default>
      <div class="divider-container">
        <bbva-divider-default ambient="${this.ambient}"></bbva-divider-default>
      </div>

      <rewards-member-get-member-list-default loading ambient="${this.ambient}" .items="${e}">
      </rewards-member-get-member-list-default>
    `}get emptyTemplate(){return s`
      <rewards-member-get-member-panel-info
        ?loading="${this.loading}"
        microillustration="emptystateday"
        description="${this.t("rewards-member-get-member-rewards-empty-rewards")}"
      ></rewards-member-get-member-panel-info>
    `}get loadErrorTemplate(){const e=this.maxLoadRetriesReached?this.t("rewards-member-get-member-rewards-max-load-retries-reached-text"):this.t("rewards-member-get-member-rewards-error-loading-text"),t=this.maxLoadRetriesReached?void 0:this.t("rewards-member-get-member-rewards-error-loading-link-text");return s`
      <bbva-notification-message
        class="error-message"
        message-title="${e}"
        book-title=""
        variant="error"
        link-title="${n(t)}"
        @notification-message-link-click="${this._retryGetRewards}"
      ></bbva-notification-message>
    `}_getRewardsTemplate(e,t,i){let r;return r=t||t&&i?this.loadErrorTemplate:e.length?this._getRewardsListTemplate(e):this.emptyTemplate,r}_getRewardsListTemplate(e){return s`
      ${e.map(((t,i)=>{const{promotion:r={},publicSetting:a={}}=t,{rewards:n}=r,o=fe(a.productType),d=this.t(`rewards-member-get-member-dynamic-detail-${o}-header-title`),m=this._getRewardsInformation(n,o);return s`
          <rewards-member-get-member-list-default
            id="${r.id}"
            language="${this.language}"
            ambient="${this.ambient}"
            link-text="${d}"
            .items="${m}"
            @rewards-member-get-member-list-default-click="${this._onClickListDefault}"
          >
          </rewards-member-get-member-list-default>

          ${i<e.length-1?s`
                <div class="divider-container">
                  <bbva-divider-default ambient="${this.ambient}"></bbva-divider-default>
                </div>
              `:""}
        `}))}
    `}_getRewardsInformation(e,t){var i,r;const s=this.t("rewards-member-get-member-dynamic-detail-total-reward"),{fullReward:a}=e[0],{subscription:n}=a;return[{key:this.t(`rewards-member-get-member-dynamic-detail-${t}-key`),value:null===(i=e[0])||void 0===i||null===(r=i.reason)||void 0===r?void 0:r.current,type:"points"},{key:s,...$e._subscriptionDetailsMap[n.subscriptionType](n)}]}static get _subscriptionDetailsMap(){return{CASH:e=>({value:e.amount,currency:e.currency}),POINTS:e=>({value:e.amount,type:"points"})}}_retryGetRewards(){this.loadError=!1}_getRewards(){this.dispatchEvent(new CustomEvent("rewards-member-get-member-rewards-rewards-get",{bubbles:!0,composed:!0}))}_onClickListDefault(e){const{detail:t}=e;this.dispatchEvent(new CustomEvent("rewards-member-get-member-rewards-reward-click",{detail:t,bubbles:!0,composed:!0}))}render(){return s`
      ${this.isLoading?this.loadingTemplate:this._getRewardsTemplate(this.rewards,this.loadError,this.maxLoadRetriesReached)}
    `}}var Se=e`
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
`;class Ee extends(t(w(f(_(i))))){static get is(){return"rewards-member-get-member-dynamics-and-rewards"}static get scopedElements(){const e=[J,pe,$e,...Ee.configurationScopedElements()];return Ee.scopedElementsFromClasses(e)}static get properties(){return{aemHost:{type:String,attribute:"aem-host"},dynamics:{type:Array},rewards:{type:Array},dynamicsLoadError:{type:Boolean,attribute:"dynamics-load-error"},rewardsLoadError:{type:Boolean,attribute:"rewards-load-error"},offerViewIds:{type:Array},maxLoadRetriesReached:{type:Boolean,attribute:"max-load-retries-reached"},tabSelected:{type:Number,attribute:"tab-selected"},flagsLoaded:{type:Boolean,attribute:"flags-loaded"}}}constructor(){super(),this.aemHost="",this.flagsLoaded=!1,this.reset()}static get styles(){return[Se,Q.primary,r("rewards-member-get-member-dynamics-and-rewards-shared-styles")]}reset(){this.tabSelected=0,this.dynamics=void 0,this.dynamicsLoadError=!1,this.rewards=void 0,this.rewardsLoadError=!1,this.offerViewIds=[],this.maxLoadRetriesReached=!1}firstUpdated(e){super.firstUpdated(e),this.dispatchEvent(new CustomEvent("rewards-member-get-member-dynamics-and-rewards-load",{bubbles:!0,composed:!0}))}_onTabDefaultTabChange(e){const{selectedIndex:t}=e.detail;this.tabSelected=t,this.dispatchEvent(new CustomEvent("rewards-member-get-member-dynamics-and-rewards-tab-change",{bubbles:!0,composed:!0,detail:{tabSelected:this.tabSelected}}))}get getTabDefaultOptions(){return[{title:this.t("rewards-member-get-member-dynamics-and-rewards-tab-label-dynamics")},{title:this.t("rewards-member-get-member-dynamics-and-rewards-tab-label-rewards")}]}render(){return s`
      <bbva-tab-default
        ambient="${this.ambient}"
        .options="${this.getTabDefaultOptions}"
        selected="${this.tabSelected}"
        accessibility-text="${this.t("rewards-member-get-member-dynamics-and-rewards-tab-text-accessibility")}"
        @tab-default-tab-change="${this._onTabDefaultTabChange}"
      >
        <div class="panel" role="tabpanel" id="content-0" aria-labelledby="tab-0">
          <rewards-member-get-member-dynamics
            aem-host="${this.aemHost}"
            ambient="${this.ambient}"
            ?flags-loaded="${this.flagsLoaded}"
            ?visible="${0===this.tabSelected}"
            ?load-error="${this.dynamicsLoadError}"
            ?max-load-retries-reached="${this.maxLoadRetriesReached}"
            .offerViewIds="${this.offerViewIds}"
            .dynamics="${this.dynamics}"
          >
          </rewards-member-get-member-dynamics>
        </div>
        <div class="panel" role="tabpanel" id="content-1" aria-labelledby="tab-1">
          <rewards-member-get-member-rewards
            ambient="${this.ambient}"
            language="${this.language}"
            ?visible="${1===this.tabSelected}"
            ?load-error="${this.rewardsLoadError}"
            ?max-load-retries-reached="${this.maxLoadRetriesReached}"
            .rewards="${this.rewards}"
          >
          </rewards-member-get-member-rewards>
        </div>
      </bbva-tab-default>
    `}}var xe=e`
  :host {
    --_type-link--with-icon-icon-color: var(
      --bbva-type-link--_ambient--with-icon-icon-color,
      var(
        --bbva-type-link--custom--primary-ambient--with-icon-icon-color,
        ${L("colorPrimaryLinkMainDefault",P)}
      )
    );
  }
`,ke=e`
  :host {
    display: block;
    box-sizing: border-box;
    padding: 1rem;
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

  [data-tag-name='bbva-type-icon'] {
    margin-right: 0.5rem;
    fill: var(--_type-link--with-icon-icon-color);
  }

  .list-file {
    margin: 0;
    padding: 0;
    text-align: start;
    height: auto;
  }
  .list-file__icon {
    display: inline-block;
    vertical-align: bottom;
  }
  .list-file__text {
    display: inline;
  }

  .file-text {
    padding: 0;
  }

  .file-size {
    margin-top: 0.5rem;
  }
`;class Ce extends(t(w(f(_(i))))){static get is(){return"rewards-member-get-member-list-file"}static get scopedElements(){const e=[B,E,z,...Ce.configurationScopedElements()];return Ce.scopedElementsFromClasses(e)}static get properties(){return{documentId:{type:String,attribute:"document-id"},text:{type:String},size:{type:String},loading:{type:Boolean}}}constructor(){super(),this.reset()}static get styles(){return[ke,xe,j.primary,D.primary,M.primary,r("rewards-member-get-member-list-file-shared-styles")]}reset(){this.documentId="",this.text="",this.size="",this.loading=!1}_onClick(){const{documentId:e}=this;this.dispatchEvent(new CustomEvent("rewards-member-get-member-list-file-click",{detail:{documentId:e},bubbles:!1,composed:!1}))}render(){return s`
      <bbva-button-default
        class="list-file"
        variant="link"
        size="L"
        ambient="${this.ambient}"
        ?loading="${this.loading}"
        @click=${this._onClick}
      >
        <bbva-type-icon
          class="list-file__icon"
          icon="${d()}"
          size="24"
          ambient="${this.ambient}"
          ?loading="${this.loading}"
        ></bbva-type-icon
        ><bbva-type-text
          class="list-file__text"
          inherit
          size="L"
          variant="spotlight"
          text="${this.text}"
          ambient="${this.ambient}"
          ?loading="${this.loading}"
        ></bbva-type-text>
      </bbva-button-default>

      <bbva-type-text
        inherit
        class="file-size"
        size="S"
        font-style="italic"
        text="${this.size}"
        ambient="${this.ambient}"
        ?loading="${this.loading}"
      >
      </bbva-type-text>
    `}}var De=e`
  :host {
    --_rewards-member-get-member-dynamic-detail-bg-color: var(
      --rewards-member-get-member-dynamic-detail--_ambient--default-bg-color,
      var(
        --rewards-member-get-member-dynamic-detail--custom--primary-alt-ambient--default-bg-color,
        ${L("colorPrimarySurfaceAmbientDefault",P)}
      )
    );
  }
`,Te=e`
  :host {
    display: block;
    box-sizing: border-box;
    background-color: var(--_rewards-member-get-member-dynamic-detail-bg-color);
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

  [data-tag-name='bbva-header-category'] {
    padding: 0.5rem 1rem 0 1rem;
  }

  .align-dynamic-detail-cta-container {
    padding: 0.5rem 1rem 1rem 1rem;
  }

  [data-tag-name='bbva-expandable-accordion'] {
    --bbva-expandable-accordion-header-padding: 16px;
    margin: 0 0 0.5rem;
  }

  .list-bullet-container {
    margin-bottom: 1.5rem;
  }

  .tips-container {
    margin: 0 1rem;
  }
  .tips-container__tip-two {
    margin-top: 1.5rem;
  }

  [data-tag-name='bbva-list-bullet'] {
    margin-left: 0.5rem;
  }

  [data-tag-name='bbva-notification-message'] {
    margin: 1.5rem 1rem 1rem 1rem;
  }
`;class Re extends(t(w(f(_(i))))){static get is(){return"rewards-member-get-member-dynamic-detail"}static get scopedElements(){const e=[z,q,ce,Ce,E,Z,te,F,...Re.configurationScopedElements()];return Re.scopedElementsFromClasses(e)}static get properties(){return{id:{type:String},dynamic:{type:Object},visible:{type:Boolean}}}constructor(){super(),this.reset()}static get styles(){return[Te,De,M.primary,G.primary,D.primary,ee.primary,ie.primary,r("rewards-member-get-member-dynamic-detail-shared-styles")]}get isLoading(){return 0===Object.keys(this.dynamic).length}updated(e){if(super.updated(e),(e.has("visible")||e.has("id"))&&this.visible&&this.id&&this._getDynamic(this.id),e.has("dynamic")&&Object.keys(this.dynamic).length>0&&!this.isLoading){const{offer:e={}}=this.dynamic,{product:t={}}=e,i=t.id;this.dispatchEvent(new CustomEvent("rewards-member-get-member-dynamic-detail-load",{bubbles:!0,composed:!0,detail:{productId:i}}))}}reset(){this.id="",this.dynamic={},this.visible=!1}_getDynamicsBullets(e){return e.length?s`
          <div class="list-bullet-container" role="list">
            ${e.map(((e,t)=>s`
                <bbva-list-bullet
                  ordered
                  value="${t+1}"
                  role="listitem"
                  ambient="${this.ambient}"
                >
                  ${e.elements.stepDescription.value}
                </bbva-list-bullet>
              `))}
          </div>
        `:""}_getExpandableAccordion(e,t){return e&&t?s`
          <bbva-expandable-accordion ambient="${this.ambient}" ?loading="${this.isLoading}">
            <div slot="header">
              <bbva-type-text
                size="S"
                font-weight="350"
                inherit
                ambient="${this.ambient}"
                ?loading="${this.isLoading}"
                text="${e}"
              >
              </bbva-type-text>
            </div>
            <div slot="content">
              <bbva-list-bullet
                class="list-bullet"
                ambient="${this.ambient}"
                ?loading="${this.isLoading}"
              >
                <bbva-type-text
                  size="S"
                  font-weight="${a.fontWeight10}"
                  inherit
                  ambient="${this.ambient}"
                  ?loading="${this.isLoading}"
                  text="${t}"
                >
                </bbva-type-text>
              </bbva-list-bullet>
            </div>
          </bbva-expandable-accordion>
        `:""}_getDynamic(e){this.dispatchEvent(new CustomEvent("rewards-member-get-member-dynamic-detail-dynamic-get",{bubbles:!0,composed:!0,detail:{id:e}}))}_onClickListFile(e){const{detail:t}=e;this.dispatchEvent(new CustomEvent("rewards-member-get-member-dynamic-detail-terms-and-conditions-click",{bubbles:!0,composed:!0,detail:t}))}_onClickCta(e){const{productId:t,offerId:i}=e;this.dispatchEvent(new CustomEvent("rewards-member-get-member-dynamic-detail-cta-click",{bubbles:!0,composed:!0,detail:{productId:t,offerId:i}}))}render(){var e,t,i,r,n,o,d,m,l;const{aemData:c={},publicSetting:b={},offer:h={}}=this.dynamic,g=null==c||null===(e=c.mgmofferdetail)||void 0===e?void 0:e.elements,u=`${this.aemHost}${null==g||null===(t=g.imageUrl)||void 0===t?void 0:t.value}`,p=null==g||null===(i=g.title)||void 0===i?void 0:i.value,y=null==g||null===(r=g.mainDescription)||void 0===r?void 0:r.value,v=null==g||null===(n=g.useForPointsTitle)||void 0===n?void 0:n.value,w=null==g||null===(o=g.useForPointsDescription)||void 0===o?void 0:o.value,f=(null==c?void 0:c.mgmofferdetaildynamics)||[],_=null==g||null===(d=g.tip1)||void 0===d?void 0:d.value,$=null==g||null===(m=g.tip2)||void 0===m?void 0:m.value,S=null==g?void 0:g.infoMessage.value,E=null==b?void 0:b.documentOfferId,x=null==b?void 0:b.documentSize,k=null==h?void 0:h.id,C=null==h||null===(l=h.product)||void 0===l?void 0:l.id;return s`
      <rewards-member-get-member-panel-offer
        image-src="${u}"
        ?loading="${this.isLoading}"
        ambient="${this.ambient}"
        title="${p}"
        title-size="3XL"
        title-font-weight="${a.fontWeight50}"
        description="${y}"
      >
      </rewards-member-get-member-panel-offer>

      ${this._getExpandableAccordion(v,w)}

      <bbva-header-category
        text="${this.t("rewards-member-get-member-dynamic-detail-title")}"
        heading-level="1"
        ambient="${this.ambient}"
        ?loading="${this.isLoading}"
      >
      </bbva-header-category>

      ${this._getDynamicsBullets(f)}

      <div class="tips-container">
        <bbva-type-text
          size="S"
          font-weight="${a.fontWeight40}"
          inherit
          ambient="${this.ambient}"
          ?loading="${this.isLoading}"
          text="${_}"
        >
        </bbva-type-text>

        <bbva-type-text
          class="tips-container__tip-two"
          size="S"
          font-weight="${a.fontWeight40}"
          inherit
          ambient="${this.ambient}"
          ?loading="${this.isLoading}"
          text="${$}"
        >
        </bbva-type-text>
      </div>

      <bbva-notification-message ambient="${this.ambient}" ?loading="${this.isLoading}">
        ${S}
      </bbva-notification-message>

      <bbva-header-category
        text="${this.t("rewards-member-get-member-dynamic-detail-terms-and-conditions-text")}"
        heading-level="1"
        ambient="${this.ambient}"
        ?loading="${this.isLoading}"
      >
      </bbva-header-category>

      <rewards-member-get-member-list-file
        document-id="${E}"
        size="${x}"
        text="${this.t("rewards-member-get-member-dynamic-detail-terms-and-conditions-link-text")}"
        ?loading="${this.isLoading}"
        ambient="${this.ambient}"
        @rewards-member-get-member-list-file-click="${this._onClickListFile}"
      >
      </rewards-member-get-member-list-file>

      <div class="align-dynamic-detail-cta-container" ?hidden="${this.isLoading}">
        <bbva-button-default
          ambient="${this.ambient}"
          fullwidth
          @click=${()=>this._onClickCta({productId:C,offerId:k})}
        >
          ${this.t("rewards-member-get-member-dynamic-detail-cta-text")}
        </bbva-button-default>
      </div>
    `}}const Ie=m((e=>class extends(t(e)){openExternalUrl(e){this.dispatchEvent(new CustomEvent("rewards-member-get-member-url-navigation-external",{detail:{scheme:e,packageId:null},bubbles:!0,composed:!0}))}})),Le="offers",Pe="promotions",Fe="aemData",He="publicSettings",Oe="promotionSummaries",Ve="POINTS",Ae="REFERENCED_PEOPLE";var Be=e`
  :host {
    --_rewards-member-get-member-reward-detail-bg-color: var(
      --rewards-member-get-member-reward-detail--_ambient--default-bg-color,
      var(
        --rewards-member-get-member-reward-detail--custom--primary-alt-ambient--default-bg-color,
        ${L("colorPrimarySurfaceAmbientDefault",P)}
      )
    );
  }
`,ze=e`
  :host {
    display: block;
    box-sizing: border-box;
    background-color: var(--_rewards-member-get-member-reward-detail-bg-color);
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

  .reward-detail-container {
    padding: 0.5rem 1rem 0.5rem 1rem;
    margin-bottom: 1rem;
  }

  .terms-and-conditions {
    padding: 0.5rem 1rem 0 1rem;
  }

  .reward-detail-cta-container {
    padding: 0.5rem 1rem 1rem 1rem;
  }

  .text-container {
    margin: 1rem 1rem 1.5rem 1rem;
  }

  .list-default-container {
    margin: 1.5rem 1rem 0.5rem 1rem;
  }

  .list-default {
    margin: 0;
    padding: 0;
    text-align: start;
    height: auto;
  }
  .list-default__icon {
    display: inline-block;
    vertical-align: bottom;
  }
  .list-default__text {
    display: inline;
  }

  .accumulated-info {
    padding: 0 1rem 1rem 1rem;
  }
  .accumulated-info__text {
    margin-top: 1.5rem;
  }

  .notification-message {
    margin: 1rem;
  }
  .notification-message__text {
    margin-top: 0.5rem;
  }
`;class je extends(Ie(t(w(f(_(i)))))){static get is(){return"rewards-member-get-member-reward-detail"}static get scopedElements(){const e=[$,z,q,he,Ce,E,B,F,...je.configurationScopedElements()];return je.scopedElementsFromClasses(e)}static get properties(){return{username:{type:String},id:{type:String},reward:{type:Object},visible:{type:Boolean},urlBbvaPoints:{type:String,attribute:"url-bbva-points"}}}constructor(){super(),this.username="",this.urlBbvaPoints="",this.reset()}static get styles(){return[ze,Be,k.primary,M.primary,G.primary,D.primary,j.primary,r("rewards-member-get-member-reward-detail-shared-styles")]}get isLoading(){return 0===Object.keys(this.reward).length}updated(e){super.updated(e),(e.has("visible")||e.has("id"))&&this.visible&&this.id&&this._getReward(this.id),e.has("reward")&&Object.keys(this.reward).length>0&&!this.isLoading&&this.dispatchEvent(new CustomEvent("rewards-member-get-member-reward-detail-load",{bubbles:!0,composed:!0}))}reset(){this.id="",this.reward={},this.visible=!1}_displaySubtitleInfo(e,t,i){return e===Ve?s`
          <div class="text-container">
            <bbva-type-text
              size="S"
              font-weight="350"
              inherit
              ambient="${this.ambient}"
              ?loading="${this.isLoading}"
              text="${this.t("rewards-member-get-member-reward-detail-points-text",{productName:t,cardNumber:i})}"
            >
            </bbva-type-text>
          </div>
        `:""}_displayPointsInfo(e={}){const{subscriptionType:t}=e;let i="";if(t===Ve){var r,a,n;const s=l(null===(r=e.equivalence)||void 0===r?void 0:r.amount,{currencyCode:null===(a=e.equivalence)||void 0===a?void 0:a.currency,localCurrency:null===(n=e.equivalence)||void 0===n?void 0:n.currency,language:this.language,decimalDigits:0});i=this.t(`rewards-member-get-member-reward-detail-reward-accumulated-info-${t}`,{points:e.amount,amount:s})}else{const r=l(e.amount,{currencyCode:e.currency,localCurrency:e.currency,language:this.language,decimalDigits:0});i=this.t(`rewards-member-get-member-reward-detail-reward-accumulated-info-${t}`,{amount:r})}return s`
      <div class="accumulated-info">
        <bbva-type-text
          inherit
          size="S"
          font-weight="350"
          text="${i}"
          ambient="${this.ambient}"
          ?loading="${this.isLoading}"
        >
        </bbva-type-text>

        <bbva-type-text
          class="accumulated-info__text"
          inherit
          size="S"
          font-weight="350"
          text="${this.t(`rewards-member-get-member-reward-detail-reward-accumulated-share-info-${t}`)}"
          ambient="${this.ambient}"
          ?loading="${this.isLoading}"
        >
        </bbva-type-text>
      </div>
    `}_displayNotificationMessage(e){return e===Ve?s`
          <bbva-notification-message
            class="notification-message"
            inherit
            link-title="${this.t("rewards-member-get-member-reward-detail-notification-message-link-title")}"
            ambient="${this.ambient}"
            ?loading="${this.isLoading}"
            @notification-message-link-click="${()=>this.openExternalUrl(this.urlBbvaPoints)}"
          >
            ${this.t("rewards-member-get-member-reward-detail-notification-message-info")}

            <bbva-type-text
              class="notification-message__text"
              inherit
              size="S"
              font-weight="350"
              text="${this.t("rewards-member-get-member-reward-detail-notification-message-more-info")}"
              ambient="${this.ambient}"
              ?loading="${this.isLoading}"
            >
            </bbva-type-text>
          </bbva-notification-message>
        `:""}_getReward(e){this.dispatchEvent(new CustomEvent("rewards-member-get-member-reward-detail-reward-get",{bubbles:!0,composed:!0,detail:{id:e}}))}_onClickHistory(){this.dispatchEvent(new CustomEvent("rewards-member-get-member-reward-detail-history-click",{bubbles:!0,composed:!0,detail:{id:this.id}}))}_onClickListFile(e){const{detail:t}=e;this.dispatchEvent(new CustomEvent("rewards-member-get-member-reward-detail-terms-and-conditions-click",{bubbles:!0,composed:!0,detail:t}))}_onClickCta(){const{id:e}=this;this.dispatchEvent(new CustomEvent("rewards-member-get-member-reward-detail-cta-click",{bubbles:!0,composed:!0,detail:{productId:e}}))}render(){var e,t,i,r,n;const{promotion:o={},publicSetting:d={}}=this.reward,m=null==d?void 0:d.documentProductId,l=null==d?void 0:d.documentProductSize,b=fe(null==d?void 0:d.productType),h=null==o||null===(e=o.product)||void 0===e?void 0:e.numberTerm,g=null==o||null===(t=o.product)||void 0===t||null===(i=t.subproduct)||void 0===i?void 0:i.id,u=null==o?void 0:o.rewards,p=this.t(`rewards-member-get-member-reward-detail-${b}-title`,{name:this.username}),y=this.t(`rewards-member-get-member-reward-detail-${b}-subtitle`);let v={};return null==u||u.forEach((({fullReward:e})=>{v=null==e?void 0:e.subscription})),s`
      <rewards-member-get-member-panel-info
        ?loading="${this.isLoading}"
        microillustration="awardgold"
        ambient="${this.ambient}"
        title="${p}"
        description="${y}"
      >
      </rewards-member-get-member-panel-info>

      ${this._displaySubtitleInfo(null===(r=v)||void 0===r?void 0:r.subscriptionType,g,h)}

      <div class="list-default-container">
        <bbva-type-icon
          class="list-default__icon"
          icon="${c()}"
          size="24"
          ambient="${this.ambient}"
          ?loading="${this.isLoading}"
        >
        </bbva-type-icon>
        <bbva-type-text
          class="list-default__text"
          inherit
          size="L"
          font-weight="${a.fontWeight40}"
          text="${this.t("rewards-member-get-member-reward-detail-reward-accumulated-title")}"
          ambient="${this.ambient}"
          ?loading="${this.isLoading}"
        >
        </bbva-type-text>
      </div>

      ${this._displayPointsInfo(v)}

      <div class="reward-detail-container">
        <bbva-type-link ?loading="${this.isLoading}" @click=${this._onClickHistory}>
          ${this.t("rewards-member-get-member-reward-detail-history-link-text")}
        </bbva-type-link>
      </div>

      ${this._displayNotificationMessage(null===(n=v)||void 0===n?void 0:n.subscriptionType)}

      <bbva-header-category
        class="terms-and-conditions"
        text="${this.t("rewards-member-get-member-reward-detail-terms-and-conditions-text")}"
        heading-level="1"
        ambient="${this.ambient}"
        ?loading="${this.isLoading}"
      >
      </bbva-header-category>

      <rewards-member-get-member-list-file
        document-id="${m}"
        size="${l}"
        text="${this.t("rewards-member-get-member-reward-detail-terms-and-conditions-link-text")}"
        ?loading="${this.isLoading}"
        ambient="${this.ambient}"
        @rewards-member-get-member-list-file-click="${this._onClickListFile}"
      >
      </rewards-member-get-member-list-file>

      <div class="reward-detail-cta-container" ?hidden="${this.isLoading}">
        <bbva-button-default ambient="${this.ambient}" fullwidth @click=${this._onClickCta}>
          ${this.t("rewards-member-get-member-reward-detail-cta-text")}
        </bbva-button-default>
      </div>
    `}}var Me=e`
  :host {
    --_rewards-member-get-member-reward-history-bg-color: var(
      --rewards-member-get-member-reward-history--_ambient--default-bg-color,
      var(
        --rewards-member-get-member-reward-history--custom--primary-alt-ambient--default-bg-color,
        ${L("colorPrimarySurfaceAmbientDefault",P)}
      )
    );
  }
`,qe=e`
  :host {
    display: block;
    box-sizing: border-box;
    background-color: var(--_rewards-member-get-member-reward-history-bg-color);
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

  .date {
    padding: 1rem 1rem 0 1rem;
  }

  .notification-message {
    margin: 1rem;
  }
`;class Ge extends(t(w(f(_(i))))){static get is(){return"rewards-member-get-member-reward-history"}static get scopedElements(){const e=[q,ve,F,...Ge.configurationScopedElements()];return Ge.scopedElementsFromClasses(e)}static get properties(){return{rewardId:{type:String,attribute:"reward-id"},rewardHistory:{type:Array},visible:{type:Boolean}}}constructor(){super(),this.reset(),this._headerCategoryOptions={dateStyle:"medium",timeZone:"UTC"}}static get styles(){return[qe,Me,G.primary,r("rewards-member-get-member-reward-history-shared-styles")]}get isLoading(){return!this.rewardHistory||0===this.rewardHistory.length}updated(e){super.updated(e),(e.has("visible")||e.has("rewardId"))&&this.visible&&this.rewardId&&this._getRewardHistory(this.rewardId),e.has("rewardHistory")&&this.rewardHistory.length>0&&!this.isLoading&&this.dispatchEvent(new CustomEvent("rewards-member-get-member-reward-history-load",{bubbles:!0,composed:!0}))}reset(){this.rewardId="",this.rewardHistory=[],this.visible=!1}get loadingTemplate(){return s`
      <bbva-header-category class="date" loading variant="date" ambient="${this.ambient}">
      </bbva-header-category>
      <rewards-member-get-member-list-default loading ambient="${this.ambient}">
      </rewards-member-get-member-list-default>

      <bbva-header-category class="date" loading variant="date" ambient="${this.ambient}">
      </bbva-header-category>
      <rewards-member-get-member-list-default loading ambient="${this.ambient}">
      </rewards-member-get-member-list-default>
    `}_showNotificationMessage(e){return e.some((e=>{var t,i,r;const{promotionSummary:s={}}=e;return(null==s||null===(t=s.reward)||void 0===t||null===(i=t.fullReward)||void 0===i||null===(r=i.subscription)||void 0===r?void 0:r.subscriptionType)===Ve}))?s`
          <bbva-notification-message class="notification-message" ambient="${this.ambient}">
            ${this.t("rewards-member-get-member-reward-history-notification-message-info")}
          </bbva-notification-message>
        `:""}get _subscriptionDetails(){return{CASH:e=>({amount:(null==e?void 0:e.amount)||"0",decimalDigits:"0",currency:e.currency||""}),POINTS:e=>({text:this.t("rewards-member-get-member-reward-history-points-text"),amount:(null==e?void 0:e.amount)||"0",type:"points",decimalDigits:"0"})}}_getRewardHistoryTemplate(e){return s`
      ${this._showNotificationMessage(e)}
      ${e.map((e=>{var t,i;const{promotionSummary:r={},publicSetting:n={}}=e,o=fe(n.productType),d=null==r||null===(t=r.reward)||void 0===t||null===(i=t.fullReward)||void 0===i?void 0:i.subscription,m=this._subscriptionDetails[null==d?void 0:d.subscriptionType](d),l=r.reward.reason.reasonType===Ae?r.reward.reason.current:0,c=this.t(`rewards-member-get-member-reward-history-${o}-referenced-${1===l?"person":"people"}`,{referencedPeople:l});return s`
          <bbva-header-category
            class="date"
            date="${r.creationDate}"
            .options="${this._headerCategoryOptions}"
            variant="date"
            font-style-date="italic"
            font-weight-date="${a.fontWeight40}"
            ambient="${this.ambient}"
          >
          </bbva-header-category>

          <rewards-member-get-member-list-default
            id="${r.id}"
            language="${this.language}"
            ambient="${this.ambient}"
            link-text="${this.t("rewards-member-get-member-reward-history-bonus-link-text")}"
            badge-text="${c}"
            .description="${m}"
            @rewards-member-get-member-list-default-click="${this._onClickListDefault}"
          >
          </rewards-member-get-member-list-default>
        `}))}
    `}_getRewardHistory(e){this.dispatchEvent(new CustomEvent("rewards-member-get-member-reward-history-reward-history-get",{bubbles:!0,composed:!0,detail:{rewardId:e}}))}_onClickListDefault(e){const{id:t}=e.detail,{rewardId:i}=this;this.dispatchEvent(new CustomEvent("rewards-member-get-member-reward-history-bonus-click",{detail:{id:t,rewardId:i},bubbles:!0,composed:!0}))}render(){return s`
      ${this.isLoading?this.loadingTemplate:this._getRewardHistoryTemplate(this.rewardHistory)}
    `}}var Ke=e`
  :host {
    display: block;
    box-sizing: border-box;
    padding: 0;
    margin: 0;
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

  .list-info {
    display: flex;
    align-items: center;
    padding: 0 1rem 0 1rem;
  }
  .list-info__icon {
    margin-right: 0.5rem;
  }
`;class Ne extends(t(w(f(_(i))))){static get is(){return"rewards-member-get-member-list-info"}static get scopedElements(){const e=[B,H,...Ne.configurationScopedElements()];return Ne.scopedElementsFromClasses(e)}static get properties(){return{icon:{type:String},amount:{type:String},text:{type:String},currency:{type:String},loading:{type:Boolean}}}constructor(){super(),this.reset()}static get styles(){return[Ke,j.primary,O.primary,r("rewards-member-get-member-list-info-shared-styles")]}reset(){this.icon="",this.amount="",this.text="",this.currency="",this.loading=!1}render(){return s`
      <div id="items" class="list-info">
        ${this.icon?s`
              <bbva-type-icon
                class="list-info__icon"
                ?loading="${this.loading}"
                ambient="${this.ambient}"
                size="16"
                icon="${this.icon}"
              ></bbva-type-icon>
            `:""}
        <bbva-type-amount
          class="list-info__text"
          variant="m"
          ?loading="${this.loading}"
          ambient="${this.ambient}"
          language="${this.language}"
          amount="${this.amount}"
          text="${n(this.text)}"
          decimal-digits="0"
          currency-code="${n(this.currency)}"
          local-currency="${n(this.currency)}"
        >
        </bbva-type-amount>
      </div>
    `}}var Ue=e`
  :host {
    --_rewards-member-get-member-bonus-detail-bg-color: var(
      --rewards-member-get-member-bonus-detail--_ambient--default-bg-color,
      var(
        --rewards-member-get-member-bonus-detail--custom--primary-alt-ambient--default-bg-color,
        ${L("colorPrimarySurfaceAmbientDefault",P)}
      )
    );
  }
`,We=e`
  :host {
    display: block;
    box-sizing: border-box;
    background-color: var(--_rewards-member-get-member-bonus-detail-bg-color);
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

  .terms-and-conditions {
    padding: 0.5rem 1rem 0 1rem;
  }

  .bonus-detail-cta-container {
    padding: 0.5rem 1rem 1rem 1rem;
  }

  .bonus-detail-container {
    padding: 1rem 1rem 0 1rem;
  }

  .equivalence-points-header {
    margin: 1rem 1rem 0 1rem;
  }

  .business-list-item {
    margin-bottom: 1rem;
  }

  .equivalence-points-warning {
    margin: 0 1rem;
  }
  .equivalence-points-warning__suggestion {
    margin-top: 1.5rem;
  }

  .suggestions-header {
    margin: 1rem 1rem 0 1rem;
  }

  .suggestions-text {
    margin: 0 1rem 1rem 1rem;
  }

  .notification-message {
    margin: 1rem;
  }
`;class Xe extends(Ie(t(w(f(_(i)))))){static get is(){return"rewards-member-get-member-bonus-detail"}static get scopedElements(){const e=[$,F,E,z,H,q,K,he,Ce,Ne,...Xe.configurationScopedElements()];return Xe.scopedElementsFromClasses(e)}static get properties(){return{username:{type:String},id:{type:String},rewardId:{type:String,attribute:"reward-id"},bonus:{type:Object},visible:{type:Boolean},urlBbvaPoints:{type:String,attribute:"url-bbva-points"},promotionSummariesStoreIconsMapping:{type:Object}}}constructor(){super(),this.username="",this.urlBbvaPoints="",this.reset()}static get styles(){return[We,Ue,k.primary,k.primaryAlt,D.primary,D.primaryAlt,M.primary,O.primaryAlt,G.primary,N.primary,r("rewards-member-get-member-bonus-detail-shared-styles")]}get isLoading(){return 0===Object.keys(this.bonus).length}updated(e){super.updated(e),(e.has("visible")||e.has("id")||e.has("rewardId"))&&this.visible&&this.id&&this.rewardId&&this._getBonus(this.rewardId,this.id),e.has("bonus")&&Object.keys(this.bonus).length>0&&!this.isLoading&&this.dispatchEvent(new CustomEvent("rewards-member-get-member-bonus-detail-load",{bubbles:!0,composed:!0}))}reset(){this.id="",this.rewardId="",this.bonus={},this.visible=!1,this.promotionSummariesStoreIconsMapping={}}get _equivalencePointsHeaderTemplate(){return s`
      <bbva-header-category
        class="equivalence-points-header"
        text="${this.t("rewards-member-get-member-bonus-detail-equivalence-points")}"
        heading-level="1"
        ambient="${this.ambient}"
        ?loading="${this.isLoading}"
      >
      </bbva-header-category>
    `}get _equivalencePointsWarningTemplate(){return s`
      <div class="equivalence-points-warning">
        <bbva-type-text
          inherit
          size="S"
          text="rewards-member-get-member-bonus-detail-equivalence-points-warning"
          ambient="${this.ambient}"
          ?loading="${this.isLoading}"
        >
        </bbva-type-text>
        <bbva-type-text
          class="equivalence-points-warning__suggestion"
          inherit
          size="S"
          text="rewards-member-get-member-bonus-detail-equivalence-points-suggestion"
          ambient="${this.ambient}"
          ?loading="${this.isLoading}"
        >
        </bbva-type-text>
      </div>
    `}_informationTemplate(e){const t=e?"points":"cash",i=this.t(`rewards-member-get-member-bonus-detail-notification-message-title-${t}`),r=this.t(`rewards-member-get-member-bonus-detail-notification-message-text-${t}`),a=this.t(`rewards-member-get-member-bonus-detail-notification-message-description-${t}`),o=e?this.t("rewards-member-get-member-bonus-detail-notification-message-link-title"):void 0;return s`
      <bbva-notification-message
        class="notification-message"
        message-title="${i}"
        message="${r}"
        description="${a}"
        link-title="${n(o)}"
        ?loading="${this.isLoading}"
        @notification-message-link-click="${()=>this.openExternalUrl(this.urlBbvaPoints)}"
      >
      </bbva-notification-message>
    `}get _suggestionsTemplate(){return s`
      <bbva-header-category
        class="suggestions-header"
        text="rewards-member-get-member-bonus-detail-suggestions-header"
        heading-level="1"
        ambient="${this.ambient}"
        ?loading="${this.isLoading}"
      >
      </bbva-header-category>
      <div class="suggestions-text">
        <bbva-type-text
          inherit
          size="S"
          text="rewards-member-get-member-bonus-detail-suggestions-text"
          ambient="${this.ambient}"
          ?loading="${this.isLoading}"
        >
        </bbva-type-text>
      </div>
    `}_getBusinessList(e,t){return s`
      ${e&&e.length>0?e.map((e=>{const{id:i="",unit:r={}}=e,{amount:a="",currency:n=""}=r,o=t[i]||"",d=this.t(`rewards-member-get-member-bonus-detail-equivalence-points-store-${i}`);return s`
              <rewards-member-get-member-list-info
                class="business-list-item"
                icon="${o}"
                text="${d}"
                amount="${a}"
                currency="${n}"
                language="${this.language}"
                ambient="${this.ambient}"
                ?loading="${this.isLoading}"
              ></rewards-member-get-member-list-info>
            `})):""}
    `}_getPointsTemplate(e,t){return s`
      ${this._equivalencePointsHeaderTemplate}
      ${this._getBusinessList(e,t)}
      ${this._equivalencePointsWarningTemplate}
    `}_getBonus(e,t){this.dispatchEvent(new CustomEvent("rewards-member-get-member-bonus-detail-bonus-get",{detail:{rewardId:e,id:t},bubbles:!0,composed:!0}))}_onClickListFile(e){const{detail:t}=e;this.dispatchEvent(new CustomEvent("rewards-member-get-member-bonus-detail-terms-and-conditions-click",{bubbles:!0,composed:!0,detail:t}))}_onClickCta(){const{rewardId:e}=this;this.dispatchEvent(new CustomEvent("rewards-member-get-member-bonus-detail-cta-click",{bubbles:!0,composed:!0,detail:{productId:e}}))}render(){var e,t,i,r,a,n,o,d;const{promotionSummary:m={},publicSetting:c={}}=this.bonus,b=null==m?void 0:m.reward,h=null==m||null===(e=m.redemptionEntity)||void 0===e?void 0:e.stores,g=fe(null==c?void 0:c.productType),u=(null==b?void 0:b.reason.reasonType)===Ae?b.reason.current:0,p=(null==b||null===(t=b.fullReward)||void 0===t?void 0:t.subscription.subscriptionType)===Ve,y=null==c?void 0:c.documentProductId,v=null==c?void 0:c.documentProductSize,w=null==m||null===(i=m.product)||void 0===i||null===(r=i.subproduct)||void 0===r?void 0:r.id,f=null==m||null===(a=m.product)||void 0===a||null===(n=a.numberTerm)||void 0===n?void 0:n.replace("**",""),_=null==b||null===(o=b.fullReward)||void 0===o?void 0:o.subscription.amount,$=null==b||null===(d=b.fullReward)||void 0===d?void 0:d.subscription.currency,S=p?_:l(_,{currencyCode:$,localCurrency:$,language:this.language,decimalDigits:2}),E=`${this.t(`rewards-member-get-member-bonus-detail-${g}-notification-contextual-${1===u?"person":"people"}`,{amount:S,current:u})}`;return s`
      <rewards-member-get-member-panel-info
        ?loading="${this.isLoading}"
        microillustration="gift"
        ambient="${this.ambient}"
        title="${this.t("rewards-member-get-member-bonus-detail-panel-info-title",{name:this.username})}"
        description="${this.t(`rewards-member-get-member-bonus-detail-${g}-panel-info-description`,{productName:w,numberTerm:f})}"
      >
      </rewards-member-get-member-panel-info>

      <bbva-notification-contextual
        class="bonus-detail-container"
        head-title="${this.t("rewards-member-get-member-bonus-detail-notification-contextual-title")}"
        body-text="${E}"
        icon-type="bbva:promotion"
        ambient="${this.ambient}"
        ?loading="${this.isLoading}"
      >
      </bbva-notification-contextual>

      ${p?this._getPointsTemplate(h,this.promotionSummariesStoreIconsMapping):""}
      ${p?"":this._suggestionsTemplate} ${this._informationTemplate(p)}

      <bbva-header-category
        class="terms-and-conditions"
        text="${this.t("rewards-member-get-member-bonus-detail-terms-and-conditions-text")}"
        heading-level="1"
        ambient="${this.ambient}"
        ?loading="${this.isLoading}"
      >
      </bbva-header-category>

      <rewards-member-get-member-list-file
        document-id="${y}"
        size="${v}"
        text="${this.t("rewards-member-get-member-bonus-detail-terms-and-conditions-link-text")}"
        ?loading="${this.isLoading}"
        ambient="${this.ambient}"
        @rewards-member-get-member-list-file-click="${this._onClickListFile}"
      >
      </rewards-member-get-member-list-file>

      <div class="bonus-detail-cta-container" ?hidden="${this.isLoading}">
        <bbva-button-default ambient="${this.ambient}" fullwidth @click=${this._onClickCta}>
          ${this.t("rewards-member-get-member-bonus-detail-cta-text")}
        </bbva-button-default>
      </div>
    `}}class Ye extends(w(f(_(i)))){static get is(){return"rewards-member-get-member-dm"}static get scopedElements(){const e=[U,W,re,de,me,se,...Ye.configurationScopedElements()];return Ye.scopedElementsFromClasses(e)}static get properties(){return{campaignsApiVersion:{type:String,attribute:"campaigns-api-version"},labelId:{type:String,attribute:"label-id"},loyaltyApiVersion:{type:String,attribute:"loyalty-api-version"},aemHost:{type:String,attribute:"aem-host"},aemPath:{type:String,attribute:"aem-path"},aemCachetype:{type:String,attribute:"aem-cachetype"},aemCachekey:{type:String,attribute:"aem-cachekey"},contentFragmentIds:{type:Object},appSettingsApiVersion:{type:String,attribute:"app-settings-api-version"},publicSettings:{type:Object},publicSettingsId:{type:String,attribute:"public-settings-id"},publicSettingsConfigKey:{type:String,attribute:"public-settings-config-key"},publicSettingsCachetype:{type:String,attribute:"public-settings-cachetype"},publicSettingsCachekey:{type:String,attribute:"public-settings-cachekey"},documentsApiVersion:{type:String,attribute:"documents-api-version"},country:{type:String},documentFileLocalCustomProperties:{type:Object},productIdOfOffersHidden:{type:Array},_aemData:{type:Object},_publicSettings:{type:Object},_offers:{type:Array},_promotions:{type:Array},_promotionSummaries:{type:Array},_aemContentFragmentEventTarget:{type:Object},_offersEventTarget:{type:Object},_promotionsEventTarget:{type:Object},_publicSettingsEventTarget:{type:Object},_promotionSummariesEventTarget:{type:Object}}}constructor(){super(),this.campaignsApiVersion="",this.loyaltyApiVersion="",this.labelId="",this.aemHost="",this.aemPath="",this.aemCachetype="",this.aemCachekey="",this.contentFragmentIds={},this.appSettingsApiVersion="",this.publicSettings={},this.publicSettingsId="",this.publicSettingsHost="",this.publicSettingsConfigKey="",this.publicSettingsCachetype="",this.publicSettingsCachekey="",this.publicSettingsRequiredToken="",this.requiredToken="",this.host="",this.native=!1,this.documentsApiVersion="",this.country="",this.documentFileLocalCustomProperties={},this.productIdOfOffersHidden=[],this.reset()}firstUpdated(e){super.firstUpdated(e),this._aemContentFragmentDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-aem-content-fragment-dm"]'),this._offersDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-offers-api-dm"]'),this._promotionsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-promotions-api-dm"]'),this._publicSettingsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-public-settings-api-dm"]'),this._promotionSummariesDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-promotion-summaries-api-dm"]'),this._documentFileDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-document-file-api-dm"]')}updated(e){super.updated(e),(e.has("publicSettings")||e.has("publicSettingsConfigKey"))&&this._setPublicSettings(this.publicSettings,this.publicSettingsConfigKey)}reset(){this._aemData={},this._offers=[],this._promotions=[],this._publicSettings={},this._aemContentFragmentEventTarget=new EventTarget,this._offersEventTarget=new EventTarget,this._promotionsEventTarget=new EventTarget,this._publicSettingsEventTarget=new EventTarget,this._setPublicSettings(this.publicSettings,this.publicSettingsConfigKey),this.resetPromotionSummaries()}resetPromotionSummaries(){this._promotionSummaries=[],this._promotionSummariesEventTarget=new EventTarget}get _publicSettingsHost(){return this.publicSettingsHost||this.host}get _publicSettingsRequiredToken(){return this.publicSettingsHost?this.publicSettingsRequiredToken:this.requiredToken}get _aemContentFragmentDmTemplate(){return s`
      <bbva-global-aem-content-fragment-dm
        cross-domain
        host="${this.aemHost}"
        path="${this.aemPath}"
        ?native=${this.native}
        .cacheType="${this.aemCachetype}"
        .cacheKey="${this.aemCachekey}"
        @aem-content-fragment-dm-fetch="${this._handleAemContentFragmentResponse}"
        @aem-content-fragment-dm-fetch-error="${this._handleAemContentFragmentResponse}"
        @api-dm-error="${this._handleAemContentFragmentResponse}"
      >
      </bbva-global-aem-content-fragment-dm>
    `}get _publicSettingsDmTemplate(){return s`
      <bbva-global-public-settings-api-dm
        host="${this._publicSettingsHost}"
        version="${this.appSettingsApiVersion}"
        language="${this.language}"
        ?native="${this.native}"
        .cacheType="${this.publicSettingsCachetype}"
        .cacheKey="${this.publicSettingsCachekey}"
        .requiredToken="${this._publicSettingsRequiredToken}"
        @public-settings-api-dm-fetch="${this._handlePublicSettingsResponse}"
        @public-settings-api-dm-fetch-error="${this._handlePublicSettingsResponse}"
        @api-dm-error="${this._handlePublicSettingsResponse}"
      >
      </bbva-global-public-settings-api-dm>
    `}get _offersDmTemplate(){return s`
      <bbva-global-offers-api-dm
        host="${this.host}"
        version="${this.campaignsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @offers-api-dm-fetch="${this._handleOffersResponse}"
        @offers-api-dm-fetch-error="${this._handleOffersResponse}"
        @api-dm-error="${this._handleOffersResponse}"
      >
      </bbva-global-offers-api-dm>
    `}get _promotionsDmTemplate(){return s`
      <bbva-global-promotions-api-dm
        host="${this.host}"
        version="${this.loyaltyApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @promotions-api-dm-fetch="${this._handlePromotionsResponse}"
        @promotions-api-dm-fetch-error="${this._handlePromotionsResponse}"
        @api-dm-error="${this._handlePromotionsResponse}"
      >
      </bbva-global-promotions-api-dm>
    `}get _promotionSummariesTemplate(){return s`
      <bbva-global-promotion-summaries-api-dm
        host="${this.host}"
        version="${this.loyaltyApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @promotion-summaries-api-dm-fetch="${this._handlePromotionSummariesResponse}"
        @promotion-summaries-api-dm-fetch-error="${this._handlePromotionSummariesResponse}"
        @api-dm-error="${this._handlePromotionSummariesResponse}"
      >
      </bbva-global-promotion-summaries-api-dm>
    `}get _documentFileTemplate(){return s`
      <bbva-global-document-file-api-dm
        host="${this.host}"
        version="${this.documentsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        country="${this.country}"
        @document-file-api-dm-fetch="${this._handleDocumentFileFetch}"
        @document-file-api-dm-fetch-error="${this._handleDocumentFileFetchError}"
        @api-dm-error="${this._handleDocumentFileFetchError}"
      >
      </bbva-global-document-file-api-dm>
    `}getDynamics(){const e=[this._getAemContentFragment(this._aemData),this._getPublicSettings(this._publicSettings,this.publicSettingsId,this.publicSettingsConfigKey),this._getOffers(this._offers,this.labelId)];Promise.allSettled(e).then((async e=>{const t=this._generateDynamicsFromResults(e,this.productIdOfOffersHidden);t?this.dispatchEvent(new CustomEvent("rewards-member-get-member-dm-dynamics-fetch",{bubbles:!0,composed:!0,detail:t})):this.dispatchEvent(new CustomEvent("rewards-member-get-member-dm-dynamics-error-fetch",{bubbles:!0,composed:!0}))}))}getDynamic(e){const t=[this._getAemContentFragment(this._aemData),this._getPublicSettings(this._publicSettings,this.publicSettingsId,this.publicSettingsConfigKey),this._getOffers(this._offers,this.labelId)];Promise.allSettled(t).then((async t=>{const i=this._generateDynamicsFromResults(t,this.productIdOfOffersHidden);let r;i&&i.length&&(r=i.find((t=>t.offer.product.id===e))),r?this.dispatchEvent(new CustomEvent("rewards-member-get-member-dm-dynamic-fetch",{bubbles:!0,composed:!0,detail:r})):this.dispatchEvent(new CustomEvent("rewards-member-get-member-dm-dynamic-error-fetch",{bubbles:!0,composed:!0}))}))}getRewards(){const e=[this._getPublicSettings(this._publicSettings,this.publicSettingsId,this.publicSettingsConfigKey),this._getPromotions(this._promotions)];Promise.allSettled(e).then((async e=>{const t=this._generateRewardsFromResults(e);t?this.dispatchEvent(new CustomEvent("rewards-member-get-member-dm-rewards-fetch",{bubbles:!0,composed:!0,detail:t})):this.dispatchEvent(new CustomEvent("rewards-member-get-member-dm-rewards-error-fetch",{bubbles:!0,composed:!0}))}))}getReward(e){const t=[this._getPublicSettings(this._publicSettings,this.publicSettingsId,this.publicSettingsConfigKey),this._getPromotions(this._promotions)];Promise.allSettled(t).then((async t=>{const i=this._generateRewardsFromResults(t);let r;i&&i.length&&(r=i.find((t=>t.promotion.id===e))),r?this.dispatchEvent(new CustomEvent("rewards-member-get-member-dm-reward-fetch",{bubbles:!0,composed:!0,detail:r})):this.dispatchEvent(new CustomEvent("rewards-member-get-member-dm-reward-error-fetch",{bubbles:!0,composed:!0}))}))}getRewardHistory(e){const t=[this._getPublicSettings(this._publicSettings,this.publicSettingsId,this.publicSettingsConfigKey),this._getPromotions(this._promotions),this._getPromotionSummaries(this._promotionSummaries,e)];Promise.allSettled(t).then((async t=>{const i=this._generateRewardHistoryFromResults(t,e);i&&i.length?this.dispatchEvent(new CustomEvent("rewards-member-get-member-dm-reward-history-fetch",{bubbles:!0,composed:!0,detail:i})):this.dispatchEvent(new CustomEvent("rewards-member-get-member-dm-reward-history-error-fetch",{bubbles:!0,composed:!0}))}))}getBonus(e,t){const i=[this._getPublicSettings(this._publicSettings,this.publicSettingsId,this.publicSettingsConfigKey),this._getPromotions(this._promotions),this._getPromotionSummaries(this._promotionSummaries,e)];Promise.allSettled(i).then((async i=>{const r=this._generateRewardHistoryFromResults(i,e);let s;r&&r.length&&(s=r.find((e=>e.promotionSummary.id===t))),s?this.dispatchEvent(new CustomEvent("rewards-member-get-member-dm-bonus-fetch",{bubbles:!0,composed:!0,detail:s})):this.dispatchEvent(new CustomEvent("rewards-member-get-member-dm-bonus-fetch-error",{bubbles:!0,composed:!0}))}))}getTermsAndConditions(e){this._documentFileDm.localCustomProperties=this.documentFileLocalCustomProperties,this._documentFileDm.getDocumentFile(e)}_setPublicSettings(e,t){var i;this._publicSettings=Object.keys(e).length&&t?null===(i=e[t])||void 0===i?void 0:i.data:e}_handleAemContentFragmentResponse(e){const{detail:t,type:i}=e;this._aemContentFragmentEventTarget.dispatchEvent(new CustomEvent(`${Ye.is}-${i}`,{bubbles:!0,composed:!0,detail:t}))}_handlePublicSettingsResponse(e){const{detail:t,type:i}=e;this._publicSettingsEventTarget.dispatchEvent(new CustomEvent(`${Ye.is}-${i}`,{bubbles:!0,composed:!0,detail:t}))}_handleOffersResponse(e){const{detail:t,type:i}=e;this._offersEventTarget.dispatchEvent(new CustomEvent(`${Ye.is}-${i}`,{bubbles:!0,composed:!0,detail:t}))}_handlePromotionsResponse(e){const{detail:t,type:i}=e;this._promotionsEventTarget.dispatchEvent(new CustomEvent(`${Ye.is}-${i}`,{bubbles:!0,composed:!0,detail:t}))}_handlePromotionSummariesResponse(e){const{detail:t,type:i}=e;this._promotionSummariesEventTarget.dispatchEvent(new CustomEvent(`${Ye.is}-${i}`,{bubbles:!0,composed:!0,detail:t}))}_handleDocumentFileFetch(e){const{detail:t}=e;this.dispatchEvent(new CustomEvent("rewards-member-get-member-dm-terms-and-conditions-fetch",{bubbles:!0,composed:!0,detail:t}))}_handleDocumentFileFetchError(e){const{detail:t}=e;this.dispatchEvent(new CustomEvent("rewards-member-get-member-dm-terms-and-conditions-fetch-error",{bubbles:!0,composed:!0,detail:t}))}_generateDynamicsFromResults(e,t){const i=this._existSomePromiseRejected(e),r=this._getPromiseData(Fe,e),s=this._getPromiseData(He,e),a=this._getPromiseData(Le,e);let n;return this._aemData=r,this._publicSettings=s,this._offers=a,r&&Object.keys(r).length&&s&&Object.keys(s).length&&a&&!i&&(n=this._createDynamics(a,r,s,t)),n}_createDynamics(e,t,i,r){const s=[],a=this._getOfferetailData(t,"mgmofferdetail"),n=this._getOfferetailData(t,"mgmofferdetaildynamics");if(a.length&&n.length)for(const t of e)this._processOffer(t,a,n,i,r,s);return s}_getOfferetailData(e,t){var i;return(null===(i=e.find((e=>e.id===t)))||void 0===i?void 0:i.items)||[]}_processOffer(e,t,i,r,s,a){const n=t.find((t=>t.elements.id.value===e.product.id)),o=i.filter((t=>t.elements.id.value===e.product.id)),d=r.offers.find((t=>t.id===e.product.id)),m=s.includes(e.product.id);n&&d&&!m&&a.push({offer:e,aemData:{mgmofferdetail:n,mgmofferdetaildynamics:o},publicSetting:d})}_generateRewardsFromResults(e){const t=this._existSomePromiseRejected(e),i=this._getPromiseData(He,e),r=this._getPromiseData(Pe,e);let s;return this._publicSettings=i,this._promotions=r,i&&Object.keys(i).length&&r&&!t&&(s=this._createRewards(r,i)),s}_createRewards(e,t){const i=[];for(const r of e){const e=t.products.find((e=>e.id===r.id));e&&i.push({promotion:r,publicSetting:e})}return i}_generateRewardHistoryFromResults(e,t){const i=this._existSomePromiseRejected(e),r=this._getPromiseData(He,e),s=this._getPromiseData(Pe,e),a=this._getPromiseData(Oe,e);let n;return this._publicSettings=r,this._promotions=s,this._promotionSummaries=a,r&&Object.keys(r).length&&s&&s.length&&a&&a.length&&!i&&(n=this._createRewardHistory(t,s,a,r)),n}_createRewardHistory(e,t,i,r){var s;const a=[],n=null===(s=t.find((t=>t.id===e)))||void 0===s?void 0:s.id;if(n){const e=r.products.find((e=>e.id===n));if(Object.keys(e).length)for(const t of i)a.push({promotionSummary:t,publicSetting:e})}return a}_existSomePromiseRejected(e){return e.some((e=>"rejected"===e.status))}_getPromiseData(e,t){var i,r;return null===(i=t.find((t=>"fulfilled"===t.status&&t.value.id===e)))||void 0===i||null===(r=i.value)||void 0===r?void 0:r.data}_getAemContentFragment(e){return new Promise(((t,i)=>{const r=this._aemContentFragmentDm,s=this._aemContentFragmentEventTarget;s.addEventListener("rewards-member-get-member-dm-aem-content-fragment-dm-fetch",(e=>{const{items:i}=e.detail||{},r=Object.keys(i).map((e=>i[e]));t({id:Fe,data:r})})),s.addEventListener("rewards-member-get-member-dm-aem-content-fragment-dm-fetch-error",(e=>{i({error:e})})),s.addEventListener("rewards-member-get-member-dm-api-dm-error",(e=>{i({error:e,type:"generic"})})),Object.keys(e).length?t({id:Fe,data:e}):r.getAemData()}))}_parsePublicSettingsData(e,t){const i=(e.detail||[]).find((e=>e.key===t)),r=null!=i&&i.value?JSON.parse(i.value):{};return null!=r&&r.data&&Object.keys(r.data).length?r.data:{}}_getPublicSettings(e,t,i){return new Promise(((r,s)=>{const a=this._publicSettingsDm,n=this._publicSettingsEventTarget;n.addEventListener("rewards-member-get-member-dm-public-settings-api-dm-fetch",(e=>{const t=this._parsePublicSettingsData(e,i);r({id:He,data:t})})),n.addEventListener("rewards-member-get-member-dm-public-settings-api-dm-fetch-error",(e=>{s({error:e})})),n.addEventListener("rewards-member-get-member-dm-api-dm-error",(e=>{s({error:e,type:"generic"})})),Object.keys(e).length?r({id:He,data:e}):a.getPublicSettings(t,{key:i})}))}_getOffers(e=[],t){return new Promise(((i,r)=>{const s=this._offersDm,a=this._offersEventTarget;if(a.addEventListener("rewards-member-get-member-dm-offers-api-dm-fetch",(e=>{const t=e.detail||[];i({id:Le,data:t})})),a.addEventListener("rewards-member-get-member-dm-offers-api-dm-fetch-error",(e=>{r({error:e})})),a.addEventListener("rewards-member-get-member-dm-api-dm-error",(e=>{r({error:e,type:"generic"})})),e.length)i({id:Le,data:e});else{const e={"label.id":t};s.getOffers(e)}}))}_getPromotions(e=[]){return new Promise(((t,i)=>{const r=this._promotionsDm,s=this._promotionsEventTarget;if(s.addEventListener("rewards-member-get-member-dm-promotions-api-dm-fetch",(e=>{const i=e.detail||[];t({id:Pe,data:i})})),s.addEventListener("rewards-member-get-member-dm-promotions-api-dm-fetch-error",(e=>{i({error:e})})),s.addEventListener("rewards-member-get-member-dm-api-dm-error",(e=>{i({error:e,type:"generic"})})),Object.keys(e).length)t({id:Pe,data:e});else{const e={"promotionType.id":"NORMAL","promotionType.subPromotionType.id":"MGM"};r.getPromotions(e)}}))}_getPromotionSummaries(e,t){return new Promise(((i,r)=>{const s=this._promotionSummariesDm,a=this._promotionSummariesEventTarget;a.addEventListener("rewards-member-get-member-dm-promotion-summaries-api-dm-fetch",(e=>{const t=e.detail||[];i({id:Oe,data:t})})),a.addEventListener("rewards-member-get-member-dm-promotion-summaries-api-dm-fetch-error",(e=>{r({error:e})})),a.addEventListener("rewards-member-get-member-dm-api-dm-error",(e=>{r({error:e,type:"generic"})})),Object.keys(e).length?i({id:Oe,data:e}):s.getPromotionSummaries(t)}))}render(){return s`
      ${this._aemContentFragmentDmTemplate} ${this._publicSettingsDmTemplate}
      ${this._offersDmTemplate} ${this._promotionsDmTemplate} ${this._promotionSummariesTemplate}
      ${this._documentFileTemplate}
    `}}var Je=e`
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

  .modal-title {
    margin: 1rem 0 0.5rem 0;
  }
`;class Qe extends(t(f(_(i)))){static get scopedElements(){const e=[X,z,R,E];return Qe.scopedElementsFromClasses(e)}static get properties(){return{visible:{type:Boolean}}}static get styles(){return[Je,D.primary,I.primary,M.primary,r("rewards-member-get-member-modal-base-shared-styles")]}constructor(){super(),this.reset()}update(e){super.update(e)}reset(){this.visible=!1,this._resetConfig(),this._listeners()}cancelModal(){this.dispatchCustomEvent("rewards-member-get-member-modal-cancel"),this.closeModal()}closeModal(){this.visible=!1}dispatchCustomEvent(e,t,i=!0,r=!0){this.dispatchEvent(new CustomEvent(e,{bubbles:i,composed:r,detail:t}))}_listeners(){this.addEventListener("header-main-icon-left-primary-click",(e=>{e.stopPropagation()}))}_changeVisible(e){this.dispatchEvent(new CustomEvent("rewards-member-get-member-modal-base-visible-change",{detail:null==e?void 0:e.detail,bubbles:!0,composed:!0}))}_closeButtonClick(e){e.stopPropagation(),this.cancelModal()}footerButtonClick(){this.shouldTransition&&this.closeModal()}_resetConfig(){Object.assign(this,{bodyText:"",buttonText:"",fullHeight:!1,headerText:"",headerType:"",hideContentPaddingTop:!1,linkText:"",modalType:"info",titleIcon:"",titleText:"",shouldTransition:!1,contentTitle:"",contentMicroillustration:"",contentBody:"",stickyFooter:!1,fixedFooter:!1})}get _modalContent(){return s`
      ${this.contentMicroillustration?s`
            <bbva-clip-microillustration
              size="M"
              ambient="${this.ambient}"
              microillustration="${this.contentMicroillustration}"
            ></bbva-clip-microillustration>
          `:""}
      ${this.contentTitle?s`
            <bbva-type-text
              size="3XL"
              inherit
              font-weight="${a.fontWeight50}"
              ambient="${this.ambient}"
              class="modal-title"
              text="${this.contentTitle}"
            ></bbva-type-text>
          `:""}
      ${this.contentBody?s`
            <bbva-type-text
              size="S"
              inherit
              ambient="${this.ambient}"
              text="${this.contentBody}"
            ></bbva-type-text>
          `:""}
    `}render(){return s`
      ${super.render()}
      <bbva-help-modal
        ambient="${this.ambient}"
        modal-type=${this.modalType}
        header-type="${this.headerType}"
        title-icon="${this.titleIcon}"
        .titleText="${this.titleText}"
        .headerText="${this.headerText}"
        .bodyText="${this.fullHeight?"":this.bodyText}"
        button-text="${this.buttonText}"
        link-text="${this.linkText}"
        ?fixed-footer="${this.fixedFooter}"
        ?sticky-footer="${this.stickyFooter}"
        ?full-height="${this.fullHeight}"
        ?hide-content-padding-top="${this.hideContentPaddingTop}"
        ?visible="${this.visible}"
        @visible-changed="${this._changeVisible}"
        @help-modal-footer-button-click="${this.footerButtonClick}"
        @help-modal-header-click="${this._closeButtonClick}"
        @help-modal-veil-click="${this.cancelModal}"
      >
        <div class="content" slot="slot-content">${this._modalContent}</div>
      </bbva-help-modal>
    `}}class Ze extends Qe{static get is(){return"rewards-member-get-member-modal-retry-error"}static get styles(){return[super.styles,r("rewards-member-get-member-modal-retry-error-shared-styles")]}constructor(){super(),this.configs()}configs(){Object.assign(this,{modalType:"warning",titleIcon:b(),shouldTransition:!0,hideContentPaddingTop:!0,headerText:this.t("rewards-member-get-member-modal-retry-error-title"),contentBody:this.t("rewards-member-get-member-modal-retry-error-description"),buttonText:this.t("rewards-member-get-member-modal-retry-error-button")})}footerButtonClick(){this.dispatchCustomEvent("rewards-member-get-member-modal-retry-error-click",{}),super.footerButtonClick()}cancelModal(){this.footerButtonClick(),super.cancelModal()}}class et extends Qe{static get is(){return"rewards-member-get-member-modal-exit-error"}static get styles(){return[super.styles,r("rewards-member-get-member-modal-exit-error-shared-styles")]}constructor(){super(),this.configs()}configs(){Object.assign(this,{modalType:"warning",fixedFooter:!0,fullHeight:!0,contentMicroillustration:"error",stickyFooter:!0,contentTitle:this.t("rewards-member-get-member-modal-exit-error-title"),headerText:this.t("rewards-member-get-member-modal-exit-error-header"),contentBody:this.t("rewards-member-get-member-modal-exit-error-description"),buttonText:this.t("rewards-member-get-member-modal-exit-error-button")})}footerButtonClick(){this.dispatchCustomEvent("rewards-member-get-member-modal-exit-error-click",{}),super.footerButtonClick()}cancelModal(){this.footerButtonClick(),super.cancelModal()}_changeVisible(e){e.detail&&this.dispatchEvent(new CustomEvent("rewards-member-get-member-modal-exit-error-visible-change",{bubbles:!0,composed:!0}))}}var tt=e`
  :host {
    display: block;
    box-sizing: border-box;
    --_rewards-member-get-member-bg-color: var(
      --rewards-member-get-member-bg-color,
      ${L("colorPrimarySurfaceAmbientDefault",P)}
    );
    --bbva-progress-content-z-index: calc(var(--_modal-z-index, 10) + 1);
    background-color: var(--_rewards-member-get-member-bg-color);
  }

  :host([hidden]),
  [hidden] {
    display: none !important;
  }

  [data-tag-name='bbva-transition-container'] {
    --bbva-transition-container-padding: 0;
    --bbva-transition-container-padding-bottom: 0;
    --bbva-transition-container-safe-area-inset-top: 0;
    --bbva-transition-container-text-align: normal;
    --bbva-transition-container--custom--primary-ambient--content-bg-color: var(
      --_rewards-member-get-member-bg-color
    );
    height: 100%;
  }

  *,
  *::before,
  *::after {
    box-sizing: inherit;
  }
`;class it extends(t(f(_(i)))){static get is(){return"rewards-member-get-member"}static get scopedElements(){const e=[Y,Ee,Re,je,Ge,Xe,Ye,Ze,et,...it.configurationScopedElements()];return it.scopedElementsFromClasses(e)}static get properties(){return{username:{type:String},offerViewIds:{type:Array,attribute:"offer-view-ids"},campaignsApiVersion:{type:String,attribute:"campaigns-api-version"},labelId:{type:String,attribute:"label-id"},loyaltyApiVersion:{type:String,attribute:"loyalty-api-version"},aemHost:{type:String,attribute:"aem-host"},aemPath:{type:String,attribute:"aem-path"},aemCachetype:{type:String,attribute:"aem-cachetype"},aemCachekey:{type:String,attribute:"aem-cachekey"},contentFragmentIds:{type:Object,attribute:"content-fragment-ids"},appSettingsApiVersion:{type:String,attribute:"app-settings-api-version"},publicSettings:{type:Object,attribute:"public-settings"},publicSettingsId:{type:String,attribute:"public-settings-id"},publicSettingsConfigKey:{type:String,attribute:"public-settings-config-key"},publicSettingsCachetype:{type:String,attribute:"public-settings-cachetype"},publicSettingsCachekey:{type:String,attribute:"public-settings-cachekey"},documentsApiVersion:{type:String,attribute:"documents-api-version"},country:{type:String},maxErrorRetries:{type:Number,attribute:"max-error-retries"},urlBbvaPoints:{type:String,attribute:"url-bbva-points"},promotionSummariesStoreIconsMapping:{type:Object,attribute:"promotion-summaries-store-icons-mapping"},documentFileLocalCustomProperties:{type:Object,attribute:"document-file-local-custom-properties"},termsAndConditionsDocumentDetail:{type:Object},tabSelected:{type:Number,attribute:"tab-selected"},productIdOfOffersHidden:{type:Array},_dynamicDetailVisible:{type:Boolean},_rewardDetailVisible:{type:Boolean},_rewardHistoryVisible:{type:Boolean},_bonusDetailVisible:{type:Boolean},_dynamics:{type:Array},_dynamicsLoadError:{type:Boolean},_rewards:{type:Array},_rewardsLoadError:{type:Boolean},_dynamicDetailId:{type:String},_dynamicDetail:{type:Object},_rewardDetailId:{type:String},_rewardDetail:{type:Object},_rewardHistory:{type:Array},_rewardHistoryRewardId:{type:String},_bonusDetailId:{type:String},_bonusDetail:{type:Object},_bonusDetailRewardId:{type:String},_loadError:{type:Boolean},_numLoadError:{type:Number},flagsLoaded:{type:Boolean,attribute:"flags-loaded"}}}constructor(){super(),this.config={header:{variant:"first-level-sequential",text:this.t("rewards-member-get-member-header-title"),buttons:we,showLeftICon:!0,"@header-main-icon-click":this._onClickHeaderIcon.bind(this)},loader:!0,notify:!1,back:!1},this.ambient="primary",this.username="",this.offerViewIds=[],this.campaignsApiVersion="1",this.loyaltyApiVersion="1",this.labelId="",this.aemHost="",this.aemPath="",this.aemCachetype="",this.aemCachekey="aem-content-fragment",this.contentFragmentIds={mgmofferdetail:"mgm-offerdetail-id",mgmofferdetaildinamics:"mgm-offerdetail-dinamics-id"},this.appSettingsApiVersion="0",this.publicSettings={},this.publicSettingsHost="",this.publicSettingsConfigKey="",this.publicSettingsCachetype="",this.publicSettingsCachekey="public-settings",this.publicSettingsRequiredToken="none",this.requiredToken="none",this.host="",this.native=!1,this.documentsApiVersion="1",this.country="",this.maxErrorRetries=3,this.urlBbvaPoints="",this.promotionSummariesStoreIconsMapping={},this.documentFileLocalCustomProperties={},this.termsAndConditionsDocumentDetail={},this.productIdOfOffersHidden=[],this.flagsLoaded=!1,this.reset()}static get styles(){return[tt,r("rewards-member-get-member-shared-styles")]}firstUpdated(e){super.firstUpdated(e),this._dm=this.shadowRoot.querySelector('[data-tag-name="rewards-member-get-member-dm"]')}updated(e){super.updated(e),(e.has("_loadError")&&this._loadError||e.has("_rewardsLoadError")&&this._rewardsLoadError||e.has("_dynamicsLoadError")&&this._dynamicsLoadError)&&(this._numLoadError+=1)}reset(){this._numLoadError=0,this._rewards=void 0,this._dynamics=void 0,this._dynamicDetailVisible=!1,this._rewardDetailVisible=!1,this._rewardHistoryVisible=!1,this._bonusDetailVisible=!1,this._rewardsLoadError=!1,this._dynamicsLoadError=!1,this._loadError=!1,this.tabSelected=0,this._resetDynamicDetailProperties(),this._resetRewardDetailProperties(),this._resetRewardHistoryProperties(),this._resetBonusDetailProperties()}_resetDynamicDetailProperties(){this._dynamicDetailId="",this._dynamicDetail={}}_resetRewardDetailProperties(){this._rewardDetailId="",this._rewardDetail={}}_resetRewardHistoryProperties(){this._rewardHistory=[],this._rewardHistoryRewardId=""}_resetBonusDetailProperties(){this._bonusDetailId="",this._bonusDetail={},this._bonusDetailRewardId=""}_resetPage(e){this.shadowRoot.querySelector(`[data-tag-name="${e}"]`).reset()}get maxLoadRetriesReached(){return this._numLoadError>this.maxErrorRetries}get _modalRetryErrorVisible(){return!this.maxLoadRetriesReached&&this._loadError}get _modalExitErrorVisible(){return this.maxLoadRetriesReached&&this._loadError}get _dynamicAndRewardsTemplate(){return s`
      <rewards-member-get-member-dynamics-and-rewards
        aem-host="${this.aemHost}"
        ambient="${this.ambient}"
        tab-selected="${n(this.tabSelected)}"
        language="${this.language}"
        .dynamics="${this._dynamics}"
        ?flags-loaded="${this.flagsLoaded}"
        .rewards="${this._rewards}"
        .offerViewIds="${this.offerViewIds}"
        ?dynamics-load-error="${this._dynamicsLoadError}"
        ?rewards-load-error="${this._rewardsLoadError}"
        ?max-load-retries-reached="${this.maxLoadRetriesReached}"
        @rewards-member-get-member-dynamics-and-rewards-tab-change="${this._onTabChangeDynamicAndRewards}"
        @rewards-member-get-member-dynamics-dynamic-click="${this._onClickDynamicDynamics}"
        @rewards-member-get-member-dynamics-dynamics-get="${this._onGetDynamicsDynamics}"
        @rewards-member-get-member-rewards-reward-click="${this._onClickRewardRewards}"
        @rewards-member-get-member-rewards-rewards-get="${this._onGetRewardsRewards}"
      >
      </rewards-member-get-member-dynamics-and-rewards>
    `}get _dynamicDetailTemplate(){return s`
      <bbva-transition-container
        ambient="${this.ambient}"
        header-text="${this.t("rewards-member-get-member-dynamic-detail-header-title")}"
        header-show-left-icon
        reset-scroll
        header-type="first-level-sequential"
        .headerButtons="${we}"
        ?visible="${this._dynamicDetailVisible}"
        @header-main-icon-click="${this._onClickHeaderMainIconDynamicDetail}"
      >
        <div slot="slot-content" class="container">
          <rewards-member-get-member-dynamic-detail
            .aemHost="${this.aemHost}"
            id="${this._dynamicDetailId}"
            .dynamic="${this._dynamicDetail}"
            ?visible="${this._dynamicDetailVisible}"
            ambient="${this.ambient}"
            @rewards-member-get-member-dynamic-detail-dynamic-get="${this._onGetDynamicDynamicDetail}"
            @rewards-member-get-member-dynamic-detail-cta-click="${this._onClickCtaDynamicDetail}"
            @rewards-member-get-member-dynamic-detail-terms-and-conditions-click="${this._onClickTermsAndConditions}"
          >
          </rewards-member-get-member-dynamic-detail>
        </div>
      </bbva-transition-container>
    `}get _rewardDetailTemplate(){return s`
      <bbva-transition-container
        ambient="${this.ambient}"
        header-text="${this.t("rewards-member-get-member-reward-detail-header-title")}"
        header-show-left-icon
        header-type="first-level-sequential"
        reset-scroll
        .headerButtons="${we}"
        ?visible="${this._rewardDetailVisible}"
        @header-main-icon-click="${this._onClickHeaderMainIconRewardDetail}"
      >
        <div slot="slot-content" class="container">
          <rewards-member-get-member-reward-detail
            username="${this.username}"
            id="${this._rewardDetailId}"
            .reward="${this._rewardDetail}"
            ?visible="${this._rewardDetailVisible&&!this._rewardHistoryVisible}"
            language="${this.language}"
            ambient="${this.ambient}"
            url-bbva-points="${this.urlBbvaPoints}"
            @rewards-member-get-member-reward-detail-reward-get="${this._onGetRewardRewardDetail}"
            @rewards-member-get-member-reward-detail-history-click="${this._onClickHistoryRewardDetail}"
            @rewards-member-get-member-reward-detail-terms-and-conditions-click="${this._onClickTermsAndConditions}"
            @rewards-member-get-member-reward-detail-cta-click="${this._onClickCtaRewardDetail}"
          >
          </rewards-member-get-member-reward-detail>
        </div>
      </bbva-transition-container>
    `}get _rewardHistoryTemplate(){return s`
      <bbva-transition-container
        ambient="${this.ambient}"
        header-text="${this.t("rewards-member-get-member-reward-history-header-title")}"
        header-show-left-icon
        reset-scroll
        header-type="first-level-sequential"
        .headerButtons="${we}"
        ?visible="${this._rewardHistoryVisible}"
        @header-main-icon-click="${this._onClickHeaderMainIconRewardHistory}"
      >
        <div slot="slot-content" class="container">
          <rewards-member-get-member-reward-history
            reward-id="${this._rewardHistoryRewardId}"
            .rewardHistory="${this._rewardHistory}"
            ?visible="${this._rewardHistoryVisible&&!this._bonusDetailVisible}"
            language="${this.language}"
            ambient="${this.ambient}"
            @rewards-member-get-member-reward-history-reward-history-get="${this._onGetRewardHistoryRewardHistory}"
            @rewards-member-get-member-reward-history-bonus-click="${this._onClickBonusRewardHistory}"
          >
          </rewards-member-get-member-reward-history>
        </div>
      </bbva-transition-container>
    `}get _bonusDetailTemplate(){return s`
      <bbva-transition-container
        ambient="${this.ambient}"
        header-text="${this.t("rewards-member-get-member-bonus-detail-header-title")}"
        header-show-left-icon
        reset-scroll
        header-type="first-level-sequential"
        .headerButtons="${we}"
        ?visible="${this._bonusDetailVisible}"
        @header-main-icon-click="${this._onClickHeaderMainIconBonusDetail}"
      >
        <div slot="slot-content" class="container">
          <rewards-member-get-member-bonus-detail
            username="${this.username}"
            id="${this._bonusDetailId}"
            reward-id="${this._bonusDetailRewardId}"
            .bonus="${this._bonusDetail}"
            ?visible="${this._bonusDetailVisible}"
            ambient="${this.ambient}"
            language="${this.language}"
            url-bbva-points="${this.urlBbvaPoints}"
            .promotionSummariesStoreIconsMapping="${this.promotionSummariesStoreIconsMapping}"
            @rewards-member-get-member-bonus-detail-bonus-get="${this._getBonusBonusDetail}"
            @rewards-member-get-member-bonus-detail-terms-and-conditions-click="${this._onClickTermsAndConditions}"
            @rewards-member-get-member-bonus-detail-cta-click="${this._onClickCtaBonusDetail}"
          >
          </rewards-member-get-member-bonus-detail>
        </div>
      </bbva-transition-container>
    `}get _modalErrorRetriesTemplate(){return s`
      <rewards-member-get-member-modal-retry-error
        ambient="${this.ambient}"
        ?visible="${this._modalRetryErrorVisible}"
        @rewards-member-get-member-modal-retry-error-click="${this._handleModalRetryErrorClick}"
      >
      </rewards-member-get-member-modal-retry-error>
    `}get _modalExitErrorTemplate(){return s`
      <rewards-member-get-member-modal-exit-error
        ambient="${this.ambient}"
        ?visible="${this._modalExitErrorVisible}"
        @rewards-member-get-member-modal-exit-error-click="${this._handleModalExitErrorClick}"
      >
      </rewards-member-get-member-modal-exit-error>
    `}get _dataManagerTemplate(){return s`
      <rewards-member-get-member-dm
        ambient="${this.ambient}"
        country="${this.country}"
        language="${this.language}"
        campaigns-api-version="${this.campaignsApiVersion}"
        loyalty-api-version="${this.loyaltyApiVersion}"
        label-id="${this.labelId}"
        aem-host="${this.aemHost}"
        aem-path="${this.aemPath}"
        aem-cachetype="${this.aemCachetype}"
        aem-cachekey="${this.aemCachekey}"
        required-token="${this.requiredToken}"
        host="${this.host}"
        ?native="${this.native}"
        .documentFileLocalCustomProperties="${this.documentFileLocalCustomProperties}"
        .productIdOfOffersHidden="${this.productIdOfOffersHidden}"
        .contentFragmentIds="${this.contentFragmentIds}"
        app-settings-api-version="${this.appSettingsApiVersion}"
        .publicSettings="${this.publicSettings}"
        public-settings-host="${this.publicSettingsHost}"
        public-settings-id="${this.publicSettingsId}"
        public-settings-config-key="${this.publicSettingsConfigKey}"
        public-settings-cachetype="${this.publicSettingsCachetype}"
        public-settings-cachekey="${this.publicSettingsCachekey}"
        public-settings-required-token="${this.publicSettingsRequiredToken}"
        documents-api-version="${this.documentsApiVersion}"
        @rewards-member-get-member-dm-dynamics-fetch="${this._onFetchDynamics}"
        @rewards-member-get-member-dm-dynamics-error-fetch="${this._onFetchDynamicsError}"
        @rewards-member-get-member-dm-dynamic-fetch="${this._onFetchDynamic}"
        @rewards-member-get-member-dm-dynamic-error-fetch="${this._onFetchDynamicError}"
        @rewards-member-get-member-dm-rewards-fetch="${this._onFetchRewards}"
        @rewards-member-get-member-dm-rewards-error-fetch="${this._onFetchRewardsError}"
        @rewards-member-get-member-dm-reward-fetch="${this._onFetchReward}"
        @rewards-member-get-member-dm-reward-error-fetch="${this._onFetchRewardError}"
        @rewards-member-get-member-dm-reward-history-fetch="${this._onFetchRewardHistory}"
        @rewards-member-get-member-dm-reward-history-error-fetch="${this._onFetchRewardHistoryError}"
        @rewards-member-get-member-dm-bonus-fetch="${this._onFetchBonus}"
        @rewards-member-get-member-dm-bonus-fetch-error="${this._onFetchBonusError}"
        @rewards-member-get-member-dm-terms-and-conditions-fetch="${this._onFetchTermsAndConditions}"
        @rewards-member-get-member-dm-terms-and-conditions-fetch-error="${this._onFetchTermsAndConditionsError}"
      >
      </rewards-member-get-member-dm>
    `}navigateToDynamicDetail(e){const{offerId:t}=e;this._dynamicDetailVisible=!0,this._dynamicDetailId=t}navigateToBonusDetail(e){const{promotionId:t,promotionSummariesId:i}=e;this._rewardDetailVisible=!0,this._rewardHistoryVisible=!0,this._bonusDetailVisible=!0,this._rewardDetailId=t,this._rewardHistoryRewardId=t,this._bonusDetailRewardId=t,this._bonusDetailId=i}_onClickHeaderIcon(e){const{index:t}=e.detail,i=t?"menu-clicked":"exit-clicked",r=t?"header-main-icon-click":"header-secondary-icon-click";this.dispatchEvent(new CustomEvent(i,{bubbles:!0,composed:!0})),this.dispatchEvent(new CustomEvent("rewards-member-get-member-navigation-external",{detail:{id:r},bubbles:!0,composed:!0}))}_onClickHeaderMainIconDynamicDetail(e){const{index:t}=e.detail;t?this._onClickHeaderIcon(e):this._dynamicDetailVisible=!1}_onClickHeaderMainIconRewardDetail(e){const{index:t}=e.detail;t?this._onClickHeaderIcon(e):this._rewardDetailVisible=!1}_onClickHeaderMainIconRewardHistory(e){const{index:t}=e.detail;t?this._onClickHeaderIcon(e):this._rewardHistoryVisible=!1}_onClickHeaderMainIconBonusDetail(e){const{index:t}=e.detail;t?this._onClickHeaderIcon(e):this._bonusDetailVisible=!1}async _onClickDynamicDynamics(e){const{productId:t}=e.detail;this._resetDynamicDetailProperties(),this._resetPage("rewards-member-get-member-dynamic-detail"),await this.requestUpdate(),this._dynamicDetailId=t,this._dynamicDetailVisible=!0,this._updateOfferViewIds(t)}async _onClickRewardRewards(e){const{id:t}=e.detail;this._resetRewardDetailProperties(),this._dm.resetPromotionSummaries(),this._resetPage("rewards-member-get-member-reward-detail"),await this.requestUpdate(),this._rewardDetailId=t,this._rewardDetailVisible=!0}async _onClickHistoryRewardDetail(e){const{id:t}=e.detail;this._resetRewardHistoryProperties(),this._resetPage("rewards-member-get-member-reward-history"),await this.requestUpdate(),this._rewardHistoryRewardId=t,this._rewardHistoryVisible=!0}async _onClickBonusRewardHistory(e){const{id:t,rewardId:i}=e.detail;this._resetBonusDetailProperties(),this._resetPage("rewards-member-get-member-bonus-detail"),await this.requestUpdate(),this._bonusDetailId=t,this._bonusDetailRewardId=i,this._bonusDetailVisible=!0}_onClickCtaDynamicDetail(e){const{productId:t,offerId:i}=e.detail;this._dynamicDetailVisible=!1,this._dispatchInviteClickEvent(t,i)}_dispatchInviteClickEvent(e="",t=""){this.dispatchEvent(new CustomEvent("rewards-member-get-member-invite-click",{bubbles:!0,composed:!0,detail:{productId:e,offerId:t}}))}_onClickTermsAndConditions(e){const{documentId:t}=e.detail;this.showLoader("transparent"),this._dm.getTermsAndConditions(t)}_onClickCtaRewardDetail(){this.tabSelected=0,this._rewardDetailVisible=!1}_onClickCtaBonusDetail(){this.tabSelected=0,this._rewardDetailVisible=!1,this._rewardHistoryVisible=!1,this._bonusDetailVisible=!1}_onGetDynamicsDynamics(){this._dynamicsLoadError=!1,this._dm.getDynamics()}_onGetRewardsRewards(){this._rewardsLoadError=!1,this._dm.getRewards()}_onGetDynamicDynamicDetail(e){const{id:t}=e.detail;this._dm.getDynamic(t)}_onGetRewardRewardDetail(e){const{id:t}=e.detail;this._dm.getReward(t)}_onGetRewardHistoryRewardHistory(e){const{rewardId:t}=e.detail;this._dm.getRewardHistory(t)}_getBonusBonusDetail(e){const{rewardId:t,id:i}=e.detail;this._dm.getBonus(t,i)}_onFetchDynamics(e){this._dynamics=e.detail}_onFetchDynamicsError(){this._dynamicsLoadError=!0}_onFetchDynamic(e){this._dynamicDetail=e.detail}_onFetchDynamicError(){this._loadError=!0,this._dynamicDetailVisible=!1}_onFetchRewards(e){this._rewards=e.detail}_onFetchRewardsError(){this._rewardsLoadError=!0}_onFetchReward(e){this._rewardDetail=e.detail}_onFetchRewardError(){this._loadError=!0,this._rewardDetailVisible=!1}_onFetchRewardHistory(e){this._rewardHistory=e.detail}_onFetchRewardHistoryError(){this._loadError=!0,this._rewardHistoryVisible=!1}_onFetchBonus(e){this._bonusDetail=e.detail}_onFetchBonusError(){this._loadError=!0,this._bonusDetailVisible=!1}_onFetchTermsAndConditions(e){const{detail:t}=e;this.clearLoader(),this.dispatchEvent(new CustomEvent("rewards-member-get-member-terms-and-conditions-document",{bubbles:!0,composed:!0,detail:{value:t.replace(/(\r\n|\n|\r)/gm,""),...this.termsAndConditionsDocumentDetail}}))}_onFetchTermsAndConditionsError(){this.clearLoader(),this._loadError=!0}_handleModalRetryErrorClick(){this._loadError=!1}_handleModalExitErrorClick(){this._loadError=!1,this.dispatchEvent(new CustomEvent("rewards-member-get-member-exit-error-click",{bubbles:!0,composed:!0}))}_updateOfferViewIds(e){this.offerViewIds=this.offerViewIds.includes(e)?this.offerViewIds:[...this.offerViewIds,e],this.dispatchEvent(new CustomEvent("rewards-member-get-member-offer-view-ids",{bubbles:!0,composed:!0,detail:{offerViewIds:this.offerViewIds}}))}_onTabChangeDynamicAndRewards(e){var t;this.tabSelected=null===(t=e.detail)||void 0===t?void 0:t.tabSelected}render(){return s`
      ${super.render()} ${this._dynamicAndRewardsTemplate} ${this._dynamicDetailTemplate}
      ${this._rewardDetailTemplate} ${this._rewardHistoryTemplate} ${this._bonusDetailTemplate}
      ${this._dataManagerTemplate} ${this._modalErrorRetriesTemplate}
      ${this._modalExitErrorTemplate}
    `}}customElements.define("rewards-member-get-member",it);const rt={mgm_data:{data:{products:[{id:"0798",productType:"PAYROLL_PORTABILITY",documentProductId:"GMDMGMT001",documentProductSize:"115kb"},{id:"0795",productType:"CREDIT_CARD",documentProductId:"GMDTCMG001",documentProductSize:"44kb"}],offers:[{id:"0798",documentOfferId:"GMDMGMT001",documentSize:"115kb"},{id:"0795",documentOfferId:"GMDTCMG001",documentSize:"44kb"}]}}};class st extends i{static get is(){return"bbva-controller-member-get-member"}static get properties(){return{localStorageKey:{type:String},productsConfiguration:{type:Object},featureFlagsCollection:{type:Object},customerFirstName:{type:String},appSettingsKey:{type:String}}}constructor(){super(),this.productsConfiguration={},this.featureFlagsCollection={},this.customerFirstName="",this.localStorageKey="",this.appSettingsKey=""}init(){this.handleTermsAndConditionsData(),this.getProductIdOfOffersHidden(),this.handleGetOfferViewIdsFromLocalStorage(),this.getPromotionSummariesStoreIconsMapping()}handleTermsAndConditionsData(){this.dispatchEvent(new CustomEvent("bbva-controller-member-get-member-terms-and-conditions",{detail:rt,bubbles:!0,composed:!0}))}setOfferViewIdsInLocalStorage(e){this.dispatchEvent(new CustomEvent("bbva-controller-member-get-member-set-offer-id-in-localstorage",{detail:{key:this.localStorageKey,value:null==e?void 0:e.offerViewIds,secure:!1},bubbles:!0,composed:!0}))}handleGetOfferViewIdsFromLocalStorage(){this.dispatchEvent(new CustomEvent("bbva-controller-member-get-member-get-offer-view-ids",{detail:{key:this.localStorageKey},bubbles:!0,composed:!0}))}getOfferViewIdsFromLocalStorage(e){this.dispatchEvent(new CustomEvent("bbva-controller-member-get-member-get-offer-view-ids-success",{detail:e}))}onLocalStorageOfferViewIdsError(){this.dispatchEvent(new CustomEvent("bbva-controller-member-get-member-get-offer-view-ids-error"))}dispatchProductEvent(e){var t;const{productsConfiguration:i={}}=this,r=null==e?void 0:e.productId,s=r?null===(t=i[r])||void 0===t?void 0:t.productKey:"";s&&this.dispatchEvent(new CustomEvent(`bbva-controller-member-get-member-${s}`,{detail:null==e?void 0:e.offerId,bubbles:!0,composed:!0}))}getPromotionSummariesStoreIconsMapping(){const e={5411:h(),5812:g(),5912:u(),5311:p()};this.dispatchEvent(new CustomEvent("bbva-controller-member-get-member-get-prommotion-summaries-store-icons-mapping",{bubbles:!0,composed:!0,detail:e}))}getProductIdOfOffersHidden(){const{featureFlagsCollection:e,productsConfiguration:t={}}=this,i=[];Object.keys(t).forEach((r=>{var s;const a=t[r].featureFlag||"";(null===(s=e[a])||void 0===s?void 0:s.value)||!1||i.push(r)})),this._handleFlagsLoaded(e),this.dispatchEvent(new CustomEvent("bbva-controller-member-get-member-get-product-id-of-offers-hidden",{bubbles:!0,composed:!0,detail:i}))}_handleFlagsLoaded(e){Object.keys(e).length>0&&this.dispatchEvent(new CustomEvent("bbva-controller-member-get-member-flags-loaded",{bubbles:!0,composed:!0,detail:!0}))}setCustomerToGlobalCache(e){this.customerFirstName=null==e?void 0:e.firstName,this.dispatchEvent(new CustomEvent("bbva-controller-member-get-member-customer-first-name",{bubbles:!0,composed:!0,detail:this.customerFirstName}))}navigateFromNotification(e){if(e&&"object"==typeof e){const t=(null==e?void 0:e.action)||!1,i=(null==e?void 0:e.eventID)||!1;t&&!i&&this.dispatchEvent(new CustomEvent("bbva-controller-member-get-member-navigate-to-dynamic-detail",{detail:{offerId:t},bubbles:!0,composed:!0}))}if(e&&"object"==typeof e){const t=1;((null==e?void 0:e.eventID)||!1)&&this.dispatchEvent(new CustomEvent("bbva-controller-member-get-member-navigate-to-rewards",{detail:t,bubbles:!0,composed:!0}))}}getExternalUrlBbvaPoints(e){if(Object.keys(e).length){const{url:t=""}=e[this.appSettingsKey]||{};t&&this.dispatchEvent(new CustomEvent("bbva-controller-member-get-member-bbva-points-url",{detail:t,bubbles:!0,composed:!0}))}}}customElements.define(st.is,st);class at extends(ae(i)){static get is(){return"bbva-analyticmanager-dynamics-and-rewards"}static get properties(){return{_hasRewardDetailLoaded:{type:Boolean}}}constructor(){super(),this._hasRewardDetailLoaded=!1}firePageViewDynamicsAndRewards(){this._dispatch("analytics-page-view")}firePageViewBonusDetail(){this._dispatch("analytics-page-view-bonus-detail")}fireAppVisit(e){const t={"0795":"tdc","0798":"portability"};if(e&&e.productId){const i=t[e.productId];i&&this._dispatch("analytics-app-page-visit-"+i)}}firePageViewRewardDetail(){this._hasRewardDetailLoaded||this._dispatch("analytics-page-view-reward-detail"),this._hasRewardDetailLoaded=!0}firePageViewRewardHistory(){this._dispatch("analytics-page-view-reward-history")}fireErrorPageView(){this._dispatch("analytics-error-page-view")}fireAppOnClickStart(e){const t={"0795":"tdc","0798":"portability"};if(e&&e.productId){const i=t[e.productId];i&&this._dispatch("analytics-app-on-click-start-"+i)}}fireAppStartedRegister(e){const t={"0795":"tdc","0798":"portability"};if(e&&e.productId){const i=t[e.productId];i&&this._dispatch("analytics-app-started-register-"+i)}}fireAppStartedTerms(e){const t={GMDTCMG001:"tdc",GMDMGMT001:"portability"};if(e&&e.documentId){const i=t[e.documentId];i&&this._dispatch("analytics-app-started-terms-"+i)}}_dispatch(e,t){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}}customElements.define(at.is,at);
