import{z as t,a8 as i,a9 as e,ac as o,ad as l,ab as r,bf as n,aa as a,a as s,L as c,ak as d,h as m,aO as u,av as b,g as y}from"./952f98a9.js";const h={light:t`[ambient^=light] {
  --bbva-list-definition-title-title-color: initial;
  --bbva-list-definition-title-subtitle-color: initial;
  --bbva-list-definition-title-title-two-columns-color: initial;
  --bbva-list-definition-title-subtitle-two-columns-color: initial;
}
`,dark:t`[ambient^=dark] {
  --bbva-list-definition-title-title-color: var(--colorsPrimaryCoreLightened, ${i(e.primaryCoreLightened)});
  --bbva-list-definition-title-subtitle-color: var(--colorsPrimaryCoreLightened, ${i(e.primaryCoreLightened)});
  --bbva-list-definition-title-title-two-columns-color: var(--colorsPrimaryCoreLightened, ${i(e.primaryCoreLightened)});
  --bbva-list-definition-title-subtitle-two-columns-color: var(--colorsPrimaryCoreLightened, ${i(e.primaryCoreLightened)});
  --bbva-list-definition-title-two-columns-column-border-right-color: rgba(255,255,255,0.4);
}
`};var g=t`
:host {
  display: block;
  box-sizing: border-box;
  --_list-definition-title-title-color: var(--bbva-list-definition-title-dark-mode-title-color, var(--bbva-list-definition-title-title-color, var(--colorsSecondary600, ${i(e.secondary600)})));
  --_list-definition-title-subtitle-color: var(--bbva-list-definition-title-dark-mode-subtitle-color, var(--bbva-list-definition-title-subtitle-color, var(--colorsSecondary500, ${i(e.secondary500)})));
  --_list-definition-title-title-two-columns-color: var(--bbva-list-definition-title-dark-mode-title-two-columns-color, var(--bbva-list-definition-title-title-two-columns-color, var(--colorsSecondary500, ${i(e.secondary500)})));
  --_list-definition-title-subtitle-two-columns-color: var(--bbva-list-definition-title-dark-mode-subtitle-two-columns-color, var(--bbva-list-definition-title-subtitle-two-columns-color, var(--colorsSecondary600, ${i(e.secondary600)})));
  --_list-definition-title-two-columns-column-border-right-color: var(--bbva-list-definition-title-dark-mode-two-columns-column-border-right-color, var(--bbva-list-definition-title-two-columns-column-border-right-color, var(--colorsSecondary300, ${i(e.secondary300)})));
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.wrapper {
  display: flex;
  flex-wrap: wrap;
  flex-direction: row;
  width: 100%;
}

.column {
  display: flex;
  flex-direction: column;
  width: 100%;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(a.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(a.spacer)}))) / 16) * 1em);
  text-align: center;
  overflow-wrap: break-word;
}
.column .title {
  font-size: var(--typographyTypeLarge, ${i(o.typeLarge)});
  line-height: var(--lineHeightTypeLarge, ${i(l.typeLarge)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${i(r.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${i(r.medium.fontStyle)});
  color: var(--_list-definition-title-title-color);
  margin: 0;
}
.column .subtitle {
  font-size: var(--typographyTypeSmall, ${i(o.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${i(l.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${i(r.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${i(r.book.fontStyle)});
  color: var(--_list-definition-title-subtitle-color);
}

.two-columns .column {
  width: 50%;
  text-align: left;
}
.two-columns .column .title {
  font-size: var(--typographyTypeSmall, ${i(o.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${i(l.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${i(r.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${i(r.book.fontStyle)});
  color: var(--_list-definition-title-title-two-columns-color);
}
.two-columns .column .subtitle {
  font-size: var(--typographyTypeMedium, ${i(o.typeMedium)});
  line-height: var(--lineHeightTypeMedium, ${i(l.typeMedium)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${i(r.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${i(r.medium.fontStyle)});
  color: var(--_list-definition-title-subtitle-two-columns-color);
}
.two-columns .column:first-child {
  border-right: 1px solid var(--_list-definition-title-two-columns-column-border-right-color);
}

:host([centered-two-columns]) .two-columns .column {
  text-align: center;
}

:host([variant=card]) {
  box-shadow: var(--boxShadowType1, ${i(n.type1)});
}
`;class p extends(s(c)){static get is(){return"bbva-list-definition-title"}static get properties(){return{title:{type:String},contentTitle:{type:String,attribute:"content-title"},subtitle:{type:String},secondaryTitle:{type:String,attribute:"secondary-title"},secondarySubtitle:{type:String,attribute:"secondary-subtitle"},centeredTwoColumns:{type:Boolean,reflect:!0,attribute:"centered-two-columns"},tag:{type:String,reflect:!0},secondaryTag:{type:String,reflect:!0,attribute:"secondary-tag"}}}constructor(){super(),this.centeredTwoColumns=!1,this.tag="span",this.secondaryTag="span"}update(t){super.update(t),t.has("title")&&this._titleContent()}_titleContent(){this.title&&(this.contentTitle=this.title,this.title="",this.removeAttribute("title"))}static _getTags(t){let i="span";return["span","p","h1","h2","h3","h4","h5","h6"].includes(t)&&(i=t),i}static get styles(){return[g,h.light,h.dark,d("bbva-list-definition-title-shared-styles")]}get _hasTwoColumns(){return!!this.secondaryTitle&&!!this.secondarySubtitle}static column(t,i,e){return m`
      <div class="column">
        ${u(`<${p._getTags(e)} class="title">${t}</${p._getTags(e)}>`)}
        <span class="subtitle">${i}</span>
      </div>
    `}render(){return m`
      <div class="${b({wrapper:!0,"two-columns":this._hasTwoColumns})}">
        ${p.column(this.contentTitle,this.subtitle,this.tag)}
        ${this._hasTwoColumns?p.column(this.secondaryTitle,this.secondarySubtitle,this.secondaryTag):""}
      </div>
    `}}y("colors.primaryCoreLightened"),y("colors.cool20"),y("colors.primaryCoreLightened"),y("colors.cool20"),y("colors.cool40");export{p as B,h as b};
