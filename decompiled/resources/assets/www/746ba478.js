import{H as e,z as t,a8 as a,ab as i,ac as o,ad as n,ar as s,aa as r,a9 as l,a as c,an as d,aJ as m,L as b,bU as v,b6 as u,F as h,ag as g,ah as p,cU as y,ai as f,aN as _,dj as k,ak as $,cS as x,h as w,bF as M,aV as S,av as T,o as C,m as D,f as E,g as L,cH as P,aL as q,aw as I,bh as V,A,di as B,cI as z,ch as O,aj as N,aD as R,dk as j,b5 as F,b4 as G,j as X,l as H,dl as W,ba as Y,b8 as U,b9 as J,dm as K,cG as Q,dn as Z}from"./952f98a9.js";import{a7 as ee,m as te}from"./7f3d7ca9.js";import"./216055dc.js";import{B as ae,b as ie}from"./5d5c4a21.js";import{b as oe}from"./6f390794.js";import"./c0a2f832.js";import"./cae0f1de.js";const ne=e((e=>class extends e{static get properties(){return{host:{type:String,attribute:"host"},native:{type:Boolean},requiredToken:{type:String,attribute:"required-token"},language:{type:String},headers:{type:Object},ambient:{type:String,reflect:!0},locale:{type:String},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"},publicSettingsHost:{type:String,attribute:"public-settings-host"},publicSettingsRequiredToken:{type:String,attribute:"public-settings-required-token"},history:{type:Object}}}constructor(){super(),this.native=!1,this.iOSFixedHeader=!1,this.publicSettingsRequiredToken="none"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.addEventListener("help-modal-open",this._handleModalState),this.addEventListener("help-modal-close",this._handleModalState),this.setAttribute("data-tag-name",this.constructor.is)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("help-modal-open",this._handleModalState),this.removeEventListener("help-modal-close",this._handleModalState)}static scopedElementsFromClasses(e){return e.reduce(((e,t)=>(e[t.is]=t,e)),{})}_handleModalState(e){var t;const a=null==e||null===(t=e.detail)||void 0===t?void 0:t.modal;this.dispatchEvent(new CustomEvent("modal-state-change",{bubbles:!0,composed:!0,detail:{visible:null==a?void 0:a.visible,modal:a}}))}}));var se=t`:host {
  display: block;
  box-sizing: border-box;
  height: 100%;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container-padding: 0;
}
`;const re=new s;var le=t`:host {
  display: flex;
  flex-direction: column;
  align-items: center;
  text-align: center;
  box-sizing: border-box;
  padding: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${a(r.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(r.spacer)}))) / 16) * 1em);
  position: relative;
  background-color: var(--bbva-notification-message-dark-mode-background-color, var(--bbva-notification-message-background-color, var(--colorsPrimarySubduedLight, ${a(l.primarySubduedLight)})));
  --_notification-message-icon-color: var(--bbva-notification-message-dark-mode-icon-color, var(--bbva-notification-message-icon-color, var(--colorsPrimaryCoreDark, ${a(l.primaryCoreDark)})));
  --_notification-message-information-icon-color: var(--bbva-notification-message-dark-mode-information-icon-color, var(--bbva-notification-message-information-icon-color, var(--colorsTertiaryType3Dark, ${a(l.tertiaryType3Dark)})));
  --_notification-message-success-icon-color: var(--bbva-notification-message-dark-mode-success-icon-color, var(--bbva-notification-message-success-icon-color, var(--colorsTertiaryType6Dark, ${a(l.tertiaryType6Dark)})));
  --_notification-message-error-icon-color: var(--bbva-notification-message-dark-mode-error-icon-color, var(--bbva-notification-message-error-icon-color, var(--colorsTertiaryType1Dark, ${a(l.tertiaryType1Dark)})));
  --_notification-message-sustainability-icon-color: var(--bbva-notification-message-dark-mode-sustainability-icon-color, var(--bbva-notification-message-sustainability-icon-color, var(--colorsPrimaryVariantDark, ${a(l.primaryVariantDark)})));
  --_notification-message-information-background-color: var(--bbva-notification-message-dark-mode-information-background-color, var(--bbva-notification-message-information-background-color, var(--colorsTertiaryType3Lightened, ${a(l.tertiaryType3Lightened)})));
  --_notification-message-success-background-color: var(--bbva-notification-message-dark-mode-success-background-color, var(--bbva-notification-message-success-background-color, var(--colorsTertiaryType6Lightened, ${a(l.tertiaryType6Lightened)})));
  --_notification-message-error-background-color: var(--bbva-notification-message-dark-mode-error-background-color, var(--bbva-notification-message-error-background-color, var(--colorsTertiaryType5Lightened, ${a(l.tertiaryType5Lightened)})));
  --_notification-message-sustainability-background-color: var(--bbva-notification-message-dark-mode-sustainability-background-color, var(--bbva-notification-message-sustainability-background-color, var(--colorsPrimaryVariantLightened, ${a(l.primaryVariantLightened)})));
  --_notification-message-title-color: var(--bbva-notification-message-dark-mode-title-color, var(--bbva-notification-message-title-color, var(--colorsSecondary600, ${a(l.secondary600)})));
  --_notification-message-paragraph-color: var(--bbva-notification-message-dark-mode-paragraph-color, var(--bbva-notification-message-paragraph-color, var(--colorsSecondary600, ${a(l.secondary600)})));
  --_text-weight: var(--bbva-notification-message-dark-mode-text-weight, var(--bbva-notification-message-text-weight, var(--fontFacePrimaryBookFontWeight, ${a(i.book.fontWeight)})));
  --skeleton-quote-color: var(--bbva-notification-message-dark-mode-skeleton-color, var(--bbva-notification-message-skeleton-color, var(--colorsPrimaryCoreLightened, ${a(l.primaryCoreLightened)})));
  --skeleton-quote-bg: var(--bbva-notification-message-dark-mode-skeleton-bg-color, var(--bbva-notification-message-skeleton-bg-color, var(--colorsPrimarySubduedLight, ${a(l.primarySubduedLight)})));
  --_notification-message-skeleton-animated-layer-bg: var(--bbva-notification-message-dark-mode-skeleton-animated-layer-bg-color, var(--colorsPrimaryCoreLightened, ${a(l.primaryCoreLightened)}));
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

.title {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(r.spacer)}))) / 16) * 1rem);
  color: var(--_notification-message-title-color);
  font-size: var(--bbva-notification-message-title-size, var(--typographyTypeLarge, ${a(o.typeLarge)}));
}

