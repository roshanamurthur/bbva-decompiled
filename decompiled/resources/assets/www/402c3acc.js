import{z as e,an as t,L as i,ak as a,h as s,db as n,dc as o,dd as r,de as l,df as d,dg as c,dh as b,ck as h,bF as u,cQ as p}from"./952f98a9.js";import{R as v,S as m,v as g,L as f,ae as y,z as _,af as x,H as T,G as $,M as k,I as D,x as A,a4 as C,Q as w,T as I,D as S,a3 as M,E as L,aa as z,ah as B,f as E,V as F,j}from"./216055dc.js";import{B as V,b as U}from"./77df3611.js";import{B as H}from"./6b902eda.js";import{aH as O,R as q}from"./7f3d7ca9.js";import"./be12d7a2.js";import"./72e6e777.js";import"./c0a2f832.js";import"./cae0f1de.js";var R=e`
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

  [data-tag-name='bbva-transition-container'] {
    --bbva-transition-container-padding: 0;
    --bbva-transition-container-text-align: left;
    --bbva-transition-container--custom--primary-ambient--content-bg-color: ${v("colorPrimarySurfaceAmbientDefault",m)};
  }
`,P=e`
  :host {
    --_skeleton-default-bg-color: var(
      --bbva-skeleton-default--_ambient--bg-color,
      var(
        --bbva-skeleton-default--custom--primary-ambient--bg-color,
        var(--color-primary-surface-ambient-preloading, #ffffff)
      )
    );
    --_skeleton-default-animated-bg-color: var(
      --bbva-skeleton-default--_ambient--animated-bg-color,
      var(
        --bbva-skeleton-default--custom--primary-ambient--animated-bg-color,
        var(--color-primary-surface-ambient-default, #f4f4f4)
      )
    );
    --_skeleton-default-bg-color-alt: var(
      --bbva-skeleton-default--_ambient--bg-color-alt,
      var(
        --bbva-skeleton-default--custom--primary-ambient--bg-color-alt,
        var(--color-primary-surface-alternative-preloading, #e9e9e9)
      )
    );
    --_skeleton-default-animated-bg-color-alt: var(
      --bbva-skeleton-default--_ambient--animated-bg-color-alt,
      var(
        --bbva-skeleton-default--custom--primary-ambient--animated-bg-color-alt,
        var(--color-primary-surface-alternative-default, #ffffff)
      )
    );
  }

  :host {
    display: block;
    box-sizing: border-box;
    height: 100%;
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

  .container {
    display: flex;
    flex-direction: column;
    height: 100%;
    gap: 1rem;
  }
  .container .body {
    display: flex;
    flex-direction: column;
    flex-grow: 1;
    gap: 1rem;
    padding: 0 1rem 1rem;
  }
`;class G extends(t(g(f(i)))){static get is(){return"user-info-tips-finance-section-card"}static get scopedElements(){const e=[x,T];return G.scopedElementsFromClasses(e)}static get properties(){return{headerImage:{type:String,attribute:"header-image"},footerLink:{type:String,attribute:"footer-link"}}}static get styles(){return[P,y.primaryAlt,_.primary,a("user-info-tips-finance-section-card.css-shared-styles")]}constructor(){super(),this.headerImage="",this.footerLink=""}get _renderBody(){return s` <div class="body">${this.footerLink?this._renderFooterLink:{}}</div> `}get _renderFooterLink(){return s` <bbva-type-link ellipsis>${this.footerLink}</bbva-type-link>`}get _renderHeader(){return s` <div class="header">${this.headerImage?this._renderImage:{}}</div> `}get _renderImage(){return s`
      <bbva-banner-image
        class="img"
        size="L"
        image-src="${this.headerImage}"
        aria-hidden="true"
        ambient="primary-alt"
      >
      </bbva-banner-image>
    `}render(){return s`
      <div class="container" ambient="primary">${this._renderHeader} ${this._renderBody}</div>
    `}}var N=e`
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

  .main-margin {
    margin: 0 1rem;
  }

  .head-info {
    padding-bottom: 0.75rem;
  }

  .fast-tips--item {
    display: flex;
    margin: 1rem 0 0.5rem;
  }
  .fast-tips--item [data-tag-name='bbva-type-icon'] {
    margin-right: 0.5rem;
  }

  .head-info--subtitle {
    margin-top: 1rem;
  }

  .head-info--description {
    margin-top: 0.5rem;
    margin-bottom: 1rem;
  }

  .slider-tips {
    margin-top: 0.75rem;
  }

  .fast-tips {
    margin-top: 1rem;
    margin-bottom: 1rem;
  }

  .fast-tips--description {
    padding-bottom: 0.375rem;
  }

  .category-tips__list {
    list-style: none;
    margin-top: 0;
    padding-left: 0;
  }

  .category-tips__list--title {
    padding-left: 0;
  }
`;const Q={headerMain:{text:"user-info-tips-finance-header-main",variant:"first-level-sequential",leftIconAriaLabel:"user-info-tips-finance-header-main-back"},headInfo:{imageSrc:"main_image.png",size:"3XL",subtitleText:"user-info-tips-finance-headinfo-subtitle",fontWeight:"700",descriptionText:"user-info-tips-finance-headinfo-description"},slider:{subtitleText:"user-info-tips-finance-slider-subtitle",linkAccessibilityText:"user-info-tips-finance-slider-link",idSlider:"swipeFullScreen",type:"swipe"},fastCategories:{headingLevel:"3",subtitleText:"user-info-tips-finance-fastcategories-subtitle",linkAccessibilityText:"user-info-tips-finance-fastcategories-link"},categoriesTips:{headingLevel:"3",subtitleText:"user-info-tips-finance-categoriestips-link",linkAccessibilityText:"user-info-tips-finance-categoriestips-subtitle",variant:"primary"}};n(),o(),r();const W=[{title:"user-info-tips-finance-account",icon:l()},{title:"user-info-tips-finance-goals",icon:d()},{title:"user-info-tips-finance-saving",icon:c()},{title:"user-info-tips-finance-secure",icon:b()}],J=[{tagName:"bbva-type-text",class:$}],X={link:"user-info-tips-finance-error-retry",message:"user-info-tips-finance-error-message"};function K(e,t,i=!0,a=!0,s=!0){e.dispatchEvent(new CustomEvent(t,{bubbles:a,composed:s,detail:i}))}class Y extends(k(f(t(i)))){static get is(){return"user-info-tips-finance-dashboard"}static get scopedElements(){const e=[x,D,T,$,A,C,V,w,...Y.configurationScopedElements()];return Y.scopedElementsFromClasses(e)}static get properties(){return{aemHost:{type:String,attribute:"aem-host"},configDashboard:{type:Object,attribute:"config-dashboard"},showError:{type:Boolean,reflect:!0},imageBanner:{type:String,attribute:"image-banner"},listFastTips:{type:Array,attribute:"list-fast-tips"},sliderItems:{type:Array},_errorLiterals:{type:Object},_scopedComponents:{type:Array}}}constructor(){super(),this.showError=!1,this._errorLiterals=X,this.aemHost="",this.configDashboard={},this.imageBanner="",this.listFastTips=[],this.sliderItems=[],this._scopedComponents=[G].map((e=>({tagName:e.is,class:e})))}static get styles(){return[N,I.primary,_.primary,S.primary,M.primary,L.primary,y.primary,L.primary,U.primary,a("user-info-tips-finance-dashboard-shared-styles")]}firstUpdated(){var e,t,i,a,s,n;this.config={header:{text:null===(e=this.configDashboard)||void 0===e||null===(t=e.headerMain)||void 0===t?void 0:t.text,variant:null===(i=this.configDashboard)||void 0===i||null===(a=i.headerMain)||void 0===a?void 0:a.variant,buttons:[{id:"btn-menu",icon:h(),accessibilityText:this.t("user-info-tips-finance-menu")}],leftIconAriaLabel:this.t(null===(s=this.configDashboard)||void 0===s||null===(n=s.headerMain)||void 0===n?void 0:n.leftIconAriaLabel),showLeftIcon:!0,"@header-main-back-icon-click":this.navigateBack.bind(this)}}}navigateBack(){K(this,"user-info-tips-finance-out-flow-step-back")}static _errorMessage(){return s`
      <bbva-notification-message
        variant="error"
        message="${null==X?void 0:X.message}"
        link-title="${null==X?void 0:X.link}"
      >
      </bbva-notification-message>
    `}_navigationTabPage(e,t){K(this,"user-info-tips-finance-category-select",e.title),K(this,"user-info-tips-finance-tip-tabs-navigate",{item:e,index:t})}_renderCardItem({elements:e}){var t,i;return s`
      <user-info-tips-finance-section-card
        header-image="${this.aemHost+((null==e||null===(t=e.illustration)||void 0===t?void 0:t.value)??"")}"
        footer-link="${(null==e||null===(i=e.linkText)||void 0===i?void 0:i.value)||""}"
        class="card"
        @click="${()=>K(this,"user-info-tips-finance-section-card-tip-click",e)}"
      >
      </user-info-tips-finance-section-card>
    `}get _renderHeadInfo(){var e,t,i,a,n,o,r,l,d,c;return s`
      <bbva-banner-image
        image-src="${this.imageBanner}"
        size="${null===(e=this.configDashboard)||void 0===e||null===(t=e.headInfo)||void 0===t?void 0:t.size}"
      ></bbva-banner-image>

      <div class="head-info main-margin">
        <bbva-type-text
          class="head-info--subtitle"
          inherit
          tag="h2"
          text="${null===(i=this.configDashboard)||void 0===i||null===(a=i.headInfo)||void 0===a?void 0:a.subtitleText}"
          size="${null===(n=this.configDashboard)||void 0===n||null===(o=n.headInfo)||void 0===o?void 0:o.size}"
          font-weight="${null===(r=this.configDashboard)||void 0===r||null===(l=r.headInfo)||void 0===l?void 0:l.fontWeight}"
        ></bbva-type-text>
        <bbva-type-text
          class="head-info--description"
          inherit
          tag="p"
          text="${null===(d=this.configDashboard)||void 0===d||null===(c=d.headInfo)||void 0===c?void 0:c.descriptionText}"
          size="S"
        ></bbva-type-text>
      </div>
    `}get _renderCategoriesTips(){var e,t,i,a,n,o,r;return s`
      <div class="categories-tips main-margin">
        <bbva-header-category
          heading-level="${null===(e=this.configDashboard)||void 0===e||null===(t=e.categoriesTips)||void 0===t?void 0:t.headingLevel}"
          .text="${null===(i=this.configDashboard)||void 0===i||null===(a=i.categoriesTips)||void 0===a?void 0:a.subtitleText}"
          link-accessibility-text="${null===(n=this.configDashboard)||void 0===n||null===(o=n.categoriesTips)||void 0===o?void 0:o.linkAccessibilityText}"
        >
        </bbva-header-category>
        ${this.showError?Y._errorMessage():s` <ul class="category-tips__list">
              ${null===(r=this.listCategories)||void 0===r?void 0:r.map(((e,t)=>{var i,a,n;return s`
                  <li>
                    <bbva-type-link
                      id="${null==e?void 0:e.title}"
                      class="category-tips__list--title"
                      variant="${null===(i=this.configDashboard)||void 0===i||null===(a=i.categoriesTips)||void 0===a?void 0:a.variant}"
                      @click="${()=>this._navigationTabPage(e,t)}"
                      icon=${null==e?void 0:e.icon}
                    >
                      <bbva-type-text
                        variant="spotlight"
                        text=${null==e?void 0:e.title}
                        unset
                      ></bbva-type-text>
                    </bbva-type-link>
                    ${t!==((null===(n=this.listCategories)||void 0===n?void 0:n.length)??0)-1?s`<bbva-divider-default></bbva-divider-default>`:""}
                  </li>
                `}))}
            </ul>`}
      </div>
    `}get _renderSlider(){var e,t,i,a,n;const o=null===(e=this.sliderItems)||void 0===e?void 0:e.map(((e,t)=>({index:t,content:this._renderCardItem(e),closeItem:!1})));return s`
      <div class="slider-tips main-margin">
        <bbva-header-category
          heading-level="3"
          .text="${null===(t=this.configDashboard)||void 0===t||null===(i=t.slider)||void 0===i?void 0:i.subtitleText}"
          link-accessibility-text="${null===(a=this.configDashboard)||void 0===a||null===(n=a.slider)||void 0===n?void 0:n.linkAccessibilityText}"
        >
        </bbva-header-category>
        ${this.showError?Y._errorMessage():s`
              <bbva-carousel-default
                .scopedComponents="${this._scopedComponents}"
                .items="${o}"
                type="swipe"
                hide-gradient
                ?loop="true"
              >
              </bbva-carousel-default>
            `}
      </div>
    `}get _renderFastTips(){var e,t,i,a,n,o;return s`
      <div class="fast-tips main-margin">
        <bbva-header-category
          heading-level="${null===(e=this.configDashboard)||void 0===e||null===(t=e.fastCategories)||void 0===t?void 0:t.headingLevel}"
          .text="${null===(i=this.configDashboard)||void 0===i||null===(a=i.fastCategories)||void 0===a?void 0:a.subtitleText}"
          link-accessibility-text="${null===(n=this.configDashboard)||void 0===n||null===(o=n.fastCategories)||void 0===o?void 0:o.linkAccessibilityText}"
        >
        </bbva-header-category>
        ${this.showError?Y._errorMessage():this.listFastTips.map(((e,t)=>{var i;return s`
                <div class="fast-tips--item">
                  <bbva-type-icon icon=${null==e?void 0:e.icon} size="24"></bbva-type-icon>
                  <bbva-type-text
                    unset
                    variant="secondary"
                    text=${null==e?void 0:e.title}
                    size="L"
                    font-weight="500"
                    tag="h4"
                  >
                  </bbva-type-text>
                </div>
                <bbva-type-text
                  inherit
                  class="fast-tips--description"
                  text="${null==e?void 0:e.description}"
                ></bbva-type-text>
                ${t!==((null===(i=this.listFastTips)||void 0===i?void 0:i.length)??0)-1?s`<bbva-divider-default></bbva-divider-default>`:""}
              `}))}
      </div>
    `}render(){return s`
      ${super.render()}
      <div ambient="primary">
        ${this._renderHeadInfo} ${this._renderSlider} ${this._renderFastTips}
        ${this._renderCategoriesTips}
      </div>
    `}}var Z=e`
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

  .container {
    margin: 1rem 1rem;
    background-color: ${v("colorPrimaryAltSurfaceAmbientDefault",m)};
    display: flex;
    cursor: pointer;
  }

  .container__banner {
    flex: none;
    position: relative;
    overflow: hidden;
    width: 6.5rem;
  }
  .container__banner [data-tag-name='bbva-banner-image'] {
    object-position: center center;
    height: 100%;
  }

  .container__description {
    padding: 1rem;
    box-sizing: border-box;
    overflow: hidden;
  }
`;class ee extends(k(f(t(i)))){static get is(){return"user-info-tips-finance-tabs"}static get scopedElements(){const e=[H,D,x,$,T,z,...ee.configurationScopedElements()];return ee.scopedElementsFromClasses(e)}static get properties(){return{accountTips:{type:Array},goalsTips:{type:Array},itemsTabs:{type:Array,attribute:"items-tabs"},savingTips:{type:Array},securityTips:{type:Array},_tabSelected:{type:Number,attribute:"tab-selected"}}}constructor(){super(),this.accountTips=[],this.goalsTips=[],this.itemsTabs=[],this.savingTips=[],this.securityTips=[],this._tabSelected=0,this.ambient="primary"}static get styles(){return[Z,a("user-info-tips-finance-tabs-shared-styles")]}firstUpdated(){this.config={fixedHeader:!0,header:{text:this.t("user-info-tips-finance-categories-header-title"),variant:"first-level-sequential",buttons:[{id:"btn-menu",icon:h(),accessibilityText:this.t("user-info-tips-finance-menu")}],"@header-main-back-icon-click":this.navigateBack.bind(this)}}}navigateBack(){K(this,"user-info-tips-finance-tabs-navigate-back")}get tabCategoriesTipsTest(){return s`
      <bbva-tab-default
        ambient="primary"
        id="group-tabs-categories"
        .options="${this.itemsTabs}"
        selected="${this._tabSelected}"
        accessibility-text="${this.t("user-info-tips-finance-categories-accessibility")}"
        @tab-default-tab-change="${this._handleTabChange}"
      >
        <div>
          <div class="panel" role="tabpanel" id="content-0" aria-labelledby="tab-0">
            ${this._listClip(this.accountTips)}
          </div>

          <div class="panel" role="tabpanel" id="content-1" aria-labelledby="tab-1">
            ${this._listClip(this.goalsTips)}
          </div>

          <div class="panel" role="tabpanel" id="content-2" aria-labelledby="tab-2">
            ${this._listClip(this.savingTips)}
          </div>

          <div class="panel" role="tabpanel" id="content-3" aria-labelledby="tab-3">
            ${this._listClip(this.securityTips)}
          </div>
        </div>
      </bbva-tab-default>
    `}_handleTabChange(e){var t,i;K(this,"user-info-tips-finance-tab-selected",null==e||null===(t=e.detail)||void 0===t||null===(i=t.info)||void 0===i?void 0:i.title)}_handleTipClick(e){K(this,"user-info-tips-finance-tabs-select-tip",e)}_listClip(e){return s`${null==e?void 0:e.map((e=>s`
        <div
          class="container"
          @click="${()=>this._handleTipClick(e)}"
          @keydown="${t=>"Enter"===t.key&&this._handleTipClick(e)}"
          tabindex="0"
          role="button"
          ambient="primary-alt"
        >
          <div class="container__banner">
            <bbva-banner-image
              data-tag-name="bbva-banner-image"
              image-src="${null==e?void 0:e.imageUrl}"
              size="L"
            ></bbva-banner-image>
          </div>

          <div class="container__description">
            <bbva-type-text unset variant="spotlight" text="${null==e?void 0:e.title}"> </bbva-type-text>
            <bbva-type-text
              inherit
              size="S"
              class="bbva-type-text-compact"
              text="${null==e?void 0:e.shortDescription}"
            ></bbva-type-text>
          </div>
        </div>
      `))}`}render(){return s` ${super.render()}${this.tabCategoriesTipsTest} `}}var te=e`
  :host {
    display: block;
    box-sizing: border-box;
    height: 100%;
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

  .main-margin {
    margin: 0 1rem;
  }

  .modal__video-overlay {
    position: fixed;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    display: flex;
    justify-content: center;
    align-items: center;
    z-index: 1000;
  }

  .overlay-bg {
    position: fixed;
    width: 100%;
    height: 100%;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
    z-index: -1;
    cursor: pointer;
    background-color: ${v("colorPrimaryAltSurfaceAmbientOverlay",m)};
    opacity: 0.85;
  }

  .modal__video-overlay--close-button {
    position: absolute;
    top: 1rem;
    right: 1rem;
    background: none;
    border: none;
    cursor: pointer;
    display: flex;
  }

  .modal--subtitle {
    margin-top: 1rem;
  }

  .modal--description {
    margin: 0.5rem 0 1rem;
  }

  [data-tag-name='bbva-list-bullet'] {
    padding: 0;
  }
`;class ie extends(k(f(t(i)))){static get is(){return"modal-tip-detail"}static get scopedElements(){const e=[x,O,$,z,A,B,E,...ie.configurationScopedElements()];return ie.scopedElementsFromClasses(e)}static get properties(){return{imageBannerModal:{type:String,attribute:"image-banner-modal"},modalAemData:{type:Object},videoVisible:{type:Boolean},_hasTitle:{type:Boolean,attribute:"header-title"},_hideModalTipDetail:{type:Boolean}}}constructor(){super(),this.imageBannerModal="",this.modalAemData={},this._hideModalTipDetail=!1,this.ambient="primary",this._hasTitle=!1,this.videoVisible=!1}static get styles(){return[te,S.primary,F.secondary,a("modal-tip-detail-shared-styles")]}updated(e){var t;(super.updated(e),Object.keys(this.modalAemData).length>0&&!this._hasTitle)&&(this._hasTitle=!0,this.config={header:{text:null===(t=this.modalAemData)||void 0===t?void 0:t.linkText,variant:"first-level-sequential",buttons:[{id:"btn-menu",icon:h(),accessibilityText:this.t("user-info-tips-finance-menu")}],"@header-main-back-icon-click":this.navigateBack.bind(this)}})}navigateBack(){var e;this.dispatchEvent(new CustomEvent("user-info-tips-finance-modal-navigate-back",{bubble:!0,composed:!0,detail:{isTipVideo:null===(e=this.modalAemData)||void 0===e?void 0:e.isVideo}})),this._hasTitle=!1}_handleCloseClick(){this.videoVisible=!1}_handleIconClick(){this.videoVisible=!0,K(this,"user-info-tips-finance-open-video")}get _renderModalText(){var e,t,i,a,n,o;return s`${this._hideModalTipDetail?s``:s`
      ${super.render()}
          <bbva-banner-image image-src="${null===(e=this.modalAemData)||void 0===e?void 0:e.imageUrl}" size="L">
          </bbva-banner-image>
          <div class="main-margin" ambient="primary">
            <bbva-type-text
              inherit
              class="modal--subtitle"
              text="${null===(t=this.modalAemData)||void 0===t?void 0:t.title}"
              font-weight="500"
              tag="h2"
              size="L"
            >
            </bbva-type-text>
            <bbva-type-text
              inherit
              class="modal--description"
              size="S"
              text="${null===(i=this.modalAemData)||void 0===i?void 0:i.mainDescription}"
            >
            </bbva-type-text>
            ${null===(a=this.modalAemData)||void 0===a||null===(n=a.bullets)||void 0===n?void 0:n.map((e=>s` <bbva-list-bullet text="${null==e?void 0:e.text}"></bbva-list-bullet> `))}
            <bbva-type-text text="${null===(o=this.modalAemData)||void 0===o?void 0:o.addicionalDescription}"> </bbva-type-text>
          </div>
        </div>`}`}get _tplButton(){return s` <bbva-button-default
      ambient="secondary"
      aria-label="Close"
      class="modal__video-overlay--close-button"
      @click="${()=>this._handleCloseClick()}"
      variant="icon no-background alternative"
      .icon="${u()}"
    >
    </bbva-button-default>`}get _renderModalVideo(){var e,t,i,a;return s`${this._hideModalTipDetail?s``:s`
      ${super.render()}
          <bbva-banner-image
            image-src="${null===(e=this.modalAemData)||void 0===e?void 0:e.imageUrl}"
            size="L"
            @click=${this._handleIconClick}
          >
          </bbva-banner-image>
          ${this.videoVisible?s` <div class="modal__video-overlay">
                  <div class="overlay-bg"></div>
                  ${this._tplButton}
                  <iframe
                    width="320"
                    height="240"
                    src="${null===(t=this.modalAemData)||void 0===t?void 0:t.videoUrl}"
                    title="Video Modal"
                    allowfullscreen
                  >
                  </iframe>
                </div>`:""}

          <div class="main-margin" ambient="primary">
            <bbva-type-text
              inherit
              class="modal--subtitle"
              text="${null===(i=this.modalAemData)||void 0===i?void 0:i.linkText}"
              font-weight="500"
              font-size="L"
              tag="h2"
            >
            </bbva-type-text>
            <bbva-type-text
              inherit
              class="modal--description"
              size="S"
              text="${null===(a=this.modalAemData)||void 0===a?void 0:a.mainDescription}"
            >
            </bbva-type-text>
          </div>
        </div>
      </bbva-transition-container>
    `}`}render(){return this.modalAemData&&"object"==typeof this.modalAemData&&Object.keys(this.modalAemData).length>0?this.modalAemData.isVideo?s`${this._renderModalVideo}`:s`${this._renderModalText}`:s``}}class ae extends(k(f(t(i)))){static get is(){return"user-info-tips-finance"}static get scopedElements(){const e=[Y,ee,ie,B,j,...ae.configurationScopedElements()];return ae.scopedElementsFromClasses(e)}static get properties(){return{aemHost:{type:String,attribute:"aem-host"},aemPath:{type:String,attribute:"aem-path"},imageBannerSrc:{type:String,attribute:"image-banner-src"},sliderItems:{type:Array},_completedRequest:{type:Boolean},_configModalTipDetail:{type:Object},_errorCounter:{type:Number},_errorMessage:{type:Boolean},_responseAem:{type:Object},_showDashboard:{type:Boolean},_showModalTipDetail:{type:Boolean},_showTabs:{type:Boolean},_tabSelected:{type:Number},listCategoriesTabs:{type:Array},contentFragmentIds:{type:Object,attribute:"content-fragment-ids"},categorysIds:{type:Object,attribute:"categories-ids"}}}static get styles(){return[R,a("user-info-tips-finance-shared-styles")]}constructor(){super(),this.aemHost="",this.aemPath="",this.imageBannerSrc="",this.sliderItems=[],this._completedRequest=!1,this._configModalTipDetail={},this._errorCounter=0,this._errorMessage=!1,this._responseAem={},this._showDashboard=!1,this._showModalTipDetail=!1,this._showTabs=!1,this.native=!1,this.listCategoriesTabs=[],this.contentFragmentIds={},this.categorysIds={}}async firstUpdated(){await this.getAemData()}async getAemData(){this._dataManager=this.shadowRoot.querySelector('[data-tag-name="bbva-global-aem-content-fragment-dm"]'),this._dataManager&&this.aemHost&&this.aemPath&&(this._dataManager.crossDomain=!0,await this._dataManager.updateComplete,this._dataManager.getAemData())}get _aemDM(){return s`
      <bbva-global-aem-content-fragment-dm
        data-tag-name="bbva-global-aem-content-fragment-dm"
        .host=${this.aemHost}
        .path=${this.aemPath}
        .headers=${this._headers}
        ?native=${this.native}
        @aem-content-fragment-dm-fetch=${this._successGetAemContent}
        @aem-content-fragment-dm-fetch-error=${this._errorGetAemContent}
      >
      </bbva-global-aem-content-fragment-dm>
    `}static _bulletsFormatter(e={}){var t,i;if((null===(t=Object.keys(e))||void 0===t?void 0:t.length)>0&&null!=e&&e.value&&""!==(null==e||null===(i=e.value)||void 0===i?void 0:i.trim()))try{return JSON.parse(null==e?void 0:e.value)}catch(e){return[]}return[]}_errorGetAemContent(){this._completedRequest=!0,this._showDashboard=!0,this._errorMessage=!0}static _formatCategoriesTips(e,t,i=""){return e.filter((e=>{var i,a;return(null==e||null===(i=e.elements)||void 0===i||null===(a=i.category)||void 0===a?void 0:a.value)===t})).map((e=>{var t,a,s,n,o,r,l,d,c,b,h,u,p,v,m,g,f;return{id:null==e||null===(t=e.elements)||void 0===t||null===(a=t.id)||void 0===a?void 0:a.value,title:null==e||null===(s=e.elements)||void 0===s||null===(n=s.title)||void 0===n?void 0:n.value,imageUrl:i+((null==e||null===(o=e.elements)||void 0===o||null===(r=o.imageUrl)||void 0===r?void 0:r.value)??""),imageIcon:i+((null==e||null===(l=e.elements)||void 0===l||null===(d=l.imageUrlIcon)||void 0===d?void 0:d.value)??""),category:null==e||null===(c=e.elements)||void 0===c||null===(b=c.category)||void 0===b?void 0:b.value,shortDescription:null==e||null===(h=e.elements)||void 0===h||null===(u=h.shortDescription)||void 0===u?void 0:u.value,mainDescription:null==e||null===(p=e.elements)||void 0===p||null===(v=p.mainDescription)||void 0===v?void 0:v.value,bullets:ae._bulletsFormatter(null==e||null===(m=e.elements)||void 0===m?void 0:m.bullestsDescription),addicionalDescription:(null==e||null===(g=e.elements)||void 0===g||null===(f=g.addicionalDescription)||void 0===f?void 0:f.value)||""}}))}static _getIcon(e){if(e){return p[e]()}return""}get _headers(){return this.headers||{Accept:"application/json, text/plain, */*; q=0.01","Content-Type":"text/plain"}}_openSideMenu({detail:e}){1===e.index&&K(this,"user-info-tips-finance-side-menu-open")}_navigationCategories(e){var t;K(this,"user-info-tips-finance-page-tabs-open"),this._showDashboard=!1,this._showTabs=!0,this._tabSelected=null==e||null===(t=e.detail)||void 0===t?void 0:t.index}_navigationDashboard(){this._showDashboard=!0,this._showTabs=!1}get _renderInfo(){return this._completedRequest?s`
        ${this._renderUserInfoDashboard} ${this._renderUserInfoTabs} ${this._renderModalTipDetail}
      `:s``}get _renderModalTipDetail(){return s`
      <bbva-transition-container ?visible="${this._showModalTipDetail}">
        <div slot="slot-content">
          <modal-tip-detail
            .modalAemData="${this._configModalTipDetail}"
            @user-info-tips-finance-modal-navigate-back="${this._navigateBack}"
            @header-main-icon-click="${this._openSideMenu}"
          >
          </modal-tip-detail>
        </div>
      </bbva-transition-container>
    `}get _renderUserInfoDashboard(){var e;return K(this,"user-info-tips-finance-principal-page-open"),s`
      <bbva-transition-container ?visible="${this._showDashboard}">
        <div slot="slot-content">
          <user-info-tips-finance-dashboard
            aem-host="${this.aemHost}"
            image-banner="${this.imageBannerSrc}"
            .showError="${this._errorMessage}"
            .sliderItems="${this.sliderItems}"
            .listFastTips="${null===(e=this._responseAem)||void 0===e?void 0:e.fastTips}"
            .listCategories="${W}"
            .configDashboard="${Q}"
            .scopedItems="${J}"
            @user-info-tips-finance-tip-tabs-navigate="${this._navigationCategories}"
            ?error=${!this._responseAem}
            .errorLiterals="${X}"
            @user-info-tips-finance-section-card-tip-click="${this._selectTipDetail}"
            @notification-message-link-click="${this.retryRequest}"
            @header-main-icon-click="${this._openSideMenu}"
          ></user-info-tips-finance-dashboard>
        </div>
      </bbva-transition-container>
    `}get _renderUserInfoTabs(){var e,t,i,a;return s`
      <bbva-transition-container ?visible="${this._showTabs}">
        <div slot="slot-content">
          <user-info-tips-finance-tabs
            .itemsTabs="${this.listCategoriesTabs}"
            .accountTips="${null===(e=this._responseAem)||void 0===e?void 0:e.categoriesAccount}"
            .goalsTips="${null===(t=this._responseAem)||void 0===t?void 0:t.categoriesGoals}"
            .savingTips="${null===(i=this._responseAem)||void 0===i?void 0:i.categoriesSaving}"
            .securityTips="${null===(a=this._responseAem)||void 0===a?void 0:a.categoriesSecurity}"
            tab-selected="${this._tabSelected}"
            @user-info-tips-finance-tabs-navigate-back="${this._navigationDashboard}"
            @user-info-tips-finance-tabs-select-tip="${this._tipTabSelected}"
            @header-main-icon-click="${this._openSideMenu}"
          ></user-info-tips-finance-tabs>
        </div>
      </bbva-transition-container>
    `}_selectTipDetail({detail:e}){var t,i,a,s,n,o,r;const l={linkText:null==e||null===(t=e.linkText)||void 0===t?void 0:t.value,title:null==e||null===(i=e.linkText)||void 0===i?void 0:i.value,isVideo:null==e||null===(a=e.isVideo)||void 0===a?void 0:a.value,imageUrl:this.aemHost+((null==e||null===(s=e.imageURL)||void 0===s?void 0:s.value)??""),videoUrl:(d=null==e||null===(n=e.videoURL)||void 0===n?void 0:n.value,`https://www.youtube.com/embed/${d.split("v=")[1]}`),subtitle:null==e||null===(o=e.subtitle)||void 0===o?void 0:o.value,mainDescription:null==e||null===(r=e.mainDescription)||void 0===r?void 0:r.value};var d;this._configModalTipDetail=l,K(this,"user-info-tips-finance-modal-video-open"),this._showDashboard=!1,this._showTabs=!1,this._showModalTipDetail=!0}async _successGetAemContent(e){var t,i;this._completedRequest=!0,this._showDashboard=!0,this._errorMessage=!1;const a=(null==e||null===(t=e.detail)||void 0===t?void 0:t.items)||(null==e?void 0:e.items);if((null===(i=Object.entries(a))||void 0===i?void 0:i.length)>0){const e=ae._findContentFragment(a,this.contentFragmentIds.youngsterfasttips),t=ae._findContentFragment(a,this.contentFragmentIds.youngstercategories);this._responseAem.fastTips=await ae._formatFastTips(null==e?void 0:e.items),this._responseAem.categoriesGoals=ae._formatCategoriesTips(null==t?void 0:t.items,this.categorysIds.goals,this.aemHost),this._responseAem.categoriesSaving=ae._formatCategoriesTips(null==t?void 0:t.items,this.categorysIds.saving,this.aemHost),this._responseAem.categoriesSecurity=ae._formatCategoriesTips(null==t?void 0:t.items,this.categorysIds.security,this.aemHost),this._responseAem.categoriesAccount=ae._formatCategoriesTips(null==t?void 0:t.items,this.categorysIds.account,this.aemHost);const i=ae._findContentFragment(a,this.contentFragmentIds.youngstertipsslider);this.sliderItems=i.items}}static _findContentFragment(e,t){var i;return null===(i=Object.values(e))||void 0===i?void 0:i.find((e=>(null==e?void 0:e.id)===t))}static async _formatFastTips(e){return Promise.all(null==e?void 0:e.map((async e=>{var t,i,a,s,n,o,r,l;return{id:null==e||null===(t=e.elements)||void 0===t||null===(i=t.id)||void 0===i?void 0:i.value,icon:ae._getIcon(null==e||null===(a=e.elements)||void 0===a||null===(s=a.icon)||void 0===s?void 0:s.value),title:null==e||null===(n=e.elements)||void 0===n||null===(o=n.title)||void 0===o?void 0:o.value,description:null==e||null===(r=e.elements)||void 0===r||null===(l=r.mainDescription)||void 0===l?void 0:l.value}})))}_tipTabSelected(e){const t=e.detail,i={linkText:null==t?void 0:t.title,title:null==t?void 0:t.title,isVideo:!1,imageUrl:null==t?void 0:t.imageUrl,urlVideo:null==t?void 0:t.urlVideo,subtitle:null==t?void 0:t.title,mainDescription:null==t?void 0:t.mainDescription,bullets:null==t?void 0:t.bullets,addicionalDescription:null==t?void 0:t.addicionalDescription};this._configModalTipDetail=i,K(this,"user-info-tips-finance-modal-text-open",i.title),this._showTabs=!1,this._showModalTipDetail=!0}_navigateBack({detail:e}){this._configModalTipDetail={},this._showModalTipDetail=!1,e.isTipVideo?(this._showDashboard=!0,this._showTabs=!1):(this._showDashboard=!1,this._showTabs=!0)}retryRequest(){this._errorCounter<3?(this._errorCounter+=1,this.getAemData()):K(this,"user-info-tips-finance-out-flow-step-back")}render(){return s` ${super.render()} ${this._aemDM} ${this._renderInfo} `}}customElements.define(ae.is,ae);class se extends(q(t(i))){static get is(){return"bbva-analyticmanager-financial-education"}static get properties(){return{data:Object,_counterAnalytics:{type:Object}}}constructor(){super(),this.data={},this._counterAnalytics={started:0,categorySelect:0,modalVideo:0,openVideo:0,pageTabs:0,tabSelected:0,modalText:0}}footprintStarted(){0===this._counterAnalytics.started&&this._dispatch("financial-education-analytics-footprint-started"),this._counterAnalytics.started+=1}categorySelectLink(e){if(0===this._counterAnalytics.categorySelect){const t={linkName:`tema de interes ${this.t(e).toLowerCase()}`};this._dispatch("financial-education-analytics-internal-link-dashboard",t)}this._counterAnalytics.categorySelect+=1}footprintApartado(){0===this._counterAnalytics.modalVideo&&this._dispatch("financial-education-analytics-footprint-modal-video"),this._counterAnalytics.modalVideo+=1}openVideoExternallink(){if(0===this._counterAnalytics.openVideo){const e={linkUrl:"ver video"};this._dispatch("financial-education-analytics-external-link-modal-video",e)}this._counterAnalytics.openVideo+=1}footprintPageTabs(){0===this._counterAnalytics.pageTabs&&this._dispatch("financial-education-analytics-footprint-tabs"),this._counterAnalytics.pageTabs+=1}tabSelectedInteractionLink(e){if(0===this._counterAnalytics.tabSelected&&"string"==typeof e&&""!==e.trim()){const t={interactionLevel:`tab ${this.t(e).toLowerCase()}`};this._dispatch("financial-education-analytics-interaction-link-tab-selected",t),this._counterAnalytics.tabSelected+=1}}footprintModalText(e){if(0===this._counterAnalytics.modalText){const t={customFields:`articulo:${this.t(e).toLowerCase()}`};this._dispatch("financial-education-analytics-footprint-modal-text",t)}this._counterAnalytics.modalText+=1}_dispatch(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}}customElements.define(se.is,se);
