import{H as e,z as t,a8 as i,ar as a,aa as r,aX as s,an as o,L as n,bU as d,cH as l,dy as c,ak as p,h,i as u,av as g,ab as m,aI as b,b0 as v,a_ as f,a$ as y,bZ as _,eZ as x,b1 as $,cD as S,bX as C,b4 as T,b6 as E,b5 as k,ag as A,bG as D,b8 as R,b9 as O,e$ as I,o as w,f as P,dm as M,f0 as F,f1 as L,g as q,bF as V,di as B,au as N,cO as z,dS as U,aV as G,aD as H,aw as j,F as X,du as Y,b2 as W,bg as Q,aL as Z,a9 as J,cS as K,bV as ee,ac as te,ad as ie,a as ae,aJ as re,aM as se,aN as oe,ah as ne,aO as de,cK as le,aU as ce,cM as pe,dB as he,ev as ue,ai as ge,dA as me,eu as be,cU as ve,v as fe}from"./952f98a9.js";import{a7 as ye,c5 as _e,cg as xe,aC as $e,u as Se,aX as Ce,ch as Te,ci as Ee,cj as ke,aM as Ae,t as De,a$ as Re,bu as Oe}from"./7f3d7ca9.js";import"./6547a2ba.js";import{g as Ie,j as we}from"./216055dc.js";import{B as Pe}from"./980a7fb4.js";import{b as Me}from"./6f390794.js";import"./caf32692.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./19ae9b6c.js";const Fe=e((e=>class extends e{static get properties(){return{host:{type:String,attribute:"host"},native:{type:Boolean},requiredToken:{type:String,attribute:"required-token"},language:{type:String},headers:{type:Object},ambient:{type:String,reflect:!0},locale:{type:String},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"},publicSettingsHost:{type:String,attribute:"public-settings-host"},publicSettingsRequiredToken:{type:String,attribute:"public-settings-required-token"},history:{type:Object}}}constructor(){super(),this.native=!1,this.iOSFixedHeader=!1,this.publicSettingsRequiredToken="none"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.addEventListener("help-modal-open",this._handleModalState),this.addEventListener("help-modal-close",this._handleModalState),this.setAttribute("data-tag-name",this.constructor.is)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("help-modal-open",this._handleModalState),this.removeEventListener("help-modal-close",this._handleModalState)}static scopedElementsFromClasses(e){return e.reduce(((e,t)=>(e[t.is]=t,e)),{})}_handleModalState(e){var t;const i=null==e||null===(t=e.detail)||void 0===t?void 0:t.modal;this.dispatchEvent(new CustomEvent("modal-state-change",{bubbles:!0,composed:!0,detail:{visible:null==i?void 0:i.visible,modal:i}}))}})),Le=new a;var qe=t`:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
}

.carousel-wrapper {
  flex: 1;
}

[data-tag-name=bbva-progress-content] {
  position: absolute;
}

[data-tag-name=bbva-carousel-swipe] {
  padding: var(--onboarding-full-screen-carousel-content-padding, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) 0 0);
  --bbva-carousel-swipe-gradient-color: rgba(255,255,255,0);
}

.footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) 0 calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}
.footer.hidden {
  visibility: hidden;
}
${Le.mediaRules()}`,Ve=t`[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
}

.carousel-wrapper {
  flex: 1;
}

[data-tag-name=bbva-progress-content] {
  position: absolute;
}

[data-tag-name=bbva-carousel-swipe] {
  padding: var(--onboarding-full-screen-carousel-content-padding, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) 0 0);
  --bbva-carousel-swipe-gradient-color: rgba(255,255,255,0);
}

.footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) 0 calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}
.footer.hidden {
  visibility: hidden;
}
`;class Be extends(s(Fe(ye(o(n))))){static get is(){return"onboarding-full-screen-carousel"}static get scopedElements(){const e=[d,Ie,l,c,we,...Be.configurationScopedElements()];return Be.scopedElementsFromClasses(e)}static get properties(){return{visible:{type:Boolean,reflect:!0},modalTitle:{type:String,attribute:"modal-title"},contentFragmentHost:{type:String,attribute:"content-fragment-host"},contentFragmentPath:{type:String,attribute:"content-fragment-path"},serviceCacheEnabled:{type:Boolean,attribute:"service-cache-enabled"},headers:{type:Object},items:Array,buttonText:{type:String,attribute:"button-text"},headerIconRightPrimary:{type:String,attribute:"header-icon-right-primary"},headerIconRightSecondary:{type:String,attribute:"header-icon-right-secondary"},maxErrorRetries:{type:Number,attribute:"max-error-retries"},attachModalsToBody:{type:Boolean,attribute:"attach-modals-to-body"},_data:Array,_selectedPage:Number,_scopedItems:Array}}get _headers(){return this.headers||{Accept:"application/json, text/plain, */*; q=0.01","Content-Type":"text/plain"}}static get styles(){return[qe,p("onboarding-full-screen-carousel-shared-styles")]}constructor(){super(),this.config={header:!1,loader:!0,notify:!1},this.attachModalsToBody=!1,this.visible=!1,this.modalTitle="",this.items=[],this.buttonText="",this.maxErrorRetries=2,this.serviceCacheEnabled=!1,this._selectedPage=0,this._errorRetries=0,this._scopedItems=[{tagName:"bbva-panel-offer",class:c}]}render(){var e,t;const i=`onboardingAemData-${(null===(e=this.contentFragmentPath)||void 0===e||null===(t=e.match(/\/([^/.]+)\./))||void 0===t?void 0:t[1])||""}-${this.language||""}`;return h`
      <bbva-global-aem-content-fragment-dm
        ?native="${this.native}"
        host="${this.contentFragmentHost}"
        path="${this.contentFragmentPath}"
        cachetype="${this.serviceCacheEnabled?"SESSION":"NONE"}"
        cachekey="${i}"
        @aem-content-fragment-dm-fetch="${e=>{this._generateCarouselContent(e),this.clearLoader()}}"
        @aem-content-fragment-dm-fetch-error="${this._manageFetchError}"
        cross-domain
        .headers="${this._headers}"
      ></bbva-global-aem-content-fragment-dm>
      <bbva-help-modal
        data-id="modalOnboardingFullScreenCarousel"
        .contentStyles="${this.attachModalsToBody?Ve:""}"
        full-height
        fixed-footer
        ?attach-to-body="${this.attachModalsToBody}"
        header-type="modal"
        header-text="${this.modalTitle}"
        aria-label="${this.modalTitle}"
        ?visible=${this.visible}
        @modal-state-change=${e=>{this.visible=e.detail.visible}}
        hide-content-padding-top
        icon-right-primary="${u(this.headerIconRightPrimary)}"
        icon-right-secondary="${u(this.headerIconRightSecondary)}"
        accessibility-text-icon-right-primary="${this.t("onboarding-full-screen-carousel-accessibility-text-icon-right-primary")}"
        accessibility-text-icon-right-secondary="${this.t("onboarding-full-screen-carousel-accessibility-text-icon-right-secondary")}"
      >
        <div class="carousel-wrapper" slot="slot-content">
          ${super.render()}
          <bbva-carousel-swipe
            .items=${this.items}
            .scopedComponents=${this._scopedItems}
            variant="full-screen"
            @carousel-swipe-item-select=${this._changedPage}
          ></bbva-carousel-swipe>
        </div>
        <div class="footer ${g({hidden:!this.buttonText})}" slot="slot-footer">
          <bbva-button-default
            @click=${this._buttonClick}
            text="${this.buttonText}"
          ></bbva-button-default>
        </div>
      </bbva-help-modal>
    `}firstUpdated(){this._dm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-aem-content-fragment-dm"]')}updated(e){(e.has("contentFragmentHost")||e.has("contentFragmentPath"))&&(this._errorRetries=0,this.showLoader(),this._dm.getAemData())}_manageFetchError(){this._errorRetries<this.maxErrorRetries?(this._errorRetries+=1,this._dm.getAemData()):(this.clearLoader(),this.dispatchEvent(new CustomEvent("onboarding-full-screen-carousel-loading-error",{detail:!0,bubbles:!0,composed:!0})))}_generateCarouselContent(e){var t,i,a;this._data=((null==e||null===(t=e.detail)||void 0===t||null===(i=t.items)||void 0===i||null===(a=i.contentfragmentlist)||void 0===a?void 0:a.items)||[]).map((({elements:e})=>e)),this.items=(this._data||[]).map((({image:e,title:t,description:i})=>({content:h`
        <bbva-panel-offer content-title="${t.value}">
          <img
            slot="microillustration"
            src="${`${this.contentFragmentHost}${e.value}`}"
            alt="${e.title}"
          />
          <p>${i.value}</p>
        </bbva-panel-offer>
      `}))),this._changedPage()}_changedPage({detail:e}={}){var t,i;this._selectedPage=e||0,this.buttonText=this._data?((null===(t=this._data[this._selectedPage])||void 0===t||null===(i=t.buttonText)||void 0===i?void 0:i.value)||"").trim():this.buttonText,this._selectedPage===this.items.length-1&&this.dispatchEvent(new CustomEvent("onboarding-full-screen-carousel-last-item",{detail:!0,bubbles:!0,composed:!0}))}_buttonClick(){const e=this._data?this._data[this._selectedPage].buttonAction.value:"onboarding-full-screen-carousel-item-select";this.dispatchEvent(new CustomEvent(e,{detail:this._selectedPage,bubbles:!0,composed:!0})),this.visible=!1}}const Ne=new a;var ze=t`:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-help-faqs-aem-dark-mode-bg, var(--bbva-help-faqs-aem-bg, var(--ambientsLight, ${i(b.light)})));
  height: 100%;
  --bbva-help-modal-padding: var(--bbva-help-faqs-aem-help-modal-padding, 0);
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-divider] {
  display: block;
}

section [data-tag-name=bbva-divider] {
  margin-top: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-notification-message],
.description-box {
  margin: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-text].title {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${i(m.medium.fontWeight)});
}

[data-tag-name=bbva-help-modal][visible] {
  transform: translateZ(0.1px);
}

.description-box {
  text-align: left;
}
${Ne.mediaRules()}`;class Ue extends(ye(Fe(o(s(n))))){static get is(){return"help-faqs-aem"}static get scopedElements(){const e=[S,$e,we,C,T,E,Se,Ce,k,l,A,D];return Ue.scopedElementsFromClasses(e)}static get properties(){return{_item:{type:Object},showModal:{type:Boolean,attribute:"show-modal"},_showRatingText:{type:Boolean},_showError:{type:Boolean},_counterAemError:{type:Number},contentFragmentPath:{type:String,attribute:"content-fragment-path"},aemData:{type:Object},headerText:{type:String},showDivider:{type:Boolean,attribute:"show-divider"},hideFooter:{type:Boolean,attribute:"hide-footer"},headingLevel:{type:Number},answerTitleTag:{type:String},disableEllipsis:{type:Boolean,attribute:"disable-ellipsis",reflect:!0},maxRequestAttempts:{type:Number,attribute:"max-request-attempts"}}}static get styles(){return[ze,v.light,f.light,_e.light,y.light,_.light,xe.light,x.light,$.light,p("help-faqs-aem-shared-styles")]}constructor(){super(),this.showModal=!1,this._showError=!1,this._showRatingText=!1,this.showDivider=!1,this.hideFooter=!1,this.headerText="help-faqs-aem-header-text",this.headingLevel=1,this.answerTitleTag="h2",this.disableEllipsis=!1,this._counterAemError=0,this.maxRequestAttempts=3,this._item={},this.config={...this.config,loader:!0}}firstUpdated(){super.firstUpdated&&super.firstUpdated(),this._dataManager=this.shadowRoot.querySelector('[data-tag-name="bbva-global-aem-content-fragment-dm"]'),this._getAEMData()}update(e){super.update(e),e.has("contentFragmentPath")&&this.aemData&&(this._dataManager.resetCache(),this._dataManager.getAemData())}_getAEMData(){this.aemData||this._dataManager.getAemData()}_setAEMData(e){this._showError=!1,this.aemData=e.detail||[],this.clearLoader()}get _list(){var e,t,i;return(null===(e=this.aemData)||void 0===e||null===(t=e.items)||void 0===t||null===(i=t.contentfragmentlist)||void 0===i?void 0:i.items)||[]}get _shouldRetryAemRequest(){return this._counterAemError<=this.maxRequestAttempts}_handleClick(e){this._item=e,this.showModal=!0,this._handleNewEvent("help-faqs-aem-detail-show",e)}_closeModal(){this.showModal=!1,this._showRatingText=!1}_handleNewEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}_handleRatingClick({detail:e}){this._showRatingText=!0,this._handleNewEvent("help-faqs-aem-feedback-click",e)}_handleRetryError(){this._shouldRetryAemRequest&&(this.showLoader("full"),this._getAEMData(),this._handleNewEvent("help-faqs-aem-notification-retry-click"))}_handleAemContentDmError(){this._showError=!0,this._counterAemError+=1,this.clearLoader(),this._handleNewEvent("help-faqs-aem-content-service-error")}get _renderContent(){var e,t,i,a,r,s,o,n,d,l;const c=null===(e=this._item)||void 0===e?void 0:e.elements;return h`
      <bbva-help-modal
        full-height
        header-text=${null!=c&&null!==(t=c.entity)&&void 0!==t&&t.value?c.entity.value:this.headerText}
        accessibility-text-icon-right-primary="${this.t("help-faqs-aem-header-icon-right-primary-accessibility-text")}"
        ?visible="${this.showModal}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        hide-content-padding-top
        @help-modal-close=${this._closeModal}
      >
        ${c&&this.showModal?h`
              <section slot="slot-content">
                <article>
                  ${this._sourceMediaFile(c)}
                  <div class="description-box" role="presentation">
                    <bbva-text
                      tag="${this.answerTitleTag}"
                      class="title"
                      size="M"
                      unset
                      text=${null!==(i=c.alternativeTitle)&&void 0!==i&&i.value?c.alternativeTitle.value:c.title.value}
                    ></bbva-text>
                    ${null!==(a=c.alternativeAnswer)&&void 0!==a&&a.value?Ue._getAlternativeAnswer(null===(r=c.alternativeAnswer)||void 0===r?void 0:r.value,null===(s=c.bullets)||void 0===s?void 0:s.value,null===(o=c.itemsposition)||void 0===o?void 0:o.value):h`
                          <bbva-text text=${c.answer.value} size="S"></bbva-text>
                        `}
                    <bbva-link
                      ?hidden=${!(null!==(n=c.linkUrl)&&void 0!==n&&n.value&&""!==(null===(d=c.linkUrl)||void 0===d?void 0:d.value))}
                      @click=${()=>{var e;return this._handleNewEvent("help-faqs-aem-detail-link-click",null===(e=c.linkUrl)||void 0===e?void 0:e.value)}}
                      >${null===(l=c.linkText)||void 0===l?void 0:l.value}</bbva-link
                    >
                  </div>
                </article>
                ${this._renderFooter}
              </section>
            `:""}
      </bbva-help-modal>
    `}static _getAlternativeAnswer(e=[],t=[],i=[]){const a=(null==e?void 0:e.length)+(null==t?void 0:t.length);let r=0,s=0;const o=[];for(let n=0;n<a;n+=1)if(i.includes(n.toString())){const e=t[s];s+=1,e&&o.push(h`
              <bbva-list-bullet disabled-tabindex> ${e} </bbva-list-bullet>
            `)}else{const t=e[r];r+=1,t&&o.push(h`
              <bbva-text tag="p" text=${t} size="S"> </bbva-text>
            `)}return h`
      ${o}
    `}get _renderDivider(){return this.showDivider?h`
          <bbva-divider></bbva-divider>
        `:""}get _renderFooter(){return this.hideFooter?"":h`
          <footer>
            ${this._renderDivider}
            <bbva-form-rating
              thumbs
              ?hide-text=${!this._showRatingText}
              title=${this.t("help-faqs-aem-thumbs")}
              text=${this.t("help-faqs-aem-feedback-text")}
              @form-rating-value-change=${this._handleRatingClick}
              disabled-tabindex
            ></bbva-form-rating>
          </footer>
        `}_sourceMediaFile(e){var t;return null!==(t=e.header)&&void 0!==t&&t.value?"video"===e.headerType.value?h`
          <bbva-banner-video
            @banner-video-button-click=${()=>this._handleNewEvent("help-faqs-aem-video-show")}
            url-image=${e.header.value}
          ></bbva-banner-video>
        `:h`
        <bbva-banner-image
          fullwidth
          image-src=${`${this.host}${e.header.value}`}
        ></bbva-banner-image>
      `:""}get _renderList(){return this._list&&this._list.length>0?this._list.map(((e,t)=>{const i=e.elements.title.value;return h`
          <bbva-list-link
            disabled-tabindex
            header-text=${i}
            .multiline=${!this.disableEllipsis}
            @list-link-click=${()=>this._handleClick({...e,key:t})}
          ></bbva-list-link>
          ${t<this._list.length-1?h`
                <bbva-divider size="fit"></bbva-divider>
              `:""}
        `})):""}get _renderError(){return h`
      <bbva-notification-message
        variant="error"
        message=${this.t("help-faqs-aem-error-load-list"+(this._shouldRetryAemRequest?"":"-call-bank"))}
        link-title=${this.t(""+(this._shouldRetryAemRequest?"help-faqs-aem-error-retry":""))}
        @notification-message-link-click=${this._handleRetryError}
      ></bbva-notification-message>
    `}get _dmTemplate(){return h`
      <bbva-global-aem-content-fragment-dm
        .host=${this.host}
        .path=${this.contentFragmentPath}
        ?native=${this.native}
        @aem-content-fragment-dm-fetch-error=${this._handleAemContentDmError}
        @aem-content-fragment-dm-fetch=${this._setAEMData}
      >
      </bbva-global-aem-content-fragment-dm>
    `}render(){return h`
      ${super.render()} ${this._dmTemplate}
      <div ambient="light" role="presentation">
        <bbva-header-category
          heading-level="${this.headingLevel}"
          text=${this.t("help-faqs-aem-message-faqs")}
        ></bbva-header-category>
        ${this._showError?this._renderError:this._renderList} ${this._renderContent}
      </div>
    `}}q("colors.cool80");var Ge=t`:host {
  display: block;
  box-sizing: border-box;
  overflow: hidden;
  --bbva-help-modal-padding: 0;
}
`;class He extends(s(Fe(o(n)))){static get is(){return"cards-upgrade-faqs"}static get scopedElements(){const e=[A,l,Ue,B];return He.scopedElementsFromClasses(e)}static get properties(){return{aemHost:{type:String,attribute:"aem-host"},contentFragmentPath:{type:String,attribute:"content-fragment-path"},visible:{type:Boolean}}}constructor(){super(),this.visible=!1,this.aemHost="",this.contentFragmentPath=""}get _faqsAem(){return this.__faqsAem||(this.__faqsAem=this.shadowRoot.querySelector(`[data-tag-name="${Ue.is}"]`)),this.__faqsAem}static get styles(){return[Ge,$.light,p("cards-upgrade-list-cards-shared-styles")]}closeFaqsDetail(){this._faqsAem.showModal=!1}_dispatchCustomEvent(e,t=!0,i=!0,a=!0){this.dispatchEvent(new CustomEvent(e,{bubbles:i,composed:a,detail:t,cancelable:!0}))}_handleFaqQuestion(e){var t,i;this._dispatchCustomEvent("cards-upgrade-faqs-question-title",{faqQuestion:null===(t=e.elements)||void 0===t||null===(i=t.title)||void 0===i?void 0:i.value})}get _renderFaqs(){return h`
      <help-faqs-aem
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        host="${this.aemHost}"
        hide-footer
        ?native=${this.native}
        headerText="${this.t("cards-upgrade-faqs-help-header-title")}"
        content-fragment-path=${this.contentFragmentPath}
        @visible-changed=${e=>e.stopPropagation()}
        @hide-loader=${e=>e.stopPropagation()}
        @help-faqs-aem-detail-show="${({detail:e})=>this._handleFaqQuestion(e)}"
      >
      </help-faqs-aem>
    `}render(){return h`
    <bbva-transition-container
        ambient="light"
        header-type="modal-three-level"
        hide-return-icon
        ?visible=${this.visible}
        accessibility-text-icon-left-primary="${this.t("cards-upgrade-accessibility-close-button")}"
        icon-right-primary="${V()}"
        header-text="${this.t("cards-upgrade-faqs-help-header-title")}"
        .closeModalElements="${["header-icon-right-primary"]}"
        @visible-changed=${({detail:e})=>this._dispatchCustomEvent((e?"push":"pop")+"-stack-element",this)}
        >
        <div slot="slot-content">
          ${this._renderFaqs}
        </div>
      </bbva-transition-container>
    `}}var je=t`:host {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: var(--cards-upgrade-option-fees-padding, 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1em));
}

