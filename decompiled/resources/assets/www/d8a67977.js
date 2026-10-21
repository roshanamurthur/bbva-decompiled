import{z as t,a8 as e,aa as a,an as i,aJ as r,a as s,L as o,ak as n,h as l,aV as c}from"./952f98a9.js";import{B as d}from"./f6b0e03b.js";import{a7 as p}from"./7f3d7ca9.js";import{K as b,I as h,F as g,G as m,h as v}from"./216055dc.js";import{B as u,b as _}from"./6b902eda.js";import"./c0a2f832.js";import"./cae0f1de.js";var $=t`:host {
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

.header {
  padding-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(a.spacer)}))) / 16) * 1rem);
  padding-left: calc(((3.75 * var(--gridSpacerVariant, var(--gridSpacer, ${e(a.spacer)}))) / 16) * 1rem);
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(a.spacer)}))) / 16) * 1rem);
}

.container {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(a.spacer)}))) / 16) * 1rem);
}

.container-products {
  padding: calc(((0 * var(--gridSpacerVariant, var(--gridSpacer, ${e(a.spacer)}))) / 16) * 1rem);
}
.container-products__content--title {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(a.spacer)}))) / 16) * 1rem);
}
.container-products__content--info {
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(a.spacer)}))) / 16) * 1rem);
}
.container-products .panel {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(a.spacer)}))) / 16) * 1rem);
}
.container-products .panel .element {
  padding-top: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(a.spacer)}))) / 16) * 1rem);
}
.container-products .panel .element__info {
  margin: calc(((1.25 * var(--gridSpacerVariant, var(--gridSpacer, ${e(a.spacer)}))) / 16) * 1rem) 0;
}
`;class f extends(p(i(r(s(o))))){static get is(){return"bbva-widget-loan-sustainable-product-list"}static get scopedElements(){return{"bbva-clip-microillustration":b,"bbva-local-application-catalogs-api-dm":d,"bbva-divider-default":h,"bbva-notification-help":g,"bbva-tab-default":u,"bbva-type-text":m,"bbva-header-main":v}}static get properties(){return{catalogsApiVersion:{type:String,attribute:"loyalty-api-version"},descriptionTitle:{type:String,attribute:"description-title"},descriptionList:{type:String,attribute:"description-list"},buttonText:{type:String,attribute:"button-text"},elementTitleColor:{type:String,attribute:"element-title-color"},microIllustrationHeader:{type:String,attribute:"micro-illustration-header"},_list:{type:Array},_auxiliaryList:{type:Array}}}constructor(){super(),this.catalogsApiVersion="0",this.descriptionList="bbva-widget-loan-sustainable-product-list-description",this.descriptionTitle="bbva-widget-loan-sustainable-product-list-title-description",this.buttonText="bbva-widget-loan-sustainable-product-button-text",this.elementTitleColor="#121212",this.microIllustrationHeader="sustainabletip",this.requiredToken="tsec",this._list=[],this._tabOptions=[],this._isDataLoaded=!1}static get styles(){return[$,n("bbva-widget-loan-sustainable-product-list-shared-styles"),_.primaryAlt]}setUpBbvaLocalCatalogsDM(){this.recordsDmLocal=this.selectorApplicationCatalogsDm,this.recordsDmLocal.getCatalogRecords("SCAT")}async _handleCatalogRecordsApiDmFetch({detail:t}){this._list=t,this._list.map((t=>this._tabOptions.push({title:t.name}))),this._isDataLoaded=!0,await this.updateComplete}_onRequestError(t){t.detail&&this.openCatalogCodeServiceErrorModal()}openCatalogCodeServiceErrorModal(){this._setModalConfig("CATALOG-RECORDS-CODE-SERVICE-ERROR","catalog-record-code-service-error-header",[{title:"catalog-record-code-service-error-title"},{text:"catalog-record-code-service-error-exit"}],{acceptBtLabel:"catalog-record-code-service-error-exit-button"})}_setModalConfig(t,e,a,i){const r={className:"full-height-error header--white",hideCloseIcon:!1,openMaximized:!1,title:e,heroImage:"./images/Error.svg",...i,template:{type:"paragraphs",values:[...a]}};this._openModal(t,r)}_openModal(t,e){const a={code:t,selectedConfig:e};this.reset(),this.dispatchEvent(new CustomEvent("open-modal",{bubbles:!0,composed:!0,detail:a}))}get _contentTemplate(){return l`
      <div class="container-products">
        <bbva-tab-default
          id="tab-default"
          class="container__list"
          sticky
          selected="0"
          full-height
          ambient="primary-alt"
          .options=${this._tabOptions}
        >
          ${this._fillContent()}
        </bbva-tab-default>
      </div>
    `}_fillContent(){return this._list.map(((t,e)=>{const a=this._processPanel(t,e);return l`${a}`}))}_processPanel(t,e){return l`
      <div
        class="panel"
        tabindex="${e}"
        role="tabpanel"
        id=${`content-${e}`}
        aria-labelledby=${`tab-${e}`}
        .disabled=${this.disabled}
        .loading=${!this._isDataLoaded}
      >
      ${this._processListItem(t)}
      </div>
    `}_processListItem(t){return t.subcategories.map(((e,a)=>l`
        <div class="element">
          <bbva-type-text
            class="element__title"
            size="L"
            inherit=""
            text="${e.name}"
            text-color="${this.elementTitleColor}"
            font-weight="500"
          ></bbva-type-text>
          <bbva-type-text
            class="element__info"
            inherit=""
            text="${e.description}"
            font-weight="350"
            size="S"
            ></bbva-type-text>
          </div>
          ${a<t.subcategories.length-1?l`<bbva-divider-default></bbva-divider-default>`:c}
        `))}exitFlow(){this.reset(),this.dispatchEvent(new CustomEvent("exit-flow",{bubbles:!0,composed:!0}))}reset(){this._isDataLoaded=!1,this._list=[],this._tabOptions=[]}get _header(){return l`
      <header class="header">
        <bbva-clip-microillustration
          microillustration="${this.microIllustrationHeader}"
        ></bbva-clip-microillustration>
      </header>
      <div class="container">
        <div class="container__content">
          <bbva-type-text
            class="container__content--title"
            font-weight="700"
            text="${this.descriptionTitle}"
            size="3XL"
            inherit=""
          ></bbva-type-text>
          <bbva-type-text
            class="container__content--info"
            text="${this.descriptionList}"
            font-weight="350"
            inherit=""
            size="S"
          ></bbva-type-text>
        </div>
      </div>
    `}get _headerMain(){return l`
    <bbva-header-main
      id="basic"
      variant="modal-initial"
      text="bbva-widget-loan-sustainable-text-product"
      close-icon-aria-label="Close Catalog"
      @header-main-icon-click=${()=>this.exitFlow()}
    >
    </bbva-header-main>
    `}get selectorApplicationCatalogsDm(){return this.shadowRoot.querySelector("#recordsCatalogDm")}get _elementApplicationCatalogs(){return l`
    <bbva-local-application-catalogs-api-dm
      id="recordsCatalogDm"
      host="${this.host}"
      version="${this.catalogsApiVersion}"
      ?native="${this.native}"
      requiredToken="${this.requiredToken}"
      @catalog-record-api-dm-fetch="${this._handleCatalogRecordsApiDmFetch}"
      @catalog-record-api-dm-error="${this._onRequestError}">
    </bbva-local-application-catalogs-api-dm>
    `}render(){return l`
      ${super.render()}
      ${this._elementApplicationCatalogs}
      ${this._headerMain}
      ${this._header}
      ${this._isDataLoaded?this._contentTemplate:c}
    `}}customElements.define(f.is,f);
