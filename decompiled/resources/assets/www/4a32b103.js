import{z as i,a8 as e,ac as r,ad as t,ab as o,ar as a,aa as n,a9 as l,b0 as s,a as c,L as d,bj as b,af as p,b6 as v,ak as k,h,av as y,i as g,bS as m,bF as $}from"./952f98a9.js";const u=new a;var S=i`:host {
  --bbva-link-font-size: var(--typographyTypeMedium, ${e(r.typeMedium)});
  --bbva-link-line-height: var(--lineHeightTypeMedium, ${e(t.typeMedium)});
  display: flex;
  box-sizing: border-box;
  align-items: flex-start;
  width: 100%;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(n.spacer)}))) / 16) * 1rem);
  --_list-link-description-heading-color: var(--bbva-list-link-description-heading-color, var(--colorsSecondary600, ${e(l.secondary600)}));
  --_list-link-description-tick-color: var(--bbva-list-link-description-tick-color, var(--colorsTertiaryType6Medium, ${e(l.tertiaryType6Medium)}));
  --_list-link-description-close-color: var(--bbva-list-link-description-close-color, var(--colorsTertiaryType1Dark, ${e(l.tertiaryType1Dark)}));
  --_list-link-description-text-color: var(--bbva-list-link-description-text, var(--colorsSecondary600, ${e(l.secondary600)}));
  --_list-link-description-icon-color: var(--bbva-list-link-description-icon-color, var(--colorsSecondary600, ${e(l.secondary600)}));
  --_list-link-description-link-icon-color: var(--bbva-list-link-description-link-icon-color, var(--colorsPrimaryMedium, ${e(l.primaryMedium)}));
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
  font-size: var(--typographyTypeMedium, ${e(r.typeMedium)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(o.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${e(o.medium.fontStyle)});
  line-height: var(--lineHeightTypeMedium, ${e(t.typeMedium)});
  color: var(--_list-link-description-heading-color);
}

.tick {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(n.spacer)}))) / 16) * 1em);
  flex-shrink: 0;
  color: var(--_list-link-description-tick-color);
}

.close {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(n.spacer)}))) / 16) * 1em);
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
  font-size: var(--typographyTypeSmall, ${e(r.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${e(o.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${e(o.book.fontStyle)});
  line-height: var(--lineHeightTypeSmall, ${e(t.typeSmall)});
  color: var(--_list-link-description-text-color);
}

.icon {
  flex-shrink: 0;
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(n.spacer)}))) / 16) * 1em);
  color: var(--_list-link-description-icon-color);
}
.icon.link {
  color: var(--_list-link-description-link-icon-color);
}
${u.mediaRules()}`;var f=i`[ambient^=light] {
  --bbva-list-link-description-link-icon-color: initial;
  --bbva-list-link-description-tick-color: initial;
  --bbva-list-link-description-close-color: initial;
  --bbva-list-link-description-text: initial;
  --bbva-list-link-description-icon-color: initial;
  --bbva-list-link-description-heading-color: initial;
}
${(new a).mediaRules()}`;const x=new a;const L={dark:i`
    ${i`[ambient^=dark] {
  --bbva-list-link-description-link-icon-color: var(--colorsPrimarySubdued, ${e(l.primarySubdued)});
  --bbva-list-link-description-tick-color: var(--colorsPrimaryCoreLightened, ${e(l.primaryCoreLightened)});
  --bbva-list-link-description-close-color: var(--colorsPrimaryCoreLightened, ${e(l.primaryCoreLightened)});
  --bbva-list-link-description-text: var(--colorsPrimaryCoreLightened, ${e(l.primaryCoreLightened)});
  --bbva-list-link-description-icon-color: var(--colorsPrimaryCoreLightened, ${e(l.primaryCoreLightened)});
  --bbva-list-link-description-heading-color: var(--colorsPrimaryCoreLightened, ${e(l.primaryCoreLightened)});
}
${x.mediaRules()}`}
    ${s.dark}
  `,light:i`
    ${f}
    ${s.light}
  `};class M extends(c(d)){static get is(){return"bbva-list-link-description"}static get scopedElements(){return{"bbva-core-heading":b,"bbva-core-icon":p,"bbva-link":v}}static get properties(){return{link:{type:String},headingLevel:{type:Number,attribute:"heading-level"},heading:{type:String},icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},ticked:{type:String},noLink:{type:Boolean,attribute:"no-link"}}}constructor(){super(),this.iconSize=24}static get styles(){return[S,k("bbva-list-link-description-shared-styles"),L.dark,L.light]}_clicked(){this.dispatchEvent(new CustomEvent("list-link-description-item-click",{detail:!0,bubbles:!0,composed:!0}))}render(){return h`
      ${this.icon?h`
            <bbva-core-icon
              class="icon ${y({link:!this.noLink})}"
              .icon="${this.icon}"
              .size="${this.iconSize}"
            ></bbva-core-icon>
          `:h``}
      <div class="main-content">
        <bbva-core-heading class="heading" .level="${g(this.headingLevel)}">
          ${this.noLink?this.heading:h`
                <bbva-link .href="${g(this.link)}" @click="${this._clicked}"
                  >${this.heading}</bbva-link
                >
              `}
        </bbva-core-heading>
        <div class="content">
          <slot></slot>
        </div>
      </div>
      ${this.ticked?h`
            <bbva-core-icon
              class="${y({tick:"yes"===this.ticked,close:"no"===this.ticked})}"
              icon="${"yes"===this.ticked?m():$()}"
              .size="${this.iconSize}"
            ></bbva-core-icon>
          `:h``}
    `}}export{M as B,L as b};