[data-tag-name=bbva-header-category] {
  padding: 0;
}
[data-tag-name=bbva-header-category].option-fees-title {
  align-self: flex-start;
}

[data-tag-name=bbva-icon] {
  margin-left: var(--cards-upgarde-option-fees-help-icon-margin-left, calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
}

.list-container {
  width: 100%;
  display: flex;
  flex-direction: column;
  margin: var(--cards-upgrade-option-fees-list-container-margin, calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) 0 0 0);
}

dl.list-element {
  display: flex;
  justify-content: space-between;
  margin: var(--cards-upgrade-option-fees-list-element-margin, calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) 0);
}

dt.element-key {
  display: flex;
  margin-right: var(--cards-upgrade-option-fees-element-key-margin-right, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
  max-width: 100%;
}
dt.element-key [data-tag-name=bbva-text] {
  max-width: min-content;
}

dd.element-value {
  margin: 0;
  max-width: 50%;
  overflow: hidden;
}
dd.element-value [data-tag-name=bbva-text] {
  display: flex;
  justify-content: center;
  align-items: end;
}
dd.element-value [data-tag-name=bbva-amount] {
  display: flex;
  justify-content: center;
  align-items: end;
}

:host([bold-values]) [data-tag-name=bbva-text].value,
:host([bold-values]) [data-tag-name=bbva-amount] {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${i(m.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${i(m.medium.fontStyle)});
}

dd.icon-text {
  display: flex;
}
`;class Xe extends(s(Fe(o(n)))){static get is(){return"cards-upgrade-option-fees"}static get scopedElements(){const e=[k,A,j,X];return Xe.scopedElementsFromClasses(e)}static get properties(){return{title:{type:String},fees:{type:Array},paymentMethod:{type:Object},ambient:{type:String},boldValues:{type:Boolean,attribute:"bold-values",reflect:!0},showHelpIcons:{type:Boolean,attribute:"show-help-icons"},disabledTabindex:{type:Boolean,attribute:"disabled-tabindex"}}}constructor(){super(),this.fees=[],this.ambient="",this.showHelpIcons=!1,this.title="",this.boldValues=!1,this.disabledTabindex=!1,this.paymentMethod={}}static get styles(){return[je,y.light,y.dark,$.light,$.dark,N.light,N.dark,z.light,z.dark,p("cards-upgrade-optio-fees-shared-styles")]}_handleLinkClick(e,t,i){e.stopPropagation(),this.dispatchEvent(new CustomEvent("cards-upgrade-option-help-button-click",{bubbles:!0,composed:!0,detail:{id:t,descriptionModal:i}}))}__getValueTag({id:e,amount:t,percentage:i,value:a,currency:r}){return{PERCENTAGE:h`
        <bbva-text
          class="value"
          font-weight="500"
          .text="${i}%"
          tag="span"
          size="S"
          .ambient=${this.ambient}
        ></bbva-text>
      `,TEXT:h`
        <bbva-text
          class="value"
          .text="${a}"
          tag="span"
          size="S"
          alignment="right"
          .ambient=${this.ambient}
        ></bbva-text>
      `,AMOUNT:h`
        <bbva-amount 
        class="value"
        language="MXN"
        variant="m" 
        .amount="${t}" 
        .ambient=${this.ambient}
        .currencyCode="${r}" 
        .localCurrency="${r}">
        </bbva-amount>
      `}[e]}_renderPaymentMethods(){var e,t,i,a,r,s;const o=[],n=null===(e=this.paymentMethod)||void 0===e||null===(t=e.frequency)||void 0===t?void 0:t.id,d=null===(i=this.paymentMethod)||void 0===i||null===(a=i.frequency)||void 0===a||null===(r=a.daysOfMonth)||void 0===r?void 0:r.day,l={FIXED_AMOUNT_PAYMENT:"cards-upgrade-option-conditions-payment-method-fixed-amount-payment",FIXED_PERCENTAGE_PAYMENT:"cards-upgrade-option-conditions-payment-method-fixed-percentage-payment",TOTAL_AMOUNT_PAYMENT:"cards-upgrade-option-conditions-payment-method-total-amount-payment"}[null===(s=this.paymentMethod)||void 0===s?void 0:s.id]||"";return""!==l&&o.push({description:this.t("cards-upgrade-option-conditions-payment-method-description"),feeType:{id:"TEXT",value:l}}),"MONTHLY"===n&&d&&o.push({description:"cards-upgrade-option-conditions-payment-day-description",feeType:{id:"TEXT",value:this.t("cards-upgrade-option-conditions-payment-day-value",{paymentDay:d})}}),o.map((e=>this.__renderPaymentMethod(e)))}__renderPaymentMethod(e={}){return h`
      <dl class="list-element">
        <dt class="element-key">
          <bbva-text
            ellipsis
            .ambient=${this.ambient}
            .text="${null==e?void 0:e.description}"
            size="S"
            tag="span"
          ></bbva-text>
        </dt>
        <dd class="element-value">
          ${this.__getValueTag(null==e?void 0:e.feeType)}
        </dd>
      </dl>
    `}upArrowIcon(e){return e===this.t("cards-upgrade-multistep-card-info-line")?h`
    <bbva-icon
      .disabledTabindex=${this.disabledTabindex}
      icon="${U()}"
      icon-color="#277A3E"
      size="24"
    >
    </bbva-icon>
  `:G}render(){var e;return h`
      <bbva-header-category
        .ambient=${this.ambient}
        class="option-fees-title"
        .text=${this.title}
        accessible-text="${this.t("cards-upgrade-option-fees-title-accessible-text")}"
        style="padding-top:24px"
      >
      </bbva-header-category>
      <section class="list-container">
        ${null===(e=this.fees)||void 0===e?void 0:e.map((({id:e,idHelp:t,description:i,descriptionModal:a,feeType:r,helpIcon:s})=>h`
              <dl id="${t}" class="list-element">
                <dt class="element-key">
                  <bbva-text
                    ellipsis
                    .ambient=${this.ambient}
                    .text="${i}"
                    size="S"
                    tag="span"
                  >
                  </bbva-text>
                  ${s?h`
                      <bbva-icon
                        id="${t}"
                        .disabledTabindex=${this.disabledTabindex}
                        icon="${H()}"
                        @click=${t=>this._handleLinkClick(t,e,a)}
                        icon-color="#1973B8"
                        size="24"
                      >
                      </bbva-icon>
                    `:G}
                </dt>
                <dd class="element-value icon-text">
                        ${this.upArrowIcon(i)}
                        ${this.__getValueTag(r)}
                </dd>
              </dl>
            `))}
        ${this._renderPaymentMethods()}
      </section>
    `}}var Ye=t`:host {
  display: flex;
  flex-direction: column;
  align-items: center;
  margin-bottom: var(--cards-upgrade-option-detail-interest-credit-line-margin-top, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
}

.credit-line-amount-container {
  display: flex;
}
`;class We extends(s(Fe(o(n)))){static get is(){return"cards-upgrade-option-credit-line"}static get scopedElements(){const e=[j,X,A];return We.scopedElementsFromClasses(e)}static get properties(){return{option:{type:Object},text:{type:String},textAlignment:{type:String},iconColorBbvaUparrow:{type:String},iconColorBbvaRightarrow:{type:String},variant:{type:String}}}constructor(){super(),this.option={},this.text="",this.textAlignment="center",this.iconColorBbvaUparrow="#277A3E",this.iconColorBbvaRightarrow="#D44B50",this.ambient="light",this.variant="4xl"}static get styles(){return[Ye,$.light,$.dark,N.light,N.dark,z.light,z.dark,p("cards-upgrade-option-credit-line-shared-styles")]}get _renderAmountIcon(){const e={icon:U(),color:this.iconColorBbvaUparrow};return h`
      <bbva-icon icon=${null==e?void 0:e.icon} icon-color=${null==e?void 0:e.color} size="24"></bbva-icon>
    `}render(){var e,t,i,a,r,s;return h`
      <section class="interest-credit-line">
        <bbva-text
          size="S"
          ambient-color="${this.ambient}"
          class="credit-line-text"
          tag="span"
          .text=${this.text}
          alignment=${this.textAlignment}
        ></bbva-text>
        <div class="credit-line-amount-container">
          ${this._renderAmountIcon}
          <bbva-amount
            language="MXN"
            size="L"
            class="credit-line-amount"
            .variant=${this.variant}
            amount="${null===(e=this.option)||void 0===e||null===(t=e.grantedCredits[0])||void 0===t?void 0:t.amount}"
            .currencyCode="${null===(i=this.option)||void 0===i||null===(a=i.grantedCredits[0])||void 0===a?void 0:a.currency}" 
            .localCurrency="${null===(r=this.option)||void 0===r||null===(s=r.grantedCredits[0])||void 0===s?void 0:s.currency}">
          ></bbva-amount>
        </div>
      </section>
    `}}var Qe=t`:host {
  display: block;
  box-sizing: border-box;
  overflow: hidden;
  width: 100%;
}

.card-container {
  display: flex;
  flex-direction: column;
  align-items: center;
}

[data-tag-name=bbva-clip-card] {
  margin-top: var(--cards-upgrade-banner-card-image-margin-top, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
}

[data-tag-name=bbva-clip-microillustration] {
  margin-top: var(--cards-upgrade-banner-microillustruation-margin-top, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
}

[data-tag-name=bbva-header-category] {
  padding: 0;
}

[data-tag-name=bbva-text] {
  width: 100%;
}
[data-tag-name=bbva-text].card-title {
  margin-top: var(--cards-upgrade-banner-card-title-margin-top, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
  text-align: center;
}
[data-tag-name=bbva-text].card-description {
  margin: var(--cards-upgrade-banner-card-description-margin, calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) 0 calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) 0);
  text-align: center;
}
`;class Ze extends(s(Fe(o(n)))){static get is(){return"cards-upgrade-banner"}static get scopedElements(){const e=[Q,A,k,Z];return Ze.scopedElementsFromClasses(e)}static get properties(){return{bannerImg:{type:String,attribute:"banner-img"},microillustration:{type:String},microillustrationSize:{type:String,attribute:"microillustration-size"},titleText:{type:String,attribute:"title-text"},subtitleText:{type:String,attribute:"subtitle-text"},disabledTabindex:{type:Boolean,attribute:"disabled-tabindex"}}}constructor(){super(),this.bannerImg="",this.titleText="",this.subtitleText="",this.microillustration="",this.microillustrationSize="M",this.disabledTabindex=!1}static get styles(){return[Y.light,W.light,$.light,Qe,p("cards-upgrade-banner-styles")]}get _bannerImage(){return this.microillustration?h`
          <bbva-clip-microillustration
            microillustration="${this.microillustration}"
            .size=${this.microillustrationSize}
          ></bbva-clip-microillustration>
        `:h`
          <bbva-clip-card
            card-image="${u(this.bannerImg)}"
            .disabledTabindex=${this.disabledTabindex}
          ></bbva-clip-card>
        `}headerTitle(){return"success"!==this.microillustration&&"error"!==this.microillustration?`Asciende a ${this.titleText}`:this.titleText}panelStyle(){return"error"===this.microillustration?"#121212":"secondary500"}render(){return h`
      <section class="card-container">
        ${this._bannerImage}
        <bbva-text
          class="card-title"
          size="L"
          font-weight="500"
          text="${this.headerTitle()}"
          tag="span"
        ></bbva-text>
        <bbva-text
          class="card-description"
          size="S"
          text="${this.subtitleText}"
          ambient-color="${this.panelStyle()}"
          tag="span"
        ></bbva-text>
      </section>
    `}}var Je=t`:host {
  display: block;
  box-sizing: border-box;
  overflow: hidden;
  width: 100%;
  --_cards-upgrade-option-skeleton-quote-color: var(--cards-upgrade-option-dark-mode-skeleton-color,var(--cards-upgrade-option-skeleton-color, var(--colorsSecondary200, ${i(J.secondary200)})));
  --_cards-upgrade-option-skeleton-quote-bg: var(--cards-upgrade-option-dark-mode-skeleton-bg,var(--cards-upgrade-option-skeleton-bg, transparent));
}

[data-tag-name=bbva-help-modal] {
  z-index: 2;
}

[data-tag-name=cards-upgrade-option-fees] {
  padding: 0;
  width: 100%;
}

[data-tag-name=bbva-header-category] {
  padding: 0;
}

[data-tag-name=bbva-text] {
  width: 100%;
  margin-bottom: var(--cards-upgrade-option-detail-intenrest-rates-container-margin-top, calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
}

[data-tag-name=bbva-button-default] {
  margin: var(--cards-upgrade-option-detail-button-margin, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1em) 0 calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) 0);
}

[data-tag-name=bbva-list-bullet] {
  padding-left: 0;
}
[data-tag-name=bbva-list-bullet]:first-of-type {
  margin-top: var(--cards-upgrade-option-detail-first-list-bullet-margin-top, calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
}

section.interest-rates-container {
  margin-top: var(--cards-upgrade-option-detail-intenrest-rates-container-margin-top, calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
}
section.considerations-container {
  margin-top: var(--cards-upgrade-optoin-detail-considerations-container-margin-top, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
}

.skeleton {
  height: 27rem;
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  display: inline-block;
  pointer-events: none;
  background-repeat: no-repeat;
  font-size: 1em;
  will-change: transform;
  transform: opacity;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  background-image: linear-gradient(var(--_cards-upgrade-option-skeleton-quote-color, var(--colorsSecondary200, ${i(J.secondary200)})) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_cards-upgrade-option-skeleton-quote-color, var(--colorsSecondary200, ${i(J.secondary200)})) 50%), linear-gradient(-60deg, transparent 50%, var(--_cards-upgrade-option-skeleton-quote-color, var(--colorsSecondary200, ${i(J.secondary200)})) 50%), linear-gradient(-60deg, transparent 50%, var(--_cards-upgrade-option-skeleton-quote-color, var(--colorsSecondary200, ${i(J.secondary200)})) 50%), linear-gradient(-60deg, transparent 50%, var(--_cards-upgrade-option-skeleton-quote-color, var(--colorsSecondary200, ${i(J.secondary200)})) 50%), linear-gradient(-60deg, var(--_cards-upgrade-option-skeleton-quote-color, var(--colorsSecondary200, ${i(J.secondary200)})) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--_cards-upgrade-option-skeleton-quote-color, var(--colorsSecondary200, ${i(J.secondary200)})) 50%), linear-gradient(-60deg, var(--_cards-upgrade-option-skeleton-quote-color, var(--colorsSecondary200, ${i(J.secondary200)})) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--_cards-upgrade-option-skeleton-quote-color, var(--colorsSecondary200, ${i(J.secondary200)})) 50%), linear-gradient(-60deg, transparent 50%, var(--_cards-upgrade-option-skeleton-quote-color, var(--colorsSecondary200, ${i(J.secondary200)})) 50%), linear-gradient(-60deg, transparent 50%, var(--_cards-upgrade-option-skeleton-quote-color, var(--colorsSecondary200, ${i(J.secondary200)})) 50%), linear-gradient(-60deg, var(--_cards-upgrade-option-skeleton-quote-color, var(--colorsSecondary200, ${i(J.secondary200)})) 50%, transparent 50%), linear-gradient(var(--_cards-upgrade-option-skeleton-quote-color, var(--colorsSecondary200, ${i(J.secondary200)})) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_cards-upgrade-option-skeleton-quote-color, var(--colorsSecondary200, ${i(J.secondary200)})) 50%);
  background-color: var(--_cards-upgrade-option-skeleton-quote-bg, transparent);
  background-size: 64px 64px, calc((45% * 2) + (16px/ 2)) 16px, calc((85% * 2) + (16px/ 2)) 16px, calc((62.5% * 2) + (16px/ 2)) 16px, calc((104px * 2) + (16px/ 2)) 16px, calc((64px * 2) + (16px/ 2)) 16px, calc((88px * 2) + (16px/ 2)) 16px, calc((116px * 2) + (16px/ 2)) 16px, calc((128px * 2) + (16px/ 2)) 16px, calc((72px * 2) + (16px/ 2)) 16px, calc((104px * 2) + (16px/ 2)) 16px, calc((64px * 2) + (16px/ 2)) 16px, 16px 16px, calc((144px * 2) + (16px/ 2)) 16px;
  background-position: 50% 0, 80px 80px, 20px 112px, 52px 136px, 0 196px, 100% 196px, 0 228px, 100% 228px, 0 288px, 0 320px, 0 380px, 100% 380px, 0 412px, 28px 412px;
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
    opacity: 0;
  }
}
`;class Ke extends(s(Fe(o(n)))){static get is(){return"cards-upgrade-option-detail"}static get scopedElements(){const e=[d,l,X,A,k,j,D,Xe,Ze,We];return Ke.scopedElementsFromClasses(e)}static get properties(){return{visible:{type:Boolean},option:{type:Object},loading:{type:Boolean},considerationsLength:{type:Number,attribute:"considerations-length"}}}constructor(){super(),this.visible=!1,this.option={},this.loading=!1,this.considerationsLength=4}static get styles(){return[Je,$.light,N.light,y.light,z.light,z.dark,x.light,K.light,p("cards-upgrade-option-shared-styles")]}get _renderCard(){var e,t,i,a;return h`
      <section class="card-container">
        <cards-upgrade-banner
          banner-img="${u(null===(e=((null===(t=this.option)||void 0===t?void 0:t.images)||[]).find((({id:e})=>"FRONT_CARD"===e)))||void 0===e?void 0:e.url)}"
          title-text="${null===(i=this.option)||void 0===i?void 0:i.name}"
          subtitle-text="${null===(a=this.option)||void 0===a?void 0:a.shortDescription}"
        ></cards-upgrade-banner>
      </section>
    `}get _renderBenefits(){var e,t,i;return h`
      <section class="benefits-container">
        ${null!==(e=this.option)&&void 0!==e&&null!==(t=e.benefits)&&void 0!==t&&t.length?h`
              <bbva-header-category
                text="${this.t("cards-upgrade-multistep-benefits")}"
                tag="span"
              ></bbva-header-category>
              ${Ke._renderListBullet(null===(i=this.option)||void 0===i?void 0:i.benefits.map((({description:e})=>e)))}
            `:G}
      </section>
    `}get _renderCreditLine(){var e;return((null===(e=this.option)||void 0===e?void 0:e.grantedCredits)||[]).length?h`
          <cards-upgrade-option-credit-line
            .option=${this.option}
            .language=${this.language}
            text="${this.t("cards-upgrade-option-detail-credit-line")}"
            ambient="secondary500"
          >
          </cards-upgrade-option-credit-line>
        `:G}get _renderInterestRates(){var e,t;return h`
      <section class="interest-rates-container">
        <cards-upgrade-option-fees
          .language=${this.language}
          .title="${this.t("cards-upgrade-option-fees-title-interest-rates")}"
          .fees=${(null===(e=this.option)||void 0===e?void 0:e.fees)||[]}
          .paymentMethod=${(null===(t=this.option)||void 0===t?void 0:t.paymentMethod)||{}}
          ambient="light"
          show-help-icons
        >
        </cards-upgrade-option-fees>
      </section>
    `}get _renderConsiderations(){return h`
      <section class="considerations-container">
        ${this.considerationsLength?h`
              <bbva-header-category
                text="${this.t("cards-upgrade-multistep-considerations")}"
              ></bbva-header-category>
              ${Ke._renderListBullet([...Array(this.considerationsLength).keys()].map((e=>this.t(`cards-upgrade-multistep-considerations-${e}`))))}
            `:G}
      </section>
    `}get _renderButton(){return h`
      <bbva-button-default
        @click=${()=>this.dispatchEvent(new CustomEvent("card-upgrade-option-detail-button-click",{bubbles:!0,composed:!0}))}
        .text="${this.t("cards-upgrade-button-close")}"
      >
      </bbva-button-default>
    `}static _renderListBullet(e){return h`
      ${null==e?void 0:e.map((e=>h`
            <bbva-list-bullet text="${e}"></bbva-list-bullet>
          `))}
    `}get _renderVisualContent(){return h`
      ${this._renderCard}
      ${this._renderCreditLine} ${this._renderBenefits} ${this._renderInterestRates}
      ${this._renderConsiderations} ${this._renderButton}
    `}static get _renderSkeleton(){return h`
      <div class="skeleton"></div>
    `}render(){return h`
      <bbva-help-modal
        ambient="light"
        header-type="modal-three-level"
        .headerText="${this.t("cards-upgrade-header-title")}"
        aria-label="${this.t("cards-upgrade-header-title")}"
        .accessibilityTextIconRightSecondary=${this.t("cards-upgrade-accessibility-help-button")}
        .accessibilityTextIconRightPrimary=${this.t("cards-upgrade-accessibility-close-button")}
        hide-content-padding-top
        icon-right-primary=${V()}
        full-height
        ?visible=${this.visible}
        @visible-changed=${({detail:e})=>this.dispatchEvent(new CustomEvent((e?"push":"pop")+"-stack-element",{bubbles:!0,composed:!0,detail:this}))}
      >
        <div slot="slot-content">
          ${this.loading?Ke._renderSkeleton:this._renderVisualContent}
        </div>
      </bbva-help-modal>
    `}}var et=t`:host {
  display: flex;
  flex-direction: column;
  align-items: center;
  width: 100%;
}
`,tt=t`:host {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: var(--cards-upgrade-option-padding, 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1em));
  background-color: var(--colorsPrimaryCoreLightened, ${i(J.primaryCoreLightened)});
  margin-bottom: var(--cards-upgrade-option-margin-bottom, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
}

[data-tag-name=bbva-divider] {
  width: 100%;
  margin-bottom: var(--cards-upgrade-option-divider-margin-bottom, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
}

[data-tag-name=bbva-link].option-link {
  margin: var(--cards-upgrade-option-link-margin, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) 0 calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) 0);
}
[data-tag-name=bbva-link].conditions-link {
  margin-bottom: var(--cards-upgrade-option-conditions-link-margin-bottom, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
}

[data-tag-name=cards-upgrade-option-fees] {
  padding: 0;
}

.section-amount {
  display: flex;
  flex-direction: column;
  align-items: center;
}

.section-badge {
  display: flex;
}
`;class it extends(s(Fe(ye(o(n))))){static get is(){return"cards-upgrade-option"}static get scopedElements(){const e=[E,T,Xe,Ze,We,A,j];return it.scopedElementsFromClasses(e)}static get properties(){return{option:{type:Object},optionId:{type:String,attribute:"option-id",reflect:!0},conditionsUrl:{type:String,attribute:"conditions-url"},disabledTabindex:{type:Boolean,attribute:"disabled-tabindex"}}}constructor(){super(),this.option={},this.optionId="",this.conditionsUrl=""}static get styles(){return[tt,f.light,v.light,p("cards-upgrade-option-shared-styles")]}updated(e){var t;e.has("option")&&(this.optionId=null===(t=this.option)||void 0===t?void 0:t.id),super.update(e)}_handleLinkClick(e){var t;e.stopPropagation(),this._dispatchCustomEvent("cards-upgrade-option-button-click",null===(t=this.option)||void 0===t?void 0:t.id)}_handleConditionsClick(){this._dispatchCustomEvent("cards-upgrade-option-conditions-link-click",this.conditionsUrl)}get _renderLink(){return h`
      <bbva-link
        class="option-link"
        .disabledTabindex=${this.disabledTabindex}
        @click=${this._handleLinkClick}
      >
        ${this.t("cards-upgrade-option-button-text")}
      </bbva-link>
    `}get _renderOption(){var e,t,i,a;return h`
      <cards-upgrade-banner
        .disabledTabindex=${this.disabledTabindex}
        banner-img=${u(null===(e=((null===(t=this.option)||void 0===t?void 0:t.images)||[]).find((({id:e})=>"FRONT_CARD"===e)))||void 0===e?void 0:e.url)}
        title-text=${null===(i=this.option)||void 0===i?void 0:i.name}
        subtitle-text=${null===(a=this.option)||void 0===a?void 0:a.shortDescription}
      ></cards-upgrade-banner>
    `}get _renderFees(){var e,t;return h`
      <cards-upgrade-option-fees
        .disabledTabindex=${this.disabledTabindex}
        .title="${this.t("cards-upgrade-option-fees-title-interest-rates")}"
        .fees=${(null===(e=this.option)||void 0===e?void 0:e.fees)||[]}
        .paymentMethod=${(null===(t=this.option)||void 0===t?void 0:t.paymentMethod)||{}}
        ambient="light"
        show-help-icons
      >
      </cards-upgrade-option-fees>
    `}get _renderConditionsLink(){return this.conditionsUrl?h`
          <bbva-link
            class="conditions-link"
            .disabledTabindex=${this.disabledTabindex}
            @click=${this._handleConditionsClick}
          >
            ${this.t("cards-upgrade-option-conditions-link-text")}
          </bbva-link>
        `:G}get _renderCreditLine(){var e;return((null===(e=this.option)||void 0===e?void 0:e.grantedCredits)||[]).length?h`
          <cards-upgrade-option-credit-line
            .option=${this.option}
            .language=${this.language}
            text="${this.t("cards-upgrade-option-detail-credit-line")}"
            ambient="secondary500"
          >
          </cards-upgrade-option-credit-line>
        `:G}render(){return h`
      ${this._renderOption} ${this._renderConditionsLink} ${this._renderCreditLine}
      ${this._renderFees} ${this._renderLink}
    `}}var at=t`:host {
  display: block;
  box-sizing: border-box;
  overflow: hidden;
  width: 100%;
}

[data-tag-name=cards-upgrade-banner] {
  margin-top: var(--cards-upgrade-list-options-banner-margin-top, calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
}

.upgrade-option-container {
  margin-bottom: var(--cards-upgrade-list-options-margin-bottom, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
  background-color: var(--colorsPrimaryCoreLightened, ${i(J.primaryCoreLightened)});
}
.upgrade-option-container [data-tag-name=bbva-form-radio-button] {
  max-width: fit-content;
  padding: var(--cards-upgrade-list-options-radio-button-padding, calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1em) 0 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1em));
}
`;class rt extends(s(Fe(ye(o(n))))){static get is(){return"cards-upgrade-list-options"}static get scopedElements(){const e=[it,Ze];return rt.scopedElementsFromClasses(e)}static get properties(){return{options:{type:Array},disabledTabindex:{type:Boolean,attribute:"disabled-tabindex"},emptyOptionsMicroillustration:{type:String,attribute:"empty-options-microillustration"}}}constructor(){super(),this.options=[],this.disabledTabindex=!1,this.emptyOptionsMicroillustration="emptystateday"}static get styles(){return[at,p("cards-upgrade-list-options-shared-styles")]}async firstUpdated(){super.firstUpdated()}__renderOption(e){return h`
      <cards-upgrade-option
        .language=${this.language}
        .disabledTabindex=${this.disabledTabindex}
        .option=${e}
        .conditionsUrl=${rt.__getConditionsUrl(e)}
      ></cards-upgrade-option>
    `}static __getConditionsUrl(e){var t;const i=((null==e?void 0:e.additionalInformation)||[]).find((({additionalInformationType:e})=>"WEB"===(null==e?void 0:e.id)));return null==i||null===(t=i.additionalInformationType)||void 0===t?void 0:t.url}get _renderEmptyOptions(){return h`
      <cards-upgrade-banner
        .disabledTabindex=${this.disabledTabindex}
        microillustration=${this.emptyOptionsMicroillustration}
        microillustration-size="XL"
        subtitle-text=${this.t("cards-upgrade-options-empty-state-text")}
        title-text=${this.t("cards-upgrade-options-empty-state-heading")}
      >
      </cards-upgrade-banner>
    `}set options(e){this._options=e||[]}get _renderOptionsByLength(){return{0:this._renderEmptyOptions,1:this._options.map(this.__renderOption.bind(this))}[this._options.length]}render(){return h`
      ${this._renderOptionsByLength}
    `}}class st extends(s(Fe(o(n)))){static get is(){return"options-step-content"}static get scopedElements(){const e=[rt,d];return st.scopedElementsFromClasses(e)}static get properties(){return{options:{type:Array},disabledTabindex:{type:Boolean,attribute:"disabled-tabindex"},emptyOptionsMicroillustration:{type:String,attribute:"empty-options-microillustration"}}}constructor(){super(),this.options=[],this.disabledTabindex=!1,this.emptyOptionsMicroillustration="emptystateday"}static get styles(){return[et,K.light,p("options-step-content-shared-styles")]}get _renderOptionsStepButton(){return this.options.length?h`
          <bbva-button-default
            tabindex=${this.disabledTabindex?"-1":"0"}
            data-step-button="options"
            variant="positive"
            @click=${()=>this.dispatchEvent(new CustomEvent("step-button-pressed",{bubbles:!0,composed:!0,detail:!0,cancelable:!0}))}
            .text="${this.t("cards-upgrade-multistep-button-text-contract")}"
          >
          </bbva-button-default>
        `:G}render(){return h`
      <cards-upgrade-list-options
        .language=${this.language}
        .disabledTabindex=${this.disabledTabindex}
        .options=${this.options}
        empty-options-microillustration=${u(this.emptyOptionsMicroillustration)}
      >
      </cards-upgrade-list-options>
      ${this._renderOptionsStepButton}
    `}}var ot=t`:host {
  display: flex;
  flex-direction: column;
}

section.credit-line {
  margin-top: var(--cards-upgrade-options-step-summary-credit-line-margin-top, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
}

[data-tag-name=cards-upgrade-option-fees] {
  padding: 0;
  width: 100%;
}

[data-tag-name=cards-upgrade-option-credit-line] {
  display: block;
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) 0 0 0;
}

hr[divider=small] {
  margin: var(--cards-upgrade-options-step-summary-small-divider-margin, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) 0);
}
`;class nt extends(s(Fe(o(n)))){static get is(){return"options-step-summary"}static get scopedElements(){const e=[j,A,T,Q,Xe,We];return nt.scopedElementsFromClasses(e)}static get properties(){return{option:{type:Object},_amount:{type:Number,state:!0},_currency:{type:String,state:!0},variant:{type:String}}}constructor(){super(),this.option={},this._amount=0,this._currency="",this.variant="3xl"}static get styles(){return[ee,ot,N.light,N.dark,$.light,$.dark,f.light,f.dark,Y.light,Y.dark,p("options-step-summary-shared-styles")]}set option(e){const t=this.option;this.__option=e,this.requestUpdate("option",t);const i=((null==e?void 0:e.grantedCredits)||[])[0];this._amount=null==i?void 0:i.amount,this._currency=null==i?void 0:i.currency}get option(){return this.__option}get _renderCardInfo(){var e,t,i;return h`
      <bbva-text ambient="dark" alignment="left" .text=${null===(e=this.option)||void 0===e?void 0:e.name} font-weight="500">
      </bbva-text>
      <bbva-clip-card
        .cardImage=${u(null===(t=((null===(i=this.option)||void 0===i?void 0:i.images)||[]).find((({id:e})=>"FRONT_CARD"===e)))||void 0===t?void 0:t.url)}
      >
      </bbva-clip-card>
    `}get _renderCreditLine(){return h`
      <cards-upgrade-option-credit-line
        .option=${this.option}
        .language="MXN"
        text="${this.t("cards-upgrade-option-detail-credit-line")}"
        textAlignment="left"
        iconColorBbvaUparrow="white"
        iconColorBbvaRightarrow="white"
        ambient="dark"
        variant=${this.variant}
      >
      </cards-upgrade-option-credit-line>
    `}get _fees(){var e;const t=this.t("cards-upgrade-info-CAT"),i=this.t("cards-upgrade-info-TASA");return Array.isArray(null===(e=this.option)||void 0===e?void 0:e.fees)?this.option.fees.map((e=>{const a={...e},{id:r}=a;return r===t&&(a.description=t),r===i&&(a.description=this.t("cards-upgrade-info-TASA-description").replace("<br>"," ")),a.helpIcon=!1,a})):[]}get _renderVisualContent(){return Object.keys(this.option).length?h`
          ${this._renderCardInfo} ${this._renderCreditLine} ${this._renderBenefits}
          <hr divider="small" />
          <cards-upgrade-option-fees
            .language=${this.language}
            .title="${this.t("cards-upgrade-option-fees-title-interest-rates")}"
            .fees=${this._fees}
            ambient="dark"
          >
          </cards-upgrade-option-fees>
        `:G}render(){return h`
      ${this._renderVisualContent}
    `}}const dt=new a;var lt=t`:host {
  box-sizing: border-box;
  display: flex;
  min-height: 1rem;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  --_notification-help-icon-color: var(--bbva-notification-help-dark-mode-icon-color, var(--bbva-notification-help-icon-color, var(--colorsPrimaryCoreDark, ${i(J.primaryCoreDark)})));
  --_notification-help-text-color: var(--bbva-notification-help-dark-mode-text-color, var(--bbva-notification-help-text-color, var(--colorsSecondary500, ${i(J.secondary500)})));
  --_notification-help-icon-color-alert: var(--bbva-notification-help-dark-mode-icon-color-alert, var(--bbva-notification-help-icon-color-alert, var(--colorsTertiaryType1Dark, ${i(J.tertiaryType1Dark)})));
  --_notification-help-text-color-alert: var(--bbva-notification-help-dark-mode-text-color-alert, var(--bbva-notification-help-text-color-alert, var(--colorsSecondary600, ${i(J.secondary600)})));
  --_notification-help-icon-color-success: var(--bbva-notification-help-dark-mode-icon-color-success, var(--bbva-notification-help-icon-color-success, var(--colorsTertiaryType6Dark, ${i(J.tertiaryType6Dark)})));
  --_notification-help-text-color-success: var(--bbva-notification-help-dark-mode-text-color-success, var(--bbva-notification-help-text-color-success, var(--colorsSecondary500, ${i(J.secondary500)})));
  --skeleton-quote-color: var(--bbva-notification-help-dark-mode-skeleton-quote-color, var(--bbva-notification-help-skeleton-color, var(--colorsSecondary200, ${i(J.secondary200)})));
  --skeleton-quote-bg: var(--bbva-notification-help-dark-mode-skeleton-bg, var(--bbva-notification-help-skeleton-bg, transparent));
}

