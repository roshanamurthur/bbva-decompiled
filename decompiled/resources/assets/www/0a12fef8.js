import{H as e,z as t,an as i,L as s,h as n,aD as a,ah as r,cU as o,aN as l,bn as d,aU as c,W as h,dH as u,aZ as p,J as m,cT as _,ak as b}from"./952f98a9.js";import{M as g,L as f,K as y,e as v,x as S,G as E,f as C,a2 as R,H as $,I as T,Q as x,F as A,an as w,at as O}from"./216055dc.js";import{bP as I,bT as k,a2 as q,a3 as D,cc as P,bf as N,bg as L}from"./7f3d7ca9.js";import{B as F}from"./b0866b92.js";import{B as H}from"./30ef6f1f.js";import{B as M}from"./d335c75d.js";import{B as j}from"./6b902eda.js";import{B as V}from"./41ed0536.js";import{B as U}from"./2b04e291.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./854beed0.js";import"./84dff06e.js";const B="Dispon.",G="MXN",z="es-mx",K="MXN",J="bbva-feature-oc-fund-equity-contract",X="8:30",W="13:00",Y="https://portal.bbva.mx/siabinternet/Repositorio/import/doctos/analisis",Q="1234567890",Z="MISMO DIA",ee=e((e=>class extends e{static get properties(){return{currencyCode:{type:String},language:{type:String},localCurrency:{type:String},_analyticsCache:{type:Object},_localePrefix:{type:String}}}constructor(){super(),this.currencyCode=G,this.language=z,this.localCurrency=K,this._analyticsCache={},this._localePrefix=J}openModal(e){this.shadowRoot.querySelector(`#${e}`).open()}_capitalize(e){return`${e.charAt(0).toUpperCase()}${e.slice(1).toLowerCase()}`}_closeModal(e){this.shadowRoot.querySelector(`#${e}`).close()}_fireAnalytic(e,t){t&&this._fireData(t),this._fireEvent("fire-analytics-step",{currentStep:e})}_fireDataLevel(e){const t={level3:["1 construye tu estrategia","1 selecciona fondo"],level4:["todos los fondos","rendimientos","detalle"],level5:["rendimientos","detalle"]},i=Object.keys(e).reduce(((i,s)=>({...i,[`pageVisit${this._capitalize(s)}`]:t[s][e[s]]||""})),{});this._fireData(i)}_fireData(e){this._analyticsCache={...this._analyticsCache,...e},this._fireEvent("analytics-persist-data",e)}_fireEvent(e,t){this.dispatchEvent(new CustomEvent(e,{composed:!0,bubbles:!0,detail:t}))}_handleClick(){this._fireEvent("fund-element-click")}_locale(e,t){return this.t(`${this._localePrefix}-${e}`,t)}_mask(e,t=4){return e?`•${String(e).slice(-t)}`:""}}));var te=t`
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

[data-tag-name='bbva-type-text'] {
  font-size: 0.9375rem;

  & + .subtitle {
    margin-top: 1rem;
  }
}

[slot=slot-header] {
  padding: 1rem 1rem 0;
}

.main-icon {
  margin: 1.5rem 0 1rem;
}
.main-icon.info {
  fill: #004481;
}

.title {
  margin: 0 0 0.5rem;
  font-size: 1.25rem;
  font-weight: 500;
  line-height: 1.5rem;
}

.subtitle {
  font-size: 1.125rem;
  font-weight: 500;
}
`;class ie extends(g(f(i(ee(s))))){static get is(){return"alert-modals"}static get scopedElements(){const e=[y,v,S,E,...ie.configurationScopedElements()];return ie.scopedElementsFromClasses(e)}static get properties(){return{operationStart:{type:String}}}constructor(){super(),this.operationStart=""}static get styles(){return[te]}render(){return n`
      <bbva-help-modal
        id="fundKeyModal"
        hide-content-padding-top
        full-height
        full-width
        fixed-footer
        button-text=${this._locale("btn-label-understood")}
        header-text=${this._locale("fund-key-modal-title")}
      >
        <div slot="slot-content">
          <bbva-type-icon class="main-icon info" icon=${a()} size="24"></bbva-type-icon>
          <bbva-type-text
            class="subtitle"
            unset
            text=${this._locale("fund-key-modal-title")}
          ></bbva-type-text>
          <bbva-type-text unset text=${this._locale("fund-key-modal-description")}></bbva-type-text>
        </div>
      </bbva-help-modal>

      <bbva-help-modal
        id="investDefinitionModal"
        hide-content-padding-top
        full-height
        full-width
        fixed-footer
        button-text=${this._locale("btn-label-understood")}
        header-text=${this._locale("investment-step-investment-amount-title")}
      >
        <div slot="slot-content">
          <bbva-type-icon class="main-icon info" icon=${a()} size="24"></bbva-type-icon>
          <bbva-type-text
            class="subtitle"
            unset
            text=${this._locale("investment-amount-modal-titles-estimate-title")}
          ></bbva-type-text>
          <bbva-type-text unset text=${this._locale("investment-amount-modal-titles-estimate")}></bbva-type-text>

          <bbva-type-text
            class="subtitle"
            unset
            text=${this._locale("investment-amount-modal-serie-title")}
          ></bbva-type-text>
          <bbva-type-text unset text=${this._locale("investment-amount-modal-serie-text")}></bbva-type-text>
        </div>
      </bbva-help-modal>

      <bbva-help-modal
        id="privacyModal"
        hide-content-padding-top
        full-height
        full-width
        fixed-footer
        button-text=${this._locale("btn-label-understood")}
        header-text=${this._locale("notice-privacy-label")}
      >
        <div slot="slot-content">
          <bbva-type-icon class="main-icon info" icon=${r()} size="24"></bbva-type-icon>
          <bbva-type-text
            class="subtitle"
            unset
            text=${this._locale("notice-privacy-modal-subtitle")}
          ></bbva-type-text>
          <bbva-type-text
            unset
            text=${this._locale("notice-privacy-modal-text-one")}
          ></bbva-type-text>
          <bbva-type-text text=${this._locale("notice-privacy-modal-text-two")}></bbva-type-text>
        </div>
      </bbva-help-modal>

      <bbva-help-modal
        id="fundChangeAlert"
        modal-type="caution"
        header-text="modal"
        title-icon=${o()}
        body-text=${this._locale("fund-step-edit-alert-modal-message")}
        button-text=${this._locale("btn-label-change")}
        link-text=${this._locale("btn-label-back")}
        @help-modal-footer-button-click=${()=>this._fireEvent("fund-change-accepted")}
      >
        <div slot="slot-header">
          <bbva-type-text
            unset
            class="subtitle"
            text=${this._locale("fund-step-edit-alert-modal-title")}
          ></bbva-type-text>
        </div>
      </bbva-help-modal>

      <!--------------------------------------------------------------------------------------//
      //                                        ERRORS                                        //
      //-------------------------------------------------------------------------------------->
      <bbva-help-modal
        id="noFundsModal"
        hide-content-padding-top
        full-height
        full-width
        fixed-footer
        button-text=${this._locale("btn-label-understood")}
        header-text=${this._locale("main-title")}
        @help-modal-close=${()=>this._fireEvent("error-service-exit")}
      >
        <div slot="slot-content">
          <bbva-clip-microillustration
            class="main-icon"
            microillustration="caution"
          ></bbva-clip-microillustration>
          <bbva-type-text
            class="title"
            unset
            text=${this._locale("no-funds-modal-title")}
          ></bbva-type-text>
          <bbva-type-text unset text=${this._locale("no-funds-modal-message")}></bbva-type-text>
        </div>
      </bbva-help-modal>

      <bbva-help-modal
        id="noBalanceModal"
        hide-content-padding-top
        full-height
        full-width
        fixed-footer
        button-text=${this._locale("btn-label-exit")}
        header-text=${this._locale("main-title")}
        link-text=${this._locale("btn-label-view-fund-info")}
        @help-modal-close=${()=>this._fireEvent("error-service-exit")}
      >
        <div slot="slot-content">
          <bbva-clip-microillustration
            class="main-icon"
            microillustration="accounterror"
          ></bbva-clip-microillustration>
          <bbva-type-text
            class="title"
            text=${this._locale("no-balance-modal-title")}
          ></bbva-type-text>
          <bbva-type-text text=${this._locale("no-balance-modal-message")}></bbva-type-text>
        </div>
      </bbva-help-modal>

      <bbva-help-modal
        id="fundNotAvailableModal"
        hide-content-padding-top
        full-height
        full-width
        fixed-footer
        button-text=${this._locale("btn-label-understood")}
        header-text=${this._locale("not-avaiable-fund-label")}
      >
        <div slot="slot-content">
          <bbva-clip-microillustration
            class="main-icon"
            microillustration="clock"
          ></bbva-clip-microillustration>
          <bbva-type-text
            class="title"
            text=${this._locale("not-avaiable-fund-modal-title")}
          ></bbva-type-text>
          <bbva-type-text
            text=${this._locale("not-avaiable-fund-modal-message",{start:this.operationStart})}
          ></bbva-type-text>
        </div>
      </bbva-help-modal>

      <!--------------------------------------------------------------------------------------//
      //                                    SERVICES ERROR                                    //
      //-------------------------------------------------------------------------------------->
      <bbva-help-modal
        id="bbvaCallModal"
        modal-type="warning"
        hide-content-padding-top
        full-height
        fixed-footer
        button-text=${this._locale("btn-label-call")}
        header-text=${this._locale("service-error-modal-title")}
        link-text=${this._locale("btn-label-exit")}
        @help-modal-footer-button-click=${()=>this._fireEvent("error-service-call")}
        @help-modal-footer-link-click=${()=>this._fireEvent("error-service-exit")}
        @help-modal-header-click=${()=>this._fireEvent("error-service-exit")}
      >
        <div slot="slot-content">
          <bbva-type-icon class="main-icon info" icon=${l()} size="24" icon-color="#B92A45"></bbva-type-icon>
          <bbva-type-text text=${this._locale("service-error-assistance-message")}></bbva-type-text>
        </div>
      </bbva-help-modal>

      <bbva-help-modal
        id="retryErrorModal"
        modal-type="info"
        title-text=${this._locale("service-error-modal-title")}
        button-text=${this._locale("btn-label-retry")}
        link-text=${this._locale("btn-label-exit")}
        @help-modal-footer-button-click=${()=>this._fireEvent("error-service-retry")}
        @help-modal-footer-link-click=${()=>this._fireEvent("error-service-exit")}
        @help-modal-veil-click=${()=>this._fireEvent("error-service-exit")}
      >
        <div slot="slot-content">
          <bbva-type-icon class="main-icon info" icon=${l()} size="24" icon-color="#B92A45"></bbva-type-icon>
          <bbva-type-text text=${this._locale("service-error-retry-message")}></bbva-type-text>
        </div>
      </bbva-help-modal>

      <bbva-help-modal
        id="pdvErrorModal"
        modal-type="warning"
        hide-content-padding-top
        full-height
        fixed-footer
        button-text=${this._locale("btn-label-call")}
        header-text=${this._locale("service-error-modal-title")}
        link-text=${this._locale("btn-label-exit")}
        @help-modal-footer-button-click=${()=>this._fireEvent("error-service-call")}
        @help-modal-footer-link-click=${()=>this._fireEvent("error-service-exit")}
        @help-modal-header-click=${()=>this._fireEvent("error-service-exit")}
      >
        <div slot="slot-content">
          <bbva-type-icon class="main-icon info" icon=${l()} size="24" icon-color="#B92A45"></bbva-type-icon>
          <bbva-type-text class="title" text=${this._locale("pdv-error-title")}></bbva-type-text>
          <bbva-type-text text=${this._locale("pdv-error-text")}></bbva-type-text>
        </div>
      </bbva-help-modal>

      <bbva-help-modal
        id="ppgErrorModal"
        modal-type="warning"
        hide-content-padding-top
        full-height
        fixed-footer
        button-text=${this._locale("btn-label-call")}
        header-text=${this._locale("service-error-modal-title")}
        link-text=${this._locale("btn-label-exit")}
        @help-modal-footer-button-click=${()=>this._fireEvent("error-service-call")}
        @help-modal-footer-link-click=${()=>this._fireEvent("error-service-exit")}
        @help-modal-header-click=${()=>this._fireEvent("error-service-exit")}
      >
        <div slot="slot-content">
          <bbva-type-icon class="main-icon info" icon=${l()} size="24" icon-color="#B92A45"></bbva-type-icon>
          <bbva-type-text class="title" text=${this._locale("ppg-error-title")}></bbva-type-text>
          <bbva-type-text text=${this._locale("ppg-error-text")}></bbva-type-text>
        </div>
      </bbva-help-modal>


    `}}var se=t`
  :host {
    display: block;
    padding: 1rem;
    box-sizing: border-box;
    background-color: #fff;
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

  [data-tag-name='bbva-button-default'] {
    display: block;
    margin-top: 1rem;
  }

  [data-tag-name='bbva-type-amount'] {
    font-weight: 700;
  }
`;class ne extends(g(f(i(ee(s))))){static get is(){return"confirm-pannel"}static get scopedElements(){const e=[C,R,E,...ne.configurationScopedElements()];return ne.scopedElementsFromClasses(e)}static get properties(){return{amount:{type:Number},currencyCode:{type:String},language:{type:String},localCurrency:{type:String},sticky:{type:Boolean}}}constructor(){super(),this.amount=0,this.currencyCode="MXN",this.localCurrency="MXN",this.language="es"}_onContinuePress(){this._fireEvent("submit-fund-contract",!0)}static get styles(){return[se]}render(){return n`
      <bbva-type-text unset size="S" text=${this._locale("confirm-pannel-text")}></bbva-type-text>
      <bbva-type-amount
        variant="3xl"
        amount=${this.amount}
        currency-code=${this.currencyCode}
        local-currency=${this.localCurrency}
      >
      </bbva-type-amount>
      <bbva-button-default
        fillwidth
        variant="positive"
        text=${this._locale("btn-label-confirm-purchase")}
        @click=${this._onContinuePress}
      >
      </bbva-button-default>
    `}}var ae=t`
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

  [data-tag-name='bbva-notification-message'] {
    margin: 0 1rem 1.5rem;
  }

  [data-tag-name='bbva-type-text'] {
    font-size: 0.9375rem;
  }

  [data-tag-name='fund-list'] {
    margin: 1rem 0;
  }

  .content {
    padding: 0 1rem;
  }

  .fundlist-heading {
    display: flex;
    justify-content: space-between;
    margin-top: 1rem;

    [data-tag-name='bbva-type-text'] {
      font-weight: 500;
      color: #666666;
    }
  }
`,re=t`
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

  :host(:not([hide-link])) {
    .fund-divider {
      padding: 0 1rem;
    }
  }

  [data-tag-name='bbva-type-text'] {
    font-size: 0.9375rem;
  }

  .fund-item {
    padding: 1rem;
  }

  .fund-item .title {
    margin-bottom: 0.5rem;
    font-size: 1.125rem;
    font-weight: 500;
    color: #1464a5;
  }

  .fund-item .liquidity {
    display: flex;
    justify-content: space-between;
  }

  .fund-item:hover {
    background-color: #f4f4f4;
    cursor: pointer;
  }

  .fund-item:hover .title {
    color: #004481;
  }

  .link {
    display: flex;
    justify-content: space-between;
    padding: 0.5rem 0.5rem 0.5rem 1rem;
  }

  .link [data-tag-name='bbva-type-text'],
  .link [data-tag-name='bbva-type-icon'] {
    font-weight: 500;
    color: #1464a5;
    fill: #1464a5;
  }

  .link:hover {
    background-color: #f4f4f4;
    cursor: pointer;
  }

  .link:hover [data-tag-name='bbva-type-text'],
  .link:hover [data-tag-name='bbva-type-icon'] {
    color: #004481;
    fill: #004481;
  }
`;class oe extends(g(f(i(ee(s))))){static get is(){return"fund-list"}static get scopedElements(){const e=[S,E,$,T,...oe.configurationScopedElements()];return oe.scopedElementsFromClasses(e)}static get properties(){return{hideLink:{type:Boolean,attribute:"hide-link"},list:{type:Array},limit:{type:Number},loading:{type:Boolean}}}constructor(){super(),this.hideLink=!1,this.list=[],this.limit=0,this.loading=!1}_getList(){const e=this.limit||this.list.length;return this.list.map(((e,t)=>this._tplFundItem(e,t))).splice(0,e)}_onFundPress(e){this.loading||this._fireEvent("fund-item-selected",e)}_onDetailPress(e){this.loading||this._fireEvent("show-fund-detail-pressed",e)}_tplFundItem(e,t){return n`
      <div class="fund-divider">
        <bbva-divider-default ?hidden=${0===t}></bbva-divider-default>
      </div>
      <div class="fund-list-item">
        <div
          class="fund-item"
          data-id=${e.fundName}
          @click=${()=>this._onFundPress(e)}
          @KeyDown=${this._handleClick}
        >
          <bbva-type-text
            class="title"
            ?loading=${this.loading}
            text=${e.name}
            unset
          ></bbva-type-text>
          <div class="liquidity">
            <bbva-type-text
              text=${e.description||this._locale("fund-label-liquidity")}
              ?loading=${this.loading}
              unset
            ></bbva-type-text>
            <bbva-type-text
              text=${e.liquidity}
              ?hidden=${!e.liquidity}
              ?loading=${this.loading}
              unset
            ></bbva-type-text>
          </div>
        </div>

        <div
          class="link"
          ?hidden=${this.hideLink}
          @click=${()=>this._onDetailPress(e)}
          @KeyDown=${this._handleClick}
        >
          <bbva-type-text
            unset
            ?loading=${this.loading}
            text=${this._locale("fund-label-performance-and-detail")}
          ></bbva-type-text>
          <bbva-type-icon size="24" icon=${d()}></bbva-type-icon>
        </div>
      </div>
    `}static get styles(){return[re]}render(){return n` ${this._getList()} `}}class le extends(g(f(i(ee(s))))){static get is(){return"fund-list-step-content"}static get scopedElements(){const e=[E,$,x,oe,...le.configurationScopedElements()];return le.scopedElementsFromClasses(e)}static get properties(){return{limit:{type:Number},list:{type:Array},_categoryList:{type:Array},_fundList:{type:Array},_hasCategories:{type:Boolean},_skelletonList:{type:Array}}}constructor(){super(),this.limit=0,this.list=[],this._categoryList=[],this._fundList=[],this._hasCategories=!1,this._skelletonList=[]}updated(e){e.has("limit")&&(this._skelletonList=Array.from(Array(this.limit).keys())),e.has("list")&&this._updateCategories(),e.has("_hasCategories")&&this._hasCategoriesChanged()}selectFund(e){this._onFundSelected({detail:e}),this._fireEvent("fund-item-selected",e)}_getStepDescription(){let e=this.list.length>this.limit?"fund-step-description":"fund-step-single-description";return this._hasCategories&&(e="fund-step-with-categories-description"),this._locale(e)}_hasCategoriesChanged(){this._fireEvent("has-categories-changed",this._hasCategories)}_onCategorySelected(e){var t;e.stopPropagation(),this._onViewMorePress(null===(t=e.detail)||void 0===t?void 0:t.index)}_onFundSelected({detail:e}){const t=e;this._fireEvent("update-summary",[{type:"title",label:t.name},{type:"label",label:this._locale("fund-label-liquidity"),value:t.liquidity}])}_onViewMorePress(e=0){const t={list:this._categoryList,selected:e,viewMore:1===this._categoryList.length};this._fireEvent("fund-view-more-pressed",t)}_updateCategories(){let e=[],t=[];const i=this.list.reduce(((e,t)=>{var i;const s=null==t||null===(i=t.fundClassification)||void 0===i?void 0:i.fundType.id,n={...e};return n[s]||(n[s]={category:s,name:this._locale(`fund-category-list-${s}-title`),description:this._locale(`fund-category-list-${s}-description`),fundName:s,tabName:this._locale(`fund-category-list-${s}-tab-label`),fundList:[]}),n[s].fundList.push(t),n}),{});Object.values(i).length&&(t=[...Object.values(i)].sort(((e,t)=>e.name.localeCompare(t.name))).map(((e,t)=>({...e,index:t}))),e=t[0].fundList),this._categoryList=[...t],this._fundList=[...e],this._hasCategories=this._categoryList.length>1,this.requestUpdate()}static get styles(){return[ae]}render(){return n`
      <div class="content">
        <bbva-type-text class="welcome" unset text=${this._getStepDescription()}></bbva-type-text>
        <div class="fundlist-heading" ?hidden=${this._hasCategories}>
          <bbva-type-text unset text=${this._locale("fund-step-title")}></bbva-type-text>
          <bbva-type-link
            ?hidden=${this.list.length<=this.limit}
            ?loading=${!this.list.length}
            text=${this._locale("btn-label-view-more")}
            @click=${()=>this._onViewMorePress()}
          ></bbva-type-link>
        </div>
      </div>

      ${this.list.length?"":n`
            <fund-list
              class="skelleton"
              loading
              hide-link
              .list=${this._skelletonList}
              limit=${this.limit}
            ></fund-list>
          `}
      ${this._hasCategories?n`
            <fund-list
              hide-link
              .list=${this._categoryList}
              @fund-item-selected=${this._onCategorySelected}
            ></fund-list>
          `:""}
      ${this._hasCategories?"":n`
            <fund-list
              .list=${this._fundList}
              limit=${this.limit}
              @fund-item-selected=${this._onFundSelected}
            ></fund-list>
          `}
      ${this.list.length&&!this._hasCategories?n`
            <bbva-notification-message
              book-title
              variant="caution"
              message-title=${this._locale("fund-step-notification-message")}
            ></bbva-notification-message>
          `:""}
    `}}var de=t`
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

  [data-tag-name='bbva-type-text'] {
    font-size: 0.9375rem;
  }

  [data-tag-name='bbva-form-filter'] {
    height: auto;
    padding-top: 1.25rem;
  }

  [data-tag-name='bbva-help-modal'][full-width] {
    --bbva-help-modal-padding: 0;
  }

  [data-tag-name='fund-list'] {
    margin-bottom: 0.5rem;
  }

  [data-tag-name='bbva-notification-message'] {
    margin: 2rem 1rem 0.5rem;
  }

  [data-tag-name='bbva-tab-default'] {
    margin: 0;
    --bbva-tab-default--_ambient--gradient-background: #ffffff;
  }

  .content-block {
    padding: 0 1rem;

    &.subtitle {
      margin-top: 1rem;
    }
  }

  .option-list {
    padding-bottom: 6rem;

    [data-tag-name='bbva-form-radio-button'] + [data-tag-name='bbva-form-radio-button'] {
      margin-top: 0.5rem;
    }
  }

  .search-block {
    position: sticky;
    top: 0;
    z-index: 1;
    background: #ffffff;

    [data-tag-name='bbva-form-input'] {
      --color-primary-form-input-background-default: #f4f4f4;
      padding: 0.063rem 1rem 0;
    }

    [data-tag-name='bbva-tab-default'] {
      margin: 0;
      padding-top: 0.5rem;
    }

    [data-tag-name='bbva-form-filter'] {
      padding: 1rem 1rem 0;
    }
  }

  .results-block {
    padding: 0 1rem 1rem;

    [data-tag-name='bbva-type-text'] {
      padding: 1rem 0;
    }

    [data-tag-name='bbva-clip-microillustration'] {
      margin-top: 1rem;
      max-height: 5rem;
    }

    .results-another-message {
      [data-tag-name='bbva-type-icon'] {
        display: inline-block;
        margin-right: 0.25rem;
        vertical-align: middle;
        fill: #004481;
      }
    }
  }

  .results-group-title {
    padding: 0.75rem 1rem 0;
  }

  .sticky {
    position: sticky;
    top: 0;
    background: #ffffff;
  }

  .subtitle {
    font-weight: 500;
    color: #666666;
  }

  .swipe {
    animation: swipe 0.3s ease-out;
  }

  .gb-message {
    margin: 1rem;
  }

  @keyframes swipe {
    0% {
      transform: translateX(-10rem);
    }
    100% {
      transform: translateX(0);
    }
  }
`,ce=t`
  :host {
    display: block;
    padding: 0.5rem 0;
    font-size: 0.9375rem;
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

  .document {
    display: flex;
    padding: 1rem;
    justify-content: space-between;
    color: #1464a5;
  }
  .document [data-tag-name='bbva-type-icon'] {
    min-width: 1.5rem;
    margin-right: 0.5rem;
    float: left;
    fill: #1464a5;
  }
  .document .link {
    display: block;
    line-height: 1.5rem;
    font-weight: 500;
    font-size: 1.125rem;
  }
  .document .document-status {
    padding-left: 0.5rem;
    color: #004481;
    flex-shrink: 0;
    font-style: italic;
  }
  .document .document-status[open] {
    color: #277a3e;
  }
  .document:hover {
    color: #004481;
    background: #f4f4f4;
    cursor: pointer;
  }
  .document:hover [data-tag-name='bbva-type-icon'] {
    fill: #004481;
  }

  .confirm-list {
    padding: 0.5rem 0;
  }
`;class he extends(g(f(i(ee(s))))){static get is(){return"document-list"}static get scopedElements(){const e=[I,S,E,...he.configurationScopedElements()];return he.scopedElementsFromClasses(e)}static get properties(){return{list:{type:Array},onlyLinks:{type:Boolean,attribute:"only-links"}}}constructor(){super(),this.list=[],this.onlyLinks=!1}_onCheckItemChange({checked:e},t){this._updateDocumentProperty(t,"checked",e),this._fireEvent("all-boxes-checked-change",this.list.every((e=>e.checked)))}_onDocumentPress(e,t){const i=this.list[this.list.indexOf(e)],s={id:e.id,name:t,document:e};i.open||this._updateDocumentProperty(e,"open",!0),this._fireEvent("document-link-pressed",s)}_updateDocumentProperty(e,t,i){const s=[...this.list];return s[this.list.indexOf(e)][t]=i,this.list=[...s],this.list}_tplCheckItem(e){const t=e.confirm||this._locale("document-dici-confirm-label");return n`
      <bbva-form-checkbox
        ?disabled=${!e.open}
        name=${e.id}
        value=${e}
        label=${t}
        ?checked=${e.checked}
        @click=${({target:t})=>this._onCheckItemChange(t,e)}
      ></bbva-form-checkbox>
    `}_tplDocumentItem(e){const t=e.name||this._locale("document-dici-name"),i=`document-open-${Boolean(e.open)}-label`;return n`
      <div
        class="document"
        @click=${()=>this._onDocumentPress(e,t)}
        @KeyDown=${this._handleClick}
      >
        <div class="link"><bbva-type-icon size="24" icon=${c()}></bbva-type-icon>${t}</div>
        <bbva-type-text
          class="document-status"
          unset
          size="S"
          ?hidden=${this.onlyLinks}
          ?open=${e.open}
          text=${this._locale(i)}
        ></bbva-type-text>
      </div>
    `}static get styles(){return[ce]}render(){return n`
      <div class="document-list">${this.list.map((e=>this._tplDocumentItem(e)))}</div>
      <div class="confirm-list" ?hidden=${this.onlyLinks}>
        ${this.list.map((e=>this._tplCheckItem(e)))}
      </div>
    `}}var ue=t`
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

  [data-tag-name='bbva-type-text'] {
    font-size: 0.9375rem;
  }

  [data-tag-name='bbva-badge-icon'] {
    --bbva-badge-icon--custom--secondary-ambient--checked-icon-color: #fff;
  }

  [data-tag-name='bbva-notification-help'] {
    padding: 0.5rem 0;
  }

  :host([spacing]) {
    padding: 0 1rem;
  }

  :host([block-items]) .amount,
  :host([block-items]) .label {
    display: flex;
    flex-direction: column;
  }
  :host([block-items]) .summary-help-button {
    padding: 0.75rem 0 0.75rem 0.25rem;
  }

  :host([light-values]) .amount .value,
  :host([light-values]) .label .value {
    font-weight: 350;
  }

  :host([big-values]) .amount .value,
  :host([big-values]) .label .value {
    font-size: 1.125rem;
  }

  :host([amount-huge]) .amount-big {
    padding-bottom: 1rem;

    [data-tag-name='bbva-type-amount'] {
      font-size: 1.5rem;
    }
  }

  :host([hide-help]) .summary-help-button {
    display: none;
  }

  :host([double-space]) .summary-item {
    margin-top: 0;
    margin-bottom: 0;
    padding: 1rem 0;

    &.title {
      padding-bottom: 0;
      & + .label {
        padding-top: 0.5rem;
      }
    }
  }

  .amount [data-tag-name='bbva-type-amount'] {
    font-size: 0.9375rem;
  }
  .amount-big {
    flex-direction: column;

    [data-tag-name='bbva-type-amount'] {
      margin-top: 0.25rem;
      font-size: 1.25rem;
      font-weight: 700;
    }
  }

  .amount,
  .label {
    display: flex;
    justify-content: space-between;
  }
  .amount .value,
  .label .value {
    font-weight: 500;
  }

  .title [data-tag-name='bbva-type-text'] {
    font-weight: 500;

    &[ambient=primary] {
      color: #666666;
    }
  }

  .product {
    display: flex;
    flex-direction: column;
  }
  .product .summary-label [data-tag-name='bbva-type-text'] {
    font-weight: 500;
    margin-bottom: 1rem;
  }
  .product-value {
    display: flex;
  }
  .product-value [data-tag-name='bbva-badge-reference'] {
    margin-left: 0.5rem;
  }

  .summary-item,
  [data-tag-name='bbva-notification-help'] {
    display: flex;
  }
  .summary-item + .summary-item,
  [data-tag-name='bbva-notification-help'] + .summary-item {
    margin-top: 1rem;
  }

  .summary-label {
    display: flex;
    align-items: center;
  }
  .summary-label [data-tag-name='bbva-type-icon'] {
    fill: #1464a5;
  }
  .summary-label .summary-help-button {
    padding: 0 0 0 0.25rem;
    cursor: pointer;
  }
`;class pe extends(g(f(i(ee(s))))){static get is(){return"step-summary"}static get scopedElements(){const e=[k,V,A,R,S,E,...pe.configurationScopedElements()];return pe.scopedElementsFromClasses(e)}static get properties(){return{summary:{type:Array},ambient:{type:String}}}constructor(){super(),this.summary=[],this.ambient="secondary"}_getDecimals(e){return(String(e).split(".")[1]||[]).length}_getSummary(){const e={amount:"_tplAmount","amount-big":"_tplAmount",badge:"_tplBadge",label:"_tplLabel",product:"_tplProduct",title:"_tplTitle"};return this.summary.map((t=>n`
        <div class="summary-item ${t.type}">${this[e[t.type]](t)}</div>
        ${t.alert?n`
        <bbva-notification-help variant="info" ambient=${this.ambient} text=${t.alert}
        ></bbva-notification-help>
      `:""}
      `))}_tplAmount(e){return n`
      ${this._tplBaseLabel(e)}
      <bbva-type-amount
        class="value"
        ambient=${this.ambient}
        amount=${e.amount}
        currency-code=${e.currencyCode}
        local-currency=${e.localCurrency}
        .decimalDigits=${this._getDecimals(e.amount)}
      ></bbva-type-amount>
    `}_tplBadge(e){return n`
      <bbva-badge-icon
        ambient=${this.ambient}
        status="checked"
        description=${e.label}
      ></bbva-badge-icon>
    `}_tplBaseLabel(e){return n`
      <div class="summary-label">
        <bbva-type-text unset ambient=${this.ambient} text=${e.label}></bbva-type-text>
        ${e.help?n`
        <div class="summary-help-button">
          <bbva-type-icon
            class="investment-import-icon"
            icon=${a()}
            size="16"
            @click=${()=>this._fireEvent(e.help)}
          ></bbva-type-icon>
        </div>
      `:""}
      </div>
    `}_tplLabel(e){const t=this._mask(e.badge)||e.value;return n`
      ${this._tplBaseLabel(e)}
      <bbva-type-text class="value" unset ambient=${this.ambient} text=${t}></bbva-type-text>
    `}_tplTitle(e){return n`
      <bbva-type-text unset ambient=${this.ambient} text=${e.label}></bbva-type-text>
    `}_tplProduct(e){return n`
      ${this._tplBaseLabel(e)}
      <div class="product-value">
        <bbva-type-text unset ambient=${this.ambient} text=${e.value}></bbva-type-text>
        <bbva-badge-reference
          ?hidden=${!e.reference}
          ambient=${this.ambient}
          number=${e.reference}
        ></bbva-badge-reference>
      </div>
    `}static get styles(){return[ue]}render(){return n` ${this._getSummary()} `}}class me extends(g(f(i(ee(s))))){static get is(){return"fund-modals"}static get scopedElements(){const e=[y,F,H,M,v,x,j,S,$,E,he,oe,pe,...me.configurationScopedElements()];return me.scopedElementsFromClasses(e)}static get properties(){return{contract:{type:Object},fund:{type:Object},fundDetail:{type:Object},fundCategoryList:{type:Object},operationEnd:{type:String},operationStart:{type:String},_categories:{type:Array},_categorySelected:{type:Number},_categoryMenu:{type:Array},_detailMenu:{type:Array},_detailSummary:{type:Array},_filterBy:{type:Array},_filterList:{type:Object},_filterTab:{type:Array},_funds:{type:Array},_minCountToSearch:{type:Number},_profitSummary:{type:Array},_searchValue:{type:Array},_showFundProfitContent:{type:Boolean},_swipe:{type:String}}}constructor(){super(),this.contract={},this.fundCategoryList={},this.fundDetail=null,this.operationEnd="",this.operationStart="",this._categories=[],this._categorySelected=0,this._categoryMenu=[],this._detailMenu=[{title:this._locale("fund-detail-profit-tab")},{title:this._locale("fund-detail-fund-tab")}],this._detailSummary=[],this._filterBy="",this._filterList={},this._filterTab=[],this._funds=[],this._minCountToSearch=4,this._profitSummary=[],this._searchValue="",this._showFundProfitContent=!1,this._swipe=""}updated(e){e.has("fundCategoryList")&&this._parseCategories(),e.has("fundDetail")&&this._updateDetailSummary()}_getDiciDocument(){var e;return(null!==(e=this.fundDetail)&&void 0!==e&&e.fund?[...this.fundDetail.fund.documents]:[]).map((e=>({...e})))}_getFilterRadioButtons(){return this.shadowRoot.querySelectorAll("#filterList [data-tag-name=bbva-form-radio-button]")}_getLiquidityLabel(e){const t=e.split(" ").join("-");return this._locale(`fund-liquidity-${t}`)}_onFundListModalClose(){this.shadowRoot.querySelector("#inputSearch").value="",this._searchValue="",this._onFilterCancelPress()}_onFilterCancelPress(){this._getFilterRadioButtons().forEach((e=>{e.checked=!1})),this._filterBy="",this._filterTab=[]}_onFilterConfirmPress(){const e=this._getFilterRadioButtons();let t="";e.forEach((e=>{e.checked&&(t=e.value)})),t&&(this._filterBy=t.toLowerCase(),this._filterTab=[{name:this._locale("fund-filter-tab-label",{label:this._filterBy}),removable:!0}])}_onFilterPress(){this.shadowRoot.querySelector("#fundFilterModal").open()}_onInputValueChange({detail:e}){this._searchValue=null==e?void 0:e.value.toLowerCase()}_onDetailConfirmPress(){this._closeModal("fundListModal"),this._fireEvent("select-fund-detail-pressed",this.fundDetail.fund)}_onDetailTabPressed({detail:e}){this._showFundProfitContent=!e.selectedIndex,this._swipeItems(),this._fireEvent("detail-menu-tab-pressed",this._showFundProfitContent)}_parseCategories(){const e=this.fundCategoryList.list||[],t=e.map((e=>({title:` ${this.t(e.tabName)}`})));void 0!==this.fundCategoryList.selected&&(this._categorySelected=this.fundCategoryList.selected),this._categories=[...e],this._categoryMenu=[...t],this._filterList=e.reduce(((e,t,i)=>{const s={...e};return s[i]=[...new Set(t.fundList.map((e=>e.liquidity)))].sort(),s}),{})}_resetFundScroll(e){this.shadowRoot.querySelector(`#${e}`)._runScrollReset()}_searchByFilter(){var e;let t=(null===(e=this._categories[this._categorySelected])||void 0===e?void 0:e.fundList)||[];return this._filterBy.length&&(t=t.filter((e=>e.liquidity.toLowerCase()===this._filterBy))),t}_searchByValue(e=[]){return e.filter((e=>e.name.toLowerCase().includes(this._searchValue)))}_showProfitGBMessage(){var e;return"GB"!==(null===(e=this.fundDetail)||void 0===e?void 0:e.detail.serie.toUpperCase())}_setCategorySelected({detail:e}){(null==e?void 0:e.selectedIndex)!==this._categorySelected&&(this._categorySelected=null==e?void 0:e.selectedIndex,this._onFilterCancelPress(),this._resetFundScroll("fundListModal"),this._swipeItems())}_swipeItems(){this._swipe="swipe",setTimeout((()=>{this._swipe=""}),500)}_updateDetailSummary(){var e;let t=[],i=[];if(null!==(e=this.fundDetail)&&void 0!==e&&e.detail.id){var s;const{detail:e,fund:n}=this.fundDetail,a=e.profitabilityRatios.find((e=>"MONTHLY"===e.period)),r=e.profitabilityRatios.find((e=>"ANNUAL"===e.period));i=[...this._showProfitGBMessage()?[{type:"label",label:this._locale("fund-detail-profit-message"),value:""}]:[],{type:"amount",label:this._locale("fund-detail-modal-amount"),amount:this.contract.portfolioValue.amount,currencyCode:this.contract.portfolioValue.currency,localCurrency:this.localCurrency},{type:"label",label:this._locale("investment-step-serie-text"),value:e.serie},{type:"amount",label:this._locale("investment-step-price-title-text"),amount:e.netAssetValue.amount,currencyCode:e.netAssetValue.currency,localCurrency:this.localCurrency},{type:"title",label:this._locale("fund-detail-profit-tab")},{type:"label",label:this._locale("investment-step-last-profit-monthly"),value:`${a.value}%`},{type:"label",label:this._locale("investment-step-last-profit-annual"),value:`${r.value}%`}],t=[{type:"title",label:this._locale("fund-detail-general-info-title")},..."EMPTY"!==e.description?[{type:"label",label:this._capitalize(e.description),value:""}]:[],{type:"label",label:this._locale("fund-detail-id-label"),value:n.fundName},{type:"label",label:this._locale("fund-detail-type-label"),value:this._locale(`fund-category-list-${n.fundClassification.fundType.id}-tab-label`)},{type:"label",label:this._locale("fund-detail-invest-horizon-label"),value:this._capitalize((null===(s=e.investmentHorizon)||void 0===s?void 0:s.id)||"")},{type:"label",label:this._locale("fund-detail-operation-schedule-label"),value:this._locale("fund-detail-operation-schedule",{start:this.operationStart,end:this.operationEnd})},{type:"label",label:this._locale("fund-detail-invest-liquidity-label"),value:this._getLiquidityLabel(e.operationsSchedule.subscriptionName)},{type:"label",label:this._locale("fund-detail-redeem-liquidity-label"),value:this._getLiquidityLabel(e.operationsSchedule.redeemName)},{type:"label",label:this._locale("fund-detail-currency-label"),value:this._locale(`fund-detail-currency-${e.netAssetValue.currency}`)},{type:"title",label:this._locale("fund-detail-commission-title")},{type:"label",label:this._locale("fund-detail-commission-message"),value:""}]}this._detailSummary=t,this._profitSummary=i}_getTplFundFilter(){var e;const t=(null===(e=this._filterList[this._categorySelected])||void 0===e?void 0:e.length)>1?this._locale("btn-label-filter"):"";return n`
      <bbva-form-filter
        ?hidden=${this._searchValue.length}
        hide-clear-label
        ambient="primary-alt"
        editable-label=${t}
        header-title=${this._locale("fund-step-title")}
        .filters=${this._filterTab}
        @header-category-link-click=${this._onFilterPress}
        @form-filter-close-click=${this._onFilterCancelPress}
      ></bbva-form-filter>
    `}_getTplFundList(){const e=this._searchByFilter();return n`
      <fund-list
        class="main-list"
        ?hidden=${this._searchValue.length}
        .list=${e}
        @fund-item-selected=${()=>this._closeModal("fundListModal")}
      ></fund-list>
    `}_getTplSearchResults(){var e;if(!this._searchValue.length)return"";let t="",i=this._locale("fund-search-not-results");const s=(null===(e=this._categories[this._categorySelected])||void 0===e?void 0:e.fundList)||[],a=this._searchByValue(s);let r=[],l=!1;return a.length||(r=this._categories.reduce(((e,t)=>{const i=this._searchByValue(t.fundList);return i.length&&e.push({title:t.tabName,list:i}),e}),[])),r.length&&(i=this._locale("fund-search-not-results-current-category",{category:this._categories[this._categorySelected].tabName})),l=[a.length,r.length].some((e=>e>0)),t=n`
      <fund-list
        class="search-list"
        .list=${a}
        @fund-item-selected=${()=>this._closeModal("fundListModal")}
      ></fund-list>

      <div class="results-block" ?hidden=${a.length}>
        <bbva-clip-microillustration
          microillustration="dataandtechnology"
          size="M"
        ></bbva-clip-microillustration>
        <bbva-type-text unset size="S" text=${i}></bbva-type-text>
        <div class="results-another-message" ?hidden=${!r.length}>
          <bbva-type-icon icon=${o()}></bbva-type-icon>
          <span>${this._locale("fund-search-another-category-results")}</span>
        </div>
      </div>

      ${this._getTplSearchAnotherResults(r)}
      <bbva-notification-message
        ?hidden=${!l}
        book-title
        variant="caution"
        message-title=${this._locale("fund-step-notification-message")}
      ></bbva-notification-message>
    `,t}_getTplSearchAnotherResults(e=[]){return e.map((e=>n`
        <bbva-type-text
          class="results-group-title subtitle"
          unset
          size="S"
          text=${e.title}
        ></bbva-type-text>
        <fund-list
          class="another-search-list"
          .list=${e.list}
          @fund-item-selected=${()=>this._closeModal("fundListModal")}
        ></fund-list>
      `))}static get styles(){return[de]}render(){var e,t;return n`
      <bbva-help-modal
        id="fundListModal"
        hide-content-padding-top
        full-height
        full-width
        button-text=${this._locale("btn-label-close")}
        header-text=${this._locale("fund-step-title")}
        @help-modal-close=${this._onFundListModalClose}
      >
        <div slot="slot-content">
          <div class="search-block">
            <bbva-form-input
              id="inputSearch"
              help-icon="bbva:help"
              icon-variant="search"
              type="search"
              label=${this._locale("fund-search-input-label")}
              label-out=${this._locale("fund-search-input-label-out")}
              @form-input-value-change=${this._onInputValueChange}
            ></bbva-form-input>

            <bbva-tab-default
              ?hidden=${this._categoryMenu.length<=1}
              horizontal-scroll
              selected=${this._categorySelected}
              tabs-per-page="2"
              .options=${this._categoryMenu}
              @tab-default-tab-click=${this._setCategorySelected}
            >
              ${this._categoryMenu.map(((e,t)=>n`
                <div role="tabpanel" id="content-${t}"></div>
              `))}
            </bbva-tab-default>
            ${this._getTplFundFilter()}
          </div>

          <div class=${this._swipe}>${this._getTplFundList()} ${this._getTplSearchResults()}</div>

          <bbva-notification-message
            ?hidden=${!!this._searchValue.length}
            book-title
            variant="caution"
            message-title=${this._locale("fund-step-notification-message")}
          ></bbva-notification-message>
        </div>
      </bbva-help-modal>

      <bbva-help-modal
        id="fundFilterModal"
        hide-content-padding-top
        full-height
        full-width
        button-text=${this._locale("btn-label-filter")}
        header-text=${this._locale("fund-filter-title")}
        link-text=${this._locale("btn-label-close")}
        @help-modal-footer-button-click=${this._onFilterConfirmPress}
        @xhelp-modal-footer-link-click=${this._onFilterCancelPress}
      >
        <div slot="slot-content">
          <bbva-type-text
            class="content-block"
            text=${this._locale("fund-filter-description")}
          ></bbva-type-text>
          <div id="filterList" class="option-list">
            ${null===(e=this._filterList[this._categorySelected])||void 0===e?void 0:e.map((e=>n`
                <bbva-form-radio-button name="option" value=${e}>
                  ${this._locale("fund-label-liquidity")} ${e}
                </bbva-form-radio-button>
              `))}
          </div>
        </div>
      </bbva-help-modal>

      <bbva-help-modal
        id="fundDetailModal"
        hide-content-padding-top
        full-height
        full-width
        button-text=${this._locale("btn-label-chose")}
        header-text=${this._locale("fund-detail-modal-title")}
        link-text=${this._locale("btn-label-back")}
        @help-modal-footer-button-click=${this._onDetailConfirmPress}
      >
        <div slot="slot-content">
          <bbva-tab-default
            class="sticky"
            selected="0"
            .options=${this._detailMenu}
            @tab-default-tab-change=${this._onDetailTabPressed}
          >
            ${this._detailMenu.map(((e,t)=>n` <div role="tabpanel" id="content-${t}"></div> `))}
          </bbva-tab-default>

          <div class=${this._swipe}>
            <bbva-type-text
              class="content-block subtitle"
              unset
              text=${null===(t=this.fundDetail)||void 0===t?void 0:t.fund.name}
            ></bbva-type-text>
            <div id="profits-block" ?hidden=${!this._showFundProfitContent}>
              <bbva-notification-message
                class="gb-message"
                ?hidden=${this._showProfitGBMessage()}
                book-title
                message-title=${this._locale("fund-detail-profit-GB-message")}
              ></bbva-notification-message>
              <step-summary
                class="content-block"
                ambient="primary"
                .summary=${this._profitSummary}
              ></step-summary>
              <bbva-notification-message
                book-title
                variant="caution"
                message-title=${this._locale("fund-detail-profit-notice-message")}
              ></bbva-notification-message>
            </div>

            <div id="detail-block" ?hidden=${this._showFundProfitContent}>
              <step-summary
                class="content-block"
                block-items
                big-values
                light-values
                double-space
                ambient="primary"
                .summary=${this._detailSummary}
              ></step-summary>
              <document-list
                only-links
                .list=${this._getDiciDocument()}
                @all-boxes-checked-change=${this._onAllBoxesChange}
              ></document-list>
            </div>
          </div>
        </div>
      </bbva-help-modal>
    `}}var _e=t`
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

  [data-tag-name='bbva-type-text'] {
    font-size: 0.938rem;
  }

  [data-tag-name='bbva-form-input'] {
    --color-primary-form-input-background-default: #f4f4f4;
    margin-top: 1rem;
  }

  [data-tag-name='bbva-expandable-accordion'] {
    margin-bottom: 0.5rem;
  }

  .accordion-label {
    font-weight: 500;
  }

  .footer {
    padding: 1.5rem 0 1rem;
    text-align: center;
  }
  .footer [data-tag-name='bbva-type-link'] {
    display: inline-block;
    padding: 1rem 1rem 0.5rem;
  }

  .invest-block {
    [data-tag-name='bbva-type-text'] {
      font-weight: 500
    }
  }
`;class be extends(g(f(i(ee(s))))){static get is(){return"investment-step-content"}static get scopedElements(){const e=[C,U,H,A,x,R,S,E,$,pe,...be.configurationScopedElements()];return be.scopedElementsFromClasses(e)}static get properties(){return{continueDisabled:{type:Boolean},fund:{type:Object},infoMessage:{type:String},inTime:{type:Boolean},maxAmount:{type:Number},minAmount:{type:Number},operationStart:{type:String},operationEnd:{type:String},lastProfit:{type:Array},simulation:{type:Array},showSimulation:{type:Boolean},_amountInvested:{type:Number},_investAmount:{type:Number},_numberTitles:{type:Number}}}constructor(){super(),this.continueDisabled=!0,this.fund=null,this.infoMessage="",this.inTime=!1,this.maxAmount=0,this.minAmount=0,this.operationStart="8:00",this.operationEnd="13:00",this.lastProfit=[],this.simulation=[],this.showSimulation=!1,this._amountInvested=0,this._investAmount=0,this._numberTitles=0}updated(e){e.has("maxAmount")&&this._onInputValueChange()}completeStep(){let e=[{type:"amount-big",label:this._locale("investment-step-title"),amount:this._investAmount,currencyCode:this.currencyCode,localCurrency:this.localCurrency,alert:this._locale("investment-step-input-amount-help-message")}];this.simulation.length&&(e=[...this.simulation],delete e[0].alert),this._fireEvent("update-summary",e)}reset(){this.shadowRoot.querySelector("#inputAmount").resetValue=!0,this.continueDisabled=!0,this.simulation=[],this.lastProfit=[],this.showSimulation=!1,this._investAmount=0}_formatAmount(e){return h(e,{localCurrency:this.localCurrency,currencyCode:this.currencyCode,language:this.language})}_getSimulationMessage(){var e,t,i;const s=this.inTime?"in":"out",a="MISMO DIA"===(null===(e=this.fund)||void 0===e||null===(t=e.liquidation)||void 0===t?void 0:t.liquidationPeriod),r=`notification-message-${s}-schedule-${a?"same-day":"liquidity"}`,o={start:this.operationStart,end:this.operationEnd,liquidity:null===(i=this.fund)||void 0===i?void 0:i.liquidity},l=a&&this.inTime?"success":"caution";return n`
      <bbva-notification-message
        book-title
        variant=${l}
        message-title=${this._locale(r,o)}
      ></bbva-notification-message>
    `}_onContinuePress(){this._fireEvent("invest-amount-changed",{amount:this._investAmount,currencyCode:this.currencyCode})}_onEditPress(){const e=this.shadowRoot.querySelector("#accordion"),t=this.shadowRoot.querySelector("#inputAmount");e.opened=!1,t.resetValue=!0,this.showSimulation=!1,this.simulation=[]}_onInputValueChange(){const e=this.shadowRoot.querySelector("#inputAmount"),t=parseFloat(e.shadowRoot.querySelector("input").value.split(",").join("")),i=e.shadowRoot.querySelector("[data-tag-name=bbva-form-amount]");let s=t>this.maxAmount,n=this.maxAmount,a="investment-step-input-error-no-balance";t<this.minAmount&&(s=!0,n=this.minAmount,a="investment-step-input-error-min-fund-price"),setTimeout((()=>{i.invalid=s,i.infoMessage=s?"":this._locale("investment-step-input-info-message",{amount:this._formatAmount(this.maxAmount)}),i.errorMessage=this._locale(a,{amount:this._formatAmount(n)}),this.continueDisabled=!t||s,this._investAmount=t}),500)}static get styles(){return[_e]}render(){return n`
      <div class="invest-block" ?hidden=${this.showSimulation}>
        <bbva-type-text unset text=${this._locale("investment-step-text")}></bbva-type-text>
        <bbva-form-input
          id="inputAmount"
          type="amount"
          auto-validate
          .currencyCode=${this.currencyCode}
          .localCurrency=${this.localCurrency}
          label=${this._locale("investment-step-label-input")}
          @form-amount-input-change=${this._onInputValueChange}
        ></bbva-form-input>
      </div>

      <div class="simulation-block" ?hidden=${!this.showSimulation}>
        ${this._getSimulationMessage()}
        <step-summary
          big-values
          block-items
          ambient="primary"
          .summary=${this.simulation}
        ></step-summary>

        <bbva-expandable-accordion id="accordion">
          <bbva-type-text
            class="accordion-label"
            slot="header"
            unset
            size="S"
            text=${this._locale("investment-step-last-profit-btn-label")}
          ></bbva-type-text>
          <div slot="content">
            <step-summary ambient="primary" .summary=${this.lastProfit}></step-summary>
          </div>
        </bbva-expandable-accordion>
      </div>

      <div class="footer">
        ${this.showSimulation?n`
          <bbva-button-default
            fullwidth
            text=${this._locale("btn-label-continue")}
            @click=${this.completeStep}
          ></bbva-button-default>
          <bbva-type-link
            text=${this._locale("investment-step-link-text")}
            @click=${this._onEditPress}
          ></bbva-type-link>
        `:n`
          <bbva-button-default
            fullwidth
            ?disabled=${this.continueDisabled}
            text=${this._locale("btn-label-continue")}
            @click=${this._onContinuePress}
          ></bbva-button-default>
        `}
      </div>
    `}}var ge=t`
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

.sub-header {
  display: flex;
  justify-content: space-between;
}

.padded {
  padding: 0 1rem;
}

.privacy-link [data-tag-name=bbva-type-icon], .privacy-link [data-tag-name=bbva-type-text] {
  display: inline-block;
  vertical-align: middle;
  font-size: 0.75rem;
}

.footer {
  padding: 1.5rem 1rem;
  text-align: center;
}
`;class fe extends(g(f(i(ee(s))))){static get is(){return"legals-step-content"}static get scopedElements(){const e=[C,x,S,$,E,he,...fe.configurationScopedElements()];return fe.scopedElementsFromClasses(e)}static get properties(){return{documents:{type:Array},enableContinue:{type:Boolean},fundSelected:{type:Object}}}constructor(){super(),this.documents=[],this.enableContinue=!1,this.fundSelected={documents:[]}}updated(e){var t;e.has("fundSelected")&&(this.documents=null!==(t=this.fundSelected)&&void 0!==t&&t.documents?[...this.fundSelected.documents]:[])}reset(){this.documents=this.documents.map((e=>({...e,open:!1,checked:!1})))}_onAllBoxesChange({detail:e}){this.enableContinue=e}_onCheckboxPress(){const e=this.shadowRoot.querySelector("#buttonLegalsStep"),t=this.shadowRoot.querySelector("#checkboxlegals");e.disabled=t.ariaChecked}_onPrivacyLinkPress(){this._fireEvent("show-privacy-link-pressed")}_onContinuePress(){this._fireEvent("update-summary",[{type:"badge",label:this._locale("legals-step-read-label")}])}static get styles(){return[ge]}render(){return n`
      <bbva-type-text
        class="padded"
        unset
        text=${this._locale("legals-step-description")}
      ></bbva-type-text>

      <document-list
        .list=${this.documents}
        @all-boxes-checked-change=${this._onAllBoxesChange}
      ></document-list>

      <div class="privacy-link padded">
        <bbva-type-icon icon=${u()}></bbva-type-icon>
        <bbva-type-text unset text=${this._locale("legals-step-privacy-label")}></bbva-type-text>
        <bbva-type-link
          size="2XS"
          text=${this._locale("legals-step-privacy-btn-label")}
          @click=${this._onPrivacyLinkPress}
        ></bbva-type-link>
      </div>

      <div class="footer">
        <bbva-button-default
          fullwidth
          ?disabled=${!this.enableContinue}
          ?hidden=${this.showSimulation}
          text=${this._locale("btn-label-continue")}
          @click=${this._onContinuePress}
        ></bbva-button-default>
      </div>
    `}}let ye=class{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),s=i.length>>>0;if(0===s)return!1;let n=0|t,a=Math.max(n>=0?n:s-Math.abs(n),0);for(;a<s;){if((r=i[a])===(o=e)||"number"==typeof r&&"number"==typeof o&&isNaN(r)&&isNaN(o))return!0;a++}var r,o;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var i=[],s=0,n="",a=0,r=arguments.length;a!==r;++a){var o=+arguments[a];if(!(o<1114111&&o>>>0===o))throw RangeError("Invalid code point: "+o);o<=65535?s=i.push(o):(o-=65536,s=i.push(55296+(o>>10),o%1024+56320)),s>=16383&&(n+=e.apply(null,i),i.length=0)}return n+e.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",i=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${i&&i.message}`)}},ve=class extends ye{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}};const Se=0,Ee=1,Ce="jwt",Re="tsec",$e="none";let Te=class extends ye{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=Se,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new ve,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=Re:this.requiredToken=$e,this.requiresJWT=!1):this.requiredToken===Re?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===Ce?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===$e?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(Re)}_setJwtHandler(){this._setTokenHandler(Ce)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((i,s)=>{t=Object.assign(t,{resolve:i,reject:s}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let i=this._getRequestHeaders();Object.keys(i).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,i[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=p),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let i=e.replace(/[\{\}]+/g,""),s=t[i];return s?delete t[i]:this._error(9,`Missing ${i} param value`),s})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(t);i.length&&(e=[e,i.map((e=>{let i=t[e];return Array.isArray(i)&&this.paramArrayMode===Ee?this._arrayToQueryParam(e,i):`${e}=${i}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(Re,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(Ce,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var s=t.getItem(i);s&&"null"!==s&&(e[i]=s)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const i=window.sessionStorage;t=Object.keys(i).filter((t=>t.startsWith(e))).reduce(((t,s)=>(t[s.replace(e,"")]=i.getItem(s),t)),{})}return t}_getTokenForRequestHeaders(e,t){const i=`${e}Handler`,s=e===Ce?"JWT ":"",n=e===Ce?"Authorization":Re;if(void 0===this[i]||null===this[i])this._error(11,`${e} handler is undefined`);else{const a=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let r=this[i].getItem(a);r?t[n]=t[n]||s+r:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((i=>{t.push(`${i}=${e[i]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let i;const s=new Promise(((e,t)=>{i=(i,s)=>{i?t(i):e(s)}}));return t.addEventListener("loadend",(function e(s){t.removeEventListener("loadend",e),s.error?i(s.error):i(null,t.result)})),t.readAsText(e),s}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let i=0;for(;i<e.length;){let s=e[i],n=0,a=0;if(s<=127?(n=0,a=255&s):s<=223?(n=1,a=31&s):s<=239?(n=2,a=15&s):s<=244&&(n=3,a=7&s),e.length-i-n>0){let t=0;for(;t<n;)s=e[i+t+1],a=a<<6|63&s,t+=1}else a=65533,n=e.length-i;t+=String.fromCodePoint(a),i+=n+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},i=e.trim().split(/[\r\n]+/);for(const e in i)if(i.hasOwnProperty(e)&&""!==i[e]){let s=": ",n=i[e].split(s);t[n.shift().toLowerCase()]=n.join(s)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,i,s){let n=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(s)>=0&&(n=t.getResponseHeader(s));break;case this._NATIVE_XHR:t&&t.headers&&(n=JSON.parse(t.headers)[s])}if(n){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;e.getItem(t)!==n&&(e.setItem(t,n),this._emitTokenUpdate(i,n))}}_emitTokenUpdate(e,t){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,i,s,n,a;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),i=e.getResponseHeader("AuthenticationData"),s=e.getResponseHeader("AuthenticationState"),n=e.getResponseHeader("AuthenticationChallenge"),a=e.getResponseHeader("AuthenticationResponse");else{let r=JSON.parse(e.headers);t=r.authenticationtype,i=r.authenticationdata||null,s=r.authenticationstate,n=r.authenticationchallenge,a=r.authenticationresponse}return{type:t,data:i,state:s,challenge:n,response:a}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",i=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const s=this._getSignatureData(e,t,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:s}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",i="",s=""){let n;if("object"==typeof e&&e){const a=this._getSignatureData(e.signatureType,t,i);n=this._makeKeyValuePairFromObject(a,e.signatureValue),e.challenge&&(n+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(n,e.signatureType,s)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(n=`password=${e}`,this._buildSignatureHeaders(n,"2",s)):(n=`${i}=${e}`,this._buildSignatureHeaders(n,t,s)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let i,s=e.split(",");if(s.length>1){i=s.map((e=>`${e}=${t[e]}`)).join(",")}else i=`${e}=${t}`;return i}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),n=this._ERROR_CODES.SIGNATURE_INVALID.includes(s),{type:a,data:r,state:o,challenge:l,response:d}=this._extractSignatureResponseHeaders(e),c=this._getRequestMetadata(e);if(n)this._notifySignatureInvalid(c),i=!0;else if(a)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(s)?(this._notifySignatureTypeUsingErrorCode(s,c,a,r,o,l,d),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(c,a,r,o,l,d),i=!0}return i}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),n=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(s),a=this._getRequestMetadata(e);n&&(this._notifyWaitingForProcessResponse(a),i=!0)}return i}_notifySignatureRequiredFirstStep(e,t,i,s){this._defineSignatureType(t,i),this._defineSignatureValue(t,i,s),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:i,metadata:e}}))}_notifySignatureRequired(e,t,i,s,n,a){this._defineSignatureValue(t,i,s);const r={type:t,data:i,challenge:n,metadata:e};a&&(r.response=a),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:r}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:i}=e;return{path:this._path,method:this.method,url:t,status:i}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",i=""){const s=t.split(";").findIndex((t=>t===e));return i?i.split(";")[s]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,i,s,n,a){s?this._notifySignatureRequired(e,t,i,s,n,a):this._notifySignatureRequiredFirstStep(e,t,i,s)}_notifySignatureTypeUsingErrorCode(e,t,i,s,n,a,r){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,i,s,n):this._notifySignatureRequired(t,i,s,n,a,r)}},xe=class extends Te{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}};class Ae extends xe{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/contact-details`)}toString(){return super.toString("BGADPCustomersCustomerContactDetailsGetV0")}}class we extends xe{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/contact-details`)}toString(){return super.toString("BGADPCustomersCustomerContactDetailsGetV1")}}class Oe extends(m(s)){_mappingBank(e){this._renameProperty(e,"bank.bankId","id"),this._renameProperty(e,"bank.branch.branchId","id"),e.bank&&e.bank.branch&&e.bank.branch.costCenter&&(e.bank.branch.costCenter={id:e.bank.branch.costCenter})}_mappingGender(e){this._renameProperty(e,"gender.name","description")}_mappingIdentityDocuments(e){for(let t=0;t<e.identityDocuments.length;t++)this._renameProperty(e.identityDocuments[t],"documentType.name","description"),this._renameProperty(e.identityDocuments[t],"status.name","description")}_mappingMaritalStatus(e){this._renameProperty(e,"maritalStatus.name","description")}_mappingNationalities(e){for(let t=0;t<e.nationalities.length;t++)this._renameProperty(e.nationalities[t],"name","description")}_mappingPersonalTitle(e){this._renameProperty(e,"personalTitle.name","description")}_mappingResidence(e){this._renameProperty(e,"residence","taxResidence"),this._renameProperty(e,"taxResidence.residenceType.name","description")}_mappingVerification(e){this._renameProperty(e,"enrollmentModality","verification"),this._renameProperty(e,"verification.enrollmentMethod","identificationMethod")}_mappingSegments(e){for(let t=0;t<e.segments.length;t++)this._renameProperty(e.segments[t],"name","description")}_changeNameToDescription(e){e.map((e=>{this._renameProperty(e,"name","description")}))}}class Ie extends Oe{static get is(){return"bbva-global-customer-contact-details-api-dm"}static get properties(){return{customerContactDetails:{type:Array,attribute:!1},_contactType:{type:Object,attribute:!1},_socialNetwork:{type:Object,attribute:!1},_emailType:{type:Object,attribute:!1},_phoneType:{type:Object,attribute:!1}}}constructor(){super(),this.customerContactDetails=[],this._contactType={WORK_EMAIL:"EMAIL",FACEBOOK_EMAIL:"EMAIL",EMAIL:"EMAIL",PHONE_NUMBER:"LANDLINE",MOBILE_NUMBER:"MOBILE",OFFICE_NUMBER:"LANDLINE",FACEBOOK_ACCOUNT:"SOCIALMEDIA",TWITTER_ACCOUNT:"SOCIALMEDIA"},this._socialNetwork={FACEBOOK_ACCOUNT:"FACEBOOK",TWITTER_ACCOUNT:"TWITTER"},this._emailType={EMAIL:"PERSONAL",WORK_EMAIL:"WORK",FACEBOOK_EMAIL:"SOCIALMEDIA"},this._phoneType={PHONE_NUMBER:"HOME",OFFICE_NUMBER:"WORK"}}resetCustomerContactDetails(){this.customerContactDetails=[]}getCustomerContactDetails(e,t={}){if(Object.keys(this.customerContactDetails).length)return;this._paramsMapping(t);t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),{customEvent:"customer-contact-details-api-dm-fetch",paginationEvent:"customer-contact-details-api-dm-pagination",errorFireEventHandler:"customer-contact-details-api-dm-fetch-error"},this._responseMapping,t.fields)}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}CustomerContactDetails`,this._getBgadp(s))}_getBgadp(e){return{getCustomerContactDetailsV0:()=>new Ae(e),getCustomerContactDetailsV1:()=>new we(e),getCustomerContactDetailsV2:()=>new q(e),getCustomerContactDetailsV3:()=>new D(e),default:()=>"BGADP called not exist"}}_paramsMapping(e){"0"==this.version&&(this._removeFields(["contact.isMultichannel"],e),this._removeFields(["contact.contactDetailType"],e)),"2"==this.version&&this._removeFields(["contact.contactDetailType"],e)}_responseMapping(e){if("0"==this.version&&Object.keys(e).length){let t;for(let i=0;i<e.length;i++)if(this._renameProperty(e[i],"contactDetailId","id"),e[i].contactType){switch(t=e[i].contact,e[i].contact={contactDetailType:this._contactType[e[i].contactType.id]},e[i].contact.contactDetailType){case"EMAIL":e[i].contact.address=t,e[i].hasOwnProperty("isVerified")&&(e[i].contact.isVerified=e[i].isVerified),e[i].contact.receivesNotifications=e[i].isChecked,e[i].contact.emailType=this._emailType[e[i].contactType.id];break;case"LANDLINE":e[i].contact.number=t,e[i].contact.phoneType=this._phoneType[e[i].contactType.id],e[i].country&&(e[i].contact.country=e[i].country),e[i].regionalCode&&(e[i].contact.regionalCode=e[i].regionalCode),e[i].extension&&(e[i].contact.extension=e[i].extension),e[i].hasOwnProperty("isVerified")&&(e[i].contact.isVerified=e[i].isVerified);break;case"MOBILE":e[i].contact.number=t,e[i].phoneCompany&&(e[i].contact.phoneCompany=e[i].phoneCompany),e[i].hasOwnProperty("isVerified")&&(e[i].contact.isVerified=e[i].isVerified),e[i].contact.receivesNotifications=e[i].isChecked,e[i].contact.phoneType="HOME";break;case"SOCIALMEDIA":e[i].contact.userName=t,e[i].contact.socialNetwork=this._socialNetwork[e[i].contactType.id]}this._removeFields(["country","regionalCode","extension","isChecked","isVerified","contactType","phoneCompany"],e[i])}}if("1"==this.version&&Object.keys(e).length){const t=["isSafe","isVerifiedByCustomer"];for(let i=0;i<e.length;i++)e[i].contact&&"MOBILE"===e[i].contact.contactDetailType&&this._removeFields(["isMobileToken"],e[i].contact),this._removeFields(t,e[i])}return e}}let ke=class{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),s=i.length>>>0;if(0===s)return!1;let n=0|t,a=Math.max(n>=0?n:s-Math.abs(n),0);for(;a<s;){if((r=i[a])===(o=e)||"number"==typeof r&&"number"==typeof o&&isNaN(r)&&isNaN(o))return!0;a++}var r,o;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var i=[],s=0,n="",a=0,r=arguments.length;a!==r;++a){var o=+arguments[a];if(!(o<1114111&&o>>>0===o))throw RangeError("Invalid code point: "+o);o<=65535?s=i.push(o):(o-=65536,s=i.push(55296+(o>>10),o%1024+56320)),s>=16383&&(n+=e.apply(null,i),i.length=0)}return n+e.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",i=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${i&&i.message}`)}},qe=class extends ke{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}};const De=0,Pe=1,Ne="jwt",Le="tsec",Fe="none";let He=class extends ke{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=De,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new qe,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=Le:this.requiredToken=Fe,this.requiresJWT=!1):this.requiredToken===Le?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===Ne?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===Fe?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(Le)}_setJwtHandler(){this._setTokenHandler(Ne)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((i,s)=>{t=Object.assign(t,{resolve:i,reject:s}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let i=this._getRequestHeaders();Object.keys(i).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,i[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=p),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let i=e.replace(/[\{\}]+/g,""),s=t[i];return s?delete t[i]:this._error(9,`Missing ${i} param value`),s})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(t);i.length&&(e=[e,i.map((e=>{let i=t[e];return Array.isArray(i)&&this.paramArrayMode===Pe?this._arrayToQueryParam(e,i):`${e}=${i}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(Le,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(Ne,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var s=t.getItem(i);s&&"null"!==s&&(e[i]=s)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const i=window.sessionStorage;t=Object.keys(i).filter((t=>t.startsWith(e))).reduce(((t,s)=>(t[s.replace(e,"")]=i.getItem(s),t)),{})}return t}_getTokenForRequestHeaders(e,t){const i=`${e}Handler`,s=e===Ne?"JWT ":"",n=e===Ne?"Authorization":Le;if(void 0===this[i]||null===this[i])this._error(11,`${e} handler is undefined`);else{const a=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let r=this[i].getItem(a);r?t[n]=t[n]||s+r:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((i=>{t.push(`${i}=${e[i]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let i;const s=new Promise(((e,t)=>{i=(i,s)=>{i?t(i):e(s)}}));return t.addEventListener("loadend",(function e(s){t.removeEventListener("loadend",e),s.error?i(s.error):i(null,t.result)})),t.readAsText(e),s}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let i=0;for(;i<e.length;){let s=e[i],n=0,a=0;if(s<=127?(n=0,a=255&s):s<=223?(n=1,a=31&s):s<=239?(n=2,a=15&s):s<=244&&(n=3,a=7&s),e.length-i-n>0){let t=0;for(;t<n;)s=e[i+t+1],a=a<<6|63&s,t+=1}else a=65533,n=e.length-i;t+=String.fromCodePoint(a),i+=n+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},i=e.trim().split(/[\r\n]+/);for(const e in i)if(i.hasOwnProperty(e)&&""!==i[e]){let s=": ",n=i[e].split(s);t[n.shift().toLowerCase()]=n.join(s)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,i,s){let n=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(s)>=0&&(n=t.getResponseHeader(s));break;case this._NATIVE_XHR:t&&t.headers&&(n=JSON.parse(t.headers)[s])}if(n){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;e.getItem(t)!==n&&(e.setItem(t,n),this._emitTokenUpdate(i,n))}}_emitTokenUpdate(e,t){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,i,s,n,a;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),i=e.getResponseHeader("AuthenticationData"),s=e.getResponseHeader("AuthenticationState"),n=e.getResponseHeader("AuthenticationChallenge"),a=e.getResponseHeader("AuthenticationResponse");else{let r=JSON.parse(e.headers);t=r.authenticationtype,i=r.authenticationdata||null,s=r.authenticationstate,n=r.authenticationchallenge,a=r.authenticationresponse}return{type:t,data:i,state:s,challenge:n,response:a}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",i=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const s=this._getSignatureData(e,t,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:s}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",i="",s=""){let n;if("object"==typeof e&&e){const a=this._getSignatureData(e.signatureType,t,i);n=this._makeKeyValuePairFromObject(a,e.signatureValue),e.challenge&&(n+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(n,e.signatureType,s)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(n=`password=${e}`,this._buildSignatureHeaders(n,"2",s)):(n=`${i}=${e}`,this._buildSignatureHeaders(n,t,s)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let i,s=e.split(",");if(s.length>1){i=s.map((e=>`${e}=${t[e]}`)).join(",")}else i=`${e}=${t}`;return i}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),n=this._ERROR_CODES.SIGNATURE_INVALID.includes(s),{type:a,data:r,state:o,challenge:l,response:d}=this._extractSignatureResponseHeaders(e),c=this._getRequestMetadata(e);if(n)this._notifySignatureInvalid(c),i=!0;else if(a)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(s)?(this._notifySignatureTypeUsingErrorCode(s,c,a,r,o,l,d),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(c,a,r,o,l,d),i=!0}return i}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),n=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(s),a=this._getRequestMetadata(e);n&&(this._notifyWaitingForProcessResponse(a),i=!0)}return i}_notifySignatureRequiredFirstStep(e,t,i,s){this._defineSignatureType(t,i),this._defineSignatureValue(t,i,s),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:i,metadata:e}}))}_notifySignatureRequired(e,t,i,s,n,a){this._defineSignatureValue(t,i,s);const r={type:t,data:i,challenge:n,metadata:e};a&&(r.response=a),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:r}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:i}=e;return{path:this._path,method:this.method,url:t,status:i}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",i=""){const s=t.split(";").findIndex((t=>t===e));return i?i.split(";")[s]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,i,s,n,a){s?this._notifySignatureRequired(e,t,i,s,n,a):this._notifySignatureRequiredFirstStep(e,t,i,s)}_notifySignatureTypeUsingErrorCode(e,t,i,s,n,a,r){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,i,s,n):this._notifySignatureRequired(t,i,s,n,a,r)}},Me=class extends He{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}};class je extends He{constructor(e=null){super(Object.assign(e||{},{method:"POST"}))}toString(e=""){return super.toString(e||"BGADPRequestPOST")}}class Ve extends Me{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`investment-funds/v${this.version}/investment-funds/{investment-fund-id}/funds`)}toString(){return super.toString("BGADPInvestmentFundsInvestmentFundFundsGetV0")}}class Ue extends Me{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`investment-funds/v${this.version}/investment-funds/{investment-fund-id}/funds/{fund-id}`)}toString(){return super.toString("BGADPInvestmentFundsInvestmentFundFundsFundGetV0")}}class Be extends je{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`investment-funds/v${this.version}/investment-funds/{investment-fund-id}/funds/{fund-id}/subscriptions`)}toString(){return super.toString("BGADPInvestmentFundsInvestmentFundFundsFundSubscriptionsPostV0")}}class Ge extends je{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`investment-funds/v${this.version}/investment-funds/{investment-fund-id}/funds/{fund-id}/subscriptions/simulate`)}toString(){return super.toString("BGADPInvestmentFundsInvestmentFundFundsFundSubscriptionsSimulatePostV0")}}class ze extends Me{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`investment-funds/v${this.version}/investment-funds/{investment-fund-id}/funds/{fund-id}`)}toString(){return super.toString("BGADPInvestmentFundsInvestmentFundFundsFundGetV1")}}class Ke extends(m(s)){static get is(){return"bbva-local-investment-funds-api-dm"}static get properties(){return{version:{type:Number},fundDetailVersion:{type:Number},investVersion:{type:Number}}}constructor(){super(),this.version=0,this.fundDetailVersion=1,this.investVersion=0}getInvestmentFundContracts(e){const t={"investment-fund-id":e.investId};this._getInvestmentService("contracts",{},t,this.investVersion)}getInvestmentFundDetail(e){const t={"investment-fund-id":e.investId,"fund-id":e.fundId,...e.serie?{serie:e.serie}:{}};this._getInvestmentService("detail",{},t,this.fundDetailVersion)}postInvestmentFundSimulation(e,t){const i={"investment-fund-id":e.investId,"fund-id":e.fundId};this._getInvestmentService("simulate",t,i,this.investVersion)}postInvestmentFundSubscription(e,t){const i={"investment-fund-id":e.investId,"fund-id":e.fundId};this._getInvestmentService("subscribe",t,i,this.investVersion)}_getInvestmentService(e,t,i,s){const n={customEvent:`investment-funds-api-dm-${e.toLowerCase()}`,errorFireEventHandler:`investment-funds-api-dm-${e.toLowerCase()}-error`};this.version=s||this.version,this._generateGetService(this._getService(e,t,i,this.investVersion),n,this._responseMapping)}_getBgadp(e){return{contractsInvestmentFundV0:()=>new Ve(e),detailInvestmentFundV0:()=>new Ue(e),detailInvestmentFundV1:()=>new ze(e),simulateInvestmentFundV0:()=>new Ge(e),subscribeInvestmentFundV0:()=>new Be(e),default:()=>"BGADP called not exist"}}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}InvestmentFund`,this._getBgadp(s))}_responseMapping(e){return e}}class Je{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),s=i.length>>>0;if(0===s)return!1;let n=0|t,a=Math.max(n>=0?n:s-Math.abs(n),0);for(;a<s;){if((r=i[a])===(o=e)||"number"==typeof r&&"number"==typeof o&&isNaN(r)&&isNaN(o))return!0;a++}var r,o;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var i=[],s=0,n="",a=0,r=arguments.length;a!==r;++a){var o=+arguments[a];if(!(o<1114111&&o>>>0===o))throw RangeError("Invalid code point: "+o);o<=65535?s=i.push(o):(o-=65536,s=i.push(55296+(o>>10),o%1024+56320)),s>=16383&&(n+=e.apply(null,i),i.length=0)}return n+e.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",i=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${i&&i.message}`)}}class Xe extends Je{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}}const We=0,Ye=1,Qe="jwt",Ze="tsec",et="none";class tt extends Je{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=We,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new Xe,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=Ze:this.requiredToken=et,this.requiresJWT=!1):this.requiredToken===Ze?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===Qe?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===et?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(Ze)}_setJwtHandler(){this._setTokenHandler(Qe)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((i,s)=>{t=Object.assign(t,{resolve:i,reject:s}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let i=this._getRequestHeaders();Object.keys(i).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,i[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=p),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let i=e.replace(/[\{\}]+/g,""),s=t[i];return s?delete t[i]:this._error(9,`Missing ${i} param value`),s})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(t);i.length&&(e=[e,i.map((e=>{let i=t[e];return Array.isArray(i)&&this.paramArrayMode===Ye?this._arrayToQueryParam(e,i):`${e}=${i}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(Ze,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(Qe,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var s=t.getItem(i);s&&"null"!==s&&(e[i]=s)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const i=window.sessionStorage;t=Object.keys(i).filter((t=>t.startsWith(e))).reduce(((t,s)=>(t[s.replace(e,"")]=i.getItem(s),t)),{})}return t}_getTokenForRequestHeaders(e,t){const i=`${e}Handler`,s=e===Qe?"JWT ":"",n=e===Qe?"Authorization":Ze;if(void 0===this[i]||null===this[i])this._error(11,`${e} handler is undefined`);else{const a=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let r=this[i].getItem(a);r?t[n]=t[n]||s+r:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((i=>{t.push(`${i}=${e[i]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let i;const s=new Promise(((e,t)=>{i=(i,s)=>{i?t(i):e(s)}}));return t.addEventListener("loadend",(function e(s){t.removeEventListener("loadend",e),s.error?i(s.error):i(null,t.result)})),t.readAsText(e),s}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let i=0;for(;i<e.length;){let s=e[i],n=0,a=0;if(s<=127?(n=0,a=255&s):s<=223?(n=1,a=31&s):s<=239?(n=2,a=15&s):s<=244&&(n=3,a=7&s),e.length-i-n>0){let t=0;for(;t<n;)s=e[i+t+1],a=a<<6|63&s,t+=1}else a=65533,n=e.length-i;t+=String.fromCodePoint(a),i+=n+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},i=e.trim().split(/[\r\n]+/);for(const e in i)if(i.hasOwnProperty(e)&&""!==i[e]){let s=": ",n=i[e].split(s);t[n.shift().toLowerCase()]=n.join(s)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,i,s){let n=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(s)>=0&&(n=t.getResponseHeader(s));break;case this._NATIVE_XHR:t&&t.headers&&(n=JSON.parse(t.headers)[s])}if(n){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;e.getItem(t)!==n&&(e.setItem(t,n),this._emitTokenUpdate(i,n))}}_emitTokenUpdate(e,t){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,i,s,n,a;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),i=e.getResponseHeader("AuthenticationData"),s=e.getResponseHeader("AuthenticationState"),n=e.getResponseHeader("AuthenticationChallenge"),a=e.getResponseHeader("AuthenticationResponse");else{let r=JSON.parse(e.headers);t=r.authenticationtype,i=r.authenticationdata||null,s=r.authenticationstate,n=r.authenticationchallenge,a=r.authenticationresponse}return{type:t,data:i,state:s,challenge:n,response:a}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",i=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const s=this._getSignatureData(e,t,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:s}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",i="",s=""){let n;if("object"==typeof e&&e){const a=this._getSignatureData(e.signatureType,t,i);n=this._makeKeyValuePairFromObject(a,e.signatureValue),e.challenge&&(n+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(n,e.signatureType,s)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(n=`password=${e}`,this._buildSignatureHeaders(n,"2",s)):(n=`${i}=${e}`,this._buildSignatureHeaders(n,t,s)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let i,s=e.split(",");if(s.length>1){i=s.map((e=>`${e}=${t[e]}`)).join(",")}else i=`${e}=${t}`;return i}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),n=this._ERROR_CODES.SIGNATURE_INVALID.includes(s),{type:a,data:r,state:o,challenge:l,response:d}=this._extractSignatureResponseHeaders(e),c=this._getRequestMetadata(e);if(n)this._notifySignatureInvalid(c),i=!0;else if(a)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(s)?(this._notifySignatureTypeUsingErrorCode(s,c,a,r,o,l,d),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(c,a,r,o,l,d),i=!0}return i}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),s=this._extractResponseErrorCode(t),n=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(s),a=this._getRequestMetadata(e);n&&(this._notifyWaitingForProcessResponse(a),i=!0)}return i}_notifySignatureRequiredFirstStep(e,t,i,s){this._defineSignatureType(t,i),this._defineSignatureValue(t,i,s),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:i,metadata:e}}))}_notifySignatureRequired(e,t,i,s,n,a){this._defineSignatureValue(t,i,s);const r={type:t,data:i,challenge:n,metadata:e};a&&(r.response=a),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:r}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:i}=e;return{path:this._path,method:this.method,url:t,status:i}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",i=""){const s=t.split(";").findIndex((t=>t===e));return i?i.split(";")[s]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,i,s,n,a){s?this._notifySignatureRequired(e,t,i,s,n,a):this._notifySignatureRequiredFirstStep(e,t,i,s)}_notifySignatureTypeUsingErrorCode(e,t,i,s,n,a,r){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,i,s,n):this._notifySignatureRequired(t,i,s,n,a,r)}}class it extends tt{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}}class st extends it{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`patrimonial-contracts/v${this.version}/contracts/{contract-id}/investment-funds`)}toString(){return super.toString("BGADPPatrimonialContractsContractsContractInvestmentFundsGetV0")}}class nt extends(m(s)){static get is(){return"bbva-local-patrimonial-contracts-api-dm"}static get properties(){return{version:{type:Number}}}constructor(){super(),this.version=0}getInvestmentFunds(e){this._generateGetService(this._getService("investmentFunds",{},e),{customEvent:"patrimonial-contracts-api-dm-investment-funds",errorFireEventHandler:"patrimonial-contracts-api-dm-investment-funds-error"},this._responseMapping)}_getBgadp(e){return{investmentFundsContractsV0:()=>new st(e),default:()=>"BGADP called not exist"}}_getService(e,t={},i={}){const s=this._getServiceParams(i,t);return this._getServicePath(`${e}Contracts`,this._getBgadp(s))}_responseMapping(e){return e}}class at extends(g(f(i(ee(s))))){static get is(){return"bbva-feature-oc-fund-equity-contract-dm"}static get scopedElements(){const e=[Ie,Ke,nt,P,...at.configurationScopedElements()];return at.scopedElementsFromClasses(e)}static get properties(){return{customersVersion:{type:Number},errorCountLimit:{type:Number},fundConfigList:{type:Array},host:{type:String},investmentFundsVersion:{type:Number},native:{type:Boolean},otpId:{type:String},pdfUrl:{type:String},productsVersion:{type:Number},requiredToken:{type:String},_cache:{type:Object},_contractsDm:{type:Object},_customerDm:{type:Object},_detailEvent:{type:String},_errorCount:{type:Object},_investmentDm:{type:Object},_investmentDetailDm:{type:Object},_loading:{type:Boolean},_modalDetail:{type:Object},_productsDm:{type:Object},_simulateEvent:{type:String}}}constructor(){super(),this.customersVersion=0,this.errorCountLimit=2,this.fundConfigList=[],this.host="",this.investmentFundsVersion=0,this.native=!1,this.otpId="",this.pdfUrl="",this.productsVersion=0,this.requiredToken="",this._cache={},this._contractsDm=null,this._customerDm=null,this._detailEvent="",this._errorCount={},this._investmentDm=null,this._investmentDetailDm=null,this._loading=!1,this._modalDetail=null,this._productsDm=null,this._simulateEvent=""}firstUpdated(){this._customerDm=this.shadowRoot.querySelector("#customersDm"),this._investmentDm=this.shadowRoot.querySelector("#investmentDm"),this._investmentDetailDm=this.shadowRoot.querySelector("#investmentDetailDm"),this._contractsDm=this.shadowRoot.querySelector("#contractsDm"),this._productsDm=this.shadowRoot.querySelector("#productsDm")}getCustomerEmail(e){this._customerDm.getCustomerContactDetails(e)}getFundList(e){this._contractsDm.getInvestmentFunds(e)}getFundContracts(e){this._investmentDm.getInvestmentFundContracts(e)}getFundDetail(e,t="step"){const i=this._cache[`${e.fundName} - ${e.serie}`];if(this._detailEvent=t,null!=i&&i.fundName)return this._modalDetail={...i},void this._fireModalDetail();this._toggleLoading(),this._getFundDetailDescription(e),this._investmentDetailDm.getInvestmentFundDetail(e)}getInvestSimulation(e,t="step"){const{amount:i,currency:s,fundId:n,investId:a}=e,r={fundId:n,investId:a},o={requestedPositionSize:{indicator:{id:"CHARGE"},positionAmount:{amount:i,currency:s},positionType:{id:"AMOUNT"},quantity:null}};this._simulateEvent=t,this._toggleLoading(),this._investmentDm.postInvestmentFundSimulation(r,o)}getFundSubscription(e){this._toggleLoading();const{amount:t,currency:i,fundId:s,fundName:n,investId:a,serie:r}=e,o={fundId:s,investId:a},l={investmentFundsRegistry:{issuer:n,serializedNumber:r||"A"},positionSize:{positionType:{id:"AMOUNT"},positionAmount:{amount:t,currency:i}}};this._investmentDm.postInvestmentFundSubscription(o,l)}openDocument(e){const t={value:`${this.pdfUrl}/${e.id}.pdf`,mimeType:"application/pdf",headers:{"Content-Type":"application/pdf"},title:e.name,headerColor:"FFFFFFFF",tintColor:"FF072146",canShare:!1,titleColor:"FF072146",blackStatusBar:!1};this._fireEvent("open-pdf",t)}reset(){this._errorCount={}}_fireModalDetail(){this._modalDetail.title&&this._modalDetail.description&&(this._fireEvent(`set-fund-detail-for-${this._detailEvent}`,this._modalDetail),this._cache[`${this._modalDetail.title.name} - ${this._modalDetail.serie}`]={...this._modalDetail}),this._toggleLoading(!1)}_getFundDetailDescription(e){const t=`?name=${e.fundName.replace("+","%2B")}&serie=${e.serie}`;this._productsDm.getInvestmentFund("EJOP",t)}_getLiquidityLabel(e){const t=e.split(" ").join("-");return this._locale(`fund-liquidity-${t}`)}_manageCriticError(){this._toggleLoading(!1),this._fireEvent("service-error-response",{service:"",modal:"bbvaCallModal"})}_manageError(e){this._errorCount[e]||(this._errorCount[e]=0),this._errorCount[e]+=1,this._toggleLoading(!1),this._fireEvent("service-error-response",{service:e,modal:this._errorCount[e]<=this.errorCountLimit?"retryErrorModal":"bbvaCallModal"})}_onGetCustomerSuccess({detail:e}){const t=e.find((e=>"EMAIL"===e.contact.contactDetailType)).contact.address;this._fireEvent("set-customer-email",t),this.reset()}_onGetCustomerError(){this._fireEvent("set-customer-email-error","Error"),this._manageError("_getUserEmail")}_onGetFundListSuccess({detail:e}){this._toggleLoading(!1);const t=e.map((e=>{const t=this.fundConfigList.find((t=>t.fundName===e.fundName));return{...e,...t,name:`${e.fundName} - ${this._capitalize(e.fundClassification.fundSubtype.id)}`,liquidity:this._getLiquidityLabel(e.liquidation.liquidationPeriod)}}));this._fireEvent("set-fund-list",[...t]),this.reset()}_onGetFundListError({detail:e}){this._handleError(e,"_getFundList")}_onGetFundContractsSuccess({detail:e}){this._fireEvent("set-contract-fund-list",e)}_onGetFundContractsError({detail:e}){this._handleError(e,"_getFundContracts")}_onGetFundDetailSuccess({detail:e}){const{title:t,serie:i}=e;"step"===this._detailEvent?(this._cache[`${t.name} - ${i}`]=e,this._fireEvent(`set-fund-detail-for-${this._detailEvent}`,e),this._toggleLoading(!1)):(this._modalDetail={...this._modalDetail,...e},this._fireModalDetail()),this.reset()}_onGetFundDetailDescriptionSuccess({detail:e}){var t;const i=(null===(t=e[0])||void 0===t?void 0:t.description)||"EMPTY";this._modalDetail={...this._modalDetail,description:i},this._fireModalDetail(),this.reset()}_onGetFundDetailError({detail:e}){const t="modal"===this._detailEvent?"_getFundDetail":"_getFundLastProfit";this._handleError(e,t)}_onGetFundDetailDescriptionError(){this._modalDetail={...this._modalDetail,description:"EMPTY"},this._fireModalDetail()}_onGetInvestSimulation(e){this._fireEvent(`set-simulation-for-${this._simulateEvent}`,e.detail),this.reset()}_onGetInvestSimulationError({detail:e}){const t="modal"===this._simulateEvent?"_getFundSerie":"_getFundSimulation";this._handleError(e,t)}_onGetFundSubscriptionSuccess(e){this._toggleLoading(!1),this._fireEvent("set-subscription-receipt",e.detail),this.reset()}_onGetFundSubscriptionError({detail:e}){this._handleError(e,"_getFundSubscription")}_handleError({messages:e},t){const{message:i,code:s}=e[0];let n=!1;switch(-1!==i.indexOf("#")?i.split("#")[0]:s){case"QGE1011":this._fireEvent("set-subscription-in-process-receipt",{operationDate:`${i.split("#")[1].slice(0,10)}T00:00:00`,trackingNumber:i.split(" ")[1].slice(0,15)});break;case"AJE0117":this._fireEvent("service-error-call-banker");break;case"AJE6101":this._fireEvent("service-error-pvd-response");break;case"AJE6104":this._fireEvent("service-error-ppg-response");break;default:n=!0}n&&this._manageError(t),this._toggleLoading(!1)}_toggleLoading(e=!0){this._loading=e,this._fireEvent("service-loading-change",this._loading)}render(){return n`
      <bbva-global-customer-contact-details-api-dm
        id="customersDm"
        ?native=${this.native}
        .host=${this.host}
        .requiredToken=${this.requiredToken}
        .version=${this.customersVersion}
        @customer-contact-details-api-dm-fetch=${this._onGetCustomerSuccess}
        @customer-contact-details-api-dm-fetch-error=${this._onGetCustomerError}
      ></bbva-global-customer-contact-details-api-dm>

      <bbva-local-investment-funds-api-dm
        id="investmentDm"
        ?native=${this.native}
        .host=${this.host}
        .otpId=${this.otpId}
        .requiredOTP=${!0}
        .requiredToken=${this.requiredToken}
        .version=${this.investmentFundsVersion}
        @investment-funds-api-dm-contracts=${this._onGetFundContractsSuccess}
        @investment-funds-api-dm-contracts-error=${this._onGetFundContractsError}
        @investment-funds-api-dm-simulate=${this._onGetInvestSimulation}
        @investment-funds-api-dm-simulate-error=${this._onGetInvestSimulationError}
        @investment-funds-api-dm-subscribe=${this._onGetFundSubscriptionSuccess}
        @investment-funds-api-dm-subscribe-error=${this._onGetFundSubscriptionError}
        @signature-required-first-step-dm=${()=>this._toggleLoading(!1)}
        @api-dm-error=${this._manageCriticError}
      ></bbva-local-investment-funds-api-dm>

      <bbva-local-investment-funds-api-dm
        id="investmentDetailDm"
        ?native=${this.native}
        .host=${this.host}
        .otpId=${this.otpId}
        .requiredOTP=${!0}
        .requiredToken=${this.requiredToken}
        version="1"
        @investment-funds-api-dm-detail=${this._onGetFundDetailSuccess}
        @investment-funds-api-dm-detail-error=${this._onGetFundDetailError}
        @api-dm-error=${this._manageCriticError}
      ></bbva-local-investment-funds-api-dm>

      <bbva-local-patrimonial-contracts-api-dm
        id="contractsDm"
        ?native=${this.native}
        .host=${this.host}
        .requiredToken=${this.requiredToken}
        .version=${this.investmentFundsVersion}
        @patrimonial-contracts-api-dm-investment-funds=${this._onGetFundListSuccess}
        @patrimonial-contracts-api-dm-investment-funds-error=${this._onGetFundListError}
        @api-dm-error=${this._manageCriticError}
      ></bbva-local-patrimonial-contracts-api-dm>

      <bbva-local-products-api-dm
        id="productsDm"
        ?native=${this.native}
        .host=${this.host}
        .requiredToken=${this.requiredToken}
        .version=${this.investmentFundsVersion}
        @products-investment-fund-api-dm-fetch=${this._onGetFundDetailDescriptionSuccess}
        @products-investment-fund-api-dm-fetch-error=${this._onGetFundDetailDescriptionError}
        @api-dm-error=${this._manageCriticError}
      ></bbva-local-products-api-dm>
    `}}var rt=t`
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

[data-tag-name=bbva-button-row] {
  margin-top: 1.5rem;
}

[data-tag-name=bbva-notification-message] {
  margin-bottom: 1rem;
}

.receipt-title {
  margin: 0.5rem 0 1rem;
  font-size: 1.5rem;
  font-weight: 600;
}

.receipt-footer {
  padding-top: 1rem;
}
`;class ot extends(g(f(i(ee(s))))){static get is(){return"receipt-modal"}static get scopedElements(){const e=[w,y,v,x,S,E,pe,...ot.configurationScopedElements()];return ot.scopedElementsFromClasses(e)}static get properties(){return{config:{type:Object},inTimeMessage:{type:Object}}}constructor(){super(),this.config={},this.inTimeMessage={}}_getReceiptFooter(){var e,t;const i=[{icon:_(),label:this._locale("btn-label-share")}];return n`
      <div class="receipt-footer">
        <bbva-notification-message
          ?hidden=${null===(e=this.inTimeMessage)||void 0===e?void 0:e.hidden}
          variant="caution"
          book-title
          message-title=${null===(t=this.inTimeMessage)||void 0===t?void 0:t.message}
        ></bbva-notification-message>
        <bbva-type-text
          ?hidden=${!this.config.email}
          unset
          size="S"
          text=${this._locale("receipt-modal-footer")}
        ></bbva-type-text>
        <bbva-type-text
          unset
          size="S"
          text=${this.config.email}
          font-weight="500"
          class="receipt-modal-email"
        ></bbva-type-text>
        <bbva-button-row id="rowShare" ambient="primary-alt" .options=${i}></bbva-button-row>
      </div>
    `}static get styles(){return[rt]}render(){return n`
      <bbva-help-modal
        id="receiptModal"
        hide-content-padding-top
        full-height
        header-text=${this._locale("receipt-modal-header")}
      >
        <div slot="slot-content">
          <bbva-clip-microillustration
            microillustration=${this.config.status}
          ></bbva-clip-microillustration>
          <bbva-type-text
            class="receipt-title"
            unset
            text=${this._locale(`receipt-modal-purchase-${this.config.status}`)}
          ></bbva-type-text>
          <step-summary
            amount-huge
            ambient="primary"
            .summary=${this.config.receipt||[]}
          ></step-summary>
          ${this._getReceiptFooter()}
        </div>
      </bbva-help-modal>
    `}}var lt=t`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-expandable-multistep] {
  --_expandable-multistep-all-completed-background-color: #ffffff;
}

[data-tag-name=bbva-expandable-step] {
  padding: 0;
}

[data-tag-name=bbva-progress-content] {
  z-index: 12;
}

[data-tag-name=confirm-pannel] {
  min-width: 100%;
  border: none;
}

[slot=confirmation] {
  min-width: 100%;
  padding: 0;
  background-color: lime;
  border: none;
}

.content-info-message [data-tag-name=bbva-notification-message] {
  margin: 16px;
}

.main-header {
  transition: all 0.1s ease-in;
}
`;const{moment:dt}={...window};class ct extends(g(f(i(ee(s))))){static get is(){return"bbva-feature-oc-fund-equity-contract-mx"}static get scopedElements(){const e=[N,L,x,O,ie,at,ne,le,me,be,fe,ot,pe,...ct.configurationScopedElements()];return ct.scopedElementsFromClasses(e)}static get properties(){return{appSettings:{type:Object},assistancePhone:{type:Number},contract:{type:Object},contractFundList:{type:Array},currencyCode:{type:String,attribute:"currency-code"},currentBalanceId:{type:String},fundConfigList:{type:Array},fundCountLimit:{type:Number,attribute:"fund-count-limit"},language:{type:String},localCurrency:{type:String,attribute:"local-currency"},operationStart:{type:String},operationEnd:{type:String},otpId:{type:String},pageName:{type:String},pdfUrl:{type:String},customerId:{type:String},customersVersion:{type:Number},host:{type:String},investmentFundsVersion:{type:Number},native:{type:String},requiredToken:{type:String},useMocks:{type:Boolean},user:{type:Object},userEmail:{type:String},_dm:{type:Object},_allStepCompleted:{type:Boolean},_balance:{type:Number},_finalInvestAmount:{type:Number},_fundForSimulate:{type:Object},_fundCategoryList:{type:Object},_fundDetailSelected:{type:Object},_fundList:{type:Array},_fundSelected:{type:Object},_investAmount:{type:Number},_investAmountSimulation:{type:Number},_investStepTitle:{type:String},_lastErrorService:{type:String},_loading:{type:Boolean},_preventAnalytic:{type:Boolean},_receiptConfig:{type:Object},_userFundSerie:{type:String},_stepCompleteEvent:{type:String},_summaryFunds:{type:Array},_summaryInvest:{type:Array},_summaryLegals:{type:Array},_summaryOffer:{type:Array},_variantHead:{type:String}}}constructor(){super(),this.appSettings=null,this.assistancePhone=Q,this.contract={},this.contractFundList=[],this.currencyCode=G,this.currentBalanceId=B,this.fundConfigList=[],this.fundCountLimit=3,this.language=z,this.localCurrency=K,this.operationStart=X,this.operationEnd=W,this.otpId="",this.pageName="",this.pdfUrl=Y,this.host="",this.customersVersion=0,this.investmentFundsVersion=0,this.customerId="",this.requiredToken="tsec",this.native=null,this.useMocks=!1,this.user=null,this.userEmail="",this._dm=null,this._allStepCompleted=!1,this._balance=0,this._fundDetailSelected=null,this._finalInvestAmount=0,this._fundList=[],this._fundCategoryList={},this._fundForSimulate=null,this._fundSelected=null,this._investAmount=0,this._investAmountSimulation=0,this._investStepTitle="fund-step-with-categories-title",this._lastErrorService="",this._loading=!1,this._preventAnalytic=!1,this._receiptConfig=[],this._userFundSerie="",this._stepCompleteEvent="update-summary",this._summaryFunds=[],this._summaryInvest=[],this._summaryLegals=[],this._summaryOffer=[],this._variantHead="modal-initial"}firstUpdated(){this._dm=this.shadowRoot.querySelector("#mainDm"),this._preventDrawerScroll()}updated(e){var t;e.has("appSettings")&&(this.fundConfigList=(null===(t=this.appSettings)||void 0===t?void 0:t.ocFundDiciDocuments)||[]);e.has("contractFundList")&&this.contract.contractId&&this.contractFundList.length&&(this._updateContractSummary(),this._getFundList()),e.has("customerId")&&this._getUserEmail()}initPage({value:e}){e&&this._getFundContracts()}reset(){this._openStep("fundListStep"),this.contractFundList=[],this._fundList=[]}_fireDataDetails(e){let t={level4:e.detail?1:2,level5:""};"fund-step-title"!==this._investStepTitle&&(t={level5:e.detail?0:1}),this._fireDataLevel(t)}_fundKeyModalAnalytic(){this._openAlert("fundKeyModal"),this._fireAnalytic("footprintFundKeyModal")}_openAlert(e,t){this._openModal("alertModals",e),t&&this._fireAnalytic(t)}_openDocument({detail:e}){this._dm.openDocument(e),this._fireAnalytic("footprintOpenDocument")}_openModal(e,t){this.shadowRoot.querySelector(`#${e}`).openModal(t)}_openStep(e,t=!1){let i=null,s=3;const n=this.shadowRoot.querySelector(`#${e}`),a=this.shadowRoot.querySelectorAll('[data-tag-name="bbva-expandable-step"]');t&&(n.setAttribute("prevent-edit",!0),n.edit(),n.completed=!1,n.removeAttribute("prevent-edit")),a.forEach(((t,n)=>{const a=t;s=a.id===e?n:s,n===s&&(a.active=!0,a.completed=!1),n>s&&setTimeout((()=>{var e;a.active=!1,a.completed=!1,a.disabled=!0,i=this.shadowRoot.querySelector(`#${a.id}Content`),null===(e=i)||void 0===e||e.reset()}),50)}))}_preventDrawerScroll(){const e=document.getElementById(`cells-template-${this.pageName}`),t=null==e?void 0:e.shadowRoot.querySelector("cells-app-drawer");t&&t.addEventListener("scroll",(()=>{t.scrollTop=0}))}_retryService(){this[this._lastErrorService]&&this[this._lastErrorService]()}_getConfirmInvestAmount(){return this._getInTime()?this._investAmountSimulation:this._investAmount}_getInTime(){const e=dt(Date.now()),t=dt(Date.now()),i=dt(Date.now());return t.set({hour:this.operationStart.split(":")[0],minute:this.operationStart.split(":")[1],second:0,millisecond:0}),i.set({hour:this.operationEnd.split(":")[0],minute:this.operationEnd.split(":")[1],second:0,millisecond:0}),e>t&&e<i}_getFundContracts(){const e={investId:this.contract.contractId};this._dm.getFundContracts(e)}_getFundDetail(e){const t={fundId:e.id,fundName:e.fundName,investId:this.contract.contractId,serie:this._userFundSerie};this._fundDetailSelected=e,this._dm.getFundDetail(t,"modal")}_getFundLastProfit(e={}){var t;const i=e.id?e:this._fundSelected,s={fundId:i.id,fundName:i.fundName,investId:this.contract.contractId,serie:null===(t=this._fundSelected)||void 0===t?void 0:t.simulation.serie};this._dm.getFundDetail(s,"step")}_getFundList(){const e={"contract-id":this.contract.contractId};this._dm.getFundList(e)}_getFundSubscription(){const e={amount:this._investAmount,currency:this.currencyCode,fundId:this._fundSelected.id,fundName:this._fundSelected.fundName,investId:this.contract.contractId,serie:this._userFundSerie};this._dm.getFundSubscription(e)}_getFundSerie({detail:e}){var t;const i=null===(t=this.contractFundList.find((e=>e.serie===this.currentBalanceId)))||void 0===t?void 0:t.fundPosition,s={investId:this.contract.contractId,fundId:e.id,...i};this._fundForSimulate=e,this._dm.getInvestSimulation(s,"modal"),this.requestUpdate()}_getFundSimulation(){const e={amount:this._investAmount,currency:this.currencyCode,fundId:this._fundSelected.id,investId:this.contract.contractId};this._dm.getInvestSimulation(e)}_getSubscriptionResponse({detail:e}){const t={status:{id:"IN_PROCESS"},operationDate:e.operationDate,operationTracking:{operationNumber:e.trackingNumber},positionSize:{positionAmount:{amount:this._investAmount,currency:this.currencyCode}}};this._setSubscriptionReceipt({detail:t})}_getUserEmail(){this.customerId&&this._dm.getCustomerEmail(this.customerId)}_onAllStepCompleted({detail:e}){this._allStepCompleted=e,e&&(this._fireAnalytic("confirm"),setTimeout((()=>{this.shadowRoot.querySelector("#expandableMultistep").scrollToStepIndex=3}),1500))}_onOpenCallAction(){this._fireEvent("open-call-action",{value:this.assistancePhone}),this._onExitPage()}_onExitPage(){this._fireEvent("exit-new-fund-page"),this._dm.reset(),this.reset()}_onFundSelected(e){this._fundSelected=e.detail,this._preventAnalytic||(this._fireData({appStartedStep:this._fundSelected.fundName}),this._fireData({productFundName:this._fundSelected.fundName}),this._fireAnalytic("appStarted")),this._preventAnalytic=!1}_onFundSelectedFromModal({detail:e}){const t=this._fundList.find((t=>t.id===e.id)),i=this.shadowRoot.querySelector("#fundListStepContent");this._preventAnalytic=!0,i.selectFund(t),this._fireData({productFundName:t.fundName.toLowerCase()})}_onInvestAmountChanged({detail:e}){var t;const i=(null===(t=this._fundSelected.liquidation)||void 0===t?void 0:t.liquidationPeriod)===Z;this._investAmount=e.amount,this._getInTime()&&i?this._getFundSimulation():this._setSimulationStep({detail:[]})}_onLastProfitAccordionOpen({detail:e}){e&&this._fundSelected.name&&(this._fundSelected.lastProfit||this._getFundLastProfit())}_onReceiptShare(){this._fireEvent("share-contract-receipt",this._receiptConfig.result)}_onServiceErrorResponse({detail:e}){this._openAlert(null==e?void 0:e.modal),this._lastErrorService=null==e?void 0:e.service,"retryErrorModal"===(null==e?void 0:e.modal)&&this._fireAnalytic("footprintServiceNotAvailable")}_onShowChangeAlertModal(){const e=this.shadowRoot.querySelector("#fundListStep"),t=!e.getAttribute("prevent-edit"),i=this.shadowRoot.querySelector("#investmentStep"),s=this.shadowRoot.querySelector("#legalsStep");!e.completed&&t&&(e.completed=!0,this._openAlert("fundChangeAlert")),[i,s].forEach((e=>{const t=e;t.active&&setTimeout((()=>{t.completed=!1}),50)}))}_setFundContracts({detail:e}){var t;const i=null===(t=e.find((e=>e.serie===this.currentBalanceId)))||void 0===t?void 0:t.fundPosition;this._balance=i.amount,this.contractFundList=e}_setFundDetail({detail:e}){const t=this.shadowRoot.querySelector("#fundModals");if(!e.id)return this._openAlert("fundNotAvailableModal"),void this._fireAnalytic("footFundNotAvailable");t.fundDetail={detail:e,fund:this._fundForSimulate},t.openModal("fundDetailModal"),this._fireDataDetails({detail:!0}),this._fireAnalytic("footprintFundDetail")}_setFundList({detail:e}){const t=this.shadowRoot.querySelector("#expandableMultistep"),i=this.contractFundList.map((e=>e.title.name)),s=e.filter((e=>!i.includes(e.fundName)));if(this._fundList=[...s],!this._fundList.length)return this._openAlert("noFundsModal"),void this._fireAnalytic("footprintnoFunds");this.userEmail||this._getUserEmail(),t.scrollToStepIndex=1}_setLastProfit({detail:e}){const t=dt(e.netAssetValueDate).format("DD/MM/YYYY"),i=e.profitabilityRatios.find((e=>"MONTHLY"===e.period)),s=e.profitabilityRatios.find((e=>"ANNUAL"===e.period)),n=[{type:"label",label:this._locale("investment-step-last-profit-description"),value:"",alert:this._locale("investment-step-last-profit-date",{date:t})},{type:"label",label:this._locale("investment-step-last-profit-monthly"),value:`${i.value}%`},{type:"label",label:this._locale("investment-step-last-profit-annual"),value:`${s.value}%`}];this._fundSelected={...this._fundSelected,lastProfit:n}}_setParsedFundList({detail:e}){const t=e.viewMore?"ver todos":e.list[e.selected].category.toLowerCase();this._fundCategoryList={...e},this._openModal("fundModals","fundListModal"),this._fireAnalytic("appStarted",{appStartedStep:t}),this._fireAnalytic("footprintModalFundlist")}_setSimulationStep({detail:e}){var t;let i=[];const s=e||{},n=this.shadowRoot.querySelector("#investmentStepContent"),a=null==s||null===(t=s.requestedPositionSize)||void 0===t?void 0:t.positionAmount;s.liquidation&&(i=[{type:"amount-big",label:this._locale("investment-step-title"),amount:a.amount,currencyCode:a.currency,localCurrency:this.localCurrency,help:"show-invest-definition-pressed",alert:this._locale("investment-step-input-amount-help-message")},{type:"amount",label:this._locale("investment-step-price-title-text"),amount:s.netAssetValue.amount,currencyCode:s.netAssetValue.currency,localCurrency:this.localCurrency},{type:"label",label:this._locale("investment-step-title-number-text"),value:s.requestedPositionSize.quantity},{type:"label",label:this._locale("investment-step-serie-text"),value:s.serie}]),n.lastProfit=[],n.simulation=i,n.showSimulation=Boolean(i.length),this._investAmountSimulation=null==a?void 0:a.amount,this._fundSelected={...this._fundSelected,simulation:s,lastProfit:null},this._loading=!1,i.length?this._fireAnalytic("simulation",{investAmount:a.amount,investAmountCurrency:a.currency}):n.completeStep()}_setSubscriptionReceipt({detail:e}){var t,i,s,n,a;const r="COMPLETED"===e.status.id,o=dt(new Date).format("[T]HH[:]MM"),l=e.operationDate.replace("T00:00",o),d={inTime:r,status:r?"success":"pending",email:this.userEmail,process:"",receipt:[{type:"amount-big",label:this._locale("receipt-modal-investment-amount"),amount:e.positionSize.positionAmount.amount,currencyCode:e.positionSize.positionAmount.currency,localCurrency:this.localCurrency},{type:"label",label:this._locale("receipt-modal-date-time"),value:dt(l).format("D MMM YYYY, HH:mm[h]")},{hideOutTime:!0,type:"amount",label:this._locale("receipt-modal-price-title"),amount:null==e||null===(t=e.investmentFundsRegistry)||void 0===t?void 0:t.issuerPrice.amount,currencyCode:null==e||null===(i=e.investmentFundsRegistry)||void 0===i?void 0:i.issuerPrice.currency,localCurrency:this.localCurrency},{hideOutTime:!0,type:"label",label:this._locale("receipt-modal-number-titles"),value:null==e||null===(s=e.investmentFundsRegistry)||void 0===s?void 0:s.titles},{type:"label",label:this._locale("receipt-modal-contract-number"),badge:this.contract.id},{type:"label",label:this._locale("receipt-modal-operation-type"),value:this._locale("receipt-modal-fund-purchase")},{type:"label",label:this._locale("receipt-modal-investment-service"),value:this._locale(`offer-step-summary-service-${this.contract.managementServices.name}`)},{type:"label",label:this._locale("receipt-modal-name-fund"),value:this._capitalize(this._fundSelected.fundClassification.fundSubtype.id)},{type:"label",label:this._locale("receipt-modal-key-fund"),value:this._fundSelected.fundName},{type:"label",label:this._locale("receipt-modal-liquidity"),value:this._fundSelected.liquidity},{hideOutTime:!0,type:"label",label:this._locale("receipt-modal-serie"),value:null==e||null===(n=e.investmentFundsRegistry)||void 0===n?void 0:n.serializedNumber},{type:"label",label:this._locale("receipt-modal-folio"),value:e.operationTracking.operationNumber}].filter((e=>r||!e.hideOutTime))},c={templateSelected:"ocFundEquityContract",operative:"ocFundEquityContract",operationType:this._locale("receipt-modal-fund-purchase"),operationDate:l,operationTitle:this._locale(`receipt-modal-purchase-${d.status}`),operationFolio:e.operationTracking.operationNumber,contractNumber:this._mask(this.contract.id),investment:{service:this._locale(`offer-step-summary-service-${this.contract.managementServices.name}`),...e.positionSize.positionAmount},fund:{id:this._fundSelected.fundName,name:this._capitalize(this._fundSelected.fundClassification.fundSubtype.id),liquidity:this._fundSelected.liquidity,serie:null==e||null===(a=e.investmentFundsRegistry)||void 0===a?void 0:a.serializedNumber}};this._receiptConfig={...d,result:c},this._openModal("receiptModals","receiptModal"),this._fireEvent("config-contract-receipt",{result:c}),this._fireAnalytic("appCompleted",{applicationState:r?"contratado":"en revision",operationNumber:e.operationTracking.operationNumber})}_setUserEmail({detail:e}){this.userEmail=`•${e.replace(/[*]/g,"")}`}_setFundSerie({detail:e}){this._userFundSerie=e.serie,this._getFundDetail({...e,id:this._fundForSimulate.id})}_updateContractSummary(){var e,t,i,s,n;const a=null===(e=this.contract)||void 0===e||null===(t=e.managementServices)||void 0===t?void 0:t.name,r=[{type:"label",label:this._locale("offer-step-summary-contract"),badge:`•${null===(i=this.contract)||void 0===i?void 0:i.number}`},{type:"label",label:this._locale("offer-step-summary-service"),value:this._locale(`offer-step-summary-service-${a}`)},{type:"amount",label:this._locale("offer-step-summary-user-balance"),amount:null===(s=this.contract)||void 0===s?void 0:s.portfolioValue.amount,currencyCode:null===(n=this.contract)||void 0===n?void 0:n.portfolioValue.currency,localCurrency:this.localCurrency}];this._updateSummary("Offer",r)}_updateHeaderColor({detail:e}){this._variantHead="modal-initial-secondary",this._variantHead=e.completed?"modal-initial-secondary":"modal-initial"}_updateFundStepTitle({detail:e}){this._investStepTitle=e?"fund-step-with-categories-title":"fund-step-title",this._fireDataLevel({level3:e?0:1,level4:0}),this._fundList.length&&this._fireAnalytic("pageVisit")}_updateSummary(e,t){const i=t.detail||t;this[`_summary${e}`]=[...i]}_onMainHeaderExit(){this._onExitPage(),this._fireAnalytic("appStarted",{appStartedStep:"cerrar"})}_onConfirmChangeFund(){this._openStep("fundListStep",!0),this._onStepEdit({detail:0})}_onStepOpen(e){const t={0:"fundList",1:"invest",2:"documents"}[e.target.step+1];e.detail&&t&&this._fireAnalytic(`${t}`)}_onStepEdit({detail:e},t){t&&this._openStep(t),this._onStepOpen({detail:!0,target:{step:e-1}})}_getNotificationMessage(e){var t,i,s;const n=this._getInTime()?"in":"out",a="MISMO DIA"===(null===(t=this._fundSelected)||void 0===t||null===(i=t.liquidation)||void 0===i?void 0:i.liquidationPeriod),r=`notification-message-${e}-${n}-schedule-${a?"same-day":"liquidity"}`,o=a&&this._getInTime(),l={start:this.operationStart,end:this.operationEnd,liquidity:null===(s=this._fundSelected)||void 0===s?void 0:s.liquidity};return{message:this._locale(r,l),hidden:o}}_tplNotificationMessage(){const e=this._getNotificationMessage("summary");return n`
      <bbva-notification-message
        ?hidden=${e.hidden}
        variant="caution"
        book-title
        message-title=${e.message}
      ></bbva-notification-message>
    `}_tplStepFundList(){return n`
      <bbva-expandable-step
        id="fundListStep"
        show-link
        hide-padding-left
        hide-padding-right
        hide-padding-top
        header=${this._locale(this._investStepTitle)}
        .completeOnEvent=${this._stepCompleteEvent}
        edit-label=${this._locale("btn-label-edit")}
        @expandable-step-edit-step=${this._onShowChangeAlertModal}
        @expandable-step-complete-change=${this._onStepOpen}
      >
        <fund-list-step-content
          id="fundListStepContent"
          class="content"
          .list=${this._fundList}
          limit=${this.fundCountLimit}
          @fund-view-more-pressed=${this._setParsedFundList}
          @fund-item-selected=${this._onFundSelected}
          @has-categories-changed=${this._updateFundStepTitle}
          @show-fund-detail-pressed=${this._getFundSerie}
          @update-summary=${e=>this._updateSummary("Funds",e)}
        ></fund-list-step-content>
        ${this._tplSummary("Funds")}
      </bbva-expandable-step>
    `}_tplStepInvestment(){var e,t,i,s;return n`
      <bbva-expandable-step
        id="investmentStep"
        class="animation"
        show-link
        hide-padding-top
        header=${this._locale("investment-step-title")}
        .completeOnEvent=${this._stepCompleteEvent}
        edit-label=${this._locale("btn-label-edit")}
        @expandable-step-edit-step=${e=>this._onStepEdit(e,"investmentStep")}
        @expandable-step-complete-change=${this._onStepOpen}
      >
        <investment-step-content
          id="investmentStepContent"
          class="content"
          .currencyCode=${null===(e=this.contract)||void 0===e||null===(t=e.portfolioValue)||void 0===t?void 0:t.currency}
          .fund=${this._fundSelected}
          .inTime=${this._getInTime()}
          .language=${this.language}
          .localCurrency=${this.localCurrency}
          .maxAmount=${this._balance}
          .minAmount=${(null===(i=this._fundSelected)||void 0===i?void 0:i.minAmount)||0}
          .operationStart=${this.operationStart}
          .operationEnd=${this.operationEnd}
          .lastProfit=${(null===(s=this._fundSelected)||void 0===s?void 0:s.lastProfit)||[]}
          @expandable-accordion-open-change=${this._onLastProfitAccordionOpen}
          @invest-amount-changed=${this._onInvestAmountChanged}
          @show-invest-definition-pressed=${()=>this._openAlert("investDefinitionModal","footprintIvenstmentAmount")}
          @update-summary=${e=>this._updateSummary("Invest",e)}
        ></investment-step-content>
        ${this._tplSummary("Invest")}
      </bbva-expandable-step>
    `}_tplStepLegals(){return n`
      <bbva-expandable-step
        id="legalsStep"
        class="animation"
        show-link
        hide-padding-left
        hide-padding-right
        hide-padding-top
        header=${this._locale("legals-step-title")}
        .completeOnEvent=${this._stepCompleteEvent}
        .editLabel=${this._locale("btn-label-consult")}
        @expandable-step-edit-step=${this._onStepEdit}
        @expandable-step-complete-change=${this._onStepOpen}
      >
        <legals-step-content
          id="legalsStepContent"
          class="content"
          accept-selected
          .fundSelected=${this._fundSelected}
          @show-privacy-link-pressed=${()=>this._openAlert("privacyModal","footprintPrivacyModal")}
          @update-summary=${e=>this._updateSummary("Legals",e)}
          @document-link-pressed=${this._openDocument}
        ></legals-step-content>
        ${this._tplSummary("Legals")}
      </bbva-expandable-step>
    `}_tplStepOffer(){return n`
      <bbva-expandable-step
        id="offerStep"
        hide-padding-left
        hide-padding-right
        hide-padding-top
        prefilled
        header=${this._locale("offer-step-title")}
      >
        ${this._tplSummary("Offer")}
      </bbva-expandable-step>
    `}_tplSummary(e){const t=["Offer","Funds","Legals"].includes(e);return n`
      <step-summary
        class="summary"
        slot="summary"
        hide-help
        ?spacing=${t}
        .summary=${this[`_summary${e}`]}
      ></step-summary>
    `}static get styles(){return[lt,b("new-fund-in-patrimonial-contract-shared-styles")]}render(){return n`
      <bbva-progress-content
        variant="transparent"
        ?visible=${this._loading}
      ></bbva-progress-content>
      <bbva-header-main
        class="main-header"
        close-icon-aria-label="Oc Fund equity contract"
        text=${this._locale("main-title")}
        variant=${this._variantHead}
        @header-main-icon-click=${this._onMainHeaderExit}
      ></bbva-header-main>
      <bbva-expandable-multistep
        id="expandableMultistep"
        tabindex="0"
        has-animation
        has-confirm-animation
        hide-disabled-steps
        @expandable-multistep-all-complete=${this._onAllStepCompleted}
        @expandable-multistep-specific-step-scroll=${this._updateHeaderColor}
        step-selector="[data-tag-name='bbva-expandable-step']"
      >
        <div slot="content">
          ${this._tplStepOffer()} ${this._tplStepFundList()} ${this._tplStepInvestment()}
          ${this._tplStepLegals()}

          <div class="content-info-message" ?hidden=${!this._allStepCompleted}>
            ${this._tplNotificationMessage("summary")}
            <bbva-notification-message
              book-title
              message-title=${this._locale("content-info-message-within-hours")}
            ></bbva-notification-message>
          </div>
        </div>
        <div slot="confirmation">
          <confirm-pannel
            class="content-summary"
            .amount=${this._getConfirmInvestAmount()}
            .currencyCode=${this.currencyCode}
            .localCurrency=${this.localCurrency}
            @submit-fund-contract=${this._getFundSubscription}
          ></confirm-pannel>
        </div>
      </bbva-expandable-multistep>

      <div class="content-modals">
        <fund-modals
          id="fundModals"
          .contract=${this.contract}
          .fundCategoryList=${this._fundCategoryList}
          .localCurrency=${this.localCurrency}
          .operationStart=${this.operationStart}
          .operationEnd=${this.operationEnd}
          @detail-menu-tab-pressed=${this._fireDataDetails}
          @document-link-pressed=${this._openDocument}
          @form-field-help-click=${this._fundKeyModalAnalytic}
          @fund-item-selected=${this._onFundSelectedFromModal}
          @select-fund-detail-pressed=${this._onFundSelectedFromModal}
          @show-fund-detail-pressed=${this._getFundSerie}
        ></fund-modals>

        <alert-modals
          id="alertModals"
          .operationStart=${this.operationStart}
          @error-service-call=${this._onOpenCallAction}
          @error-service-exit=${this._onExitPage}
          @error-service-retry=${this._retryService}
          @fund-change-accepted=${this._onConfirmChangeFund}
        ></alert-modals>

        <receipt-modal
          id="receiptModals"
          .inTime=${this._getInTime()}
          .config=${this._receiptConfig}
          .inTimeMessage=${this._getNotificationMessage("receipt")}
          @button-row-item-click=${this._onReceiptShare}
          @help-modal-close=${this._onExitPage}
        ></receipt-modal>
      </div>

      <bbva-feature-oc-fund-equity-contract-dm
        id="mainDm"
        ?native=${this.native}
        .customersVersion=${this.customersVersion}
        .fundConfigList=${this.fundConfigList}
        .host=${this.host}
        .investmentFundsVersion=${this.investmentFundsVersion}
        .otpId=${this.otpId}
        .pdfUrl=${this.pdfUrl}
        .requiredToken=${this.requiredToken}
        .useMocks=${this.useMocks}
        @service-error-response=${this._onServiceErrorResponse}
        @service-error-call-banker=${()=>this._openAlert("fundNotAvailableModal")}
        @service-error-pvd-response=${()=>this._openAlert("pdvErrorModal")}
        @service-error-ppg-response=${()=>this._openAlert("ppgErrorModal")}
        @service-loading-change=${({detail:e})=>{this._loading=e}}
        @set-contract-fund-list=${this._setFundContracts}
        @set-customer-email=${this._setUserEmail}
        @set-fund-detail-for-modal=${this._setFundDetail}
        @set-fund-detail-for-step=${this._setLastProfit}
        @set-fund-list=${this._setFundList}
        @set-simulation-for-step=${this._setSimulationStep}
        @set-simulation-for-modal=${this._setFundSerie}
        @set-subscription-receipt=${this._setSubscriptionReceipt}
        @set-subscription-in-process-receipt=${this._getSubscriptionResponse}
        @signature-required-first-step-dm=${()=>this._fireAnalytic("otp")}
      ></bbva-feature-oc-fund-equity-contract-dm>
    `}}customElements.define(ct.is,ct);const ht=e((e=>class extends e{static get properties(){return{config:{type:Object},data:{type:Object},appStartedText:{type:String},stringNormalizeExceptions:{type:Array},dynamicMethodsName:{type:Array},dependsOnAppStartedLaunched:{type:Boolean},_isAppStartedLaunched:{type:Boolean}}}constructor(){super(),this.config={items:{},buttons:{continue:""},steps:{}},this.data={},this.appStartedText="app started:",this.stringNormalizeExceptions=["paymentCurrency","currency","operationNumber"],this.dynamicMethodsName=[],this.dependsOnAppStartedLaunched=!1,this._isAppStartedLaunched=!1}persistData(e){Object.assign(this.data,e)}buildDynamicMethods(){this.dynamicMethodsName.forEach((e=>{this[e]=()=>this._dispatch(`analytics-${this._camelToKebabCase(e)}`,this.data)}))}_camelToKebabCase(e){return e.replace(/[A-Z]/g,(e=>`-${e.toLowerCase()}`))}persistDataString(e){Object.assign(this.data,this.parseDataToString(e))}_toStringProcess(e,t){const i=e.toString();return this.stringNormalizeExceptions.includes(t)?i:this._normalizeStr(i)}_normalizeStr(e){let t=e;if("string"==typeof e){const i="ÁÃÀÄÂÉËÈÊÍÏÌÎÓÖÒÔÚÜÙÛÇáãàäâéëèêíïìîóöòôúüùûç",s="AAAAAEEEEIIIIOOOOUUUUCaaaaaeeeeiiiioooouuuuc",n=new RegExp(`[${i}]`,"ug");t=e.replace(n,(e=>s.charAt(i.indexOf(e)))).toLowerCase()}return t}parseDataToString(e,t){if(!e)return e;switch(typeof e){case"string":case"boolean":case"number":return this._toStringProcess(e,t);case"object":if(Array.isArray(e))return e.map((e=>this.parseDataToString(e)));const i={...e};return Object.keys(i).forEach((t=>{i[t]=this.parseDataToString(e[t],t)})),i;case"function":return this.parseDataToString(e());default:return e.toString()}}firePersistedData(e){this.persistData(e),this._dispatch("analytics-persisted-data",this.data)}fireNormalizedPersistedData(e){let t=e;"string"==typeof t&&(t=this.normalizeString(t)),"object"==typeof t&&Object.keys(t).forEach((e=>{t[e]=this.normalizeString(t[e])})),this.firePersistedData(t)}resetData(){this.data={},this._isAppStartedLaunched=!1}firePageVisit(){this._dispatch("analytics-page-visit",this.data),this._isAppStartedLaunched=!1}firePageView(e){this._dispatch("analytics-page-view"+(e?`-${e}`:""))}fireModal(){this._dispatch("analytics-modal")}fireModalWithData(){this._dispatch("analytics-modal",this.data)}fireInternalLink(e){this._dispatch("analytics-internal-link",e)}fireInternalLinkCard(e){this._dispatch("analytics-internal-link-card",e)}fireExternalLink(){this._dispatch("analytics-external-link")}fireItemAppStarted(e){if(!this._isAppStartedLaunched){const t=(null==e?void 0:e.id)||e,i=this._getTextConfig(t,"items");i&&(this.fireAppStarted(i),this._isAppStartedLaunched=this.dependsOnAppStartedLaunched)}}fireAppOnClickStart(){this._dispatch("analytics-app-on-click-start",this.data)}fireAppStarted(e){this.persistData({detail:`${this.appStartedText}${e}`}),this._dispatch("analytics-app-started",this.data)}fireAdvancedMark(){this._dispatch("analytics-advanced-mark",this.data)}fireAppCompleted(){this._dispatch("analytics-app-completed",this.data),this.resetData()}fireFrequentAppCompleted(){this._dispatch("analytics-frequent-app-completed",this.data),this.resetData()}normalizeString(e){return e.toLowerCase().normalize("NFD").replace(/[^a-zA-Z0-9 ]/g,"")}_getTextConfig(e,t){var i,s;return null===(i=this.config)||void 0===i||null===(s=i[t])||void 0===s?void 0:s[e]}getPathValue(e,t){return t.split(".").reduce(((e,t)=>e[t]),e)}_dispatch(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}})),ut=e((e=>class extends(ht(e)){static get properties(){return{currentStep:{type:Number},signatureTypes:{type:Object},signaturePrefix:{type:String},operationNumberPath:{type:String}}}constructor(){super(),this.currentStep=1,this.signatureTypes={},this.signaturePrefix="firma:",this.operationNumberPath="id"}fireStepLoaded(){1===this.currentStep?this.firePageVisit():this._dispatch(`analytics-${this.config.steps[this.currentStep]}`,this.data)}fireButtonAppStarted(){this.fireAppStarted(this.config.buttons.continue)}onStep(e){const t=null==e?void 0:e.currentStep,i=this._getTextConfig(t,"steps");i&&this._dispatch(`analytics-${i}`,this.data)}onLastStep(e){e&&this._dispatch(`analytics-${this.config.steps.last}`,this.data)}manageAnalyticsSign(e){if(e&&Object.keys(e).length){var t;const i=null===(t=this.signatureTypes)||void 0===t?void 0:t[null==e?void 0:e.signatureType];i&&this.persistData({customFields:`${this.signaturePrefix}${i}`})}this._dispatch(`analytics-${this.config.steps.sign}`,this.data)}parseAnalyticsConfirmData(e){const t=null==e?void 0:e[this.operationNumberPath];t&&(this.persistData({operationNumber:t}),this.fireAppCompleted())}}));class pt extends(ut(i(s))){static get is(){return"bbva-feature-oc-fund-equity-contract-mx-analytics-dm"}static get properties(){return{}}}customElements.define(pt.is,pt);