.paragraph {
  color: var(--_notification-message-paragraph-color);
  font-weight: var(--bbva-notification-message-paragraph-weight, var(--_text-weight));
  font-size: var(--bbva-notification-message-paragraph-size, var(--typographyTypeSmall, ${a(o.typeSmall)}));
  line-height: var(--bbva-notification-message-line-height, var(--lineHeightTypeSmall, ${a(n.typeSmall)}));
}
.paragraph:not(.no-space) {
  padding: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(r.spacer)}))) / 16) * 1rem);
}

:host([hide-bottom-padding-paragraph]) > .paragraph {
  padding: 0;
}

.description {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(r.spacer)}))) / 16) * 1rem);
  color: var(--_notification-message-title-color);
  font-style: var(--fontFacePrimaryMediumFontStyle, ${a(i.medium.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${a(i.medium.fontWeight)});
}

:host([description][description-text-italic]) > .description {
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${a(i.mediumItalic.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${a(i.mediumItalic.fontWeight)});
}

[data-tag-name=bbva-icon] {
  margin: 0 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(r.spacer)}))) / 16) * 1rem);
  --bbva-icon-color: var(--_notification-message-icon-color);
}

[data-tag-name=bbva-link]:not(.no-space) {
  padding: 0 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(r.spacer)}))) / 16) * 1rem);
}

:host([hide-bottom-padding-link]) [data-tag-name=bbva-link] {
  padding: 0;
}

[data-tag-name=bbva-button-default][variant="icon no-background"] {
  position: absolute;
  top: 0;
  right: 0;
}

:host([variant=information]) {
  background-color: var(--_notification-message-information-background-color);
}
:host([variant=information]) [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_notification-message-information-icon-color);
}

:host([variant=success]) {
  background-color: var(--_notification-message-success-background-color);
}
:host([variant=success]) [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_notification-message-success-icon-color);
}

:host([variant=error]) {
  background-color: var(--_notification-message-error-background-color);
}
:host([variant=error]) [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_notification-message-error-icon-color);
}

:host([variant=sustainability]) {
  background-color: var(--_notification-message-sustainability-background-color);
}
:host([variant=sustainability]) [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_notification-message-sustainability-icon-color);
}

