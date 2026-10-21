import{z as t,a8 as e,ac as i,ab as a,ad as o,an as l,cR as n,aq as s,bw as r,ak as d,h,i as c,aV as b,bF as p,av as m,L as u,cy as g,bm as v,bn as y,cz as _,bl as f,aX as x,b3 as k}from"./952f98a9.js";import{R as $,S,v as w,W as T,f as B,x as C,G as A,h as I,H as E,K as L,V as M,z as P,D as z,T as H,N as D,af as F,ae as q,M as R,j as O}from"./216055dc.js";import{B as N,b as j}from"./77df3611.js";import{aI as V,aH as W}from"./7f3d7ca9.js";var X=t`
:host {
  --_help-modal-content-bg-color:
  var(--bbva-help-modal--_ambient--content-bg-color,
    var(--bbva-help-modal--custom--primary-alt-ambient--content-bg-color,
      ${$("colorPrimaryAltSurfaceAmbientDefault",S)}));
  --_help-modal-title-icon-color:
  var(--bbva-help-modal--_ambient--title-icon-color,
    var(--bbva-help-modal--custom--primary-alt-ambient--title-icon-color,
      ${$("colorPrimaryAltSupportInfoDefault",S)}));
  --_help-modal-title-icon-color-warning:
  var(--bbva-help-modal--_ambient--title-icon-color-warning,
    var(--bbva-help-modal--custom--primary-alt-ambient--title-icon-color-warning,
      ${$("colorPrimaryAltSupportErrorDefault",S)}));
  --_help-modal-title-icon-color-caution:
    var(--bbva-help-modal--_ambient--title-icon-color-caution,
      var(--bbva-help-modal--custom--primary-alt-ambient--title-icon-color-caution,
        ${$("colorPrimaryAltSupportWarningDefault",S)}));
  --_help-modal-title-color:
    var(--bbva-help-modal--_ambient--title-color,
      var(--bbva-help-modal--custom--primary-alt-ambient--title-color,
        ${$("colorPrimaryAltText01Default",S)}));
  --_help-modal-content-color:
    var(--bbva-help-modal--_ambient--content-color,
      var(--bbva-help-modal--custom--primary-alt-ambient--content-color,
        ${$("colorPrimaryAltText01Default",S)}));
  --_help-modal-footer-bg-color:
  var(--bbva-help-modal--_ambient--footer-bg-color,
    var(--bbva-help-modal--custom--primary-alt-ambient--footer-bg-color,
      ${$("colorPrimaryAltSurfaceAmbientDefault",S)}));
  --_help-modal-veil-bg-color:
  var(--bbva-help-modal--_ambient--veil-bg-color,
    var(--bbva-help-modal--custom--primary-alt-ambient--veil-bg-color,
      ${$("colorPrimaryAltSurfaceAmbientOverlay",S)}));
  --_help-modal-ios-header-bg-color: var(--bbva-help-modal--_ambient--ios-header-bg-color,
    var(--bbva-help-modal--custom--primary-alt-ambient--ios-header-bg-color,
      ${$("colorPrimaryAltSurfaceAmbientOverlay",S)}));
  --_help-modal-full-height-bg-color:
   var(--bbva-help-modal--_ambient--full-height-bg-color,
     var(--bbva-help-modal--custom--primary-alt-ambient--full-height-bg-color,
       ${$("colorPrimaryAltSurfaceAmbientDefault",S)}));
  --_help-modal-divider-color:
    var(--bbva-help-modal--_ambient--divider-color,
      var(--bbva-help-modal--custom--primary-alt-ambient--divider-color,
        ${$("colorPrimaryAltFormatDivider",S)}));
  --_help-modal-focus-color-primary:
    var(--bbva-help-modal--_ambient--focus-color-primary,
      ${$("colorPrimaryAltSurfaceAmbientFocus",S)});
  --_help-modal-veil-bg-color-without-scroll:
    var(--bbva-help-modal--_ambient--veil-bg-color-without-scroll,
      ${$("colorPrimarySurfaceAlternativeDefault",S)});
}
`,U=t`
:host {
  --bbva-help-modal-safe-area-inset-top: 0;
  --bbva-help-modal-safe-area-inset-bottom: 0;
  --_help-modal-transition-duration: var(--bbva-help-modal-transition-duration, 0.4s);
  --_help-modal-veil-transition-duration: var(--bbva-help-modal-veil-transition-duration, 0.3s);
  --_help-modal-transition-easing: var(--bbva-help-modal-transition-easing, cubic-bezier(0.2, 0, 0.1, 1));
  --_help-modal-veil-transition-easing: var(--bbva-help-modal-veil-transition-easing, cubic-bezier(0.2, 0, 0.1, 1));
  --_help-modal-veil-transition-delay: var(--bbva-help-modal-veil-transition-delay, 0.15s);
  --_help-modal-transition-delay: var(--bbva-help-modal-transition-delay, 0.3s);
  --_veil-bg-color: var(--_help-modal-veil-bg-color);
  --_help-modal-padding-bottom: var(--bbva-help-modal-padding-bottom, 1rem);
  --bbva-help-modal-display-desktop-mode: inherit;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  display: flex;
  visibility: hidden;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

:host([transition-without-scroll]) .veil {
  background-color: var(--_help-modal-veil-bg-color-without-scroll);
}
:host([transition-without-scroll]) .transition-container {
  transition: none;
}
:host([transition-without-scroll]) .transition-container:not([dragging]) {
  transition: none;
}

.veil {
  position: fixed;
  opacity: 0;
  pointer-events: none;
  transition: visibility 0.7s ease-in-out, opacity var(--_help-modal-veil-transition-duration) var(--_help-modal-veil-transition-easing) var(--_help-modal-veil-transition-delay);
  visibility: hidden;
}

.modal-main {
  display: flex;
  width: 100%;
  max-width: 45rem;
  height: 100%;
  flex-direction: column;
  padding-bottom: calc(var(--_help-modal-padding-bottom) + var(--bbva-help-modal-safe-area-inset-bottom) / 2);
  overflow-y: auto;
}

.transition-container {
  position: fixed;
  z-index: 1;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  width: 100%;
  max-width: 45rem;
  box-sizing: border-box;
  margin: 0 auto;
  transform: translateY(100%);
  transition: visibility 0.7s, transform var(--_help-modal-transition-duration) var(--_help-modal-transition-easing) var(--_help-modal-transition-delay);
  will-change: transform;
}
.transition-container.half-height:not(.desktop) {
  top: auto;
  max-height: 87%;
}
.transition-container.half-height:not(.desktop) .modal-main {
  padding-bottom: calc(1.5rem + var(--bbva-help-modal-safe-area-inset-bottom));
  background-color: var(--_help-modal-content-bg-color);
}
.transition-container .help-modal {
  display: grid;
  width: 100%;
  height: 100%;
  box-sizing: border-box;
  align-items: center;
  margin: auto;
  background-color: var(--_help-modal-content-bg-color);
}

:host([dragging]) {
  user-select: none;
}

:host(:not([hide-content-padding-top])) .transition-container.desktop .modal-content-wrapper {
  padding: 0;
}

.modal-header {
  width: 100%;
  max-width: 45rem;
  background-color: var(--_help-modal-content-bg-color);
}

.divider {
  height: 1.5rem;
  padding-top: 0.0625rem;
  margin: 0;
}
.divider hr {
  width: 3.5rem;
  margin-right: auto;
  margin-left: auto;
  background-color: var(--_help-modal-divider-color);
}

.desktop .divider {
  display: none;
}

.modal-container {
  width: 100%;
  align-items: center;
  padding: var(--bbva-help-modal-padding, 0 1rem 0);
  outline: 0;
}

.modal-title {
  position: relative;
  display: flex;
  flex-direction: column;
  font-size: var(--bbva-help-modal-title-font-size, var(--typographyTypeMedium, ${e(i.typeMedium)}));
  font-weight: var(--bbva-help-modal-title-font-weight, var(--fontFacePrimaryMediumFontWeight, ${e(a.medium.fontWeight)}));
  line-height: var(--bbva-help-modal-title-line-height, var(--lineHeightTypeMedium, ${e(o.typeMedium)}));
  outline: 0;
}
.modal-title .title-icon {
  margin-bottom: var(--bbva-help-modal-title-icon-margin-bottom, 1rem);
  fill: var(--_help-modal-title-icon-color);
}
.modal-title [data-tag-name=bbva-type-text] {
  width: 100%;
  color: var(--_help-modal-title-color);
}
.modal-title [data-tag-name=bbva-type-text].subtitle {
  margin: 0.5rem 0 0.5rem 0;
}

.desktop .modal-content-wrapper,
.desktop .modal-content,
.desktop .slot-content {
  overflow: hidden;
}
.desktop .slot-content {
  overflow-y: auto;
}
.desktop .modal-title .microillustration-container {
  display: flex;
  align-items: flex-start;
  justify-content: space-between;
}
.desktop .modal-title .microillustration-container [data-tag-name=bbva-clip-microillustration] {
  margin-top: 1.5rem;
}
.desktop .modal-title [data-tag-name=bbva-type-text] {
  margin-bottom: 0.5rem;
}
.desktop .icon-close {
  position: absolute;
  z-index: 1;
  top: -8px;
  right: 0;
  cursor: pointer;
}

.slot-footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: var(--bbva-help-modal-footer-padding, 1.5rem 1rem 0);
  gap: 1rem;
  transform: translateZ(0.01px);
}

:host([full-height]) .help-modal,
.desktop .help-modal {
  display: flex;
  flex-direction: column;
  background-color: var(--_help-modal-full-height-bg-color);
}
:host([full-height]) .slot-footer,
.desktop .slot-footer {
  padding: var(--bbva-help-modal-footer-padding, 1rem 1rem 0);
}
:host([full-height]) .modal-header,
.desktop .modal-header {
  z-index: 1;
  width: 100%;
}

.desktop .slot-footer {
  display: flex;
  width: 100%;
  flex-direction: row;
  align-items: center;
}

.desktop .slot-footer-link {
  display: flex;
  width: 100%;
  justify-content: flex-end;
  padding: var(--bbva-help-modal-footer-padding, 1rem 1.5rem 0 0);
  gap: 1rem;
}

.desktop .modal-footer {
  display: flex;
  align-items: center;
}

.modal-content {
  outline: 0;
}
.modal-content [data-tag-name=bbva-type-text] {
  color: var(--_help-modal-content-color);
}

:host([modal-type=warning]) .modal-title .title-icon {
  fill: var(--_help-modal-title-icon-color-warning);
}

:host([modal-type=caution]) .modal-title .title-icon {
  fill: var(--_help-modal-title-icon-color-caution);
}

.modal-content-wrapper {
  width: var(--bbva-help-modal-content-width, 100%);
  max-width: var(--bbva-help-modal-content-max-width, 100%);
  margin: 0 auto;
  color: var(--_help-modal-content-color);
  font-size: var(--bbva-help-modal-content-font-size, var(--typographyTypeSmall, ${e(i.typeSmall)}));
  line-height: var(--bbva-help-modal-content-line-height, var(--lineHeightTypeSmall, ${e(o.typeSmall)}));
  text-align: left;
}
:host(:not([hide-content-padding-top])) .modal-content-wrapper {
  padding-top: 1.5rem;
}

[data-tag-name=bbva-button-default].footer-button {
  --button-default-max-width: calc(100% - 32px);
  width: 100%;
  text-decoration: none;
}

.desktop [data-tag-name=bbva-button-default].footer-button {
  width: auto;
}

[data-tag-name=bbva-type-link].footer-button {
  margin: var(--bbva-help-modal-footer-last-button-margin, 0.75rem 0 0.75rem);
  text-align: center;
}

:host([fixed-footer]) .modal-container,
.desktop .modal-container {
  display: flex;
  flex-direction: column;
  flex-grow: 1;
  overflow-x: var(--bbva-help-modal-modal-container-overflow-x, inherit);
  overflow-y: auto;
}
:host([fixed-footer]) .modal-footer,
.desktop .modal-footer {
  width: 100%;
  background-color: var(--_help-modal-footer-bg-color);
  box-shadow: var(--bbva-help-modal-footer-fixed-shadow, 0 -3px 2px 0 rgba(18, 18, 18, 0.08));
}
:host([fixed-footer]) .modal-content-wrapper,
:host([fixed-footer]) .modal-content,
:host([fixed-footer]) .slot-content,
.desktop .modal-content-wrapper,
.desktop .modal-content,
.desktop .slot-content {
  display: flex;
  width: 100%;
  flex-direction: column;
  flex-grow: 1;
}
:host([fixed-footer]) .transition-container .modal-main,
.desktop .transition-container .modal-main {
  padding-bottom: var(--bbva-help-modal-safe-area-inset-bottom, 0);
}

:host([full-height][fixed-footer]) .slot-footer {
  padding-bottom: calc(var(--_help-modal-padding-bottom) + var(--bbva-help-modal-safe-area-inset-bottom) / 2);
}

:host([visible]) {
  visibility: visible;
}
:host([visible]) .veil {
  position: absolute;
  opacity: var(--_veil-opacity, 0.85);
  pointer-events: all;
  visibility: visible;
}
:host([visible]) .transition-container {
  transform: translate3d(0, var(--_translate, 0), 0);
  transition: none;
  will-change: transform;
}
:host([visible]) .transition-container .help-modal {
  display: flex;
  flex-direction: column;
}
:host([visible]) .transition-container:not([dragging]) {
  transition: visibility var(--_help-modal-transition-duration) var(--_help-modal-transition-delay), transform var(--_help-modal-transition-duration) var(--_help-modal-transition-easing) var(--_help-modal-transition-delay);
}

:host([visible][_secondmodal]) {
  z-index: var(--bbva-help-modal-second-modal-z-index, 11);
  overflow-y: auto;
}
:host([visible][_secondmodal]) .transition-container {
  position: fixed;
  max-height: calc(100% - 3.625rem);
  transform: translateY(3.625rem);
  transition: max-height var(--_help-modal-transition-duration) var(--_help-modal-transition-delay), transform var(--_help-modal-transition-duration) var(--_help-modal-transition-easing);
  will-change: transform;
}
:host([visible][_secondmodal]) .transition-container.scrollable {
  position: relative;
}
:host([visible][_secondmodal]) .modal-header {
  position: relative;
}
:host([visible][_secondmodal]) .modal-main {
  max-height: calc(100% - 3.625rem);
}
:host([visible][_secondmodal]) .modal-container {
  overflow-y: unset;
}
:host([visible][_secondmodal]) .modal-footer {
  position: sticky;
  bottom: 3.625rem;
}
:host([visible][_secondmodal]) .sticky {
  position: sticky;
  top: -3.625rem;
}

:host([visible][_secondmodal][_scrollableContentBottom]) .transition-container {
  max-height: 100%;
  transform: translateY(0);
  transition: transform var(--_help-modal-transition-duration) var(--_help-modal-transition-easing);
}
:host([visible][_secondmodal][_scrollableContentBottom]) .modal-main {
  max-height: 100%;
}

:host(:not([visible])) {
  position: relative;
  width: auto;
  height: auto;
  --bbva-help-modal-veil-transition-delay: 0.3s;
  --bbva-help-modal-transition-delay: 0.15s;
  --bbva-help-modal-transition-easing: cubic-bezier(0.8, 0, 1, 1);
  --bbva-help-modal-veil-transition-easing: cubic-bezier(0.8, 0, 1, 1);
  --_modal-padding: 0;
}
:host(:not([visible])) .transition-container {
  visibility: hidden;
}
:host(:not([visible]))[full-height] .veil {
  transition: none;
}
:host(:not([visible])) div[tabindex="0"] > .veil {
  opacity: 0;
  visibility: hidden;
}

@supports (padding-top: constant(safe-area-inset-top)) {
  :host([i-o-s-fixed-header]) [data-tag-name=bbva-header-main] {
    padding-top: 0;
  }
}
@supports (padding-top: env(safe-area-inset-top)) {
  :host([i-o-s-fixed-header]) [data-tag-name=bbva-header-main] {
    padding-top: 0;
  }
}

:host([visible][full-height]) {
  --bbva-help-modal-veil-transition-duration: 0.3s;
}

:host(:not([visible])[full-height]) {
  --bbva-help-modal-transition-duration: 0.4s;
}
:host(:not([visible])[full-height]) .transition-container {
  transform: translateY(100%);
}
:host(:not([visible])[full-height]) .modal-main {
  max-width: none;
}

.transition-container[_should-display-fixed-header] {
  position: fixed;
  padding-top: var(--bbva-help-modal-safe-area-inset-top, 0);
}
@supports (padding-top: constant(safe-area-inset-top)) {
  .transition-container[_should-display-fixed-header] {
    --bbva-help-modal-safe-area-inset-top: constant(safe-area-inset-top);
  }
}
@supports (padding-top: env(safe-area-inset-top)) {
  .transition-container[_should-display-fixed-header] {
    --bbva-help-modal-safe-area-inset-top: env(safe-area-inset-top);
  }
}

@supports (padding-top: constant(safe-area-inset-top)) {
  .iOS-fixed-header {
    --bbva-help-modal-safe-area-inset-top: constant(safe-area-inset-top);
  }
}
@supports (padding-top: env(safe-area-inset-top)) {
  .iOS-fixed-header {
    --bbva-help-modal-safe-area-inset-top: env(safe-area-inset-top);
  }
}
@supports (padding-bottom: constant(safe-area-inset-bottom)) {
  .modal-main {
    --bbva-help-modal-safe-area-inset-bottom: constant(safe-area-inset-bottom);
  }
}
@supports (padding-bottom: env(safe-area-inset-bottom)) {
  .modal-main {
    --bbva-help-modal-safe-area-inset-bottom: env(safe-area-inset-bottom);
  }
}
@supports (will-change: transform) {
  .transition-container {
    will-change: transform;
  }
}
.iOS-fixed-header {
  position: absolute;
  z-index: 5;
  bottom: calc(100vh - var(--bbva-help-modal-safe-area-inset-top, 0));
  width: 100%;
  height: var(--bbva-help-modal-safe-area-inset-top, 0);
  background-color: var(--_help-modal-ios-header-bg-color);
}

@media (min-width: 45rem) {
  :host([full-height]) .transition-container:not(.desktop) {
    padding-bottom: 0;
  }
  :host([full-height]) .modal-header {
    --bbva-header-main-max-width: 45rem;
  }
  :host([full-height]) .modal-container,
  :host([full-height]) .modal-footer {
    margin: auto;
  }
  :host([full-height]) .modal-container {
    max-width: 45rem;
    flex-grow: 1;
    overflow-y: auto;
  }
  :host([full-height]) .modal-footer {
    width: 45rem;
  }
  :host([full-height]) .modal-footer .slot-footer {
    padding-bottom: 1.5rem;
  }
  .modal-title [data-tag-name=bbva-type-text] {
    width: 40rem;
  }
}
.transition-container.desktop {
  bottom: unset;
  display: var(--bbva-help-modal-display-desktop-mode);
  max-width: 100%;
  margin-top: 3rem;
}
.transition-container.desktop .help-modal {
  height: auto;
  max-height: var(--bbva-help-modal-desktop-max-height, calc(100vh - 96px));
}
.transition-container.desktop .help-modal .modal-header {
  max-width: 100%;
  --bbva-header-main-max-width: 100%;
}
.transition-container.desktop .help-modal .modal-header [data-tag-name=bbva-header-main] {
  min-height: auto;
}
.transition-container.desktop .help-modal .modal-main {
  max-width: none;
  padding-bottom: 0;
}
.transition-container.desktop .help-modal .modal-main .modal-container {
  max-width: none;
  padding: 1rem 0.5rem 0 1.5rem;
}
.transition-container.desktop .help-modal .modal-main .modal-footer {
  width: 100%;
  max-width: none;
}
.transition-container.desktop .help-modal .modal-main .modal-footer .slot-footer {
  padding: 1.5rem;
}

.desktop .modal-content {
  padding-right: 1rem;
}

:host([modal-size=L]) .transition-container.desktop {
  max-width: 55.5rem;
}

:host([modal-size=M]) .transition-container.desktop {
  max-width: 50rem;
}

:host([modal-size=S]) .transition-container.desktop {
  max-width: 38rem;
}
`;class Y extends(w(l(T(n)))){static get is(){return"bbva-help-modal"}static get scopedElements(){return{"bbva-button-default":B,"bbva-type-icon":C,"bbva-type-text":A,"bbva-header-main":I,"bbva-type-link":E,"bbva-clip-microillustration":L}}static get properties(){return{closeModalElements:{type:Array,attribute:"close-modal-elements"},closeModalIndex:{type:Array,attribute:"close-modal-index"},avoidIconCloseModal:{type:Boolean,attribute:"avoid-icon-close-modal"},headerText:{type:String,attribute:"header-text"},headerType:{type:String,attribute:"header-type"},headerButtons:{type:Array},headerShowLeftIcon:{type:Boolean,attribute:"header-show-left-icon"},headerLeftIconLabel:{type:String,attribute:"header-left-icon-label"},headerLeftIconAriaLabel:{type:String,attribute:"header-left-icon-aria-label"},headerCloseIconLabel:{type:String,attribute:"header-close-icon-label"},headerCloseIconAriaLabel:{type:String,attribute:"header-close-icon-aria-label"},footerButtonAriaLabel:{type:String,attribute:"footer-button-aria-label"},footerLinkAriaLabel:{type:String,attribute:"footer-link-aria-label"},headerPosition:{type:String,attribute:"header-position"},headerLogo:{type:String,attribute:"header-logo"},headerLeftIcon:{type:Object},titleIcon:{type:String,attribute:"title-icon"},titleText:{type:String,attribute:"title-text"},subtitleText:{type:String,attribute:"subtitle-text"},descriptionText:{type:String,attribute:"description-text"},bodyText:{type:String,attribute:"body-text"},buttonText:{type:String,attribute:"button-text"},linkText:{type:String,attribute:"link-text"},secondaryLinkText:{type:String,attribute:"secondary-link-text"},fixedFooter:{type:Boolean,attribute:"fixed-footer",reflect:!0},stickyFooter:{type:Boolean,attribute:"sticky-footer",reflect:!0},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header",reflect:!0},iOSDevices:{type:Array,attribute:"i-o-s-devices"},userAgentRegex:{type:String,attribute:"user-agent-regex"},hideContentPaddingTop:{type:Boolean,attribute:"hide-content-padding-top",reflect:!0},modalType:{type:String,reflect:!0,attribute:"modal-type"},idModal:{type:String,reflect:!0,attribute:"id-modal"},fullHeight:{type:Boolean,attribute:"full-height",reflect:!0},_secondModal:{type:Boolean,reflect:!0},_scrollable:{type:Boolean},scrollable:{type:Boolean},disabledButton:{type:Boolean,attribute:"disabled-button"},disabledLink:{type:Boolean,attribute:"disabled-link"},disabledSecondaryLink:{type:Boolean,attribute:"disabled-secondary-link"},titleLines:{type:Number,attribute:"title-lines"},_translate:{type:Number},illustration:{type:String},altIllustration:{type:String,attribute:"alt-illustration"},altImage:{type:String,attribute:"alt-image"},modalSize:{type:String,attribute:"modal-size",reflect:!0},_desktop:{type:Boolean,state:!0},transitionWithoutScroll:{type:Boolean,attribute:"transition-without-scroll",reflect:!0},buttonHref:{type:String,attribute:"button-href"},buttonTarget:{type:String,attribute:"button-target"},_scrollableContentBottom:{type:Boolean,reflect:!0},scrollContentEvent:{type:String,attribute:"scroll-content-event"}}}constructor(){super(),this.closeModalElements=["footer-button","footer-link"],this.closeModalIndex=[],this.headerText="",this.headerType="",this.headerButtons=[],this.headerShowLeftIcon=!1,this.headerLeftIconLabel="",this.headerLeftIconAriaLabel="",this.headerCloseIconLabel="",this.headerCloseIconAriaLabel="",this.headerPosition="",this.headerLogo="",this.modalSize="L",this.titleIcon="",this.titleText="",this.subtitleText="",this.descriptionText="",this.bodyText="",this.buttonText="",this.linkText="",this.iOSFixedHeader=!1,this.iOSDevices=["iOS","iPhone"],this.userAgentRegex=/\(([^)]+)\)/,this.hideContentPaddingTop=!1,this.modalType="",this.resetScroll=!0,this.fullHeight=!1,this.disabledButton=!1,this.disabledLink=!1,this.disabledSecondaryLink=!1,this.transitionWithoutScroll=!1,this._modalHeight=0,this._translate=0,this._swipe=!1,this.avoidIconCloseModal=!1,this._desktop=!1,this._secondModal=!1,this._scrollable=!1,this.scrollable=!1,this._focusHandlerTimeout=400,this._scrollableContentBottom=!1,this.scrollContentEvent="",this.addEventListener("header-main-buttons-set",this._setCloseModalButtons)}static get _mediaQueries(){return{_desktop:"(min-width: 62rem)"}}get _headerButtons(){return this.headerButtons.map((t=>{const e={...t};return"bbva:close"===e.icon&&(e.defaultEventIconName="header-main-close-icon-click"),e}))||[]}async firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),await this.updateComplete,this._modal=this.shadowRoot.querySelector(".help-modal"),this._header=this.shadowRoot.querySelector(".modal-header"),this._content=this.shadowRoot.querySelector(".modal-content-wrapper"),this._footer=this.shadowRoot.querySelector(".modal-footer"),this._container=this.shadowRoot.querySelector(".modal-container"),this._transition=this.shadowRoot.querySelector(".transition-container"),this._headerHeight=this._header.offsetHeight,this.removeAttribute("aria-modal"),requestAnimationFrame((()=>{this._modalHeight=this._modal.offsetHeight})),this.fullHeight||(s(this._header,"track",(t=>this._onTrack(t))),r(this._header,"pan-y")),this._checkHeight(),this._secondModal=Y._isSecondModal(this)&&this.fullHeight,this.addEventListener("scroll",this._secondModalScroll),this._secondModal&&this.scrollContentEvent&&this.addEventListener(this.scrollContentEvent,this._contentScroll)}_secondModalScroll(){this._sticky=this._header.getBoundingClientRect().y,this._header.classList.toggle("sticky",this._sticky<1||!this._header.classList.contains("sticky"))}_contentScroll({detail:t}){this._scrollableContentBottom=t>0,this._header.classList.toggle("sticky",t>0||!this._header.classList.contains("sticky"))}_setCloseModalButtons(t){var e;const i=null==t||null===(e=t.detail)||void 0===e?void 0:e.buttons;if(!this.closeModalIndex.length&&!this.avoidIconCloseModal){const t=(i||[]).findIndex((t=>"bbva:close"===t.icon));this.closeModalIndex.push(this.headerShowLeftIcon?t+1:t)}}updated(t){if(super.updated&&super.updated(t),t.has("visible")){let t="close";this.visible?(t="open",this.getAttribute("aria-label")&&this.removeAttribute("aria-label"),this._secondModal&&this._setupScrollable(),window.setTimeout((()=>{this._updateAccessibility()}),300)):(this._translate=0,this._secondModal&&this.scrollContentEvent&&(this._scrollableContentBottom=!1)),this.dispatchEvent(new CustomEvent(`help-modal-${t}`,{detail:{status:t},bubbles:!0,composed:!0})),this.dispatchEvent(new CustomEvent("modal-state-change",{detail:{status:t,visible:this.visible,modal:this},bubbles:!0,composed:!0}))}}_setupScrollable(){var t,e;const i=window.innerHeight-this._footer.clientHeight-this._header.clientHeight-58;this._scrollable=this.scrollable||i<(null===(t=this._container)||void 0===t?void 0:t.scrollHeight)||i>(null===(e=this._transition)||void 0===e?void 0:e.clientHeight)}static _isSecondModal(t){let e=t.attachToBody?t._placeholder.parentNode:t.parentNode;for(;null!=e;){if("BBVA-HELP-MODAL"===e.nodeName||e.nodeName.includes("BBVA-HELP-MODAL"))return!0;e=e.parentNode||e.host}return!1}static get styles(){return[super.styles,X,U,M.primaryAlt,P.primaryAlt,z.primaryAlt,H.primaryAlt,D.primaryAlt,d("bbva-help-modal-shared-styles")]}_onTrack(t){var e;if(null!=t&&null!==(e=t.detail)&&void 0!==e&&e.state)switch(t.detail.state){case"start":this._trackStart();break;case"end":this._trackEnd(t.detail.dy);break;default:this._trackY(t.detail.dy)}}_trackStart(){this._transition.setAttribute("dragging","")}_trackY(t){t>0?(this._swipe=!0,this._translate=t):this._translate=0}_trackEnd(t){t>this._modalHeight/3?(this.visible=!1,this._translate=this._modalHeight,this._gestureCloseModal()):this._translate=0,this._swipe=!1,this._transition.removeAttribute("dragging","")}_gestureCloseModal(){this.dispatchEvent(new CustomEvent("help-modal-swipe-close",{detail:!0,bubbles:!0,composed:!0}))}get _fixedIOSHeader(){return h`
      <div ?hidden="${!this._shouldDisplayFixedHeader()}" class="iOS-fixed-header"></div>
    `}get _headerType(){return this.headerType||(this.fullHeight||this._desktop?"modal-initial":"modal-short")}get helpModalHeader(){return this.headerText&&!this._desktop?h`
        <slot name="slot-header" class="header-slot">
          <bbva-header-main
            id="helpModalHeader"
            text="${this.headerText}"
            variant="${this._headerType}"
            position="${this.headerPosition}"
            logo="${this.headerLogo}"
            .buttons="${this._headerButtons}"
            ?show-left-icon="${this.headerShowLeftIcon}"
            .leftIcon="${this.headerLeftIcon}"
            left-icon-label="${this.headerLeftIconLabel}"
            left-icon-aria-label="${this.headerLeftIconAriaLabel}"
            @header-main-icon-click="${t=>this._handleClick(t,"header")}"
            @header-main-close-icon-click="${this._manageHeaderClose}"
            close-icon-label="${this.headerCloseIconLabel}"
            close-icon-aria-label="${this.headerCloseIconAriaLabel}"
          ></bbva-header-main>
        </slot>
      `:this.fullHeight?"":h`
        <div class="divider">
          <hr aria-hidden="true" />
        </div>
      `}get helpModalContent(){return h`
      <div id="helpModalContent" class="modal-content">
        <span class="slot-content-header"><slot name="slot-content-header"></slot></span>
        <div class="slot-content" tabindex="${c(this._desktop?0:void 0)}">
          ${this.descriptionText?h`<bbva-type-text
                id="description-text"
                .text=${this.descriptionText}
                ?hidden="${!this.descriptionText}"
                size="S"
                ellipsis
                lines="3"
                unset
              >
              </bbva-type-text>`:h`<slot name="slot-content"><div>${this.bodyText}</div></slot>`}
        </div>
      </div>
    `}get _veilClickable(){return this._secondModal||!this.fullHeight||this.fullHeight&&this._desktop}get _veilTpl(){return h`
      <div
        class="veil"
        @mouseup="${this._veilClickable&&this._onVeilClick}"
        @keyup="${t=>27===t.keyCode&&this._veilClickable&&this._onVeilClick}"
        @click="${this._veilClickable&&this._onVeilClick}"
      ></div>
    `}get helpModalFooter(){return h`
      <div class="modal-footer">
        <slot name="slot-footer">
          <div class="slot-footer" ?hidden="${!this.buttonText&&!this.linkText}">
            <bbva-button-default
              ambient="primary-alt"
              class="footer-button"
              href="${c(this.buttonHref)}"
              target="${c(this.buttonTarget)}"
              text=${this.buttonText}
              aria-label=${c(this.t(this.footerButtonAriaLabel))}
              data-tag-name="bbva-button-default"
              ?hidden="${!this.buttonText}"
              ?disabled="${this.disabledButton}"
              @click="${t=>this._handleClick(t,"footer-button")}"
            >
            </bbva-button-default>
            ${this.linkText?h`<bbva-type-link
                  ambient="primary-alt"
                  class="footer-button link"
                  data-tag-name="bbva-type-link"
                  ?disabled="${this.disabledLink}"
                  aria-label=${c(this.t(this.footerLinkAriaLabel))}
                  @click="${t=>this._handleClick(t,"footer-link")}"
                  ?hidden="${!this.linkText}"
                  >${this.linkText}</bbva-type-link
                >`:null}
          </div>
          <div class="slot-footer-link">
            ${this.secondaryLinkText&&this._desktop?h`<bbva-type-link
                  ambient="primary-alt"
                  class="footer-button link secondary"
                  data-tag-name="bbva-type-link"
                  ?disabled="${this.disabledSecondaryLink}"
                  @click="${t=>this._handleClick(t,"footer-secondary-link")}"
                  ?hidden="${!this.secondaryLinkText}"
                  >${this.secondaryLinkText}</bbva-type-link
                >`:null}
          </div>
        </slot>
      </div>
    `}get helpModalTitle(){return h`
      <div id="helpModalTitle" class="modal-title">
        ${this._desktop?h`${this._tplButton}`:b}
        <slot name="slot-title">
          ${this._desktop?this.microillustrationTpl:h`<bbva-type-icon
                class="title-icon"
                data-tag-name="bbva-type-icon"
                size="24"
                icon="${this.titleIcon}"
                ?hidden="${!this.titleIcon}"
                aria-hidden="true"
              ></bbva-type-icon>`}
          ${this.titleText?h` <bbva-type-text
                id="title-text"
                .text=${this.titleText}
                ?hidden="${!this.titleText}"
                ellipsis
                .lines="${this.titleLines}"
                unset
                size="${this.titleSize}"
                font-weight="500"
                tag="h2"
              >
              </bbva-type-text>`:null}
          ${this._desktop&&this.subtitleText?h` <bbva-type-text
                id="sub-title-text"
                class="subtitle"
                .text=${this.subtitleText}
                ?hidden="${!this.subtitleText}"
                ellipsis
                unset
                size="M"
                tag="h2"
              >
              </bbva-type-text>`:null}
        </slot>
      </div>
    `}get _tplButton(){return h` <bbva-button-default
      aria-label="Close"
      class="icon-close"
      @click="${()=>this.close()}"
      variant="icon no-background alternative"
      .icon="${p()}"
    >
    </bbva-button-default>`}get microillustrationTpl(){return this.illustration||this.altIllustration?h`<div class="microillustration-container">
        <bbva-clip-microillustration
          alt-microillustration="${c(this.altIllustration)}"
          alt-image="${c(this.altImage)}"
          microillustration="${c(this.illustration)}"
          size="M"
        ></bbva-clip-microillustration>
      </div>`:h``}get titleSize(){return this._desktop?"2XL":"L"}_updateAccessibility(){const t=this.headerText||this.titleText||this.bodyText;!this.getAttribute("aria-label")&&t&&this.setAttribute("aria-label",t)}_checkHeight(){this._container.offsetHeight>=this._content.offsetHeight?this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","none"):this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","0 -3px 2px 0 rgba(18, 18, 18, 0.08)")}_runScrollReset(){const t=this._getFirstScrollableParent(this._container);requestAnimationFrame((()=>{requestAnimationFrame((()=>{null==t||t.scrollTo(0,0)}))}))}_setFooterShadow(t){const e=Math.ceil(t.currentTarget.scrollTop),i=this._desktop?1:0;e>=this._header.offsetHeight+this._content.offsetHeight+this._footer.offsetHeight-this._modal.offsetHeight-i?(this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","none"),this.dispatchEvent(new CustomEvent("help-modal-content-scroll-bottom-reach",{detail:!0,bubbles:!0,composed:!0}))):this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","0 -3px 2px 0 rgba(18, 18, 18, 0.08)")}_handleClick(t,e){var i;const a=null==t||null===(i=t.detail)||void 0===i?void 0:i.index;this.dispatchEvent(new CustomEvent(`help-modal-${e}-click`,{detail:{index:a},bubbles:!0,composed:!0})),(this.closeModalElements.includes(e)||this.closeModalIndex.includes(a)||this._desktop)&&this.close()}_manageHeaderClose(t){var e;const i=null==t||null===(e=t.detail)||void 0===e?void 0:e.index;!this.closeModalIndex.includes(i)||this.avoidIconCloseModal&&!this._desktop||this.close()}_onVeilClick(){super._onVeilClick&&super._onVeilClick(),this._handleClick({},"veil")}_shouldDisplayFixedHeader(){const t=window.navigator.userAgent.match(this.userAgentRegex)[1].split(";");return this.iOSFixedHeader&&this.iOSDevices.includes(t[0])}_handleTransitionend(t){const{propertyName:e}=t;this.dispatchEvent(new CustomEvent("help-modal-transitionend",{detail:{propertyName:e,visible:this.visible},bubbles:!0,composed:!0}))}get _modalContent(){return h`
      ${this._fixedIOSHeader}
      <section
        class="transition-container  ${m({"half-height":!this.fullHeight,desktop:this._desktop,scrollable:this._scrollable})}"
        style="--_translate: ${this._translate}px"
        ?_should-display-fixed-header="${this._shouldDisplayFixedHeader()}"
        @transitionend=${this._handleTransitionend}
      >
        <div class="help-modal">
          <div class="modal-header">${this.helpModalHeader}</div>
          <div class="modal-main">
            <div class="modal-container" @scroll="${this._setFooterShadow}">
              <div class="modal-content-wrapper">
                ${this.helpModalTitle} ${this.helpModalContent}
              </div>
            </div>
            ${this._secondModal?"":this.helpModalFooter}
          </div>
          ${this._secondModal?this.helpModalFooter:""}
        </div>
      </section>
    `}}var Q=t`
:host {
  position: relative;
  display: block;
  width: 100%;
  height: 100%;
  box-sizing: border-box;
}

.panel-info {
  padding: 1rem;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}

[data-tag-name=bbva-banner-image] {
  padding: 0;
}

.action-area {
  position: absolute;
  z-index: 0;
  top: 0;
  left: 0;
  display: flex;
  width: 100%;
  height: 100%;
  justify-content: space-between;
}
.action-area .back-area {
  flex: 0 0 49%;
}
.action-area .next-area {
  flex: 0 0 49%;
}

:host ::slotted([slot=interactive-area]) {
  margin: var(--bbva-help-onboarding-interactive-area-margin, 0 0 0 1rem);
}
`;class G extends(w(l(u))){static get is(){return"bbva-help-onboarding-slide"}static get scopedElements(){return{"bbva-type-text":A,"bbva-clip-microillustration":L,"bbva-banner-image":F}}static get properties(){return{microillustration:{type:String},altMicroillustration:{type:String,attribute:"alt-microillustration"},altImage:{type:String,attribute:"alt-image"},bannerImage:{type:String,attribute:"banner-image"},imgSize:{type:String,attribute:"img-size"},imgLabel:{type:String,attribute:"img-label"},bgImage:{type:String,attribute:"bg-image"},slideTitle:{type:String,attribute:"slide-title"},description:{type:String},loading:{type:Boolean}}}constructor(){super(),this.ambient="secondary",this.slideTitle="",this.description="",this.loading=!1,this.imgLabel="",this.imgSize="M"}static get styles(){return[Q,D.secondary,z.secondary,q.secondary,d("bbva-help-onboarding-shared-styles")]}firstUpdated(){this._contentInteractiveSlot=this.shadowRoot.querySelector('slot[name="interactive-area"]').assignedElements({flatten:!0}),this._content=this.shadowRoot.querySelector(".content");const t=this.shadowRoot.querySelector(".next-area"),e=this.shadowRoot.querySelector(".back-area");t.addEventListener("touchend",(()=>{this._changeSlideEvent("next")})),e.addEventListener("touchend",(()=>{this._changeSlideEvent("back")}))}_changeSlideEvent(t){this.dispatchEvent(new CustomEvent(`help-onboarding-slide-${t}-tap`,{detail:this._currentSlide,bubbles:!0,composed:!0}))}render(){var t,e;return h`
      <div
        class="action-area"
        style="height:${null!==(t=this._contentInteractiveSlot)&&void 0!==t&&t.length?`${null===(e=this._content)||void 0===e?void 0:e.offsetHeight}px`:"100%"}"
      >
        <div class="back-area"></div>
        <div class="next-area"></div>
      </div>
      <div class="content">
        ${!this.bannerImage||this.microillustration||this.altMicroillustration?"":h`<bbva-banner-image
              ?loading="${this.loading}"
              size="${this.imgSize}"
              image-src="${this.bannerImage}"
              img-accessibility-text="${this.t(this.imgLabel)}"
            >
            </bbva-banner-image>`}
        <div class="panel-info">
          ${this.microillustration?h`<bbva-clip-microillustration
                ?loading="${this.loading}"
                class="panel-image"
                aria-hidden="true"
                microillustration="${this.microillustration}"
                size="M"
              ></bbva-clip-microillustration>`:""}
          ${this.altMicroillustration?h`<bbva-clip-microillustration
                ?loading="${this.loading}"
                class="panel-image"
                alt-microillustration="${this.altMicroillustration}"
                alt-image="${this.altImage}"
                size="M"
              ></bbva-clip-microillustration>`:""}
          ${this.slideTitle?h`<bbva-type-text
                ?loading="${this.loading}"
                class="panel-title"
                tag="h2"
                size="3XL"
                font-weight="bold"
                unset
                text=${this.slideTitle}
              ></bbva-type-text>`:""}
          ${this.description?h`<bbva-type-text
                ?loading="${this.loading}"
                size="S"
                tag="p"
                class="panel-info-description"
                text=${this.description}
              ></bbva-type-text>`:""}

          <slot name="slide-slot"></slot>
        </div>
      </div>
      <slot name="interactive-area"></slot>
    `}}var K=t`
:host {
  --_bbva-help-onboarding-bg-color:
      var(--bbva-help-onboarding--custom--secondary-ambient--bg-color,
      ${$("colorSecondarySurfaceAmbientDefault",S)});
  --_bbva-help-onboarding-uncomplete-step-color:
      var(--bbva-help-onboarding--custom--secondary-ambient--uncomplete-step-color,
      ${$("colorSecondarySurfaceAmbientPreloading",S)});
  --_bbva-help-onboarding-complete-step-color:
      var(--bbva-help-onboarding--custom--secondary-ambient--complete-step-color,
      ${$("colorSecondarySelectionInteraction01BackgroundSelected",S)});
  --_bbva-help-onboarding-container-bg-color:
      var(--bbva-help-onboarding--custom--secondary-ambient--container-bg-color,
      ${$("colorPrimarySurfaceAlternativeDefault",S)});
  --_bbva-help-onboarding-overlay-bg-color:
      var(--bbva-help-onboarding--custom--primary-ambient--overlay-bg-color,
      ${$("colorPrimarySurfaceAmbientOverlay",S)});
  --_bbva-help-onboarding-skeleton-quote-color:
      var(--bbva-help-onboarding--custom--primary-ambient--skeleton-quote-color,
      ${$("colorPrimarySurfaceAmbientDefault",S)});
  --_bbva-help-onboarding-skeleton-animated-layer-bg:
      var(--bbva-help-onboarding--custom--primary-ambient--skeleton-animated-layer-bg,
      ${$("colorPrimarySurfaceAmbientPreloading",S)});
}
`,Z=t`
:host {
  display: flex;
  overflow: hidden;
  width: 100%;
  height: 100vh;
  box-sizing: border-box;
  flex-direction: column;
  justify-content: space-between;
}

:host([visible]) {
  background-color: var(--_bbva-help-onboarding-bg-color);
}

:host([_hasBgImage]) {
  background-position: center;
  background-size: cover;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

@supports (padding-top: env(safe-area-inset-top)) {
  :host {
    --safe-area-inset-top: env(safe-area-inset-top);
    padding-top: var(--safe-area-inset-top, 0);
  }
}
@supports (padding-bottom: env(safe-area-inset-bottom)) {
  :host {
    --safe-area-inset-bottom: env(safe-area-inset-bottom);
    padding-bottom: var(--safe-area-inset-bottom, 0);
  }
}
*,
*::before,
*::after {
  box-sizing: inherit;
}

.controls {
  display: flex;
  width: 100%;
  flex-direction: row;
  justify-content: space-between;
  padding: 0.25rem;
}

.carousel-items {
  display: flex;
  height: 100%;
  transform: translateX(0%);
  transition: transform 0.45s ease 0s;
}

.carousel-item {
  overflow: hidden;
  height: 100%;
  flex: 1 0 100%;
  margin-right: 1rem;
}

.footer {
  display: flex;
  flex-direction: column;
  padding: 1.5rem 1rem;
}
.footer.desktop {
  padding: 1.5rem;
}
.footer [data-tag-name=bbva-type-link] {
  align-self: center;
}
.footer [data-tag-name=bbva-type-link]:first-child {
  margin-bottom: 1.5rem;
}

.carousel-container {
  margin-bottom: 1.5rem;
  overflow-x: hidden;
}
.carousel-container.mobile {
  margin-bottom: 0;
}

.action-buttons {
  display: flex;
  justify-content: center;
  padding-bottom: 1.5rem;
}
.action-buttons :nth-child(2) {
  margin-left: 1rem;
}

.step-bar-inner {
  display: flex;
  overflow: hidden;
  width: 100%;
  padding: 0;
  margin-top: 0;
  margin-bottom: 0;
  margin-left: 0;
  list-style: none;
}

.step-bar-inner-content {
  position: relative;
  display: flex;
  height: 0.125rem;
  justify-content: center;
  margin: 0.125rem;
  background-color: var(--_bbva-help-onboarding-uncomplete-step-color);
  text-align: center;
}

.progress-onboarding {
  position: absolute;
  left: 0;
  width: 0;
  height: 0.125rem;
  background: var(--_bbva-help-onboarding-complete-step-color);
}

.actions-area {
  position: absolute;
  z-index: 0;
  width: 100%;
  height: 100%;
}
.actions-area .action-button {
  width: 50%;
  height: 100%;
  float: left;
}

.wrapper {
  position: absolute;
  display: flex;
  width: 100%;
  height: 100%;
  align-items: center;
  justify-content: center;
}
.wrapper .close {
  position: absolute;
  top: -1rem;
  right: -1.25rem;
  cursor: pointer;
}
.wrapper .container-onboarding {
  position: relative;
  background-color: var(--_bbva-help-onboarding-container-bg-color);
}
.wrapper .container-onboarding .title-container {
  margin-top: 0.75rem;
}
.wrapper .container-onboarding .title-container .panel-info-description {
  margin-top: 1rem;
  margin-bottom: 1.5rem;
}
.wrapper .container-onboarding .title-container.desktop [data-tag-name=bbva-type-text] {
  --bbva-type-text--_ambient-skeleton-quote-color: var(--_bbva-help-onboarding-skeleton-quote-color);
  --bbva-type-text--_ambient-skeleton-animated-layer-bg: var(--_bbva-help-onboarding-skeleton-animated-layer-bg);
}

[data-tag-name=bbva-carousel-default] {
  --bbva-carousel-default--custom--primary-ambient--skeleton-quote-color: var(--_bbva-help-onboarding-skeleton-quote-color);
  --bbva-carousel-default--custom--primary-ambient--skeleton-animated-layer-bg: var(--_bbva-help-onboarding-skeleton-animated-layer-bg);
  overflow: hidden;
}

.btn-container [data-tag-name=bbva-type-link] {
  --bbva-type-link--_ambient--skeleton-animated-layer-bg-color: var(--_bbva-help-onboarding-skeleton-animated-layer-bg);
  --bbva-type-link--_ambient--skeleton-quote-color: var(--_bbva-help-onboarding-skeleton-quote-color);
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-display-desktop-mode: flex;
}

.mobile-container [data-tag-name=bbva-help-modal] {
  --bbva-help-modal--_ambient--full-height-bg-color: var(--_bbva-help-onboarding-bg-color);
  --bbva-help-modal-padding: 0;
}

.footer.mobile {
  background-color: var(--_bbva-help-onboarding-bg-color);
}
`,J=t`

[data-tag-name='bbva-help-modal'] {
  --bbva-help-modal--_ambient--full-height-bg-color: var(--_bbva-help-onboarding-bg-color, ${$("colorSecondarySurfaceAmbientDefault",S)});
  --bbva-help-modal-padding: 0;
  --bbva-help-modal-overflow-x-desktop-mode: hidden;
  --bbva-help-modal-modal-container-overflow-x: hidden;
}

[data-tag-name='bbva-carousel-default'] {
  overflow: hidden;
}

.desktop[data-tag-name='bbva-help-modal'] {
  --bbva-help-modal--_ambient--full-height-bg-color: var(--_bbva-help-onboarding-bg-color, ${$("colorPrimarySurfaceAlternativeDefault",S)});
  --bbva-help-modal-display-desktop-mode: flex;
}
.desktop .container {
  background-color: var(--_bbva-help-onboarding-bg-color, ${$("colorPrimarySurfaceAlternativeDefault",S)});
}

.desktop .close {
  position: absolute;
  cursor: pointer;
  top: -16px;
  right: -20px;
 }

.container {
    position: relative;
    background-color: var(--_bbva-help-onboarding-bg-color, ${$("colorSecondarySurfaceAmbientDefault",S)});
    --bbva-help-modal-padding: 0;;
    .title-container {
      margin-top: 12px;
      .panel-info-description {
        margin-top: 16px;
        margin-bottom: 24px;
      }
    }
  }

.controls {
  display: flex;
  width: 100%;
  flex-direction: row;
  justify-content: space-between;
  padding: 4px;
}

ul {
  display: flex;
  overflow: hidden;
  width: 100%;
  padding: 0;
  margin-top: 0;
  margin-bottom: 0;
  margin-left: 0;
  list-style: none;
}

li {
  position: relative;
  display: flex;
  height: 2px;
  justify-content: center;
  margin: 2px;
  background-color: var(--_bbva-help-onboarding-uncomplete-step-color, ${$("colorSecondarySurfaceAmbientPreloading",S)});
  text-align: center;
}

.progress {
  position: absolute;
  left: 0;
  width: 0;
  height: 2px;
  background: var(--_bbva-help-onboarding-bg-color, ${$("colorPrimarySurfaceAlternativeDefault",S)});
}

.action-area{
  position: absolute;
  z-index: 0;
  top: 0;
  left: 0;
  display: flex;
  width: 100%;
  height: 100%;
  justify-content: space-between;
  .back-area{
    flex: 0 0 49%;
  }
  .next-area{
    flex: 0 0 49%;
  }
}

.controls {
  display: flex;
  width: 100%;
  flex-direction: row;
  justify-content: space-between;
  padding: 4px;
}

.carousel-items {
  display: flex;
  height: 100%;
  transform: translateX(0%);
  transition: transform 0.45s ease 0s;
}

.carousel-item {
  overflow: hidden;
  height: 100%;
  flex: 1 0 100%;
  margin-right: 16px;
}

.footer {
  display: flex;
  flex-direction: column;
  padding: 24px 16px;
  &.desktop {
    padding: 24px;
  }

  &.mobile {
    background-color:var(--_bbva-help-onboarding-bg-color, ${$("colorSecondarySurfaceAmbientDefault",S)});
  }

  [data-tag-name='bbva-type-link'] {
    align-self: center;

    &:first-child {
      margin-bottom: 24px;
    }
  }
}

.carousel-container {
  margin-bottom: 24px;
  overflow-x: hidden;
  &.mobile {
    margin-bottom: 0;
  }
}

.action-buttons {
  display: flex;
  justify-content: center;
  padding-bottom: 24px;

  & :nth-child(2) {
    margin-left: 16px;
  }
}

`;let tt;class et extends(w(l(T(u)))){static get is(){return"bbva-help-onboarding"}static get scopedElements(){return{"bbva-type-text":A,"bbva-button-default":B,"bbva-type-link":E,"bbva-help-onboarding-slide":G,"bbva-clip-microillustration":L,"bbva-carousel-default":N,"bbva-help-modal":Y}}static get _mediaQueries(){return{_desktop:"(min-width: 62rem)",_large:"(min-width: 75rem)"}}static get properties(){return{carouselAccessibilityText:{type:String,attribute:"carousel-accessibility-text"},secondaryButtonText:{type:String,attribute:"secondary-button-text"},primaryButtonText:{type:String,attribute:"primary-button-text",reflect:!0},linkTextTop:{type:String,attribute:"link-text-top"},linkText:{type:String,attribute:"link-text"},visible:{type:Boolean,reflect:!0},playing:{type:Boolean,reflect:!0},playingDelay:{type:Number,attribute:"playing-delay"},loading:{type:Boolean},loop:{type:Boolean},currentSlide:{type:Number,attribute:"current-slide"},_hasBgImage:{type:Boolean},_slides:{type:Array},_carouselSlides:{type:Array},_numSlides:{typeof:Number},_progress:{type:Array},_ariaLive:{type:String},_buttonPlayAriaLabel:{type:String},_desktop:{type:Boolean,attribute:!1},_large:{type:Boolean,attribute:!1},onBoardingTitle:{type:String,attribute:"on-boarding-title"},onBoardingSubtitle:{type:String,attribute:"on-boarding-subtitle"},_autoplay:{type:Boolean},attachToBody:{type:Boolean,attribute:"attach-to-body"},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header",reflect:!0}}}constructor(){super(),this.carouselAccessibilityText="bbva-help-onboarding-aria-label-carousel",this.currentSlide=0,this.loading=!1,this.visible=!1,this.playing=!1,this.playingDelay=3,this.loop=!1,this._play=g(),this._back=v(),this._next=y(),this._close=p(),this._progress=[],this._paused=!1,this._numButtons=0,this._numSlides=0,this._ariaLive="off",this._buttonPlayAriaLabel="bbva-help-onboarding-automatic-play",this._desktop=!1,this._large=!1,this._carouselSlides=[],this.onBoardingTitle="",this.onBoardingSubtitle="",this._autoplay=!1,this.attachToBody=!1,this.iOSFixedHeader=!1}static get styles(){return[K,Z,M.secondary,z.secondary,P.secondary,D.secondary,j.primary,z.primary,M.primary,d("bbva-help-onboarding-shared-styles")]}async firstUpdated(){this._autoplay=Boolean(this.playing),super.firstUpdated&&super.firstUpdated(),await this.updateComplete,this._slides=[...this.querySelectorAll('[data-tag-name="bbva-help-onboarding-slide"]')],this._desktop&&this._configureCarousel(),this._numSlides=this._slides.length,this._isBgWithImage(),this._controlProgress(),this.playing&&this._playState(),this.addEventListener("help-onboarding-slide-next-tap",this._nextSlide),this.addEventListener("help-onboarding-slide-back-tap",this._backSlide)}updated(t){if(super.updated(t),t.has(this._numSlides)&&(this._slides=[...this.querySelectorAll('[data-tag-name="bbva-help-onboarding-slide"]')]),(t.has("primaryButtonText")||t.has("secondaryButtonText"))&&(this._numButtons=0,this.secondaryButtonText&&(this._numButtons+=1),this.primaryButtonText&&(this._numButtons+=1),this.requestUpdate()),t.has("visible")){let t="close";var e;if(this.visible)null!==(e=this._slides)&&void 0!==e&&e.length&&this._autoplay&&!this._desktop&&(clearInterval(tt),this._togglePlay()),t="open";this.dispatchEvent(new CustomEvent(`help-onboarding-${t}`,{detail:{status:t},bubbles:!0,composed:!0}))}(t.has("currentSlide")&&!this._desktop||t.has("_desktop"))&&this._animationCarousel(),(t.has("_desktop")||t.has("_large"))&&(this._desktop||this._large)&&this._configureCarousel(),t.has("playing")&&this._numSlides>0&&this._playingChanged(),this.ambient=this._desktop||this._large?"primary":"secondary"}_configureCarousel(){const t=this.shadowRoot.querySelector('[data-tag-name="bbva-carousel-default"]')||document.querySelector('[data-tag-name="bbva-carousel-default"]');t&&(this._slides||(this._slides=[...this.querySelectorAll('[data-tag-name="bbva-help-onboarding-slide"]')]),t.scopedComponents=[{tagName:"bbva-type-text",class:A},{tagName:"bbva-clip-microillustration",class:L},{tagName:"bbva-banner-image",class:F}],this._carouselSlides=this._slides.map((t=>{const{microillustration:e,altMicroillustration:i,altImage:a,slideTitle:o,description:l,bannerImage:n,imgLabel:s}=t,r=t.querySelector('[slot="slide-slot"]');return{content:h`<div class="carousel-content" style="display: flex;">
            <div class="info-content" style="flex: 1 1 0;">
              ${i?this._getAltMicroillustration(i,a):""}
              ${e?this._getMicroillustration(e):""}
              ${this._onBoardingHeadlineTpl(o)} ${this._onBoardingDescription(l)}
            </div>
            <div class="area-content" style="flex: 1 1 0;">
              ${r||""} ${this._getBannerImage(n,s)}
            </div>
          </div>`}})))}_animationCarousel(){this.shadowRoot.querySelector(".carousel-items")?this.shadowRoot.querySelector(".carousel-items").setAttribute("style",`transform: translateX(calc(-${this.currentSlide}00% - ${16*this.currentSlide}px));`):document.querySelector(".carousel-items")&&document.querySelector(".carousel-items").setAttribute("style",`transform: translateX(calc(-${this.currentSlide}00% - ${16*this.currentSlide}px));`)}_disabledButton(t,e=!0){const i=this.shadowRoot.querySelector(`.${t}`);i&&(e?i.setAttribute("disabled",!0):i.removeAttribute("disabled"))}_isBgWithImage(){const t=this._slides[this.currentSlide].bgImage;t?(this._hasBgImage=!0,this._setBgImage(t)):this._hasBgImage=!1}_setBgImage(t){this.style.setProperty("--bbva-help-modal--_ambient--footer-bg-color","transparent"),this.style.setProperty("--bbva-help-onboarding--custom--secondary-ambient--bg-color","transparent"),this.style.backgroundImage=`url(${t})`}_controlProgress(){if(this._updateProgress(),this.currentSlide<this._progress.length&&this.playing){const t=this._progress[this.currentSlide];let e=0!==t?1e3*this.playingDelay*t/100:1;const i=10;tt=setInterval((()=>{const t=100*e/(1e3*this.playingDelay);e+=i;const a=this._progress;a[this.currentSlide]=t,this._progress=[...a],t>=100?(this.currentSlide!==this._progress.length-1?(this.currentSlide+=1,this._changeSlideEvent("next")):this.loop?this._nextSlide():(this._togglePlay(),this._disabledButton("next")),clearInterval(tt),this._controlProgress()):this._animationCarousel()}),i)}this._isBgWithImage()}_updateProgress(){(0===this._progress.length||0===this.currentSlide&&0===this._progress[0]||this._initialize)&&(this._progress=new Array(this._slides.length).fill(0),this.loop||this._disabledButton("back"),this._initialize=!1),this.currentSlide<=this._progress.length-1&&(this._progress[this.currentSlide]>0&&this._progress[this.currentSlide]<100?0!==this.currentSlide?this._progress=this._progress.fill(100,0,this.currentSlide-1).fill(0,this.currentSlide+1,this._progress.length):this._progress=this._progress.fill(0,this.currentSlide+1,this._progress.length):this.playing?this.currentSlide!==this._progress.length-1?this._progress=this._progress.fill(100,0,this.currentSlide).fill(0,this.currentSlide,this._progress.length):this._progress=this._progress.fill(100,0,this.currentSlide):this._progress=this._progress.fill(100,0,this.currentSlide+1).fill(0,this.currentSlide+1,this._progress.length))}_playState(){this._play=_(),this._paused=!1,this._buttonPlayAriaLabel="bbva-help-onboarding-automatic-pause",this._sendChangeStatusEvent("play")}_pauseState(){this._play=g(),this._paused=!0,this._buttonPlayAriaLabel="bbva-help-onboarding-automatic-play",this._sendChangeStatusEvent("pause")}_togglePlay(){this._ariaLive="off",this.playing=!this.playing}_playingChanged(){this.playing?(this.currentSlide===this._numSlides-1&&this._progress[this.currentSlide]>=100&&(this._initialize=!0,this.currentSlide=0),this._playState()):(clearInterval(tt),this._pauseState()),this._controlProgress()}_sendChangeStatusEvent(t){this.dispatchEvent(new CustomEvent(`help-onboarding-${t}`,{detail:{status:t,currentSlide:this.currentSlide},bubbles:!0,composed:!0}))}_carouselCurrentSelected(t){this.currentSlide<t.detail&&0!==t.detail&&this._nextSlide(),this.currentSlide>t.detail&&0!==t.detail&&this._backSlide()}_nextSlide(){this._ariaLive="polite",clearInterval(tt),this._progress[this.currentSlide]=100,this.currentSlide=(this.currentSlide+1)%this._numSlides,this._initialize=0===this.currentSlide&&this.loop,this._initialize||this.currentSlide!==this._numSlides-1||this.loop?this._disabledButton("next",!1):this._disabledButton("next"),this._controlProgress(),this._changeSlideEvent("next")}_changeSlideEvent(t){this.dispatchEvent(new CustomEvent(`help-onboarding-slide-${t}`,{detail:this.currentSlide,bubbles:!0,composed:!0}))}_backSlide(){this._ariaLive="polite",clearInterval(tt),this._progress[this.currentSlide]=0,this.currentSlide=this.currentSlide-1<0?this._numSlides-1:this.currentSlide-1,this._initialize=0===this.currentSlide,this._initialize&&!this.loop?this._disabledButton("back"):this._disabledButton("back",!1),this._isBgWithImage(),this._controlProgress(),this._changeSlideEvent("back")}_closeClick(){this.visible=!1,setTimeout((()=>{this.hidden=!0}),600),this.playing&&!this._desktop&&this._togglePlay(),this.dispatchEvent(new CustomEvent("help-onboarding-secondary-close-click",{detail:!0,bubbles:!0,composed:!0}))}_secondaryButtonClick(){this.dispatchEvent(new CustomEvent("help-onboarding-secondary-button-click",{detail:!0,bubbles:!0,composed:!0}))}_primaryButtonClick(){this.dispatchEvent(new CustomEvent("help-onboarding-primary-button-click",{detail:!0,bubbles:!0,composed:!0}))}_linkClick(){this.dispatchEvent(new CustomEvent("help-onboarding-link-click",{detail:!0,bubbles:!0,composed:!0}))}_linkTopClick(){this.dispatchEvent(new CustomEvent("help-onboarding-link-top-click",{detail:!0,bubbles:!0,composed:!0}))}_tplStepBar(){return h`${this.loading?"":h` <div class="step-bar">
          <ul aria-hidden="true" class="step-bar-inner">
            ${this._progress.map((t=>h`<li class="step-bar-inner-content" style="flex-basis:calc(100% /${this._numSlides})">
                <div class="progress-onboarding" style="width: ${t}%"></div>
              </li>`))}
          </ul>
        </div>`} `}_tplButtonIcon(t,e,i,a="",o=!1,l=32){return h` <bbva-button-default
      ambient="secondary"
      class="${a}"
      type="button"
      variant="icon no-background alternative"
      icon="${t}"
      @click="${e}"
      icon-size="${l}"
      aria-label=${this.t(i)}
      ?loading="${this.loading}"
      ?disabled="${o}"
    >
    </bbva-button-default>`}_tplCarouselItem(){var t;return h`
      ${null===(t=this._slides)||void 0===t?void 0:t.map(((t,e)=>h` <div
            class="carousel-item"
            aria-hidden=${this.currentSlide!==e?"true":"false"}
            role="group"
            aria-label="${this.t("bbva-help-onboarding-slide-aria-label",{slide:e+1,totalSlides:this._slides.length})}"
          >
            ${this._slides[e]}
          </div>`))}
    `}_tplActionButtons(t,e,i){return t?h`<bbva-button-default
        ambient="secondary"
        class="action-button"
        @click="${i}"
        text=${this.t(t)}
        variant=${e}
        ?fullwidth=${1===this._numButtons}
      >
      </bbva-button-default>`:""}get onBoardingTitleTpl(){return h`<bbva-type-text
      ?loading="${this.loading}"
      ambient="primary"
      class="panel-title"
      tag="h2"
      size="2XL"
      font-weight="bold"
      unset
      text=${this.t(this.onBoardingTitle)}
    ></bbva-type-text>`}get onBoardingSubtitleTpl(){return h`<bbva-type-text
      ?loading="${this.loading}"
      ambient="primary"
      size="M"
      tag="span"
      class="panel-info-description"
      text=${this.t(this.onBoardingSubtitle)}
    ></bbva-type-text>`}_onBoardingHeadlineTpl(t){return t?h`<bbva-type-text
          ?loading="${this.loading}"
          ambient="primary"
          class="panel-title"
          tag="h2"
          size="2XL"
          font-weight="bold"
          unset
          text=${this.t(t)}
        ></bbva-type-text>`:""}_onBoardingDescription(t){return t?h`<bbva-type-text
          ?loading="${this.loading}"
          ambient="primary"
          class="panel-title"
          tag="h2"
          size="M"
          unset
          text=${this.t(t)}
        ></bbva-type-text>`:""}_getBannerImage(t,e){return t?h`<bbva-banner-image
          image-src="${t}"
          img-accessibility-text="${this.t(e)}"
        >
        </bbva-banner-image>`:""}_getMicroillustration(t){return t?h`<bbva-clip-microillustration
          ?loading="${this.loading}"
          class="panel-image"
          aria-hidden="true"
          microillustration="${t}"
          size="M"
        ></bbva-clip-microillustration>`:""}_getAltMicroillustration(t,e){return t?h`<bbva-clip-microillustration
          ?loading="${this.loading}"
          class="panel-image"
          alt-microillustration="${t}"
          alt-image="${e}"
          size="M"
        ></bbva-clip-microillustration>`:""}get oneSlide(){return h` <div class="controls">
      <div>
        ${this._tplButtonIcon(this._play,this._togglePlay,this._buttonPlayAriaLabel,"play",!1)}
      </div>
      ${this._tplButtonIcon(this._close,this._closeClick,"bbva-help-onboarding-carousel-close","close",!1,24)}
    </div>`}get multiSlide(){return h` ${this._tplStepBar()}
      <div class="controls">
        <div>
          ${this._tplButtonIcon(this._play,this._togglePlay,this._buttonPlayAriaLabel,"play",!1)}
          ${this._tplButtonIcon(this._back,this._backSlide,"bbva-help-onboarding-chevron-prev-aria-label","back",!this.loop&&0===this.currentSlide)}
          ${this._tplButtonIcon(this._next,this._nextSlide,"bbva-help-onboarding-chevron-next-aria-label","next",!this.loop&&this.currentSlide===this._progress.length-1)}
        </div>
        ${this._tplButtonIcon(this._close,this._closeClick,"bbva-help-onboarding-carousel-close","close",!1,24)}
      </div>`}_desktopCloseClick({detail:t}){t||this._closeClick()}get desktopTpl(){return h`
      <div class="wrapper">
        <bbva-help-modal
          class="desktop"
          modal-size="${this._large?"L":"M"}"
          ?visible="${this.visible}"
          button-text="${this.t("bbva-help-onboarding-carousel-next")}"
          ?attach-to-body="${this.attachToBody}"
          .contentStyles="${J}"
          style=${f(J)}
          @visible-changed="${this._desktopCloseClick}"
        >
          <div class="container-onboarding" slot="slot-content-header">
            <div class="title-container desktop">
              ${this.onBoardingTitleTpl} ${this.onBoardingSubtitleTpl}
            </div>
          </div>
          <div slot="slot-content">
            <div class="carousel-container desktop">
              <bbva-carousel-default
                ambient="primary"
                type="swipe"
                variant="full-screen"
                .selected=${this.currentSlide}
                .items="${this._carouselSlides}"
                ?autoplay="${this.playing}"
                ?loading="${this.loading}"
                @carousel-default-item-select="${this._carouselCurrentSelected}"
                carousel-accessibility-text="${this.t(this.carouselAccessibilityText)}"
                show-play
              ></bbva-carousel-default>
            </div>
          </div>
          <div class="footer desktop" slot="slot-footer">
            ${this.loading?h`<bbva-type-link
                  ambient="primary"
                  ?loading="${this.loading}"
                  @click="${this._linkClick}"
                  >${this.linkText}</bbva-type-link
                >`:h`<bbva-button-default
                  ambient="primary"
                  aria-label="${this.t("bbva-help-onboarding-carousel-next")}"
                  @click="${this._primaryButtonClick}"
                  text="${this.t("bbva-help-onboarding-carousel-next")}"
                ></bbva-button-default>`}
          </div>
        </bbva-help-modal>
      </div>
    `}get mobileTpl(){var t;return h`
      <div class="mobile-container">
        <bbva-help-modal
          ?full-height="${!this.desktop}"
          ?i-o-s-fixed-header="${this.iOSFixedHeader}"
          fixed-footer
          ?visible="${this.visible}"
          button-text="${this.t("bbva-help-onboarding-carousel-next")}"
          hide-content-padding-top
          ?attach-to-body="${this.attachToBody}"
          .contentStyles="${J}"
          style=${f(J)}
        >
          <div class="container" slot="slot-content-header">
            ${this._desktop?b:h` ${this._tplStepBar()}
                  <div class="controls">
                    <div>
                      ${this._tplButtonIcon(this._play,this._togglePlay,this._buttonPlayAriaLabel,"play",!1)}
                      ${(null===(t=this._slides)||void 0===t?void 0:t.length)>1?h`${this._tplButtonIcon(this._back,this._backSlide,"bbva-help-onboarding-chevron-prev-aria-label","back",!this.loop&&0===this.currentSlide)}
                          ${this._tplButtonIcon(this._next,this._nextSlide,"bbva-help-onboarding-chevron-next-aria-label","next",!this.loop&&this.currentSlide===this._progress.length-1)}`:b}
                    </div>
                    ${this._tplButtonIcon(this._close,this._closeClick,"bbva-help-onboarding-carousel-close","close",!1,24)}
                  </div>`}
          </div>
          <div slot="slot-content">
            <div class="carousel-container mobile">
              <div class="carousel-items" aria-live="${this._ariaLive}">
                ${this._tplCarouselItem()}
              </div>
            </div>
          </div>
          <div class="footer mobile" slot="slot-footer">
            ${this.linkTextTop?h`<bbva-type-link
                  ambient="secondary"
                  ?loading="${this.loading}"
                  @click="${this._linkTopClick}"
                  >${this.linkTextTop}</bbva-type-link
                >`:""}
            ${this._numButtons>0&&!this.loading?h`<div class="action-buttons">
                  ${this._tplActionButtons(this.secondaryButtonText,"secondary",this._secondaryButtonClick)}
                  ${this._tplActionButtons(this.primaryButtonText,"",this._primaryButtonClick)}
                </div>`:""}
            ${this.linkText?h`<bbva-type-link
                  ambient="secondary"
                  ?loading="${this.loading}"
                  @click="${this._linkClick}"
                  >${this.linkText}</bbva-type-link
                >`:""}
          </div>
        </bbva-help-modal>
      </div>
    `}render(){return h`${this._desktop?this.desktopTpl:this.mobileTpl}`}}var it=t`
  :host {
    --onboarding-full-screen-carousel-main-bg-color: ${$("colorPrimaryAltSurfaceAmbientDefault",S)}; /* Decision token */
  }
`,at=t`
  :host {
    display: block;
    height: 100vh;
  }

  :host([hidden]),
  [hidden] {
    display: none !important;
  }

  .content {
    height: 90vh;
  }

  [data-tag-name='bbva-help-modal'] {
    --bbva-help-modal-padding: 0;
    --bbva-help-modal-padding-bottom: 0;
  }
`,ot=t`
  :host {
    display: block;
    min-height: 50vh;
    height: 100%;
  }
  :host .single {
    display: flex;
    flex-direction: column;
    height: 100%;
    background-color: var(--onboarding-full-screen-carousel-main-bg-color);
  }
  :host .single__content {
    padding: 1rem 1rem 0;
  }
  :host .single__content > *:first-child {
    margin-bottom: 1rem;
  }
  :host .single__footer {
    display: flex;
    flex-direction: column;
    align-items: center;
    gap: 1.5rem;
    margin-top: auto;
    padding: 1rem;
  }

  :host([hidden]),
  [hidden] {
    display: none !important;
  }
`;class lt extends(x(k(R(l(u))))){static get is(){return"onboarding-full-screen-carousel-single-slide"}static get styles(){return[ot,M.primary,M.secondary,z.primary,P.primary,V.primary,D.primary]}static get scopedElements(){const t=[B,L,W,A,E,...lt.configurationScopedElements()];return lt.scopedElementsFromClasses(t)}static get properties(){return{data:{default:{},type:Object},hideFooter:{attribute:"hide-footer",default:!1,type:Boolean},modalTitle:{attribute:"modal-title",default:"",type:String}}}constructor(){super(),this.data={},this.hideFooter="",this.modalTitle=""}_linkClick(){this.dispatchEvent(new CustomEvent("onboarding-full-screen-carousel-single-slide-link-top-click",{detail:!0,bubbles:!0,composed:!0}))}_buttonClick(){this.dispatchEvent(new CustomEvent("onboarding-full-screen-carousel-single-slide-primary-button-click",{detail:!0,bubbles:!0,composed:!0}))}render(){return h`
      ${super.render()}
      <div class="single">
        <div class="single__content">
          ${this.data.elements.microillustration?h`
                <bbva-clip-microillustration
                  ambient="primary"
                  .microillustration="${this.data.elements.microillustration.value}"
                  size="M"
                  aria-hidden="true"
                ></bbva-clip-microillustration>
              `:b}
          ${this.data.elements.title?h`
                <bbva-type-text
                  ambient="primary"
                  class="panel-title"
                  tag="h2"
                  size="3XL"
                  font-weight="bold"
                  unset
                  text="${this.data.elements.title.value}"
                ></bbva-type-text>
              `:b}
          ${this.data.elements.description?h`
                <bbva-type-text
                  ambient="primary"
                  size="S"
                  tag="p"
                  className="panel-info-description"
                  text="${this.data.elements.description.value}"
                ></bbva-type-text>
              `:b}
        </div>
        ${this.data.elements.bullets.value?h`
              <div role="list">
                ${this.data.elements.bullets.value.map((t=>h` <bbva-list-bullet role="listitem">${t}</bbva-list-bullet> `))}
              </div>
            `:b}
        ${!this.data.elements.buttonText&&!this.data.elements.linkText||this.hideFooter?b:h`
              <div class="single__footer">
                ${this.data.elements.linkText?h`
                      <bbva-type-link class="link" href="#" @click=${()=>this._linkClick()}
                        >${this.data.elements.linkText.value}</bbva-type-link
                      >
                    `:b}
                ${this.data.elements.buttonText?h`
                      <bbva-button-default
                        ambient="primary"
                        class="action"
                        fullwidth=""
                        @click=${()=>this._buttonClick()}
                        >${this.data.elements.buttonText.value}
                      </bbva-button-default>
                    `:b}
              </div>
            `}
      </div>
    `}}class nt extends(x(k(R(l(u))))){static get is(){return"onboarding-full-screen-carousel"}static get scopedElements(){const t=[O,et,Y,G,lt,...nt.configurationScopedElements()];return nt.scopedElementsFromClasses(t)}static get properties(){return{contentFragmentHost:{attribute:"content-fragment-host",type:String},avoidCollectionIndex:{attribute:"avoid-collection-index",type:Array},contentFragmentPath:{attribute:"content-fragment-path",type:String},headers:{type:Object},linkText:{attribute:"link-text",type:String},hideCTA:{attribute:"hide-cta",default:!1,type:Boolean},linkTextTop:{attribute:"link-text-top",type:String},loop:{type:Boolean},maxErrorRetries:{attribute:"max-error-retries",type:Number},maxItems:{attribute:"max-items",type:Number},modalTitle:{type:String,attribute:"modal-title"},playing:{type:Boolean},primaryButtonText:{attribute:"primary-button-text",type:String},secondaryButtonText:{attribute:"secondary-button-text",type:String},serviceCacheEnabled:{attribute:"service-cache-enabled",type:Boolean},startSlide:{attribute:"start-slide",type:Number},visible:{type:Boolean},_items:{type:Array},_linkTextTopAction:{type:String},_primaryButtonAction:{type:String},_receivedData:{type:Array},_selectedPage:{type:Number},_userAgentRegex:{type:String}}}get _headers(){return this.headers||{Accept:"application/json, text/plain, */*; q=0.01","Content-Type":"text/plain"}}static get styles(){return[at,it,d("onboarding-full-screen-carousel-shared-styles")]}constructor(){super(),this.contentFragmentHost="",this.contentFragmentPath="",this.headers={},this.hideCTA=!1,this.linkText="",this.linkTextTop="",this.loop=!1,this.maxErrorRetries=2,this.maxItems=null,this.modalTitle="",this.playing=!1,this.primaryButtonText="",this.secondaryButtonText="",this.serviceCacheEnabled=!1,this.startSlide="",this.visible=!1,this._errorRetries=0,this._items=[],this._linkTextTopAction="",this._primaryButtonAction="",this._receivedData=[],this.avoidCollectionIndex=[],this._selectedPage=0,this._userAgentRegex=/\(([^)]+)\)/}firstUpdated(){this._dm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-aem-content-fragment-dm"]')}updated(t){(t.has("contentFragmentHost")||t.has("contentFragmentPath"))&&(this._errorRetries=0,this._showSpinner(),this._dm.getAemData()),t.has("visible")&&this._renderCarousel()}open(){this.visible=!0}close(){this.visible=!1,this._dispatchVisibility("close")}_dispatchVisibility(t){this.dispatchEvent(new CustomEvent(`onboarding-full-screen-carousel-${t}`,{detail:{status:t},bubbles:!0,composed:!0}))}_hideSpinner(){this.clearLoader(),this.config.loader={visible:!1}}_showSpinner(){this.showLoader(),this.config.loader={visible:!0}}_processDMResponse(t){var e,i,a,o,l,n,s;(this._receivedData=((null===(e=t.detail)||void 0===e||null===(i=e.items)||void 0===i||null===(a=i.contentfragmentlist)||void 0===a||null===(o=a.items)||void 0===o||null===(l=o.filter)||void 0===l?void 0:l.call(o,(t=>{var e,i;return!this.avoidCollectionIndex.includes(null==t||null===(e=t.elements)||void 0===e||null===(i=e.index)||void 0===i?void 0:i.value)})))||[]).sort(((t,e)=>{var i,a,o,l;return((null==t||null===(i=t.elements)||void 0===i||null===(a=i.index)||void 0===a?void 0:a.value)||0)-((null==e||null===(o=e.elements)||void 0===o||null===(l=o.index)||void 0===l?void 0:l.value)||0)})),this.maxItems&&(this._receivedData=this._receivedData.slice(0,Number(this.maxItems))),this._selectedPage=this.startSlide?this.startSlide:0,null!==(n=this._receivedData)&&void 0!==n&&n.length)&&((null===(s=this._receivedData)||void 0===s?void 0:s.length)>1&&(this._items=this._generateMultiSlide()));this._hideSpinner()}_manageFetchError(){this._errorRetries<this.maxErrorRetries?(this._errorRetries+=1,this._dm.getAemData()):(this._hideSpinner(),this.dispatchEvent(new CustomEvent("onboarding-full-screen-carousel-loading-error",{detail:!0,bubbles:!0,composed:!0})))}_checkSlide(t){this._eventForwarder(t),this._selectedPage=Number(t.detail),this._updateCTA(),this._selectedPage+1===this._items.length&&this.dispatchEvent(new CustomEvent("onboarding-full-screen-carousel-last-item",{detail:{currentSlide:this._selectedPage},bubbles:!0,composed:!0}))}_eventForwarder(t){const e=t.type.replace("help-onboarding","onboarding-full-screen-carousel");this.dispatchEvent(new CustomEvent(e,{detail:t.detail,bubbles:!0,composed:!0}))}_updateCTA(){var t,e,i,a,o,l,n,s,r;const d=null===(t=this._receivedData)||void 0===t?void 0:t[this._selectedPage];this.primaryButtonText=(null==d||null===(e=d.elements)||void 0===e||null===(i=e.buttonText)||void 0===i?void 0:i.value)||"",this._primaryButtonAction=(null==d||null===(a=d.elements)||void 0===a||null===(o=a.buttonAction)||void 0===o?void 0:o.value)||"",this.linkTextTop=(null==d||null===(l=d.elements)||void 0===l||null===(n=l.linkText)||void 0===n?void 0:n.value)||"",this._linkTextTopAction=(null==d||null===(s=d.elements)||void 0===s||null===(r=s.linkAction)||void 0===r?void 0:r.value)||""}_clickCTA(t){let e="onboarding-full-screen-carousel-primary-button-click";"help-onboarding-primary-button-click"===t.type||"onboarding-full-screen-carousel-single-slide-primary-button-click"===t.type?e=this._primaryButtonAction?this._primaryButtonAction:"onboarding-full-screen-carousel-primary-button-click":"help-onboarding-link-top-click"!==t.type&&"onboarding-full-screen-carousel-single-slide-link-top-click"!==t.type||(e=this._linkTextTopAction?this._linkTextTopAction:"onboarding-full-screen-carousel-link-top-click"),this.dispatchEvent(new CustomEvent(`${e}`,{detail:t.detail,bubbles:!0,composed:!0}))}_renderDataManagers(){var t,e;const i=`onboardingAemData-${(null===(t=this.contentFragmentPath)||void 0===t||null===(e=t.match(/\/([^/.]+)\./))||void 0===e?void 0:e[1])||""}-${this.language||""}`;return h`
      <bbva-global-aem-content-fragment-dm
        ?native="${this.native}"
        host="${this.contentFragmentHost}"
        path="${this.contentFragmentPath}"
        cachetype="${this.serviceCacheEnabled?"SESSION":"NONE"}"
        cachekey="${i}"
        @aem-content-fragment-dm-fetch="${t=>this._processDMResponse(t)}"
        @aem-content-fragment-dm-fetch-error="${this._manageFetchError}"
        cross-domain
        .headers="${this._headers}"
      ></bbva-global-aem-content-fragment-dm>
    `}_generateSingleSlide(){return this._updateCTA(),this._receivedData.map((t=>h`
        <onboarding-full-screen-carousel-single-slide
          .data="${t}"
          ?hide-footer="${this.hideCTA}"
          @onboarding-full-screen-carousel-single-slide-close="${()=>{this.visible=!1}}"
          @onboarding-full-screen-carousel-single-slide-primary-button-click="${t=>this._clickCTA(t)}"
          @onboarding-full-screen-carousel-single-slide-link-top-click="${t=>this._clickCTA(t)}"
        ></onboarding-full-screen-carousel-single-slide>
      `))}_generateMultiSlide(){return this._receivedData.map((t=>{var e,i,a,o;return h`
        <bbva-help-onboarding-slide
          slide-title="${null===(e=t.elements.title)||void 0===e?void 0:e.value}"
          description="${null===(i=t.elements.description)||void 0===i?void 0:i.value}"
          .microillustration="${null===(a=t.elements.microillustration)||void 0===a?void 0:a.value}"
          banner-image="${t.elements.image?`${this.contentFragmentHost}${t.elements.image.value}`:""}"
          bg-image="${null!==(o=t.elements.backgroundImage)&&void 0!==o&&o.value?`${this.contentFragmentHost}${t.elements.backgroundImage.value}`:""}"
        ></bbva-help-onboarding-slide>
      `}))}_renderCarousel(){var t;return 1===(null===(t=this._receivedData)||void 0===t?void 0:t.length)?(this._items=this._generateSingleSlide(),h`
        <bbva-help-modal
          ?visible="${this.visible}"
          full-height
          hide-content-padding-top
          header-text=${this.modalTitle}
          header-close-icon-aria-label="${this.t("bbva-help-onboarding-carousel-close")}"
          ?i-o-s-fixed-header="${this.iOSFixedHeader}"
          @help-modal-close="${()=>this.close()}"
          @help-modal-open="${()=>this._dispatchVisibility("open")}"
        >
          <div class="content" slot="slot-content">${this._items}</div>
        </bbva-help-modal>
      `):this._items.length>1?(this._updateCTA(),h`
        <bbva-help-onboarding
          ?visible="${this.visible}"
          ?i-o-s-fixed-header="${this.iOSFixedHeader}"
          current-slide="${this.startSlide}"
          .loop="${this.loop}"
          .playing="${this.playing}"
          secondary-button-text="${this.hideCTA?"":this.secondaryButtonText.trim()}"
          primary-button-text="${this.hideCTA?"":this.primaryButtonText.trim()}"
          link-text="${this.hideCTA?"":this.linkText.trim()}"
          link-text-top="${this.hideCTA?"":this.linkTextTop.trim()}"
          on-boarding-title="${this.modalTitle}"
          @help-onboarding-open="${t=>this._eventForwarder(t)}"
          @help-onboarding-close="${()=>this.close()}"
          @help-onboarding-play="${t=>this._eventForwarder(t)}"
          @help-onboarding-pause="${t=>this._eventForwarder(t)}"
          @help-onboarding-slide-next="${t=>this._checkSlide(t)}"
          @help-onboarding-slide-back="${t=>this._checkSlide(t)}"
          @help-onboarding-primary-button-click="${t=>this._clickCTA(t)}"
          @help-onboarding-secondary-button-click="${t=>this._eventForwarder(t)}"
          @help-onboarding-link-top-click="${t=>this._clickCTA(t)}"
          @help-onboarding-link-click="${t=>this._eventForwarder(t)}"
        >
          ${this._items}
        </bbva-help-onboarding>
      `):b}render(){return h` ${super.render()} ${this._renderDataManagers()} ${this._renderCarousel()} `}}export{nt as O};
