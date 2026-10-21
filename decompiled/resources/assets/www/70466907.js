import{z as t,a8 as e,ac as a,ad as i,ab as r,dJ as n,a9 as s,aa as o,ar as c,a as l,L as d,ak as m,h as p,b0 as b,bj as h,af as v,b6 as u,av as g,i as f,bS as y,bF as $,ah as S,ai as x,aN as k,dj as _,C,au as T,an as P,aS as w,aw as R,aK as D,bl as L,aO as F}from"./952f98a9.js";import{C as A}from"./216055dc.js";import{O as V}from"./7f3d7ca9.js";import"./6322cc13.js";import"./6834e083.js";import"./67b05b69.js";var I=t`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.margin-display {
  display: none;
}

bbva-expandable-step {
  display: flex;
  flex-flow: column;
  --bbva-expandable-step-default-content-max-height: max-content;
  --bbva-expandable-step-content-max-height: auto;
}

bbva-expandable-step[completed]:last-of-type {
  padding-bottom: 30vh;
}

bbva-expandable-step:last-child .content {
  margin: -3.625rem 0rem 1rem;
}

bbva-expandable-step:nth-child(2) .summary {
  height: 2.5rem;
  margin-top: -1.25rem;
}

#step2 {
  height: 5.75rem !important;
  margin-bottom: 0px;
  padding-bottom: 0px;
}

.blue-content {
  background-color: var(--colorsPrimaryCore, ${e(s.primaryCore)});
  color: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
  margin: calc(((-7.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem) calc(((-2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem) 0;
}

.container-product-offer {
  text-align: center;
  font-size: var(--typographyTypeSmall, ${e(a.typeSmall)});
  line-height: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

.offer-image {
  padding-bottom: 0;
}

.offer-heading-text {
  margin: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem) 0;
  padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

.offer-description {
  margin: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem) calc(((0.125 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

.status-account {
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

.header-detail {
  font-size: var(--typographyTypeSmall, ${e(a.typeSmall)});
  text-align: left;
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

.list-detail {
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem) calc(((0.125 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

.amount-list-container {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.amount-text-list-container {
  text-align: left;
}

.date-text-list-container {
  text-align: right;
}

.amount-list-container-2 {
  display: flex;
  align-items: baseline;
}

.amount-text-list-container-2 {
  text-align: right;
  width: 40%;
}

.amount-text-list {
  color: var(--colorsSecondary500, ${e(s.secondary500)});
  margin: 0;
  padding-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
  padding-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

.amount-text-list-dm {
  color: var(--colorsSecondary600, ${e(s.secondary600)});
  margin: 0;
  padding-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
  padding-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

.amount-list-number {
  width: 40%;
  text-align: right;
}

.amount-list-number-dm {
  width: 40%;
  text-align: right;
}

.percent-list-number-dm {
  width: 30%;
  text-align: right;
}

.percent-text-list-container {
  width: 70%;
  text-align: left;
}

.amount-text-list-container {
  width: 60%;
  justify-content: left;
}

.separator {
  border-color: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
  opacity: 0.4;
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
  margin-top: calc(((0.125 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

.info-message-separator {
  margin-top: calc(((1.875 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

.align-left {
  float: left;
}

.clear-float {
  clear: both;
  content: "";
  display: block;
}

.info-message {
  font-size: var(--typographyType3XSmall, ${e(a.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${e(i.type3XSmall)});
}

.info {
  --bbva-list-info-icon-color: var(--colorsPrimarySubdued, ${e(s.primarySubdued)}) !important;
  margin: calc(((1.25 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem) calc(((0 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem) calc(((-3.75 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
  padding: 0;
  text-align: left;
}

.info-text {
  font-size: var(--typographyTypeXSmall, ${e(a.typeXSmall)});
  line-height: var(--lineHeightType2XSmall, ${e(i.type2XSmall)});
}

.translucent-text {
  color: var(--colorsSecondary500, ${e(s.secondary500)});
}

.cat-info {
  margin-bottom: calc(((3.875 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}
.cat-info strong {
  font-size: var(--typographyTypeMedium, ${e(a.typeMedium)});
  color: var(--colorsSecondary600, ${e(s.secondary600)});
}

.restriction-text {
  margin-bottom: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

.header-payment-text {
  font-size: var(--typographyTypeXSmall, ${e(a.typeXSmall)});
  margin-bottom: calc(((0.625 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

.footer-payment-text {
  font-size: var(--typographyTypeXSmall, ${e(a.typeXSmall)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${e(r.bookItalic.fontStyle)});
  margin-top: calc(((0.625 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
  margin-bottom: calc(((3.25 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

.summary-text {
  color: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
}

bbva-list-info .summary-text-accepted {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(r.medium.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${e(r.bookItalic.fontStyle)});
  color: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
  margin-top: calc(((-0.375 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
  margin-left: calc(((-0.375 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

.monthly-payment-summary {
  text-align: left;
}

.align-text-right {
  text-align: right;
}

.current-balance-summary {
  display: flex;
  justify-content: space-between;
  margin-top: calc(((1.125 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

.current-balance-summary-data {
  max-width: 65%;
  text-align: left;
}

.description-terms-and-conditions-offer {
  margin: 0 0 calc(((3.125 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
  text-align: left;
}

.pdf-link-text {
  color: var(--colorsPrimaryMedium, ${e(s.primaryMedium)});
}

.check-conditions {
  margin-top: calc(((-1.875 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
  margin-bottom: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

.attention-message {
  padding-bottom: calc(((1.25 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

.information-text {
  margin: 0 calc(((1.25 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
  color: var(--colorsSecondary600, ${e(s.secondary600)});
}

.button-container {
  margin-top: calc(((3.75 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

.offer-list bbva-list-simple {
  --_label-color: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
}

.attention-number {
  color: var(--colorsPrimaryCoreLight, ${e(s.primaryCoreLight)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(r.medium.fontWeight)});
}

.attention-number-bold {
  color: var(--colorsSecundary600, ${e(s.secundary600)});
  font-weight: var(--fontFacePrimaryBoldFontWeight, ${e(r.bold.fontWeight)});
}

.little-amount {
  font-size: calc(((1.875 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

.icon-summary {
  --bbva-list-info-icon-color: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
}

.link-pdf {
  padding: 0;
  text-align: left;
  margin-bottom: calc(((3.75 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

bbva-list-simple.summary-text {
  --bbva-list-simple-label-color: white;
}

bbva-amount {
  --bbva-amount-font-size: var(--fontSizeOptionsFontSize110, ${e(n.fontSize110)});
}

.bullet-container {
  text-align: left;
  margin: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem) 0;
}

.characteristics-container {
  margin-top: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

.bolded {
  font-weight: var(--fontFacePrimaryBoldFontWeight, ${e(r.bold.fontWeight)});
}

.card-type {
  margin-top: calc(((-2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
  padding-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

.deadline-open-step {
  margin-top: calc(((1.25 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

.header-list {
  margin: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem) 0 calc(((1.875 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

.detail-decrease-container {
  margin-top: calc(((3.75 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

bbva-list-simple.open-step-text {
  --bbva-list-simple-label-color: var(--colorsSecondary600, ${e(s.secondary600)});
}

bbva-header-category.detail {
  --bbva-header-category-heading-color: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
  --bbva-header-category-color: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
  --bbva-header-category-bg-color: var(--colorsPrimaryCore, ${e(s.primaryCore)});
  padding: calc(((0.25 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

bbva-list-header.header-list-color {
  --bbva-list-header-heading-color: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
}

.strong-cat-text {
  color: var(--colorsSecondary600, ${e(s.secondary600)});
}

.cat-container {
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}
`;const z=new c;var M=t`:host {
  box-sizing: border-box;
  display: block;
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em);
  background-color: var(--bbva-list-multistep-description-bg-color, var(--colorsPrimaryCore, ${e(s.primaryCore)}));
  --_list-multistep-description: var(--bbva-list-multistep-description-text-color, var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)}));
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

.slot-container ::slotted(*) {
  color: var(--_list-multistep-description);
  font-size: var(--typographyTypeSmall, ${e(a.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${e(i.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${e(r.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${e(r.book.fontStyle)});
}
${z.mediaRules()}`;class O extends(l(d)){static get is(){return"bbva-list-multistep-description"}static get properties(){return{}}connectedCallback(){super.connectedCallback&&super.connectedCallback()}static get styles(){return[M,m("bbva-list-multistep-description-shared-styles")]}render(){return p`
      <div class="slot-container">
        <slot></slot>
      </div>
    `}}customElements.define(O.is,O);const N=new c;var B=t`:host {
  --bbva-link-font-size: var(--typographyTypeMedium, ${e(a.typeMedium)});
  --bbva-link-line-height: var(--lineHeightTypeMedium, ${e(i.typeMedium)});
  display: flex;
  box-sizing: border-box;
  align-items: flex-start;
  width: 100%;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
  --_list-link-description-heading-color: var(--bbva-list-link-description-heading-dark-mode-color, var(--bbva-list-link-description-heading-color, var(--colorsSecondary600, ${e(s.secondary600)})));
  --_list-link-description-tick-color: var(--bbva-list-link-description-tick-dark-mode-color, var(--bbva-list-link-description-tick-color, var(--colorsTertiaryType6Medium, ${e(s.tertiaryType6Medium)})));
  --_list-link-description-close-color: var(--bbva-list-link-description-close-dark-mode-color, var(--bbva-list-link-description-close-color, var(--colorsTertiaryType1Dark, ${e(s.tertiaryType1Dark)})));
  --_list-link-description-text-color: var(--bbva-list-link-description-text-dark-mode-color, var(--bbva-list-link-description-text, var(--colorsSecondary600, ${e(s.secondary600)})));
  --_list-link-description-icon-color: var(--bbva-list-link-description-icon-dark-mode-color, var(--bbva-list-link-description-icon-color, var(--colorsSecondary600, ${e(s.secondary600)})));
  --_list-link-description-link-icon-color: var(--bbva-list-link-description-link-icon-dark-mode-color, var(--bbva-list-link-description-link-icon-color, var(--colorsPrimaryMedium, ${e(s.primaryMedium)})));
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

.heading {
  font-size: var(--typographyTypeMedium, ${e(a.typeMedium)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(r.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${e(r.medium.fontStyle)});
  line-height: var(--lineHeightTypeMedium, ${e(i.typeMedium)});
  color: var(--_list-link-description-heading-color);
}

.tick {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em);
  flex-shrink: 0;
  color: var(--_list-link-description-tick-color);
}

.close {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em);
  flex-shrink: 0;
  color: var(--_list-link-description-close-color);
}

.content {
  max-height: 4.5rem;
  overflow: hidden;
  display: inline-block;
  display: -webkit-box;
  -webkit-line-clamp: 3;
  -webkit-box-orient: vertical;
  text-overflow: ellipsis;
  font-size: var(--typographyTypeSmall, ${e(a.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${e(r.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${e(r.book.fontStyle)});
  line-height: var(--lineHeightTypeSmall, ${e(i.typeSmall)});
  color: var(--_list-link-description-text-color);
}

.icon {
  flex-shrink: 0;
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em);
  color: var(--_list-link-description-icon-color);
}
.icon.link {
  color: var(--_list-link-description-link-icon-color);
}
${N.mediaRules()}`;const E=new c;var X=t`[ambient^=light] {
  --bbva-list-link-description-link-icon-color: initial;
  --bbva-list-link-description-tick-color: initial;
  --bbva-list-link-description-close-color: initial;
  --bbva-list-link-description-text: initial;
  --bbva-list-link-description-icon-color: initial;
  --bbva-list-link-description-heading-color: initial;
}
${E.mediaRules()}`;const H=new c;var W=t`[ambient^=dark] {
  --bbva-list-link-description-link-icon-color: var(--colorsPrimarySubdued, ${e(s.primarySubdued)});
  --bbva-list-link-description-tick-color: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
  --bbva-list-link-description-close-color: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
  --bbva-list-link-description-text: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
  --bbva-list-link-description-icon-color: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
  --bbva-list-link-description-heading-color: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
}
${H.mediaRules()}`;const j={dark:t`
    ${W}
    ${b.dark}
  `,light:t`
    ${X}
    ${b.light}
  `};class q extends(l(d)){static get is(){return"bbva-list-link-description"}static get scopedElements(){return{"bbva-core-heading":h,"bbva-core-icon":v,"bbva-link":u}}static get properties(){return{link:{type:String},headingLevel:{type:Number,attribute:"heading-level"},heading:{type:String},icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},ticked:{type:String},noLink:{type:Boolean,attribute:"no-link"}}}constructor(){super(),this.iconSize=24}static get styles(){return[B,m("bbva-list-link-description-shared-styles"),j.dark,j.light]}_clicked(){this.dispatchEvent(new CustomEvent("list-link-description-item-click",{detail:!0,bubbles:!0,composed:!0}))}render(){return p`
      ${this.icon?p`
            <bbva-core-icon
              class="icon ${g({link:!this.noLink})}"
              .icon="${this.icon}"
              .size="${this.iconSize}"
            ></bbva-core-icon>
          `:p``}
      <div class="main-content">
        <bbva-core-heading class="heading" .level="${f(this.headingLevel)}">
          ${this.noLink?this.heading:p`
                <bbva-link .href="${f(this.link)}" @click="${this._clicked}"
                  >${this.heading}</bbva-link
                >
              `}
        </bbva-core-heading>
        <div class="content">
          <slot></slot>
        </div>
      </div>
      ${this.ticked?p`
            <bbva-core-icon
              class="${g({tick:"yes"===this.ticked,close:"no"===this.ticked})}"
              icon="${"yes"===this.ticked?y():$()}"
              .size="${this.iconSize}"
            ></bbva-core-icon>
          `:p``}
    `}}customElements.define(q.is,q);const Y=new c;var J=t`:host {
  --_notification-color: var(--colorsPrimarySubduedLight, ${e(s.primarySubduedLight)});
  --_notification-icon-color: var(--colorsPrimaryCoreDark, ${e(s.primaryCoreDark)});
  --_text-color: var(--bbva-notification-message-text-color,var(--colorsSecondary600, ${e(s.secondary600)}));
  --_text-weight: var(--bbva-notification-message-text-weight, var(--fontFacePrimaryBookFontWeight, ${e(r.book.fontWeight)}));
  --bbva-link-color: var(--bbva-notification-message-link-color, var(--colorsPrimaryCoreLight, ${e(s.primaryCoreLight)}));
  display: flex;
  flex-direction: column;
  align-items: center;
  text-align: center;
  box-sizing: border-box;
  padding: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em);
  background-color: var(--bbva-notification-message-background-color, var(--_notification-color));
}

:host([variation=information]) {
  --_notification-color: var(--bbva-notification-message-information-background-color,var(--colorsTertiaryType3Lightened, ${e(s.tertiaryType3Lightened)}));
  --_notification-icon-color: var(--bbva-notification-message-information-icon-color,var(--colorsTertiaryType3Dark, ${e(s.tertiaryType3Dark)}));
}

:host([variation=success]) {
  --_notification-color: var(--bbva-notification-message-success-background-color,var(--colorsTertiaryType6Lightened, ${e(s.tertiaryType6Lightened)}));
  --_notification-icon-color: var(--bbva-notification-message-success-icon-color,var(--colorsTertiaryType6Dark, ${e(s.tertiaryType6Dark)}));
}

:host([variation=error]) {
  --_notification-color: var(--bbva-notification-message-error-background-color,var(--colorsTertiaryType5Lightened, ${e(s.tertiaryType5Lightened)}));
  --_notification-icon-color: var(--bbva-notification-message-error-icon-color,var(--colorsTertiaryType1Dark, ${e(s.tertiaryType1Dark)}));
}

:host([variation=sustainability]) {
  --_notification-color: var(--bbva-notification-message-sustainability-background-color,var(--colorsPrimaryVariantLightened, ${e(s.primaryVariantLightened)}));
  --_notification-icon-color: var(--bbva-notification-message-sustainability-icon-color,var(--colorsPrimaryVariantDark, ${e(s.primaryVariantDark)}));
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

.icon {
  margin: 0 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
  color: var(--bbva-notification-message-icon-color, var(--_notification-icon-color));
}

.title {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
  color: var(--bbva-notification-message-title-color, var(--_text-color));
  font-weight: var(--bbva-notification-message-title-weight, var(--_text-weight));
  font-size: var(--bbva-notification-message-title-size, var(--typographyTypeLarge, ${e(a.typeLarge)}));
}

.paragraph {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
  color: var(--bbva-notification-message-paragraph-color, var(--_text-color));
  font-weight: var(--bbva-notification-message-paragraph-weight, var(--_text-weight));
  font-size: var(--bbva-notification-message-paragraph-size, var(--typographyTypeSmall, ${e(a.typeSmall)}));
  line-height: var(--bbva-notification-message-line-height, var(--lineHeightTypeSmall, ${e(i.typeSmall)}));
}

.notification-button {
  margin-top: var(--bbva-notification-message-margin-top-button, var(--gridMargin, ${e(o.margin)}));
}
${Y.mediaRules()}`;class K extends d{static get is(){return"bbva-notification-message"}static get properties(){return{iconSize:{type:Number,attribute:"icon-size"},icon:{type:String,attribute:"icon"},messageTitle:{type:String,attribute:"message-title"},message:{type:String},linkTitle:{type:String,attribute:"link-title"},buttonText:{type:String,attribute:"button-text"},href:{type:String},variation:{type:String,reflect:!0},types:{type:Object}}}constructor(){super(),this.iconSize=24,this.types={information:S(),success:x(),error:k(),sustainability:_()}}static get styles(){return[J,m("bbva-notification-message-shared-styles")]}get _icon(){return this.icon?this.icon:this.types[this.variation]||S()}render(){return p`
      <bbva-core-icon class="icon" .icon="${this._icon}" .size="${this.iconSize}"></bbva-core-icon>

      ${this.messageTitle?p`
            <h2 class="title">${this.messageTitle}</h2>
          `:p``}

      <p class="paragraph">
        ${this.message?this.message:p`
              <slot></slot>
            `}
      </p>

      ${this.linkTitle?p`
            <bbva-link .href="${this.href}" @click="${this._goLink}">${this.linkTitle}</bbva-link>
          `:p``}
      ${this.buttonText?p`
            <bbva-button-default
              text="${this.buttonText}"
              @click="${this._buttonClick}"
              class="notification-button"
            ></bbva-button-default>
          `:p``}
    `}_goLink(){this.dispatchEvent(new CustomEvent("notification-message-link-click",{detail:!0,bubbles:!0,composed:!0}))}_buttonClick(){this.dispatchEvent(new CustomEvent("notification-message-button-click",{detail:!0,bubbles:!0,composed:!0}))}}customElements.define(K.is,K);var U=t`
:host {
  display: inline-flex;
  justify-content: center;
  align-items: center;
  position: relative;
  vertical-align: middle;
  fill: var(--cells-icon-fill-color, currentcolor);
  stroke: var(--cells-icon-stroke-color, none);
  width: var(--cells-icon-width, var(--cells-icon-size, var(--cells-icon-svg-width, 1.5rem)));
  height: var(--cells-icon-height, var(--cells-icon-size, var(--cells-icon-svg-height, 1.5rem)));
}

:host([hidden]), [hidden] {
  display: none !important;
}
`;customElements.define("cells-icon",class extends d{static get is(){return"cells-icon"}static get styles(){return[U,m("cells-icon-shared-styles")]}render(){return p` <slot></slot> `}static get properties(){return{icon:{type:String},theme:{type:String},src:{type:String},size:{type:Number},width:{type:Number},height:{type:Number},alt:{type:String},_isAttached:{type:Boolean},_svgIcon:{type:Object,attribute:!1}}}constructor(){super(),this.alt="",this._iconsetListenerCallback=this._updateIcon.bind(this),this._meta=new C({type:"iconset"})}connectedCallback(){super.connectedCallback(),this._isAttached=!0}disconnectedCallback(){super.disconnectedCallback(),this._isAttached=!1}get _DEFAULT_ICONSET(){return"icons"}updated(t){(t.has("_meta")||t.has("theme")||t.has("_isAttached"))&&this._updateIcon(),(t.has("src")||t.has("_isAttached"))&&this._srcChanged(this.src),(t.has("icon")||t.has("_isAttached"))&&this._iconChanged(this.icon),t.has("size")&&this.style.setProperty("--cells-icon-size",this.size/16+"rem"),t.has("width")&&this.style.setProperty("--cells-icon-svg-width",this.width/16+"rem"),t.has("height")&&this.style.setProperty("--cells-icon-svg-height",this.height/16+"rem"),(t.has("alt")||t.has("_svgIcon"))&&(this._img?this._img.alt=this.alt:this._svgIcon&&(this.alt?(this._svgIcon.setAttribute("aria-label",this.alt),this._svgIcon.removeAttribute("aria-hidden")):(this._svgIcon.setAttribute("aria-hidden","true"),this._svgIcon.removeAttribute("aria-label"))))}_iconChanged(t){if(void 0!==t&&"undefined"!==t){var e=(t||"").split(":");this._iconName=e.pop(),this._iconsetName=e.pop()||this._DEFAULT_ICONSET,this._updateIcon()}}_srcChanged(){this._updateIcon()}_usesIconset(){return this.icon||!this.src}_updateIcon(){this._usesIconset()?(this._img&&this._img.parentNode&&this.removeChild(this._img),""===this._iconName?this._iconset&&this._iconset.removeIcon(this):this._iconsetName&&this._meta&&(this._iconset=this._meta.byKey(this._iconsetName),this._iconset?(this._iconset.applyIcon(this,this._iconName,this.theme),this._svgIcon=this.querySelector("svg"),window.removeEventListener("iron-iconset-added",this._iconsetListenerCallback)):window.addEventListener("iron-iconset-added",this._iconsetListenerCallback))):(this._iconset&&this._iconset.removeIcon(this),this._img||(this._img=document.createElement("img"),this._img.style.width="100%",this._img.style.height="100%",this._img.draggable=!1,this._img.alt=this.alt),this._img.src=this.src,this.appendChild(this._img))}});const G="#1973B8",Q="#121212",Z="#666666",tt="8",et=a=>((a="",i,r,n)=>t`
    ${e(`\n     :host(:not(${i})) ${a} {\n          ${r}\n      }\n      :host(${i}) ${a} {\n          ${n}\n      }\n  `)}
  `)(a,"[focus-visible]","\n    outline: none;\n  ",`\n    outline: ${G} solid 1px;\n    outline-offset: 4px;\n    @apply --bbva-foundations-styles-focus;\n  `);var at=t`:host {
  --_text-color: var(--bbva-list-simple-text-color,var(--colorsSecondary600, ${e(Q)}));
  --_label-color: var(--bbva-list-simple-label-color,var(--colorsSecondary500, ${e(Z)}));
  --_dark-label-color: var(--bbva-list-simple-dark-label-color,var(--colorsSecondary600, ${e(Q)}));
  --_icon-color: var(--bbva-list-simple-icon-color,var(--colorsPrimaryMedium, ${e(G)}));
  display: flex;
  justify-content: space-between;
  box-sizing: border-box;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(tt)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(tt)}))) / 16) * 1rem);
  font-size: var(--typographyTypeSmall, ${e("0.9375rem")});
  line-height: var(--lineHeightTypeSmall, ${e("1.5rem")});
  color: var(--_text-color); }

:host([hidden]),
[hidden] {
  display: none !important; }

*,
*:before,
*:after {
  box-sizing: inherit; }

.sr-only {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px; }

.stacked {
  display: flex;
  justify-content: space-between;
  align-items: center;
  width: 100%; }

.label {
  color: var(--_label-color); }

.dark-label {
  color: var(--_dark-label-color); }

.action-button {
  height: 1.5rem;
  width: 1.5rem;
  border: none;
  padding: 0;
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(tt)}))) / 16) * 1rem);
  background-color: transparent;
  color: var(--_icon-color); }
`;class it extends(V(d)){static get is(){return"bbva-list-simple"}static get properties(){return{stacked:{type:Boolean},listLabel:{type:String,attribute:"list-label"},actionIcon:{type:String,attribute:"action-icon"},actionLabel:{type:String,attribute:"action-label"},actionIconSize:{type:Number,attribute:"action-icon-size"}}}constructor(){super(),this.actionIconSize=24}static get styles(){return[at,et("button:focus"),m("bbva-list-simple-shared-styles")]}get _icon(){return p`
      ${this.actionIcon?p`
            <button class="action-button" @click="${this._iconClick}">
              <span class="sr-only">${this.actionLabel}</span>
              <cells-icon .icon="${this.actionIcon}" .size="${this.actionIconSize}"></cells-icon>
            </button>
          `:""}
    `}render(){return p`
      ${this.stacked?p`
            <div class="stacked">
              <div>
                <div class="label">${this.listLabel}</div>
                <slot></slot>
              </div>
              ${this._icon}
            </div>
          `:p`
            <div class="label ${this.actionIcon?"dark-label":""}">
              ${this.listLabel} ${this._icon}
            </div>
            <slot></slot>
          `}
    `}_iconClick(){this.dispatchEvent(new CustomEvent("list-simple-icon-click",{detail:!0,bubbles:!0,composed:!0}))}}customElements.define(it.is,it);const rt=new c;var nt=t`[ambient^=dark] {
  --bbva-list-header-color: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
  --bbva-list-header-heading-color: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
  --bbva-list-header-right-content-color: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
  --bbva-list-header-icon-color: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
}
[ambient^=dark] [link-style] {
  --bbva-list-header-heading-color: var(--colorsPrimarySubdued, ${e(s.primarySubdued)});
  --bbva-list-header-icon-color: var(--colorsPrimaryCoreLightened, ${e(s.primaryCoreLightened)});
}
${rt.mediaRules()}`;const st=new c;var ot=t`[ambient^=light] {
  --bbva-list-header-color: initial;
  --bbva-list-header-heading-color: initial;
  --bbva-list-header-right-content-color: initial;
  --bbva-list-header-icon-color: initial;
}
[ambient^=light] [link-style] {
  --bbva-list-header-heading-color: var(--colorsPrimaryMedium, ${e(s.primaryMedium)});
  --bbva-list-header-icon-color: var(--colorsPrimaryMedium, ${e(s.primaryMedium)});
}
${st.mediaRules()}`;const ct={dark:t`
    ${nt}
    ${T.dark}
  `,light:t`
    ${ot}
    ${T.light}
  `},lt=new c;var dt=t`*,
*:before,
*:after {
  box-sizing: inherit;
  margin: 0;
  padding: 0;
}

:host {
  display: flex;
  align-items: center;
  line-height: calc(var(--bbva-global-spacer, 0.5rem) * 3);
  color: var(--bbva-list-header-color, var(--colorsSecondary600, ${e(s.secondary600)}));
  --_list-header-icon-color: var(--bbva-list-header-icon-color, initial);
  --_list-header-right-content-color: var(--bbva-list-header-right-content-color, var(--colorsSecondary500, ${e(s.secondary500)}));
  --_list-header-heading-color: var(--bbva-list-header-heading-color, var(--colorsSecondary600, ${e(s.secondary600)}));
  --_list-header-heading-context-color: var(--bbva-list-header-heading-color, var(--colorsPrimaryMedium, ${e(s.primaryMedium)}));
  --_list-header-icon-context-color: var(--bbva-list-header-icon-color, var(--colorsPrimaryMedium, ${e(s.primaryMedium)}));
  --_list-header-heading-link-color: var(--bbva-list-header-heading-color, var(--colorsPrimaryMedium, ${e(s.primaryMedium)}));
  --_list-header-icon-link-color: var(--bbva-list-header-icon-color, var(--colorsPrimaryMedium, ${e(s.primaryMedium)}));
}

:host([hidden]),
[hidden] {
  display: none !important;
}

:host([heading-class=line-break]) {
  align-items: flex-start;
}

.line-break {
  white-space: normal;
}

.ellipsis {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}

.icon {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
  flex-shrink: 0;
  color: var(--_list-header-icon-color);
}

.right {
  margin-left: auto;
  white-space: nowrap;
}

.right ::slotted([slot=right]:not([icon])) {
  font-size: var(--typographyTypeSmall, ${e(a.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${e(i.typeSmall)});
  color: var(--_list-header-right-content-color);
}

.heading {
  color: var(--_list-header-heading-color);
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(r.medium.fontWeight)});
  font-size: var(--typographyTypeMedium, ${e(a.typeMedium)});
  margin: 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem) 0 0;
}

.date {
  font-size: var(--typographyTypeSmall, ${e(a.typeSmall)});
  font-weight: var(--bbva-badge-default-font-weight, var(--fontFacePrimaryBookItalicFontWeight, ${e(r.bookItalic.fontWeight)}));
  font-style: var(--bbva-badge-default-font-style, var(--fontFacePrimaryBookItalicFontStyle, ${e(r.bookItalic.fontStyle)}));
  color: inherit;
}

.clipbox {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

:host-context(button) .icon,
:host-context(button) .heading,
:host-context(a) .icon,
:host-context(a) .heading {
  text-decoration: none;
  text-decoration-color: transparent;
}
:host-context(button) .heading,
:host-context(a) .heading {
  color: var(--_list-header-heading-context-color);
}
:host-context(button) .icon,
:host-context(a) .icon {
  color: var(--_list-header-icon-context-color);
}

:host([link-style]) .heading {
  color: var(--_list-header-heading-link-color);
}
:host([link-style]) .icon {
  color: var(--_list-header-icon-link-color);
}
${lt.mediaRules()}`;class mt extends(l(P(w(d)))){static get is(){return"bbva-list-header"}static get scopedElements(){return{"bbva-core-icon":v,"bbva-core-heading":h,"bbva-amount":R,"bbva-clip-box":D,"cells-date":customElements.get("cells-date")}}static get properties(){return{icon:{type:String,reflect:!0},src:{type:String,reflect:!0},iconSize:{type:Number,attribute:"icon-size"},iconAriaLabel:{type:String,attribute:"icon-aria-label"},heading:{type:String},headingLevel:{type:Number,attribute:"heading-level"},date:{type:String},dateFormat:{type:String,attribute:"date-format"},variantAmount:{type:String,attribute:"variant-amount"},decimalDigits:{type:Number,attribute:"decimal-digits"},type:{type:String},clipBoxText:{type:String,attribute:"clip-box-text"},clipBoxSize:{type:String,attribute:"clip-box-size"},headingClass:{type:String,attribute:"heading-class",reflect:!0},iconColor:{type:String,attribute:"icon-color"},todayAsString:{type:Boolean,attribute:"today-as-string"},linkStyle:{type:Boolean,attribute:"link-style"}}}get _iconAriaHidden(){return Boolean((this.icon||this.src)&&!this.iconAriaLabel)}get _iconHidden(){return Boolean(!this.icon&&!this.src)}get _iconColor(){return{color:this.iconColor||""}}constructor(){super(),this.icon="",this.iconSize=24,this.iconColor="",this.headingLevel=3,this.dateFormat="DD/MM/YYYY",this.todayAsString=!1,this.variantAmount="3xl",this.decimalDigits="2",this.headingClass="ellipsis",this.linkStyle=!1}static get styles(){return[dt,m("bbva-list-header-shared-styles"),ct.dark,ct.light]}clipBoxTemplate(){return this.clipBoxText?p`
          <bbva-clip-box
            class="bitone clipbox"
            text="${this.clipBoxText}"
            size="${this.clipBoxSize}"
          ></bbva-clip-box>
        `:""}iconTemplate(){return p`
      <bbva-core-icon
        id="icon"
        class="icon"
        size="${this.iconSize}"
        role="img"
        ?hidden="${this._iconHidden}"
        aria-label="${f(this.t(this.iconAriaLabel))}"
        aria-hidden="${this._iconAriaHidden}"
        .icon="${this.icon}"
        .src="${this.src}"
        style="${L(this._iconColor)}"
      ></bbva-core-icon>
    `}headerTemplate(){return p`
      <bbva-core-heading
        level="${this.headingLevel}"
        class="heading ${this.headingClass}"
        id="heading"
        >${this.t(this.heading)}</bbva-core-heading
      >
    `}rightTemplate(){return p`
      <div class="right">
        <slot name="right">
          <div>
            ${this.amount||0===this.amount?p`
                  <bbva-amount
                    id="amount"
                    variant="${this.variantAmount}"
                    amount="${this.amount}"
                    local-currency="${this.localCurrency}"
                    currency-code="${this.currencyCode}"
                    language="${this.language}"
                    decimal-digits="${this.decimalDigits}"
                    .type="${this.type}"
                  >
                  </bbva-amount>
                `:""}
            ${this.date?p`
                  <cells-date
                    class="date"
                    id="date"
                    date="${this.date}"
                    format="${this.dateFormat}"
                    ?calendar-time="${this.todayAsString}"
                  ></cells-date>
                `:""}
          </div>
        </slot>
      </div>
    `}render(){return p`
      ${this.clipBoxTemplate()} ${this.iconTemplate()} ${this.headerTemplate()}
      ${this.rightTemplate()}
    `}}customElements.define(mt.is,mt);class pt extends(A(d)){static get is(){return"bbva-multistep-payment-plan"}static get properties(){return{offer:{type:Object},conditionOneAccepted:{type:Boolean},conditionTwoAccepted:{type:Boolean},termsAndConditionsOffer:{type:Object},paymentMethods:{type:String},checkboxTextOne:{type:String},checkboxTextTwo:{type:String},firstHeaderStep:{type:String},decreaseProduct:{type:Boolean},ramping:{type:String},refactorProduct:{type:Boolean},ppfRefactor:{type:Boolean},restructureRefactor:{type:Boolean},restructureConsumoRefactor:{type:Boolean},decreaseRefactor:{type:Boolean},hiddenCardImage:{type:Boolean}}}constructor(){super(),this.checkboxTextOne="",this.checkboxTextTwo="",this.ramping="",this.decreaseProduct=!1,this.firstHeaderStep="",this.offer={productCards:!1,textForFirstButton:"",imagePath:"",customerName:"",headerText:"",descriptionOffer:"",percentDecrease:"",percentIncrease:"",offerStatus:{cardType:"",cardNumber:"",totalDebt:"",firstText:"",secondText:""},offerDetails:{data:{term:"",monthlyPayment:"",annualRate:"",annualCat:"",initialPayment:0,initialPaymentDeadline:""},text:{term:"",monthlyPayment:"",annualRate:"",initialPayment:"",initialPaymentDeadline:""}},catInfo:"",cat:"",offerRequirementsText:"",monthlyPayment:{headingPayment:"",textFooter:""},currentBalanceSummary:""},this.conditionOneAccepted=!1,this.conditionTwoAccepted=!1,this.termsAndConditionsOffer={headerTextTermsAndConditions:"",introText:"",termsAndConditions:"",attentionInformation:{firstText:"",secondText:"",attentionNumber:""}},this.paymentMethods="",this.ppfRefactor=!1,this.restructureRefactor=!1,this.restructureConsumoRefactor=!1,this.decreaseRefactor=!1,this.hiddenCardImage=!1,this.addEventListener("expandable-step-edit-step",(t=>{0===t.detail&&this._checkStep1()}))}resetValues(){this.decreaseProduct=!1,this.firstHeaderStep="",this.conditionOneAccepted=!1,this.conditionTwoAccepted=!1,this.checkboxTextOne="",this.checkboxTextTwo="",this.shadowRoot.querySelector("#conditionOne").checked=!1,this.shadowRoot.querySelector("#conditionTwo").checked=!1,this.ppfProduct=!1,this.restructureRefactor=!1,this.restructureConsumoRefactor=!1,this.decreaseRefactor=!1,this.offer={productCards:!1,textForFirstButton:"",imagePath:"",customerName:"",headerText:"",descriptionOffer:"",percentDecrease:"",percentIncrease:"",offerStatus:{cardType:"",cardNumber:"",totalDebt:"",firstText:"",secondText:""},offerDetails:{data:{term:"",monthlyPayment:"",annualRate:"",initialPayment:0,initialPaymentDeadline:""},text:{term:"",monthlyPayment:"",annualRate:"",annualCat:"",initialPayment:"",initialPaymentDeadline:""}},catInfo:"",cat:"",offerRequirementsText:"",monthlyPayment:{headingPayment:"",textFooter:""},currentBalanceSummary:""};const t=this.shadowRoot.querySelectorAll("bbva-expandable-step"),e=Array.prototype.slice.call(t);e.forEach((t=>{t.completed=!1})),e.forEach((t=>{t.disabled=!0}));const a=this.shadowRoot.querySelector("#step0");a.disabled=!1,a.active=!0,this.hiddenCardImage=!1}static get styles(){return[I,m("bbva-multistep-payment-plan-shared-styles")]}_checkStep1(){const t=this.shadowRoot.querySelector("#step1"),e=this.shadowRoot.querySelector("#conditionOne"),a=this.shadowRoot.querySelector("#conditionTwo");e.checked&&a.checked||(t.disabled=!0,t.completed=!1)}_buildOfferImage(){return p`
      <div class='blue-content'
           ?hidden=${this.hiddenCardImage}>
        <bbva-banner-image
          class='offer-image'
          image-src='${this.offer.imagePath}'
        >
        </bbva-banner-image>
        <div class='header-image-text'>
          <p class='offer-heading-text'>
            ${this.offer.customerName}${F(this.t(this.offer.headerText))}
          </p>
          <p class="card-type">
            <strong>
              ${this.offer.productCards?this.t("bbva-multistep-payment-plan-product-card"):""} ${this.offer.offerStatus.cardType} ${this.offer.offerStatus.cardNumber}
            </strong>
          </p>
        </div>
      </div>
    `}_renderOfferDetailStep(){return p`
      <bbva-expandable-step
        @expandable-step-edit-step=${this._toggleHeader}
        header="${this.firstHeaderStep}"
        id="step0"
        step="0"
        edit-label="${this.t("bbva-multistep-payment-plan-decrease-edit-label-summary-step")}"
        disabled-target=".action"
      >
        <div class="content">
          ${this.decreaseRefactor?this._buildDecreaseOffersFirstStep():this._buildOffersFirstStepRefactor()}
          <bbva-button-default
            id="firstStep"
            @click="${this._nextStepTermsAndConditions}"
            class="action"
            text="${this.t(this.offer.textForFirstButton)}"
            variant="positive"
          >
          </bbva-button-default>
        </div>
        <div class="summary" slot="summary">
          ${this.decreaseRefactor?this._buildDecreaseOffersSummary():this._buildFirstOffersSummaryRefactor()}
        </div>
        <br>
      </bbva-expandable-step>
    `}_buildOffersFirstStepRefactor(){return p`
      ${this._buildOfferImage()}
      ${this._buildFeaturesOfferRefactor()}
      ${this._buildRequiresOffersRefactor()}
      ${this.restructureRefactor?this._buildConsiderationsRestructureRefactor():this._buildConsiderationsRefactor()}
      ${this._buildCATInfoProductsRefactor()}
      ${this._buildMonthlyPaymentRefactor()}
      `}_buildMonthlyPaymentRefactor(){return p`
      <div class="monthly-payment">
        <p class="header-payment-text translucent-text">
          ${this.t(this.offer.monthlyPayment.headingPayment)}
        </p>
        <bbva-amount
          decimal-digits="2"
          amount="${parseFloat(this.offer.offerDetails.data.monthlyPayment)}"
          currency-code="MXN"
          local-currency="MXN"
          variant="4xl"
        >
        </bbva-amount>
        <p>
          ${this.t(this.offer.monthlyPayment.textFooter)}
        </p>
      </div>
    `}_buildCATInfoProductsRefactor(){return p`
      <div class="cat-container">
        <bbva-list-header
          heading='${this.t("bbva-multistep-payment-plan-rates-header")}'
        >
        </bbva-list-header>
        <div class="amount-list-container">
          <div class="amount-text-list-container">
            <p class="amount-text-list-dm">
              ${this.t("bbva-multistep-payment-plan-rates")}
            </p>
          </div>
          <div class="amount-list-number-dm">
            <span><strong>${this.offer.offerDetails.data.annualRate}%</strong></span>
          </div>
        </div>
      </div>
      <div class="cat-info">
        <p class="info-text translucent-text">
          ${F(this.t(this.offer.catInfo))}
        </p>
      </div>
    `}_buildConsiderationsRefactor(){return p`
      <div class="benefits-container">
        <bbva-list-header
          class="header-list"
          heading="${this.t("bbva-multistep-payment-plan-considerations-header")}"
        >
        </bbva-list-header>
        <bbva-list-bullet class="monthly-payment-summary">
          ${this.t("bbva-multistep-payment-plan-first-consideration-text")}
        </bbva-list-bullet>
        <bbva-list-bullet class="monthly-payment-summary">
          ${this.ppfRefactor?this.t("bbva-multistep-payment-plan-second-consideration-text-ppf"):this.t("bbva-multistep-payment-plan-second-consideration-text")}
        </bbva-list-bullet>
        <bbva-list-bullet class="monthly-payment-summary">
          ${this.t("bbva-multistep-payment-plan-third-second-consideration-text")}
        </bbva-list-bullet>
      </div>
      <br>
    `}_buildRequiresOffersRefactor(){return p`
      <div class="detail-decrease-container clear-float">
        <bbva-list-header
          heading='${this.t("bbva-multistep-payment-plan-requirements")}'
        >
        </bbva-list-header>

        <p class='offer-description monthly-payment-summary'>
          ${F(this.t(this.offer.offerRequirementsText))}
        </p>

        <div class="amount-list-container">
          <div class="amount-text-list-container">
            <p class="amount-text-list-dm">
              ${this.t("bbva-multistep-payment-plan-requirements-initial-payment")}
            </p>
          </div>
          <div class="amount-list-number-dm">
            <bbva-amount
              class="bolded"
              variant="m"
              decimal-digits="2"
              amount="${parseFloat(this.offer.offerDetails.data.initialPayment)}"
              currency-code="MXN"
              local-currency="MXN"
            >
            </bbva-amount>
          </div>
        </div>

        <div class="amount-list-container">
          <div class="amount-text-list-container">
            <p class="amount-text-list-dm">
              ${this.t("bbva-multistep-payment-plan-requirements-offer-initial-payment-deadline")}
            </p>
          </div>
          <div class="amount-list-number-dm">
            <span>
              <strong><span><strong><i>${this.offer.offerDetails.data.initialPaymentDeadline}</i></strong></span></strong>
            </span>
          </div>
        </div>
      </div>
    `}_buildFeaturesOfferRefactor(){return p`
      <div class="detail-decrease-container clear-float">
        <bbva-list-header
          heading='${this.t("bbva-multistep-payment-plan-decrease-characteristics")}'
        >
        </bbva-list-header>

        <p class='offer-description monthly-payment-summary'>
          ${F(this.t(this.offer.descriptionOffer))}
        </p>

        <div class="amount-list-container">
          <div class="amount-text-list-container">
            <p class="amount-text-list-dm">
              ${this.t("bbva-multistep-payment-plan-plan-term-list-balance")}
            </p>
          </div>
          <div class="amount-list-number-dm">
            <bbva-amount
              class="little-amount"
              variant="m"
              decimal-digits="2"
              amount="${parseFloat(this.offer.offerStatus.totalDebt)}"
              currency-code="MXN"
              local-currency="MXN"
            >
            </bbva-amount>
          </div>
        </div>

        <div class="amount-list-container">
          <div class="amount-text-list-container">
            <p class="amount-text-list-dm">
              ${this.t("bbva-multistep-payment-plan-plan-term-list")}
            </p>
          </div>
          <div class="amount-list-number-dm">
            <span>
              <strong>${this.offer.offerDetails.data.term} ${this.t("bbva-multistep-payment-plan-offer-monthly-text")}</strong>
            </span>
          </div>
        </div>
      </div>
    `}_buildInfoPanelRefactor(){return p`
      <bbva-notification-message class="attention-message" icon="coronita:info">
        <p class="information-text">
          ${this.t(this.termsAndConditionsOffer.attentionInformation.firstText)}
          ${this.t(this.termsAndConditionsOffer.attentionInformation.secondText)}
          <br>
          <span class="attention-number-bold">
            ${this.t(this.termsAndConditionsOffer.attentionInformation.attentionNumber)}
          </span>
        </p>
      </bbva-notification-message>
    `}_buildDescriptionTermsAndConditions(){return p`
      <div class="intro-text">
        <p class="description-terms-and-conditions-offer">
          ${this.t(this.termsAndConditionsOffer.introText)}
        </p>
      </div>
    `}_buildLinkForPDFForAgreement(){return Object.prototype.hasOwnProperty.call(this.termsAndConditionsOffer,"agreement")?p`
          <div>
            <bbva-list-link-description
              heading="${this.t(this.termsAndConditionsOffer.agreement)}"
              icon="coronita:pdf"
              id="consultAgreement"
              class="link-pdf"
              @click=${this._consultPdfAgreement}
            >
            </bbva-list-link-description>
          </div>
        `:null}_buildLinkForPDFForTermsAndConditions(){return p`
      <div>
        <bbva-list-link-description
          heading="${this.t(this.termsAndConditionsOffer.termsAndConditions)}"
          icon="coronita:pdf"
          id="consultTermsAndConditions"
          class="link-pdf"
          @click=${this._consultPdfTermsAndConditions}
        >
        </bbva-list-link-description>
      </div>
    `}_buildCheckBoxes(){return p`
      <div class="check-conditions">
        <bbva-form-checkbox
          hide-label
          name="checkbox1"
          value="1"
          class="monthly-payment-summary"
          id="conditionOne"
          @change="${this._checkConditionOne}"
        >
        <span class="description" slot="description" > ${this.t(this.checkboxTextOne)}</span>

        </bbva-form-checkbox>
        <bbva-form-checkbox
          hide-label
          name="checkbox2"
          value="2"
          class="monthly-payment-summary"
          id="conditionTwo"
          @change="${this._checkConditionTwo}"
        >
        <span class="description" slot="description" >${this.t(this.checkboxTextTwo)}</span>
        </bbva-form-checkbox>
      </div>
    `}_buildButtonTermsAndConditions(){return p`
      <div class="button-container">
        <bbva-button-default 
            id="buttonAccepted"
            ?disabled=${!(this.conditionOneAccepted&&this.conditionTwoAccepted)}
            @click=${this._nextStep}>
          ${this.t("bbva-multistep-payment-plan-decrease-text-for-second-step-button")}
        </bbva-button-default>
      </div>
    `}_buildFeaturesOfferDecrease(){return p`
      <div class="detail-decrease-container clear-float">
        <bbva-list-header
          heading='${this.t("bbva-multistep-payment-plan-decrease-characteristics")}'
        >
        </bbva-list-header>

        <p class='offer-description monthly-payment-summary'>
          ${F(this.t(this.offer.descriptionOffer))}
        </p>

        <div class="amount-list-container">
          <div class="amount-text-list-container">
            <p class="amount-text-list-dm">
              ${this.t("bbva-multistep-payment-plan-decrease-plan-term-list-current-balance")}
            </p>
          </div>
          <div class="amount-list-number-dm">
            <bbva-amount
              class="little-amount"
              variant="m"
              decimal-digits="2"
              amount="${parseFloat(this.offer.offerStatus.totalDebt)}"
              currency-code="MXN"
              local-currency="MXN"
            >
            </bbva-amount>
          </div>
        </div>

        <div class="amount-list-container">
          <div class="amount-text-list-container">
            <p class="amount-text-list-dm">
              ${this.t("bbva-multistep-payment-plan-decrease-plan-term-list")}
            </p>
          </div>
          <div class="amount-list-number-dm">
            <span>
              <strong>${this.offer.offerDetails.data.term} ${this.t("bbva-multistep-payment-plan-offer-monthly-text")}</strong>
            </span>
          </div>
        </div>

        <div class="amount-list-container">
          <div class="amount-text-list-container">
            <p class="amount-text-list-dm">
              ${this.t("bbva-multistep-payment-plan-decrease-percent-list")}
            </p>
          </div>
          <div class="amount-list-number-dm">
            <span>${this.offer.percentDecrease}%</span>
          </div>
        </div>

        ${this.ramping?"":p`
          <p class='offer-description monthly-payment-summary'>
            ${F(this.t("bbva-multistep-payment-plan-decrease-percent-decrease-list-text"))}
          </p>
        `}
      </div>
    `}_buildBenefitsDecreaseRefactor(){return p`
      <div class="benefits-container">
        <bbva-list-header
          class="header-list"
          heading="${this.t("bbva-multistep-payment-plan-decrease-benefits-header")}"
        >
        </bbva-list-header>
        <bbva-list-bullet class="monthly-payment-summary">
          ${this.t("bbva-multistep-payment-plan-decrease-first-benefit-text-refactor")}
        </bbva-list-bullet>
        <bbva-list-bullet class="monthly-payment-summary">
          ${this.t("bbva-multistep-payment-plan-decrease-second-benefit-text-refactor")}
        </bbva-list-bullet>
        <bbva-list-bullet class="monthly-payment-summary">
          ${this.t("bbva-multistep-payment-decrease-third-benefit-text")}
        </bbva-list-bullet>
      </div>
    `}_buildConsiderationsDecreaseRefactor(){return p`
      <div class="benefits-container">
        <bbva-list-header
          class="header-list"
          heading="${this.t("bbva-multistep-payment-plan-decrease-considerations-header")}"
        >
        </bbva-list-header>
        <bbva-list-bullet class="monthly-payment-summary">
          ${this.t("bbva-multistep-payment-plan-decrease-first-consideration-text")}
        </bbva-list-bullet>
        <bbva-list-bullet class="monthly-payment-summary">
          ${this.t("bbva-multistep-payment-plan-decrease-second-consideration-text")}
        </bbva-list-bullet>
      </div>
      <br>
    `}_buildInfoPanelDecreaseProducts(){return p`
      <bbva-notification-message
        class="panel-payment-methods"
        icon="coronita:info"
      >
        <p class="information-text">
          ${this.t("bbva-multistep-payment-plan-decrease-interest-rate-info")}
        </p>
      </bbva-notification-message>
    `}_buildCATInfoDecreaseProducts(){return p`
      <div class="cat-container">
      ${this.decreaseRefactor?p`<br/>`:""}
        <span class="translucent-text">
          <span class="strong-cat-text">
            <strong>
            ${this.decreaseRefactor,`${this.t("bbva-multistep-payment-plan-decrease-cat-text")}${this.offer.cat}%`}
            </strong>
          </span>
          ${F(this.offer.catInfo)}
        </span>
      </div>
    `}_buildInitialAmount(t="summary-step-text"){return p`
      <div class='monthly-payment-summary'>
        <p class='${t}'>
          ${this.t("bbva-multistep-payment-plan-resc-offer-detail-text-initial-payment")}
        </p>
        <bbva-amount
          class='${t}'
          decimal-digits="2"
          amount="${parseFloat(this.offer.offerDetails.data.initialPayment)}"
          currency-code="MXN"
          local-currency="MXN"
        >
        </bbva-amount>
      </div>
    `}_buildOfferDetailSummaryDecrease(){return p`
      <div class="offer-list-detail clear-float">
        <div class="offer-list">
          <div class="amount-list-container">
            <div class="amount-text-list-container">
              <p>
                ${this.reestructureRefactorConsumo||this.decreaseRefactor?this.t("bbva-multistep-payment-plan-associated-credit"):this.t("bbva-multistep-payment-plan-associated-card")}
              </p>
            </div>
            <span>
              ${this.offer.offerStatus.cardType}
              ${this.offer.offerStatus.cardNumber}
            </span>
          </div>

          <div class="amount-list-container">
            <div class="amount-text-list-container">
              <p>
                ${this.t("bbva-multistep-payment-plan-term-list-balance-summary")}
              </p>
            </div>
            <div class="amount-list-number">
              <bbva-amount
                variant="m"
                class="summary-text little-amount"
                decimal-digits="2"
                amount="${parseFloat(this.offer.offerStatus.totalDebt)}"
                currency-code="MXN"
                local-currency="MXN"
              >
              </bbva-amount>
            </div>
          </div>

          <div class="amount-list-container">
            <div class="amount-text-list-container">
              <p>
                ${this.t(this.offer.offerDetails.text.term)}
              </p>
            </div>
            <span>
              <strong>
                ${this.offer.offerDetails.data.term}
                ${this.t("bbva-multistep-payment-plan-offer-monthly-text")}
              </strong>
            </span>
          </div>

          <div class="amount-list-container">
            <div class="amount-text-list-container">
              <p>
                ${this.t("bbva-multistep-payment-plan-decrease-percent-list")}
              </p>
            </div>
            <div class="amount-list-number-dm">
              <span>${this.offer.percentDecrease}%</span>
            </div>
          </div>

          <hr class="separator align-left"/>
          </div>
      </div>
    `}_buildInterestOfferSummaryDecreaseRefactor(){return p`
      <div class="offer-list-detail clear-float">
        <div class="offer-list">
          <div class="amount-list-container">
            <div class="amount-text-list-container">
              <p>
                ${this.t("bbva-multistep-payment-plan-decrease-cat-iva-text")}
              </p>
            </div>
            <span>
              <strong> ${this.offer.offerDetails.data.annualRate}% </strong>
            </span>
          </div>
          <div class="amount-list-container">
            <div class="amount-text-list-container">
              <p>
                ${this.t("bbva-multistep-payment-plan-offer-monthly-payment-heading-payment-decrease")}
              </p>
            </div>
            <div class="amount-list-number">
              <bbva-amount
                variant="m"
                class="summary-text little-amount"
                decimal-digits="2"
                amount="${this.offer.offerDetails.data.monthlyPayment}"
                currency-code="MXN"
                local-currency="MXN"
              >
              </bbva-amount>
            </div>
          </div>   

        </div>
      </div>    
    `}_buildCheckTermsAndConditions(){return p`
      <div class='check-terms-and-conditions'>
        <bbva-list-info
          class='bbva-global-semidivider icon-summary'
          icon='coronita:correct'
          icon-size="16"
        >
          <p class='summary-text-accepted'>
            ${this.t("bbva-multistep-payment-plan-offer-accepted-text")}
          </p>
        </bbva-list-info>
      </div>
    `}_buildInfoPanelForPaymentMethods(){return p`
      <bbva-notification-message
        class="panel-payment-methods"
        icon="coronita:info"
      >
        <p class="information-text">${this.t(this.paymentMethods)}</p>
      </bbva-notification-message>
    `}_buildOfferDetailSummaryRefactor(){return p`
      <div class="offer-list-detail clear-float">
        <div class="offer-list">
          <div class="amount-list-container-2">
            <div class="amount-text-list-container">
              <p>
                ${this.restructureConsumoRefactor||this.decreaseRefactor?this.t("bbva-multistep-payment-plan-associated-credit"):this.t("bbva-multistep-payment-plan-associated-card")}
              </p>
            </div>
            <div class="amount-text-list-container-2">
             ${this.offer.offerStatus.cardType}${this.offer.offerStatus.cardNumber}
            </div>
          </div>

          <div class="amount-list-container">
            <div class="amount-text-list-container">
              <p>
                ${this.t("bbva-multistep-payment-plan-term-list-balance-summary")}
              </p>
            </div>
            <div class="amount-list-number">
              <bbva-amount
                variant="m"
                class="summary-text little-amount"
                decimal-digits="2"
                amount="${parseFloat(this.offer.offerStatus.totalDebt)}"
                currency-code="MXN"
                local-currency="MXN"
              >
              </bbva-amount>
            </div>
          </div>

          <div class="amount-list-container">
            <div class="amount-text-list-container">
              <p>
                ${this.t(this.offer.offerDetails.text.term)}
              </p>
            </div>
            <span>
              <strong>
                ${this.offer.offerDetails.data.term}
                ${this.t("bbva-multistep-payment-plan-offer-monthly-text")}
              </strong>
            </span>
          </div>

          <hr class="separator align-left"/>
        </div>
      </div>
  `}_buildInfoPaymentsSummaryRefactor(){return p`
      <div class="offer-list-detail clear-float">
        <div class="offer-list">
          <div class="amount-list-container">
            <div class="amount-text-list-container">
              <p>
                ${this.t("bbva-multistep-payment-plan-requirements-initial-payment-summary")}
              </p>
            </div>
            <div class="amount-list-number">
              <bbva-amount
                variant="m"
                class="summary-text little-amount bolded"
                decimal-digits="2"
                amount="${this.offer.offerDetails.data.initialPayment}"
                currency-code="MXN"
                local-currency="MXN"
              >
              </bbva-amount>
            </div>
          </div>

          <div class="amount-list-container">
            <div class="amount-text-list-container">
              <p>
                ${this.t(this.offer.offerDetails.text.initialPaymentDeadline)}
              </p>
            </div>
            <span  class="date-text-list-container">
              <strong>
                ${this.offer.offerDetails.data.initialPaymentDeadline}
              </strong>
            </span>
          </div>
          <hr class="separator align-left"/>      
        </div>
      </div>
    `}_buildConsiderationsRestructureRefactor(){return p`
      <div class="benefits-container">
        <bbva-list-header
          class="header-list"
          heading="${this.t("bbva-multistep-payment-plan-considerations-header")}"
        >
        </bbva-list-header>
        ${this.restructureConsumoRefactor?"":p`
        <bbva-list-bullet class="monthly-payment-summary">
          ${this.t("bbva-multistep-payment-plan-first-consideration-text-reestructure")}
        </bbva-list-bullet>
        `}
        <bbva-list-bullet class="monthly-payment-summary">
          ${this.restructureConsumoRefactor?this.t("bbva-multistep-payment-plan-second-consideration-text-reestructure-consumo"):this.t("bbva-multistep-payment-plan-second-consideration-text-reestructure")}
        </bbva-list-bullet>
        <bbva-list-bullet class="monthly-payment-summary">
          ${this.t("bbva-multistep-payment-plan-third-consideration-text-reestructure")}
        </bbva-list-bullet>
        <bbva-list-bullet class="monthly-payment-summary">
          ${this.restructureConsumoRefactor?this.t("bbva-multistep-payment-plan-third-consideration-text-reestructure-consumo"):this.t("bbva-multistep-payment-plan-fort-consideration-text-reestructure")}
        </bbva-list-bullet>
      </div>
      <br>
    `}_buildInterestOfferSummaryRefactor(){return p`
      <div class="offer-list-detail clear-float">
        <div class="offer-list">
          <div class="amount-list-container">
            <div class="amount-text-list-container">
              <p>
                ${this.t("bbva-multistep-payment-plan-rates-refactor-summary")}
              </p>
            </div>
            <span>
              <strong> ${this.offer.offerDetails.data.annualRate}% </strong>
            </span>
          </div>
          <div class="amount-list-container">
            <div class="amount-text-list-container">
              <p>
                ${this.t("bbva-multistep-payment-plan-cat-iva-refactor-summary")}
              </p>
            </div>
            <span>
              <strong> ${this.offer.offerDetails.data.annualCat}% </strong>
            </span>
          </div>
          <div class="amount-list-container">
            <div class="amount-text-list-container">
              <p>
                ${this.t("bbva-multistep-payment-plan-monthly-payment-refactor-summary")}
              </p>
            </div>
            <div class="amount-list-number">
              <bbva-amount
                variant="m"
                class="summary-text little-amount"
                decimal-digits="2"
                amount="${this.offer.offerDetails.data.monthlyPayment}"
                currency-code="MXN"
                local-currency="MXN"
              >
              </bbva-amount>
            </div>
          </div>   
        </div>
      </div>    
    `}_nextStep(t){t.target.dispatchEvent(new CustomEvent("complete",{bubbles:!0})),this.dispatchEvent(new CustomEvent("authorize-offer-binding",{bubbles:!0,composed:!0}))}_nextStepTermsAndConditions(t){this.firstHeaderStep=this.t("bbva-multistep-payment-plan-header-first-step-label-refactor"),t.target.dispatchEvent(new CustomEvent("complete",{bubbles:!0,composed:!0})),this.dispatchEvent(new CustomEvent("review-terms-and-conditions",{bubbles:!0,composed:!0})),this.dispatchEvent(new CustomEvent("complete",{bubbles:!0,composed:!0})),this._toggleHeader()}_consultPdfTermsAndConditions(){this.dispatchEvent(new CustomEvent("consult-terms-and-conditions-pdf",{bubbles:!0,composed:!0}))}_consultPdfAgreement(){this.dispatchEvent(new CustomEvent("consult-agreement-pdf",{bubbles:!0,composed:!0}))}_checkConditionOne(t){this.conditionOneAccepted=t.target.checked}_checkConditionTwo(t){this.conditionTwoAccepted=t.target.checked}_offerAccepted(){this.dispatchEvent(new CustomEvent("check-and-confirm-offer",{bubbles:!0,composed:!0}))}_toggleHeader(){this.hiddenCardImage=!this.hiddenCardImage}_buildRampingBullets(){return""!==this.ramping?p`
        <div class="bullet-container">
          ${F(this.ramping)}
        </div>
      `:null}_buildFirstOffersSummaryRefactor(){return p`
      ${this._buildOfferDetailSummaryRefactor()}
      ${this._buildInfoPaymentsSummaryRefactor()}
      ${this._buildInterestOfferSummaryRefactor()}
    `}_buildDecreaseOffersFirstStep(){return p`
        ${this._buildOfferImage()}
        ${this._buildFeaturesOfferDecrease()}
        ${this._buildRampingBullets()}
        ${this._buildRequiresOffersRefactor()}
        ${this._buildBenefitsDecreaseRefactor()}
        ${this._buildConsiderationsDecreaseRefactor()}
        ${this._buildInfoPanelDecreaseProducts()}
        ${this._buildCATInfoDecreaseProducts()}
        ${this._buildMonthlyPaymentRefactor()}
    `}_buildDecreaseOffersSummary(){return p`
      ${this._buildOfferDetailSummaryDecrease()}
      ${this._buildInfoPaymentsSummaryRefactor()}
      ${this._buildInterestOfferSummaryDecreaseRefactor()}
    `}_renderTermsAndConditionsStep(){return p`
      <bbva-expandable-step
        id="step1"
        step="1"
        edit-label="${this.t("bbva-multistep-payment-plan-decrease-edit-label-summary-step")}"
        header="${this.t(this.termsAndConditionsOffer.headerTextTermsAndConditions)}"
        disabled-target=".action"
      >
        <div class="content terms-and-conditions-container">
          ${this._buildDescriptionTermsAndConditions()}
          ${this._buildLinkForPDFForTermsAndConditions()}
          ${this._buildLinkForPDFForAgreement()}
          ${this._buildCheckBoxes()}
          ${this._buildInfoPanelRefactor()}
          ${this._buildButtonTermsAndConditions()}
        </div>
        <div class="summary" slot="summary">
          ${this._buildCheckTermsAndConditions()}
        </div>
      </bbva-expandable-step>
    `}_renderPaymentMethodsRefactorStep(){return p`
      <bbva-expandable-step
        class="hide-guillotine-animation"
        id="step2"
        step="2"
        edit-label="${this.t("bbva-multistep-payment-plan-decrease-edit-label-summary-step")}"
        disabled-target=".action"
      >
        <div class="content">
          <bbva-button-default
            id="offerAccepted"
            class="action button-container"
            @click="${this._offerAccepted}"
            text="${this.t("bbva-multistep-payment-plan-decrease-text-for-third-step-button")}"
            variant="positive"
          >
          </bbva-button-default>
        </div>
      </bbva-expandable-step>
    `}render(){return p`
      <div class="container-product-offer">
        <bbva-expandable-multistep hide-step-numbers="" class="scrollable">
          ${this._renderOfferDetailStep()}
          ${this._renderTermsAndConditionsStep()}
          ${this._renderPaymentMethodsRefactorStep()}
        </bbva-expandable-multistep>
      </div>
    `}}customElements.define(pt.is,pt);