:host([loading]) {
  position: relative;
  pointer-events: none;
  background-repeat: no-repeat;
  overflow: hidden;
  opacity: 1;
  height: 10.125rem;
  background-image: linear-gradient(var(--skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: 24px 24px, calc((87% * 2) + (16px/ 2)) 16px, calc((87% * 2) + (16px/ 2)) 16px, calc((64.5% * 2) + (16px/ 2)) 16px;
  background-position: 50% 32px, -7% 72px, -7% 96px, -17.3% 120px;
}
:host([loading]) .skeleton {
  contain: strict;
  position: absolute;
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  height: inherit;
  top: 0;
  right: 0;
  left: 6.25rem;
}
:host([loading]):host([variant=default]) .skeleton {
  background-color: var(--bbva-notification-message-dark-mode-background-color, var(--bbva-notification-message-background-color, var(--colorsPrimarySubduedLight, ${a(l.primarySubduedLight)})));
}
:host([loading]):host([variant=information]) {
  background-color: var(--_notification-message-information-background-color);
}
:host([loading]):host([variant=information]) .skeleton {
  background-color: var(--_notification-message-information-background-color);
}
:host([loading]):host([variant=success]) {
  background-color: var(--_notification-message-success-background-color);
}
:host([loading]):host([variant=success]) .skeleton {
  background-color: var(--_notification-message-success-background-color);
}
:host([loading]):host([variant=error]) {
  background-color: var(--_notification-message-error-background-color);
}
:host([loading]):host([variant=error]) .skeleton {
  background-color: var(--_notification-message-error-background-color);
}
:host([loading]):host([variant=sustainability]) {
  background-color: var(--_notification-message-sustainability-background-color);
}
:host([loading]):host([variant=sustainability]) .skeleton {
  background-color: var(--_notification-message-sustainability-background-color);
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
${re.mediaRules()}`;class ce extends(c(d(m(b)))){static get is(){return"bbva-notification-message"}static get scopedElements(){return{"bbva-button-default":v,"bbva-link":u,"bbva-icon":h,"bbva-text":g}}static get properties(){return{iconSize:{type:Number,attribute:"icon-size"},icon:{type:String,attribute:"icon"},messageTitle:{type:String,attribute:"message-title"},message:{type:String},description:{type:String},tagTitle:{type:String,attribute:"tag-title"},linkTitle:{type:String,attribute:"link-title"},linkIcon:{type:String,attribute:"link-icon"},buttonText:{type:String,attribute:"button-text"},href:{type:String},loading:{type:Boolean,reflect:!1},variant:{type:String,reflect:!0},iconClose:{type:Boolean,attribute:"icon-close"},hideBottomPaddingParagraph:{type:Boolean,attribute:"hide-bottom-padding-paragraph"},hideBottomPaddingLink:{type:Boolean,attribute:"hide-bottom-padding-link"},descriptionTextItalic:{type:Boolean,attribute:"description-text-italic"},accessibilityLinkLabel:{type:String,attribute:"accessibility-link-label"}}}constructor(){super(),this.iconClose=!1,this.iconSize=24,this.variant="default",this._types={default:p(),information:y(),success:f(),error:_(),sustainability:k()},this.hideBottomPaddingParagraph=!1,this.hideBottomPaddingLink=!1,this.descriptionTextItalic=!1,this.loading=!1,this.accessibilityLinkLabel="bbva-notification-message-accessibility-link-label",this._accessibilityTextIcon="bbva-notification-message-accessibility-icon-text-",this.tagTitle="p"}static get styles(){return[super.styles,le,$("bbva-notification-message-shared-styles"),x.light]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.isRoleAlert?this.setAttribute("role","alert"):this.setAttribute("role","status"),this.disabledTabindex=!0}get isRoleAlert(){return"error"===this.variant}get _icon(){return this.icon?this.icon:this._types[this.variant]||p()}get _closeIcon(){return this.iconClose&&"default"===this.variant?w`
          <bbva-button-default
            variant="icon no-background"
            .icon="${M()}"
            @click="${this._iconClick}"
            aria-label="${this.t("bbva-notification-message-close")}"
          >
          </bbva-button-default>
        `:S}get _title(){return this.messageTitle?w`
          <bbva-text
            .tag="${this.tagTitle}"
            alignment="center"
            .text="${this.messageTitle}"
            class="title"
            unset
            size="M"
          ></bbva-text>
        `:S}get _paragraph(){return w`<div
      class="paragraph
            ${T({"no-space":!this.buttonText&&!this.linkTitle})}"
    >
      ${this.message?w`<bbva-text alignment="center" text=${this.message} unset size="S"></bbva-text> `:w`<slot></slot>`}
    </div>`}get _description(){return this.description?w` <bbva-text
          class="description"
          alignment="center"
          .text=${this.description}
          unset
          size="S"
        ></bbva-text>`:S}get _link(){return this.linkTitle?w`
          <bbva-link
            aria-label="${this.t(this.accessibilityLinkLabel)}"
            class="${T({"no-space":!this.buttonText})}"
            variant="message"
            .href="${this.href}"
            @click="${this._linkClick}"
            .icon="${this.linkIcon}"
          >
            <span>${this.linkTitle}</span>
          </bbva-link>
        `:S}get _button(){return this.buttonText?w`
          <bbva-button-default
            ambient="light"
            data-tag-name="bbva-button-default"
            text="${this.buttonText}"
            @click="${this._buttonClick}"
          ></bbva-button-default>
        `:S}get _accessibilityIconDescription(){return`${this._accessibilityTextIcon}${this.variant}`}_iconClick(){this.dispatchEvent(new CustomEvent("notification-message-icon-click",{detail:!0,bubbles:!0,composed:!0}))}_linkClick(){this.dispatchEvent(new CustomEvent("notification-message-link-click",{detail:!0,bubbles:!0,composed:!0}))}_buttonClick(){this.dispatchEvent(new CustomEvent("notification-message-button-click",{detail:!0,bubbles:!0,composed:!0}))}render(){return w`${this.loading?w`<div class="skeleton"></div> `:w` ${this._closeIcon}
          <bbva-icon
            data-tag-name="bbva-icon"
            role="img"
            aria-label=${this.t(this._accessibilityIconDescription)}
            .icon="${this._icon}"
            .size="${this.iconSize}"
          ></bbva-icon>
          ${this._title} ${this._paragraph} ${this._description} ${this._link} ${this._button}`}`}}L("colors.cool60"),L("colors.primarySubduedLight"),L("colors.tertiaryType3Light"),L("colors.tertiaryType6Light"),L("colors.tertiaryType1Light"),L("colors.primaryVariantLight"),L("colors.cool60"),L("colors.cool60"),L("colors.cool60"),L("colors.cool60"),L("colors.primaryCoreLightened"),L("colors.primaryCoreLightened"),L("colors.primaryCoreLightened"),L("fontFacePrimary.book.fontWeight"),L("colors.primarySubdued"),L("colors.cool50"),L("colors.cool60"),L("colors.cool60");var de=t`:host {
  display: block;
  box-sizing: border-box;
  height: 100%;
  --_alwayson-movement-detail-summary-background-color: var(--alwayson-movement-detail-dark-mode-summary-background-color, var(--colorsSecondary100, ${a(l.secondary100)}));
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-help-modal] {
  --_help-modal-padding-bottom: 1.5rem;
}

.movement__summary {
  padding: 2rem 0rem;
  display: flex;
  flex-direction: column;
  align-items: center;
  background-color: var(--_alwayson-movement-detail-summary-background-color);
}
.movement__amount {
  margin-bottom: 1.5rem;
}
.movement__status {
  display: flex;
  gap: 0.5rem;
}
.movement__content {
  margin: 1rem 1rem 0rem;
}
.movement__notification {
  margin: 1.5rem 0rem 2rem;
}

.detail-item {
  margin-bottom: 1rem;
  text-align: left;
}
.detail-item__label {
  color: var(--colorsSecondary500, ${a(l.secondary500)});
}
`,me=t`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-help-modal] {
  --_help-modal-padding-bottom: 1.5rem;
}
`;class be extends(c(ee(d(b)))){static get is(){return"always-on-modal"}static get scopedElements(){const e=[P,q,g];return be.scopedElementsFromClasses(e)}static get properties(){return{config:{attribute:"config",type:Object},resetProperties:{attribute:"reset-properties",type:Boolean},_maxRetries:{attribute:!1,type:Number,state:!0},_retrys:{attribute:!1,type:Number,state:!0}}}static get styles(){return[me,$("alwayson-modal-shared-styles")]}constructor(){super(),this.reset()}updated(e){e.has("resetProperties")&&this.resetProperties&&this.reset()}reset(){this.config={},this._maxRetries=3,this._retrys=0,this.resetProperties=!1}get modal(){return this.shadowRoot.querySelector(".always-on-modal")}open(e={}){this.config=e,this.modal.open()}openErrorModal(e){this.open({id:`retry-error-${this._retrys<this._maxRetries?e:"exit-flow"}`,headerText:this.t({"movement-list":"bbva-feature-alwayson-header-title-movements","movement-detail":"bbva-feature-alwayson-movement-detail-header-title","movement-cancel":"bbva-feature-alwayson-movement-detail-success-cancel-modal-header"}[e]),buttonText:this._retrys<this._maxRetries?this.t("bbva-feature-alwayson-modal-error-accept-button"):this.t("bbva-feature-alwayson-modal-error-cancel-button"),linkText:this._retrys<this._maxRetries?this.t("bbva-feature-alwayson-modal-error-cancel-button"):"",fullHeight:!0,fixedFooter:!0,extraContent:{isSuccess:!1}}),this._retrys+=1}_onModalAccept(){var e;this._dispatchCustomEvent(`always-on-modal-${null===(e=this.config)||void 0===e?void 0:e.id}-accept`)}_onModalClose(){this._dispatchCustomEvent("always-on-modal-close")}_renderModalContent(){var e,t;const a=(null===(e=this.config)||void 0===e||null===(t=e.extraContent)||void 0===t?void 0:t.isSuccess)||!1?"success":"error";return w`
      <div class="content" slot="slot-content">
        <bbva-clip-microillustration
          microillustration = ${a}
          size="L">
        </bbva-clip-microillustration>
        <bbva-text 
          text= ${this.t(`bbva-feature-alwayson-modal-${a}-title`)}
          font-weight="500" 
          size="L" 
          alignment="center">
        </bbva-text>
        <bbva-text 
          text=${this.t(`bbva-feature-alwayson-modal-${a}-text`)} 
          alignment="center">
        </bbva-text>
      </div>
    `}render(){var e,t,a,i,o,n,s,r,l,c,d,m;return w`
        <bbva-help-modal
            id="${null===(e=this.config)||void 0===e?void 0:e.id}"
            class="always-on-modal"
            header-type="modal"
            modal-type="${(null===(t=this.config)||void 0===t?void 0:t.modalType)||""}"
            header-text="${(null===(a=this.config)||void 0===a?void 0:a.headerText)||""}"
            title-icon="${(null===(i=this.config)||void 0===i?void 0:i.titleIcon)||""}"
            title-text="${(null===(o=this.config)||void 0===o?void 0:o.title)||""}"
            body-text="${(null===(n=this.config)||void 0===n?void 0:n.bodyText)||""}"
            button-text="${(null===(s=this.config)||void 0===s?void 0:s.buttonText)||""}"
            link-text="${(null===(r=this.config)||void 0===r?void 0:r.linkText)||""}"
            ?full-height="${null===(l=this.config)||void 0===l?void 0:l.fullHeight}"
            ?fixed-footer="${null===(c=this.config)||void 0===c?void 0:c.fixedFooter}"
            ?hide-content-padding-top="${null===(d=this.config)||void 0===d?void 0:d.hideContentPaddingTop}"
            @help-modal-footer-button-click=${this._onModalAccept}
            @help-modal-footer-link-click=${this._onModalClose}
            @help-modal-header-right-primary-click=${this._onModalClose} 
            accessibility-text-icon-right-primary=${this.t("bbva-feature-alwayson-modal-accessibility-button-right","")}>
            ${Object.keys((null===(m=this.config)||void 0===m?void 0:m.extraContent)||{}).length>0?this._renderModalContent():""}
        </bbva-help-modal>   
    `}}class ve extends(c(ee(d(b)))){static get is(){return"alwayson-movement-detail"}static get scopedElements(){const e=[I,V,A,q,P,h,u,ce,g,B,be,...ve.configurationScopedElements()];return ve.scopedElementsFromClasses(e)}static get properties(){return{movementId:{attribute:"movement-id",type:String},isPending:{attribute:"is-pending",type:Boolean},detailData:{type:Object},movementAmount:{attribute:"movement-amount",type:Number},localCurrency:{attribute:"local-currency",type:String},_selectedOperation:{attribute:!1,type:String,state:!0},_isInterbank:{attribute:!1,type:Boolean,state:!0}}}static get styles(){return[de,$("alwayson-movement-detail-shared-styles")]}constructor(){super(),this.config={header:{accessibilityTextIconLeftPrimary:this.t("bbva-feature-alwayson-movement-detail-accessibility-header-title",""),variant:"modal",text:this.t("bbva-feature-alwayson-movement-detail-header-title"),iconLeftPrimary:z()},loader:!1},this.movementId="",this.detailData={},this.movementAmount=0,this.isPending=!1,this.localCurrency="",this._isInterbank=!1,this._selectedOperation=""}connectedCallback(){super.connectedCallback(),this.addEventListener("header-main-icon-left-primary-click",this._dipatchEventBackStep.bind(this))}disconnectedCallback(){super.disconnectedCallback(),this.removeEventListener("header-main-icon-left-primary-click",this._dipatchEventBackStep.bind(this))}_dipatchEventBackStep(){this.dispatchEvent(new CustomEvent("alwayson-movement-detail-backstep",{bubbles:!0,composed:!0}))}get _getGenericModal(){return this.shadowRoot.querySelector('#modal[data-tag-name="always-on-modal"]')}set _setSelectedOperation(e){this._selectedOperation=e}_openModal(e){this._getGenericModal.open(e)}_getMovementStatus(){return this.isPending?this.t("bbva-feature-alwayson-movement-detail-pending-status"):this.t("bbva-feature-alwayson-movement-detail-cancelled-status")}_getOperationsButtons(e){const{transferType:t=""}=this.detailData,a=[{icon:O(),label:this.t("bbva-feature-alwayson-movement-detail-edit-operation-text"),id:"button-1"},{icon:N(),label:this.t("bbva-feature-alwayson-movement-detail-cancel-operation-text"),id:"button-2"}];return this._isInterbank="INSTANT_PAYMENTS"===t||!t,this._isInterbank&&a.shift(),e?w`
      <bbva-button-row
        .options=${a}
        variant="simple"
        @button-row-item-click=${e=>this._onOperationsClick(e)}>
      </bbva-button-row>
    `:null}_onOperationsClick(e){const t=this._isInterbank?"1":e.detail;this._setSelectedOperation=t?"Cancel":"Edit",this._isInterbank&&(this._setSelectedOperation="Cancel");const a={id:t?"cancel":"edit",titleIcon:R(),title:t?this.t("bbva-feature-alwayson-cancel-modal-title"):this.t("bbva-feature-alwayson-edit-modal-title"),bodyText:t?this.t("bbva-feature-alwayson-cancel-modal-text"):this.t("bbva-feature-alwayson-edit-modal-text"),buttonText:this.t("bbva-feature-alwayson-operation-button-text"),linkText:this.t("bbva-feature-alwayson-operation-link-text")};this._openModal(a)}_getMovementDetailList(e){return this._parseMovementDetail(e).map((e=>{const{label:t,value:a,isMasked:i,isAmount:o}=e;return w`
        <div class="detail-item">
          <bbva-text 
            class="detail-item__label" 
            text=${this.t(t)} 
            font-weight="300" 
            size="S" 
            tag="span">
          </bbva-text>
          ${o?w`
              <bbva-amount
                amount=${a}
                currency-code=${this.localCurrency}
                local-currency=${this.localCurrency}
                language="es-MX"
                variant="m">
              </bbva-amount>`:w`
              <bbva-text 
                text=${i?this._getMaskedValue(a):a} 
                size="S" 
                tag="span">
              </bbva-text>`}
        </div>
      `}))}_getSummaryTemplate(){return w`
      <div class="movement__summary">
      <bbva-text 
        text=${this.t("bbva-feature-alwayson-movement-detail-summary-description-text")}
        font-weight="300" 
        size="S" 
        tag="span">
      </bbva-text>
      <bbva-amount
        class="movement__amount"
        amount="-${this.movementAmount}" 
        currency-code=${this.localCurrency}
        local-currency=${this.localCurrency}
        language="es-MX" 
        variant="4xl">
      </bbva-amount>
      <div class="movement__status">
        <bbva-badge-default
          text=${this._getMovementStatus()}>
        </bbva-badge-default>
        <bbva-link @click=${this._onInfoClick}
        aria-label=${this.t("bbva-feature-alwayson-movement-detail-accessibility-link","")}>
          <bbva-icon 
            icon=${R()}
            size="24">
          </bbva-icon>
        </bbva-link>
      </div>
    </div>
    `}_getDetailContentTemplate(){return w`
      <div class="movement__content">
        ${this._getOperationsButtons(this.isPending)}
        ${this.isPending?w`
            <bbva-notification-message
              class="movement__notification"
              variant="information"
              message=${this.t("bbva-feature-alwayson-movement-detail-notification-message")}>
            </bbva-notification-message>`:""}
        <div class="detail-list">
          ${this._getMovementDetailList(this.detailData)}
        </div>
      </div>
    `}_getMaskedValue(e){return`•${e.toString().slice(-4)}`}_parseMovementDetail(e){var t,a;if(!e||!Object.keys(e).length)return[];const{id:i,concept:o,sender:n,receiver:s,sentMoney:r,transferDate:l,lastUpdateTransferDate:c}=e;return[{label:this.t("bbva-feature-alwayson-movement-detail-source-account-label"),value:null==n||null===(t=n.contract)||void 0===t?void 0:t.number,isMasked:!0},{label:this.t("bbva-feature-alwayson-movement-detail-amount-label"),value:r.amount,isAmount:!0},{label:this.t("bbva-feature-alwayson-movement-detail-description-label"),value:o},{label:this.t("bbva-feature-alwayson-movement-detail-destination-account-label"),value:null==s||null===(a=s.contract)||void 0===a?void 0:a.number,isMasked:!0},{label:this.t("bbva-feature-alwayson-movement-detail-date-label"),value:moment(l).format("DD MMMM YYYY")},{label:this.t("bbva-feature-alwayson-movement-detail-time-label"),value:`${moment(c).format("HH:mm")} h`},{label:this.t("bbva-feature-alwayson-movement-detail-folio-label"),value:i}]}_onInfoClick(){this._selectedOperation="";const e={id:"info",titleIcon:R(),title:this.isPending?this.t("bbva-feature-alwayson-pending-info-modal-title"):this.t("bbva-feature-alwayson-cancelled-info-modal-title"),bodyText:this.isPending?this.t("bbva-feature-alwayson-pending-info-modal-text"):this.t("bbva-feature-alwayson-cancelled-info-modal-text"),buttonText:this.t("bbva-feature-alwayson-info-modal-button-text"),linkText:""};this._openModal(e)}_onModalAccept(){this._dispatchCustomEvent("alwayson-detail-request-cancel",this.movementId)}_onEditMovementAccept(){this._dispatchCustomEvent("always-on-detail-request-edit"),this._dispatchCustomEvent("always-on-detail-navigate-to-transfers",{page:"transfers",movement:this.detailData,params:{continue:"featureAlwayson"}})}render(){return w`
      ${super.render()}
      ${this._getSummaryTemplate()}
      ${this._getDetailContentTemplate()}
      <always-on-modal 
        id="modal"
        @always-on-modal-cancel-accept="${this._onModalAccept}"
        @always-on-modal-edit-accept=${this._onEditMovementAccept}>
      </always-on-modal>
    `}}customElements.define(ce.is,ce);var ue=t`:host {
  display: block;
  box-sizing: border-box;
  height: 100%;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container-padding: 0;
}

[data-tag-name=bbva-badge-default] {
  margin-bottom: 1rem;
}

[data-tag-name=bbva-divider] + .movement-card {
  margin-top: 1rem;
}

.movements__container {
  margin: 1.5rem 1rem 0rem;
}

.movements-list__date {
  margin-top: 2.5rem;
  margin-bottom: 2rem;
  padding: 0rem;
}
.movements-list__item {
  display: flex;
  justify-content: space-between;
  align-items: baseline;
  overflow: hidden;
}

.empty-screen {
  margin-top: 2.5rem;
}
.empty-screen__content {
  display: flex;
  justify-content: center;
}
.empty-screen__description {
  margin-top: 3rem;
}

.movement-card__title {
  color: var(--bbva-list-movement-card-title-color, var(--bbva-medium-blue, #1973b8));
  font-weight: 500;
  font-size: 1rem;
  line-height: calcWithSpacer(24px);
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
.movement-card__description {
  line-height: calcWithSpacer(24px);
  color: var(--bbva-list-movement-explanation-concept-color, var(--bbva-500, #666666));
  font-size: 0.9375rem;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
.movement-card__amount {
  display: block;
}
`;j();class he extends(c(ee(d(b)))){static get is(){return"alwayson-pending-movements"}static get scopedElements(){const e=[ce,ae,F,V,G,g,I,q,...he.configurationScopedElements()];return he.scopedElementsFromClasses(e)}static get properties(){return{listMovements:{type:Array}}}static get styles(){return[ue,$("alwayson-pending-movement-shared-styles")]}constructor(){super(),this.listMovements=[],this.config={header:{accessibilityTextIconLeftPrimary:this.t("bbva-feature-alwayson-pending-movement-accessibility-header-title",""),variant:"modal",text:this.t("bbva-feature-alwayson-header-title-movements"),iconLeftPrimary:z()},loader:!0}}connectedCallback(){super.connectedCallback(),this.addEventListener("header-main-icon-left-primary-click",this._dipatchEventBackStep.bind(this))}disconnectedCallback(){super.disconnectedCallback(),this.removeEventListener("header-main-icon-left-primary-click",this._dipatchEventBackStep.bind(this))}_dipatchEventBackStep(){this.dispatchEvent(new CustomEvent("alwayson-pending-movements-backstep",{bubbles:!0,composed:!0}))}_renderListMovements(){return w`
      <bbva-notification-message
        message="${this.t("bbva-feature-alwayson-notification-message")}">
      </bbva-notification-message>
      ${this._renderPendingMovement()}
    `}_pendingMovementClick(e){this._dispatchCustomEvent("alwayson-pending-movement-item-click",e,!1,!1)}_renderPendingMovement(){return w`${this.listMovements.map((e=>w`
          <div class="movements-list">
            <bbva-header-category class="movements-list__date" text="${e.headerText}"></bbva-header-category>
          </div>

          ${e.transactions.map((e=>w`
              <div 
                id="${`id${e.id}`}" 
                class="movements-list__item movement-card" 
                @click="${()=>this._pendingMovementClick(e.id)}"
                @keydown="${t=>13===t.keyCode&&this._pendingMovementClick(e.id)}"
              >
                <div>
                  <bbva-text id="card-title" class="movement-card__title" tag="span" text="${(null==e?void 0:e.cardTitle)||""}"></bbva-text>
                  <bbva-text id="explanation" class="movement-card__description" tag="span" text="${e.description}"></bbva-text>
                  <bbva-badge-reference entity="entity:BBVAESMMXXX" number="${e.accountNumber}"></bbva-badge-reference>
                  <bbva-badge-default text="${e.badgeText}" type="${e.textType}"> </bbva-badge-default>
                </div>
                <div id="content">
                  <bbva-amount 
                    id="card-amount" 
                    class="movement-card__amount"
                    amount="${e.amount}" 
                    currency-code="${e.currencyCode}"
                    local-currency="${e.localCurrency}"
                    language="es-MX" >
                  </bbva-amount>
                </div>
              </div>
              <bbva-divider size="full"></bbva-divider>
            `))}
        `))}`}_renderEmptyMovements(){return w`
      <div class="empty-screen">
        <bbva-clip-microillustration
          microillustration="emptystateday"
          size="XL">
        </bbva-clip-microillustration>
        <div class="empty-screen__content">
          <bbva-text
            class="empty-screen__description"
            tag="span"
            size="S"
            text="${this.t("bbva-feature-alwayson-empty-screen-description")}">
          </bbva-text>
        </div>
      </div>`}render(){return w`
      ${super.render()}
      <div class="movements__container">
          ${this.listMovements&&this.listMovements.length>0?this._renderListMovements():this._renderEmptyMovements()}
      </div>
    `}}class ge extends(c(ee(ne(d(b))))){static get is(){return"bbva-feature-alwayson"}static get scopedElements(){const e=[be,ve,he,te,B,...ge.configurationScopedElements()];return ge.scopedElementsFromClasses(e)}static get properties(){return{localCurrency:{attribute:"local-currency",type:String},apiVersion:{attribute:"api-version",type:String},_requiredOTP:{attribute:!1,type:Boolean,state:!0},_isVisibleListMovements:{attribute:!1,type:Boolean,state:!0},_isMovementDetailPageVisible:{attribute:!1,type:Boolean,state:!0},_listMovements:{attribute:!1,type:Array,state:!0},_resetModal:{attribute:!1,type:Boolean,state:!0},_movementId:{attribute:!1,type:String,state:!0},_movementDetailData:{attribute:!1,type:Object,state:!0},_isPendingMovement:{attribute:!1,type:Boolean,state:!0},_movementAmount:{attribute:!1,type:Number,state:!0},_transfersApi:{attribute:!1,type:Object,state:!0},_requestType:{attribute:!1,type:String,state:!0},_hideView:{attribute:!1,type:Boolean,state:!0},_cancelInit:{attribute:!1,type:Boolean,state:!0},_selectedAccountNumber:{attribute:!1,type:String,state:!0}}}static get styles(){return[se,$("bbva-feature-alwayson-shared-styles")]}constructor(){super(),this.config={header:!1,loader:!0},this.localCurrency="",this.apiVersion="1",this._requiredOTP=!1,this._isVisibleListMovements=!0,this._isMovementDetailPageVisible=!1,this._listMovements=[],this._transfersApi={},this._requestType="",this._hideView=!1,this._movementId="",this._movementDetailData={},this._isPendingMovement=!1,this._movementAmount=0,this._resetModal=!1,this._cancelInit=!1,this._selectedAccountNumber=""}firstUpdated(){this.showLoader(),this._transfersApi=this.shadowRoot.querySelector("#dataproviderTransfers")}get _getModal(){return this.shadowRoot.querySelector("#modal")}init(){this._cancelInit||(this._initPendingMovementsRequest(),this._resetModal=!1)}validateNavigation(e={}){var t;this._cancelInit=Object.keys(e)&&"transfers"===(null==e||null===(t=e.value)||void 0===t?void 0:t.fromPage)}enableView(){this._hideView=!1}setAccountNumber({accountSelectedNumber:e}){this._selectedAccountNumber=e}_reset(){this.localCurrency="",this._isVisibleListMovements=!0,this._isMovementDetailPageVisible=!1,this._movementId="",this._movementDetailData={},this._isPendingMovement=!1,this._movementAmount=0,this._resetModal=!0,this._hideView=!1}_exit(){this._dispatchCustomEvent("alwayson-pending-movements-backstep"),this._reset()}_handleNavigation(e=!1){this._isVisibleListMovements=e,this._isMovementDetailPageVisible=!e}_onMovementSelected({detail:e}){this._movementId=e,this._handleNavigation(),this._initMovementDetailRequest(e)}_onRequestCancellation({detail:e}){this._movementId=e,this._initMovementCancellation(e)}_getDataproviderTransfers(){return w`
      <bbva-dataprovider-transfers
        id="dataproviderTransfers"
        host=${this.host}
        version=${this.apiVersion}
        requiredToken=${this.requiredToken}
        ?requiredOTP=${this._requiredOTP}
        ?native=${this.native}
        @pending-transfers-get-success=${this._onPendingTransfersGetSuccess}
        @error-on-get-pending-transfers=${this._onRequestError}
        @pending-transfer-detail-get-success=${this._onMovementDetailGetSuccess}
        @error-on-get-pending-transfer-detail=${this._onRequestError}
        @pending-transfer-cancel-success=${this._onMovementCancelSuccess}
        @error-on-cancel-pending-transfer=${this._onRequestError}
        @signature-required-first-step-dm=${()=>{this._hideView=!0}}
        @signature-required-dm=${()=>{this._hideView=!0}}
        @signature-canceled-dm=${this._onSignCancel}
        @api-dm-error=${this._onRequestError}>
      </bbva-dataprovider-transfers>
    `}_getPendingMovementsView(){return w`
      <bbva-transition-container id="always-on-pending-movements" ?visible="${this._isVisibleListMovements}" ?reverse-animation="${!0}">
        <div slot="slot-content">
          ${this._isVisibleListMovements?super.render():""}
          <alwayson-pending-movements
            .listMovements="${this._listMovements}"
            @alwayson-pending-movement-item-click="${this._onMovementSelected}"
            @alwayson-pending-movements-backstep=${this._reset}>
          </alwayson-pending-movements>
        </div>
      </bbva-transition-container>
    `}_getMovementDetailView(){return w`
      <bbva-transition-container id="alwaysonMovementDetail" ?visible="${this._isMovementDetailPageVisible}" ?hidden=${this._hideView}>
        <div slot="slot-content">
          ${this._isMovementDetailPageVisible?super.render():""} 
          <alwayson-movement-detail
            local-currency="${this.localCurrency}"
            movement-id=${this._movementId}
            movement-amount=${this._movementAmount}
            .detailData="${this._movementDetailData}"
            ?is-pending=${this._isPendingMovement}
            @alwayson-movement-detail-backstep="${()=>this._handleNavigation(!0)}"
            @alwayson-detail-request-cancel=${this._onRequestCancellation}
            @always-on-detail-navigate-to-transfers=${()=>{this._hideView=!0}}>
          </alwayson-movement-detail>
        </div>
      </bbva-transition-container>
    `}_onSignCancel(){this._hideView=!1,this.clearLoader()}_onRequestError(){this._getModal.openErrorModal(this._requestType)}_initPendingMovementsRequest(){this._requestType="movement-list",this.showLoader(),this._transfersApi.pendingTransfersGet()}_initMovementDetailRequest(e){this._requestType="movement-detail",this.showLoader(),this._transfersApi.pendingTransferDetailGet(e)}async _initMovementCancellation(e){this._requestType="movement-cancel";const t={body:{status:{id:"REJECTED"}},transferId:e};this._requiredOTP=!0,await this.updateComplete,this.showLoader(),this._transfersApi.pendingTransferCancelPatch(t)}_onPendingTransfersGetSuccess({detail:e}){const t=this._filteredMovements(e),a=this._groupMovements(t),i=this._sortMovements(a),o=this._parseMovementGroups(i),n=this._sortMovementGroups(o);this._listMovements=n,this.clearLoader(),this._resetModal=!0}_onMovementDetailGetSuccess({detail:e}){const{sentMoney:t={amount:0},status:a={id:"CANCELLED"}}=e;this._movementAmount=t.amount,this._isPendingMovement="PENDING"===a.id,this._movementDetailData=e,this.clearLoader(),this._resetModal=!0}_onMovementCancelSuccess(){this._hideView=!1;const e={id:"cancel-success",fullHeight:!0,fixedFooter:!0,hideContentPaddingTop:!0,headerText:this.t("bbva-feature-alwayson-movement-detail-success-cancel-modal-header"),buttonText:this.t("bbva-feature-alwayson-movement-detail-success-cancel-modal-button-text"),extraContent:{isSuccess:!0}};this._getModal.open(e),this.clearLoader()}_filteredMovements(e){return e.filter((e=>{var t,a;return(null==e||null===(t=e.sender)||void 0===t||null===(a=t.contract)||void 0===a?void 0:a.number)===this._selectedAccountNumber}))}_groupMovements(e){const t={};return e.forEach((e=>{const[a]=e.transferDate.split("T");t[a]?t[a].push(e):t[a]=[e]})),t}_sortMovements(e){const t={...e};return Object.keys(t).forEach((e=>t[e].sort(((e,t)=>new Date(t.lastUpdateTransferDate)-new Date(e.lastUpdateTransferDate))))),t}_parseMovementGroups(e){const t={localCurrency:this.localCurrency,currencyCode:this.localCurrency,image:"entity:BBVAESMMXXX",altImage:"Bankinter"};return Object.keys(e).map((a=>({headerText:moment(a).format("DD MMMM YYYY"),transferDate:a,transactions:e[a].map((({id:e,sentMoney:a,status:i,sender:o,concept:n=""})=>{var s;return{...t,id:e,cardTitle:n,amount:null==a?void 0:a.amount,badgeText:"PENDING"===(null==i?void 0:i.id)?this.t("bbva-feature-alwayson-pending-movement-pending-status"):this.t("bbva-feature-alwayson-pending-movement-cancelled-status"),textType:"PENDING"===(null==i?void 0:i.id)?"pending":"error",description:this.t("bbva-feature-alwayson-pending-movement-type-bbva"),accountNumber:null==o||null===(s=o.contract)||void 0===s?void 0:s.number}}))})))}_sortMovementGroups(e){return e.sort(((e,t)=>new Date(t.transferDate)-new Date(e.transferDate)))}render(){return w`
    ${this._getDataproviderTransfers()}
    ${this._getPendingMovementsView()}
    ${this._getMovementDetailView()}
    <always-on-modal 
      id="modal"
      ?reset-properties=${this._resetModal}
      @always-on-modal-cancel-success-accept=${this._exit}
      @always-on-modal-retry-error-movement-list-accept=${this._initPendingMovementsRequest}
      @always-on-modal-retry-error-movement-detail-accept=${()=>this._initMovementDetailRequest()}
      @always-on-modal-retry-error-movement-cancel-accept=${()=>this._initMovementCancellation()}
      @always-on-modal-retry-error-exit-flow-accept=${this._exit}
      @always-on-modal-close=${this._exit}>
    </always-on-modal>
    `}}L("colors.cool80");class pe extends ge{static get is(){return"bbva-feature-alwayson-mx"}static get properties(){return{}}}customElements.define(pe.is,pe);