:host([hidden]),
[hidden] {
  display: none !important;
}

:host([hide-top-padding]) {
  padding-top: 0;
}

:host([hide-bottom-padding]) {
  padding-bottom: 0;
}

:host([hide-left-padding]) {
  padding-left: 0;
}

:host([hide-right-padding]) {
  padding-right: 0;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.accessible-hide {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}

[data-tag-name=bbva-icon] {
  color: var(--_notification-help-icon-color);
  flex-shrink: 0;
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color);
  font-size: var(--bbva-notification-help-text-font-size, var(--typographyType3XSmall, ${i(te.type3XSmall)}));
  line-height: var(--bbva-notification-help-text-line-height, var(--lineHeightType3XSmall, ${i(ie.type3XSmall)}));
  margin: 0;
}

:host(.alert) [data-tag-name=bbva-icon] {
  color: var(--_notification-help-icon-color-alert);
}
:host(.alert) [data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color-alert);
}

:host(.success) [data-tag-name=bbva-icon] {
  color: var(--_notification-help-icon-color-success);
}
:host(.success) [data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color-success);
}

:host([loading]) {
  position: relative;
  top: 0;
  left: 0;
  display: inline-flex;
  width: 100%;
  pointer-events: none;
  background-repeat: no-repeat;
  will-change: transform;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
  background-image: linear-gradient(var(--skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: 16px 16px, calc((80px * 2) + (16px/ 2)) 16px;
  background-position: 0 0, 20px 0;
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
}

@keyframes pulse {
  0% {
    filter: opacity(100%);
  }
  50% {
    filter: opacity(60%);
  }
  100% {
    filter: opacity(100%);
  }
}
${dt.mediaRules()}`;var ct=t`[ambient^=light] {
  --bbva-notification-help-icon-color: initial;
  --bbva-notification-help-text-color: initial;
  --bbva-notification-help-icon-color-alert: initial;
  --bbva-notification-help-text-color-alert: initial;
  --bbva-notification-help-icon-color-success: initial;
  --bbva-notification-help-text-color-success: initial;
  --bbva-notification-help-skeleton-color: initial;
}
${(new a).mediaRules()}`;const pt=new a;const ht={dark:t`
    ${t`[ambient^=dark] {
  --bbva-notification-help-icon-color: var(--colorsPrimaryCoreLightened, ${i(J.primaryCoreLightened)});
  --bbva-notification-help-text-color: var(--colorsPrimaryCoreLightened, ${i(J.primaryCoreLightened)});
  --bbva-notification-help-icon-color-alert: var(--colorsPrimaryCoreLightened, ${i(J.primaryCoreLightened)});
  --bbva-notification-help-text-color-alert: var(--colorsPrimaryCoreLightened, ${i(J.primaryCoreLightened)});
  --bbva-notification-help-icon-color-success: var(--colorsPrimaryCoreLightened, ${i(J.primaryCoreLightened)});
  --bbva-notification-help-text-color-success: var(--colorsPrimaryCoreLightened, ${i(J.primaryCoreLightened)});
  --bbva-notification-help-skeleton-color: var(--colorsPrimaryCoreLight, ${i(J.primaryCoreLight)});
}
${pt.mediaRules()}`}
  `,light:t`
    ${ct}
  `};class ut extends(ae(o(re(n)))){static get is(){return"bbva-notification-help"}static get scopedElements(){return{"bbva-icon":X,"bbva-text":A}}static get properties(){return{accessibilityLabelIcon:{type:String,attribute:"accessibility-label-icon"},icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},text:{type:String},loading:{type:Boolean,reflect:!0},hideTopPadding:{type:Boolean,attribute:"hide-top-padding"},hideBottomPadding:{type:Boolean,attribute:"hide-bottom-padding"},hideLeftPadding:{type:Boolean,attribute:"hide-left-padding"},hideRightPadding:{type:Boolean,attribute:"hide-right-padding"}}}constructor(){super(),this.accessibilityLabelIcon="",this.icon="",this.iconSize=16,this.text="",this.loading=!1,this.hideTopPadding=!1,this.hideBottomPadding=!1,this.hideRightPadding=!1,this.hideLeftPadding=!1}static get styles(){return[super.styles,lt,ht.dark,ht.light,p("bbva-notification-help-shared-styles")]}render(){return h`
      <span class="accessible-hide" ?hidden="${!this.accessibilityLabelIcon}"
        >${this.accessibilityLabelIcon}</span
      >

      <bbva-icon aria-hidden="true" .icon="${this.icon}" .size="${this.iconSize}"> </bbva-icon>

      <bbva-text text=${this.text} unset></bbva-text>
    `}}q("colors.primarySubduedLight"),q("colors.cool20"),q("colors.tertiaryType1Light"),q("colors.primaryCoreLightened"),q("colors.tertiaryType6Light"),q("colors.cool20"),q("colors.cool50");const gt=new a;var mt=t`:host {
  --_form-radio-group-help-icon-color: var(--bbva-form-radio-group-dark-mode-help-icon-color, var(--bbva-form-radio-group-help-icon-color, var(--colorsPrimaryMedium, ${i(J.primaryMedium)})));
  --_form-radio-group-help-icon-active-color: var(--bbva-form-radio-group-dark-mode-help-icon-active-color, var(--bbva-form-radio-group-help-icon-active-color, var(--colorsPrimaryCore, ${i(J.primaryCore)})));
  --_form-radio-group-label-out-color: var(--bbva-form-radio-group-dark-mode-label-out-color, var(--bbva-form-radio-group-label-out-color, var(--colorsSecondary600, ${i(J.secondary600)})));
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

[data-tag-name=bbva-notification-help] {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}

.label-out {
  display: flex;
  align-items: center;
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}

.label-out-text {
  font-weight: var(--typographyTypeMedium, ${i(te.typeMedium)});
  color: var(--_form-radio-group-label-out-color);
}

[data-tag-name=bbva-link] {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  --bbva-link-with-icon-icon-color: var(--_form-radio-group-help-icon-color);
  --bbva-link-active-with-icon-icon-color: var(--_form-radio-group-help-icon-active-color);
}

:host([two-option]) {
  font-size: 0;
  position: relative;
  word-spacing: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}
:host([two-option]) .label-out {
  font-size: initial;
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  word-spacing: initial;
}
:host([two-option]) ::slotted(*) {
  display: inline-block;
  font-size: initial;
  word-spacing: initial;
}
${gt.mediaRules()}`;const bt=new a;var vt=t`[ambient^=dark] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimaryCoreLightened, ${i(J.primaryCoreLightened)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimarySubduedLight, ${i(J.primarySubduedLight)});
  --bbva-form-radio-group-label-out-color: var(--colorsPrimaryCoreLightened, ${i(J.primaryCoreLightened)});
}

[ambient=dark400] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimarySubdued, ${i(J.primarySubdued)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimaryMediumLight, ${i(J.primaryMediumLight)});
}
${bt.mediaRules()}`;var ft=t`[ambient^=light] {
  --bbva-form-radio-help-icon-color: initial;
  --bbva-form-radio-help-icon-active-color: initial;
  --bbva-form-radio-group-label-out-color: initial;
}
${(new a).mediaRules()}`;const yt={dark:t`
    ${vt}
    ${Ae.dark}
    ${v.dark}
    ${ht.dark}
    ${$.dark}
  `,light:t`
    ${ft}
    ${Ae.light}
    ${v.light}
    ${ht.light}
    ${$.light}
  `};class _t extends(ae(o(se(n)))){static get is(){return"bbva-form-radio-group"}static get scopedElements(){return{"bbva-form-radio-button":De,"bbva-notification-help":ut,"bbva-text":A,"bbva-link":E}}static get properties(){return{name:{type:String,reflect:!0},items:{type:Array},selected:{type:Number,reflect:!0},readonly:{type:Boolean},required:{type:Boolean},disabled:{type:Boolean},invalid:{type:Boolean,reflect:!0},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},twoOption:{type:String,reflect:!0,attribute:"two-option"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},labelOut:{type:String,attribute:"label-out"},helpIcon:{type:Boolean,attribute:"help-icon"},optionalLabel:{type:String,attribute:"optional-label"},linkHref:{type:String,attribute:"link-href"},linkAccessibilityText:{type:String,attribute:"link-accessibility-text"}}}constructor(){super(),this.items=[],this.selected=-1,this.errorIcon=oe(),this.errorIconSize=16,this.infoIcon=ne(),this.infoIconSize=16,this.name=`form-radio-group-${((e=10)=>`${Math.random().toString(36).substr(2,e)}`)()}`,this.optionalLabel="bbva-form-radio-group-optional-label",this.linkAccessibilityText="bbva-form-radio-group-link-accessibility-text"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.getAttribute("role")||this.setAttribute("role","radiogroup"),this.addEventListener("slotschanges",(e=>this._setRadioName(e)))}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("slotschanges",this._setRadioName())}_setRadioName(e){(((e||{}).detail||{}).contentSlots||[]).forEach((e=>{const t=(e||{}).assignedNodes;"bbva-form-radio-button"===(t.getAttribute("data-tag-name")||(t||{}).nodeName).toLowerCase()&&(t.name=this.name)}))}get radioItems(){return Array.from(this.querySelectorAll('[data-tag-name="bbva-form-radio-button"]'))}firstUpdated(e){super.firstUpdated&&super.firstUpdated(e),this._itemsContainer=this.shadowRoot.querySelector(".form-radio-group-container"),this._itemsContainer&&this.appendChild(this._itemsContainer.content),this.addEventListener("change",(e=>this._updateItems(e)))}updated(e){if(super.updated&&super.updated(e),e.has("selected")&&this.radioItems.length)if(Number.isFinite(this.selected)&&this.selected>-1&&this.selected<this.radioItems.length)this.radioItems[this.selected].checked=!0;else{const e=this.radioItems.find((e=>e.checked));e&&(e.checked=!1)}e.has("disabled")&&this.radioItems.length&&(this.setAttribute("aria-disabled",this.disabled.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].disabled=this.disabled}))),e.has("invalid")&&this.radioItems.length&&(this.setAttribute("aria-invalid",this.invalid.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].invalid=this.invalid}))),e.has("readonly")&&this.radioItems.length&&(this.setAttribute("aria-readonly",this.readonly.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].readonly=this.readonly}))),e.has("required")&&this.radioItems.length&&(this.setAttribute("aria-required",this.required.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].required=!1})),this.radioItems[0].required=!0)}_updateItems(e){const t=this.radioItems.indexOf(e.target);this.selected=t,this.invalid=!1,this.dispatchEvent(new CustomEvent("form-radio-group-item-change",{detail:{value:e.target.value,selected:t},bubbles:!0,composed:!0}))}_helpClicked(e){e.stopPropagation(),this.dispatchEvent(new CustomEvent("bbva-form-radio-group-help-click",{detail:!0,bubbles:!0,composed:!0}))}get _helpIcon(){return this.helpIcon?h`
        <bbva-link
          aria-label="${this.t(this.linkAccessibilityText)}"
          icon-size="24"
          @click="${this._helpClicked}"
          href="${u(this.linkHref)}"
          icon="${H()}"
        >
        </bbva-link>
      `:""}get _labelOut(){if(this.labelOut){const e=this.t(this.labelOut);return h`
        <div class="label-out">
          <bbva-text
            id="labelOutText"
            unset
            class="label-out-text"
            text="${this.required?e:`${e} ${this.t(this.optionalLabel)}`}"
            size="S"
          >
          </bbva-text>
          ${this._helpIcon}
        </div>
      `}return""}static get styles(){return[mt,p("bbva-form-radio-group-shared-styles"),yt.dark,yt.light]}render(){return h`
      ${this._labelOut}
      <slot></slot>
      <template class="form-radio-group-container">
        ${this.items.map((e=>h`
            <bbva-form-radio-button
              .name="${this.name}"
              .value="${e.value}"
              label="${e.label}"
              divider="${u(e.divider)}"
              ?disabled="${e.disabled}"
              ?checked="${e.checked}"
              ?required="${e.required}"
              ?label-medium="${e.labelMedium}"
              .errorIcon="${this.errorIcon}"
              .errorIconSize="${this.errorIconSize}"
              .errorMessage="${e.invalid?e.errorMessage:""}"
              .infoIcon="${this.infoIcon}"
              .infoIconSize="${this.infoIconSize}"
              .infoMessage="${e.infoMessage}"
              accessibility-icon-info-notification="${u(e.accessibilityIconInfo)}"
              accessibility-icon-alert-notification="${u(e.accessibilityIconAlert)}"
              variant="${u(e.variant)}"
            >
              ${e.text?de(e.text):e.label}
            </bbva-form-radio-button>
          `))}
      </template>
      ${this.invalid&&this.errorMessage?h`
            <bbva-notification-help
              class="alert"
              .icon="${this.errorIcon}"
              .iconSize="${this.errorIconSize}"
              .text="${this.errorMessage}"
              hide-top-padding
              hide-bottom-padding
              hide-left-padding
              hide-right-padding
            ></bbva-notification-help>
          `:""}
    `}}customElements.define(_t.is,_t);var xt=t`:host {
  display: flex;
  flex-direction: column;
  align-items: center;
  width: 100%;
}

[data-tag-name=bbva-form-radio-button] {
  width: 100%;
  margin-top: var(--cards-upgrade-delivery-step-radio-button-margin-top, calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
}

[data-tag-name=bbva-form-radio-group] {
  width: 100%;
}

[data-tag-name=bbva-button-default].delivery-button {
  margin-top: var(--cards-upgrade-delivery-step-button-margin-top, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
}

.step-title {
  align-self: normal;
  margin-top: var(--cards-upgrade-delivery-step-title-margin-top, calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
}

.upgrade-delivery-option-container {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1em);
}

.address-navigation-to-my-profile-container {
  margin-top: 16px;
}

section.address-container {
  margin: var(--cards-upgrade-delivery-step-address-container-margin, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) 0);
}
section .address-link {
  margin-top: var(--cards-upgrade-delivery-step-address-link-margin-top, calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
}
`;class $t extends(s(Fe(o(n)))){static get is(){return"delivery-step-content"}static get scopedElements(){const e=[d,De,_t,A,E,T,X,ut,S];return $t.scopedElementsFromClasses(e)}static get properties(){return{deliveries:{type:Array},loadingAddress:{type:Boolean,attribute:"loading-address"},unmaskedAddress:{type:Boolean,attribute:"unmasked-address"},disabledTabindex:{type:Boolean,attribute:"disabled-tabindex"},_selectedRadio:{type:Number,state:!0},iconInfo:{type:Object}}}constructor(){super(),this.deliveries=[],this.loadingAddress=!1,this.unmaskedAddress=!1,this.disabledTabindex=!1,this._selectedRadio=0,this.iconInfo=ne()}static get styles(){return[xt,K.light,v.light,f.light,$.light,Ae.light,yt.light,p("delivery-step-content-shared-styles")]}resetSelectedRadio(){this._selectedRadio=0}static __renderDeliveryOption(e){return h`
      <div class="upgrade-delivery-container">
        <bbva-text tag="span" ambient="light" alignment="left" .text=${null==e?void 0:e.name}> </bbva-text>
      </div>
    `}__renderDeliveryOptionWithRadio(e,t){const i=t===this.deliveries.length-1;return h`
      <div class="upgrade-delivery-option-container">
        <bbva-form-radio-button
          ?disabled-notification-help-tabindex=${this.disabledTabindex}
          .disabledTabindex=${this.disabledTabindex}
          .value=${null==e?void 0:e.id}
          name="radio"
          .infoMessage=${null==e?void 0:e.infoMessage}
          .accessibilityIconInfoNotification=${this.t("cards-upgrade-accessibility-delivery-info-notification")}
        >
          ${$t.__renderDeliveryOption(e)}
        </bbva-form-radio-button>
        ${null!=e&&e.address?this._renderAddress(e):G}
        ${i?G:h`
              <bbva-divider size="full"></bbva-divider>
            `}
      </div>
    `}_renderHomeDelivery(e){return h`
        <div
          style="align-self:normal"
        >
        <p style="color:#666666;margin-bottom:0px">
          ${this.t(`cards-upgrade-delivery-name-${null==e?void 0:e.id}`)}
        </p>
          ${this._renderAddress(e)}
        </div>
      `}get _renderHome(){return h`
    ${this._renderHomeDelivery(this.deliveries[0])}
    `}get _navigateToProfile(){return h`
        <bbva-notification-message
          class="address-navigation-to-my-profile-container"
          message="${this.t("cards-upgrade-address-information-update-message")}"
          link-title="${this.t("cards-upgrade-address-information-update-link-title")}"
          @notification-message-link-click="${()=>this._dispatchCustomEvent("navigate-to-my-profile-from-step-content")}"
        >
        </bbva-notification-message>
      `}_renderAddress(e){const t=null==e?void 0:e.id,i=t?t.toLowerCase():"";return h`
      <div class="address-container" slot="clip">
        <bbva-text
          ?loading=${this.loadingAddress}
          tag="span"
          text=${null==e?void 0:e.address}
          size="S"
          style="padding-left:8px;padding-bottom:16px;"
        ></bbva-text>
        <bbva-link
          .disabledTabindex=${this.disabledTabindex}
          ?disabled=${this.loadingAddress}
          class="address-link"
          @click="${()=>this._dispatchCustomEvent("card-upgrade-delivery-unmask-address")}"
        >
          ${this.t(`cards-upgrade-delivery-${this.unmaskedAddress?"mask":"unmask"}-address-${i}-button-text`)}
        </bbva-link>
      </div>
    `}_selectedListener(e){var t;e.stopPropagation(),this._selectedRadio=null==e||null===(t=e.detail)||void 0===t?void 0:t.selected,this._dispatchCustomEvent("cards-upgrade-delivery-selected-radio",this._selectedRadio)}_dispatchCustomEvent(e,t=!0,i=!0,a=!0){this.dispatchEvent(new CustomEvent(e,{bubbles:i,composed:a,detail:t,cancelable:!0}))}get _renderRadioGroup(){return h`
      <bbva-form-radio-group
        ambient="light"
        .selected="${this._selectedRadio}"
        @form-radio-group-item-change=${this._selectedListener}
      >
        ${this.deliveries.map(((e,t)=>this.__renderDeliveryOptionWithRadio(e,t)))}
      </bbva-form-radio-group>
    `}get _notificationHelp(){return h`
      <bbva-notification-help
        style="padding:0;padding-top:16px;"
        accessibility-label-icon="Info"
        icon=${this.iconInfo}
        text="Quien la reciba deberá mostrar su identificación oficial vigente."
      >
      </bbva-notification-help>
    `}get _renderDeliveryStepButton(){return h`
      <bbva-button-default
        tabindex=${this.disabledTabindex?"-1":"0"}
        class="delivery-button"
        data-step-button="delivery"
        @click=${()=>{var e;return this._dispatchCustomEvent("step-button-pressed",null===(e=this.deliveries[this._selectedRadio])||void 0===e?void 0:e.id)}}
        .text="${this.t("cards-upgrade-delivery-step-button-text")}"
      >
      </bbva-button-default>
    `}render(){return h`
      <bbva-text
        class="step-title"
        tag="span"
        .text=${this.t("cards-upgrade-delivery-step-title")}
      ></bbva-text>

      ${this._renderHome}
      ${this._notificationHelp}
      ${this._navigateToProfile}
      ${this._renderDeliveryStepButton}
    `}}var St=t`:host {
  display: block;
  box-sizing: border-box;
}

[data-tag-name=bbva-text].summary-title {
  --bbva-text-dark-mode-color: var(--colorsPrimarySubdued, ${i(J.primarySubdued)});
}
`;class Ct extends(s(Fe(o(n)))){static get is(){return"delivery-step-summary"}static get scopedElements(){const e=[A];return Ct.scopedElementsFromClasses(e)}static get properties(){return{selectedAddress:{type:Object,attribute:"selected-address"}}}constructor(){super(),this.selectedAddress={}}static get styles(){return[St,$.light,$.dark,p("delivery-step-summary-shared-styles")]}render(){var e,t,i;return h`
    <div style="display:flex;justify-content:space-between">
      <bbva-text
      ambient="dark"
      tag="span"
      alignment="left"
      .text=${null===(e=this.selectedAddress)||void 0===e?void 0:e.name}
      >
      </bbva-text>
      ${null!==(t=this.selectedAddress)&&void 0!==t&&t.address?h`
              <bbva-text
              ambient="dark"
              tag="span"
              alignment="right"
              .text=${null===(i=this.selectedAddress)||void 0===i?void 0:i.address}
              class="summary-address"
              >
            </bbva-text>
            `:G}
    </div>
    `}}var Tt=t`:host {
  display: flex;
  flex-direction: column;
  width: 100%;
}

[data-tag-name=bbva-button-default] {
  margin-top: var(--cards-upgrade-terms-step-content-bbva-button-default-margin-top, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
  align-self: center;
}

[data-tag-name=bbva-link] {
  margin-top: var(--cards-upgrade-terms-step-content-bbva-link-margin-top, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
}

[data-tag-name=bbva-form-checkbox] {
  margin-top: var(--cards-upgrade-terms-step-content-bbva-form-checkbox-margin-top, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
}

[data-tag-name=bbva-text].text-document {
  align-self: normal;
  margin-left: var(--cards-upgrade-terms-step-content-bbva-text-margin-left, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
}
`;class Et extends(s(Fe(o(n)))){static get is(){return"terms-step-content"}static get scopedElements(){const e=[A,E,pe,d];return Et.scopedElementsFromClasses(e)}static get properties(){return{documentName:{type:String,attribute:"document-name"},documentSize:{type:String,attribute:"document-size"},disabledTabindex:{type:Boolean,attribute:"disabled-tabindex"},checkBoxesConfig:{type:Array},_buttonEnabled:{type:Boolean,state:!0}}}constructor(){super(),this.documentName="",this.documentSize="",this.disabledTabindex=!1,this._buttonEnabled=!1,this.checkBoxesConfig=[]}static get styles(){return[Tt,$.light,v.light,le.light,K.light,p("terms-step-content-shared-styles")]}get _renderTermsDocument(){return h`
      <bbva-link
        ambient="light"
        ?disabled-tabindex=${this.disabledTabindex}
        icon=${ce()}
        @click=${()=>this._dispatchCustomEvent("cards-upgrade-request-document-click")}
        ><span>${this.documentName}</span></bbva-link
      >
      <bbva-text
        ambient-color="secondary500"
        font-style="italic"
        class="text-document"
        .text=${this.documentSize}
        size="S"
        tag="span"
        ambient="light"
      >
      </bbva-text>
    `}get _renderTermsAgreement(){return h`

      ${this.checkBoxesConfig?this.checkBoxesConfig.map((e=>h`
            <bbva-form-checkbox
              class="checkbox"
              id="checkbox-item-${e.id}"
              name="${e.name}"
              value="${e.value}"
              label="${this.t(e.label)}"
              ?checked=${e.checked}
              @change="${Et._changeCheckbox}"
              required
            >
            </bbva-form-checkbox>
          `)):G}
    `}static _changeCheckbox(){let e;e=document.querySelector("bbva-feature-top-credit-card"),null===e&&(e=document.querySelector("bbva-feature-top-credit-card-mx"));const t=e.shadowRoot.querySelector("#feature-container").querySelector("[data-tag-name=cards-upgrade-multi-step]").shadowRoot.querySelector("[data-tag-name=bbva-expandable-multistep]").querySelector("#terms-step"),i=t.querySelector("[data-tag-name=terms-step-content]").shadowRoot.querySelectorAll(".checkbox");let a=!0;i.forEach((e=>{e.checked||(a=!1)}));const r=t.querySelector("[data-tag-name=terms-step-content]").shadowRoot.querySelector("[data-tag-name=bbva-button-default]");a?r.removeAttribute("disabled"):(r.setAttribute("active",!1),r.setAttribute("disabled",!0),r.setAttribute("aria-disabled",!0))}get _renderTermsStepButton(){return h`
      <bbva-button-default
        data-step-button="terms"
        tabindex=${this.disabledTabindex?"-1":"0"}
        ?disabled=${!this._buttonEnabled}
        @click=${()=>this._dispatchCustomEvent("cards-upgrade-terms-complete")}
        .text="${this.t("cards-upgrade-multistep-button-text-continue")}"
      >
      </bbva-button-default>
    `}_dispatchCustomEvent(e,t=!0,i=!0,a=!0){this.dispatchEvent(new CustomEvent(e,{bubbles:i,composed:a,detail:t,cancelable:!0}))}render(){return h`
      <bbva-text
        text="${this.t("cards-upgrade-multistep-terms-conditions-description")}"
        tag="span"
      ></bbva-text>
      ${this._renderTermsDocument} ${this._renderTermsAgreement} ${this._renderTermsStepButton}
    `}}var kt=t`:host {
  display: block;
  box-sizing: border-box;
  --bbva-header-main-z-index: 2;
  margin-top: var(--cards-upgrade-multistep-margin-top, calc(((5.875 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
}

[data-tag-name=bbva-expandable-step] {
  --bbva-expandable-step-default-content-max-height: fit-content;
  --bbva-expandable-step-dark-mode-completed-step-border-color: var(--colorsPrimaryCoreLightened, ${i(J.primaryCoreLightened)});
}
[data-tag-name=bbva-expandable-step] .content {
  display: flex;
  flex-direction: column;
  align-items: center;
}

[data-tag-name=bbva-expandable-multistep] {
  display: block;
  box-sizing: border-box;
  background-color: var(--cards-upgrade-multistep-bbva-expandable-multistep-background-color, var(--colorsPrimaryCoreLightened, ${i(J.primaryCoreLightened)}));
  height: 90%;
}

[data-tag-name=bbva-progress-multistep-bar] {
  margin-bottom: 0;
  opacity: 1;
}
[data-tag-name=bbva-progress-multistep-bar].blur {
  opacity: 0;
  transition: opacity 0.3s linear;
  --bbva-progress-multistep-bar-height: 0;
}

[data-tag-name=bbva-button-default] {
  display: flex;
  max-width: min-content;
  margin: var(--cards-upgrade-multistep-bbva-button-default-margin, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) auto);
}

[data-tag-name=bbva-text].option-step-header {
  margin-bottom: var(--cards-upgrade-multistep-option-step-header-margin-bottom, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
}

.terms-summary-text {
  margin-left: var(--cards-upgrade-multistep-terms-summary-text-margin-left, calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
}

.terms-summary {
  display: flex;
  align-items: center;
}

.safe-header {
  display: flex;
  align-items: center;
  justify-content: center;
}
.safe-header .safe-header-color {
  color: var(--bbva-safe-header-text-light-color, var(--colorsSecondary500, ${i(J.secondary500)}));
}
.safe-header .safe-header-icon-margin {
  margin-right: 0.25em;
}

.safe-header-light {
  background-color: var(--bbva-safe-header-background-light-color, var(--colorsSecondary100, ${i(J.secondary100)}));
  display: flex;
  align-items: center;
  justify-content: center;
}
.safe-header-light .safe-header-color {
  color: var(--bbva-safe-header-text-light-color, var(--colorsSecondary500, ${i(J.secondary500)}));
}
.safe-header-light .safe-header-icon-margin {
  margin-right: 0.25em;
}

.safe-header-dark {
  background-color: var(--bbva-safe-header-background-dark-color, var(--colorsPrimaryCore, ${i(J.primaryCore)}));
  display: flex;
  align-items: center;
  justify-content: center;
}
.safe-header-dark .safe-header-color {
  color: var(--bbva-safe-header-text-dark-color, var(--colorsPrimaryCoreLightened, ${i(J.primaryCoreLightened)}));
}
.safe-header-dark .safe-header-icon-margin {
  margin-right: 0.25em;
}

.options-step {
  background-color: var(--bbva-safe-header-background-dark-color, var(--colorsSecondary200, ${i(J.secondary200)}));
}

.options-step[completed] {
  background-color: var(--bbva-safe-header-background-dark-color, var(--colorsPrimaryCore, ${i(J.primaryCore)}));
}
`;class At extends(s(Fe(ye(o(n))))){static get is(){return"cards-upgrade-multi-step"}static get scopedElements(){const e=[X,A,me,he,Re,d,st,nt,be,$t,Ct,Et];return At.scopedElementsFromClasses(e)}static get properties(){return{card:{type:Object},upgradeOptions:{type:Array,attribute:"upgrade-options"},selectedOption:{type:Object,attribute:"selected-option"},userAddresses:{type:Array,attribute:"user-address"},barProgress:{type:Number,attribute:"bar-progress"},loadingAddress:{type:Boolean,attribute:"loading-address"},unmaskedAddress:{type:Boolean,attribute:"unmasked-address"},emptyOptionsMicroillustration:{type:String,attribute:"empty-options-microillustration"},enableSafeEnviromentFeedback:{type:Boolean,attribute:"enable-safe-environment-feedback"},_selectedAddress:{type:Object,state:!0},_hideProgressBar:{type:Boolean,state:!0},_stepsToReset:{type:Array,state:!0},_disabledOptionsTabindex:{type:Boolean,state:!0},_disabledTermsTabindex:{type:Boolean,state:!0},_disabledDeliveryTabindex:{type:Boolean,state:!0},_changeSafeEnviromentFeedbackBackground:{type:Boolean,state:!0},_currentStep:{type:Number,attribute:!1},_firstStep:{type:Number,attribute:!1},totalSteps:{type:Number,attribute:!1}}}constructor(){super(),this.card={},this.barProgress=0,this.upgradeOptions=[],this.selectedOption={},this.userAddresses=[],this.loadingAddress=!1,this.unmaskedAddress=!1,this.emptyOptionsMicroillustration="emptystateday",this.config={faqs:!0,header:{position:"fixed",text:this.t("cards-upgrade-header-title"),iconRightPrimary:V(),accessibilityTextIconRightSecondary:this.t("cards-upgrade-accessibility-help-button"),accessibilityTextIconRightPrimary:this.t("cards-upgrade-accessibility-close-button"),variant:"modal"}},this._selectedAddress={},this._hideProgressBar=!1,this._stepsToReset=[],this._disabledOptionsTabindex=!1,this._disabledTermsTabindex=!1,this._disabledDeliveryTabindex=!1,this._changeSafeEnviromentFeedbackBackground=!1,this._currentStep=-1,this._firstStep=-1,this.totalSteps=3}update(e){super.update(e),e.has("_currentStep")&&(this._allStepsCompleted||this._currentStep>=0)&&this._dispatchCustomEvent(this._allStepsCompleted?"cards-upgrade-all-steps-completed":"cards-upgrade-current-step",{step:this._currentStep})}get __optionsStepHeaderText(){const{alias:e,number:t}=this.card;return`${this.t("cards-upgrade-select-upgrade-text")} ${At._capitalize(e)} ${At.__getFormattedAccountNumber(t)}\n      ${this.t("cards-upgrade-select-upgrade-text-2")}`}static _capitalize(e){if("ipn bbva"===e.toLowerCase())return e.toUpperCase();const t=e.split(" "),i=2===t.length?t[1]:void 0,a=void 0!==i?`${t[0].toLowerCase()} ${i}`:t[0].toLowerCase();return a.charAt(0).toUpperCase()+a.slice(1)}static __getFormattedAccountNumber(e){return`•${null==e?void 0:e.slice(-4)}`}get _allSteps(){return(this.__allSteps||[]).length||(this.__allSteps=[...this.shadowRoot.querySelectorAll(`[data-tag-name="${he.is}"]`)],-1===this._firstStep&&(this._firstStep=this.__allSteps.reduce(((e,t,i)=>t.completed?i:e),-1)+1,this._currentStep=this._firstStep)),this.__allSteps}static get styles(){return[kt,z.light,$.light,K.light,ue.light,p("cards-upgrade-multi-step-shared-styles")]}_onSelectedOption({ev:e,completeStep:t=!1}){e.stopPropagation(),this._dispatchCustomEvent(t?"option-selected":"show-option-detail",null==e?void 0:e.detail)}_onSelectedDeliveryOption(e){e.stopPropagation(),this._selectedAddress=this.userAddresses.find((({id:t})=>t===(null==e?void 0:e.detail))),this.shadowRoot.getElementById("delivery-step").completed=!0,this._dispatchCustomEvent("delivery-option-selected",this._selectedAddress)}get _renderOptionStepContent(){return h`
    ${this.upgradeOptions.length?h`
              <bbva-text
                class="option-step-header"
                size="S"
                tag="span"
                text="${this.__optionsStepHeaderText}"
              ></bbva-text>
            `:G}
      <div class="content">
        <options-step-content
          .language=${this.language}
          .disabledTabindex=${this._disabledOptionsTabindex}
          .options=${this.upgradeOptions}
          empty-options-microillustration=${this.emptyOptionsMicroillustration}
          @cards-upgrade-option-button-click=${e=>this._onSelectedOption({ev:e})}
          @step-button-pressed=${e=>this._onSelectedOption({ev:e,completeStep:!0})}
        >
        </options-step-content>
      </div>
      <div class="summary" slot="summary">
        <options-step-summary
          .option=${this.selectedOption}
          .language=${this.language}
        ></options-step-summary>
      </div>
    `}get _renderDeliveryStepContent(){return h`
      <div class="content">
        ${this.userAddresses.length?h`
              <delivery-step-content
                .disabledTabindex=${this._disabledDeliveryTabindex}
                .loadingAddress=${this.loadingAddress}
                .unmaskedAddress=${this.unmaskedAddress}
                .deliveries=${this.userAddresses}
                @step-button-pressed=${this._onSelectedDeliveryOption}
              >
              </delivery-step-content>
            `:G}
      </div>
      <div class="summary" slot="summary">
        <delivery-step-summary ambient="dark" .selectedAddress=${this._selectedAddress}>
        </delivery-step-summary>
      </div>
    `}get _renderTermsStepContent(){var e,t,i,a,r;return h`
      <div class="content">
        <terms-step-content
          ambient="light"
          .disabledTabindex=${this._disabledTermsTabindex}
          .documentName=${null===(e=this.selectedOption)||void 0===e||null===(t=e.document)||void 0===t?void 0:t.name}
          document-size=${null===(i=this.selectedOption)||void 0===i||null===(a=i.document)||void 0===a?void 0:a.size}
          .checkBoxesConfig="${null===(r=this.selectedOption)||void 0===r?void 0:r.termsAndConditionsList}"
        >
        </terms-step-content>
      </div>
      <div class="summary" slot="summary">
        <div class="terms-summary">
          <bbva-icon icon=${ge()}></bbva-icon>
          <bbva-text
            font-style="italic"
            text-color="primaryCoreLightened"
            font-weight="500"
            class="terms-summary-text"
            text="${this.t("cards-upgrade-multistep-terms-conditions-summary-label")}"
            tag="span"
          ></bbva-text>
        </div>
      </div>
    `}get _renderOptionsStep(){return h`
      <bbva-expandable-step
        id="options-step"
        class="options-step"
        header="${this.t("cards-upgrade-multistep-first-step")}"
        current-step-label="${this.t("cards-upgrade-multistep-step-label",{step:this._currentStep+1,total:this.totalSteps})}"
        edit-label="${this.upgradeOptions.length>1?this.t("cards-upgrade-multistep-options-step-edit-label"):this.t("cards-upgrade-multistep-terms-step-edit-label")}"
        hide-padding-top
        @expandable-step-edit-step=${({detail:e})=>this._setBarProgress(e)}
        @expandable-step-complete-change=${this._handleOptionsStepCompleted}
      >
        ${this._renderOptionStepContent}
      </bbva-expandable-step>
    `}_handleOptionsStepCompleted({detail:e}){this._manageProgressBar(0),this._currentStep=e?1:this._currentStep,this._disabledOptionsTabindex=e}get _renderDeliverStep(){return h`
      <bbva-expandable-step
        id="delivery-step"
        header="${this.t("cards-upgrade-multistep-second-step")}"
        current-step-label="${this.t("cards-upgrade-multistep-step-label",{step:this._currentStep+1,total:this.totalSteps})}"
        edit-label="${this.t("cards-upgrade-multistep-delivery-step-edit-label")}"
        @expandable-step-edit-step=${({detail:e})=>this._setBarProgress(e)}
        @expandable-step-complete-change=${this._handleDeliveryStepCompleted}
      >
        ${this._renderDeliveryStepContent}
      </bbva-expandable-step>
    `}_handleDeliveryStepCompleted({detail:e}){this._manageProgressBar(1),this._currentStep=e?2:this._currentStep,this._disabledDeliveryTabindex=e}get _renderTermsStep(){return h`
      <bbva-expandable-step
        id="terms-step"
        header="${this.t("cards-upgrade-multistep-third-step")}"
        current-step-label="${this.t("cards-upgrade-multistep-step-label",{step:this._currentStep+1,total:this.totalSteps})}"
        edit-label="${this.t("cards-upgrade-multistep-terms-step-edit-label")}"
        @expandable-step-edit-step=${({detail:e})=>this._setBarProgress(e)}
        @expandable-step-complete-change=${this._handleTermsStepCompleted}
      >
        ${this._renderTermsStepContent}
      </bbva-expandable-step>
    `}_handleTermsStepCompleted({detail:e}){this._manageProgressBar(2),this._currentStep=e?3:this._currentStep,this._disabledTermsTabindex=e}get _summaryButton(){return h`
      <bbva-button-default
        class="summary-button"
        variant="positive"
        @click=${()=>{var e;return this._dispatchCustomEvent("multistep-button-pressed",null===(e=this.selectedOption)||void 0===e?void 0:e.id)}}
        .text="${this.t("cards-upgrade-multistep-summary-button-label")}"
      >
      </bbva-button-default>
    `}completeOptionsStep(){this.shadowRoot.getElementById("options-step").completed=!0}completeTermsStep(){this.shadowRoot.getElementById("terms-step").completed=!0}get _firstIncompletedStep(){return this._allSteps.filter((e=>!e.completed))[0]}get _allStepsCompleted(){if(0!==this._allSteps.length){const e=this._allSteps.every((({completed:e})=>!!e));return this._hideProgressBar=e,e&&(this._currentStep=3),e}return!1}_manageProgressBar(e){if(this._allStepsCompleted)this.barProgress=100;else{const t=this._allSteps.findIndex((({id:e})=>{var t;return e===(null===(t=this._firstIncompletedStep)||void 0===t?void 0:t.id)})),i=-1!==t?t:e;this._changeSafeEnviromentFeedbackBackground=0!==i,this._setBarProgress(i)}}_setBarProgress(e){this._currentStep=e,this.barProgress=100/3*(e+1)}get _renderProgressBar(){return h`
      <bbva-progress-multistep-bar
        ambient="light"
        .accessibilityText=${this.t("cards-upgrade-accessibility-progress-bar")}
        class=${g({blur:this._hideProgressBar})}
        .value="${this.barProgress}"
        no-margin
      >
      </bbva-progress-multistep-bar>
    `}render(){return h`
      ${super.render()} ${this._renderProgressBar}
      <bbva-expandable-multistep
        hide-guillotine-animation
        hide-disabled-steps
        has-animation
        class="scrollable"
        .stepsToReset="${this._stepsToReset}"
        step-selector="[data-tag-name=bbva-expandable-step]"
      >
        ${this._renderOptionsStep} ${this._renderDeliverStep} ${this._renderTermsStep}
        ${this._allStepsCompleted?this._summaryButton:G}
      </bbva-expandable-multistep>
    `}}class Dt extends(s(Fe(o(n)))){static get is(){return"cards-upgrade-info"}static get scopedElements(){const e=[l,Ze];return Dt.scopedElementsFromClasses(e)}static get properties(){return{visible:{type:Boolean},modalConfig:{type:Object,attribute:"modal-config"}}}constructor(){super(),this.visible=!1,this.modalConfig={}}get _panelContent(){var e,t,i,a,r,s,o;return null!==(e=this.modalConfig)&&void 0!==e&&e.panel?h`
          <cards-upgrade-banner
            slot="slot-content"
            microillustration-size="L"
            .microillustration=${null===(t=this.modalConfig)||void 0===t||null===(i=t.panel)||void 0===i?void 0:i.microillustration}
            title-text=${null===(a=this.modalConfig)||void 0===a||null===(r=a.panel)||void 0===r?void 0:r.heading}
            subtitle-text=${null===(s=this.modalConfig)||void 0===s||null===(o=s.panel)||void 0===o?void 0:o.text}
          >
          </cards-upgrade-banner>
        `:G}get _helpModal(){var e;return h`
    <bbva-text
      id="description-text"
      .text=${this.t(null===(e=this.modalConfig)||void 0===e?void 0:e.bodyText)}
      alignment="center"
      size="S"
      >
    </bbva-text>`}get _renderModal(){var e,t,i,a,r,s,o,n,d,l;return h`
      <bbva-help-modal
        ambient="light"
        hide-content-padding-top
        .accessibilityTextIconRightSecondary=${this.t("cards-upgrade-accessibility-help-button")}
        .accessibilityTextIconRightPrimary=${this.t("cards-upgrade-accessibility-close-button")}
        .bodyText=${this._helpModal}
        .buttonText=${this.t(null===(e=this.modalConfig)||void 0===e?void 0:e.buttonText)}
        .headerType=${null===(t=this.modalConfig)||void 0===t?void 0:t.headerType}
        .headerText=${this.t(null===(i=this.modalConfig)||void 0===i?void 0:i.headerText)}
        .linkText=${this.t(null===(a=this.modalConfig)||void 0===a?void 0:a.linkText)}
        .titleText=${this.t(null===(r=this.modalConfig)||void 0===r?void 0:r.titleText)}
        .modalType=${null===(s=this.modalConfig)||void 0===s?void 0:s.modalType}
        .titleIcon=${null===(o=this.modalConfig)||void 0===o?void 0:o.titleIcon}
        aria-label=${this.t(null===(n=this.modalConfig)||void 0===n?void 0:n.headerText)}
        ?fixed-footer=${null===(d=this.modalConfig)||void 0===d?void 0:d.fixedFooter}
        ?full-height=${null===(l=this.modalConfig)||void 0===l?void 0:l.fullHeight}
        ?visible=${this.visible}
        @visible-changed=${({detail:e})=>this.dispatchEvent(new CustomEvent((e?"push":"pop")+"-stack-element",{bubbles:!0,composed:!0,detail:this,cancelable:!0}))}
      >
        ${this._panelContent}
      </bbva-help-modal>
    `}render(){return h`
      ${this._renderModal}
    `}}class Rt extends(s(Fe(o(n)))){static get is(){return"cards-upgrade-error"}static get scopedElements(){const e=[l,Ze];return Rt.scopedElementsFromClasses(e)}static get properties(){return{visible:{type:Boolean},modalConfig:{type:Object,attribute:"modal-config"}}}constructor(){super(),this.visible=!1,this.modalConfig={}}get _panelContent(){var e,t,i,a,r,s,o;return null!==(e=this.modalConfig)&&void 0!==e&&e.panel?h`
          <cards-upgrade-banner
            slot="slot-content"
            microillustration-size="L"
            .microillustration=${null===(t=this.modalConfig)||void 0===t||null===(i=t.panel)||void 0===i?void 0:i.microillustration}
            title-text=${null===(a=this.modalConfig)||void 0===a||null===(r=a.panel)||void 0===r?void 0:r.heading}
            subtitle-text=${null===(s=this.modalConfig)||void 0===s||null===(o=s.panel)||void 0===o?void 0:o.text}
          >
          </cards-upgrade-banner>
        `:G}get _renderModal(){var e,t,i,a,r,s,o,n,d,l,c,p,u,g,m,b,v,f;return h`
      <bbva-help-modal
        ambient="light"
        .accessibilityTextIconRightPrimary=${this.t("cards-upgrade-accessibility-close-button")}
        icon-right-primary=${V()}
        icon-right-secondary=${null===(e=this.modalConfig)||void 0===e?void 0:e.iconRightSecondary}
        .bodyText=${this.t(null===(t=this.modalConfig)||void 0===t?void 0:t.bodyText)}
        .buttonText=${this.t(null===(i=this.modalConfig)||void 0===i?void 0:i.buttonText)}
        .headerType=${null===(a=this.modalConfig)||void 0===a?void 0:a.headerType}
        .headerText=${this.t(null===(r=this.modalConfig)||void 0===r?void 0:r.headerText)}
        .linkText=${this.t(null===(s=this.modalConfig)||void 0===s?void 0:s.linkText)}
        .titleText=${this.t(null===(o=this.modalConfig)||void 0===o?void 0:o.titleText)}
        .modalType=${null===(n=this.modalConfig)||void 0===n?void 0:n.modalType}
        .titleIcon=${null===(d=this.modalConfig)||void 0===d?void 0:d.titleIcon}
        .closeModalElements=${(null===(l=this.modalConfig)||void 0===l?void 0:l.closeModalElements)||["footer-button","footer-link","header-right-primary"]}
        aria-label=${this.t(null===(c=this.modalConfig)||void 0===c?void 0:c.headerText)}
        ?fixed-footer=${null===(p=this.modalConfig)||void 0===p?void 0:p.fixedFooter}
        ?full-height=${null===(u=this.modalConfig)||void 0===u?void 0:u.fullHeight}
        ?visible=${this.visible}
        hide-content-padding-top
        @header-main-icon-right-primary-click=${null===(g=this.modalConfig)||void 0===g?void 0:g.headerPrimaryClick}
        @help-modal-header-right-secondary-click=${null===(m=this.modalConfig)||void 0===m?void 0:m.headerSecondaryClick}
        @help-modal-footer-button-click=${null===(b=this.modalConfig)||void 0===b?void 0:b.footerButtonClick}
        @help-modal-veil-click=${null===(v=this.modalConfig)||void 0===v?void 0:v.veilClick}
        @help-modal-footer-link-click=${null===(f=this.modalConfig)||void 0===f?void 0:f.footerLinkClick}
        @visible-changed=${({detail:e})=>this.dispatchEvent(new CustomEvent((e?"push":"pop")+"-stack-element",{bubbles:!0,composed:!0,detail:this}))}
      >
        ${this._panelContent}
      </bbva-help-modal>
    `}render(){return h`
      ${this._renderModal}
    `}}var Ot=t`:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--colorsPrimaryCoreLightened, ${i(J.primaryCoreLightened)});
  overflow: scroll;
  height: 100%;
  --bbva-header-main-z-index: 2;
}

.main-container {
  margin-top: var(--cards-upgrade-success-main-container-margin-top, calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
  display: flex;
  flex-direction: column;
}

[data-tag-name=cards-upgrade-banner] {
  padding: var(--cards-upgrade-success-banner-margin, 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1em));
}

[data-tag-name=cards-upgrade-option-fees] {
  margin-bottom: var(--cards-upgrade-success-option-fees, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
}

[data-tag-name=bbva-notification-message].term-notification {
  margin: var(--cards-upgrade-success-term-notification-margin, 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
}
[data-tag-name=bbva-notification-message].email-notification {
  margin: var(--cards-upgrade-success-email-notification-success, 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
}

[data-tag-name=bbva-button-default] {
  align-self: center;
  margin-bottom: var(--cards-upgrade-success-button-margin-bottom, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
}
`;class It extends(s(Fe(ye(o(n))))){static get is(){return"cards-upgrade-success"}static get scopedElements(){const e=[Re,A,d,Ze,Xe,S];return It.scopedElementsFromClasses(e)}static get properties(){return{successResponse:{type:Object,attribute:"success-response"},userEmail:{type:String,attribute:"user-email"}}}constructor(){super(),this.successResponse={},this.userEmail="",this.config={fixedHeader:!0,header:{position:"fixed",text:this.t("cards-upgrade-header-title"),iconRightPrimary:V(),accessibilityTextIconRightPrimary:this.t("cards-upgrade-header-close"),variant:"modal"}}}static get styles(){return[Ot,$.light,K.light,p("cards-upgrade-success-shared-styles")]}get _heading(){return h`
      <cards-upgrade-banner
        ambient="light"
        microillustration="success"
        title-text=${this.t("cards-upgrade-success-title")}
        subtitle-text=${this.t("cards-upgrade-success-description")}
      >
      </cards-upgrade-banner>
    `}get _cardInfo(){var e;return this._renderList({title:"cards-upgrade-success-card-info-title",fees:null===(e=this.successResponse)||void 0===e?void 0:e.cardInfo,dataSelector:"cards-upgrade-success-card-info-section"})}get _fees(){return this._renderList({title:"cards-upgrade-success-fees-title",fees:this._feesHideIcon,dataSelector:"cards-upgrade-success-fees-section"})}get _delivery(){var e;return this._renderList({title:"cards-upgrade-success-delivery-title",fees:null===(e=this.successResponse)||void 0===e?void 0:e.delivery,dataSelector:"cards-upgrade-success-delivery-section"})}get _feesHideIcon(){var e;const t=this.t("cards-upgrade-info-CAT"),i=this.t("cards-upgrade-info-annuity"),a=this.t("cards-upgrade-info-TASA");return Array.isArray(null===(e=this.successResponse)||void 0===e?void 0:e.fees)?this.successResponse.fees.map((e=>{const r={...e},{id:s}=r;return s===t&&(r.description=this.t("cards-upgrade-info-CAT")),s===i&&(r.description=this.t("cards-upgrade-info-annuity-description").replace("<br>"," ")),s===a&&(r.description=this.t("cards-upgrade-info-TASA-description").replace("<br>"," ")),r.helpIcon=!1,r})):[]}_renderList({title:e,fees:t,dataSelector:i}){return h`
      <cards-upgrade-option-fees
        .language=${this.language}
        data-selector=${i}
        .title=${this.t(e)}
        .fees=${t}
        ambient="light"
      >
      </cards-upgrade-option-fees>
    `}get _renderTermNotification(){return h`
      <bbva-notification-message
        class="term-notification"
        data-selector="cards-upgrade-success-term-notification"
      >
        ${this.t("cards-upgrade-success-term-notification-description")}
      </bbva-notification-message>
    `}get _renderEmailNotification(){return h`
      <bbva-notification-message
        class="email-notification"
        data-selector="cards-upgrade-success-email-notification"
      >
        ${this.t("cards-upgrade-success-email-notification-description")}
        <br><br>
        ${this.t("cards-upgrade-success-email-notification-second-description")}
        <bbva-text
          ambient="light"
          alignment="center"
          .text=${this.userEmail}
          font-weight="500"
          size="S"
        ></bbva-text>
      </bbva-notification-message>
    `}get _renderButton(){return h`
      <bbva-button-default
        @click=${()=>this._dispatchCustomEvent("success-page-button-pressed")}
        .text="${this.t("cards-upgrade-success-button-label")}"
      >
      </bbva-button-default>
    `}render(){return h`
      ${super.render()}
      <div class="main-container">
        ${this._heading} ${this._cardInfo} ${this._fees} ${this._delivery}
        ${this._renderTermNotification} ${this._renderEmailNotification} ${this._renderButton}
      </div>
    `}}const wt=({footerLinkClick:e,headerPrimaryClick:t,headerSecondaryClick:i,footerButtonClick:a,veilClick:r})=>({NOT_REGISTERED_EMAIL:{bodyText:"cards-upgrade-error-not-registered-email-text",fixedFooter:!0,footerButtonClick:a,fullHeight:!0,headerPrimaryClick:t,headerSecondaryClick:i,headerType:"modal",headerText:"cards-upgrade-header-title-modal",buttonText:"cards-upgrade-error-not-registered-email-primary-button-text",modalType:"info",titleIcon:ve(),closeModalElements:["header-right-primary","footer-button"]},NOT_REGISTERED_ADDRESS:{bodyText:"cards-upgrade-error-not-registered-address-text",fixedFooter:!0,footerButtonClick:a,fullHeight:!0,headerPrimaryClick:t,headerSecondaryClick:i,headerType:"modal",headerText:"cards-upgrade-header-title-modal",buttonText:"cards-upgrade-error-not-registered-address-primary-button-text",modalType:"info",titleIcon:ve(),closeModalElements:["header-right-primary","footer-button"]},FLOW_NOT_AVAILABLE:{titleText:"",bodyText:"cards-upgrade-flow-not-available-text",fixedFooter:!0,footerButtonClick:a,fullHeight:!0,headerPrimaryClick:t,headerSecondaryClick:i,headerType:"modal",headerText:"cards-upgrade-header-title-modal",buttonText:"cards-upgrade-flow-not-available-primary-button-text",modalType:"info",titleIcon:ve(),closeModalElements:["header-right-primary","footer-button"]},GETOFFER_RETRY:{titleText:"cards-upgrade-get-offer-detail-error-retry-title-text",bodyText:"cards-upgrade-get-offer-detail-error-retry-text",buttonText:"cards-upgrade-get-offer-detail-error-retry-primary-button-text",linkText:"cards-upgrade-get-offer-detail-error-retry-secondary-button-text",footerButtonClick:a,footerLinkClick:e,veilClick:r,fullHeight:!1,hideContentPaddingTop:!0,modalType:"warning",titleIcon:oe(),closeModalElements:["footer-button","footer-link"]},GETOFFER_EXIT:{buttonText:"cards-upgrade-get-offer-detail-error-exit-button-text",fixedFooter:!0,footerButtonClick:a,fullHeight:!0,headerPrimaryClick:t,headerType:"modal",headerText:"cards-upgrade-header-title-modal",modalType:"warning",closeModalElements:["header-right-primary","footer-button"],panel:{microillustration:"error",heading:"cards-upgrade-get-offer-detail-error-exit-title-text",text:"cards-upgrade-get-offer-detail-error-exit-text"},iconRightSecondary:H(),headerSecondaryClick:i},GETDOCUMENTS_RETRY:{buttonText:"cards-upgrade-get-documents-error-retry-primary-button-text",fixedFooter:!0,linkText:"cards-upgrade-get-documents-error-retry-secondary-button-text",footerLinkClick:e,footerButtonClick:a,fullHeight:!0,headerPrimaryClick:t,headerType:"modal",headerText:"cards-upgrade-header-title-modal",modalType:"warning",closeModalElements:["header-right-primary","footer-button","footer-link"],panel:{microillustration:"error",heading:"cards-upgrade-get-documents-error-retry-title",text:"cards-upgrade-get-documents-error-retry-text"},iconRightSecondary:H(),headerSecondaryClick:i},GETDOCUMENTS_EXIT:{buttonText:"cards-upgrade-get-documents-error-exit-button-text",fixedFooter:!0,footerButtonClick:a,fullHeight:!0,headerPrimaryClick:t,headerType:"modal",headerText:"cards-upgrade-header-title-modal",modalType:"warning",closeModalElements:["header-right-primary","footer-button"],panel:{microillustration:"error",heading:"cards-upgrade-get-documents-error-exit-title-text",text:"cards-upgrade-get-documents-error-exit-text"},iconRightSecondary:H(),headerSecondaryClick:i},GETADDRESSES_RETRY:{titleText:"cards-upgrade-get-addresses-error-retry-title",bodyText:"cards-upgrade-get-addresses-error-retry-text",buttonText:"cards-upgrade-get-addresses-error-retry-primary-button-text",linkText:"cards-upgrade-get-addresses-error-retry-secondary-button-text",footerButtonClick:a,footerLinkClick:e,veilClick:r,fullHeight:!1,hideContentPaddingTop:!0,modalType:"warning",titleIcon:oe(),closeModalElements:["footer-button","footer-link"]},GETADDRESSES_EXIT:{buttonText:"cards-upgrade-get-addresses-error-exit-button-text",fixedFooter:!0,footerButtonClick:a,fullHeight:!0,headerPrimaryClick:t,headerType:"modal",headerText:"cards-upgrade-header-title-modal",modalType:"warning",closeModalElements:["header-right-primary","footer-button"],panel:{microillustration:"error",heading:"cards-upgrade-get-addresses-error-exit-title-text",text:"cards-upgrade-get-addresses-error-exit-text"},iconRightSecondary:H(),headerSecondaryClick:i},GETADDRESSES_STEP_RETRY:{titleText:"cards-upgrade-get-addresses-step-error-retry-title",bodyText:"cards-upgrade-get-addresses-step-error-retry-text",buttonText:"cards-upgrade-get-addresses-step-error-retry-primary-button-text",linkText:"cards-upgrade-get-addresses-step-error-retry-secondary-button-text",footerButtonClick:a,footerLinkClick:e,veilClick:r,fullHeight:!1,hideContentPaddingTop:!0,modalType:"warning",titleIcon:oe(),closeModalElements:["footer-button","footer-link"]},GETADDRESSES_STEP_EXIT:{buttonText:"cards-upgrade-get-addresses-step-error-exit-secondary-button-text",fixedFooter:!0,footerButtonClick:a,fullHeight:!0,headerPrimaryClick:t,headerType:"modal",headerText:"cards-upgrade-header-title-modal",modalType:"warning",closeModalElements:["header-right-primary","footer-button"],panel:{microillustration:"error",heading:"cards-upgrade-get-addresses-step-error-exit-title",text:"cards-upgrade-get-addresses-step-error-exit-text"},iconRightSecondary:H(),headerSecondaryClick:i},POSTUPGRADECARD_RETRY:{titleText:"cards-upgrade-post-upgrade-card-error-retry-title-text",bodyText:"cards-upgrade-post-upgrade-card-error-retry-text",buttonText:"cards-upgrade-post-upgrade-card-error-retry-primary-button-text",linkText:"cards-upgrade-post-upgrade-card-error-retry-secondary-button-text",footerButtonClick:a,footerLinkClick:e,veilClick:r,fullHeight:!1,hideContentPaddingTop:!0,modalType:"warning",titleIcon:oe(),closeModalElements:["footer-button","footer-link"]},POSTUPGRADECARD_EXIT:{buttonText:"cards-upgrade-post-upgrade-card-error-exit-button-text",fixedFooter:!0,footerButtonClick:a,fullHeight:!0,headerPrimaryClick:t,headerType:"modal",headerText:"cards-upgrade-header-title-modal",modalType:"warning",closeModalElements:["header-right-primary","footer-button"],panel:{microillustration:"error",heading:"cards-upgrade-post-upgrade-card-error-exit-title-text",text:"cards-upgrade-post-upgrade-card-error-exit-text"},iconRightSecondary:H(),headerSecondaryClick:i},POSTUPGRADECARD_ERROR:{buttonText:"cards-upgrade-post-upgrade-card-error-primary-button-text",fixedFooter:!0,footerButtonClick:a,fullHeight:!0,headerPrimaryClick:t,headerType:"modal",headerText:"cards-upgrade-header-title-modal",modalType:"warning",closeModalElements:["header-right-primary","footer-button"],panel:{microillustration:"error",heading:"cards-upgrade-post-upgrade-card-error-title",text:"cards-upgrade-post-upgrade-card-error-text"},iconRightSecondary:H(),headerSecondaryClick:i},POSTUPGRADECARD_PROCCESS:{buttonText:"cards-upgrade-post-upgrade-card-process-error-primary-button-text",fixedFooter:!0,footerButtonClick:a,fullHeight:!0,headerPrimaryClick:t,headerType:"modal",headerText:"cards-upgrade-header-title-modal",modalType:"warning",closeModalElements:["header-right-primary","footer-button"],panel:{microillustration:"error",heading:"cards-upgrade-post-upgrade-card-process-error-title",text:"cards-upgrade-post-upgrade-card-process-error-text"},iconRightSecondary:H(),headerSecondaryClick:i}}),Pt=({id:e,descriptionModal:t})=>({titleText:e,bodyText:t,fixedFooter:!0,fullHeight:!0,headerType:"modal-three-level",headerText:e,buttonText:"cards-upgrade-info-primary-button-text",modalType:"help",titleIcon:H()}),Mt=({footerButtonClick:e})=>({EXIT_OPERATIVE:{titleText:"cards-upgrade-exit-operative-title",bodyText:"cards-upgrade-exit-operative-text",buttonText:"cards-upgrade-exit-operative-primary-button-text",footerButtonClick:e,hideContentPaddingTop:!0,linkText:"cards-upgrade-exit-operative-secondary-button-text",modalType:"info",titleIcon:ve()}}),Ft=({titleText:e,bodyText:t,buttonText:i,linkText:a,footerButtonClick:r,footerLinkClick:s,veilClick:o})=>({ADDRESS_OPERATIVE:{titleText:e,bodyText:t,buttonText:i,linkText:a,footerButtonClick:r,footerLinkClick:s,veilClick:o,stickyFooter:!0,fixedFooter:!0,hideContentPaddingTop:!1,modalType:"caution",titleIcon:H()}});var Lt=t`:host {
  display: block;
  box-sizing: border-box;
  --_background-ios-header: var(--colorsPrimaryCore, ${i(J.primaryCore)});
}
@supports (padding-top: constant(safe-area-inset-top)) {
  :host {
    --cards-upgrade-safe-area-inset-top: constant(safe-area-inset-top);
  }
}
@supports (padding-top: env(safe-area-inset-top)) {
  :host {
    --cards-upgrade-safe-area-inset-top: env(safe-area-inset-top);
  }
}

:host([hidden]), [hidden] {
  display: none !important;
}

div.container {
  height: 100%;
  overflow: hidden;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.iOS-fixed-header {
  background-color: var(--_background-ios-header);
  height: var(--cards-upgrade-safe-area-inset-top, 0);
  position: fixed;
  bottom: calc(100% - var(--cards-upgrade-safe-area-inset-top, 0));
  width: 100%;
  z-index: 5;
}
`;class qt extends(s(Fe(ye(o(n))))){static get is(){return"bbva-feature-top-credit-card"}static get scopedElements(){const e=[Re,fe,Ke,At,Dt,Rt,It,Be,He,Oe,Pe,...qt.configurationScopedElements()];return qt.scopedElementsFromClasses(e)}static get properties(){return{card:{type:Object},pageName:{type:String,attribute:"page-name"},showSpinner:{type:Boolean,attribute:"show-spinner"},carouselContentFragmentPath:{type:String,attribute:"carousel-content-fragment-path"},faqsContentFragmentPath:{type:String,attribute:"faqs-content-fragment-path"},customersApiVersion:{type:String,attribute:"customers-api-version"},cardsApiVersion:{type:String,attribute:"cards-api-version"},contentFragmentHost:{type:String,value:"content-fragment-host"},localCurrency:{type:String,attribute:"local-currency"},iOSDevices:{type:Array,attribute:"i-o-s-devices"},_userAgentRegex:{type:String,attribute:"user-agent-regex",state:!0},pdfDownloadParams:{type:Object,attribute:"pdf-download-params"},considerationsNumber:{type:Number,attribute:"considerations-number"},emptyOptionsMicroillustration:{type:String,attribute:"empty-options-microillustration"},maxRetries:{type:Number,attribute:"max-retries"},showHelpFaqs:{type:Boolean,attribute:"show-help-faqs"},offerId:{type:String,attribute:"offer-id"},customerId:{type:String,attribute:"customer-id"},disableOnBoarding:{type:Boolean,attribute:"disable-on-boarding"},_options:{type:Array,state:!0},_userId:{type:String,state:!0},_selectedOption:{type:Object,state:!0},_userDeliveries:{type:Array,state:!0},_selectedAddress:{type:Object,state:!0},_navigationStack:{type:Array,state:!0},_onboardingVisible:{type:Boolean,state:!0},_listCardsVisible:{type:Boolean,state:!0},_optionDetailVisible:{type:Boolean,state:!0},_multiStepVisible:{type:Boolean,state:!0},_errorVisible:{type:Boolean,state:!0},_infoVisible:{type:Boolean,state:!0},_faqsVisible:{type:Boolean,state:!0},_retriesConfig:{type:Object,state:!0},_unmaskedAddress:{type:Boolean,state:!0},_loadingAddress:{type:Boolean,state:!0},_getUserAddressCalledFromStep:{type:Boolean,state:!0},_userEmail:{type:String,state:!0},_userAddres:{type:String,state:!0},_successVisible:{type:Boolean,state:!0},_successResponse:{type:Object,state:!0},_optionDetailLoading:{type:Boolean,state:!0},_closeModalListeners:{type:Object,state:!0},_veilClickListeners:{type:Object,state:!0},disableEmailRestriction:{type:Boolean,attribute:"disable-email-restriction"},disableAddressRestriction:{type:Boolean,attribute:"disable-address-restriction"},_offer:{type:Object},_upgradeCard:{type:Boolean,attribute:"upgrade-card"},otpId:{type:String,attribute:!1},idPdf:{type:Array,attribute:!1},_featureFlag:{type:Boolean,attribute:!1},allCreditCards:{type:Array,attribute:"all-credit-cards"},isDeepLink:{type:Boolean,attribute:"is-deep-link"},financialData:{type:Array},getAddressStatusValid:{type:Array},_isFlowInitializable:{type:Boolean,state:!0}}}static get styles(){return[Lt,p("bbva-feature-top-credit-card-shared-styles")]}constructor(){super(),this.getAddressStatusValid=[],this._isFlowInitializable=!1,this.otpId="",this._upgradeCard=!1,this.showHelpFaqs=!1,this.disableOnBoarding=!1,this.card={},this.config={loader:!0},this.allCreditCards={},this.isDeepLink=!1,this.financialData=[],this.showSpinner=!1,this.iOSDevices=["iOS","iPhone"],this._userAgentRegex=/\(([^)]+)\)/,this.pageName="",this.language="MXN",this.requiredToken="tsec",this.carouselContentFragmentPath="",this.faqsContentFragmentPath="",this.contentFragmentHost="",this.considerationsNumber=4,this.offerId="",this.customerId="",this.cardsApiVersion="1",this.customersApiVersion="0",this.emptyOptionsMicroillustration="emptystateday",this.localCurrency="",this.maxRetries=3,this.pdfDownloadParams={mimeType:"application/pdf",method:"post",headerColor:"FF084484",tintColor:"FFFFFFFF",canShare:!0,titleColor:"FFFFFFFF",blackStatusBar:!1},this._retriesConfig={GETADDRESSES:0,GETADDRESSES_STEP:0,GETOFFER:0,POSTUPGRADECARD:0,GETDOCUMENTS:0},this._navigationStack=[],this._options=[],this._userId="",this._userEmail="",this._selectedOption={},this._selectedAddress={},this._userDeliveries=[],this._listCardsVisible=!1,this._onboardingVisible=!1,this._optionDetailVisible=!1,this._multiStepVisible=!1,this._faqsVisible=!1,this._errorVisible=!1,this._infoVisible=!1,this._unmaskedAddress=!1,this._loadingAddress=!1,this._successVisible=!1,this._optionDetailLoading=!1,this._successResponse={},this._getUserAddressCalledFromStep=!1,this.disableEmailRestriction=!1,this.disableAddressRestriction=!1,this._offer={},this.idPdf=[{productId:"AV",name:"Oro",id:"GMDTDOR035"},{productId:"AP",name:"Platinum",id:"GMDTDPL035"},{productId:"UM",name:"Afinidad UNAM",id:"GMDTDUN034"},{productId:"AC",name:"Azul",id:"GMDTDAZ034"}],this._closeModalListeners={NOT_REGISTERED_EMAIL:this.closeOperative.bind(this),NOT_REGISTERED_ADDRESS:this.closeOperative.bind(this),FLOW_NOT_AVAILABLE:this.closeOperative.bind(this),GETOFFER_RETRY:this.closeOperative.bind(this),GETOFFER_EXIT:this.closeOperative.bind(this),POSTUPGRADECARD_RETRY:this.closeOperative.bind(this),POSTUPGRADECARD_EXIT:this.closeOperative.bind(this),GETADDRESSES_RETRY:this.__handleGetAddressCloseModal.bind(this),GETADDRESSES_EXIT:this.__handleGetAddressCloseModal.bind(this),GETADDRESSES_STEP_RETRY:this.closeOperative.bind(this),GETADDRESSES_STEP_EXIT:this.closeOperative.bind(this),POSTUPGRADECARD_INFORETRY:this.closeOperative.bind(this),POSTUPGRADECARD_INFOEXIT:this.closeOperative.bind(this),POSTUPGRADECARD_ERROR:this.closeOperative.bind(this),POSTUPGRADECARD_PROCCESS:this.closeOperative.bind(this),GETDOCUMENTS_RETRY:this.closeOperative.bind(this)},this._veilClickListeners={GETADDRESSES_RETRY:this.__handleGetAddressCloseModal.bind(this),GETADDRESSES_STEP_RETRY:this.__handleGetAddressCloseModal.bind(this)}}get _onboarding(){return this.__onboarding||(this.__onboarding=this.shadowRoot.querySelector(`[data-tag-name="${Be.is}"]`)),this.__onboarding}get _addressesDm(){return this.__addressesDm||(this.__addressesDm=this.shadowRoot.querySelector(`[data-tag-name="${Oe.is}"]`)),this.__addressesDm}get _offerDetailDm(){return this.__offerDeatilDm||(this.__offerDeatilDm=this.shadowRoot.querySelector(`[data-tag-name="${Pe.is}"]`)),this.__offerDeatilDm}async firstUpdated(e){super.firstUpdated(e),this.addEventListener("pop-stack-element",this._removeLastStackNavigationElement),this.addEventListener("push-stack-element",this._saveModalNavigation)}navigationDeepLink(){this.isDeepLink=!0;const e=this.financialData[0].data;this.cards(e)}update(e){super.update(e);const t=e.has("getAddressStatusValid")||e.has("offerId"),i=!!this.offerId.length&&!!this.getAddressStatusValid.length,a=!!this.getAddressStatusValid.length;t&&!a&&this._getDocumentStatus(),t&&i&&a&&this._filterAndSetConfigModal(this.getAddressStatusValid)}updated(e){super.updated(e);const t=e.has("offerId")||e.has("_isFlowInitializable"),i=!!this.offerId&&this._isFlowInitializable;t&&i&&(this._featureFlag?(this.openSpinner(),this.init()):this._manageUnregisteredData("FLOW_NOT_AVAILABLE"))}async init(){if(this._initialized)return;this._initialized=!0,this._getLocalStorage("card_upgrade");const e=await this._customerDataInterceptor();let t="";e.length?t=e:"NOT_REGISTERED_EMAIL"===this._userEmail&&(t=this._userEmail),t&&!this._disableDataAccessValidation(t)?this._manageUnregisteredData(t):this._manageOnboarding()}_getDocumentStatus(){this._dispatchCustomEvent("cards-upgrade-set-customer-id",this.customerId),this._dispatchCustomEvent("cards-upgrade-get-contracts")}_manageNavigateToMyProfile(){this.reset(),this._dispatchCustomEvent("navigate-to-my-profile")}getAddressStatus(e){!e.length?(this.openSpinner(),this._manageUnregisteredData("GETADDRESSES_EXIT")):this.getAddressStatusValid=e}_filterAndSetConfigModal(e){const t=e.find((e=>"address"===(null==e?void 0:e.key)));if(!["R","I","Q"].includes(null==t?void 0:t.status))return void(this._isFlowInitializable=!0);const i={titleText:"cards-upgrade-address-rejected-or-incomplete-title-text",bodyText:"cards-upgrade-address-rejected-or-incomplete-body-text",buttonText:"cards-upgrade-address-rejected-or-incomplete-error-primary-button-text",linkText:"cards-upgrade-address-rejected-or-incomplete-error-primary-link-text",isInValidate:!1},a={titleText:"cards-upgrade-address-in-validation-title-text",bodyText:"cards-upgrade-address-in-validation-body-text",buttonText:"cards-upgrade-address-in-validation-error-primary-button-text",linkText:G,isInValidate:!0};"R"!==(null==t?void 0:t.status)&&"I"!==(null==t?void 0:t.status)||this._addressModalStatusInfo(i),"Q"===(null==t?void 0:t.status)&&this._addressModalStatusInfo(a)}_addressModalStatusInfo(e){const{titleText:t,bodyText:i,buttonText:a,linkText:r,isInValidate:s}=e,o={titleText:t,bodyText:i,buttonText:a,linkText:r,veilClick:this._closeMultistep.bind(this),footerButtonClick:s?this._closeMultistep.bind(this):this._manageNavigateToMyProfile.bind(this),footerLinkClick:s?G:this._closeMultistep.bind(this)};this.modalConfig=Ft(o).ADDRESS_OPERATIVE,this._errorVisible=!0}getFeatureFlag(e){this._featureFlag=e["glomo.contractProductSection.ocTopCreditCard"].value}async _customerDataInterceptor(){const e=[{shouldCall:!0,dm:this._addressesDm,evtName:"set-customer-addresses"}],t=Promise.all(e.filter((e=>e.shouldCall)).map((({dm:e,evtName:t})=>qt._listenerPromiseGenerator(e,t))));this._addressesDm.getCustomerAddresses();const[i]=await t;return this._addressesServiceSuccess(i)}static async _listenerPromiseGenerator(e,t){return new Promise((i=>{e.addEventListener(t,(async function a(r){e.removeEventListener(t,a),i(r)}))}))}set user(e){this._userId=null==e?void 0:e.userId}_requestOfferDetail(){this.openSpinner(),this._offerDetailDm.getOfferDetail({cardId:this.card.cardId,offerId:this.offerId})}async _requestOptionDetail(e=!1){this.__openOptionDetailLoaders(e);const t=this.resultData();this._getOptionDetailResponseSuccess(t),this._dispatchCustomEvent("cards-upgrade-"+(e?"option-detail-opened":"options-step-completed"),this._selectedOption),this.__closeOptionDetailLoaders(e)}resultData(){const e=this._offer;return e.document={id:"123456789",name:this.t("cards-upgrade-multistep-third-step"),size:this.t("cards-upgrade-multistep-third-step-size")},e.termsAndConditionsList=[{id:1,name:"auth",value:"auth-terms",label:this.t("cards-upgrade-terms-and-conditions-1",{cardName:qt._capitalize(this.card.alias),name:e.name}),checked:!1},{id:2,name:"auth",value:"auth-send",label:this.t("cards-upgrade-multistep-third-step-acepted-home"),checked:!1},{id:3,name:"auth",value:"auth-activation",label:this.t("cards-upgrade-multistep-third-step-acepted-keep"),checked:!1}],e.deliveries=[{destination:{id:"HOME",name:""}}],e}static __adjustGrantedCredits(e=[]){var t,i;return{amount:parseFloat(null===(t=e[0])||void 0===t?void 0:t.amount),currency:null===(i=e[0])||void 0===i?void 0:i.currency}}__openOptionDetailLoaders(e){e?this._optionDetailLoading=!0:this.openSpinner()}__closeOptionDetailLoaders(e){e?this._optionDetailLoading=!1:(this._multiStep.completeOptionsStep(),this.closeSpinner())}_showOptionDetail(){this._optionDetailVisible=!0,this._requestOptionDetail({showDetail:!0}),this._dispatchCustomEvent("cards-upgrade-analytics-show-option-detail",{id:"benefits"}),this._dispatchCustomEvent("cards-upgrade-show-option-detail")}_onOptionSelected(){this._requestOptionDetail(),this._dispatchCustomEvent("cards-upgrade-analytics-show-option-selected",{id:"continue button"})}get _multiStep(){return this.shadowRoot.querySelector(`[data-tag-name="${At.is}"]`)}get _success(){return this.__success||(this.__success=this.shadowRoot.querySelector(`[data-tag-name="${It.is}"]`)),this.__success}get _featureContainer(){return this.__featureContainer||(this.__featureContainer=this.shadowRoot.getElementById("feature-container")),this.__featureContainer}_onHelpIconPressed(e){e.stopPropagation();const{id:t,descriptionModal:i}=e.detail;this.infoModalConfig=Pt({id:t,descriptionModal:i}),this._infoVisible=!0,this._dispatchCustomEvent("cards-upgrade-help-modal-opened",{id:t}),this._dispatchCustomEvent("cards-upgrade-info-help-modal-click",{id:t})}_getOptionDetailResponseSuccess(e){this._selectedOption={...e,grantedCredits:null!=e&&e.grantedCredits?[qt.__adjustGrantedCredits(null==e?void 0:e.grantedCredits)]:[]},this._userDeliveries=this._getUserDeliveries(e),this._dispatchCustomEvent("cards-upgrade-option-selected",this._selectedOption)}_getUserDeliveries(e){var t;const i=null===(t=this._userAddresses[0])||void 0===t?void 0:t.location;let a="";var r,s,o;this._unmaskedAddress?a=`•${null==i||null===(r=i.state)||void 0===r?void 0:r.id}, ${null==i||null===(s=i.country)||void 0===s?void 0:s.name}`:a=`${null==i?void 0:i.addressName}, ${null==i?void 0:i.zipCode}, ${null==i||null===(o=i.state)||void 0===o?void 0:o.name}`;return null==e?void 0:e.deliveries.map((({destination:e})=>({id:null==e?void 0:e.id,name:this.t(`cards-upgrade-delivery-name-${null==e?void 0:e.id}`),infoMessage:this.t(`cards-upgrade-delivery-${null==e?void 0:e.id}-info-message`),..."HOME"===(null==e?void 0:e.id)?{address:a||""}:{}})))}_postUpgradeCard(){this.openSpinner(),this._upgradeCard=!0,this._offerDetailDm.otpId=this.otpId,this._offerDetailDm.apiVersion="0",this._offerDetailDm.postUpgradesCard(this.bodyUpgradeCard())}bodyUpgradeCard(){var e,t,i,a;return{cardId:null===(e=this.card)||void 0===e?void 0:e.cardId,body:{cardType:{id:"CREDIT_CARD"},title:{id:null===(t=this._offer)||void 0===t?void 0:t.name,subproduct:{id:null===(i=this._offer)||void 0===i?void 0:i.subproduct}},delivery:{destination:{id:"HOME"}},paymentMethod:{id:"MINIMUM_AMOUNT_TO_AVOID_INTEREST_PAYMENT",period:{id:"MONTHLY"}},participants:[{participantId:" ",participantType:{id:"AUTHORIZED"}}],offerId:this.offerId,bankIdentificationNumber:"0074",relatedContracts:[{contractId:null===(a=this.card)||void 0===a?void 0:a.contractId,product:{id:"CARDS"},relationType:{id:"LINKED_WITH"},numberType:{id:"PAN"}}]}}}async _postUpgradeCardSuccess(e){this._multiStepVisible=!1,this._featureContainer.scrollIntoView({block:"start"}),this.closeSpinner(),this._successResponse=this._parseUpgradeCardSuccessResponse(null==e?void 0:e.detail),this._successVisible=!0,await this.updateComplete,this._saveNavigation(this._success),this._dispatchCustomEvent("cards-upgrade-post-offer-option-redeems-success",this._successResponse)}_parseUpgradeCardSuccessResponse(e){var t;return{fees:null===(t=this._offer)||void 0===t?void 0:t.fees,cardInfo:this.__getCardInfo(e),delivery:this.__delivery,operationNumber:null==e?void 0:e.operationNumber}}signTypeRequest(e){this._addressesDm.signTypeRequest&&this._addressesDm.signTypeRequest(e),this._offerDetailDm.signTypeRequest&&this._offerDetailDm.signTypeRequest(e)}signRequest(e){this._addressesDm.signRequest&&this._addressesDm.signRequest(e),this._offerDetailDm.signRequest&&this._offerDetailDm.signRequest(e)}get __delivery(){var e;const t=null===(e=this._userAddresses[0])||void 0===e?void 0:e.location;return[{description:this.t("cards-upgrade-success-destination-label"),feeType:{id:"TEXT",value:`•${null==t?void 0:t.state.id}, ${null==t?void 0:t.country.name}`}}]}__getCardInfo({descriptionOfferCard:e,grantedCredits:t}){var i,a,r;const{amount:s=0,currency:o=""}={amount:parseFloat(null===(i=t[1])||void 0===i?void 0:i.amount.replace(/[$,]/g,"")),currency:null===(a=t[1])||void 0===a?void 0:a.currency},n=null===(r=this._offer)||void 0===r?void 0:r.partialNumber;return[{description:this.t("cards-upgrade-multistep-card-info-name"),feeType:{id:"TEXT",value:`${qt._capitalize(e)} BBVA`}},{description:this.t("cards-upgrade-multistep-card-info-termination"),feeType:{id:"TEXT",value:`•${n}`}},{description:this.t("cards-upgrade-multistep-card-info-line"),feeType:{id:"AMOUNT",amount:s,currency:o}}]}_manageAnalyticErrorData(e){["GETOFFER_EXIT","POSTUPGRADECARD_EXIT","GETADDRESSES_STEP_EXIT","GETDOCUMENTS_EXIT"].includes(e)&&this._dispatchCustomEvent("cards-upgrade-data-error-modal",e)}_manageError(e,t={}){this.closeSpinner();const i=this._retriesConfig[e]<this.maxRetries;this.modalConfig=this.__getModalConfig({service:e,showRetries:i,detail:t}),this._errorVisible=!0,this._retriesConfig[e]+=1}_errorCards({detail:e}={}){this._upgradeCard?this._manageError("POSTUPGRADECARD",e):this._manageError("GETOFFER")}_manageUnregisteredData(e){this.closeSpinner(),this.modalConfig=wt({...this._commonModalActions(e),footerButtonClick:this.closeOperative.bind(this)})[e],this._errorVisible=!0,this._dispatchCustomEvent("cards-upgrade-initial-data-error",e)}__getModalConfig({service:e,showRetries:t,detail:i}){let a="";if("POSTUPGRADECARD"===e){var r;const s=null==i||null===(r=i.messages[0])||void 0===r?void 0:r.message,o=s.substring(s.length-4);"GM02"!==o&&"GM03"!==o||(a=`${e}${"GM02"===o?"_ERROR":"_PROCCESS"}`,t=!1)}return 0===a.length&&(a=`${e}${t?"_RETRY":"_EXIT"}`),this._manageAnalyticErrorData(a),this._dispatchCustomEvent("cards-upgrade-error-modal-opened",a),wt({service:e,...this.__getErrorModalActions({configLabel:a,service:e,showRetries:t})})[a]}__getErrorModalActions({configLabel:e,service:t,showRetries:i}){return{...this._commonModalActions(e),footerButtonClick:i?this._retryService.bind(this,t):this.closeOperative.bind(this)}}_manageAddressError(){this._getUserAddressCalledFromStep?(this._loadingAddress=!1,this._manageError("GETADDRESSES_STEP")):this._manageError("GETADDRESSES")}_commonModalActions(e){return{veilClick:this._veilClickListeners[e],footerLinkClick:this._closeModalListeners[e],headerPrimaryClick:this._closeModalListeners[e],headerSecondaryClick:this._openFaqs.bind(this)}}__hideOptionDetailModal(){this._optionDetailVisible=!1}__handleGetAddressCloseModal(){this._getUserAddressCalledFromStep||this.closeOperative()}_retryService(e){this[{GETADDRESSES:"__retryGetAddresses",GETADDRESSES_STEP:"__retryGetAddresses",GETOFFER:"__retryGetOffer",POSTUPGRADECARD:"__retryPostCardUpgrade",GETDOCUMENTS:"_requestDocumentDownload"}[e]]()}__retryGetAddresses(){this._getUserAddressCalledFromStep?this._requestUserAddress():(this.openSpinner(),this._addressesDm.getCustomerAddresses())}__retryGetOffer(){this.openSpinner(),this._requestOfferDetail()}__retryPostCardUpgrade(){this.openSpinner(),this._postUpgradeCard()}closeOperative(){this.reset(),this._dispatchCustomEvent("cards-upgrade-exit")}_disableDataAccessValidation(e){return{NOT_REGISTERED_ADDRESS:this.disableAddressRestriction,NOT_REGISTERED_EMAIL:this.disableEmailRestriction}[e]||!1}userEmail(e=""){this._userEmail=e.length?e:"NOT_REGISTERED_EMAIL"}_addressesServiceSuccess({detail:e}={}){return this._userAddresses=(e||[]).filter((({addressType:e})=>"HOME"===(null==e?void 0:e.id))),this._userAddresses.length?"":"NOT_REGISTERED_ADDRESS"}_postUpgradeCardError({detail:e}={}){this._manageError("POSTUPGRADECARD",e)}reset(){this._isFlowInitializable=!1,this.getAddressStatusValid=[],this._upgradeCard=!1,this.modalConfig={},this.offerId="",this._navigationStack=[],this._initialized=!1,this._multiStepVisible=!1,this._errorVisible=!1,this._faqsVisible=!1,this._optionDetailVisible=!1,this._unmaskedAddress=!1,this._getUserAddressCalledFromStep=!1,this._successVisible=!1,this._selectedOption={},this._selectedOptionId="",this._userEmail="",this._retriesConfig={GETADDRESSES:0,GETADDRESSES_STEP:0,GETOFFER:0,POSTUPGRADECARD:0,GETDOCUMENTS:0},this._listCardsVisible=!1,this._offerDetailDm.apiVersion="1"}get _addressesApi(){return h`
      <bbva-dataprovider-customers
        .host="${this.host}"
        .version="${this.customersApiVersion}"
        ?native="${this.native}"
        requiredOtp
        .requiredToken="${this.requiredToken}"
        .customerId="${this.customerId}"
        @set-customer-addresses="${e=>this._manageAddressSuccess(e)}"
        @api-dm-error=${this._manageAddressError}
        @error-on-get-customer-addresses=${this._manageAddressError}
      ></bbva-dataprovider-customers>
    `}get _cardsApi(){return h`
      <bbva-dataprovider-cards
        id="bbvaDataProviderCards"
        .host="${this.host}"
        .apiVersion="${this.cardsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @signature-required-first-step-dm='${({detail:e})=>this._dispatchCustomEvent("cards-upgrade-send-data-otp",e)}'
        @get-offer-card-v1-success=${this._handleSuccessOfferDetail}
        @get-offer-card-v1-error=${()=>this._manageError("GETOFFER")}
        @api-dm-error=${this._errorCards}
        @post-upgrades-card-success=${this._postUpgradeCardSuccess}
        @post-upgrades-card-error=${this._postUpgradeCardError}
      >
      </bbva-dataprovider-cards>
    `}async _handleSuccessOfferDetail(e){if(this.allCreditCards.length>1){const[t]=e.detail.details.cards,i=e=>e.description.value===t.number,a=this.allCreditCards.find(i);this._parseCardInfo(a)}this._options=this._parseOfferDetail(e),this._analyticsDetailParsed(this._options),this._multiStepVisible=!0,await this.updateComplete,await this._multiStep.updateComplete,this._saveNavigation(this._multiStep),this.closeSpinner()}_analyticsDetailParsed(e){var t;const i=null===(t=this.idPdf.find((({productId:t})=>{var i;return t===(null===(i=e[0])||void 0===i?void 0:i.subproduct)})))||void 0===t?void 0:t.name;if(0!==e.length){const t={productName:`tarjeta ${i.toLowerCase().replace(" bbva","")}`,productAmount:e[0].grantedCredits[0].amount,productInterestRate:e[0].fees[1].feeType.percentage};this._dispatchCustomEvent("cards-upgrade-analytics-send-offer-detail",t)}}_parseCardInfo(e){var t,i,a,r,s,o,n;this.card={cardId:null==e?void 0:e.id,alias:null==e||null===(t=e.product)||void 0===t?void 0:t.name,number:this.isDeepLink?null==e||null===(i=e.rawContract)||void 0===i?void 0:i.number:null==e||null===(a=e.originalProduct)||void 0===a?void 0:a.number,contractId:this.isDeepLink?null==e||null===(r=e.rawContract)||void 0===r||null===(s=r.relatedContracts[0])||void 0===s?void 0:s.id:null==e||null===(o=e.originalProduct)||void 0===o||null===(n=o.relatedContracts[0])||void 0===n?void 0:n.id}}_parseOfferDetail(e){var t,i;const a=null===(t=e.detail)||void 0===t?void 0:t.details,r=null===(i=e.detail)||void 0===i?void 0:i.rates;let s=[];if(a&&r){var o,n,d,l,c,p,h,u,g,m,b,v,f,y,_;const t=null==r||null===(o=r.itemizeRates[0])||void 0===o||null===(n=o.itemizeRatesUnit)||void 0===n?void 0:n.percentage,i=null==r||null===(d=r.itemizeRates[1])||void 0===d||null===(l=d.itemizeRatesUnit)||void 0===l?void 0:l.percentage,x=null===(c=a.fees)||void 0===c||null===(p=c.itemizeFees[0])||void 0===p||null===(h=p.itemizeFeeUnit)||void 0===h?void 0:h.amount,$=x.toLocaleString("es-MX",{style:"currency",currency:"MXN"}),S=null==r||null===(u=r.itemizeRates[2].itemizeRatesUnit)||void 0===u?void 0:u.percentage,{moment:C}=window,T=C(null==r||null===(g=r.itemizeRates[2])||void 0===g?void 0:g.calculationDate).format("LL"),E=null==a||null===(m=a.product)||void 0===m||null===(b=m.subproduct)||void 0===b?void 0:b.id,k=this.benefits(E,i),A=null===(v=this.idPdf.find((({productId:e})=>e===E)))||void 0===v?void 0:v.name;s=[{id:e.detail.id,images:[qt.typeCards(E)],name:A+this.t("cards-upgrade-BBVA-name"),shortDescription:null==k?void 0:k.shortDescription,benefits:null==k?void 0:k.data,partialNumber:null==a||null===(f=a.cards[0])||void 0===f?void 0:f.partialNumber,subproduct:E,fees:[{id:this.t("cards-upgrade-info-CAT"),idHelp:"cat",description:this.t("cards-upgrade-info-CAT-description"),descriptionModal:this.t("cards-upgrade-info-CAT-text",{cat:S,tasa:t,annuityModal:$,date:T}),feeType:{id:"PERCENTAGE",percentage:S},helpIcon:!0},{id:this.t("cards-upgrade-info-TASA"),idHelp:"interest",description:this.t("cards-upgrade-info-TASA-description"),descriptionModal:this.t("cards-upgrade-info-TASA-text"),feeType:{id:"PERCENTAGE",percentage:t},helpIcon:!0},{id:this.t("cards-upgrade-info-annuity"),idHelp:"annuity",description:this.t("cards-upgrade-info-annuity-description"),descriptionModal:this.t("cards-upgrade-info-annuity-text"),feeType:{id:"AMOUNT",amount:x,currency:"MXN"},helpIcon:!0}],grantedCredits:[{currency:null==a||null===(y=a.maximumAmount)||void 0===y?void 0:y.currency,amount:null==a||null===(_=a.maximumAmount)||void 0===_?void 0:_.amount}]}],this._offer=s[0]}return s}static _capitalize(e){if("ipn bbva"===e.toLowerCase())return e.toUpperCase();const t=e.split(" "),i=2===t.length?t[1]:void 0,a=void 0!==i?`${t[0].toLowerCase()} ${i}`:t[0].toLowerCase();return a.charAt(0).toUpperCase()+a.slice(1)}static typeCards(e){return[{id:"FRONT_CARD",type:"AV",name:"Front face of the card",url:"https://cardcovers.caasbbva.com/mexico/481515-DX-477213.png.imgcaas.w320.png"},{id:"FRONT_CARD",type:"AC",name:"Front cover image",url:"https://cardcovers.caasbbva.com/mexico/477291-AC.png.imgcaas.w320.png"},{id:"FRONT_CARD",type:"AP",name:"Front cover image",url:"https://cardcovers.caasbbva.com/mexico/477214-AP.png.imgcaas.w320.png"},{id:"FRONT_CARD",type:"UM",name:"Front cover image",url:"https://cardcovers.caasbbva.com/mexico/554629-UM.png.imgcaas.w320.png"}].find((t=>(null==t?void 0:t.type)===e))}benefits(e,t){return[{id:"AC",shortDescription:this.t("cards-upgrade-description-azul"),data:[{id:"1",description:this.t("cards-upgrade-description-azul-benefits-1",{points:t})},{id:"2",description:this.t("cards-upgrade-description-azul-benefits-2")},{id:"3",description:this.t("cards-upgrade-description-azul-benefits-3")}]},{id:"AV",shortDescription:this.t("cards-upgrade-description-oro"),data:[{id:"1",description:this.t("cards-upgrade-description-oro-benefits-1",{points:t})},{id:"2",description:this.t("cards-upgrade-description-oro-benefits-2")},{id:"3",description:this.t("cards-upgrade-description-oro-benefits-3")}]},{id:"AP",shortDescription:this.t("cards-upgrade-description-platinum"),data:[{id:"1",description:this.t("cards-upgrade-description-platinum-benefits-1",{points:t})},{id:"2",description:this.t("cards-upgrade-description-platinum-benefits-2")},{id:"3",description:this.t("cards-upgrade-description-platinum-benefits-3")}]},{id:"UM",shortDescription:this.t("cards-upgrade-description-UNAM"),data:[{id:"1",description:this.t("cards-upgrade-description-UNAM-benefits-1",{points:t})},{id:"2",description:this.t("cards-upgrade-description-UNAM-benefits-2")},{id:"3",description:this.t("cards-upgrade-description-UNAM-benefits-3")}]}].find((t=>(null==t?void 0:t.id)===e))}_saveOnboardingStatus(e){e&&(this._setLocalStorage("card_upgrade",{[`${this._userId}`]:{hiddenOnboarding:!0}}),this._dispatchCustomEvent("cards-upgrade-onboarding-visible"))}async _closeMultistep(){this.closeOperative()}_manageMultistepCloseRequest(){this.modalConfig=Mt({footerButtonClick:this._closeMultistep.bind(this)}).EXIT_OPERATIVE,this._errorVisible=!0,this._dispatchCustomEvent("cards-upgrade-multistep-close-request")}_manageOptionDetailClose(){this._optionDetailVisible=!1}getLocalStorageSuccessResponse(e){var t;this._onboardingVisible=!(null!=e&&null!==(t=e[`${this._userId}`])&&void 0!==t&&t.hiddenOnboarding)}getLocalStorageErrorResponse(){this._onboardingVisible=!0}resetSignSpinners(){this._getUserAddressCalledFromStep&&(this._loadingAddress=!1)}nativeBackNavigation(e){var t,i;(null==e||null===(t=e.value)||void 0===t||null===(i=t.cancelledNavigation)||void 0===i?void 0:i.currentPage)!==this.pageName||this.showSpinner||this._popStackNavigation()}_closeFaqs(){this._faqsVisible=!1}_closeOnboarding(){this._onboarding.visible=!1,this.closeOperative()}_closeElement(e){return{"onboarding-full-screen-carousel":this._closeOnboarding.bind(this),"cards-upgrade-faqs":this._closeFaqs.bind(this),"cards-upgrade-option-detail":this.__hideOptionDetailModal.bind(this),"cards-upgrade-info":this._hideInfoModal.bind(this),"cards-upgrade-error":this._isFlowInitializable?this._hideErrorModal.bind(this):this.closeOperative.bind(this),"cards-upgrade-multi-step":this._manageMultistepCloseRequest.bind(this),"cards-upgrade-success":this.closeOperative.bind(this)}[e]}_hideInfoModal(){this._infoVisible=!1}_hideErrorModal(){this._errorVisible=!1}_popStackNavigation(){var e;const[t]=this._navigationStack.slice(-1),i=null==t||null===(e=t.dataset)||void 0===e?void 0:e.tagName;this._closeElement.call(this,i)()}_removeLastStackNavigationElement(e){e.stopPropagation(),this._navigationStack.pop()}_saveModalNavigation(e){e.stopPropagation(),this._saveNavigation(null==e?void 0:e.detail)}_saveNavigation(e){this._navigationStack=[...this._navigationStack,e]}_manageOnboarding(){this._onboarding.visible=this._onboardingVisible&&!this.disableOnBoarding,this._onboarding.visible?(this._saveNavigation(this._onboarding),this.closeSpinner()):this._executeOnboardingAction()}_executeOnboardingAction(){this._requestOfferDetail()}generateCarouselContent(e={}){if(0!==e.length&&e.items){const t=e.items.contentfragmentlist.items.map((({elements:e})=>e));this.carouselConfig=t.map((({image:e,title:t,description:i})=>({content:h`
              <div style="padding-left:16px;padding-right:16px;padding-top:32px;">
              <img width="64px" height="64px" slot="microillustration" src="${`https://assets-stage.caasbbva.com${e.value}`}" alt="${e.title}" />
                <p style="font-size: 18px;font-weight: 500;line-height: 24px;letter-spacing: 0px;text-align: center; color:black;">${t.value}</p>
                ${de(i.value)}
              </div>
            `}))),this.requestUpdate()}}get _renderOnboarding(){return h`
      <onboarding-full-screen-carousel
        ?native=${this.native}
        .modalTitle="${this.t("cards-upgrade-header-title")}"
        .contentFragmentHost="${this.contentFragmentHost}"
        .contentFragmentPath="${this.carouselContentFragmentPath}"
        header-icon-right-secondary="${H()}"
        @visible-changed=${({detail:e})=>this._saveOnboardingStatus(e)}
        @help-modal-header-right-primary-click=${this.closeOperative}
        @help-modal-header-right-secondary-click=${this._openFaqs}
        @card-upgrade-onboarding-button-pressed=${this._executeOnboardingAction}
        @onboarding-full-screen-carousel-activate=${this._executeOnboardingAction}
        .items="${this.carouselConfig}"
        @aem-content-fragment-dm-fetch="${e=>this.generateCarouselContent(e.detail)}"
        @hide-loader=${e=>e.stopPropagation()}
      >
      </onboarding-full-screen-carousel>
    `}get _renderGlobalApis(){return h`
      ${this._addressesApi}${this._cardsApi}
    `}get _renderOptionDetail(){return h`
      <cards-upgrade-option-detail
        ?visible=${this._optionDetailVisible}
        .option=${this._selectedOption}
        .host="${this.host}"
        ?native=${this.native}
        .language=${this.language}
        .considerationsLength=${this.considerationsNumber}
        ?loading=${this._optionDetailLoading}
        @cards-upgrade-option-help-button-click=${this._onHelpIconPressed}
        @help-modal-header-right-secondary-click=${this._openFaqs}
        @help-modal-header-right-primary-click=${this._manageOptionDetailClose}
        @card-upgrade-option-detail-button-click=${this._manageOptionDetailClose}
      >
      </cards-upgrade-option-detail>
    `}get _renderErrorModals(){return h`
      <cards-upgrade-error
        @visible-changed=${({detail:e})=>{this._errorVisible=e}}
        ?visible=${this._errorVisible}
        .modalConfig=${this.modalConfig}
      >
      </cards-upgrade-error>
    `}get _renderInfoModals(){return h`
      <cards-upgrade-info
        variant="info"
        @visible-changed=${({detail:e})=>{this._infoVisible=e}}
        ?visible=${this._infoVisible}
        .modalConfig=${this.infoModalConfig}
      >
      </cards-upgrade-info>
    `}_faqsVisibleChanged(e){this._faqsVisible=e.detail}_handleFaqQuestionTitle(e){this._dispatchCustomEvent("cards-upgrade-faq-question-title",e)}get _renderFaqs(){return this.showHelpFaqs?h`
          <cards-upgrade-faqs
            ?native=${this.native}
            ?iOSFixedHeader=${this.iOSFixedHeader}
            ?visible=${this._faqsVisible}
            @visible-changed=${this._faqsVisibleChanged}
            aem-host="${this.contentFragmentHost}"
            content-fragment-path="${this.faqsContentFragmentPath}"
            @cards-upgrade-faqs-question-title="${this._handleFaqQuestionTitle}"
          >
          </cards-upgrade-faqs>
        `:G}_handleCurrentStep({step:e}){void 0!==e&&this._dispatchCustomEvent(`current-step-${e}`,{step:e})}get _renderMultiStep(){return this._multiStepVisible?h`
          <cards-upgrade-multi-step
            .card=${this.card}
            .upgradeOptions=${this._options}
            .selectedOption=${this._selectedOption}
            .userAddresses=${this._userDeliveries}
            .loadingAddress=${this._loadingAddress}
            .unmaskedAddress=${!this._unmaskedAddress}
            .enableSafeEnviromentFeedback=${this._options.length>0}
            @cards-upgrade-current-step="${({detail:e})=>this._handleCurrentStep(e)}"
            @cards-upgrade-all-steps-completed="${({detail:e})=>this._handleCurrentStep(e)}"
            empty-options-microillustration=${this.emptyOptionsMicroillustration}
            @cards-upgrade-option-help-button-click=${this._onHelpIconPressed}
            @header-main-icon-right-primary-click=${this._manageMultistepCloseRequest}
            @header-main-icon-right-secondary-click=${this._openFaqs}
            @show-option-detail=${e=>this._showOptionDetail(e)}
            @option-selected=${()=>this._onOptionSelected()}
            @cards-upgrade-terms-complete=${this._onCompleteSteps}
            @delivery-option-selected=${({detail:e})=>this._deliveryOptionSelected(e)}
            @card-upgrade-delivery-unmask-address=${()=>this._requestUserAddress()}
            @cards-upgrade-request-document-click=${this._requestDocumentDownload}
            @navigate-to-my-profile-from-step-content="${()=>this._manageNavigateToMyProfile()}"
            @multistep-button-pressed=${({detail:e})=>this._multistepSummaryButtonPressed(e)}
          >
          </cards-upgrade-multi-step>
        `:G}_openFaqs(){this._faqsVisible=!0,this._dispatchCustomEvent("cards-upgrade-"+(this.showHelpFaqs?"show-faqs":"help-click"),{id:"faqs"})}_deliveryOptionSelected(e){this._selectedAddress=e,this._dispatchCustomEvent("cards-upgrade-delivery-option-selected")}_onCompleteSteps(){this._multiStep.completeTermsStep()}_multistepSummaryButtonPressed(){this._postUpgradeCard()}_manageAddressSuccess(e){this._addressesServiceSuccess(e),this._getUserAddressCalledFromStep=!1,this._loadingAddress=!1,this._unmaskedAddress=!this._unmaskedAddress,this._selectedOption=this.resultData(),this._updateUserDeliveries()}_requestUserAddress(){this._loadingAddress=!0,this._getUserAddressCalledFromStep=!0,this._addressesDm.otpId=this.otpId,this._addressesDm.getCustomerAddresses({unmasked:this._unmaskedAddress})}_updateUserDeliveries(){this._userDeliveries=this._getUserDeliveries(this._selectedOption)}_requestDocumentDownload(){var e,t,i;this.pdfDownloadParams.value=`${this.host}/business-documents/v0/business-documents`,this.pdfDownloadParams.headers={"Content-Type":"application/json"},this.pdfDownloadParams.body={documentTemplate:{id:null===(e=this._findIdPdf())||void 0===e?void 0:e.id,templateType:{id:"PDF"}}};const a={...this.pdfDownloadParams,title:null===(t=this._selectedOption)||void 0===t||null===(i=t.document)||void 0===i?void 0:i.name};this.openSpinner(),this._dispatchCustomEvent("cards-upgrade-request-document",a)}_findIdPdf(){return this.idPdf.find((e=>{var t;return(null==e?void 0:e.name)===(null===(t=this._offer)||void 0===t?void 0:t.name.replace("BBVA","").trimEnd())}))}manageOpenDocumentResult(e){e?this._manageError("GETDOCUMENTS"):this.closeSpinner(),this._dispatchCustomEvent("cards-upgrade-request-document-"+(e?"error":"success"))}_shouldDisplayIOSFixedHeader(){var e,t;const i=null===(e=window)||void 0===e||null===(t=e.navigator)||void 0===t?void 0:t.userAgent.match(this._userAgentRegex)[1].split(";");return this.iOSFixedHeader&&this.iOSDevices.includes(i[0])}openSpinner(){this.showSpinner=!0,this.showLoader()}closeSpinner(){this.showSpinner=!1,this.clearLoader()}_getLocalStorage(e){this._dispatchCustomEvent("cards-upgrade-get-native-local-storage",{key:e})}_setLocalStorage(e,t){this._dispatchCustomEvent("cards-upgrade-set-native-local-storage",{key:e,value:t})}cards(e){var t;0!==e.length&&(this.allCreditCards=e[0].products.filter((e=>"CREDIT_CARD"===e.subProductType)),null===(t=e[0])||void 0===t||t.products.map((e=>{"CREDIT_CARD"===e.subProductType&&this._parseCardInfo(e)})))}_dispatchCustomEvent(e,t=!0,i=!0,a=!0){this.dispatchEvent(new CustomEvent(e,{bubbles:i,composed:a,detail:t}))}get _fixedIOSHeader(){return h`
      <div ?hidden="${!this._shouldDisplayIOSFixedHeader()}" class="iOS-fixed-header"></div>
    `}get _renderVisualContent(){return h`
      ${this._renderMultiStep} ${this._renderOnboarding}
      ${this._renderOptionDetail} ${this._renderSuccess}
    `}get _renderSuccess(){return this._successVisible?h`
          <cards-upgrade-success
            .userEmail=${this._userEmail}
            .successResponse=${this._successResponse}
            @header-main-icon-right-primary-click=${this.closeOperative}
            @success-page-button-pressed=${this.closeOperative}
          >
          </cards-upgrade-success>
        `:G}render(){return h`
      ${super.render()}
      <div id="feature-container" class="container" ambient="light">
        ${this._fixedIOSHeader} ${this._renderGlobalApis} ${this._renderVisualContent}
        ${this._renderInfoModals} ${this._renderErrorModals} ${this._renderFaqs}
      </div>
    `}}class Vt extends n{static get is(){return"bbva-analyticmanager-top-credit-card"}static get properties(){return{dataAnalytic:{type:Object,attribute:!1},offerData:{type:Object,attribute:!1},_listenAppStartedAnalytics:{type:Boolean,attribute:!1}}}constructor(){super(),this.dataAnalytic={},this.offerData={},this._listenAppStartedAnalytics=!1}reset(){this.dataAnalytic={},this.offerData={},this._listenAppStartedAnalytics=!1}appPageVisit(){this._dispatchCustomEvent("analytics-app-page-visit")}appStarted(e){const t=Vt._cleanString(e.id);let i="";switch(t){case"cat":case"tasa de interes":case"anualidad":i=t;break;case"benefits":i="ver los beneficios";break;case"continue button":i="continuar";break;default:throw new Error(`The option is not valid, received: ${t}`)}this.dataAnalytic=Object.assign(this.dataAnalytic,{applicationStep:i}),this._listenAppStartedAnalytics||(this._dispatchCustomEvent("analytics-app-started",this.dataAnalytic),this._listenAppStartedAnalytics=!0)}appStep({step:e,data:t}){if(this.dataAnalytic=Object.assign(this.dataAnalytic,this.offerData),t)this._dispatchCustomEvent("analytics-app-step-5",this.dataAnalytic);else switch(e){case 1:this._dispatchCustomEvent("analytics-app-step-2",this.dataAnalytic);break;case 2:this._dispatchCustomEvent("analytics-app-step-3",this.dataAnalytic);break;case 3:this._dispatchCustomEvent("analytics-app-step-4",this.dataAnalytic);break;default:throw new Error(`The option is not valid, received: ${e}`)}}fireAppCompleted(e){this.dataAnalytic=Object.assign(this.dataAnalytic,{operationNumber:e.operationNumber}),this._dispatchCustomEvent("analytics-app-completed",this.dataAnalytic)}fireAdvanceFootprint(e){const t=Vt._cleanString(e.id);this.dataAnalytic=Object.assign(this.dataAnalytic,{level2:t}),this._dispatchCustomEvent("analytics-advanced-footprint",this.dataAnalytic)}fireInternalLink({detail:e}){const t={linkName:Vt._cleanString(e.faqQuestion)};this._dispatchCustomEvent("analytics-internal-link",t)}fireErrorPage(e){let t="";switch(e){case"GETADDRESSES_STEP_EXIT":t="error carga direccion";break;case"GETDOCUMENTS_EXIT":t="carga de informacion";break;case"GETOFFER_EXIT":case"POSTUPGRADECARD_EXIT":t="error proceso incompleto";break;default:throw new Error(`The option is not valid, received: ${e}`)}this.dataAnalytic=Object.assign(this.dataAnalytic,{errorPage:t}),this._dispatchCustomEvent("analytics-advanced-footprint-error",this.dataAnalytic)}_dispatchCustomEvent(e,t=!0,i=!0,a=!0){this.dispatchEvent(new CustomEvent(e,{bubbles:i,composed:a,detail:t}))}static _cleanString(e){return e?e.normalize("NFD").replace(/[\u0300-\u036f]/g,"").replace(/[^a-zA-Z0-9 ]/g,"").toLowerCase():G}}class Bt extends qt{static get is(){return"bbva-feature-top-credit-card-mx"}static get properties(){return{}}}customElements.define(Bt.is,Bt);class Nt extends Vt{static get is(){return"bbva-analyticmanager-feature-top-credit-card-mx"}static get properties(){return{}}}customElements.define(Nt.is,Nt);
