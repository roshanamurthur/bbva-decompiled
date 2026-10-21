import{z as e,a8 as t,ac as a,ad as i,ab as s,ap as n,an as r,L as o,cj as l,bx as d,ak as h,h as m,av as b,aX as p}from"./952f98a9.js";import{R as c,S as v,v as g,T as u,D as f,ae as y,G as x,x as _,af as k,M as $,L as q,ag as w,z as A,E,a3 as T,Q as S,j as M,I as C,H as D,a4 as I,e as R}from"./216055dc.js";import{aO as F,aI as L,aH as z}from"./7f3d7ca9.js";import{b as P,B}from"./dd13577a.js";var N=e`
  :host {
    display: block;
    box-sizing: border-box;
    color: var(--_help-faqs-aem-banner-video-text-color);
    font-size: var(--typographyTypeSmall, ${t(a.typeSmall)});
    line-height: var(--lineHeightTypeSmall, ${t(i.typeSmall)});
    font-weight: var(
      --fontFacePrimaryBookItalicFontWeight,
      ${t(s.bookItalic.fontWeight)}
    );
    font-style: var(
      --fontFacePrimaryBookItalicFontStyle,
      ${t(s.bookItalic.fontStyle)}
    );
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

  .sr-only {
    border: 0;
    clip: rect(0 0 0 0);
    height: 1px;
    margin: -1px;
    overflow: hidden;
    padding: 0;
    position: absolute;
    width: 1px;
  }

  .video-button {
    width: 100%;
    margin: 0;
    padding: 0;
    font: inherit;
    background-color: transparent;
    border: none;
    color: inherit;
    text-align: center;
    cursor: pointer;
  }

  .container {
    position: relative;
    top: 0;
    left: 0;
    width: 100%;
    height: 10rem;
  }

  .text {
    height: 9.5rem;
  }

  [data-tag-name='bbva-type-icon']:active {
    fill: var(--_help-faqs-aem-banner-video-pressed-icon-color);
  }

  [data-tag-name='bbva-banner-image'] {
    --_bbva-banner-image-padding: 0;
  }

  .img-bg {
    position: absolute;
    width: 100%;
    height: 100%;
    left: 0;
  }

  .content {
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    position: absolute;
    width: 100%;
    height: 100%;
    padding: 1rem;
  }

  .quote {
    margin: 0.5rem 0 0 0;
  }

  :host([loading]) {
    position: relative;
    overflow: hidden;
    pointer-events: none;
    background-repeat: no-repeat;
    opacity: 1;
    height: 8rem;
    width: 100%;
    background-image: linear-gradient(
        var(--_help-faqs-aem-banner-video-skeleton-quote-color) 100%,
        transparent 0
      ),
      linear-gradient(
        -60deg,
        transparent 50%,
        var(--_help-faqs-aem-banner-video-skeleton-quote-color) 50%
      );
    background-color: var(--_help-faqs-aem-banner-video-skeleton-quote-bg);
    background-size: 32px 32px, calc((62.5% * 2) + (16px / 2)) 16px;
    background-position: 50% 32px, calc(-50% + 8px) 80px;
  }
  :host([loading]) .skeleton {
    contain: strict;
    position: absolute;
    left: 0;
    top: 0;
    right: 0;
    bottom: 0;
    background: var(--_help-faqs-aem-banner-video-skeleton-animated-layer-bg);
    opacity: 0.5;
    transform: translateX(200%) scaleX(1);
    transform-origin: right bottom;
    animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  }

  @keyframes skeletonAnimation {
    from {
      opacity: 0.5;
    }
    50% {
      opacity: 0.6;
    }
    60% {
      opacity: 0.6;
    }
    70% {
      opacity: 0.3;
    }
    90% {
      opacity: 0.1;
    }
    100% {
      transform: translateX(0%) scaleX(2);
      opacity: 0;
    }
  }
`,j=e`
  :host {
    --_help-faqs-aem-banner-video-text-color: ${c("colorPrimaryText01Inverse",v)};
    --_help-faqs-aem-banner-video-pressed-icon-color: ${c("colorPrimaryAltLinkImagePressed",v)};
    --_help-faqs-aem-banner-video-skeleton-quote-color: var(
      --bbva-banner-video-dark-mode-skeleton-quote-color,
      var(
        --bbva-banner-video-skeleton-quote-color,
        ${c("colorSecondaryAltSurfaceContrastPressed",v)}
      )
    );
    --_help-faqs-aem-banner-video-skeleton-quote-bg: var(
      --bbva-banner-video-dark-mode-skeleton-bg,
      var(--bbva-banner-video-skeleton-bg, transparent)
    );
    --_help-faqs-aem-banner-video-skeleton-animated-layer-bg: var(
      --bbva-banner-video-dark-mode-skeleton-animated-layer-bg,
      var(
        --bbva-banner-video-skeleton-animated-layer-bg,
        ${c("colorPrimaryText01Inverse",v)}
      )
    );
  }
`;class U extends(n(r(g(o)))){static get scopedElements(){const e=[x,_,k];return U.scopedElementsFromClasses(e)}static get is(){return"help-faqs-aem-banner-video"}static get properties(){return{urlImage:{type:String,attribute:"url-image"},imgAltText:{type:String,attribute:"img-alt-text"},playIcon:{type:String,attribute:"play-icon"},quote:{type:String},loading:{type:Boolean,reflect:!0}}}constructor(){super(),this.playIcon=l(),this.imgAltText="",this.loading=!1}static get styles(){return[N,j,u.secondary,f.secondary,y.secondary,d("button:focus"),F(".veil","70%"),h("help-faqs-aem-banner-video-shared-styles")]}render(){return m`
      ${this.loading?m`
            <div class="skeleton"></div>
          `:m`
            <button class="video-button" @click="${this._iconClick}">
              <div class="container ${b({text:this.quote})}">
                <bbva-banner-image
                  class="img-bg"
                  size="L"
                  image-src="${this.urlImage}"
                  img-accessibility-text="${this.imgAltText}"
                ></bbva-banner-image>
                <span class="veil"></span>
                <div class="content">
                  <div class="play-icon" ambient="secondary">
                    <bbva-type-icon class="icon" icon="${this.playIcon}" size="32">
                    </bbva-type-icon>
                  </div>
                  ${this.quote?m`
                        <bbva-type-text
                          class="quote"
                          text=${this.quote}
                          size="L"
                          unset
                        ></bbva-type-text>
                      `:m``}
                </div>
              </div>
            </button>
          `}
    `}_iconClick(){this.dispatchEvent(new CustomEvent("help-faqs-aem-banner-video-play-click",{detail:!0,bubbles:!0,composed:!0}))}}var X=e`
  :host {
    --_help-faqs-aem-panel-info-img-padding: 0;
  }

  .title {
    margin-bottom: 0.5rem;
  }

  .not-text {
    margin-bottom: 0;
  }

  .content {
    padding: 1rem 1rem 0 1rem;
  }

  #img {
    padding: var(--_help-faqs-aem-panel-info-img-padding);
  }
`;class H extends(g(r(o))){static get is(){return"help-faqs-aem-panel-info"}static get scopedElements(){const e=[k,x,U];return H.scopedElementsFromClasses(e)}static get properties(){return{media:{type:String},mediaAltText:{type:String,attribute:"image-alt-text"},isVideo:{type:Boolean,attribute:"is-video"},header:{type:String},headerLines:{type:Number,attribute:"header-lines"},loading:{type:Boolean,reflect:!0}}}constructor(){super(),this.mediaAltText="",this.loading=!1,this.header="",this.isVideo=!1}static get styles(){return[X,h("help-faqs-aem-panel-info-shared-styles"),y.primaryAlt,f.primaryAlt]}get _contentMedia(){return this.media?this.isVideo?m`
          <help-faqs-aem-banner-video
            .urlImage="${this.media}"
            .imgAltText="${this.mediaAltText}"
            @help-faqs-aem-banner-video-play-click="${this._videoClick}"
          ></help-faqs-aem-banner-video>
        `:m`
        <bbva-banner-image
          id="img"
          size="L"
          image-src="${this.media}"
          img-accessibility-text="${this.mediaAltText}"
        ></bbva-banner-image>
      `:""}render(){return m`
      <div class="image">${this._contentMedia}</div>
      <div class="content">
        ${this.header&&m`
            <bbva-type-text
              class="title ${b({"not-text":!this.text})}"
              text=${this.t(this.header)}
              ?ellipsis="${!!this.headerLines}"
              .lines="${this.headerLines}"
              font-weight="500"
              size="XL"
              unset
              inherit
            ></bbva-type-text>
          `}
      </div>
    `}_videoClick(){this.dispatchEvent(new CustomEvent("help-faqs-aem-panel-info-video-play-click",{detail:!0,bubbles:!0,composed:!0}))}}var V=e`
  :host {
    --_help-faqs-aem-bg-color: var(
      --bbva-help-faqs-aem-dark-mode-bg,
      var(
        --bbva-help-faqs-aem-bg,
        ${c("colorPrimaryAltSurfaceAmbientDefault",v)}
      )
    );
    display: block;
    box-sizing: border-box;
    background-color: var(--_help-faqs-aem-bg-color);
    height: 100%;
    --bbva-help-modal-padding: var(--bbva-help-faqs-aem-help-modal-padding, 0);
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

  [data-tag-name='bbva-notification-message'],
  .description-box {
    margin: 1.5rem 1rem;
  }

  [data-tag-name='bbva-list-bullet'] {
    padding: 0 0 0.5rem 0;
  }

  [data-tag-name='bbva-list-bullet']:first-of-type {
    padding-top: 1rem;
  }

  [data-tag-name='bbva-type-text'].title {
    font-weight: var(
      --fontFacePrimaryMediumFontWeight,
      ${t(s.medium.fontWeight)}
    );
  }

  [data-tag-name='bbva-type-text'][size='S'] {
    padding: 0.5rem 0;
  }

  [data-tag-name='bbva-help-modal'][visible] {
    transform: translateZ(0.1px);
  }

  [data-tag-name='bbva-header-category'] {
    padding: 0.5rem 1rem;
  }

  [data-tag-name='bbva-form-rating'] {
    padding: 1rem 0;
  }

  .description-box {
    text-align: left;
  }

  .link-list-container {
    padding: 1rem;
  }

  .fit {
    padding: 0 1rem 0 1rem;
  }

  .detail-content {
    padding: 0 1rem 0.5rem 1rem;
  }

  .link-container {
    padding: 0.5rem 0;
  }
`;class O extends($(q(r(p(o))))){static get is(){return"help-faqs-aem"}static get scopedElements(){const e=[S,M,C,D,B,k,I,R,x,z,H];return O.scopedElementsFromClasses(e)}static get properties(){return{_item:{type:Object},showModal:{type:Boolean,attribute:"show-modal"},_showRatingText:{type:Boolean},_showError:{type:Boolean},_counterAemError:{type:Number},contentFragmentPath:{type:String,attribute:"content-fragment-path"},aemData:{type:Object},headerText:{type:String,attribute:"header-text"},faqsMessageText:{type:String,attribute:"faqs-message-text"},showDivider:{type:Boolean,attribute:"show-divider"},hideFooter:{type:Boolean,attribute:"hide-footer"},headingLevel:{type:Number},answerTitleTag:{type:String},disableEllipsis:{type:Boolean,attribute:"disable-ellipsis",reflect:!0},maxRequestAttempts:{type:Number,attribute:"max-request-attempts"},hideIconText:{type:Boolean,attribute:"hide-icon-text"}}}static get styles(){return[V,w,A.primaryAlt,E.primaryAlt,P.primaryAlt,y.primaryAlt,L.primaryAlt,f.primaryAlt,T.primaryAlt,h("help-faqs-aem-shared-styles")]}constructor(){super(),this.showModal=!1,this._showError=!1,this._showRatingText=!1,this.showDivider=!1,this.hideFooter=!1,this.headerText="help-faqs-aem-header-text",this.faqsMessageText="help-faqs-aem-message-faqs",this.headingLevel=1,this.answerTitleTag="h2",this.disableEllipsis=!1,this._counterAemError=0,this.maxRequestAttempts=3,this._item={},this.config={...this.config,loader:!0},this.hideIconText=!1}firstUpdated(){super.firstUpdated&&super.firstUpdated(),this._dataManager=this.shadowRoot.querySelector('[data-tag-name="bbva-global-aem-content-fragment-dm"]'),this._getAEMData()}update(e){super.update(e),e.has("contentFragmentPath")&&this.aemData&&(this._dataManager.resetCache(),this._dataManager.getAemData())}_getAEMData(){this.aemData||this._dataManager.getAemData()}_setAEMData(e){this._showError=!1,this.aemData=e.detail||[],this.clearLoader()}get _list(){var e,t,a;return(null===(e=this.aemData)||void 0===e||null===(t=e.items)||void 0===t||null===(a=t.contentfragmentlist)||void 0===a?void 0:a.items)||[]}get _shouldRetryAemRequest(){return this._counterAemError<=this.maxRequestAttempts}_handleClick(e){this._item=e,this.showModal=!0,this._handleNewEvent("help-faqs-aem-detail-show",e)}_closeModal(e){null==e||e.stopPropagation(),this.showModal=!1,this._showRatingText=!1,this._handleNewEvent("help-faqs-aem-modal-close")}_handleNewEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}_handleRatingClick({detail:e}){this._showRatingText=!0,this._handleNewEvent("help-faqs-aem-feedback-click",e)}_handleRetryError(){this.showLoader("full"),this._getAEMData(),this._handleNewEvent("help-faqs-aem-notification-retry-click")}_handleAemContentDmError(){this._showError=!0,this._counterAemError+=1,this.clearLoader(),this._handleNewEvent("help-faqs-aem-content-service-error")}get _renderContent(){var e,t,a,i,s,n,r,o,l,d,h,b;const p=null===(e=this._item)||void 0===e?void 0:e.elements;return m`
      <bbva-help-modal
        full-height
        header-type="modal-initial"
        header-text=${null!=p&&null!==(t=p.entity)&&void 0!==t&&t.value?p.entity.value:this.headerText}
        ?visible="${this.showModal}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        hide-content-padding-top
        header-close-icon-label="${this.hideIconText?"":this.t("help-faqs-aem-modal-close")}"
        header-close-icon-aria-label="${this.t("help-faqs-aem-modal-close-accessibility-text")}"
        @help-modal-close=${this._closeModal}
      >
        ${p&&this.showModal?m`
              <section slot="slot-content">
                ${this._renderPanelInfo(p)}
                <div class="detail-content">
                  ${null!==(a=p.alternativeAnswer)&&void 0!==a&&a.value?O._getAlternativeAnswer(null===(i=p.alternativeAnswer)||void 0===i?void 0:i.value,null===(s=p.bullets)||void 0===s?void 0:s.value,null===(n=p.itemsposition)||void 0===n?void 0:n.value):p.answer.value&&m`
                        <bbva-type-text unset text=${p.answer.value} size="S"></bbva-type-text>
                        ${null==p||null===(r=p.bullets)||void 0===r||null===(o=r.value)||void 0===o||null===(l=o.map)||void 0===l?void 0:l.call(o,(e=>m`
                            <bbva-list-bullet disabled-tabindex> ${e} </bbva-list-bullet>
                          `))}
                      `}
                  <div class="link-container">
                    <bbva-type-link
                      ?hidden=${!(null!==(d=p.linkUrl)&&void 0!==d&&d.value&&""!==(null===(h=p.linkUrl)||void 0===h?void 0:h.value))}
                      @click=${()=>{var e;return this._handleNewEvent("help-faqs-aem-detail-link-click",null===(e=p.linkUrl)||void 0===e?void 0:e.value)}}
                      >${null===(b=p.linkText)||void 0===b?void 0:b.value}</bbva-type-link
                    >
                  </div>
                </div>
                ${this._renderFooter}
              </section>
            `:""}
      </bbva-help-modal>
    `}static _getAlternativeAnswer(e=[],t=[],a=[]){const i=(null==e?void 0:e.length)+(null==t?void 0:t.length);let s=0,n=0;const r=[];for(let o=0;o<i;o+=1)if(a.includes(o.toString())){const e=t[n];n+=1,e&&r.push(m`
              <bbva-list-bullet disabled-tabindex> ${e} </bbva-list-bullet>
            `)}else{const t=e[s];s+=1,t&&r.push(m`
              <bbva-type-text unset text=${t} size="S"> </bbva-type-text>
            `)}return m`
      ${r}
    `}get _renderDivider(){return this.showDivider?m`
          <bbva-divider-default></bbva-divider-default>
        `:""}get _renderFooter(){return this.hideFooter?"":m`
          <footer>
            ${this._renderDivider}
            <bbva-form-rating
              thumbs
              ?hide-text=${!this._showRatingText}
              content-title=${this.t("help-faqs-aem-thumbs")}
              text=${this.t("help-faqs-aem-feedback-text")}
              @form-rating-value-change=${this._handleRatingClick}
              disabled-tabindex
            ></bbva-form-rating>
          </footer>
        `}_renderPanelInfo(e){var t,a,i;return null!==(t=e.header)&&void 0!==t&&t.value?m`
        <help-faqs-aem-panel-info
          media=${`${this.host}${e.header.value}`}
          header=${null!==(i=e.alternativeTitle)&&void 0!==i&&i.value?e.alternativeTitle.value:e.title.value}
          ?is-video=${"video"===e.headerType.value}
          @help-faqs-aem-panel-info-video-play-click=${this._playVideo}
        >
        </help-faqs-aem-panel-info>
      `:m`
      <help-faqs-aem-panel-info
        header=${null!==(a=e.alternativeTitle)&&void 0!==a&&a.value?e.alternativeTitle.value:e.title.value}
      >
      </help-faqs-aem-panel-info>
    `}get _renderList(){return this._list&&this._list.length>0?this._list.map(((e,t)=>{var a,i;const s=null===(a=e.elements)||void 0===a||null===(i=a.title)||void 0===i?void 0:i.value;return m`
          <div class="link-list-container">
            <bbva-type-link
              ?ellipsis=${this.disableEllipsis}
              @click=${()=>this._handleClick({...e,key:t})}
              >${this.t(s)}
            </bbva-type-link>
          </div>
          <div class="fit">
            <bbva-divider-default></bbva-divider-default>
          </div>
        `})):""}get _renderError(){return m`
      <bbva-notification-message
        variant="error"
        message-title=${this.t("help-faqs-aem-error-load-list"+(this._shouldRetryAemRequest?"":"-call-bank"))}
        link-title=${this.t(""+(this._shouldRetryAemRequest?"help-faqs-aem-error-retry":""))}
        @notification-message-link-click=${this._handleRetryError}
        book-title=""
      ></bbva-notification-message>
    `}get _dmTemplate(){return m`
      <bbva-global-aem-content-fragment-dm
        .host=${this.host}
        .path=${this.contentFragmentPath}
        ?native=${this.native}
        @aem-content-fragment-dm-fetch-error=${this._handleAemContentDmError}
        @aem-content-fragment-dm-fetch=${this._setAEMData}
      >
      </bbva-global-aem-content-fragment-dm>
    `}render(){return m`
      ${super.render()} ${this._dmTemplate}
      <div role="presentation" ambient="primary-alt">
        <bbva-header-category
          heading-level="${this.headingLevel}"
          text=${this.t(this.faqsMessageText)}
        ></bbva-header-category>
        ${this._showError?this._renderError:this._renderList} ${this._renderContent}
      </div>
    `}_playVideo(){this.dispatchEvent(new CustomEvent("help-faqs-aem-video-show",{detail:!0,bubbles:!0,composed:!0}))}}export{O as H};
